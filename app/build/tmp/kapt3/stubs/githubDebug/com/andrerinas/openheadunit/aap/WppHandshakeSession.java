package com.andrerinas.openheadunit.aap;

/**
 * The Android Auto wireless handshake, as a state machine with no Android in it.
 *
 * The exchange this models is the modern one, cross-checked against aa-proxy-rs's reference dongle
 * and the OEM ZLink app:
 *
 * ```
 *  HU -> 4 WifiVersionRequest        (optional; real head units send it, aa-proxy's dongle does not)
 *  HU <- 5 WifiVersionResponse
 *  HU -> 1 WifiStartRequest
 *  HU <- 2 WifiInfoRequest
 *  HU -> 3 WifiInfoResponse          credentials
 *  HU <- 7 WifiStartResponse         acknowledgement
 *  HU <- 6 WifiConnectStatus         did the phone actually get on the network
 * ```
 *
 * What this replaces sent 1, read one message, sent 3 and stopped listening. Types 6 and 7 arrive
 * *after* type 3, so it never saw them — hence no way to tell "still associating" from "gave up",
 * and a timer where the phone was willing to say.
 *
 * Pure so the ordering rules can be tested; they cannot be, on a real Bluetooth socket. Not
 * thread-safe: one session per handshake coroutine.
 *
 * @param versionExchangeEnabled whether to open with [WppMessageType.VERSION_REQUEST]. False sends
 *  exactly what shipped before it existed.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\r\u0010\u0015\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0003H\u0002J\u0017\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\u0003J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\"\u001a\u00020#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\"\u001a\u00020#H\u0002J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\"\u001a\u00020#H\u0002J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\"\u001a\u00020#H\u0002J\u0016\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\"\u001a\u00020#H\u0002J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppHandshakeSession;", "", "versionExchangeEnabled", "", "(Z)V", "credentialsLatched", "<set-?>", "", "messagesReceived", "getMessagesReceived", "()I", "pendingInfoRequest", "settleBudgetMs", "", "Lcom/andrerinas/openheadunit/aap/WppStage;", "stage", "getStage", "()Lcom/andrerinas/openheadunit/aap/WppStage;", "credentialsBecameAvailable", "", "Lcom/andrerinas/openheadunit/aap/WppAction;", "currentStageTimeoutMs", "()Ljava/lang/Long;", "enterAwaitCredentials", "extendSettle", "fail", "reason", "", "wifiJoinFailed", "isFailureStatus", "status", "(Ljava/lang/Integer;)Z", "isTerminal", "on", "event", "Lcom/andrerinas/openheadunit/aap/WppEvent;", "onAwaitCredentials", "onAwaitInfoRequest", "onAwaitVersion", "onNew", "onSettling", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class WppHandshakeSession {
    private final boolean versionExchangeEnabled = false;
    
    /**
     * How long to wait for the phone's version response before carrying on without it.
     * Short on purpose: it must not eat into the phone's own ~12 s first-message budget.
     */
    public static final long VERSION_RESPONSE_TIMEOUT_MS = 3000L;
    
    /**
     * How long the phone has to ask for credentials after [WppMessageType.START_REQUEST].
     * Unchanged from the value this replaces.
     */
    public static final long INFO_REQUEST_TIMEOUT_MS = 15000L;
    
    /**
     * How much longer to wait each time the phone says it is still joining.
     */
    public static final long SETTLE_EXTENSION_MS = 15000L;
    
    /**
     * Our protocol version. A guess — no capture of a real head unit's Type 4 has been
     * decoded — which is why the setting that sends it is off by default.
     */
    public static final int WPP_VERSION_MAJOR = 1;
    public static final int WPP_VERSION_MINOR = 1;
    @org.jetbrains.annotations.NotNull()
    private com.andrerinas.openheadunit.aap.WppStage stage = com.andrerinas.openheadunit.aap.WppStage.NEW;
    
    /**
     * How many messages the phone has sent. Zero at the end of a handshake means the phone never
     * answered anything, which is what the backoff in `NativeAaHandshakeManager` counts.
     */
    private int messagesReceived = 0;
    
    /**
     * The phone asked for credentials before we were ready to send them.
     */
    private boolean pendingInfoRequest = false;
    
    /**
     * Credentials arrived while we were still waiting on the version response.
     */
    private boolean credentialsLatched = false;
    
    /**
     * Total time allowed in [WppStage.SETTLING], grown by [WppAction.ExtendSettle].
     */
    private long settleBudgetMs = 45000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.WppHandshakeSession.Companion Companion = null;
    
    public WppHandshakeSession(boolean versionExchangeEnabled) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.WppStage getStage() {
        return null;
    }
    
    /**
     * How many messages the phone has sent. Zero at the end of a handshake means the phone never
     * answered anything, which is what the backoff in `NativeAaHandshakeManager` counts.
     */
    public final int getMessagesReceived() {
        return 0;
    }
    
    /**
     * How long the current stage may last before its timeout event is due, or null when the stage
     * has no deadline of its own. Measured from when the stage was entered; re-read it after every
     * [on] call, since [WppAction.ExtendSettle] grows it.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long currentStageTimeoutMs() {
        return null;
    }
    
    /**
     * True once the exchange is over, either way.
     */
    public final boolean isTerminal() {
        return false;
    }
    
    /**
     * Feed [event] in and get back what to do about it, in order. Safe to call after the session
     * has finished: a terminal session ignores everything and returns nothing.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.andrerinas.openheadunit.aap.WppAction> on(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.WppEvent event) {
        return null;
    }
    
    private final java.util.List<com.andrerinas.openheadunit.aap.WppAction> onNew(com.andrerinas.openheadunit.aap.WppEvent event) {
        return null;
    }
    
    private final java.util.List<com.andrerinas.openheadunit.aap.WppAction> onAwaitVersion(com.andrerinas.openheadunit.aap.WppEvent event) {
        return null;
    }
    
    private final java.util.List<com.andrerinas.openheadunit.aap.WppAction> onAwaitCredentials(com.andrerinas.openheadunit.aap.WppEvent event) {
        return null;
    }
    
    private final java.util.List<com.andrerinas.openheadunit.aap.WppAction> onAwaitInfoRequest(com.andrerinas.openheadunit.aap.WppEvent event) {
        return null;
    }
    
    private final java.util.List<com.andrerinas.openheadunit.aap.WppAction> onSettling(com.andrerinas.openheadunit.aap.WppEvent event) {
        return null;
    }
    
    /**
     * Enter [WppStage.AWAIT_CREDENTIALS], acting immediately if the credentials already landed.
     */
    private final java.util.List<com.andrerinas.openheadunit.aap.WppAction> enterAwaitCredentials() {
        return null;
    }
    
    private final java.util.List<com.andrerinas.openheadunit.aap.WppAction> credentialsBecameAvailable() {
        return null;
    }
    
    private final java.util.List<com.andrerinas.openheadunit.aap.WppAction> extendSettle() {
        return null;
    }
    
    private final java.util.List<com.andrerinas.openheadunit.aap.WppAction> fail(java.lang.String reason, boolean wifiJoinFailed) {
        return null;
    }
    
    /**
     * Whether a status field reports a failure. Only `!= 0` counts, never a particular value —
     * the meanings of the non-zero codes are not known (a real phone answers -8 on type 5 during
     * an exchange that goes on to succeed). Null is not a failure either: an unparseable message
     * must never abort a handshake that was going fine.
     */
    private final boolean isFailureStatus(java.lang.Integer status) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppHandshakeSession$Companion;", "", "()V", "INFO_REQUEST_TIMEOUT_MS", "", "SETTLE_EXTENSION_MS", "VERSION_RESPONSE_TIMEOUT_MS", "WPP_VERSION_MAJOR", "", "WPP_VERSION_MINOR", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}