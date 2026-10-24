package com.andrerinas.openheadunit.decoder;

/**
 * What a decoder claims about a picture, asked in two places for two different reasons.
 *
 * **At configure time**, of the component already chosen: does it manage the stream it is about to
 * be handed? **At negotiation time**, of whatever component would be chosen: is the profile we are
 * about to ask the phone for one this device can carry?
 *
 * The second question is the one nothing has ever asked. `ServiceDiscoveryResponse` overrides the
 * user's codec choice and forces H.265 whenever the negotiated resolution is 1440p, without
 * consulting any decoder - and a #219 reporter's Galaxy Tab S7 FE runs exactly that: 2560x1440 HEVC
 * on `c2.qti.hevc.decoder`, shedding frames in bursts with up to 2019ms of a 5s window spent waiting
 * for an input buffer. No log has ever said whether that component claims to sustain the size and
 * rate we forced on it.
 *
 * Nothing here changes a decision. It produces the line that would justify changing one.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ0\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ(\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/DecoderCapabilityReport;", "", "()V", "DEFAULT_FPS", "", "advertisesLowLatency", "", "codecName", "", "mimeType", "capabilitiesOf", "Landroid/media/MediaCodecInfo$CodecCapabilities;", "forCodec", "Lcom/andrerinas/openheadunit/decoder/DecoderCapabilityReport$Capability;", "width", "height", "fps", "isSoftwareName", "query", "Capability", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class DecoderCapabilityReport {
    
    /**
     * What a zero or negative fps setting means when a rate has to be named.
     */
    public static final int DEFAULT_FPS = 30;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.DecoderCapabilityReport INSTANCE = null;
    
    private DecoderCapabilityReport() {
        super();
    }
    
    /**
     * Raw capabilities of [codecName] for [mimeType], or null when they cannot be read.
     */
    @org.jetbrains.annotations.Nullable()
    public final android.media.MediaCodecInfo.CodecCapabilities capabilitiesOf(@org.jetbrains.annotations.NotNull()
    java.lang.String codecName, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType) {
        return null;
    }
    
    /**
     * Whether the component itself claims Android 11's low-latency feature.
     */
    public final boolean advertisesLowLatency(@org.jetbrains.annotations.NotNull()
    java.lang.String codecName, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType) {
        return false;
    }
    
    /**
     * The configure-time question: what does the component we picked say about this picture?
     */
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.decoder.DecoderCapabilityReport.Capability forCodec(@org.jetbrains.annotations.NotNull()
    java.lang.String codecName, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType, int width, int height, int fps) {
        return null;
    }
    
    /**
     * The negotiation-time question: of the decoders this device has for [mimeType], what would the
     * one we are going to pick say?
     *
     * Picks the first hardware component, matching `VideoDecoder.findBestCodec`'s order, and falls
     * back to the first of any kind so a software-only device still gets a line. The software test
     * is the same name heuristic `VideoDecoder.isHevcDecoderAvailable` uses - one heuristic, not two.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.decoder.DecoderCapabilityReport.Capability query(@org.jetbrains.annotations.NotNull()
    java.lang.String mimeType, int width, int height, int fps) {
        return null;
    }
    
    /**
     * Same test as `VideoDecoder.isHevcDecoderAvailable`, kept in one place.
     */
    public final boolean isSoftwareName(@org.jetbrains.annotations.NotNull()
    java.lang.String codecName) {
        return false;
    }
    
    /**
     * One decoder's answer, plus the numbers behind it.
     *
     * [sustains] is deliberately nullable and distinct from [rateSupported]: below API 29 there are
     * no performance points, and "we could not ask" is not "the answer was no".
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0006H\u00c6\u0003J\t\u0010+\u001a\u00020\u0006H\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\nH\u00c6\u0003J\t\u0010.\u001a\u00020\nH\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\t\u00100\u001a\u00020\nH\u00c6\u0003J\u0088\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u00020\u0006H\u00d6\u0001J\b\u00106\u001a\u00020\u0003H\u0016R\u0011\u0010\u000e\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019\u00a8\u00067"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/DecoderCapabilityReport$Capability;", "", "codecName", "", "mimeType", "width", "", "height", "fps", "sizeSupported", "", "rateSupported", "sustains", "lowLatency", "adaptivePlayback", "supportedWidths", "supportedHeights", "(Ljava/lang/String;Ljava/lang/String;IIIZZLjava/lang/Boolean;ZZLjava/lang/String;Ljava/lang/String;)V", "getAdaptivePlayback", "()Z", "adequate", "getAdequate", "getCodecName", "()Ljava/lang/String;", "getFps", "()I", "getHeight", "getLowLatency", "getMimeType", "getRateSupported", "getSizeSupported", "getSupportedHeights", "getSupportedWidths", "getSustains", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getWidth", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;IIIZZLjava/lang/Boolean;ZZLjava/lang/String;Ljava/lang/String;)Lcom/andrerinas/openheadunit/decoder/DecoderCapabilityReport$Capability;", "equals", "other", "hashCode", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Capability {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String codecName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String mimeType = null;
        private final int width = 0;
        private final int height = 0;
        private final int fps = 0;
        private final boolean sizeSupported = false;
        private final boolean rateSupported = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean sustains = null;
        private final boolean lowLatency = false;
        private final boolean adaptivePlayback = false;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String supportedWidths = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String supportedHeights = null;
        
        public Capability(@org.jetbrains.annotations.NotNull()
        java.lang.String codecName, @org.jetbrains.annotations.NotNull()
        java.lang.String mimeType, int width, int height, int fps, boolean sizeSupported, boolean rateSupported, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean sustains, boolean lowLatency, boolean adaptivePlayback, @org.jetbrains.annotations.NotNull()
        java.lang.String supportedWidths, @org.jetbrains.annotations.NotNull()
        java.lang.String supportedHeights) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCodecName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMimeType() {
            return null;
        }
        
        public final int getWidth() {
            return 0;
        }
        
        public final int getHeight() {
            return 0;
        }
        
        public final int getFps() {
            return 0;
        }
        
        public final boolean getSizeSupported() {
            return false;
        }
        
        public final boolean getRateSupported() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getSustains() {
            return null;
        }
        
        public final boolean getLowLatency() {
            return false;
        }
        
        public final boolean getAdaptivePlayback() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSupportedWidths() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSupportedHeights() {
            return null;
        }
        
        public final boolean getAdequate() {
            return false;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final boolean component10() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
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
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean component7() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component8() {
            return null;
        }
        
        public final boolean component9() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.decoder.DecoderCapabilityReport.Capability copy(@org.jetbrains.annotations.NotNull()
        java.lang.String codecName, @org.jetbrains.annotations.NotNull()
        java.lang.String mimeType, int width, int height, int fps, boolean sizeSupported, boolean rateSupported, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean sustains, boolean lowLatency, boolean adaptivePlayback, @org.jetbrains.annotations.NotNull()
        java.lang.String supportedWidths, @org.jetbrains.annotations.NotNull()
        java.lang.String supportedHeights) {
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
}