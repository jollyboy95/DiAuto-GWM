package com.andrerinas.openheadunit.aap;

/**
 * Answers what an access unit is made of, so `BUFFER_FLAG_CODEC_CONFIG` can be set on the ones that
 * are only configuration and never on the ones that also carry a picture.
 *
 * `BUFFER_FLAG_CODEC_CONFIG` tells MediaCodec the buffer is codec-specific data and nothing else, so
 * a component is entitled to consume it and produce no output. Setting it on an access unit that also
 * contains a coded slice therefore risks the slice being discarded - and if that slice is the IDR, the
 * picture never repairs.
 *
 * The check this replaces read only the **first** NAL of the access unit and answered for the whole
 * thing. Two ways for that to be wrong, in opposite directions:
 *
 * - A unit led by an access-unit delimiter or an SEI was reported as carrying no parameter sets even
 *  when SPS and PPS followed, so decoders that require the flag - Moonlight's errata names TI OMAP4
 *  as crashing on the IDR without it - never got it.
 * - A unit led by SPS and continuing into PPS and an IDR slice was reported as configuration, so on
 *  the three chipset families that flag every config packet (Rockchip, Allwinner, Telechips) the
 *  whole keyframe was handed over marked as configuration.
 *
 * Reading every NAL header in the unit, bounded, answers both.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013J \u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/andrerinas/openheadunit/aap/CodecConfigScanner;", "", "()V", "AVC_PARAMETER_SETS", "", "AVC_PICTURE_RANGE", "Lkotlin/ranges/IntRange;", "HEVC_PARAMETER_SETS", "HEVC_PICTURE_RANGE", "MAX_BYTES_SCANNED", "", "MAX_NAL_HEADERS_SCANNED", "classify", "Lcom/andrerinas/openheadunit/aap/CodecConfigScanner$Content;", "data", "", "offset", "size", "isHevc", "", "startCodeHeaderPos", "i", "end", "Content", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class CodecConfigScanner {
    
    /**
     * H.264 parameter-set NAL types: SPS, PPS, and the two SPS extensions.
     */
    @org.jetbrains.annotations.NotNull()
    private static final int[] AVC_PARAMETER_SETS = {7, 8, 13, 15};
    
    /**
     * H.264 VCL NAL types - anything that codes picture data.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.ranges.IntRange AVC_PICTURE_RANGE = null;
    
    /**
     * H.265 parameter-set NAL types: VPS, SPS, PPS.
     */
    @org.jetbrains.annotations.NotNull()
    private static final int[] HEVC_PARAMETER_SETS = {32, 33, 34};
    
    /**
     * H.265 VCL NAL types. Everything from 32 up is non-VCL.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.ranges.IntRange HEVC_PICTURE_RANGE = null;
    
    /**
     * How many NAL headers to look at before giving up.
     *
     * A parameter-set unit is a handful of small NALs; a keyframe leads with them and then has its
     * slices, so everything this needs to see is at the front.
     */
    public static final int MAX_NAL_HEADERS_SCANNED = 16;
    
    /**
     * How far into the unit to look before giving up.
     *
     * This runs on the feed thread once per frame, so an unbounded walk is 60 scans a second over
     * frames that reach hundreds of kilobytes - and a P-frame contains no start code after its first,
     * so an unbounded walk really does read all of it. Everything that decides the answer is in the
     * leading run of delimiters, SEIs, parameter sets and the first slice header, which a few hundred
     * bytes covers with room to spare.
     *
     * Bounding it is only safe because hitting the bound is treated as *not knowing*, and not knowing
     * resolves to [Content.PARAMETER_SETS_WITH_PICTURE] - the answer that withholds the flag. A
     * config-only unit is fifty-odd bytes and finishes long before the bound, so it is never the one
     * that gets cut off.
     */
    public static final int MAX_BYTES_SCANNED = 512;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.CodecConfigScanner INSTANCE = null;
    
    private CodecConfigScanner() {
        super();
    }
    
    /**
     * Classifies the access unit in [data] between [offset] and [offset] + [size].
     *
     * @param isHevc the codec the decoder has **pinned** for this session, never a user preference -
     *  the NAL type encoding differs between the two and reading one as the other is how a previous
     *  keyframe latch froze sessions.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.CodecConfigScanner.Content classify(@org.jetbrains.annotations.NotNull()
    byte[] data, int offset, int size, boolean isHevc) {
        return null;
    }
    
    /**
     * Position of the NAL header byte if a 3- or 4-byte start code begins at [i], else -1.
     *
     * Same walk as [VideoKeyframeScanner]'s, deliberately duplicated rather than shared: the two
     * answer different questions and the temptation to fuse them into one pass over the frame is how
     * a change for one silently alters the other.
     */
    private final int startCodeHeaderPos(byte[] data, int i, int end) {
        return 0;
    }
    
    /**
     * What an access unit contains, as far as the config flag is concerned.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/aap/CodecConfigScanner$Content;", "", "(Ljava/lang/String;I)V", "PARAMETER_SETS_ONLY", "PARAMETER_SETS_WITH_PICTURE", "NO_PARAMETER_SETS", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Content {
        /*public static final*/ PARAMETER_SETS_ONLY /* = new PARAMETER_SETS_ONLY() */,
        /*public static final*/ PARAMETER_SETS_WITH_PICTURE /* = new PARAMETER_SETS_WITH_PICTURE() */,
        /*public static final*/ NO_PARAMETER_SETS /* = new NO_PARAMETER_SETS() */;
        
        Content() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.CodecConfigScanner.Content> getEntries() {
            return null;
        }
    }
}