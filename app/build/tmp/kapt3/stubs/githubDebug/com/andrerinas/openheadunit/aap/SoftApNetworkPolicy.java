package com.andrerinas.openheadunit.aap;

/**
 * Which network interface is the hotspot we are hosting.
 *
 * No public API answers this — `WifiManager` will not give an ordinary app its own soft AP's
 * address — so the interface is recognised from outside, by shape as well as name: vendors are
 * inconsistent, and ZLink's head unit serves Android Auto off a plain `wlan0`. Getting it wrong
 * hands the phone an address it cannot reach.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J,\u0010\u0013\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/andrerinas/openheadunit/aap/SoftApNetworkPolicy;", "", "()V", "ETHERNET_NAME", "Lkotlin/text/Regex;", "EXCLUDED_PREFIXES", "", "", "PREFERRED_PREFIXES", "eligible", "Lcom/andrerinas/openheadunit/aap/ApInterfaceCandidate;", "candidates", "stationIpv4", "isApHost", "", "candidate", "isEligible", "isExcluded", "name", "pickApInterface", "namedInterface", "rank", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class SoftApNetworkPolicy {
    
    /**
     * Names we prefer, best first. An interface that matches none of these is still eligible —
     * a vendor can call it anything — it just loses to one that does.
     *
     * MediaTek's `ra0`/`rai0` access points are deliberately absent. Two letters is too loose a
     * prefix to match on, and they do not need to be here: an unrecognised name is still eligible,
     * so once `apcli*` is excluded below, `ra0` wins on an MTK unit by being what is left.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> PREFERRED_PREFIXES = null;
    
    /**
     * Interfaces that can hold a site-local IPv4 and are never an access point.
     *
     * `p2p-*` is the WiFi Direct transport, which has its own credential source. `tun*`/`dummy*`
     * is this app's own VPN service, which parks a 10.x address on the device while it runs.
     *
     * `apcli*` and `sta*` are stations wearing an access point's name. On MediaTek and Ralink
     * drivers `apcli0` is the AP *client* — the interface that joins someone else's network,
     * configured `mode: sta` — while `ra0` is the access point; without this exclusion `apcli0`
     * would rank best of all, since it starts with "ap". `sta*` is the same trap spelled the
     * obvious way, and is what aa-proxy-rs names its own managed station interface.
     *
     * `seth_lte*` is a Unisoc cellular bridge. It is up and holds a private address the moment
     * there is signal, so with the real access point down it was the only candidate left and got
     * advertised as one — the right network name against an address no phone could reach.
     *
     * This list is a guess about which unknown interfaces are *not* access points, and it has
     * needed extending three times. [NativeCredentialsPolicy.shouldPublishCredentials] is the
     * defence that does not depend on knowing every name in advance.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> EXCLUDED_PREFIXES = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.text.Regex ETHERNET_NAME = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.SoftApNetworkPolicy INSTANCE = null;
    
    private SoftApNetworkPolicy() {
        super();
    }
    
    /**
     * The interface most likely to be our access point, or null if none qualifies. Must be up and
     * hold a site-local IPv4 — a running AP has one, and it is the address the phone is given.
     *
     * [stationIpv4] is this device's address on the WiFi network it is *joined to*, if any. It is
     * the one thing that reliably separates the access point from the station interface: on a real
     * head unit the AP runs as `wlan2` while `wlan0` is the station, and the two are
     * indistinguishable by name. Pass null when the device is not associated with anything.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.aap.ApInterfaceCandidate pickApInterface(@org.jetbrains.annotations.NotNull()
    java.util.List<com.andrerinas.openheadunit.aap.ApInterfaceCandidate> candidates, @org.jetbrains.annotations.Nullable()
    java.lang.String stationIpv4, @org.jetbrains.annotations.NotNull()
    java.lang.String namedInterface) {
        return null;
    }
    
    /**
     * Everything [pickApInterface] considered, for a caller that wants to say so. More than one
     * survivor means the choice came down to the name, which is a guess — worth a log line, since
     * picking wrong hands the phone an address it cannot reach and nothing else reports it.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.andrerinas.openheadunit.aap.ApInterfaceCandidate> eligible(@org.jetbrains.annotations.NotNull()
    java.util.List<com.andrerinas.openheadunit.aap.ApInterfaceCandidate> candidates, @org.jetbrains.annotations.Nullable()
    java.lang.String stationIpv4) {
        return null;
    }
    
    /**
     * Whether [candidate] is an access point this device is hosting.
     *
     * Same rules as [pickApInterface] applied to one interface, for callers asking "is there an
     * access point at all" rather than "which of these is it".
     */
    public final boolean isApHost(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.ApInterfaceCandidate candidate, @org.jetbrains.annotations.Nullable()
    java.lang.String stationIpv4) {
        return false;
    }
    
    private final boolean isEligible(com.andrerinas.openheadunit.aap.ApInterfaceCandidate candidate, java.lang.String stationIpv4) {
        return false;
    }
    
    private final boolean isExcluded(java.lang.String name) {
        return false;
    }
    
    /**
     * Lower is better; anything unrecognised sorts last but is still usable.
     */
    private final int rank(java.lang.String name) {
        return 0;
    }
}