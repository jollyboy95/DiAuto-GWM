package com.andrerinas.openheadunit.aap;

/**
 * The window between "we sent the phone our WiFi credentials (Type 3)" and "the phone's TCP
 * session actually landed", and what the rest of the app is allowed to do during it.
 *
 * The phone still has to associate, run WPS and get a DHCP lease after Type 3 goes out —
 * measured at 21 s on slow hardware, far longer than the handshake itself. Touching the Bluetooth
 * radio or taking the P2P group owner off-channel in that window makes the phone abandon the
 * join, which it shows as "Obtaining IP address" forever.
 *
 * Split out as a pure object so the timing rules are unit-testable without Android, and so
 * [com.andrerinas.openheadunit.connection.NativeAaHandshakeManager] and
 * [com.andrerinas.openheadunit.connection.WifiDirectManager] share one definition instead of
 * re-deriving it.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004J \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004J \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u001e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bJ\u001e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0006J\u0016\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/andrerinas/openheadunit/aap/NativeHandoffPolicy;", "", "()V", "HANDSHAKE_TIMEOUT_MS", "", "MAX_CONSECUTIVE_HANDSHAKE_FAILURES", "", "MAX_SETTLE_MS", "SETTLE_TIMEOUT_MS", "SILENT_POKE_WARN_INTERVAL", "isHandshaking", "", "startedAtMs", "nowMs", "timeoutMs", "isSettling", "settlingSinceMs", "isWithinWindow", "sinceMs", "shouldPoke", "settling", "handshakeInFlight", "sessionConnected", "shouldRestartDiscovery", "nativeAaMode", "hadClient", "hasClient", "shouldServeHandshake", "consecutiveFailures", "shouldWarnPhoneNeverCallsBack", "pokesSinceLastAccept", "everAccepted", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class NativeHandoffPolicy {
    
    /**
     * How long to keep Bluetooth open waiting for the phone's TCP session before giving up on
     * this handoff and letting the wake poke retry. Generous on purpose: the cost of waiting too
     * long is one slow retry, the cost of waiting too little is a dead connection.
     */
    public static final long SETTLE_TIMEOUT_MS = 45000L;
    
    /**
     * Hard ceiling on the settling window once the phone's own progress reports
     * ([com.andrerinas.openheadunit.aap.WppAction.ExtendSettle]) have extended it. Without a cap,
     * a phone that keeps saying "still joining" and never arrives holds the Bluetooth channel
     * open and the wake poke suppressed indefinitely. Three 15 s extensions past the base window.
     */
    public static final long MAX_SETTLE_MS = 90000L;
    
    /**
     * Longest a single credential exchange can legitimately take: the up-to-60 s wait for the
     * P2P group's credentials, plus the 15 s wait for the phone's Type 2, plus slack. Past this
     * the exchange is over however it ended, so treating it as live only suppresses recovery.
     */
    public static final long HANDSHAKE_TIMEOUT_MS = 90000L;
    
    /**
     * How many wake pokes the phone may answer without ever opening the Android Auto channel
     * before we say so in the log. Three is roughly 45 s of the retry cadence — long enough that
     * a phone which is merely slow to react has had its chance.
     */
    public static final int SILENT_POKE_WARN_INTERVAL = 3;
    
    /**
     * How many handshakes may time out waiting for the phone's Type 2, back to back, before we
     * stop serving new ones. Roughly a minute of trying at the phone's ~12 s reconnect cadence.
     */
    public static final int MAX_CONSECUTIVE_HANDSHAKE_FAILURES = 5;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.NativeHandoffPolicy INSTANCE = null;
    
    private NativeHandoffPolicy() {
        super();
    }
    
    /**
     * Whether we are still inside the post-Type-3 settling window.
     *
     * [settlingSinceMs] is an elapsed-realtime stamp, or 0 when no handoff is settling. The
     * window is bounded so a missed reset can't latch the state true forever.
     */
    public final boolean isSettling(long settlingSinceMs, long nowMs, long timeoutMs) {
        return false;
    }
    
    /**
     * Whether a credential exchange is still in progress.
     *
     * [startedAtMs] is an elapsed-realtime stamp, or 0 when no handshake is running. Bounded, and
     * not merely as a belt-and-braces measure: on head units where closing the Bluetooth socket
     * does not unblock a pending `readFully()`, the handshake coroutine never reaches its cleanup.
     * A plain boolean latched true there for the life of the process, stopping the wake poke and
     * making `WifiDirectManager`'s join watchdog defer recovery forever.
     */
    public final boolean isHandshaking(long startedAtMs, long nowMs, long timeoutMs) {
        return false;
    }
    
    /**
     * True when [sinceMs] is a live stamp (non-zero, not in the future) less than [timeoutMs] old.
     */
    private final boolean isWithinWindow(long sinceMs, long nowMs, long timeoutMs) {
        return false;
    }
    
    /**
     * Whether the wake poke may run. The poke opens a real RFCOMM connection to the phone's
     * HFP/HSP service record, so it must stay off the radio while a handshake is exchanging
     * credentials, while a handoff is settling, and once a session is up (there is nothing left
     * to wake).
     */
    public final boolean shouldPoke(boolean settling, boolean handshakeInFlight, boolean sessionConnected) {
        return false;
    }
    
    /**
     * Whether to warn that the phone answers our wake pokes but never connects back.
     *
     * That combination has one common cause and this app cannot fix it: the phone's Android Auto
     * is bound to a *different* Bluetooth device that also advertises the Android Auto service
     * record — typically the head unit's own OEM module, a separate chip Android on the unit
     * cannot see, still advertising after its OEM app stopped answering. Gearhead reconnects to it
     * every 12 s and discards our pokes as `IGNORE_DIFFERENT_BLUETOOTH_DEVICE`, while our log
     * shows successful pokes and nothing wrong.
     *
     * [everAccepted] gates it to units that have never once been reached, so a unit that connects
     * normally and then has a bad run never sees it. Periodic rather than one-shot so it is still
     * visible in a log exported long after the trouble started.
     */
    public final boolean shouldWarnPhoneNeverCallsBack(int pokesSinceLastAccept, boolean everAccepted) {
        return false;
    }
    
    /**
     * Whether to serve an incoming Android Auto connection at all.
     *
     * Bounds a leak we cannot otherwise close. The wait for the phone's Type 2 is a blocking read
     * on a background coroutine, and where `close()` does not interrupt a pending read that
     * coroutine never returns — its `Dispatchers.IO` thread is stranded for the life of the
     * process, and `cancel()` cannot help because a blocking JNI read has no suspension point.
     * The thread cannot be reclaimed, so the only lever is to stop creating them.
     *
     * A hard stop rather than a growing delay, because this failure is not transient: if the
     * stack drops our write, the 200th attempt fails exactly like the first, and each one costs a
     * thread and radio time for nothing. The counter resets on a successful handshake, on
     * stop()/start(), and on a manual poke — so the user's own "try again" is the way back.
     */
    public final boolean shouldServeHandshake(int consecutiveFailures) {
        return false;
    }
    
    /**
     * Whether a client leaving the P2P group should restart the peer-discovery loop.
     *
     * Never on the Native AA path: we run a *quiet* host there and the phone finds us by SSID
     * from the credentials we handed it over Bluetooth, never by discovery. `discoverPeers()`
     * takes the group owner off-channel every 10 s, which is precisely what stops a retrying
     * phone from ever completing DHCP.
     */
    public final boolean shouldRestartDiscovery(boolean nativeAaMode, boolean hadClient, boolean hasClient) {
        return false;
    }
}