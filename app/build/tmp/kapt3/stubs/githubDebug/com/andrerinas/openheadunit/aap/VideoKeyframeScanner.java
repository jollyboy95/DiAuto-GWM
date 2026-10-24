package com.andrerinas.openheadunit.aap;

/**
 * Answers one question about an access unit: does it carry a keyframe the decoder can start from?
 *
 * Recovery from a shed reference frame is only over when a keyframe actually reaches the codec, and
 * nothing else in the app can tell. Frame size is the closest thing - the hardware rounds identified
 * keyframes as assembled frames above a threshold - and it does not hold up: round 4 measured a
 * healthy stream whose true keyframes were 67-78KB against a 1.5KB median, with a scatter of 5-18KB
 * single-message frames in between that no threshold separates. Only the fragmentation pattern told
 * those apart, and only because that capture happened to have one. Reading the NAL type is exact.
 *
 * Round 4 checked this against the size method over an undisturbed session and the two agreed on all
 * three keyframes: same count, within 21ms on timing, within 10 bytes on size.
 *
 * ### Why this is safe when the last attempt was not
 *
 * Commit 66e59b2c removed a `waitingForKeyframe` latch that read NAL headers and held **every
 * subsequent P-frame back** until it was satisfied. It read them against the user's codec
 * *preference* rather than the type the decoder actually pinned, so on a mismatched stream it never
 * saw its keyframe, latched for the session and froze the picture with the connection healthy.
 *
 * Two things differ here. The caller passes the pinned type, not a preference. And nothing gates on
 * the answer: this only ever decides whether to stop *asking* for a keyframe, so a missed one costs
 * one extra request and a false positive costs one request not sent. Neither can stick, and frames
 * keep flowing either way.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tJ \u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoKeyframeScanner;", "", "()V", "AVC_NAL_IDR", "", "HEVC_IRAP_RANGE", "Lkotlin/ranges/IntRange;", "MAX_NAL_HEADERS_SCANNED", "containsKeyframe", "", "data", "", "offset", "size", "isHevc", "startCodeHeaderPos", "i", "end", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class VideoKeyframeScanner {
    
    /**
     * H.264: coded slice of an IDR picture.
     */
    private static final int AVC_NAL_IDR = 5;
    
    /**
     * H.265 IRAP range - BLA_W_LP (16) through CRA_NUT (21). Any of them is a decoder entry point.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.ranges.IntRange HEVC_IRAP_RANGE = null;
    
    /**
     * How many NAL headers to look at before giving up.
     *
     * A keyframe access unit leads with its parameter sets - SPS/PPS then the IDR slice on H.264,
     * VPS/SPS/PPS then the slice on H.265 - so the interesting NAL is never deep. Bounding the walk
     * keeps this off the profile on a path that runs per frame at 60fps.
     */
    private static final int MAX_NAL_HEADERS_SCANNED = 8;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.VideoKeyframeScanner INSTANCE = null;
    
    private VideoKeyframeScanner() {
        super();
    }
    
    /**
     * Whether the access unit in [data] between [offset] and [offset] + [size] contains a keyframe.
     *
     * @param isHevc the codec the decoder has **pinned** for this session, never a user preference.
     */
    public final boolean containsKeyframe(@org.jetbrains.annotations.NotNull()
    byte[] data, int offset, int size, boolean isHevc) {
        return false;
    }
    
    /**
     * Position of the NAL header byte if a 3- or 4-byte start code begins at [i], else -1.
     *
     * Same shape as VideoDecoder.isCodecConfigData's walk, kept separate because that one answers a
     * different question about the first NAL only.
     */
    private final int startCodeHeaderPos(byte[] data, int i, int end) {
        return 0;
    }
}