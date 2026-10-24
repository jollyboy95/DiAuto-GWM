package com.andrerinas.openheadunit.decoder;

/**
 * The three causes and the two gates. The numbers in the "measured" cases are the UNISOC MT50 round
 * that motivated the class - a stall detected 4s after the codec was rebuilt, then every ten seconds
 * after that.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\u0006H\u0007J0\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0007J\b\u0010\u0013\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/DecoderStallCausePolicyTest;", "", "()V", "idleThreshold", "", "a codec that has had its keyframe and still produces nothing is stalled", "", "a cold start stays on the rebuild path", "a keyframe that was fed but never decoded still counts as starvation", "a phone that has stopped sending is not a decoder fault", "a rebuilt codec that has had no keyframe is starved, not stalled", "classify", "Lcom/andrerinas/openheadunit/decoder/DecoderStallCausePolicy$Cause;", "stallGapMs", "inputIdleGapMs", "keyframeDecodedSinceStart", "", "sessionHasRendered", "patience clears every mechanism meant to resolve the starvation", "patience runs out and the ordinary path resumes", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class DecoderStallCausePolicyTest {
    private final long idleThreshold = 2000L;
    
    public DecoderStallCausePolicyTest() {
        super();
    }
    
    private final com.andrerinas.openheadunit.decoder.DecoderStallCausePolicy.Cause classify(long stallGapMs, long inputIdleGapMs, boolean keyframeDecodedSinceStart, boolean sessionHasRendered) {
        return null;
    }
}