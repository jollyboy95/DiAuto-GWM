package com.andrerinas.openheadunit.decoder;

/**
 * The order in which to try optional `MediaFormat` keys when configuring a decoder, and what to fall
 * back to when one is rejected.
 *
 * Every optional key this project ever added was removed again, and the comment in [VideoDecoder.start]
 * records why: `KEY_PRIORITY` and `KEY_OPERATING_RATE` were measured being answered with
 * `codec does not support config priority (err -1010)` on the head units they were meant to help. The
 * problem was never the keys, it was that a rejected key took the whole session with it, so the only
 * safe number of optional keys was zero.
 *
 * A ladder changes that. Configure is attempted with the richest key set first and, if it throws, the
 * next attempt drops one tier. The last tier is always empty, so the worst case is exactly the
 * behaviour with no optional keys at all - which is what shipped before this existed. That makes any
 * future key cheap to try and impossible to regress on.
 *
 * The keys themselves come from Moonlight's `MediaCodecHelper`, which carries the only device-attributed
 * table of them anyone maintains. The official `KEY_LOW_LATENCY` only exists from API 30, and the five
 * vendor spellings below are what the same feature was called before that - including
 * `vdec-lowlatency`, which MediaTek's fork of ACodec translates to
 * `OMX.MTK.index.param.video.LowLatencyDecode`, and which is the decoder in the 1 GB unit from #839.
 *
 * Nothing here decides *whether* to try the optional tiers; [VideoDecoder] gates that on a setting
 * which is off by default, because this project's rule is that no vendor key ships enabled without a
 * log from a device that accepted it. The ladder's tier log is how that log gets produced.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u0013\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/DecoderConfigLadder;", "", "()V", "AMLOGIC_LOW_LATENCY", "", "EXYNOS_LOW_LATENCY", "HISILICON_LOW_LATENCY_RDY", "HISILICON_LOW_LATENCY_REQ", "KEY_LOW_LATENCY", "LOW_LATENCY_API", "", "MTK_LOW_LATENCY", "NO_OPTIONAL_KEYS", "Lcom/andrerinas/openheadunit/decoder/DecoderConfigLadder$Tier;", "getNO_OPTIONAL_KEYS", "()Lcom/andrerinas/openheadunit/decoder/DecoderConfigLadder$Tier;", "QUALCOMM_LOW_LATENCY", "tiers", "", "codecName", "sdkInt", "advertisesLowLatencyFeature", "", "lowLatencyRequested", "vendorLowLatencyKeys", "", "Tier", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class DecoderConfigLadder {
    
    /**
     * Android 11's official low-latency key. Named here so the string is not repeated.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_LOW_LATENCY = "low-latency";
    
    /**
     * API level at which [KEY_LOW_LATENCY] exists.
     */
    public static final int LOW_LATENCY_API = 30;
    
    /**
     * MediaTek, via their modified ACodec. Also plumbed on Amazon's Amlogic devices, where per
     * Moonlight it does more than reduce latency - it is what makes their HEVC decoder emit frames at
     * all.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MTK_LOW_LATENCY = "vdec-lowlatency";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AMLOGIC_LOW_LATENCY = "vendor.low-latency.enable";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUALCOMM_LOW_LATENCY = "vendor.qti-ext-dec-low-latency.enable";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXYNOS_LOW_LATENCY = "vendor.rtc-ext-dec-low-latency.enable";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HISILICON_LOW_LATENCY_REQ = "vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HISILICON_LOW_LATENCY_RDY = "vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy";
    
    /**
     * The empty rung. Always last, and always reached, so the fallback is the pre-existing behaviour.
     */
    @org.jetbrains.annotations.NotNull()
    private static final com.andrerinas.openheadunit.decoder.DecoderConfigLadder.Tier NO_OPTIONAL_KEYS = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.DecoderConfigLadder INSTANCE = null;
    
    private DecoderConfigLadder() {
        super();
    }
    
    /**
     * The empty rung. Always last, and always reached, so the fallback is the pre-existing behaviour.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.decoder.DecoderConfigLadder.Tier getNO_OPTIONAL_KEYS() {
        return null;
    }
    
    /**
     * Vendor low-latency keys for a decoder, matched on its name, or empty if the family is unknown.
     *
     * Matched by name rather than by `Build` properties because the decoder name is what the key
     * belongs to: a device can carry components from more than one vendor, and it is the component
     * that either understands the key or throws.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Integer> vendorLowLatencyKeys(@org.jetbrains.annotations.NotNull()
    java.lang.String codecName) {
        return null;
    }
    
    /**
     * The rungs to try, richest first, always ending in [NO_OPTIONAL_KEYS].
     *
     * [lowLatencyRequested] false returns the single empty rung, which is the shipped behaviour. When
     * it is true, the official key is preferred wherever the component advertises `FEATURE_LowLatency`
     * and the platform is new enough for the key to mean anything; otherwise the vendor spelling for
     * that component is tried. The two are never combined - a component that understands the official
     * key has no need of the older private one, and setting both only widens what a single rejection
     * can take down.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.andrerinas.openheadunit.decoder.DecoderConfigLadder.Tier> tiers(@org.jetbrains.annotations.NotNull()
    java.lang.String codecName, int sdkInt, boolean advertisesLowLatencyFeature, boolean lowLatencyRequested) {
        return null;
    }
    
    /**
     * One rung: a label for the log and the integer keys to set.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/DecoderConfigLadder$Tier;", "", "label", "", "integerKeys", "", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getIntegerKeys", "()Ljava/util/Map;", "getLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Tier {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String label = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, java.lang.Integer> integerKeys = null;
        
        public Tier(@org.jetbrains.annotations.NotNull()
        java.lang.String label, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.Integer> integerKeys) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.Integer> getIntegerKeys() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.Integer> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.decoder.DecoderConfigLadder.Tier copy(@org.jetbrains.annotations.NotNull()
        java.lang.String label, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.Integer> integerKeys) {
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
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}