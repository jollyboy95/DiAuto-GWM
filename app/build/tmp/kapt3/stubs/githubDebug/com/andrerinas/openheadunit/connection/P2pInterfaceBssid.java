package com.andrerinas.openheadunit.connection;

/**
 * Some head units mask hardwareAddress but assign their P2P or hotspot interface a MAC-derived
 * IPv6 link-local address. Reverse the modified EUI-64 encoding (RFC 4291 Appendix A).
 * Opaque/privacy IPv6 identifiers cannot be decoded and must not become a BSSID.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u001c\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ\u0016\u0010\f\u001a\u0004\u0018\u00010\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/connection/P2pInterfaceBssid;", "", "()V", "decode", "", "address", "", "describe", "interfaceName", "describeLinkLocal", "linkLocal", "", "fromAddresses", "addresses", "read", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class P2pInterfaceBssid {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.P2pInterfaceBssid INSTANCE = null;
    
    private P2pInterfaceBssid() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String read(@org.jetbrains.annotations.Nullable()
    java.lang.String interfaceName) {
        return null;
    }
    
    /**
     * Why [read] found nothing, for the log a reporter sends: no interface name, no IPv6
     * link-local at all, or only opaque (RFC 7217 / privacy) identifiers that carry no MAC.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String describe(@org.jetbrains.annotations.Nullable()
    java.lang.String interfaceName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String describeLinkLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String interfaceName, @org.jetbrains.annotations.NotNull()
    java.util.List<byte[]> linkLocal) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromAddresses(@org.jetbrains.annotations.NotNull()
    java.util.List<byte[]> addresses) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String decode(@org.jetbrains.annotations.NotNull()
    byte[] address) {
        return null;
    }
}