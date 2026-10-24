package com.andrerinas.openheadunit.connection;

/**
 * Supplies the Native AA handshake with the credentials of *this head unit's own access point*,
 * as an alternative to [WifiDirectManager]'s P2P group.
 *
 * A teardown of the OEM ZLink app showed it doing wireless Android Auto over an ordinary WPA2 soft
 * AP — same Bluetooth handshake, same UUID, no WiFi Direct — so the phone accepts a plain access
 * point, and that route sidesteps the P2P failure modes behind most Native AA reports: group
 * churn, the self-wake loop, phones stuck on "Obtaining IP address".
 *
 * It does not copy ZLink's way of *starting* the AP; that needs TETHER_PRIVILEGED and root
 * daemons. Reading a hotspot the user configured is the load-bearing path, switching one on is
 * best effort. Same contract as [WifiDirectManager] so a launcher can treat both transports alike.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 92\u00020\u0001:\u000289B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010$\u001a\u00020\u0018H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u001fH\u0002J\n\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u001e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020)2\u0006\u0010\'\u001a\u00020\u001fH\u0082@\u00a2\u0006\u0002\u0010-J\u0006\u0010.\u001a\u00020\u0018J\u001a\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u001f2\b\b\u0002\u00101\u001a\u00020\fH\u0002J,\u00102\u001a\u00020\u00182$\u00103\u001a \u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u0010J\u0014\u00104\u001a\u00020\u00182\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aJ\b\u00105\u001a\u00020\u0018H\u0002J\u0006\u00106\u001a\u00020\u0018J\u0006\u00107\u001a\u00020\u0018R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000Rj\u0010\u000f\u001a^\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/andrerinas/openheadunit/connection/SoftApCredentialsProvider;", "", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lcom/andrerinas/openheadunit/utils/Settings;)V", "apStateReceiver", "Landroid/content/BroadcastReceiver;", "autoEnabled", "", "isReceiverRegistered", "isRunning", "onCredentialsReady", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "ssid", "psk", "ip", "bssid", "", "onInvalidated", "Lkotlin/Function0;", "reportedBudgetExhausted", "reportedConfigUnreadable", "reportedNoInterface", "resolveGeneration", "", "resolveJob", "Lkotlinx/coroutines/Job;", "runStartedAt", "triedAutoEnable", "beginResolve", "hardwareAddressOf", "invalidateIfCurrent", "generation", "pickApInterface", "Lcom/andrerinas/openheadunit/connection/SoftApCredentialsProvider$ChosenInterface;", "publish", "Lcom/andrerinas/openheadunit/aap/SoftApCredentialsAttempt;", "chosen", "(Lcom/andrerinas/openheadunit/connection/SoftApCredentialsProvider$ChosenInterface;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "reportBudgetExhaustedOnce", "waited", "force", "setCredentialsListener", "callback", "setInvalidatedListener", "showConfigUnreadableToast", "start", "stop", "ChosenInterface", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class SoftApCredentialsProvider {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    
    /**
     * How often to look for the access point while waiting for it to come up.
     */
    private static final long POLL_INTERVAL_MS = 1000L;
    
    /**
     * How long to keep looking before giving up and saying so.
     */
    private static final long RESOLVE_BUDGET_MS = 30000L;
    
    /**
     * How long to wait for a user-configured AP before trying to switch one on ourselves.
     */
    private static final long AUTO_ENABLE_AFTER_MS = 5000L;
    
    /**
     * Not in any public SDK constant: the soft AP state broadcast and its disabled state.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String WIFI_AP_STATE_CHANGED = "android.net.wifi.WIFI_AP_STATE_CHANGED";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_WIFI_AP_STATE = "wifi_state";
    private static final int WIFI_AP_STATE_DISABLED = 11;
    private static final int WIFI_AP_STATE_ENABLED = 13;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> onCredentialsReady;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onInvalidated;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job resolveJob;
    
    /**
     * Fences blocking interface/MAC reads from a resolver superseded by refresh or stop.
     */
    private long resolveGeneration = 0L;
    @kotlin.jvm.Volatile()
    private volatile boolean isRunning = false;
    @kotlin.jvm.Volatile()
    private volatile boolean isReceiverRegistered = false;
    
    /**
     * Whether *we* turned the hotspot on, and so may turn it back on if it drops.
     */
    @kotlin.jvm.Volatile()
    private volatile boolean autoEnabled = false;
    
    /**
     * Whether switching the hotspot on has already been tried since [start].
     *
     * A field rather than a local in [beginResolve], because [refresh] restarts that loop and the
     * handshake calls it every time it has been waiting too long — which used to re-arm auto-enable
     * on each one, so a slow access point got a second start sweep on top of the first, racing it
     * band for band. One attempt per run is the whole of the best effort on offer.
     */
    @kotlin.jvm.Volatile()
    private volatile boolean triedAutoEnable = false;
    
    /**
     * So the once-per-second poll reports "nothing here" once, not thirty times.
     */
    @kotlin.jvm.Volatile()
    private volatile boolean reportedNoInterface = false;
    
    /**
     * When [start] was called, so the budget below measures the run rather than one look.
     *
     * [beginResolve] used to stamp its own deadline, and [refresh] restarts it — which the handshake
     * calls every ~10 s while it waits. A budget of 30 s restarted every 10 s never expires, so the
     * line that tells the user no access point could be found was unreachable in exactly the case it
     * was written for. Measured: an access point down for 3.5 minutes, the resolve polling the whole
     * time, and nothing said.
     */
    @kotlin.jvm.Volatile()
    private volatile long runStartedAt = 0L;
    
    /**
     * So that budget is reported once per run, not once per [refresh].
     */
    @kotlin.jvm.Volatile()
    private volatile boolean reportedBudgetExhausted = false;
    
    /**
     * Same idea for the unreadable-configuration dead end, but latched for the whole run rather
     * than per resolve: the handshake calls [refresh] every time it has been waiting too long, and
     * the phone redials every few seconds, so this would otherwise be said once per attempt for as
     * long as the user keeps trying. It is one instruction and it does not change.
     */
    @kotlin.jvm.Volatile()
    private volatile boolean reportedConfigUnreadable = false;
    @org.jetbrains.annotations.NotNull()
    private final android.content.BroadcastReceiver apStateReceiver = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.SoftApCredentialsProvider.Companion Companion = null;
    
    public SoftApCredentialsProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings) {
        super();
    }
    
    public final void setCredentialsListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> callback) {
    }
    
    public final void setInvalidatedListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void start() {
    }
    
    /**
     * Look again, from the top. Called when the handshake has been waiting too long.
     */
    @kotlin.jvm.Synchronized()
    public final synchronized void refresh() {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void stop() {
    }
    
    /**
     * The one failure on this route the user can actually fix, so it is worth interrupting them
     * for: without it the whole symptom is a phone that connects over Bluetooth and then does
     * nothing, with the reason only in a log they have no reason to read.
     *
     * Forced past the toast preference, because a silent dead end is worse than an unwanted toast.
     * Posted to the main thread rather than switched to it with withContext: the resolve loop is
     * cancelled by [refresh] and by [stop], and a suspending hop would let that cancellation
     * swallow the message after the once-per-run latch had already been set.
     */
    private final void showConfigUnreadableToast() {
    }
    
    private final void beginResolve() {
    }
    
    @kotlin.jvm.Synchronized()
    private final synchronized void invalidateIfCurrent(long generation) {
    }
    
    /**
     * Says once per run that this has been going on too long to be a hotspot still coming up.
     *
     * Reported rather than acted on: the polling continues, because the user switching the hotspot
     * on by hand is a real recovery and the only one left on a device where auto-enable cannot. What
     * this replaces is silence — the old message was tied to a deadline [beginResolve] restamped on
     * every [refresh], so on the path that needed it most it never printed at all.
     */
    private final void reportBudgetExhaustedOnce(long waited, boolean force) {
    }
    
    /**
     * The interface our access point is running on, if it is up.
     *
     * Every reference implementation of this protocol — aa-proxy-rs, the Raspberry Pi dongles, the
     * OEM ZLink app — either creates the access point itself or reads the interface name from
     * configuration; none of them infer it. We are the only one reading an access point we did not
     * create, on hardware we do not control, which is why [Settings.hotspotInterface] comes first
     * and the heuristic is the fallback.
     */
    private final com.andrerinas.openheadunit.connection.SoftApCredentialsProvider.ChosenInterface pickApInterface() {
        return null;
    }
    
    /**
     * Resolves the rest of the credentials for [iface] and hands them over.
     */
    private final java.lang.Object publish(com.andrerinas.openheadunit.connection.SoftApCredentialsProvider.ChosenInterface chosen, long generation, kotlin.coroutines.Continuation<? super com.andrerinas.openheadunit.aap.SoftApCredentialsAttempt> $completion) {
        return null;
    }
    
    private final java.lang.String hardwareAddressOf(java.lang.String name) {
        return null;
    }
    
    /**
     * The interface we settled on, and whether the user named it rather than us guessing.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/connection/SoftApCredentialsProvider$ChosenInterface;", "", "iface", "Lcom/andrerinas/openheadunit/aap/ApInterfaceCandidate;", "namedByUser", "", "(Lcom/andrerinas/openheadunit/aap/ApInterfaceCandidate;Z)V", "getIface", "()Lcom/andrerinas/openheadunit/aap/ApInterfaceCandidate;", "getNamedByUser", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class ChosenInterface {
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.aap.ApInterfaceCandidate iface = null;
        private final boolean namedByUser = false;
        
        public ChosenInterface(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.ApInterfaceCandidate iface, boolean namedByUser) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.ApInterfaceCandidate getIface() {
            return null;
        }
        
        public final boolean getNamedByUser() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.ApInterfaceCandidate component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.connection.SoftApCredentialsProvider.ChosenInterface copy(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.ApInterfaceCandidate iface, boolean namedByUser) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/connection/SoftApCredentialsProvider$Companion;", "", "()V", "AUTO_ENABLE_AFTER_MS", "", "EXTRA_WIFI_AP_STATE", "", "POLL_INTERVAL_MS", "RESOLVE_BUDGET_MS", "WIFI_AP_STATE_CHANGED", "WIFI_AP_STATE_DISABLED", "", "WIFI_AP_STATE_ENABLED", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}