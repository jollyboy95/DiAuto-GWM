package com.andrerinas.openheadunit.aap;

/**
 * Core AAP message pump.
 *
 * Owns two [HandlerThread]s:
 * - **Send** (`AapTransport:Handler::Send`) — encrypts and delivers outbound messages.
 * - **Poll** (`AapTransport:Handler::Poll`) — reads, decrypts, and dispatches inbound messages.
 *
 * Lifecycle: [startHandshake] → [startReading] → message loop → [stop]/[quit].
 *
 * @param audioDecoder Decodes PCM audio received from the phone.
 * @param videoDecoder Decodes H.264/H.265 video received from the phone.
 * @param audioManager Used to request and release audio focus.
 * @param settings User preferences (SSL mode, key mappings, microphone sample rate, …).
 * @param notification Background notification handle; updated as connection state changes.
 * @param context Application context; used for broadcasts and system services.
 * @param onAaMediaMetadata Optional callback when the phone sends media metadata (now-playing).
 * @param onAaPlaybackStatus Optional callback when the phone sends playback status/position.
 * @param externalSsl Optional singleton [AapSslContext] whose internal [javax.net.ssl.SSLContext]
 *  (and its `ClientSessionContext` session cache) survives across [AapTransport] recreations.
 *  When provided, JSSE can resume the previous TLS session on reconnect, skipping 4–6
 *  round-trips and saving 1–3 s of handshake time. Pass `null` to create a fresh
 *  [AapSslContext] per transport (no session resumption).
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00fa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 \u00b7\u00012\u00020\u0001:\u0004\u00b7\u0001\u00b8\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0002\u0010\u0016J\r\u0010}\u001a\u00020\"H\u0000\u00a2\u0006\u0002\b~J\u000e\u0010\u007f\u001a\u00020\u0011H\u0000\u00a2\u0006\u0003\b\u0080\u0001J\t\u0010\u0081\u0001\u001a\u00020\u0011H\u0002J\u000f\u0010\u0082\u0001\u001a\u00020\u0011H\u0000\u00a2\u0006\u0003\b\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\"2\u0006\u0010*\u001a\u00020+H\u0002J\u000f\u0010\u0085\u0001\u001a\u00020\"H\u0000\u00a2\u0006\u0003\b\u0086\u0001J\u0018\u0010\u0087\u0001\u001a\u00020\"2\u0007\u0010\u0088\u0001\u001a\u00020.H\u0000\u00a2\u0006\u0003\b\u0089\u0001J\u0012\u0010\u008a\u0001\u001a\u00020\u00112\u0007\u0010\u008b\u0001\u001a\u00020.H\u0002J\u000f\u0010\u008c\u0001\u001a\u00020\u0011H\u0000\u00a2\u0006\u0003\b\u008d\u0001J\t\u0010\u008e\u0001\u001a\u00020\u0011H\u0002J\u000f\u0010\u008f\u0001\u001a\u00020\u0011H\u0000\u00a2\u0006\u0003\b\u0090\u0001J\u001c\u0010\u0091\u0001\u001a\u00020\u00112\b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0094\u0001\u001a\u00020.H\u0016J\u001a\u0010\u0095\u0001\u001a\u00020\u00112\t\b\u0002\u0010\u0096\u0001\u001a\u00020\"H\u0000\u00a2\u0006\u0003\b\u0097\u0001J\t\u0010\u0098\u0001\u001a\u00020\u0011H\u0002J\u000f\u0010\u0099\u0001\u001a\u00020\u0011H\u0000\u00a2\u0006\u0003\b\u009a\u0001J\u0011\u0010\u009b\u0001\u001a\u00020\u00112\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001J\u0011\u0010\u009b\u0001\u001a\u00020\"2\b\u0010\u009e\u0001\u001a\u00030\u009f\u0001J\u0019\u0010\u009b\u0001\u001a\u00020\u00112\u0007\u0010\u00a0\u0001\u001a\u00020.2\u0007\u0010\u00a1\u0001\u001a\u00020\"J\u001c\u0010\u00a2\u0001\u001a\u00020.2\b\u0010\u00a3\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u00a4\u0001\u001a\u00020.H\u0002J\u000f\u0010\u00a5\u0001\u001a\u00020\u0011H\u0000\u00a2\u0006\u0003\b\u00a6\u0001J\u0018\u0010\u00a7\u0001\u001a\u00020\u00112\u0007\u0010\u0088\u0001\u001a\u00020.H\u0000\u00a2\u0006\u0003\b\u00a8\u0001J!\u0010\u00a9\u0001\u001a\u00020\u00112\u0007\u0010\u0088\u0001\u001a\u00020.2\u0007\u0010\u00aa\u0001\u001a\u00020.H\u0000\u00a2\u0006\u0003\b\u00ab\u0001J\u0017\u0010\u00ac\u0001\u001a\u00020\"2\u0006\u0010*\u001a\u00020+H\u0000\u00a2\u0006\u0003\b\u00ad\u0001J\u000f\u0010\u00ae\u0001\u001a\u00020\u0011H\u0000\u00a2\u0006\u0003\b\u00af\u0001J\u0018\u0010\u00b0\u0001\u001a\u00020\u00112\u0007\u0010\u00b1\u0001\u001a\u00020.H\u0000\u00a2\u0006\u0003\b\u00b2\u0001J\u000f\u0010\u00b3\u0001\u001a\u00020\u0011H\u0000\u00a2\u0006\u0003\b\u00b4\u0001J\u0012\u0010\u00b5\u0001\u001a\u00020\u00112\u0007\u0010\u00b6\u0001\u001a\u00020\"H\u0002R\u0014\u0010\u0017\u001a\u00020\u0018X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001eX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020\u001e8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b$\u0010 R\u0014\u0010\'\u001a\u00020\"8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00104\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010)\"\u0004\b6\u00107R\u0011\u00108\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\b8\u0010)R\u001a\u00109\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010)\"\u0004\b:\u00107R\u001a\u0010;\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010)\"\u0004\b<\u00107R\u0011\u0010=\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\b=\u0010)R\u001a\u0010>\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0?X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010D\u001a\u00020C2\u0006\u0010B\u001a\u00020C@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u001e\u0010G\u001a\u00020A2\u0006\u0010B\u001a\u00020A@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u000e\u0010J\u001a\u00020AX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020AX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020MX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020PX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020RX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR(\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010WR\"\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\\X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0010\u0010a\u001a\u0004\u0018\u00010bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010e\u001a\u0004\u0018\u00010fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020AX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u000200X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010k\u001a\u0004\u0018\u00010bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010m\u001a\u0004\u0018\u00010fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020oX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0011\u0010r\u001a\u00020s\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0014\u0010v\u001a\b\u0012\u0004\u0012\u00020.0wX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u000200X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020AX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010z\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010)\"\u0004\b|\u00107\u00a8\u0006\u00b9\u0001"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapTransport;", "Lcom/andrerinas/openheadunit/decoder/MicRecorder$Listener;", "audioDecoder", "Lcom/andrerinas/openheadunit/decoder/AudioDecoder;", "videoDecoder", "Lcom/andrerinas/openheadunit/decoder/VideoDecoder;", "audioManager", "Landroid/media/AudioManager;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "notification", "Lcom/andrerinas/openheadunit/main/BackgroundNotification;", "context", "Landroid/content/Context;", "onAaMediaMetadata", "Lkotlin/Function1;", "Lcom/andrerinas/openheadunit/aap/protocol/proto/MediaPlayback$MediaMetaData;", "", "onAaPlaybackStatus", "Lcom/andrerinas/openheadunit/aap/protocol/proto/MediaPlayback$MediaPlaybackStatus;", "externalSsl", "Lcom/andrerinas/openheadunit/aap/AapSslContext;", "(Lcom/andrerinas/openheadunit/decoder/AudioDecoder;Lcom/andrerinas/openheadunit/decoder/VideoDecoder;Landroid/media/AudioManager;Lcom/andrerinas/openheadunit/utils/Settings;Lcom/andrerinas/openheadunit/main/BackgroundNotification;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/andrerinas/openheadunit/aap/AapSslContext;)V", "aapAudio", "Lcom/andrerinas/openheadunit/aap/AapAudio;", "getAapAudio$com_andrerinas_headunitrevived_0_3_12_githubDebug", "()Lcom/andrerinas/openheadunit/aap/AapAudio;", "aapRead", "Lcom/andrerinas/openheadunit/aap/AapRead;", "aapVideo", "Lcom/andrerinas/openheadunit/aap/AapVideo;", "getAapVideo$com_andrerinas_headunitrevived_0_3_12_githubDebug", "()Lcom/andrerinas/openheadunit/aap/AapVideo;", "clusterFocusPending", "", "clusterVideo", "getClusterVideo$com_andrerinas_headunitrevived_0_3_12_githubDebug", "clusterVideo$delegate", "Lkotlin/Lazy;", "clusterVideoUsed", "getClusterVideoUsed", "()Z", "connection", "Lcom/andrerinas/openheadunit/connection/AccessoryConnection;", "droppedSensorEvents", "Ljava/util/HashMap;", "", "focusCycleGainRunnable", "Ljava/lang/Runnable;", "focusCycleLever", "Lcom/andrerinas/openheadunit/aap/FocusCycleLever;", "focusCyclesUsedThisSession", "ignoreNextStopRequest", "getIgnoreNextStopRequest", "setIgnoreNextStopRequest", "(Z)V", "isAlive", "isAssistantActive", "setAssistantActive", "isQuittingAllowed", "setQuittingAllowed", "isWireless", "keyCodes", "", "lastFocusCycleMs", "", "<set-?>", "Lcom/andrerinas/openheadunit/aap/AapTransport$HandshakeFailure;", "lastHandshakeFailure", "getLastHandshakeFailure", "()Lcom/andrerinas/openheadunit/aap/AapTransport$HandshakeFailure;", "lastMessageReceivedMs", "getLastMessageReceivedMs", "()J", "lastSensorDropLogMs", "lastWireCorruptionMs", "linkGapMonitor", "Lcom/andrerinas/openheadunit/aap/LinkGapMonitor;", "mainVideoStreaming", "micRecorder", "Lcom/andrerinas/openheadunit/decoder/MicRecorder;", "modeManager", "Landroid/app/UiModeManager;", "onAudioFocusStateChanged", "getOnAudioFocusStateChanged", "()Lkotlin/jvm/functions/Function1;", "setOnAudioFocusStateChanged", "(Lkotlin/jvm/functions/Function1;)V", "onQuit", "getOnQuit", "setOnQuit", "onUpdateUiConfigReplyReceived", "Lkotlin/Function0;", "getOnUpdateUiConfigReplyReceived", "()Lkotlin/jvm/functions/Function0;", "setOnUpdateUiConfigReplyReceived", "(Lkotlin/jvm/functions/Function0;)V", "pollHandler", "Landroid/os/Handler;", "pollHandlerCallback", "Landroid/os/Handler$Callback;", "pollThread", "Landroid/os/HandlerThread;", "quietHoldLastLogMs", "quietHoldReports", "quietHoldSuppressed", "releaseClusterFocusRunnable", "sendHandler", "sendHandlerCallback", "sendThread", "sessionIds", "Landroid/util/SparseIntArray;", "getSettings$com_andrerinas_headunitrevived_0_3_12_githubDebug", "()Lcom/andrerinas/openheadunit/utils/Settings;", "ssl", "Lcom/andrerinas/openheadunit/aap/AapSsl;", "getSsl", "()Lcom/andrerinas/openheadunit/aap/AapSsl;", "startedSensors", "Ljava/util/HashSet;", "unrepairedCheckRunnable", "unrepairedSinceMs", "wasUserExit", "getWasUserExit", "setWasUserExit", "beginFocusCycle", "beginFocusCycle$com_andrerinas_headunitrevived_0_3_12_githubDebug", "endFocusCycle", "endFocusCycle$com_andrerinas_headunitrevived_0_3_12_githubDebug", "escalateIfStillUnrepaired", "gainVideoFocus", "gainVideoFocus$com_andrerinas_headunitrevived_0_3_12_githubDebug", "handshake", "hasVideoSurface", "hasVideoSurface$com_andrerinas_headunitrevived_0_3_12_githubDebug", "isChannelStarted", "channel", "isChannelStarted$com_andrerinas_headunitrevived_0_3_12_githubDebug", "noteDroppedSensorEvent", "sensorType", "noteMessageReceived", "noteMessageReceived$com_andrerinas_headunitrevived_0_3_12_githubDebug", "onKeyframeRepairedPicture", "onMainVideoData", "onMainVideoData$com_andrerinas_headunitrevived_0_3_12_githubDebug", "onMicDataAvailable", "mic_buf", "", "mic_audio_len", "quit", "clean", "quit$com_andrerinas_headunitrevived_0_3_12_githubDebug", "releaseClusterFocus", "requestClusterFocus", "requestClusterFocus$com_andrerinas_headunitrevived_0_3_12_githubDebug", "send", "message", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "sensor", "Lcom/andrerinas/openheadunit/aap/protocol/messages/SensorEvent;", "keyCode", "isPress", "sendEncryptedMessage", "data", "length", "sendKeyframeCycleRelease", "sendKeyframeCycleRelease$com_andrerinas_headunitrevived_0_3_12_githubDebug", "sendMediaAck", "sendMediaAck$com_andrerinas_headunitrevived_0_3_12_githubDebug", "setSessionId", "sessionId", "setSessionId$com_andrerinas_headunitrevived_0_3_12_githubDebug", "startHandshake", "startHandshake$com_andrerinas_headunitrevived_0_3_12_githubDebug", "startReading", "startReading$com_andrerinas_headunitrevived_0_3_12_githubDebug", "startSensor", "type", "startSensor$com_andrerinas_headunitrevived_0_3_12_githubDebug", "stop", "stop$com_andrerinas_headunitrevived_0_3_12_githubDebug", "triggerFocusCycleRecovery", "escalatable", "Companion", "HandshakeFailure", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapTransport implements com.andrerinas.openheadunit.decoder.MicRecorder.Listener {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.decoder.VideoDecoder videoDecoder = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.main.BackgroundNotification notification = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function1<com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData, kotlin.Unit> onAaMediaMetadata = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function1<com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaPlaybackStatus, kotlin.Unit> onAaPlaybackStatus = null;
    @org.jetbrains.annotations.Nullable()
    private final com.andrerinas.openheadunit.aap.AapSslContext externalSsl = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapSsl ssl = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapAudio aapAudio = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapVideo aapVideo = null;
    
    /**
     * The dashboard stream. Lost or broken frames ask the phone for a fresh keyframe with an
     * unsolicited focus notification on that channel only, never the main screen's recovery.
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy clusterVideo$delegate = null;
    
    /**
     * Dashboard focus is held until the main screen is streaming. Granted during the handshake, the
     * phone can start the dashboard stream first and leave the main screen on "Android Auto is
     * starting" for good, so it is only released once main video data has been arriving for
     * [CLUSTER_FOCUS_DELAY_MS] (LIVI holds it the same way, until the first main frame).
     */
    private boolean clusterFocusPending = false;
    private boolean mainVideoStreaming = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable releaseClusterFocusRunnable = null;
    @org.jetbrains.annotations.Nullable()
    private android.os.HandlerThread sendThread;
    @org.jetbrains.annotations.Nullable()
    private android.os.HandlerThread pollThread;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.decoder.MicRecorder micRecorder = null;
    @org.jetbrains.annotations.NotNull()
    private final android.util.SparseIntArray sessionIds = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashSet<java.lang.Integer> startedSensors = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<java.lang.Integer, java.lang.Integer> droppedSensorEvents = null;
    private long lastSensorDropLogMs = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Integer, java.lang.Integer> keyCodes = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.UiModeManager modeManager = null;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.connection.AccessoryConnection connection;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.aap.AapRead aapRead;
    private boolean isQuittingAllowed = false;
    private boolean ignoreNextStopRequest = false;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.NotNull()
    private volatile com.andrerinas.openheadunit.aap.AapTransport.HandshakeFailure lastHandshakeFailure = com.andrerinas.openheadunit.aap.AapTransport.HandshakeFailure.NONE;
    
    /**
     * Set by [AapControl] when VIDEO_FOCUS_NATIVE triggers a stop (user tapped Exit).
     */
    @kotlin.jvm.Volatile()
    private volatile boolean wasUserExit = false;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onQuit;
    private boolean isAssistantActive = false;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onAudioFocusStateChanged;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onUpdateUiConfigReplyReceived;
    @org.jetbrains.annotations.Nullable()
    private android.os.Handler pollHandler;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler.Callback pollHandlerCallback = null;
    @org.jetbrains.annotations.Nullable()
    private android.os.Handler sendHandler;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler.Callback sendHandlerCallback = null;
    
    /**
     * When the phone last said anything at all, on any channel. Zero until it has.
     *
     * The picture stopping and the link dying look identical if the only thing being measured is
     * frames: Android Auto sends no video while nothing on screen animates, so a paused full-screen
     * music player is indistinguishable from a dead socket to anything watching the decoder. This is
     * the signal that separates them - control, sensor, media-playback and audio traffic all keep
     * flowing while the picture is legitimately still.
     *
     * Written from the poll thread, read from the main thread by the projection watchdog.
     */
    @kotlin.jvm.Volatile()
    private volatile long lastMessageReceivedMs = 0L;
    
    /**
     * How long the link goes silent, and how often. Fed from the same funnel as
     * [lastMessageReceivedMs], because "the phone said something" is exactly the event it measures.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.LinkGapMonitor linkGapMonitor = null;
    private long unrepairedSinceMs = 0L;
    private int focusCyclesUsedThisSession = 0;
    private long lastFocusCycleMs = 0L;
    
    /**
     * When an access unit last arrived broken on the wire, as opposed to when the decoder last had
     * no picture. Zero until the first one. Session state like the two fields above, and reset the
     * same way they are - by the transport being torn down and rebuilt.
     */
    private long lastWireCorruptionMs = 0L;
    
    /**
     * Print budget for the held-cycle line, in the shape [AuditReportPolicy] already governs.
     *
     * A hold is re-checked every [KeyframeCycleEscalationPolicy.ESCALATE_AFTER_UNREPAIRED_MS], which
     * has to stay short so a reserved cycle lands promptly once the wire settles. The last cycle of
     * a session holds without a ceiling, so that check can repeat for minutes - a hundred identical
     * lines across the injection run that motivated the reserve. Reset when the unrepaired clock
     * arms, not when a cycle fires: one broken stretch is one story, and it can hold, cycle and hold
     * again inside itself. What the reset guarantees is that the *first* line of every new stretch
     * prints, which is the one a rig round reads.
     */
    private int quietHoldReports = 0;
    private long quietHoldLastLogMs = 0L;
    private int quietHoldSuppressed = 0;
    
    /**
     * The one claim on the release/regain cycle, shared with the projection activity's escalation.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.FocusCycleLever focusCycleLever = null;
    
    /**
     * Second half of an escalated focus cycle - see [WarmRelaunchKeyframePolicy.FOCUS_CYCLE_GAP_MS].
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable focusCycleGainRunnable = null;
    
    /**
     * Armed by the first shed frame of an unrepaired stretch, cancelled by the keyframe that repairs
     * it. This is what makes the escalation reachable at all: recovery requests are throttled to one
     * a second, so a single dropped frame produces exactly one call into
     * [triggerFocusCycleRecovery] - anything that escalated on a *count* of calls could never fire
     * for the one-lost-frame case the fix exists for.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable unrepairedCheckRunnable = null;
    private static final int MSG_POLL = 1;
    private static final int MSG_SEND = 2;
    private static final long HANDSHAKE_TIMEOUT_MS = 10000L;
    private static final long SENSOR_DROP_LOG_INTERVAL_MS = 30000L;
    private static final long CLUSTER_FOCUS_DELAY_MS = 1500L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.AapTransport.Companion Companion = null;
    
    public AapTransport(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.decoder.AudioDecoder audioDecoder, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.decoder.VideoDecoder videoDecoder, @org.jetbrains.annotations.NotNull()
    android.media.AudioManager audioManager, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.main.BackgroundNotification notification, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData, kotlin.Unit> onAaMediaMetadata, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaPlaybackStatus, kotlin.Unit> onAaPlaybackStatus, @org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.aap.AapSslContext externalSsl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.utils.Settings getSettings$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.AapSsl getSsl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.AapAudio getAapAudio$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.AapVideo getAapVideo$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
        return null;
    }
    
    /**
     * The dashboard stream. Lost or broken frames ask the phone for a fresh keyframe with an
     * unsolicited focus notification on that channel only, never the main screen's recovery.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.AapVideo getClusterVideo$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
        return null;
    }
    
    private final boolean getClusterVideoUsed() {
        return false;
    }
    
    public final boolean isQuittingAllowed() {
        return false;
    }
    
    public final void setQuittingAllowed(boolean p0) {
    }
    
    public final boolean isWireless() {
        return false;
    }
    
    public final boolean getIgnoreNextStopRequest() {
        return false;
    }
    
    public final void setIgnoreNextStopRequest(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.AapTransport.HandshakeFailure getLastHandshakeFailure() {
        return null;
    }
    
    /**
     * Set by [AapControl] when VIDEO_FOCUS_NATIVE triggers a stop (user tapped Exit).
     */
    public final boolean getWasUserExit() {
        return false;
    }
    
    /**
     * Set by [AapControl] when VIDEO_FOCUS_NATIVE triggers a stop (user tapped Exit).
     */
    public final void setWasUserExit(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnQuit() {
        return null;
    }
    
    public final void setOnQuit(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> p0) {
    }
    
    public final boolean isAssistantActive() {
        return false;
    }
    
    public final void setAssistantActive(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnAudioFocusStateChanged() {
        return null;
    }
    
    public final void setOnAudioFocusStateChanged(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnUpdateUiConfigReplyReceived() {
        return null;
    }
    
    public final void setOnUpdateUiConfigReplyReceived(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    public final boolean isAlive() {
        return false;
    }
    
    /**
     * When the phone last said anything at all, on any channel. Zero until it has.
     *
     * The picture stopping and the link dying look identical if the only thing being measured is
     * frames: Android Auto sends no video while nothing on screen animates, so a paused full-screen
     * music player is indistinguishable from a dead socket to anything watching the decoder. This is
     * the signal that separates them - control, sensor, media-playback and audio traffic all keep
     * flowing while the picture is legitimately still.
     *
     * Written from the poll thread, read from the main thread by the projection watchdog.
     */
    public final long getLastMessageReceivedMs() {
        return 0L;
    }
    
    /**
     * Called for every decrypted inbound message, from [AapMessageHandlerType.handle].
     */
    public final void noteMessageReceived$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
    }
    
    /**
     * Takes the lever for one cycle. False when the other escalation already holds it.
     */
    public final boolean beginFocusCycle$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
        return false;
    }
    
    /**
     * Sends the first half of a keyframe cycle.
     *
     * Both escalations go through here, so the release and the [ignoreNextStopRequest] that marks
     * its answering sink stop as expected are written once rather than in two places that have to
     * stay in step.
     */
    public final void sendKeyframeCycleRelease$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
    }
    
    /**
     * Hands the lever back. Idempotent - see [FocusCycleLever.release].
     */
    public final void endFocusCycle$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
    }
    
    /**
     * Asks the phone for a fresh keyframe with a gain-only nudge, and starts the clock that decides
     * whether the nudge was enough.
     *
     * The nudge is measured inert across three hardware rounds - see [KeyframeCycleEscalationPolicy]
     * for the numbers - but it costs one message, does not disturb the running stream the way a
     * release can, and has only ever been tested against one phone. It stays the first response.
     *
     * @param escalatable whether this caller's stream is live enough to earn a focus release if the
     *  nudge goes unanswered. True for the dropped-frame path, which is gated on the decoder having
     *  rendered, and for both decoder paths - a rebuilt or keyframe-starved codec is the case where
     *  the picture is most certainly gone and least able to come back on its own. That last pair
     *  used to pass false, on the grounds that a rebuild belongs to [WarmRelaunchKeyframePolicy]'s
     *  window and two deciders must not reach for the same lever. The lever now has one owner
     *  ([com.andrerinas.openheadunit.connection.CommManager.releaseVideoFocusForKeyframe]), so the
     *  overlap is refused rather than argued about, and the ordering still favours the surface path:
     *  it escalates at 850ms against this one's 2000ms.
     *  [AapVideo]'s corruption path stays false only because it has no rendered-frame signal to
     *  gate on.
     */
    @kotlin.jvm.Synchronized()
    private final synchronized void triggerFocusCycleRecovery(boolean escalatable) {
    }
    
    /**
     * The picture has been broken for [KeyframeCycleEscalationPolicy.ESCALATE_AFTER_UNREPAIRED_MS]
     * and no keyframe has arrived to repair it. Spend a cycle if the budget allows and the wire has
     * settled - a cycle spent while frames are still arriving broken buys a keyframe that arrives
     * broken too, and stamps the cooldown that then holds off the one that would have worked.
     */
    @kotlin.jvm.Synchronized()
    private final synchronized void escalateIfStillUnrepaired() {
    }
    
    /**
     * A keyframe produced a picture, so whatever was broken is repaired. Stops the clock and
     * disarms the escalation.
     *
     * The signal is the decoder's output, not its input: an access unit that lost a fragment in the
     * middle still scans as a keyframe and is fed like one, and cancelling the escalation on that
     * left a sustained-loss stream with nothing able to ask for a keyframe it could actually decode.
     *
     * Runs on the decoder's output thread. Everything it touches is this object's own state and it
     * never waits on the decoder, which is what keeps it clear of [VideoDecoder.stop] - that holds
     * the decoder's monitor while joining the very thread this runs on.
     */
    @kotlin.jvm.Synchronized()
    private final synchronized void onKeyframeRepairedPicture() {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void startSensor$com_andrerinas_headunitrevived_0_3_12_githubDebug(int type) {
    }
    
    private final int sendEncryptedMessage(byte[] data, int length) {
        return 0;
    }
    
    public final void stop$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
    }
    
    public final void quit$com_andrerinas_headunitrevived_0_3_12_githubDebug(boolean clean) {
    }
    
    /**
     * Phase 1 of startup: creates the send/poll threads and runs the SSL handshake.
     *
     * Returns `true` on success. On failure, threads are stopped via [quit] before returning.
     * Must be followed by [startReading] (called after the projection surface is ready)
     * to actually start the message loop.
     */
    public final boolean startHandshake$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.connection.AccessoryConnection connection) {
        return false;
    }
    
    /**
     * Phase 2 of startup: creates [AapRead] and posts the first [MSG_POLL] to begin the
     * inbound message loop.
     *
     * Must only be called after [startHandshake] has returned `true` **and** after the
     * projection surface has been set on the [VideoDecoder]. This guarantees that no video
     * frame is ever decoded before a render target exists.
     */
    public final void startReading$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
    }
    
    private final boolean handshake(com.andrerinas.openheadunit.connection.AccessoryConnection connection) {
        return false;
    }
    
    public final void send(int keyCode, boolean isPress) {
    }
    
    public final boolean send(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.protocol.messages.SensorEvent sensor) {
        return false;
    }
    
    /**
     * A dropped sensor event is worth knowing about once, not once per event. LOCATION resends on
     * a timer for the whole session, so logging every drop would bury everything else in a log a
     * reporter attaches to an issue. Report the first drop of a type straight away, then a running
     * count at most every [SENSOR_DROP_LOG_INTERVAL_MS] for as long as it keeps happening.
     */
    @kotlin.jvm.Synchronized()
    private final synchronized void noteDroppedSensorEvent(int sensorType) {
    }
    
    public final void send(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapMessage message) {
    }
    
    /**
     * Whether the main projection surface is up, so the phone may be told to project now.
     */
    public final boolean hasVideoSurface$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
        return false;
    }
    
    public final void gainVideoFocus$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
    }
    
    public final void sendMediaAck$com_andrerinas_headunitrevived_0_3_12_githubDebug(int channel) {
    }
    
    public final void setSessionId$com_andrerinas_headunitrevived_0_3_12_githubDebug(int channel, int sessionId) {
    }
    
    /**
     * Whether the phone has started a media session on [channel] in this connection.
     */
    public final boolean isChannelStarted$com_andrerinas_headunitrevived_0_3_12_githubDebug(int channel) {
        return false;
    }
    
    /**
     * The phone set up the dashboard sink: grant it focus now, or once the main screen streams.
     */
    @kotlin.jvm.Synchronized()
    public final synchronized void requestClusterFocus$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
    }
    
    /**
     * Main-screen video arrived. The first time, schedules the held dashboard focus.
     */
    public final void onMainVideoData$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
    }
    
    @kotlin.jvm.Synchronized()
    private final synchronized void releaseClusterFocus() {
    }
    
    @java.lang.Override()
    public void onMicDataAvailable(@org.jetbrains.annotations.NotNull()
    byte[] mic_buf, int mic_audio_len) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapTransport$Companion;", "", "()V", "CLUSTER_FOCUS_DELAY_MS", "", "HANDSHAKE_TIMEOUT_MS", "MSG_POLL", "", "MSG_SEND", "SENSOR_DROP_LOG_INTERVAL_MS", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    /**
     * Why the last [startHandshake] failed, for callers that report it.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapTransport$HandshakeFailure;", "", "(Ljava/lang/String;I)V", "NONE", "PEER_SILENT", "OTHER", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum HandshakeFailure {
        /*public static final*/ NONE /* = new NONE() */,
        /*public static final*/ PEER_SILENT /* = new PEER_SILENT() */,
        /*public static final*/ OTHER /* = new OTHER() */;
        
        HandshakeFailure() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.AapTransport.HandshakeFailure> getEntries() {
            return null;
        }
    }
}