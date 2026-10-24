package com.andrerinas.openheadunit.decoder;

/**
 * Covers the two halves of [DecoderCapabilityReport] that need no device: the verdict and the name
 * heuristic. The queries themselves need `MediaCodecList` and are exercised on hardware.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J-\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0007J\b\u0010\u0011\u001a\u00020\u0004H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\b\u0010\u0013\u001a\u00020\u0004H\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/DecoderCapabilityReportTest;", "", "()V", "a decoder that claims all three is adequate", "", "a missing fps setting falls back to a named default rather than zero", "a performance point that says no is decisive", "an unknown performance point does not count against the decoder", "an unknown performance point prints as unknown, not null", "capability", "Lcom/andrerinas/openheadunit/decoder/DecoderCapabilityReport$Capability;", "sizeSupported", "", "rateSupported", "sustains", "(ZZLjava/lang/Boolean;)Lcom/andrerinas/openheadunit/decoder/DecoderCapabilityReport$Capability;", "hardware components are not", "size or rate failing is enough on its own", "software components are recognised by the same names VideoDecoder uses", "the summary carries every number a report needs", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class DecoderCapabilityReportTest {
    
    public DecoderCapabilityReportTest() {
        super();
    }
    
    private final com.andrerinas.openheadunit.decoder.DecoderCapabilityReport.Capability capability(boolean sizeSupported, boolean rateSupported, java.lang.Boolean sustains) {
        return null;
    }
}