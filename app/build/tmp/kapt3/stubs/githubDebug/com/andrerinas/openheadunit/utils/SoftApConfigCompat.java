package com.andrerinas.openheadunit.utils;

/**
 * Compatibility helper for Android 11+ (API 30) hotspot configuration using
 * the SoftApConfiguration API via reflection.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/andrerinas/openheadunit/utils/SoftApConfigCompat;", "", "()V", "TAG", "", "configureLegacyBand", "", "context", "Landroid/content/Context;", "band", "Lcom/andrerinas/openheadunit/aap/ApBand;", "enableHotspot", "enabled", "readSoftApConfiguration", "wifiManager", "Landroid/net/wifi/WifiManager;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class SoftApConfigCompat {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "SoftApConfigCompat";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.SoftApConfigCompat INSTANCE = null;
    
    private SoftApConfigCompat() {
        super();
    }
    
    /**
     * Enables a Wi‑Fi hotspot with a configurable SSID and a default WPA2‑PSK password.
     * Returns true if the hotspot was successfully configured, false otherwise.
     *
     * The caller must ensure that Wi‑Fi is disabled beforehand (handled by HotspotManager).
     */
    public final boolean enableHotspot(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean enabled, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.ApBand band) {
        return false;
    }
    
    /**
     * The access point this device already has configured, or null if it will not say.
     */
    private final java.lang.Object readSoftApConfiguration(android.net.wifi.WifiManager wifiManager) {
        return null;
    }
    
    /**
     * Sets the band on pre-Android-11 devices, where the access point is described by a
     * `WifiConfiguration` and its band lives in the hidden `apBand` field.
     *
     * Reads the current configuration and writes it back with only that field changed, so the
     * SSID and passphrase the user (or the vendor) set stay as they are — this path never owned
     * them, and inventing values here would rename someone's hotspot behind their back.
     */
    private final boolean configureLegacyBand(android.content.Context context, com.andrerinas.openheadunit.aap.ApBand band) {
        return false;
    }
}