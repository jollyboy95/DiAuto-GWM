package com.andrerinas.openheadunit.utils;

/**
 * Asks the framework whether this device is running an access point.
 *
 * `WifiManager.getWifiApState()` is the soft-AP counterpart to the public `getWifiState()`, but it
 * is not public API, so it is reached by reflection and its constants are written out here. On
 * devices where the non-SDK interface restrictions block it the call throws, which is reported as
 * [SoftApState.UNKNOWN] rather than as "no access point" — a question we could not ask is not a
 * question answered no, and callers treat the two very differently.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/utils/SoftApStateReader;", "", "()V", "WIFI_AP_STATE_ENABLED", "", "read", "Lcom/andrerinas/openheadunit/aap/SoftApState;", "context", "Landroid/content/Context;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class SoftApStateReader {
    private static final int WIFI_AP_STATE_ENABLED = 13;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.SoftApStateReader INSTANCE = null;
    
    private SoftApStateReader() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.SoftApState read(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}