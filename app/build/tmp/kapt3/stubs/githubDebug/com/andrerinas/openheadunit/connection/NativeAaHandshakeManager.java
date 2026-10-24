package com.andrerinas.openheadunit.connection;

/**
 * Manages the official Android Auto Wireless Bluetooth handshake.
 * This class implements the RFCOMM server protocol to exchange WiFi credentials with the phone.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 o2\u00020\u0001:\u0003opqB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u001cH\u0082@\u00a2\u0006\u0002\u0010-J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020#H\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u000206H\u0002J\"\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u000e2\n\b\u0002\u00109\u001a\u0004\u0018\u00010#H\u0082@\u00a2\u0006\u0002\u0010:J\u0016\u0010;\u001a\u0002062\u0006\u00108\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0002\u0010<J\u001f\u0010=\u001a\u0002062\u0006\u00108\u001a\u00020\u000e2\f\u0010>\u001a\b\u0012\u0004\u0012\u0002060?H\u0082\bJ\u0006\u0010@\u001a\u000206J\u0006\u0010A\u001a\u00020\bJ\u0006\u0010B\u001a\u00020\bJ\u0006\u0010C\u001a\u00020\bJ\u0006\u0010D\u001a\u00020\bJ\u0018\u0010E\u001a\u0002062\u0006\u0010F\u001a\u00020#2\u0006\u0010G\u001a\u000201H\u0002J\u0018\u0010H\u001a\u0002062\u0006\u00108\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020#H\u0002J\u0010\u0010J\u001a\u0002062\u0006\u0010K\u001a\u00020LH\u0002J\u000e\u0010M\u001a\u0002062\u0006\u0010N\u001a\u00020#J\u0010\u0010O\u001a\u0002062\u0006\u00103\u001a\u000204H\u0002J\u0017\u0010P\u001a\u0004\u0018\u00010\u00122\u0006\u0010K\u001a\u00020LH\u0002\u00a2\u0006\u0002\u0010QJ\u001e\u0010R\u001a\u00020\b2\u0006\u00103\u001a\u0002042\u0006\u0010S\u001a\u00020\u001cH\u0082@\u00a2\u0006\u0002\u0010TJ\u0010\u0010U\u001a\u00020L2\u0006\u0010V\u001a\u00020WH\u0002J\u0010\u0010X\u001a\u00020\b2\u0006\u00108\u001a\u00020\u000eH\u0002J\b\u0010Y\u001a\u000206H\u0002J \u0010Z\u001a\u0002062\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u0012H\u0002J2\u0010`\u001a\u0002062\u0006\u0010[\u001a\u00020\\2\u0006\u0010a\u001a\u00020#2\u0006\u0010b\u001a\u00020#2\b\u0010c\u001a\u0004\u0018\u00010#2\u0006\u0010d\u001a\u00020eH\u0002J \u0010f\u001a\u0002062\u0006\u0010[\u001a\u00020\\2\u0006\u0010g\u001a\u00020#2\u0006\u0010h\u001a\u00020\u0012H\u0002J\u0010\u0010i\u001a\u0002062\u0006\u0010[\u001a\u00020\\H\u0002J\b\u0010j\u001a\u000206H\u0007J\u0006\u0010k\u001a\u000206J\u0006\u0010l\u001a\u000206J&\u0010m\u001a\u0002062\u0006\u0010a\u001a\u00020#2\u0006\u0010n\u001a\u00020#2\u0006\u0010g\u001a\u00020#2\u0006\u0010c\u001a\u00020#R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R2\u0010\u0016\u001a&\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\n0\n \u0018*\u0012\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\n0\n\u0018\u00010\u00190\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R2\u0010\u001a\u001a&\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\n0\n \u0018*\u0012\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\n0\n\u0018\u00010\u00190\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010!\u001a\u0016\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006r"}, d2 = {"Lcom/andrerinas/openheadunit/connection/NativeAaHandshakeManager;", "", "context", "Lcom/andrerinas/openheadunit/aap/AapService;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/andrerinas/openheadunit/aap/AapService;Lkotlinx/coroutines/CoroutineScope;)V", "aaListenersClosedForSession", "", "aaServerSocket", "Landroid/bluetooth/BluetoothServerSocket;", "activeHandshakeJob", "Lkotlinx/coroutines/Job;", "activeHandshakeSocket", "Landroid/bluetooth/BluetoothSocket;", "commManager", "Lcom/andrerinas/openheadunit/connection/CommManager;", "consecutiveHandshakeFailures", "", "credentials", "Lcom/andrerinas/openheadunit/connection/NativeAaHandshakeManager$WifiCredentials;", "everAcceptedAaConnection", "extraAaServerSockets", "", "kotlin.jvm.PlatformType", "", "extraHfpServerSockets", "handoffSettlingSince", "", "handsFreeSkipLogged", "handshakeStartedAt", "hfpServerSocket", "isRunning", "lastPokeTriggerCredentials", "Lkotlin/Triple;", "", "localRadioName", "loggedHandshakeBackoff", "pokeAttemptInFlight", "pokeJob", "pokesSinceLastAccept", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "awaitWirelessServerListening", "timeoutMs", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bondReadingFor", "Lcom/andrerinas/openheadunit/aap/BluetoothWakePolicy$BondReading;", "adapter", "Landroid/bluetooth/BluetoothAdapter;", "mac", "device", "Landroid/bluetooth/BluetoothDevice;", "closeAaListeners", "", "handleHandshake", "socket", "localRadio", "(Landroid/bluetooth/BluetoothSocket;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleHfp", "(Landroid/bluetooth/BluetoothSocket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ifOwner", "block", "Lkotlin/Function0;", "invalidateCredentials", "isActive", "isAttemptInFlight", "isHandoffSettling", "isHandshakeInFlight", "launchExtraServers", "serviceName", "extra", "logHfpAccept", "radio", "logReceivedDetail", "msg", "Lcom/andrerinas/openheadunit/connection/NativeAaHandshakeManager$ProtobufMessage;", "manualPoke", "address", "noteHandsFreePokeSkip", "parseStatus", "(Lcom/andrerinas/openheadunit/connection/NativeAaHandshakeManager$ProtobufMessage;)Ljava/lang/Integer;", "pokeDevice", "holdMs", "(Landroid/bluetooth/BluetoothDevice;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readProtobuf", "input", "Ljava/io/DataInputStream;", "refuseWhileBackedOff", "resetHandshakeBackoff", "sendProtobuf", "output", "Ljava/io/OutputStream;", "data", "", "type", "sendWifiSecurityResponse", "ssid", "key", "bssid", "transport", "Lcom/andrerinas/openheadunit/aap/NativeTransport;", "sendWifiStartRequest", "ip", "port", "sendWifiVersionRequest", "start", "stop", "triggerPoke", "updateWifiCredentials", "psk", "Companion", "ProtobufMessage", "WifiCredentials", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class NativeAaHandshakeManager {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapService context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private static final java.util.UUID AA_UUID = null;
    private static final java.util.UUID HFP_UUID = null;
    
    /**
     * How long to wait for this head unit's own WiFi network to come up before giving up on
     * a handshake. P2P group creation is the slow case.
     */
    private static final long CREDENTIALS_WAIT_MS = 60000L;
    
    /**
     * How long to wait for the AAP TCP port to be bound before giving up on a handshake.
     */
    private static final long PORT_WAIT_MS = 3000L;
    
    /**
     * How long to wait for the port after asking for the server to be (re)started.
     *
     * Deliberately short. [awaitWirelessServerListening] delays without pumping the session's
     * inbound channel, so everything spent here is time the phone's keepalives go unserviced;
     * the bind's own retry budget is under two seconds, so this only has to cover it.
     */
    private static final long PORT_ENSURE_MS = 4000L;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.connection.CommManager commManager = null;
    @org.jetbrains.annotations.Nullable()
    private android.bluetooth.BluetoothServerSocket aaServerSocket;
    @org.jetbrains.annotations.Nullable()
    private android.bluetooth.BluetoothServerSocket hfpServerSocket;
    private final java.util.List<android.bluetooth.BluetoothServerSocket> extraAaServerSockets = null;
    private final java.util.List<android.bluetooth.BluetoothServerSocket> extraHfpServerSockets = null;
    private boolean isRunning = false;
    @kotlin.jvm.Volatile()
    private volatile boolean aaListenersClosedForSession = false;
    @kotlin.jvm.Volatile()
    private volatile boolean handsFreeSkipLogged = false;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile com.andrerinas.openheadunit.connection.NativeAaHandshakeManager.WifiCredentials credentials;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job pokeJob;
    @org.jetbrains.annotations.Nullable()
    private kotlin.Triple<java.lang.String, java.lang.String, java.lang.String> lastPokeTriggerCredentials;
    @kotlin.jvm.Volatile()
    private volatile long handshakeStartedAt = 0L;
    @kotlin.jvm.Volatile()
    private volatile boolean pokeAttemptInFlight = false;
    @kotlin.jvm.Volatile()
    private volatile long handoffSettlingSince = 0L;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile android.bluetooth.BluetoothSocket activeHandshakeSocket;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile kotlinx.coroutines.Job activeHandshakeJob;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.NotNull()
    private volatile java.lang.String localRadioName = "?";
    @kotlin.jvm.Volatile()
    private volatile int pokesSinceLastAccept = 0;
    @kotlin.jvm.Volatile()
    private volatile boolean everAcceptedAaConnection = false;
    @kotlin.jvm.Volatile()
    private volatile int consecutiveHandshakeFailures = 0;
    @kotlin.jvm.Volatile()
    private volatile boolean loggedHandshakeBackoff = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.NativeAaHandshakeManager.Companion Companion = null;
    
    public NativeAaHandshakeManager(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapService context, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope) {
        super();
    }
    
    /**
     * Polls until the AAP TCP port is bound, or [timeoutMs] passes.
     */
    private final java.lang.Object awaitWirelessServerListening(long timeoutMs, kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    /**
     * Updates the WiFi credentials that will be sent to the phone during the next handshake.
     */
    public final void updateWifiCredentials(@org.jetbrains.annotations.NotNull()
    java.lang.String ssid, @org.jetbrains.annotations.NotNull()
    java.lang.String psk, @org.jetbrains.annotations.NotNull()
    java.lang.String ip, @org.jetbrains.annotations.NotNull()
    java.lang.String bssid) {
    }
    
    /**
     * Clears cached credentials so an in-progress wait doesn't hand out stale ones for a group
     * that's about to be torn down.
     */
    public final void invalidateCredentials() {
    }
    
    public final boolean isActive() {
        return false;
    }
    
    public final boolean isHandshakeInFlight() {
        return false;
    }
    
    /**
     * True between delivering the WiFi credentials (Type 3) and the phone's TCP session actually
     * landing — the window in which it is still associating, doing WPS and getting a DHCP lease.
     *
     * [isHandshakeInFlight] deliberately goes false the instant Type 3 is written, because the
     * *credential exchange* is done at that point. The phone's work is not: measured joining the
     * group 0.73 s after Type 3 and still without an IP 2.4 s later. Anything that must not disturb
     * the phone mid-join — the wake poke, the BT auto-start re-arm, WifiDirectManager's join
     * watchdog — has to check this, not isHandshakeInFlight().
     */
    public final boolean isHandoffSettling() {
        return false;
    }
    
    public final boolean isAttemptInFlight() {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void start() {
    }
    
    /**
     * Open supplementary AA + HFP RFCOMM listeners on a secondary Bluetooth radio, so a phone
     * bonded to that radio (dual-Bluetooth head units) can still reach us. Experimental, and
     * fully guarded so a bad radio cannot affect the primary listener.
     */
    private final void launchExtraServers(java.lang.String serviceName, android.bluetooth.BluetoothAdapter extra) {
    }
    
    /**
     * Stop accepting new AA_UUID connections (primary + any secondary radios) after a
     * successful handoff to WiFi. Closing just the client socket isn't enough: the phone reads
     * that as an unexpected drop and immediately retries, and with the listener still up we'd
     * accept, bail out (already connected), and close again — a tight reconnect storm (confirmed
     * on-device: hundreds of accept/close cycles a second, indistinguishable from a Bluetooth
     * pairing loop). HFP listeners are left running. Re-opened the next time start() runs, which
     * AapService already does on disconnect.
     */
    private final void closeAaListeners() {
    }
    
    /**
     * Says what an accepted hands-free connection means, not only that it happened. On its own it
     * reads like success; it is the phone attaching its hands-free link to this app rather than to
     * the head unit's own Bluetooth stack, and the responder below can never carry call audio —
     * it answers OK to everything and negotiates neither a codec nor a SCO link.
     *
     * Whether it ever fires is still open: five rig rounds and every reporter log so far, no
     * accepts. Address as well as name, because getName() is null for an unbonded device.
     */
    private final void logHfpAccept(android.bluetooth.BluetoothSocket socket, java.lang.String radio) {
    }
    
    /**
     * Minimal HFP responder to satisfy phones that require a stable HFP connection
     * during the Android Auto Wireless handshake.
     */
    private final java.lang.Object handleHfp(android.bluetooth.BluetoothSocket socket, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Read a device's pairing state, keeping "not paired" and "could not tell" apart.
     *
     * `getBondState()` answers `BOND_NONE` when the Bluetooth service is unavailable rather than
     * saying it does not know, so an adapter that is off would otherwise look exactly like a phone
     * the user unpaired. Everything that cannot be established reads as
     * [BluetoothWakePolicy.BondReading.UNREADABLE], and the policy decides what each is worth.
     */
    private final com.andrerinas.openheadunit.aap.BluetoothWakePolicy.BondReading bondReadingFor(android.bluetooth.BluetoothDevice device) {
        return null;
    }
    
    /**
     * As [bondReadingFor], for a MAC that has not been resolved to a device yet.
     */
    private final com.andrerinas.openheadunit.aap.BluetoothWakePolicy.BondReading bondReadingFor(android.bluetooth.BluetoothAdapter adapter, java.lang.String mac) {
        return null;
    }
    
    /**
     * Say once per run of skips that the poke stood down. Info first so it survives a log exported
     * at the default level, then debug: the retry loop asks again every ~30 s, and a line per
     * half-minute for a whole session buries everything around it.
     */
    private final void noteHandsFreePokeSkip(android.bluetooth.BluetoothDevice device) {
    }
    
    /**
     * Tries each of [BluetoothWakePolicy.POKE_TARGETS] in turn, holding whichever connects for
     * [holdMs]. Returns true if any of them did, false without opening anything if either guard
     * below stands the poke down. Both poke entry points come through here, so one check covers
     * the retry loop and the manual poke alike.
     */
    private final java.lang.Object pokeDevice(android.bluetooth.BluetoothDevice device, long holdMs, kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    /**
     * Wakes up the phone by attempting a brief connection to an HFP/HSP profile, signaling it
     * to start looking for the head unit. Retried every 15s (matching the retry cadence of both
     * nisargjhaveri/WirelessAndroidAutoDongle and mossyhub/openautolink) until a real handshake
     * starts or another session (USB/etc.) takes over, instead of giving up after a single pass.
     *
     * Never runs while a handoff is settling: AapService re-invokes this on every credential
     * re-delivery, and the phone *joining our group* is itself a P2P connection change, hence a
     * re-delivery. That put a real RFCOMM connect() in the middle of the phone's DHCP exchange.
     */
    public final void triggerPoke() {
    }
    
    /**
     * Start a manual poke (wakeup) for a specific Bluetooth device.
     */
    public final void manualPoke(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    /**
     * Drop an incoming Android Auto connection instead of serving it, once too many handshakes in
     * a row have timed out waiting for the phone's Type 2. Returns true if the socket was refused.
     *
     * Each timed-out handshake strands a thread that cannot be reclaimed (see
     * [NativeHandoffPolicy.shouldServeHandshake]), so past the limit the only useful thing to do
     * is stop starting new ones. The phone will keep reconnecting; closing immediately costs it
     * nothing beyond the retry it was going to make anyway.
     */
    private final boolean refuseWhileBackedOff(android.bluetooth.BluetoothSocket socket) {
        return false;
    }
    
    /**
     * Clears the handshake backoff. Called wherever the user or the system asks for a fresh try.
     */
    private final void resetHandshakeBackoff() {
    }
    
    /**
     * Runs [block] only while [socket] is still the handshake this manager is serving.
     *
     * Every write a handshake makes to shared manager state goes through this. Losing ownership
     * does not stop a superseded handshake — where close() cannot interrupt a pending read it runs
     * on for minutes — and its late writes would clear the live session's settling stamp, cancel
     * its poke, close listeners it still needs, or wipe a backoff it had legitimately earned.
     */
    private final void ifOwner(android.bluetooth.BluetoothSocket socket, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    private final java.lang.Object handleHandshake(android.bluetooth.BluetoothSocket socket, java.lang.String localRadio, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * The status field of a message that carries one, or null when it has none, when the message
     * cannot be parsed, or when the type does not have one.
     *
     * Null is deliberately not a failure: [WppHandshakeSession] only ever treats a non-null,
     * non-zero status as the phone reporting trouble, so a message we fail to decode can never
     * abort a handshake that was going fine.
     */
    private final java.lang.Integer parseStatus(com.andrerinas.openheadunit.connection.NativeAaHandshakeManager.ProtobufMessage msg) {
        return null;
    }
    
    /**
     * Says what a received message actually contained, where that is worth having in a log.
     */
    private final void logReceivedDetail(com.andrerinas.openheadunit.connection.NativeAaHandshakeManager.ProtobufMessage msg) {
    }
    
    private final void sendWifiStartRequest(java.io.OutputStream output, java.lang.String ip, int port) {
    }
    
    /**
     * Declares our protocol version, opening the modern exchange. Real head units send this first
     * — the OEM ZLink app does — while aa-proxy-rs's own dongle does not, which is why it sits
     * behind [com.andrerinas.openheadunit.utils.Settings.nativeWifiVersionExchange].
     *
     * The version numbers are a guess and known to be one; see [WppHandshakeSession].
     */
    private final void sendWifiVersionRequest(java.io.OutputStream output) {
    }
    
    /**
     * Sends the credentials.
     *
     * All five fields go out every time, including an empty [bssid] where we have no real address:
     * the schema the other implementations use marks bssid, security_mode and access_point_type
     * `required`, and aa-proxy-rs sets an empty string on the one path where it has no MAC rather
     * than dropping the field. Omitting it risks a strict parser rejecting the whole message, which
     * would surface as silence rather than as the specific refusal an empty one produces.
     *
     * [transport] picks the access-point type: DYNAMIC for a hotspot, matching both reference
     * implementations, and STATIC for a WiFi Direct group as before.
     */
    private final void sendWifiSecurityResponse(java.io.OutputStream output, java.lang.String ssid, java.lang.String key, java.lang.String bssid, com.andrerinas.openheadunit.aap.NativeTransport transport) {
    }
    
    private final void sendProtobuf(java.io.OutputStream output, byte[] data, int type) {
    }
    
    private final com.andrerinas.openheadunit.connection.NativeAaHandshakeManager.ProtobufMessage readProtobuf(java.io.DataInputStream input) {
        return null;
    }
    
    public final void stop() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0014\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0000\u00a2\u0006\u0002\b\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/andrerinas/openheadunit/connection/NativeAaHandshakeManager$Companion;", "", "()V", "AA_UUID", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "CREDENTIALS_WAIT_MS", "", "HFP_UUID", "PORT_ENSURE_MS", "PORT_WAIT_MS", "checkCompatibility", "", "context", "Landroid/content/Context;", "externalBtDiagnostic", "", "externalBtOverridden", "filterSecondaryServiceNames", "", "primaryServiceName", "allServiceNames", "filterSecondaryServiceNames$com_andrerinas_headunitrevived_0_3_12_githubDebug", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Which of [allServiceNames] are secondary Bluetooth radios, i.e. not [primaryServiceName]
         * (dual-Bluetooth-radio head units). Pure and unit-testable: identity is by system
         * service name, not MAC address, since BluetoothAdapter.getAddress() returns the fixed
         * placeholder "02:00:00:00:00:00" for any non-privileged app on every device since
         * Android 6.0 (API 23), so every real adapter instance looks identical by address alone.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> filterSecondaryServiceNames$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.NotNull()
        java.lang.String primaryServiceName, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> allServiceNames) {
            return null;
        }
        
        /**
         * The one-line explanation to log and show when this unit's Bluetooth is an external
         * module, or null when it isn't. Kept here so the handshake manager and the settings
         * compatibility probe say exactly the same thing.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String externalBtDiagnostic() {
            return null;
        }
        
        /**
         * Whether to run the Bluetooth route anyway on a unit [externalBtDiagnostic] flagged.
         *
         * A manually configured secondary Bluetooth service is the user telling us which radio to
         * use, having found one automatic enumeration missed. That is exactly the case the
         * detection cannot see, so it must not be the one case we refuse to try — the diagnostic
         * still goes in the log either way.
         */
        public final boolean externalBtOverridden(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        public final boolean checkCompatibility(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/connection/NativeAaHandshakeManager$ProtobufMessage;", "", "type", "", "payload", "", "(I[B)V", "getPayload", "()[B", "getType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class ProtobufMessage {
        private final int type = 0;
        @org.jetbrains.annotations.NotNull()
        private final byte[] payload = null;
        
        public ProtobufMessage(int type, @org.jetbrains.annotations.NotNull()
        byte[] payload) {
            super();
        }
        
        public final int getType() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] getPayload() {
            return null;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.connection.NativeAaHandshakeManager.ProtobufMessage copy(int type, @org.jetbrains.annotations.NotNull()
        byte[] payload) {
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
     * The credentials to hand the phone, as one value.
     *
     * Four separate fields were written by WifiDirectManager's delivery thread and read by the
     * handshake coroutine with no synchronisation, which allowed two failures. A read could see the
     * SSID and passphrase of one group beside the BSSID of another, and Gearhead joins with a
     * WifiNetworkSpecifier matching SSID *and* BSSID under a full mask, so it rejects the pair with
     * no clue as to why. And the null check and the `!!` that followed it were separate reads, so an
     * invalidate landing between them threw a KotlinNullPointerException that surfaced as
     * "Handshake error: null" and named nothing.
     *
     * One immutable snapshot behind one volatile reference: a reader gets all four fields from the
     * same group or none of them, and reads them once.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/andrerinas/openheadunit/connection/NativeAaHandshakeManager$WifiCredentials;", "", "ssid", "", "psk", "ip", "bssid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBssid", "()Ljava/lang/String;", "getIp", "getPsk", "getSsid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class WifiCredentials {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ssid = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String psk = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ip = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String bssid = null;
        
        public WifiCredentials(@org.jetbrains.annotations.NotNull()
        java.lang.String ssid, @org.jetbrains.annotations.NotNull()
        java.lang.String psk, @org.jetbrains.annotations.NotNull()
        java.lang.String ip, @org.jetbrains.annotations.NotNull()
        java.lang.String bssid) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSsid() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPsk() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIp() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBssid() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.connection.NativeAaHandshakeManager.WifiCredentials copy(@org.jetbrains.annotations.NotNull()
        java.lang.String ssid, @org.jetbrains.annotations.NotNull()
        java.lang.String psk, @org.jetbrains.annotations.NotNull()
        java.lang.String ip, @org.jetbrains.annotations.NotNull()
        java.lang.String bssid) {
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