package com.andrerinas.openheadunit.decoder;

/**
 * How much video may wait between the transport and the codec, and how long the feed thread waits
 * for the codec to take it.
 *
 * These two numbers are one decision and are kept together because separating them is what caused
 * issue #830. [VideoDecoder] used to hold a flat twelve frames - "around 200ms" by its own comment -
 * in front of a feed thread that would wait [INPUT_DEQUEUE_PATIENCE_MS], a third of a second, for a
 * free input buffer. So on any codec stall between those two figures the queue was shedding frames
 * while the thread in front of it was still deliberately being patient. The 200ms had been chosen
 * against touch latency and the 300ms against codec behaviour, and nothing reconciled them.
 *
 * A shed frame is not a dropped frame in the harmless sense: everything after it predicts from it,
 * so the picture drifts washed-out and blocky until a keyframe arrives, and the phone sends those on
 * a fixed period measured at ~69s. Roughly 35 seconds of visible corruption, on average, for a stall
 * of a couple of hundred milliseconds.
 *
 * ### Why depth is cheaper than it looks
 *
 * The instinct that a deep queue is latency is right for most pipelines and wrong for this one. A
 * backlog here drains in milliseconds once the codec unblocks, and the output thread then discards
 * everything but the newest decoded frame on the way to the surface. So the cost is one catch-up
 * jump, not lasting lag - and a discarded *decoded* frame breaks no prediction, which is the whole
 * point. That is the model the protocol layer already describes: bound the backlog where it costs
 * nothing rather than by having the phone send less.
 *
 * The exception is a decoder persistently slower than the stream, where nothing ever drains and the
 * depth is real latency. That is the forced software-decoding path, which is already a deliberate
 * choice by someone whose hardware decoder does not work.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/VideoFeedQueuePolicy;", "", "()V", "FRAME_QUEUE_MS", "", "INPUT_DEQUEUE_PATIENCE_MS", "", "MAX_CAPACITY", "MIN_CAPACITY", "capacityFor", "fpsLimit", "heldMsAt", "safeRate", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class VideoFeedQueuePolicy {
    
    /**
     * How long the feed thread waits, in total, for the codec to free an input buffer before giving
     * up on a frame.
     *
     * Measured: 30ms reported a full queue within a second of every start on hardware that then
     * decoded at full rate. The wait also aborts as soon as the decoder stops.
     */
    public static final long INPUT_DEQUEUE_PATIENCE_MS = 300L;
    
    /**
     * How much video the queue holds, in milliseconds.
     *
     * Has to clear [INPUT_DEQUEUE_PATIENCE_MS], or the queue sheds frames the feed thread has not
     * given up on yet. 500ms is that plus margin. Widening it costs memory and, on a decoder that
     * never catches up, latency; narrowing it below the patience reopens #830.
     */
    public static final int FRAME_QUEUE_MS = 500;
    
    /**
     * Floor on the derived depth.
     *
     * `fpsLimit` is the user's cap, not a rate negotiated with the phone - the decoder has no access
     * to the real one - so it can understate what is actually arriving. The floor means a low cap
     * cannot produce a queue too shallow to hold the patience regardless.
     */
    public static final int MIN_CAPACITY = 15;
    
    /**
     * Ceiling on the derived depth.
     *
     * Every slot carries a pooled buffer that grows to the largest frame it has held, so a queue
     * full of oversized keyframes is the worst case worth bounding. It also bounds the guarantee
     * below: past about 133fps this ceiling, not [FRAME_QUEUE_MS], decides the depth, and the queue
     * would no longer cover the patience. Android Auto negotiates 30 or 60.
     */
    public static final int MAX_CAPACITY = 40;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.VideoFeedQueuePolicy INSTANCE = null;
    
    private VideoFeedQueuePolicy() {
        super();
    }
    
    /**
     * Frames the queue holds at [fpsLimit], clamped to [MIN_CAPACITY]..[MAX_CAPACITY].
     */
    public final int capacityFor(int fpsLimit) {
        return 0;
    }
    
    /**
     * How much video [capacityFor] holds at [fpsLimit], in milliseconds.
     */
    public final long heldMsAt(int fpsLimit) {
        return 0L;
    }
    
    /**
     * [fpsLimit] comes from stored settings, so nothing structurally stops it being zero or
     * negative - and this runs on the feed thread's start path, where an arithmetic exception would
     * take the decoder down rather than degrade it. A nonsense rate falls back to the floor.
     */
    private final int safeRate(int fpsLimit) {
        return 0;
    }
}