package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0004\u0005J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapRead;", "", "read", "", "Base", "Factory", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public abstract interface AapRead {
    
    public abstract int read();
    
    /**
     * @param onVideoRunHoled called when a video fragment run turns out to be short of the bytes it
     *  declared. A callback rather than an [AapVideo] reference: the reader owes the video path one
     *  fact and nothing else, and the two are wired together in [Factory] the way every other
     *  cross-manager coupling in this app is.
     * @param faultInjector reader-stage fault injection, or null. Distinct from the injector
     *  [AapVideo] holds because the two act at different points in the receive path - see
     *  [VideoFaultInjector.Stage]. Only one of the two is ever non-null in a session.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B=\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ(\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u001eH\u0004J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003H$J\b\u0010\'\u001a\u00020\u001eH\u0016J \u0010(\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001eH\u0004R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006*"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapRead$Base;", "Lcom/andrerinas/openheadunit/aap/AapRead;", "connection", "Lcom/andrerinas/openheadunit/connection/AccessoryConnection;", "ssl", "Lcom/andrerinas/openheadunit/aap/AapSsl;", "handler", "Lcom/andrerinas/openheadunit/aap/AapMessageHandler;", "onVideoRunHoled", "Lkotlin/Function0;", "", "faultInjector", "Lcom/andrerinas/openheadunit/aap/VideoFaultInjector;", "(Lcom/andrerinas/openheadunit/connection/AccessoryConnection;Lcom/andrerinas/openheadunit/aap/AapSsl;Lcom/andrerinas/openheadunit/aap/AapMessageHandler;Lkotlin/jvm/functions/Function0;Lcom/andrerinas/openheadunit/aap/VideoFaultInjector;)V", "auditLastReportMs", "", "auditReports", "", "auditSuppressed", "getFaultInjector$com_andrerinas_headunitrevived_0_3_12_githubDebug", "()Lcom/andrerinas/openheadunit/aap/VideoFaultInjector;", "faultReporter", "Lcom/andrerinas/openheadunit/aap/VideoFaultReporter;", "getFaultReporter$com_andrerinas_headunitrevived_0_3_12_githubDebug", "()Lcom/andrerinas/openheadunit/aap/VideoFaultReporter;", "fragmentAudit", "Lcom/andrerinas/openheadunit/aap/FragmentedMessageAudit;", "getHandler$com_andrerinas_headunitrevived_0_3_12_githubDebug", "()Lcom/andrerinas/openheadunit/aap/AapMessageHandler;", "maxEncLenSeen", "", "getSsl$com_andrerinas_headunitrevived_0_3_12_githubDebug", "()Lcom/andrerinas/openheadunit/aap/AapSsl;", "auditFragment", "channel", "flags", "encLen", "declaredTotal", "doRead", "read", "shouldDropForFaultInjection", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static abstract class Base implements com.andrerinas.openheadunit.aap.AapRead {
        @org.jetbrains.annotations.Nullable()
        private final com.andrerinas.openheadunit.connection.AccessoryConnection connection = null;
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.aap.AapSsl ssl = null;
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.aap.AapMessageHandler handler = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onVideoRunHoled = null;
        @org.jetbrains.annotations.Nullable()
        private final com.andrerinas.openheadunit.aap.VideoFaultInjector faultInjector = null;
        
        /**
         * Every line [faultInjector] prints. Shared wording with [AapVideo]'s - see the class.
         */
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.aap.VideoFaultReporter faultReporter = null;
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.aap.FragmentedMessageAudit fragmentAudit = null;
        
        /**
         * Per-outcome print budget: how many have been printed, when the last one was, and how many
         * went unprinted since. See [AuditReportPolicy] for why this refills instead of running out.
         */
        @org.jetbrains.annotations.NotNull()
        private final int[] auditReports = null;
        @org.jetbrains.annotations.NotNull()
        private final long[] auditLastReportMs = null;
        @org.jetbrains.annotations.NotNull()
        private final int[] auditSuppressed = null;
        
        /**
         * Largest single message body seen, reported each time it crosses a power of two.
         *
         * `msgBuffer` is a flat 4MB in both readers, which on a 1GB unit is a fifth of the whole Java
         * heap standing reserved for a message size nobody has measured. Shrinking it on a guess would
         * turn a large frame into "Invalid message size ... Skipping", so measure it first: at most a
         * dozen lines ever, and they say exactly how small it could safely be.
         */
        private int maxEncLenSeen = 0;
        
        public Base(@org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.connection.AccessoryConnection connection, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.AapSsl ssl, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.AapMessageHandler handler, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onVideoRunHoled, @org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.VideoFaultInjector faultInjector) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.AapSsl getSsl$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.AapMessageHandler getHandler$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.aap.VideoFaultInjector getFaultInjector$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
            return null;
        }
        
        /**
         * Every line [faultInjector] prints. Shared wording with [AapVideo]'s - see the class.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.VideoFaultReporter getFaultReporter$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
            return null;
        }
        
        /**
         * Whether this message should be treated as one that never arrived.
         *
         * Called by both readers once the whole body is in hand and **before** [auditFragment], which
         * is the entire point: a fragment dropped here is short in the audit's own accounting, and an
         * assembler-stage drop can never reproduce that because the audit has already counted it.
         *
         * ### The caller must still decrypt the message it drops
         *
         * An earlier version of this said the drop was safe because only bytes already consumed from
         * the connection are discarded, so the stream stays framed. The framing part is true and was
         * measured - a hardware round killed four sessions this way and produced **zero** of the
         * framing-desync lines. It is also not sufficient, because the byte stream is not the only
         * ordered state in the receive path.
         *
         * [AapSslContext.decrypt] calls `SSLEngine.unwrap`, whose TLS record sequence advances per
         * record, and the phone's sending side advances its own for every record it encrypts whether
         * or not we choose to look at it. A record we never unwrap leaves this engine permanently one
         * behind, every later unwrap fails authentication, and the session dies within seconds:
         * measured at 3.9s from handshake to `Connection closed (EOF)` on the first injected fault,
         * with a storm of `Decrypted payload too short: 0` in between.
         *
         * So both readers resolve this into a local, skip only [auditFragment] and the handler, and
         * decrypt unconditionally. Do not turn either back into an early return.
         */
        protected final boolean shouldDropForFaultInjection(int channel, int flags, int encLen) {
            return false;
        }
        
        @java.lang.Override()
        public int read() {
            return 0;
        }
        
        /**
         * Cross-checks a fragment run against the total size its first fragment declared.
         *
         * Both readers already read that 4-byte total and discarded it, which left the one corruption
         * mode nothing downstream can see: a missing *middle* fragment leaves the run looking intact
         * to the reassembler, so the frame is assembled with a hole and decoded as though it were
         * whole. See [FragmentedMessageAudit] for why the check learns the convention rather than
         * assuming one.
         *
         * [declaredTotal] is only meaningful on a first fragment and is ignored otherwise.
         */
        protected final void auditFragment(int channel, int flags, int encLen, int declaredTotal) {
        }
        
        protected abstract int doRead(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.connection.AccessoryConnection connection);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Jn\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00142\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014\u00a8\u0006\u0019"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapRead$Factory;", "", "()V", "create", "Lcom/andrerinas/openheadunit/aap/AapRead;", "connection", "Lcom/andrerinas/openheadunit/connection/AccessoryConnection;", "transport", "Lcom/andrerinas/openheadunit/aap/AapTransport;", "recorder", "Lcom/andrerinas/openheadunit/decoder/MicRecorder;", "aapAudio", "Lcom/andrerinas/openheadunit/aap/AapAudio;", "aapVideo", "Lcom/andrerinas/openheadunit/aap/AapVideo;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "context", "Landroid/content/Context;", "onAaMediaMetadata", "Lkotlin/Function1;", "Lcom/andrerinas/openheadunit/aap/protocol/proto/MediaPlayback$MediaMetaData;", "", "onAaPlaybackStatus", "Lcom/andrerinas/openheadunit/aap/protocol/proto/MediaPlayback$MediaPlaybackStatus;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Factory {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.AapRead.Factory INSTANCE = null;
        
        private Factory() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.AapRead create(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.connection.AccessoryConnection connection, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.AapTransport transport, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.decoder.MicRecorder recorder, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.AapAudio aapAudio, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.AapVideo aapVideo, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.utils.Settings settings, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData, kotlin.Unit> onAaMediaMetadata, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaPlaybackStatus, kotlin.Unit> onAaPlaybackStatus) {
            return null;
        }
    }
}