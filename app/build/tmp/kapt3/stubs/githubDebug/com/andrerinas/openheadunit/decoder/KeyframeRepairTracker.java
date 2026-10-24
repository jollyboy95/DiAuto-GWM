package com.andrerinas.openheadunit.decoder;

/**
 * Separates a keyframe that was handed to the codec from one that produced a picture.
 *
 * Everything upstream of the codec answers the first question. [com.andrerinas.openheadunit.aap.VideoKeyframeScanner]
 * reads the first few NAL headers at the *head* of an access unit, so an access unit whose middle
 * arrived damaged - a fragment lost on the link, the exact shape of the melting-picture reports -
 * still scans as a keyframe. It is fed, it is logged, and it decodes to nothing.
 *
 * That mattered because "a keyframe was fed" was wired to two decisions that both mean "the picture
 * is fine again":
 *
 * - [DecoderStallCausePolicy] stopped calling the codec starved, so the output watchdog went back
 *   to rebuilding it - and each rebuild resumes on a P-frame, which is the loop the starvation case
 *   exists to break.
 * - `AapTransport`'s escalation clock was cancelled, so the focus cycle that would have fetched a
 *   *real* keyframe was pushed back behind the next drop.
 *
 * Measured on a UNISOC MT50 under one-in-three middle-fragment loss: roughly a third of keyframes
 * arrive holed, both resets fire repeatedly, and the picture sits at `rendered=0` for 90+ seconds
 * while the restart budget is spent twice over.
 *
 * So the repair signal is moved to the far side of the codec. A keyframe is pending until a frame
 * with at least its presentation timestamp comes out.
 *
 * ### Why the timestamp and not "the next frame rendered"
 *
 * Two reasons, and the first is the one that bites. MediaCodec keeps frames queued ahead of the
 * feed, so the render that follows a keyframe feed is usually a frame from *before* it - "something
 * rendered after we fed it" would confirm on output the keyframe had no part in. The second is why
 * a rendered frame is not the signal on its own: after a shed reference frame the decoder renders
 * continuously and the picture is wrong the whole time, which is the case the keyframe clock was
 * written for.
 *
 * Presentation timestamps are monotonic within one codec instance and restart near zero when the
 * codec is reconfigured, so [reset] on every restart is not optional - a pending stamp from the old
 * codec would be confirmed by the new one's first frame.
 *
 * ### The decoder that does not carry timestamps through
 *
 * Some components hand every output buffer back with the same presentation timestamp, or zero. On
 * one of those, a keyframe would stay pending while the picture ran perfectly - the decoder would be
 * called starved every fifteen seconds and the transport would spend focus cycles on a stream that
 * never needed them, which is a worse thing to ship than the wedge this replaces. So a keyframe that
 * is still pending after [RENDERS_BEFORE_TIMESTAMPS_DISBELIEVED] frames have come out is confirmed
 * anyway, and [timestampsUnusable] says why. The bound is far past any real reorder depth and far
 * short of the fifteen seconds the starvation path waits, so a working decoder never reaches it.
 *
 * Pure and thread-safe: written from the feed thread, read and cleared from the output thread.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0015\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/KeyframeRepairTracker;", "", "()V", "awaitingOutput", "", "getAwaitingOutput", "()Z", "decoded", "disbelievedTimestamps", "keyframeDecoded", "getKeyframeDecoded", "pendingPtsUs", "", "rendersWhilePending", "", "timestampsUnusable", "getTimestampsUnusable", "onFrameRendered", "ptsUs", "onKeyframeFed", "", "reset", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class KeyframeRepairTracker {
    
    /**
     * Presentation timestamp of the newest keyframe fed and not yet seen at the output.
     */
    private long pendingPtsUs = -1L;
    private boolean decoded = false;
    
    /**
     * Frames rendered since the pending keyframe was fed, none of which reached its timestamp.
     */
    private int rendersWhilePending = 0;
    private boolean disbelievedTimestamps = false;
    
    /**
     * How many rendered frames may pass a pending keyframe's timestamp by before the timestamps
     * are treated as meaningless.
     *
     * Half a second at 60fps, which is orders of magnitude past any reorder depth a projected
     * stream carries and well short of [DecoderStallCausePolicy.KEYFRAME_STARVATION_PATIENCE_MS],
     * so the only decoder that reaches it is one whose output stamps say nothing.
     */
    public static final int RENDERS_BEFORE_TIMESTAMPS_DISBELIEVED = 30;
    
    /**
     * No keyframe is waiting. Not a valid timestamp: presentation stamps here are never negative.
     */
    private static final long NONE = -1L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.KeyframeRepairTracker.Companion Companion = null;
    
    public KeyframeRepairTracker() {
        super();
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean getKeyframeDecoded() {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean getAwaitingOutput() {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean getTimestampsUnusable() {
        return false;
    }
    
    /**
     * A keyframe was queued to the codec at [ptsUs].
     *
     * The newest one replaces any older pending stamp: confirming the newest confirms every keyframe
     * before it, since output is monotonic, and holding the oldest would let one holed keyframe be
     * confirmed by a later good one's picture.
     */
    @kotlin.jvm.Synchronized()
    public final synchronized void onKeyframeFed(long ptsUs) {
    }
    
    /**
     * A frame with [ptsUs] reached the surface.
     *
     * @return true exactly once per pending keyframe, on the first frame at or past its timestamp -
     *  the moment the picture is genuinely repaired.
     */
    @kotlin.jvm.Synchronized()
    public final synchronized boolean onFrameRendered(long ptsUs) {
        return false;
    }
    
    /**
     * Drops all state. Call wherever the codec is rebuilt - see the class comment on timestamps.
     */
    @kotlin.jvm.Synchronized()
    public final synchronized void reset() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/KeyframeRepairTracker$Companion;", "", "()V", "NONE", "", "RENDERS_BEFORE_TIMESTAMPS_DISBELIEVED", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}