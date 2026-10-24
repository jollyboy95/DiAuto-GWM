package com.andrerinas.openheadunit.aap;

/**
 * Pacing rule for [AapVideo]'s stream recovery.
 *
 * Recovering from a corrupt frame means asking the phone for a fresh keyframe, which
 * [AapTransport] implements as a gain-only unsolicited focus nudge by default, escalating to a real
 * focus loss/regain cycle only per [KeyframeCycleEscalationPolicy]'s much stricter gates. Either one
 * is expensive and briefly visible on screen, and the phone reacts to it by rebuilding the stream,
 * so a burst of requests costs far more picture than the single frame that triggered the first one.
 * Rate limit them.
 *
 * Suppressing a request is safe to do silently: a corrupt frame is scoped to itself and the stream
 * resumes on the next one either way, so a suppressed request only means recovery waits for the
 * phone's own keyframe cadence rather than being brought forward.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoRecoveryPolicy;", "", "()V", "KEYFRAME_REQUEST_THROTTLE_MS", "", "canRequestKeyframe", "", "nowMs", "lastRequestMs", "shouldRequestOnDroppedFrame", "hasRendered", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class VideoRecoveryPolicy {
    
    /**
     * Minimum spacing between keyframe requests, in milliseconds.
     */
    public static final long KEYFRAME_REQUEST_THROTTLE_MS = 1000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.VideoRecoveryPolicy INSTANCE = null;
    
    private VideoRecoveryPolicy() {
        super();
    }
    
    /**
     * Whether enough time has passed since [lastRequestMs] to send another keyframe request.
     */
    public final boolean canRequestKeyframe(long nowMs, long lastRequestMs) {
        return false;
    }
    
    /**
     * Whether the decoder shedding a frame warrants asking the phone for a keyframe.
     *
     * A shed frame is a reference some later frame predicts from, so the picture drifts
     * washed-out and blocky until a keyframe arrives - and on an idle stream the phone's own
     * cadence can leave that on screen for a minute. The ask is the same throttled gain-only
     * nudge as corrupt-frame recovery.
     *
     * Gated on [hasRendered] because before the first rendered frame the drop means something
     * else entirely: a codec still draining its first buffers sheds frames while perfectly
     * healthy, the nudge is measured to do nothing before the phone has started its video sink,
     * and the not-yet-rendering window already has its own escalation
     * ([WarmRelaunchKeyframePolicy]).
     */
    public final boolean shouldRequestOnDroppedFrame(boolean hasRendered, long nowMs, long lastRequestMs) {
        return false;
    }
}