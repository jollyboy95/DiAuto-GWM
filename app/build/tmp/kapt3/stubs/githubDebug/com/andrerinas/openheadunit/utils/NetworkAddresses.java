package com.andrerinas.openheadunit.utils;

/**
 * This device's own address on the WiFi network it has *joined*, as opposed to one it is hosting.
 *
 * Exists because those two are otherwise indistinguishable from the outside: a head unit that runs
 * a soft AP on one radio and a station connection on another shows two `wlan*` interfaces, both up
 * and both holding a site-local IPv4. Knowing the station's address is what lets
 * [com.andrerinas.openheadunit.aap.SoftApNetworkPolicy] rule it out.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/utils/NetworkAddresses;", "", "()V", "fromConnectivityManager", "", "context", "Landroid/content/Context;", "fromWifiManager", "stationIpv4", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class NetworkAddresses {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.NetworkAddresses INSTANCE = null;
    
    private NetworkAddresses() {
        super();
    }
    
    /**
     * The station IPv4, or null when this device is not associated with a WiFi network.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String stationIpv4(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Asks for the WiFi transport specifically rather than the active network: the active one may
     * be the VPN this app itself runs, or the AP, neither of which is the station.
     */
    private final java.lang.String fromConnectivityManager(android.content.Context context) {
        return null;
    }
    
    /**
     * Older devices, and anything the transport query could not answer.
     */
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final java.lang.String fromWifiManager(android.content.Context context) {
        return null;
    }
}