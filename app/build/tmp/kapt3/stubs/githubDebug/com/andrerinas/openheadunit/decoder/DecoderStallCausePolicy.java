package com.andrerinas.openheadunit.decoder;

/**
 * Separates a decoder that is broken from one that has simply not been given a keyframe yet.
 *
 * The output-side watchdog fires on "input is arriving and nothing is coming out", and its only
 * answer is to rebuild the MediaCodec. That answer is wrong for one common case, and wrong in a way
 * that feeds itself.
 *
 * A codec rebuilt mid-session resumes on whatever access unit arrives next, which is almost always a
 * P-frame. It cannot produce a picture from that, and it will not produce one until an IDR arrives.
 * Android Auto sends those on a fixed ~69s cadence that `VideoConfiguration` gives us no way to
 * shorten, and the protocol has no keyframe-request message at all - the release/regain focus cycle
 * is the only lever that exists. So the decoder is silent for up to a full GOP through no fault of
 * its own, the watchdog reads that silence as a fault, rebuilds again, and the rebuild resets the
 * wait. Each pass also runs the transport's decoder-error path, which used to cancel the very clock
 * that would have escalated to the cycle.
 *
 * Measured on a UNISOC MT50 under injected mid-stream corruption: four rebuilds in 33s, the restart
 * budget gone, then stalls at 10, 20, 30, 40, 50 and 60 seconds with `rendered=0` throughout while
 * input flowed at ~50fps. Android Auto's own client eventually asked whether its screen was visible.
 *
 * ### A keyframe that decodes, not one that was fed
 *
 * [keyframeDecodedSinceStart] is measured at the codec's output for a reason. An access unit that
 * lost a fragment in the middle still carries its parameter sets and IDR slice at the head, so it
 * scans as a keyframe, is fed like one, and produces no picture. Counting that as "the codec has had
 * what it needs" put this straight back on the rebuild path - and at one middle fragment lost in
 * three, a later round measured the whole pre-fix signature returning: two exhausted restart ladders
 * and 90+ seconds of `rendered=0`. See [KeyframeRepairTracker].
 *
 * Naming the starved case costs nothing on the healthy path and turns the loop into a wait.
 *
 * Pure: no clock, no logging. The caller supplies the elapsed times it already has.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/DecoderStallCausePolicy;", "", "()V", "KEYFRAME_STARVATION_PATIENCE_MS", "", "classify", "Lcom/andrerinas/openheadunit/decoder/DecoderStallCausePolicy$Cause;", "stallGapMs", "inputIdleGapMs", "inputIdleThresholdMs", "keyframeDecodedSinceStart", "", "sessionHasRendered", "Cause", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class DecoderStallCausePolicy {
    
    /**
     * How long a keyframe-starved decoder is left alone before the ordinary rebuild path resumes.
     *
     * A bound rather than an open wait, because "no keyframe has reached the codec" is also what a
     * decoder looks like when the fault is somewhere this cannot see. Everything meant to resolve the
     * starvation is far quicker than this: the escalated focus cycle produces a keyframe 0.52-0.78s
     * after the release, and the warm-relaunch path escalates after 850ms. Fifteen seconds is well
     * clear of both and well short of the ~69s GOP, so a decoder that is genuinely dead still reaches
     * the rebuild - and the codec-type fallback behind it - inside the same session.
     */
    public static final long KEYFRAME_STARVATION_PATIENCE_MS = 15000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.DecoderStallCausePolicy INSTANCE = null;
    
    private DecoderStallCausePolicy() {
        super();
    }
    
    /**
     * @param stallGapMs time since the last rendered frame, or since this codec started if none.
     * @param inputIdleGapMs time since the last bytes arrived from the phone.
     * @param inputIdleThresholdMs how long that gap has to be before the phone counts as idle.
     * @param keyframeDecodedSinceStart whether a keyframe has produced output on this codec
     *  instance. Not whether one was fed - a holed keyframe is fed and decodes to nothing.
     * @param sessionHasRendered whether any frame at all has rendered this session. A cold start that
     *  has never rendered stays on the ordinary path deliberately: there the codec type is still
     *  unproven, and the rebuild is what reaches the one-time fallback to the other codec.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.decoder.DecoderStallCausePolicy.Cause classify(long stallGapMs, long inputIdleGapMs, long inputIdleThresholdMs, boolean keyframeDecodedSinceStart, boolean sessionHasRendered) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/DecoderStallCausePolicy$Cause;", "", "(Ljava/lang/String;I)V", "PHONE_IDLE", "STARVED_OF_KEYFRAME", "STALLED", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Cause {
        /*public static final*/ PHONE_IDLE /* = new PHONE_IDLE() */,
        /*public static final*/ STARVED_OF_KEYFRAME /* = new STARVED_OF_KEYFRAME() */,
        /*public static final*/ STALLED /* = new STALLED() */;
        
        Cause() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.decoder.DecoderStallCausePolicy.Cause> getEntries() {
            return null;
        }
    }
}