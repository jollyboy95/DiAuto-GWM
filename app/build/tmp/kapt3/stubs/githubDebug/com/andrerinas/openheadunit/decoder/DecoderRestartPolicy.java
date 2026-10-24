package com.andrerinas.openheadunit.decoder;

/**
 * Decides whether a decoder restart counts toward the codec-type flip and the permanent-failure
 * latch.
 *
 * The escalation ladder exists for one case: a hardware component that cannot decode this codec
 * type at all, which would otherwise restart forever. The evidence for that case is a session in
 * which *nothing has ever rendered*. The counter used to test only "no frame since the last
 * start" - but every surface swap stops the decoder and zeroes that timestamp, so a stream that
 * had been rendering for an hour looked identical to one that never worked, and a few slow
 * warm-ups after a relaunch walked it through the flip (to a codec type guaranteed wrong for the
 * running stream) and into the latch. Measured on hardware: first frame after a mid-session
 * reconfigure takes up to ~8s on some SoCs against a 2s stall window, so the ladder climbed on
 * healthy sessions.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u00a8\u0006\b"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/DecoderRestartPolicy;", "", "()V", "countsTowardFailure", "", "codecTypePinned", "renderedSinceLastStart", "renderedThisSession", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class DecoderRestartPolicy {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.DecoderRestartPolicy INSTANCE = null;
    
    private DecoderRestartPolicy() {
        super();
    }
    
    /**
     * True when this restart is evidence against the pinned codec type. [renderedThisSession]
     * being true proves the codec type decodes this stream, so no number of warm-up restarts
     * after that is reason to flip or to give up.
     */
    public final boolean countsTowardFailure(boolean codecTypePinned, boolean renderedSinceLastStart, boolean renderedThisSession) {
        return false;
    }
}