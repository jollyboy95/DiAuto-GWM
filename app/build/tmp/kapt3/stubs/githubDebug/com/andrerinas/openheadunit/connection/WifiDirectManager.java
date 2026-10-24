package com.andrerinas.openheadunit.connection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u0002:\u0002\u008f\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010J\u001a\u00020@2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010L\u001a\u00020@H\u0002J\b\u0010M\u001a\u00020@H\u0003J\b\u0010N\u001a\u00020@H\u0003J\u0010\u0010O\u001a\u00020@2\u0006\u0010P\u001a\u00020\tH\u0003J\u0010\u0010Q\u001a\u00020@2\u0006\u0010P\u001a\u00020\tH\u0003J\u0010\u0010R\u001a\u00020@2\u0006\u0010P\u001a\u00020\tH\u0002J\b\u0010S\u001a\u00020@H\u0002J\b\u0010T\u001a\u00020\u0011H\u0002J\b\u0010U\u001a\u00020\u0011H\u0002J\u0012\u0010V\u001a\u0004\u0018\u00010\u00112\u0006\u0010W\u001a\u00020\u0011H\u0002J\u0012\u0010X\u001a\u0004\u0018\u00010\u00112\u0006\u0010Y\u001a\u00020ZH\u0002J\u0014\u0010[\u001a\u0004\u0018\u00010\u00112\b\u0010\\\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010]\u001a\u00020\u00112\u0006\u0010^\u001a\u00020\tH\u0002J\u0014\u0010_\u001a\u0004\u0018\u00010\u00112\b\u0010`\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010a\u001a\u00020\u00112\b\u0010`\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010b\u001a\u00020\rH\u0002J\u0018\u0010c\u001a\u00020@2\u0006\u0010<\u001a\u00020\u00112\u0006\u0010d\u001a\u00020\tH\u0002J\b\u0010e\u001a\u00020@H\u0007J \u0010f\u001a\u00020@2\u0006\u0010<\u001a\u00020\u00112\u0006\u0010g\u001a\u00020\t2\u0006\u0010h\u001a\u00020\u0011H\u0002J\u0010\u0010i\u001a\u00020@2\u0006\u0010j\u001a\u00020kH\u0017J\u0012\u0010l\u001a\u00020@2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0017J\u0018\u0010m\u001a\u00020@2\u0006\u0010n\u001a\u00020\u00132\u0006\u0010o\u001a\u00020\u0007H\u0002J\u0010\u0010p\u001a\u00020@2\u0006\u0010^\u001a\u00020\u0011H\u0002J\u0010\u0010q\u001a\u00020@2\u0006\u0010r\u001a\u00020\rH\u0003J\b\u0010s\u001a\u00020@H\u0007J\b\u0010t\u001a\u00020@H\u0002J\u0018\u0010u\u001a\u00020@2\u0006\u0010v\u001a\u00020.2\u0006\u0010w\u001a\u00020\u000bH\u0002J\b\u0010x\u001a\u00020@H\u0003J$\u0010y\u001a\u00020@2\b\u0010v\u001a\u0004\u0018\u00010.2\b\u0010w\u001a\u0004\u0018\u00010\u000b2\u0006\u0010z\u001a\u00020{H\u0003J,\u0010|\u001a\u00020@2$\u0010}\u001a \u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020@09J\u0014\u0010~\u001a\u00020@2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020@0\u001fJ\u0015\u0010\u007f\u001a\u00020@2\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u001fJ\u0016\u0010\u0081\u0001\u001a\u00020@2\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u001fJ\u0011\u0010\u0082\u0001\u001a\u00020\r2\u0006\u0010g\u001a\u00020\tH\u0002J\u0012\u0010\u0083\u0001\u001a\u00020@2\u0007\u0010\u0084\u0001\u001a\u00020\u0011H\u0002J*\u0010\u0085\u0001\u001a\u00020@2\u0006\u0010v\u001a\u00020.2\u0006\u0010w\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\t2\u0007\u0010\u0086\u0001\u001a\u00020\u0011H\u0003J\t\u0010\u0087\u0001\u001a\u00020@H\u0003J\t\u0010\u0088\u0001\u001a\u00020@H\u0002J\t\u0010\u0089\u0001\u001a\u00020@H\u0007J\u0007\u0010\u008a\u0001\u001a\u00020@J\u001b\u0010\u008b\u0001\u001a\u00020\r2\u0007\u0010\u008c\u0001\u001a\u00020\t2\u0007\u0010\u008d\u0001\u001a\u00020\u0011H\u0002J\t\u0010\u008e\u0001\u001a\u00020@H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001100X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u000e\u00a2\u0006\u0002\n\u0000Rj\u00108\u001a^\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(=\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(>\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020@\u0018\u000109X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010B\u001a\n D*\u0004\u0018\u00010C0CX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0090\u0001"}, d2 = {"Lcom/andrerinas/openheadunit/connection/WifiDirectManager;", "Landroid/net/wifi/p2p/WifiP2pManager$ConnectionInfoListener;", "Landroid/net/wifi/p2p/WifiP2pManager$GroupInfoListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "burstGapMs", "", "burstTriggerCount", "", "channel", "Landroid/net/wifi/p2p/WifiP2pManager$Channel;", "checkGroupAndCreateInFlight", "", "checkGroupAndCreateToken", "credentialsEpoch", "discoveredInterface", "", "discoveryRunnable", "Ljava/lang/Runnable;", "generation", "getGeneration", "()I", "groupInfoRetries", "handler", "Landroid/os/Handler;", "isClientConnected", "isConnected", "isGroupCreatingOrCreated", "isGroupOwner", "isNativeHandshakeInFlight", "Lkotlin/Function0;", "isNativeSessionConnected", "isReceiverRegistered", "lastCoexistenceSsid", "lastConnChangedElapsedMs", "lastFrequencyUnreadableSsid", "lastKnownBssid", "lastNativeGroupStatusMessage", "lastUnfriendlyChannelSsid", "legacyChannelFallbackUsed", "legacyChannelRestrictionApplied", "localDeviceAddress", "macRegex", "Lkotlin/text/Regex;", "manager", "Landroid/net/wifi/p2p/WifiP2pManager;", "maskedMacs", "", "native5GhzBandMismatchRetries", "nativeGroupCreationMode", "nativeJoinWatchdog", "nativeJoinWatchdogSsid", "nativeRecreateCount", "nativeRequestedBand", "Lcom/andrerinas/openheadunit/aap/NativeGroupBandPolicy$Band;", "onCredentialsReady", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "ssid", "psk", "ip", "bssid", "", "onNativeGroupInvalidated", "ownershipPrefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "receiver", "Landroid/content/BroadcastReceiver;", "sessionOwnership", "Lcom/andrerinas/openheadunit/connection/P2pSessionOwnership;", "tightBurstCount", "armNativeJoinWatchdog", "groupSsid", "cancelNativeJoinWatchdog", "checkGroupAndCreate", "checkStuckRetryBurst", "createNewGroup", "retryCount", "createQuietGroup", "delayedCreateQuietGroup", "foreignGroupDetected", "generateP2pNetworkName", "generateP2pPassphrase", "getInterfaceByIp", "targetIp", "getMacFromReflection", "group", "Landroid/net/wifi/p2p/WifiP2pGroup;", "getMacFromShell", "iface", "getP2pErrorString", "reason", "getWifiDirectIp", "ifaceName", "getWifiDirectMac", "isNativeAaMode", "logStationCoexistence", "groupFrequency", "makeVisible", "notifyNativeGroupStarted", "frequency", "band", "onConnectionInfoAvailable", "info", "Landroid/net/wifi/p2p/WifiP2pInfo;", "onGroupInfoAvailable", "postSessionDelayed", "action", "delayMillis", "recoverNativeGroup", "recreateNativeGroup", "forceStandard", "refreshNativeAaCredentials", "registerReceiverIfNeeded", "releaseLegacyChannelRestriction", "mgr", "ch", "removeGroupAndRetryNative5Ghz", "removeOwnedGroup", "listener", "Landroid/net/wifi/p2p/WifiP2pManager$ActionListener;", "setCredentialsListener", "callback", "setNativeGroupInvalidatedListener", "setNativeHandshakeStateProvider", "provider", "setNativeSessionConnectedProvider", "shouldRetryNativeGroupFor5Ghz", "showToast", "message", "standardCreateGroup", "groupMode", "startDiscovery", "startDiscoveryLoop", "startNativeAaQuietHost", "stop", "supersededByStop", "gen", "what", "triggerWifiSettings", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class WifiDirectManager implements android.net.wifi.p2p.WifiP2pManager.ConnectionInfoListener, android.net.wifi.p2p.WifiP2pManager.GroupInfoListener {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private static final int MAX_NATIVE_5GHZ_CREATE_RETRIES = 4;
    
    /**
     * Set when building or submitting the band-restricted group request threw synchronously
     * with an exception that does not depend on timing (bad argument, unsupported operation,
     * missing method, refused permission). Such a request fails identically on every retry, so
     * retrying only adds about eight seconds to each connection. Process-wide, so a restart of
     * the app tries the band request again.
     */
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile java.lang.String bandRequestRejected;
    private static final int MAX_NATIVE_5GHZ_BAND_MISMATCH_RETRIES = 2;
    private static final int MAX_NATIVE_STANDARD_CREATE_RETRIES = 3;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String NATIVE_GROUP_MODE_UNKNOWN = "unknown";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String NATIVE_GROUP_MODE_5GHZ_REQUESTED = "5GHz requested";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String NATIVE_GROUP_MODE_24GHZ_FORCED = "2.4GHz forced (debug)";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String NATIVE_GROUP_MODE_STANDARD_FALLBACK = "standard fallback";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String NATIVE_GROUP_MODE_STANDARD_LEGACY = "standard (no 5GHz API)";
    private static final long NATIVE_JOIN_TIMEOUT_MS = 60000L;
    private static final int MAX_NATIVE_JOIN_RECREATES = 4;
    private static final int NATIVE_FORCE_STANDARD_AFTER = 2;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile android.net.wifi.p2p.WifiP2pManager manager;
    @org.jetbrains.annotations.Nullable()
    private android.net.wifi.p2p.WifiP2pManager.Channel channel;
    private boolean isGroupOwner = false;
    private boolean isConnected = false;
    private long lastConnChangedElapsedMs = 0L;
    private int tightBurstCount = 0;
    private final long burstGapMs = 800L;
    private final int burstTriggerCount = 5;
    @kotlin.jvm.Volatile()
    private volatile boolean isGroupCreatingOrCreated = false;
    @kotlin.jvm.Volatile()
    private volatile boolean checkGroupAndCreateInFlight = false;
    private boolean isClientConnected = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable discoveryRunnable = null;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String localDeviceAddress;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lastKnownBssid;
    private boolean isReceiverRegistered = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String discoveredInterface;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nativeGroupCreationMode = "unknown";
    private int native5GhzBandMismatchRetries = 0;
    
    /**
     * The band the current Native AA group was asked for. Only 5 GHz can be mismatched: a group
     * put on 2.4 GHz on purpose is on the band it was asked for, so it must not be remade.
     */
    @org.jetbrains.annotations.NotNull()
    private com.andrerinas.openheadunit.aap.NativeGroupBandPolicy.Band nativeRequestedBand = com.andrerinas.openheadunit.aap.NativeGroupBandPolicy.Band.UNSPECIFIED;
    
    /**
     * True while a 5 GHz operating-channel restriction is in place on a pre-Q device. It lives in the
     * supplicant rather than here, so it has to be cleared deliberately - see [WifiP2pChannelCompat].
     */
    @kotlin.jvm.Volatile()
    private volatile boolean legacyChannelRestrictionApplied = false;
    
    /**
     * One clear-and-retry per bring-up, so a unit that cannot host 5 GHz still gets a group.
     */
    private boolean legacyChannelFallbackUsed = false;
    
    /**
     * Bumped by [stop]. Every P2P callback that continues into another framework call captures this
     * first and gives up if it has moved, because [stop] can cancel posted runnables but nothing can
     * cancel an `ActionListener` the framework is already holding - and those continuations create
     * groups. Without the fence, a user exit that lands mid-recovery removes the group and then a
     * continuation puts a new one up with no receiver, no watchdog and nobody expecting it, which is
     * exactly what the exit was for.
     */
    private final android.content.SharedPreferences ownershipPrefs = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.connection.P2pSessionOwnership sessionOwnership = null;
    
    /**
     * One token per checkGroupAndCreate run, so a stale safety timer cannot clear a later run's guard.
     */
    private int checkGroupAndCreateToken = 0;
    
    /**
     * Bumped whenever the group these credentials describe stops being the current one.
     *
     * The delivery thread below waits up to 15s for an IP and then hands the SSID, passphrase and
     * BSSID it captured at spawn to the handshake. Nothing cancels it, and its IP fallback means it
     * always produces something - so a group torn down mid-wait still delivers, overwriting the live
     * group's credentials with a dead group's. The phone then joins a network that no longer exists
     * and sits on "Obtaining IP address" forever, having been told the truth about the wrong group.
     */
    @kotlin.jvm.Volatile()
    private volatile int credentialsEpoch = 0;
    
    /**
     * The group the join watchdog is currently armed for, so repeat callbacks cannot push it out.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String nativeJoinWatchdogSsid;
    
    /**
     * Says the frequency is unreadable once per group, not once per group-info callback.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lastFrequencyUnreadableSsid;
    
    /**
     * SSID of the last group reported as being on a channel most phones cannot join, so the several
     * [onGroupInfoAvailable] callbacks a single group produces are said once.
     *
     * The SSID and not the interface or the BSSID: Android generates a fresh DIRECT-xy-… per group,
     * it is populated on the very first callback, and it is never privacy-masked. `interface` is
     * null until an IP is up and the BSSID is often 02:00:00:00:00:00 here, so either would both
     * split one group across two identities and merge two groups into one.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lastUnfriendlyChannelSsid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lastCoexistenceSsid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lastNativeGroupStatusMessage;
    private int nativeRecreateCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable nativeJoinWatchdog = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> onCredentialsReady;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<java.lang.Boolean> isNativeHandshakeInFlight;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<java.lang.Boolean> isNativeSessionConnected;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onNativeGroupInvalidated;
    @org.jetbrains.annotations.NotNull()
    private final android.content.BroadcastReceiver receiver = null;
    private int groupInfoRetries = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.text.Regex macRegex = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> maskedMacs = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.andrerinas.openheadunit.connection.WifiDirectManager.Companion Companion = null;
    
    public WifiDirectManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final int getGeneration() {
        return 0;
    }
    
    /**
     * True when [stop] has run since [gen] was captured, meaning this continuation belongs to a
     * session that is over and must not create anything.
     */
    private final boolean supersededByStop(int gen, java.lang.String what) {
        return false;
    }
    
    public final void setCredentialsListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> callback) {
    }
    
    public final void setNativeHandshakeStateProvider(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> provider) {
    }
    
    public final void setNativeSessionConnectedProvider(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> provider) {
    }
    
    public final void setNativeGroupInvalidatedListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void checkStuckRetryBurst() {
    }
    
    private final void registerReceiverIfNeeded() {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public void onConnectionInfoAvailable(@org.jetbrains.annotations.NotNull()
    android.net.wifi.p2p.WifiP2pInfo info) {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public void onGroupInfoAvailable(@org.jetbrains.annotations.Nullable()
    android.net.wifi.p2p.WifiP2pGroup group) {
    }
    
    /**
     * Reports whether this unit is also joined to an ordinary WiFi network while hosting the group.
     *
     * One radio serving a station link and a group owner at once has to divide its time between
     * them, and on a single-channel chipset that shows up as the projected video and audio going
     * dead together for a few hundred milliseconds at a time, over and over, with nothing wrong
     * anywhere in the app. It is invisible from a log otherwise, and it is not rare: a dashcam or
     * a phone hotspot the unit reconnects to on its own is enough.
     *
     * Frequencies make the diagnosis exact when both are known: the same channel is shared airtime,
     * different channels means the radio is also retuning between them. Several head units report
     * the group frequency as 0, so say what is known and do not withhold the warning over it.
     *
     * Logged once per group rather than once per callback, because requestGroupInfo() is issued
     * several places, so this runs three or four times for one group.
     */
    private final void logStationCoexistence(java.lang.String ssid, int groupFrequency) {
    }
    
    private final java.lang.String getInterfaceByIp(java.lang.String targetIp) {
        return null;
    }
    
    private final java.lang.String getWifiDirectMac(java.lang.String ifaceName) {
        return null;
    }
    
    private final java.lang.String getWifiDirectIp(java.lang.String ifaceName) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void makeVisible() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void checkGroupAndCreate() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void createNewGroup(int retryCount) {
    }
    
    private final void startDiscoveryLoop() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void startDiscovery() {
    }
    
    /**
     * Boomerang Hack: Briefly triggers system WiFi settings to wake up the radio.
     * Currently not used by default but kept in code for future use.
     */
    private final void triggerWifiSettings() {
    }
    
    /**
     * Credential refresh must not replace the network a Bluetooth handshake is waiting for.
     */
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void refreshNativeAaCredentials() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void startNativeAaQuietHost() {
    }
    
    private final void delayedCreateQuietGroup(int retryCount) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void createQuietGroup(int retryCount) {
    }
    
    private final java.lang.String generateP2pNetworkName() {
        return null;
    }
    
    private final java.lang.String generateP2pPassphrase() {
        return null;
    }
    
    private final java.lang.String getP2pErrorString(int reason) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void standardCreateGroup(android.net.wifi.p2p.WifiP2pManager mgr, android.net.wifi.p2p.WifiP2pManager.Channel ch, int retryCount, java.lang.String groupMode) {
    }
    
    /**
     * Gives the frequency list back once the group exists.
     *
     * Not tidiness: the restriction bans every frequency except the one it names, including the
     * 2.4 GHz social channels discovery runs on, and it is state in the supplicant that outlives
     * this app. A group that has already formed keeps its channel, so nothing is lost by clearing.
     */
    private final void releaseLegacyChannelRestriction(android.net.wifi.p2p.WifiP2pManager mgr, android.net.wifi.p2p.WifiP2pManager.Channel ch) {
    }
    
    private final boolean isNativeAaMode() {
        return false;
    }
    
    private final boolean shouldRetryNativeGroupFor5Ghz(int frequency) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void removeGroupAndRetryNative5Ghz() {
    }
    
    /**
     * Tear down any current P2P group and create a fresh native quiet-host group.
     * [forceStandard] skips the 5GHz attempt, for phones that can't join a 5GHz group owner.
     *
     * Used to also call deletePersistentGroup() here, as the Helper mode path does, but on-device
     * that is rejected for every netId — likely a permission this app lacks. Dropped.
     */
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void recreateNativeGroup(boolean forceStandard) {
    }
    
    /**
     * Recover a native quiet-host group when the phone never joins: recreate a fresh one, and
     * after a couple of tries drop the forced 5GHz band. Bounded by [MAX_NATIVE_JOIN_RECREATES].
     */
    private final void recoverNativeGroup(java.lang.String reason) {
    }
    
    /**
     * Arms the join watchdog, at most once per group.
     *
     * [groupSsid] identifies the group this is being armed for. `onGroupInfoAvailable` fires three or
     * four times per group and once more for every CONNECTION_CHANGED, and re-arming pushed the
     * deadline out by the full timeout each time - so a phone retrying its join at any cadence faster
     * than the timeout starved the watchdog indefinitely and the bounded recovery it exists to run
     * never ran. Pass null where the re-arm is a real state change (a client leaving, WiFi coming
     * back), which resets the identity and lets the next group arm afresh.
     */
    private final void armNativeJoinWatchdog(java.lang.String groupSsid) {
    }
    
    private final void cancelNativeJoinWatchdog() {
    }
    
    private final void notifyNativeGroupStarted(java.lang.String ssid, int frequency, java.lang.String band) {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    /**
     * Last-resort BSSID lookup: reflect over every declared field (including inherited ones) of
     * the WifiP2pGroup and its owner WifiP2pDevice, looking for any String that looks like a MAC
     * and isn't one of the known privacy-masked placeholders. Some OEM builds mask the public
     * NetworkInterface/deviceAddress getters but leave other internal fields populated with the
     * real value.
     */
    private final java.lang.String getMacFromReflection(android.net.wifi.p2p.WifiP2pGroup group) {
        return null;
    }
    
    private final java.lang.String getMacFromShell(java.lang.String iface) {
        return null;
    }
    
    private final void postSessionDelayed(java.lang.Runnable action, long delayMillis) {
    }
    
    private final void foreignGroupDetected() {
    }
    
    /**
     * A removeGroup call acts on the whole radio, even when another app now owns it.
     */
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void removeOwnedGroup(android.net.wifi.p2p.WifiP2pManager mgr, android.net.wifi.p2p.WifiP2pManager.Channel ch, android.net.wifi.p2p.WifiP2pManager.ActionListener listener) {
    }
    
    public final void stop() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/connection/WifiDirectManager$Companion;", "", "()V", "MAX_NATIVE_5GHZ_BAND_MISMATCH_RETRIES", "", "MAX_NATIVE_5GHZ_CREATE_RETRIES", "MAX_NATIVE_JOIN_RECREATES", "MAX_NATIVE_STANDARD_CREATE_RETRIES", "NATIVE_FORCE_STANDARD_AFTER", "NATIVE_GROUP_MODE_24GHZ_FORCED", "", "NATIVE_GROUP_MODE_5GHZ_REQUESTED", "NATIVE_GROUP_MODE_STANDARD_FALLBACK", "NATIVE_GROUP_MODE_STANDARD_LEGACY", "NATIVE_GROUP_MODE_UNKNOWN", "NATIVE_JOIN_TIMEOUT_MS", "", "bandRequestRejected", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}