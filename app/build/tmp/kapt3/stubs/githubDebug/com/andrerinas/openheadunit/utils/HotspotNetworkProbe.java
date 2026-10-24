package com.andrerinas.openheadunit.utils;

/**
 * Read-only snapshot of how this device's hotspot and network interfaces look to the app, for the
 * diagnostic report. It exists for units where the framework says the hotspot is enabled but no
 * interface looks like an access point, which the connection log alone cannot explain because it
 * lists only interfaces that are up.
 *
 * It never changes a setting or starts anything. Addresses are classified, not printed, and the
 * hotspot name and passphrase are never read into the report.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\b\u001a\u00020\tJ$\u0010\r\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0082\b\u00a2\u0006\u0002\u0010\u0011J2\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u0010H\u0002J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/andrerinas/openheadunit/utils/HotspotNetworkProbe;", "", "()V", "TETHER_STATE_CHANGED", "", "WIFI_AP_STATE_CHANGED", "apBandAndChannel", "", "context", "Landroid/content/Context;", "interfaces", "kernelInterfaceNames", "report", "safe", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "section", "", "out", "", "title", "stickyExtras", "action", "tetheringQueries", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class HotspotNetworkProbe {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String WIFI_AP_STATE_CHANGED = "android.net.wifi.WIFI_AP_STATE_CHANGED";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TETHER_STATE_CHANGED = "android.net.conn.TETHER_STATE_CHANGED";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.HotspotNetworkProbe INSTANCE = null;
    
    private HotspotNetworkProbe() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> report(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final void section(java.util.List<java.lang.String> out, java.lang.String title, kotlin.jvm.functions.Function0<? extends java.util.List<java.lang.String>> block) {
    }
    
    private final java.util.List<java.lang.String> interfaces() {
        return null;
    }
    
    private final java.util.List<java.lang.String> stickyExtras(android.content.Context context, java.lang.String action) {
        return null;
    }
    
    private final java.util.List<java.lang.String> tetheringQueries(android.content.Context context) {
        return null;
    }
    
    private final java.util.List<java.lang.String> apBandAndChannel(android.content.Context context) {
        return null;
    }
    
    private final java.util.List<java.lang.String> kernelInterfaceNames() {
        return null;
    }
    
    private final <T extends java.lang.Object>T safe(kotlin.jvm.functions.Function0<? extends T> block) {
        return null;
    }
}