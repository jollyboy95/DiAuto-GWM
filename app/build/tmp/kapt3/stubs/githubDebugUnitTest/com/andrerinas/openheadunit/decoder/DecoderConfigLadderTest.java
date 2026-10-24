package com.andrerinas.openheadunit.decoder;

/**
 * The rules for trying optional decoder keys.
 *
 * The property that matters more than any individual key: the last rung is always empty, so whatever
 * the ladder decides, the fallback is the behaviour that shipped before it existed.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\u000bH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0007J\b\u0010\u000f\u001a\u00020\u000bH\u0007J\b\u0010\u0010\u001a\u00020\u000bH\u0007J\b\u0010\u0011\u001a\u00020\u000bH\u0007J\b\u0010\u0012\u001a\u00020\u000bH\u0007J\b\u0010\u0013\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/DecoderConfigLadderTest;", "", "()V", "amlogic", "", "exynos", "hisi", "mtk", "qcom", "unknown", "an unknown vendor gets nothing rather than a guess", "", "each vendor family is matched by its component name", "not asking for low latency is exactly the shipped behaviour", "the Codec2 spellings of the same families are matched too", "the last rung is always empty, whatever else is offered", "the official key is not used below the API that has it, even if the feature is claimed", "the official key is preferred where the component advertises it", "the two spellings are never combined", "the vendor spelling is used when the component does not advertise the feature", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class DecoderConfigLadderTest {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mtk = "OMX.MTK.VIDEO.DECODER.HEVC";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String qcom = "OMX.qcom.video.decoder.avc";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String exynos = "OMX.Exynos.avc.dec";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String amlogic = "OMX.amlogic.hevc.decoder";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String hisi = "OMX.hisi.video.decoder.avc";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String unknown = "OMX.rk.video_decoder.avc";
    
    public DecoderConfigLadderTest() {
        super();
    }
}