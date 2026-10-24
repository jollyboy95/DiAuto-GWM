package com.andrerinas.openheadunit.utils;

/**
 * Manages WiFi Hotspot (tethering) using reflection + dexmaker.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001&B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00012\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\fH\u0002J\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u000eJ \u0010\u001f\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u000eH\u0002J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u000eH\u0002J\u0018\u0010#\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u000eH\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/andrerinas/openheadunit/utils/HotspotManager;", "", "()V", "AP_STATE_TIMEOUT_MS", "", "CALLBACK_CLASS", "", "RESTART_SETTLE_MS", "TAG", "TETHERING_WIFI", "", "cachedCallbackClass", "Ljava/lang/Class;", "startInFlight", "", "awaitApUp", "context", "Landroid/content/Context;", "buildTetheringRequest", "createTetheringCallback", "describeApUp", "configured", "band", "Lcom/andrerinas/openheadunit/aap/ApBand;", "hasApInterface", "isApUp", "noOpCallback", "type", "restart", "setHotspotEnabled", "enabled", "startOnBand", "Lcom/andrerinas/openheadunit/utils/HotspotManager$BandOutcome;", "tryConnectivityManager", "tryLegacyWifiManager", "tryTetheringManager", "warnIfRadioLeftDown", "", "BandOutcome", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class HotspotManager {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "OPENHU_WIFI";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CALLBACK_CLASS = "android.net.ConnectivityManager$OnStartTetheringCallback";
    
    /**
     * How long to give the framework to actually bring an access point up.
     */
    private static final long AP_STATE_TIMEOUT_MS = 6000L;
    
    /**
     * How long to leave the access point down so a joined client notices it has gone.
     */
    private static final long RESTART_SETTLE_MS = 2000L;
    
    /**
     * TetheringManager.TETHERING_WIFI.
     */
    private static final int TETHERING_WIFI = 0;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Class<?> cachedCallbackClass;
    
    /**
     * Whether a start is already running. Bringing an access point up takes up to
     * [AP_STATE_TIMEOUT_MS] per band, and more than one caller asks for it: the credentials
     * provider auto-enables, and every "still waiting for credentials" refresh can ask again. Two
     * overlapping sweeps race each other's bands and end with a log claiming the access point came
     * up twice, on both of them.
     */
    @kotlin.jvm.Volatile()
    private static volatile boolean startInFlight = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.HotspotManager INSTANCE = null;
    
    private HotspotManager() {
        super();
    }
    
    /**
     * Takes the access point down and brings it straight back up.
     *
     * Removing the network is the only way this app can put a phone off it — nothing in the public
     * API disconnects a client from your own access point, and the one thing that comes close,
     * `SoftApConfiguration`'s blocked-client list, needs the same `setSoftApConfiguration()` call
     * that head units routinely refuse outright. So the network has to go; it does not have to stay
     * gone. Bringing it back here costs seconds nobody is waiting through, where leaving it down
     * charges the same seconds to the next connection, with the phone waiting.
     *
     * Putting it back is the part that is not free, and it is asked for **once** — measured rather
     * than assumed. Tearing an access point down and asking for it again is the sequence some
     * drivers handle worst: hostapd begins its channel scan before the interface is back, the scan
     * returns `ENODEV`, and it aborts instead of starting. Asking again at this layer does not beat
     * that. Across three runs, **nine** asks spaced ~12.5 s apart failed with that same signature
     * and not one recovered; the single bring-up that did succeed came from a start posted **127 ms**
     * behind a failed one — 270 ms in an earlier capture — landing in a window open for a few hundred
     * milliseconds and shut long before this layer can ask again. Where the hardware handles a
     * stop/start cleanly one ask is all that was ever needed; where it does not, the access point
     * stays down and the next connection's auto-enable brings it back, which is the cost this
     * restart exists to avoid, paid only on hardware that will not cooperate — rather than that same
     * cost plus half a minute of asking that never works.
     *
     * There is also a window this cannot close. Between the two calls the access point is genuinely
     * down, and a process killed outright in that window — `am force-stop`, or the system reclaiming
     * the app — runs none of the code below, so the hotspot stays off. Measured, and bounded rather
     * than fixed: the next connection's `SoftApCredentialsProvider` auto-enable switches it back on,
     * which is the same cost the restart exists to avoid paying, not a permanent break. Shrinking
     * [RESTART_SETTLE_MS] narrows the window; nothing removes it.
     */
    public final boolean restart(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean setHotspotEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean enabled) {
        return false;
    }
    
    /**
     * What to say about an access point that is up, given whether the band request was accepted.
     *
     * Naming a band we only *asked* for is how a log ends up contradicting the radio. Measured on a
     * unit that refuses `setSoftApConfiguration()`: this said 2.4 GHz while the access point that
     * came up 8.7 s later was on 5745 MHz, so a reader with only the log would have concluded the
     * exact opposite of what happened. The band is not readable from an ordinary app — `SoftApInfo`
     * arrives on a callback that needs NETWORK_SETTINGS — so the honest line names what was
     * requested and what became of the request, and nothing else.
     */
    private final java.lang.String describeApUp(boolean configured, com.andrerinas.openheadunit.aap.ApBand band) {
        return null;
    }
    
    private final com.andrerinas.openheadunit.utils.HotspotManager.BandOutcome startOnBand(android.content.Context context, boolean enabled, com.andrerinas.openheadunit.aap.ApBand band) {
        return null;
    }
    
    /**
     * Says so when a failed start has left the radio with neither a station nor an access point.
     *
     * The framework drops the station to free the radio for tethering; if the attempt then backs
     * out, nothing brings it back. This app cannot: setWifiEnabled() is a no-op at its target SDK,
     * so the only way out is the user toggling WiFi. Worth one clear line, because the symptom
     * downstream is a WiFi Direct group that never forms and no obvious reason why.
     */
    private final void warnIfRadioLeftDown(android.content.Context context) {
    }
    
    /**
     * Polls until a soft AP is up or the timeout expires.
     *
     * `getWifiApState()` is hidden but widely present; where it is blocked, fall back to looking
     * for the interface, which is what a running access point is from the outside anyway.
     */
    private final boolean awaitApUp(android.content.Context context) {
        return false;
    }
    
    /**
     * Whether a soft AP is running right now, by framework state or, failing that, by interface.
     */
    private final boolean isApUp(android.content.Context context) {
        return false;
    }
    
    /**
     * Whether any interface is one this device is hosting an access point on. Uses the same policy
     * object SoftApCredentialsProvider uses to find the AP it will advertise, so the two cannot
     * disagree about whether one exists.
     */
    private final boolean hasApInterface(android.content.Context context) {
        return false;
    }
    
    private final boolean tryConnectivityManager(android.content.Context context, boolean enabled) {
        return false;
    }
    
    /**
     * A do-nothing implementation of [type], or null if one cannot be made.
     *
     * `TetheringManager.StartTetheringCallback` is an interface whose methods are all default
     * no-ops, so a [java.lang.reflect.Proxy] is enough and none of DexMaker's problems apply. If
     * it ever turns out not to be an interface, returning null makes the caller skip the request
     * rather than fall back to passing null and crashing again.
     *
     * The handler answers `hashCode`/`equals`/`toString` itself: returning null from those is its
     * own NullPointerException the first time anything logs or hashes the object.
     */
    private final java.lang.Object noOpCallback(java.lang.Class<?> type) {
        return null;
    }
    
    /**
     * A `TetheringRequest` for WiFi tethering, via its Builder, or null if it cannot be built.
     * Only needed on platforms that dropped the plain `(int, …)` overload of startTethering.
     */
    private final java.lang.Object buildTetheringRequest() {
        return null;
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    private final java.lang.Object createTetheringCallback(android.content.Context context) {
        return null;
    }
    
    private final boolean tryTetheringManager(android.content.Context context, boolean enabled) {
        return false;
    }
    
    private final boolean tryLegacyWifiManager(android.content.Context context, boolean enabled) {
        return false;
    }
    
    /**
     * What one band's worth of start attempts achieved: whether anything was tried, whether an
     * access point actually came up, and whether the band we asked for ever reached the framework.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/andrerinas/openheadunit/utils/HotspotManager$BandOutcome;", "", "attempted", "", "up", "configured", "(ZZZ)V", "getAttempted", "()Z", "getConfigured", "getUp", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class BandOutcome {
        private final boolean attempted = false;
        private final boolean up = false;
        private final boolean configured = false;
        
        public BandOutcome(boolean attempted, boolean up, boolean configured) {
            super();
        }
        
        public final boolean getAttempted() {
            return false;
        }
        
        public final boolean getUp() {
            return false;
        }
        
        public final boolean getConfigured() {
            return false;
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.utils.HotspotManager.BandOutcome copy(boolean attempted, boolean up, boolean configured) {
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