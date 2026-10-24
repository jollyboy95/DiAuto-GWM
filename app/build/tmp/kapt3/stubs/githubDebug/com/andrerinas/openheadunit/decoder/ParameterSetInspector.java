package com.andrerinas.openheadunit.decoder;

/**
 * Reads the fields of an H.264 or H.265 parameter set that decide how a decoder buffers frames.
 *
 * This exists to answer one question with a number instead of a guess. Moonlight rewrites the H.264
 * SPS on every Android 8.0+ device it runs on - forcing `bitstream_restriction` present with
 * `max_num_reorder_frames = 0` and `max_dec_frame_buffering = num_ref_frames` - because unmodified
 * NVENC output makes some hardware decoders allocate 16+ reference buffers and adds frames of
 * latency. We have never looked at what Android Auto actually sends, so we do not know whether that
 * lever exists for us at all. Log it before writing a bitstream writer for it.
 *
 * The reader does its own RBSP unescaping. The dimension-only parser this replaced did not, which was
 * survivable while it only reached the width and height near the front of the SPS - but every field
 * this class is here for sits behind the VUI or the profile-tier-level block, far enough in that a
 * single unremoved `0x03` silently shifts everything after it and turns the answer into noise. A
 * `0x03` in a High-profile scaling matrix reaches the dimensions too, which is one of the reasons the
 * old parser is gone rather than kept alongside.
 *
 * Everything here is a *reader*. Nothing in this file modifies a bitstream.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006J \u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/ParameterSetInspector;", "", "()V", "HIGH_PROFILES", "", "MAX_CPB_CNT_MINUS1", "", "MAX_POC_CYCLE", "parseH264Sps", "Lcom/andrerinas/openheadunit/decoder/ParameterSetInspector$H264Sps;", "data", "", "nalHeaderOffset", "length", "parseHevcSps", "Lcom/andrerinas/openheadunit/decoder/ParameterSetInspector$HevcSps;", "skipHrdParameters", "", "r", "Lcom/andrerinas/openheadunit/decoder/ParameterSetInspector$RbspReader;", "skipScalingList", "", "sizeOfList", "H264Sps", "HevcSps", "RbspReader", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ParameterSetInspector {
    
    /**
     * Profiles whose SPS carries the chroma/scaling-matrix block (H.264 7.3.2.1.1).
     */
    @org.jetbrains.annotations.NotNull()
    private static final int[] HIGH_PROFILES = {100, 110, 122, 244, 44, 83, 86, 118, 128, 138, 139, 134, 135};
    
    /**
     * Spec maximum is 255; anything larger means the reader has lost its place.
     */
    private static final int MAX_CPB_CNT_MINUS1 = 31;
    
    /**
     * Spec maximum is 255; a larger cycle means the reader has lost its place.
     */
    private static final int MAX_POC_CYCLE = 255;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.ParameterSetInspector INSTANCE = null;
    
    private ParameterSetInspector() {
        super();
    }
    
    /**
     * Parses an H.264 SPS.
     *
     * [nalHeaderOffset] points at the NAL header byte, i.e. just past the Annex B start code - the
     * same convention `VideoDecoder.scanAndApplyConfig` already uses. Returns null if the bitstream
     * runs out or does not parse, never a partly-filled result.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.decoder.ParameterSetInspector.H264Sps parseH264Sps(@org.jetbrains.annotations.NotNull()
    byte[] data, int nalHeaderOffset, int length) {
        return null;
    }
    
    /**
     * Parses an HEVC SPS. [nalHeaderOffset] points at the first of the two NAL header bytes.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.decoder.ParameterSetInspector.HevcSps parseHevcSps(@org.jetbrains.annotations.NotNull()
    byte[] data, int nalHeaderOffset, int length) {
        return null;
    }
    
    private final void skipScalingList(com.andrerinas.openheadunit.decoder.ParameterSetInspector.RbspReader r, int sizeOfList) {
    }
    
    /**
     * Returns false if the bitstream declares an implausible CPB count, i.e. we have desynced.
     */
    private final boolean skipHrdParameters(com.andrerinas.openheadunit.decoder.ParameterSetInspector.RbspReader r) {
        return false;
    }
    
    /**
     * Fields of an AVC/H.264 SPS. Nullable members are absent from the bitstream rather than zero,
     * which is the distinction that matters: `bitstreamRestrictionPresent == false` is exactly the
     * case Moonlight patches.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\nH\u00c6\u0003J\t\u0010%\u001a\u00020\nH\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015Jv\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001J\b\u0010,\u001a\u00020-H\u0016R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012\u00a8\u0006."}, d2 = {"Lcom/andrerinas/openheadunit/decoder/ParameterSetInspector$H264Sps;", "", "profileIdc", "", "levelIdc", "picOrderCntType", "maxNumRefFrames", "width", "height", "vuiPresent", "", "bitstreamRestrictionPresent", "maxNumReorderFrames", "maxDecFrameBuffering", "(IIIIIIZZLjava/lang/Integer;Ljava/lang/Integer;)V", "getBitstreamRestrictionPresent", "()Z", "getHeight", "()I", "getLevelIdc", "getMaxDecFrameBuffering", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxNumRefFrames", "getMaxNumReorderFrames", "getPicOrderCntType", "getProfileIdc", "getVuiPresent", "getWidth", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IIIIIIZZLjava/lang/Integer;Ljava/lang/Integer;)Lcom/andrerinas/openheadunit/decoder/ParameterSetInspector$H264Sps;", "equals", "other", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class H264Sps {
        private final int profileIdc = 0;
        private final int levelIdc = 0;
        private final int picOrderCntType = 0;
        private final int maxNumRefFrames = 0;
        private final int width = 0;
        private final int height = 0;
        private final boolean vuiPresent = false;
        private final boolean bitstreamRestrictionPresent = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer maxNumReorderFrames = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer maxDecFrameBuffering = null;
        
        public H264Sps(int profileIdc, int levelIdc, int picOrderCntType, int maxNumRefFrames, int width, int height, boolean vuiPresent, boolean bitstreamRestrictionPresent, @org.jetbrains.annotations.Nullable()
        java.lang.Integer maxNumReorderFrames, @org.jetbrains.annotations.Nullable()
        java.lang.Integer maxDecFrameBuffering) {
            super();
        }
        
        public final int getProfileIdc() {
            return 0;
        }
        
        public final int getLevelIdc() {
            return 0;
        }
        
        public final int getPicOrderCntType() {
            return 0;
        }
        
        public final int getMaxNumRefFrames() {
            return 0;
        }
        
        public final int getWidth() {
            return 0;
        }
        
        public final int getHeight() {
            return 0;
        }
        
        public final boolean getVuiPresent() {
            return false;
        }
        
        public final boolean getBitstreamRestrictionPresent() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getMaxNumReorderFrames() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getMaxDecFrameBuffering() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component10() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int component5() {
            return 0;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final boolean component7() {
            return false;
        }
        
        public final boolean component8() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.decoder.ParameterSetInspector.H264Sps copy(int profileIdc, int levelIdc, int picOrderCntType, int maxNumRefFrames, int width, int height, boolean vuiPresent, boolean bitstreamRestrictionPresent, @org.jetbrains.annotations.Nullable()
        java.lang.Integer maxNumReorderFrames, @org.jetbrains.annotations.Nullable()
        java.lang.Integer maxDecFrameBuffering) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
    }
    
    /**
     * Fields of an HEVC/H.265 SPS.
     *
     * Stops at the sub-layer ordering info. `sps_temporal_mvp_enabled_flag` sits behind the
     * short-term reference picture sets, whose parsing is long enough that getting it wrong is more
     * likely than the field is useful, and nothing planned reads it.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\b\u0010\"\u001a\u00020#H\u0016R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/ParameterSetInspector$HevcSps;", "", "generalProfileIdc", "", "generalLevelIdc", "chromaFormatIdc", "bitDepthLuma", "width", "height", "maxDecPicBuffering", "maxNumReorderPics", "(IIIIIIII)V", "getBitDepthLuma", "()I", "getChromaFormatIdc", "getGeneralLevelIdc", "getGeneralProfileIdc", "getHeight", "getMaxDecPicBuffering", "getMaxNumReorderPics", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class HevcSps {
        private final int generalProfileIdc = 0;
        private final int generalLevelIdc = 0;
        private final int chromaFormatIdc = 0;
        private final int bitDepthLuma = 0;
        private final int width = 0;
        private final int height = 0;
        private final int maxDecPicBuffering = 0;
        private final int maxNumReorderPics = 0;
        
        public HevcSps(int generalProfileIdc, int generalLevelIdc, int chromaFormatIdc, int bitDepthLuma, int width, int height, int maxDecPicBuffering, int maxNumReorderPics) {
            super();
        }
        
        public final int getGeneralProfileIdc() {
            return 0;
        }
        
        public final int getGeneralLevelIdc() {
            return 0;
        }
        
        public final int getChromaFormatIdc() {
            return 0;
        }
        
        public final int getBitDepthLuma() {
            return 0;
        }
        
        public final int getWidth() {
            return 0;
        }
        
        public final int getHeight() {
            return 0;
        }
        
        public final int getMaxDecPicBuffering() {
            return 0;
        }
        
        public final int getMaxNumReorderPics() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int component5() {
            return 0;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int component7() {
            return 0;
        }
        
        public final int component8() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.decoder.ParameterSetInspector.HevcSps copy(int generalProfileIdc, int generalLevelIdc, int chromaFormatIdc, int bitDepthLuma, int width, int height, int maxDecPicBuffering, int maxNumReorderPics) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
    }
    
    /**
     * Bit reader over an RBSP, i.e. one that removes emulation-prevention bytes as it goes.
     *
     * A `0x03` following two zero bytes is inserted by the encoder so a payload can never contain a
     * start code, and it is not part of the syntax. Reading it as if it were shifts every field
     * after it.
     *
     * [overran] latches instead of throwing, so a caller can parse to the end and then decide the
     * whole result is untrustworthy - a half-read field is worse than no field.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005J\u0006\u0010\u0019\u001a\u00020\u0005R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/ParameterSetInspector$RbspReader;", "", "buf", "", "offset", "", "length", "([BII)V", "bitInByte", "bytePos", "end", "<set-?>", "", "overran", "getOverran", "()Z", "zeroRun", "advanceByte", "", "bit", "currentByte", "se", "skip", "count", "u", "ue", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class RbspReader {
        @org.jetbrains.annotations.NotNull()
        private final byte[] buf = null;
        private final int end = 0;
        private int bytePos;
        private int bitInByte = 0;
        private int zeroRun = 0;
        private boolean overran = false;
        
        public RbspReader(@org.jetbrains.annotations.NotNull()
        byte[] buf, int offset, int length) {
            super();
        }
        
        public final boolean getOverran() {
            return false;
        }
        
        private final int currentByte() {
            return 0;
        }
        
        private final void advanceByte() {
        }
        
        public final int u(int count) {
            return 0;
        }
        
        public final void skip(int count) {
        }
        
        /**
         * Unsigned Exp-Golomb, ue(v).
         */
        public final int ue() {
            return 0;
        }
        
        /**
         * Signed Exp-Golomb, se(v).
         */
        public final int se() {
            return 0;
        }
        
        private final int bit() {
            return 0;
        }
    }
}