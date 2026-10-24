package com.andrerinas.openheadunit.utils;

/**
 * Reads an interface's MAC from outside the framework, for when
 * `NetworkInterface.getHardwareAddress()` returns null or a placeholder — the norm for ordinary
 * apps since Android 6.0.
 *
 * Separate from `WifiDirectManager.getMacFromShell()` on purpose: that one carries `[BUG_FIX]`
 * annotations and a six-deep chain tuned against specific hardware, and sharing it would risk the
 * WiFi Direct path to serve the hotspot one. ~30 duplicated lines, minus its leak — it never
 * destroys the `ip link` process or closes its streams, and this runs on a poll loop.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/andrerinas/openheadunit/utils/InterfaceMacReader;", "", "()V", "PLACEHOLDERS", "", "", "fromIpLink", "iface", "fromSysfs", "read", "usableOrNull", "mac", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class InterfaceMacReader {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<java.lang.String> PLACEHOLDERS = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.InterfaceMacReader INSTANCE = null;
    
    private InterfaceMacReader() {
        super();
    }
    
    /**
     * The MAC of [iface] from sysfs, falling back to `ip link`, or null if neither yields a real one.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String read(@org.jetbrains.annotations.NotNull()
    java.lang.String iface) {
        return null;
    }
    
    /**
     * `/sys/class/net/<iface>/address`. Readable without root on most head units.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromSysfs(@org.jetbrains.annotations.NotNull()
    java.lang.String iface) {
        return null;
    }
    
    /**
     * `ip link show <iface>`, parsed for its `link/ether` line.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromIpLink(@org.jetbrains.annotations.NotNull()
    java.lang.String iface) {
        return null;
    }
    
    /**
     * [mac] normalised to lower case, or null if it is blank or a masking placeholder.
     */
    private final java.lang.String usableOrNull(java.lang.String mac) {
        return null;
    }
}