package com.andrerinas.openheadunit.aap;

/**
 * Whether the user's chosen connection types allow any wireless transport to run.
 *
 * [Settings.connectionModes] already hides the Wireless Connection settings when WiFi is not
 * chosen, but [Settings.wifiConnectionMode] keeps its stored value (Native AA by default). Without
 * this gate a USB-only user still got a P2P group or hotspot route plus the Bluetooth handshake,
 * and the phone switched to wireless as soon as it came into range — with the setting that would
 * turn it off hidden from view.
 *
 * Self mode is unaffected: it starts its own loopback server directly, not through
 * [AapService.initWifiMode].
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001c\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WirelessScopePolicy;", "", "()V", "NO_WIRELESS_MODE", "", "allowsWireless", "", "connectionModes", "", "Lcom/andrerinas/openheadunit/utils/Settings$ConnectionMode;", "effectiveMode", "storedMode", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class WirelessScopePolicy {
    
    /**
     * Mode 0 (Manual) starts no server, discovery, P2P group, hotspot route or handshake.
     */
    public static final int NO_WIRELESS_MODE = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.WirelessScopePolicy INSTANCE = null;
    
    private WirelessScopePolicy() {
        super();
    }
    
    /**
     * An empty selection means nothing was chosen yet, which shows (and allows) everything.
     */
    public final boolean allowsWireless(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.andrerinas.openheadunit.utils.Settings.ConnectionMode> connectionModes) {
        return false;
    }
    
    /**
     * The wireless mode to actually bring up for the stored [storedMode] and chosen types.
     */
    public final int effectiveMode(int storedMode, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.andrerinas.openheadunit.utils.Settings.ConnectionMode> connectionModes) {
        return 0;
    }
}