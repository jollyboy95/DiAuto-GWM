package com.andrerinas.openheadunit.aap;

/**
 * @param codecName / [forceSoftware] override the user's video settings for a stream that is not
 * the main screen: the dashboard is always H.264 on the hardware decoder.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 12\u00020\u0001:\u00011B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J \u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0002J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010\'\u001a\u00020\f2\u0006\u0010(\u001a\u00020)2\u0006\u0010%\u001a\u00020&H\u0002J\u0006\u0010*\u001a\u00020\fJ \u0010+\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0002J\u000e\u0010,\u001a\u00020\t2\u0006\u0010%\u001a\u00020&J\u0006\u0010-\u001a\u00020\fJ\b\u0010.\u001a\u00020\fH\u0002J\u0010\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\u0007H\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapVideo;", "", "videoDecoder", "Lcom/andrerinas/openheadunit/decoder/VideoDecoder;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "codecName", "", "forceSoftware", "", "onFrameCorrupted", "Lkotlin/Function0;", "", "(Lcom/andrerinas/openheadunit/decoder/VideoDecoder;Lcom/andrerinas/openheadunit/utils/Settings;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;)V", "assembler", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler;", "faultInjector", "Lcom/andrerinas/openheadunit/aap/VideoFaultInjector;", "Ljava/lang/Boolean;", "lastAnomalyReportMs", "", "lastKeyframeRequestMs", "legacyAssembledBuffer", "", "messageBuffer", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "reporter", "Lcom/andrerinas/openheadunit/aap/VideoFaultReporter;", "ensureCapacity", "additionalBytes", "", "findStartCode", "buf", "offset", "len", "firstBytesOf", "message", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "handleAnomaly", "anomaly", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Anomaly;", "onFragmentRunHoled", "payloadStartsAt", "process", "release", "reportAnomalies", "requestKeyframe", "reason", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapVideo {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.decoder.VideoDecoder videoDecoder = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String codecName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean forceSoftware = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onFrameCorrupted = null;
    
    /**
     * Enough for H.264 at the resolutions most head units negotiate. ~2MB.
     */
    private static final int INITIAL_BUFFER_BYTES = 2097280;
    
    /**
     * Ceiling for [ensureCapacity]. ~8MB, which covers H.265 at 4K.
     */
    private static final int MAX_BUFFER_BYTES = 8389120;
    
    /**
     * Spacing of the anomaly summary, matched to the decoder's throughput line so they interleave.
     */
    private static final long ANOMALY_REPORT_INTERVAL_MS = 5000L;
    
    /**
     * Reassembly buffer for fragmented frames. Grows on demand.
     *
     * It used to be sized up front from settings.videoCodec, which is the user's preference and
     * not the codec the session runs: ServiceDiscoveryResponse negotiates H.265 at 1440p and 4K
     * whatever that setting says, and falls back to H.264 when the user asked for H.265 on a
     * device with no HEVC decoder. Either mismatch handed an H.265 stream the 2MB H.264 buffer and
     * turned every large frame into a fragment overflow. The real answer is also not available
     * here - AapVideo is constructed with the transport, before the phone has negotiated anything
     * - so start small and let a frame that does not fit be the thing that asks for more.
     */
    private java.nio.ByteBuffer messageBuffer;
    @org.jetbrains.annotations.Nullable()
    private byte[] legacyAssembledBuffer;
    private long lastKeyframeRequestMs = 0L;
    private long lastAnomalyReportMs = 0L;
    
    /**
     * Ordering rules for the fragment run. Pure and unit-tested; see [VideoFragmentAssembler].
     */
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.VideoFragmentAssembler assembler = null;
    
    /**
     * Every line the injector prints. Declared first: [faultInjector]'s initializer announces on it.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.VideoFaultReporter reporter = null;
    
    /**
     * Null unless the user has deliberately turned fault injection on, so the healthy path costs one
     * null check. See [VideoFaultInjector] for why this exists at all.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.andrerinas.openheadunit.aap.VideoFaultInjector faultInjector = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.AapVideo.Companion Companion = null;
    
    public AapVideo(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.decoder.VideoDecoder videoDecoder, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings, @org.jetbrains.annotations.Nullable()
    java.lang.String codecName, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean forceSoftware, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFrameCorrupted) {
        super();
    }
    
    /**
     * The reader's framing audit found a run short of the bytes its first fragment declared.
     *
     * This is the one corruption mode nothing downstream of the reader can see. A middle fragment
     * that never arrives leaves [VideoFragmentAssembler] looking at a first, some middles and a last
     * in order, so the frame is assembled with a hole and decoded as though it were whole - no
     * anomaly, no ask, and a picture that drifts until the phone's own keyframe cadence comes round.
     * [FragmentedMessageAudit] is the only thing that notices, and until now all it did was log.
     *
     * Runs on the poll thread, which is the thread [process] and every other keyframe request
     * already run on, so it shares their throttle and their ordering without any locking of its own.
     */
    public final void onFragmentRunHoled() {
    }
    
    private final void requestKeyframe(java.lang.String reason) {
    }
    
    /**
     * Logs, counts and reacts to one broken-stream event.
     *
     * The counters live on the assembler and are summarised periodically by [reportAnomalies]; the
     * per-event line is what tells a reporter's log *when* it happened relative to what they saw.
     */
    private final void handleAnomaly(com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Anomaly anomaly, com.andrerinas.openheadunit.aap.AapMessage message) {
    }
    
    /**
     * A periodic count of everything the stream got wrong, emitted only when something did.
     *
     * A line that appears only when the reassembler is unhappy is worth more in a bug report than a
     * field that reads zero on every healthy line, so this is its own summary rather than extra
     * columns on the decoder's throughput line.
     */
    private final void reportAnomalies() {
    }
    
    private final java.lang.String firstBytesOf(com.andrerinas.openheadunit.aap.AapMessage message) {
        return null;
    }
    
    /**
     * Makes room for [additionalBytes] more of the frame being assembled, growing [messageBuffer]
     * if it has to. Returns false only at [MAX_BUFFER_BYTES], where the frame is genuinely too
     * large to be one we can decode and the caller should invalidate it.
     */
    private final boolean ensureCapacity(int additionalBytes) {
        return false;
    }
    
    /**
     * Length of the Annex B start code at [offset], or -1 if there is none.
     *
     * Bounded by [len] - the message's payload length - and not by `buf.size`. The two are only
     * equal because the SSL layer currently hands out an exactly-sized array per message; reading
     * to the end of the array would become a stale-data read the moment that buffer is pooled, and
     * a start code found in the previous message's leftovers would send a garbage frame to the
     * codec.
     */
    private final int findStartCode(byte[] buf, int offset, int len) {
        return 0;
    }
    
    /**
     * Whether a frame starts at [offset], i.e. there is a start code there with payload behind it.
     */
    private final boolean payloadStartsAt(byte[] buf, int offset, int len) {
        return false;
    }
    
    public final boolean process(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapMessage message) {
        return false;
    }
    
    public final void release() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapVideo$Companion;", "", "()V", "ANOMALY_REPORT_INTERVAL_MS", "", "INITIAL_BUFFER_BYTES", "", "MAX_BUFFER_BYTES", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}