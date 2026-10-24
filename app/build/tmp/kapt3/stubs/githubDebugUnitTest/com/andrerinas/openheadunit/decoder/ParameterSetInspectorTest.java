package com.andrerinas.openheadunit.decoder;

/**
 * Vectors for the parameter-set reader.
 *
 * Each was assembled field by field from the syntax in H.264 7.3.2.1.1 / Annex E.1.1 and
 * H.265 7.3.2.2.1, with the field values chosen first and the bits emitted from them, so the
 * expectations below are the inputs rather than a recording of what the parser happens to do.
 * Emulation-prevention bytes were then inserted the way an encoder inserts them, which is why the
 * two HEVC vectors carry `00 00 03` runs - they are the reason this class does its own RBSP
 * unescaping, which the dimension-only parser it replaced did not.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0007J\b\u0010\u0011\u001a\u00020\u000bH\u0007J\b\u0010\u0012\u001a\u00020\u000bH\u0007J\b\u0010\u0013\u001a\u00020\u000bH\u0007J\b\u0010\u0014\u001a\u00020\u000bH\u0007J\b\u0010\u0015\u001a\u00020\u000bH\u0007J\b\u0010\u0016\u001a\u00020\u000bH\u0007J\b\u0010\u0017\u001a\u00020\u000bH\u0007J\b\u0010\u0018\u001a\u00020\u000bH\u0007J\b\u0010\u0019\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/ParameterSetInspectorTest;", "", "()V", "h264Baseline720p", "", "h264High1080pRestricted", "h264PocType1", "h264WithHrd", "hevc1080pTwoSubLayers", "hevcMain720p", "a truncated HEVC SPS reads as no answer", "", "an absent restriction says absent rather than zero", "bytes", "hex", "", "empty input is rejected", "every truncation of an SPS reads as no answer rather than a wrong one", "pic_order_cnt_type 1 does not desync the fields behind it", "reads a baseline SPS with no VUI", "reads a high profile SPS through the VUI to the bitstream restriction", "reads an HEVC SPS past its emulation-prevention bytes", "reads an HEVC SPS with sub-layers and a conformance window", "the H264 summary names every field a decision would rest on", "the HEVC summary names every field a decision would rest on", "walks hrd_parameters without losing its place", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class ParameterSetInspectorTest {
    
    /**
     * H.264 SPS, baseline profile, level 3.1, 1280x720, one reference frame, no VUI.
     */
    @org.jetbrains.annotations.NotNull()
    private final byte[] h264Baseline720p = null;
    
    /**
     * H.264 SPS, high profile, level 4.0, 1920x1080 via a bottom crop of 4 on a 1088 frame,
     * four reference frames, VUI carrying bitstream_restriction with reorder 0 / max_dec 4.
     */
    @org.jetbrains.annotations.NotNull()
    private final byte[] h264High1080pRestricted = null;
    
    /**
     * H.264 SPS with pic_order_cnt_type 1, 1280x720.
     *
     * The dimension parser this class replaced walked type 1 as though it were type 0 - it read the
     * POC LSB field that only type 0 has, and then everything after it came out of the wrong bits.
     * On this exact vector it reported **176x48** for a 1280x720 stream, which is the size the codec
     * would then have been configured at.
     */
    @org.jetbrains.annotations.NotNull()
    private final byte[] h264PocType1 = null;
    
    /**
     * H.264 SPS with timing info and nal_hrd_parameters before the bitstream restriction, so the
     * hrd_parameters skip has to be exactly right or reorder/max_dec come out wrong.
     * Two reference frames, reorder 1, max_dec 3.
     */
    @org.jetbrains.annotations.NotNull()
    private final byte[] h264WithHrd = null;
    
    /**
     * HEVC SPS, Main profile, level 3.1, 1280x720, max_dec 4, reorder 0. Contains 00 00 03 runs.
     */
    @org.jetbrains.annotations.NotNull()
    private final byte[] hevcMain720p = null;
    
    /**
     * HEVC SPS with two sub-layers and a conformance window: 1920x1080 from a 1088 frame, and the
     * sub-layer ordering info absent so only the top layer's values are read.
     */
    @org.jetbrains.annotations.NotNull()
    private final byte[] hevc1080pTwoSubLayers = null;
    
    public ParameterSetInspectorTest() {
        super();
    }
    
    private final byte[] bytes(java.lang.String hex) {
        return null;
    }
}