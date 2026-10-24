package com.andrerinas.openheadunit.connection;

/**
 * Central connection and transport lifecycle manager.
 *
 * CommManager owns the full lifecycle of both the physical connection ([AccessoryConnection])
 * and the AAP protocol layer ([AapTransport]). It exposes a single [connectionState] flow as
 * the source of truth; all consumers (AapService, AapProjectionActivity, UI fragments) observe
 * this flow reactively instead of being called imperatively.
 *
 * ## State machine
 * ```
 *  Disconnected ──connect()──► Connecting ──success──► Connected
 *                                                           │
 *                                                  startHandshake()
 *                                                           │
 *                                                  StartingTransport
 *                                                           │
 *                                                    SSL done
 *                                                           │
 *                                                  HandshakeComplete
 *                                                           │
 *                                                   startReading()
 *                                                           │
 *                                                   TransportStarted
 *                                                           │
 *                                     disconnect() / read error / phone bye-bye
 *                                                           │
 *                                                     Disconnected
 * ```
 *
 * ## Thread safety
 * [_transport] and [_connection] are `@Volatile`. All state mutations go through
 * [_connectionState] (a [MutableStateFlow]) which is thread-safe. The internal [_scope] uses
 * [Dispatchers.IO] with a [SupervisorJob] so individual coroutine failures do not cancel the
 * entire scope.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u0088\u00012\u00020\u0001:\u0004\u0088\u0001\u0089\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010P\u001a\u000208H\u0086@\u00a2\u0006\u0002\u0010QJ\u000f\u0010R\u001a\u0004\u0018\u00010\u001dH\u0002\u00a2\u0006\u0002\u0010SJ\u0016\u0010T\u001a\u0002082\u0006\u0010U\u001a\u00020VH\u0086@\u00a2\u0006\u0002\u0010WJ\u0016\u0010T\u001a\u0002082\u0006\u0010X\u001a\u00020YH\u0086@\u00a2\u0006\u0002\u0010ZJ\u001e\u0010T\u001a\u0002082\u0006\u0010[\u001a\u0002012\u0006\u0010\\\u001a\u00020+H\u0086@\u00a2\u0006\u0002\u0010]J\u0006\u0010^\u001a\u000208J\u001a\u0010_\u001a\u0002082\b\b\u0002\u0010`\u001a\u00020\u001d2\b\b\u0002\u0010a\u001a\u00020\u001dJ\u000e\u0010b\u001a\u0002082\u0006\u0010c\u001a\u00020\fJ\u0012\u0010d\u001a\u0002082\b\b\u0002\u0010`\u001a\u00020\u001dH\u0002J\u000e\u0010e\u001a\u00020\u001d2\u0006\u0010U\u001a\u00020VJ\u0010\u0010f\u001a\u00020\u001d2\u0006\u0010g\u001a\u00020+H\u0002J\u0006\u0010h\u001a\u000208J\u0010\u0010i\u001a\u0002082\u0006\u0010j\u001a\u00020\u001dH\u0002J\u0010\u0010k\u001a\u0002082\u0006\u0010l\u001a\u00020\u001dH\u0002J\u0006\u0010m\u001a\u00020\u001dJ\u0006\u0010n\u001a\u000208J\u0006\u0010o\u001a\u000208J\u0006\u0010p\u001a\u000208J\u000e\u0010q\u001a\u0002082\u0006\u0010r\u001a\u00020sJ\u000e\u0010q\u001a\u0002082\u0006\u0010t\u001a\u00020uJ\u0016\u0010q\u001a\u0002082\u0006\u0010v\u001a\u00020+2\u0006\u0010w\u001a\u00020\u001dJ1\u0010x\u001a\u0002082\u0006\u0010v\u001a\u00020+2\u0006\u0010w\u001a\u00020\u001d2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010z\u001a\u000201\u00a2\u0006\u0002\u0010{J\u0006\u0010|\u001a\u000208J(\u0010}\u001a\u0002082\u0006\u0010~\u001a\u00020+2\u0006\u0010\u007f\u001a\u00020+2\u0007\u0010\u0080\u0001\u001a\u00020+2\u0007\u0010\u0081\u0001\u001a\u00020+J\u000f\u0010\u0082\u0001\u001a\u000208H\u0086@\u00a2\u0006\u0002\u0010QJ\u000f\u0010\u0083\u0001\u001a\u000208H\u0086@\u00a2\u0006\u0002\u0010QJ\u001b\u0010\u0084\u0001\u001a\u0002082\u0007\u0010\u0085\u0001\u001a\u00020\u001d2\u0007\u0010\u0086\u0001\u001a\u00020\u001dH\u0002J\u0007\u0010\u0087\u0001\u001a\u000208R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001eR\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010%\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\'\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010&R\u0011\u0010(\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010&R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010-\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b.\u0010/R\"\u00102\u001a\u0004\u0018\u0001012\b\u00100\u001a\u0004\u0018\u000101@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R(\u00105\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000208\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010=\u001a\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000208\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R(\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u000208\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010:\"\u0004\bC\u0010<R\"\u0010D\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010EX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u000e\u0010J\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010K\u001a\u0004\u0018\u000101X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010L\u001a\u00020+2\u0006\u00100\u001a\u00020+@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u000e\u0010O\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u008a\u0001"}, d2 = {"Lcom/andrerinas/openheadunit/connection/CommManager;", "", "context", "Landroid/content/Context;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "audioDecoder", "Lcom/andrerinas/openheadunit/decoder/AudioDecoder;", "videoDecoder", "Lcom/andrerinas/openheadunit/decoder/VideoDecoder;", "(Landroid/content/Context;Lcom/andrerinas/openheadunit/utils/Settings;Lcom/andrerinas/openheadunit/decoder/AudioDecoder;Lcom/andrerinas/openheadunit/decoder/VideoDecoder;)V", "BT_MEDIA_LINK_CACHE_MS", "", "_backgroundNotification", "Lcom/andrerinas/openheadunit/main/BackgroundNotification;", "_connection", "Lcom/andrerinas/openheadunit/connection/AccessoryConnection;", "_connectionState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState;", "_disconnectJob", "Lkotlinx/coroutines/Job;", "_scope", "Lkotlinx/coroutines/CoroutineScope;", "_transport", "Lcom/andrerinas/openheadunit/aap/AapTransport;", "aapSslContext", "Lcom/andrerinas/openheadunit/aap/AapSslContext;", "btMediaLinkCached", "", "Ljava/lang/Boolean;", "btMediaLinkCheckedAt", "Ljava/lang/Long;", "connectionState", "Lkotlinx/coroutines/flow/StateFlow;", "getConnectionState", "()Lkotlinx/coroutines/flow/StateFlow;", "isBusy", "()Z", "isConnected", "isWirelessSession", "keyStates", "", "", "Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$KeyState;", "lastAapMessageMs", "getLastAapMessageMs", "()J", "<set-?>", "", "lastAttemptedEndpoint", "getLastAttemptedEndpoint", "()Ljava/lang/String;", "onAaMediaMetadata", "Lkotlin/Function1;", "Lcom/andrerinas/openheadunit/aap/protocol/proto/MediaPlayback$MediaMetaData;", "", "getOnAaMediaMetadata", "()Lkotlin/jvm/functions/Function1;", "setOnAaMediaMetadata", "(Lkotlin/jvm/functions/Function1;)V", "onAaPlaybackStatus", "Lcom/andrerinas/openheadunit/aap/protocol/proto/MediaPlayback$MediaPlaybackStatus;", "getOnAaPlaybackStatus", "setOnAaPlaybackStatus", "onAudioFocusStateChanged", "getOnAudioFocusStateChanged", "setOnAudioFocusStateChanged", "onUpdateUiConfigReplyReceived", "Lkotlin/Function0;", "getOnUpdateUiConfigReplyReceived", "()Lkotlin/jvm/functions/Function0;", "setOnUpdateUiConfigReplyReceived", "(Lkotlin/jvm/functions/Function0;)V", "sessionReachedHandshake", "silentPeerEndpoint", "silentPeerFailures", "getSilentPeerFailures", "()I", "starvedSessionStreak", "awaitDisconnectComplete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "btMediaLinkForKeys", "()Ljava/lang/Boolean;", "connect", "device", "Landroid/hardware/usb/UsbDevice;", "(Landroid/hardware/usb/UsbDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "socket", "Ljava/net/Socket;", "(Ljava/net/Socket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ip", "port", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "destroy", "disconnect", "sendByeBye", "isUserExit", "disconnectForLinkLoss", "timeoutMs", "doDisconnect", "isConnectedToUsbDevice", "isMediaKey", "code", "loseFocus", "noteHandshakeOutcome", "silent", "noteSessionEnded", "renderedAnyFrame", "releaseVideoFocusForKeyframe", "requestClusterKeyframe", "restartAudio", "retakeVideoFocusForKeyframe", "send", "message", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "sensor", "Lcom/andrerinas/openheadunit/aap/protocol/messages/SensorEvent;", "keyCode", "isPress", "sendKey", "downTime", "source", "(IZLjava/lang/Long;Ljava/lang/String;)V", "sendToggleVoiceAssistant", "sendUpdateUiConfigRequest", "left", "top", "right", "bottom", "startHandshake", "startReading", "transportedQuited", "isClean", "wasUserExit", "updateAudioGains", "Companion", "ConnectionState", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class CommManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.decoder.AudioDecoder audioDecoder = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.decoder.VideoDecoder videoDecoder = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapSslContext aapSslContext = null;
    
    /**
     * IO-bound coroutine scope for all async connection work. SupervisorJob prevents one
     * failing child from cancelling the rest.
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope _scope = null;
    
    /**
     * Cached answer of the Bluetooth media probe used by media-key routing, and when it was taken.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean btMediaLinkCached;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long btMediaLinkCheckedAt;
    private final long BT_MEDIA_LINK_CACHE_MS = 2000L;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.andrerinas.openheadunit.connection.CommManager.ConnectionState> _connectionState = null;
    
    /**
     * Callback for audio focus state changes (isPlaying). Set by AapService.
     */
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onAudioFocusStateChanged;
    
    /**
     * Now-playing metadata from the phone (AAP media channel). Set by AapService.
     */
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData, kotlin.Unit> onAaMediaMetadata;
    
    /**
     * Playback status from the phone (AAP media channel), includes current position.
     */
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaPlaybackStatus, kotlin.Unit> onAaPlaybackStatus;
    
    /**
     * @Volatile: written on IO thread, read on Main and IO threads.
     */
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile com.andrerinas.openheadunit.aap.AapTransport _transport;
    
    /**
     * `ip:port` of the most recent connection attempt, or `null` when it was not a socket
     * (USB). Lets a caller attribute a handshake failure to the peer it happened with, which
     * matters for the one failure that is a property of that peer rather than of the link —
     * see [ERROR_HANDSHAKE_PEER_SILENT].
     */
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile java.lang.String lastAttemptedEndpoint;
    
    /**
     * Consecutive handshakes against one endpoint where the peer accepted the connection and then
     * sent nothing at all. Read by the discovery rescheduler to back off — see
     * [com.andrerinas.openheadunit.aap.UnresponsivePeerPolicy].
     *
     * Counted here rather than from a [ConnectionState.Error] collector because that state is not
     * observable: [connectionState] is a `MutableStateFlow`, so collection is conflated, and
     * [startHandshake] calls [disconnect] with no suspension point after emitting the error — the
     * value has already moved on to `Disconnected` before any collector resumes.
     */
    @kotlin.jvm.Volatile()
    private volatile int silentPeerFailures = 0;
    
    /**
     * The endpoint [silentPeerFailures] is counting; a different one starts its own streak.
     */
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile java.lang.String silentPeerEndpoint;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onUpdateUiConfigReplyReceived;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile com.andrerinas.openheadunit.connection.AccessoryConnection _connection;
    
    /**
     * Tracks the most-recently-launched [doDisconnect] coroutine.
     * [connect] overloads join this job before opening a new connection, ensuring the previous
     * device is fully closed before `openDevice()` is called on it again.
     */
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile kotlinx.coroutines.Job _disconnectJob;
    @kotlin.jvm.Volatile()
    private volatile boolean sessionReachedHandshake = false;
    @kotlin.jvm.Volatile()
    private volatile int starvedSessionStreak = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.main.BackgroundNotification _backgroundNotification = null;
    
    /**
     * Public read-only view of [_connectionState].
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.andrerinas.openheadunit.connection.CommManager.ConnectionState> connectionState = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Integer, com.andrerinas.openheadunit.aap.KeyDebouncePolicy.KeyState> keyStates = null;
    
    /**
     * [ConnectionState.Error] message for the one handshake failure that says something
     * specific about the *peer* rather than about us: the TCP connection was accepted, the
     * version request went out, and not one byte ever came back.
     *
     * Still contains "Handshake failed" so the generic handling keeps working.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_HANDSHAKE_PEER_SILENT = "Handshake failed: the peer never responded";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.CommManager.Companion Companion = null;
    
    public CommManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.decoder.AudioDecoder audioDecoder, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.decoder.VideoDecoder videoDecoder) {
        super();
    }
    
    /**
     * Callback for audio focus state changes (isPlaying). Set by AapService.
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnAudioFocusStateChanged() {
        return null;
    }
    
    /**
     * Callback for audio focus state changes (isPlaying). Set by AapService.
     */
    public final void setOnAudioFocusStateChanged(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> p0) {
    }
    
    /**
     * Now-playing metadata from the phone (AAP media channel). Set by AapService.
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData, kotlin.Unit> getOnAaMediaMetadata() {
        return null;
    }
    
    /**
     * Now-playing metadata from the phone (AAP media channel). Set by AapService.
     */
    public final void setOnAaMediaMetadata(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData, kotlin.Unit> p0) {
    }
    
    /**
     * Playback status from the phone (AAP media channel), includes current position.
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaPlaybackStatus, kotlin.Unit> getOnAaPlaybackStatus() {
        return null;
    }
    
    /**
     * Playback status from the phone (AAP media channel), includes current position.
     */
    public final void setOnAaPlaybackStatus(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaPlaybackStatus, kotlin.Unit> p0) {
    }
    
    /**
     * `ip:port` of the most recent connection attempt, or `null` when it was not a socket
     * (USB). Lets a caller attribute a handshake failure to the peer it happened with, which
     * matters for the one failure that is a property of that peer rather than of the link —
     * see [ERROR_HANDSHAKE_PEER_SILENT].
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastAttemptedEndpoint() {
        return null;
    }
    
    /**
     * Consecutive handshakes against one endpoint where the peer accepted the connection and then
     * sent nothing at all. Read by the discovery rescheduler to back off — see
     * [com.andrerinas.openheadunit.aap.UnresponsivePeerPolicy].
     *
     * Counted here rather than from a [ConnectionState.Error] collector because that state is not
     * observable: [connectionState] is a `MutableStateFlow`, so collection is conflated, and
     * [startHandshake] calls [disconnect] with no suspension point after emitting the error — the
     * value has already moved on to `Disconnected` before any collector resumes.
     */
    public final int getSilentPeerFailures() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnUpdateUiConfigReplyReceived() {
        return null;
    }
    
    public final void setOnUpdateUiConfigReplyReceived(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    /**
     * Public read-only view of [_connectionState].
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.andrerinas.openheadunit.connection.CommManager.ConnectionState> getConnectionState() {
        return null;
    }
    
    public final boolean isConnected() {
        return false;
    }
    
    public final long getLastAapMessageMs() {
        return 0L;
    }
    
    public final boolean isBusy() {
        return false;
    }
    
    public final boolean isWirelessSession() {
        return false;
    }
    
    /**
     * Returns `true` if the current USB connection is to [device].
     * Used by AapService to decide whether a USB detach event should trigger a disconnect.
     */
    public final boolean isConnectedToUsbDevice(@org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbDevice device) {
        return false;
    }
    
    /**
     * Opens a USB accessory connection to [device].
     *
     * On success emits [ConnectionState.Connected] and persists the device as the last-used
     * connection so it can be auto-reconnected on the next launch.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object connect(@org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbDevice device, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Wraps an already-connected [Socket] (e.g. accepted by `WirelessServer`) in a
     * [SocketAccessoryConnection] and advances to [ConnectionState.Connected].
     *
     * The socket must already be connected; this overload skips the TCP handshake and only
     * sets up the AAP framing layer.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object connect(@org.jetbrains.annotations.NotNull()
    java.net.Socket socket, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Opens a TCP connection to [ip]:[port] and advances to [ConnectionState.Connected].
     *
     * Used by the manual IP entry flow and the NSD-discovered device list.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object connect(@org.jetbrains.annotations.NotNull()
    java.lang.String ip, int port, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Phase 1: runs the SSL handshake over the current connection.
     *
     * Must only be called when state is [ConnectionState.Connected]. On success, emits
     * [ConnectionState.HandshakeComplete] and returns; the inbound message loop is NOT
     * started yet. Call [startReading] after [VideoDecoder.setSurface] has been invoked
     * to begin receiving messages.
     *
     * The [AapTransport.onQuit] callback is wired here; it fires whenever the transport
     * stops (read error, phone bye-bye, timeout) and triggers [transportedQuited].
     *
     * Called by [com.andrerinas.openheadunit.aap.AapService] in parallel with the
     * projection activity startup, so the handshake latency is hidden behind activity
     * inflation time rather than added on top of it.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object startHandshake(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Updates [silentPeerFailures] after a failed handshake, and explains the situation once when
     * the streak reaches the point where the retry cadence drops.
     */
    private final void noteHandshakeOutcome(boolean silent) {
    }
    
    /**
     * Phase 2: starts the inbound message loop.
     *
     * Must only be called when state is [ConnectionState.HandshakeComplete], which implies
     * both that the SSL handshake has succeeded **and** that [VideoDecoder.setSurface] has
     * already been called by [com.andrerinas.openheadunit.aap.AapProjectionActivity].
     * This ordering guarantees no video frame is ever decoded before a render target exists.
     *
     * On success:
     * 1. In Static Audio Focus mode, claims permanent audio focus for `STREAM_MUSIC`.
     * 2. Starts the [AapTransport] read loop.
     * 3. Emits [ConnectionState.TransportStarted].
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object startReading(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Called by `AapTransport.onQuit` when the transport stops itself (read error, socket
     * timeout, or phone-initiated graceful close).
     *
     * Sets state to [ConnectionState.Disconnected] synchronously (so [isConnected] returns
     * `false` immediately) then schedules cleanup. `sendByeBye` is `false` because the
     * connection is already dead — there is no point sending a `ByeByeRequest`.
     */
    private final void transportedQuited(boolean isClean, boolean wasUserExit) {
    }
    
    /**
     * Sends a key press or release event to the phone with remapping and de-duplication.
     * This is the single entry point for all key events in the application.
     *
     * @param downTime `KeyEvent.getDownTime()` when the caller has a real event. It identifies the
     *                physical press, so [KeyDebouncePolicy] can tell one press arriving by several
     *                routes from two presses in quick succession. Callers holding only a keycode —
     *                the proprietary OEM broadcasts — leave it null and get the time window.
     * @param source   where this delivery came from, for the log. One press reaching several
     *                sources is the normal case on these head units, and naming them is what makes
     *                a user's log readable.
     */
    public final void sendKey(int keyCode, boolean isPress, @org.jetbrains.annotations.Nullable()
    java.lang.Long downTime, @org.jetbrains.annotations.NotNull()
    java.lang.String source) {
    }
    
    /**
     * Whether a Bluetooth media link is up, for [MediaKeyRoutingPolicy]. Null when the adapter would
     * not say.
     *
     * Cached briefly rather than probed per press: `getProfileConnectionState` is a binder call and
     * this runs on the main thread, from the projection activity's key dispatch. The window is short
     * enough that toggling media audio on the phone's Bluetooth entry takes effect without
     * reconnecting, which is how this gets tested.
     */
    private final java.lang.Boolean btMediaLinkForKeys() {
        return null;
    }
    
    private final boolean isMediaKey(int code) {
        return false;
    }
    
    /**
     * [Legacy] Internal transport send. Use sendKey() for physical button inputs.
     * @deprecated Use sendKey(keyCode, isPress) for unified remapping and debouncing.
     */
    public final void send(int keyCode, boolean isPress) {
    }
    
    /**
     * Sends a sensor event (e.g. driving status, night mode) to the phone.
     */
    public final void send(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.protocol.messages.SensorEvent sensor) {
    }
    
    /**
     * Asks the phone for a fresh dashboard keyframe, e.g. after the dashboard surface was
     * recreated. Sent only once the phone has started that stream: a media message on a channel it
     * never opened is not something to risk the session on.
     */
    public final void requestClusterKeyframe() {
    }
    
    /**
     * Sends a raw [AapMessage] (e.g. touch event, video focus request) to the phone.
     */
    public final void send(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapMessage message) {
    }
    
    public final void sendToggleVoiceAssistant() {
    }
    
    public final void loseFocus() {
    }
    
    public final void sendUpdateUiConfigRequest(int left, int top, int right, int bottom) {
    }
    
    /**
     * First half of a video-focus cycle: release focus so the phone tears its video sink down and
     * has to set it up again, which is what makes it start the next stream with a keyframe. The
     * caller sends the matching gain after a gap.
     *
     * The release makes the phone answer with a video sink stop. [AapTransport.ignoreNextStopRequest]
     * marks that one as ours, so it stays distinguishable in the log from a sink stop nobody asked
     * for - which is what a video-black failure looks like, and has been the decisive line in four
     * rounds of hardware testing.
     *
     * Two policies decide when this is warranted, and nothing else should: [WarmRelaunchKeyframePolicy]
     * for a surface that has never shown a frame, and [KeyframeCycleEscalationPolicy] for a picture
     * left corrupt by a shed reference frame. The latter sends its own release from [AapTransport]
     * rather than calling here, because it has to pair the release with a regain on the send handler.
     * Releasing focus across a stream that is rendering is a known way to lose one permanently, which
     * is why both sets of gates are as reluctant as they are.
     *
     * Both go through the transport's single claim on the lever, so a release can never be issued
     * while another cycle is still waiting to send its regain. Returns false when the claim is
     * refused - the caller must not then spend its own budget or schedule a regain, because no
     * release went out for it to complete.
     */
    public final boolean releaseVideoFocusForKeyframe() {
        return false;
    }
    
    /**
     * Second half of a cycle started by [releaseVideoFocusForKeyframe], and the only correct way to
     * end one: it sends the regain *and* hands the lever back, which a bare [send] would not.
     */
    public final void retakeVideoFocusForKeyframe() {
    }
    
    public final void updateAudioGains() {
    }
    
    public final void restartAudio() {
    }
    
    /**
     * Initiates a disconnect.
     *
     * Sets state to [ConnectionState.Disconnected] synchronously so callers see the change
     * immediately, then schedules async cleanup via [doDisconnect]. A ByeByeRequest is sent
     * to the phone before closing the connection.
     */
    public final void disconnect(boolean sendByeBye, boolean isUserExit) {
    }
    
    /**
     * Suspends until the most recently launched [doDisconnect] coroutine (started by
     * [disconnect]) has finished — i.e. the ByeByeRequest has actually been sent and the
     * physical connection actually closed, not just that [connectionState] flipped.
     * Mirrors the `_disconnectJob?.join()` idiom already used internally by the `connect(...)`
     * overloads (e.g. line 192).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object awaitDisconnectComplete(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Tears down the transport and physical connection.
     *
     * **Null-first pattern**: [_transport] and [_connection] are captured and nulled at the
     * very start. This prevents re-entrant double-cleanup: `AapTransport.stop()` fires `onQuit`
     * → [transportedQuited] → a second [doDisconnect] call — which now finds both fields null
     * and exits cleanly.
     *
     * @param sendByeBye `true` (default) when the user initiates the disconnect — calls
     *  `AapTransport.stop()`, which sends a `ByeByeRequest` to the phone and waits ~150 ms
     *  for acknowledgement. `false` when the transport self-quit (read error, socket timeout):
     *  the connection is already dead, so `AapTransport.quit()` is called directly to skip
     *  the send and the sleep.
     */
    private final void doDisconnect(boolean sendByeBye) {
    }
    
    /**
     * Counts a finished session against [VideoStarvationPolicy] and, on a long enough run of
     * sessions that carried no video at all, says what that means and what to do about it.
     *
     * The phone gives no reason we can see — it closes the socket and our read reports a plain EOF
     * — so without this the log shows nothing but a healthy connection repeating forever.
     */
    private final void noteSessionEnded(boolean renderedAnyFrame) {
    }
    
    /**
     * Closes the session because the link carrying it is about to go away, and blocks until the
     * socket is actually closed or [timeoutMs] elapses. Never call from the main thread.
     *
     * Deliberately not [disconnect]. That one means "the user pressed Exit": it marks a user exit,
     * which suppresses the reconnect, and it honours `killOnDisconnect`, which would finish the
     * activities and stop the service. Neither is right for a WiFi toggle the user expects to come
     * back from.
     *
     * Blocking is the whole point. [disconnect] only schedules the teardown, which is fine when
     * something will still be running afterwards to notice; it is not fine when the interface is
     * on its way down and what matters is that the close goes out before it.
     */
    public final void disconnectForLinkLoss(long timeoutMs) {
    }
    
    public final void destroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/andrerinas/openheadunit/connection/CommManager$Companion;", "", "()V", "ERROR_HANDSHAKE_PEER_SILENT", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    /**
     * Represents the lifecycle state of the Android Auto connection.
     *
     * State transitions are strictly sequential — see the class-level diagram.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState;", "", "()V", "Connected", "Connecting", "Disconnected", "Error", "HandshakeComplete", "StartingTransport", "TransportStarted", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState$Connected;", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState$Connecting;", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState$Disconnected;", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState$Error;", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState$HandshakeComplete;", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState$StartingTransport;", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState$TransportStarted;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static abstract class ConnectionState {
        
        private ConnectionState() {
            super();
        }
        
        /**
         * Physical connection established; AAP handshake not yet started.
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState$Connected;", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Connected extends com.andrerinas.openheadunit.connection.CommManager.ConnectionState {
            @org.jetbrains.annotations.NotNull()
            public static final com.andrerinas.openheadunit.connection.CommManager.ConnectionState.Connected INSTANCE = null;
            
            private Connected() {
            }
        }
        
        /**
         * Physical connection handshake in progress (USB open or TCP connect).
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState$Connecting;", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Connecting extends com.andrerinas.openheadunit.connection.CommManager.ConnectionState {
            @org.jetbrains.annotations.NotNull()
            public static final com.andrerinas.openheadunit.connection.CommManager.ConnectionState.Connecting INSTANCE = null;
            
            private Connecting() {
            }
        }
        
        /**
         * No active connection.
         * @param isClean `true` if the phone sent a graceful `ByeByeRequest` before closing;
         *               `false` for all other disconnect causes (USB detach, read error,
         *               socket timeout, explicit user disconnect).
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState$Disconnected;", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState;", "isClean", "", "isUserExit", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Disconnected extends com.andrerinas.openheadunit.connection.CommManager.ConnectionState {
            private final boolean isClean = false;
            private final boolean isUserExit = false;
            
            public Disconnected(boolean isClean, boolean isUserExit) {
            }
            
            public final boolean isClean() {
                return false;
            }
            
            public final boolean isUserExit() {
                return false;
            }
            
            public Disconnected() {
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean component2() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.andrerinas.openheadunit.connection.CommManager.ConnectionState.Disconnected copy(boolean isClean, boolean isUserExit) {
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
        
        /**
         * A non-fatal error occurred. The manager transitions to [Disconnected] immediately after.
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState$Error;", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Error extends com.andrerinas.openheadunit.connection.CommManager.ConnectionState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String message = null;
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMessage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.andrerinas.openheadunit.connection.CommManager.ConnectionState.Error copy(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
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
        
        /**
         * SSL handshake complete;
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState$HandshakeComplete;", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class HandshakeComplete extends com.andrerinas.openheadunit.connection.CommManager.ConnectionState {
            @org.jetbrains.annotations.NotNull()
            public static final com.andrerinas.openheadunit.connection.CommManager.ConnectionState.HandshakeComplete INSTANCE = null;
            
            private HandshakeComplete() {
            }
        }
        
        /**
         * AAP SSL handshake in progress.
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState$StartingTransport;", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class StartingTransport extends com.andrerinas.openheadunit.connection.CommManager.ConnectionState {
            @org.jetbrains.annotations.NotNull()
            public static final com.andrerinas.openheadunit.connection.CommManager.ConnectionState.StartingTransport INSTANCE = null;
            
            private StartingTransport() {
            }
        }
        
        /**
         * AAP handshake complete; the transport is ready to send and receive messages.
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState$TransportStarted;", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class TransportStarted extends com.andrerinas.openheadunit.connection.CommManager.ConnectionState {
            @org.jetbrains.annotations.NotNull()
            public static final com.andrerinas.openheadunit.connection.CommManager.ConnectionState.TransportStarted INSTANCE = null;
            
            private TransportStarted() {
            }
        }
    }
}