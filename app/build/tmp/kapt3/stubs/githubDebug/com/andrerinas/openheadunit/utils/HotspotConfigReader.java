package com.andrerinas.openheadunit.utils;

/**
 * Reads the SSID and passphrase of the hotspot this device is configured to run.
 *
 * Reflection throughout — neither `getSoftApConfiguration` nor `getWifiApConfiguration` is public
 * API, and both can throw on a locked-down device — so callers want a manual override ahead of it.
 * Shared by `ShareHotspotQrDialog` and the Native AA hotspot transport.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2 = {"Lcom/andrerinas/openheadunit/utils/HotspotConfigReader;", "", "()V", "getSystemHotspotConfig", "Lkotlin/Pair;", "", "context", "Landroid/content/Context;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class HotspotConfigReader {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.HotspotConfigReader INSTANCE = null;
    
    private HotspotConfigReader() {
        super();
    }
    
    /**
     * The configured hotspot as (ssid, passphrase), or null if it cannot be read.
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Pair<java.lang.String, java.lang.String> getSystemHotspotConfig(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}