package com.andrerinas.openheadunit.utils;

/**
 * Helper to request the runtime location permission required for configuring a Wi‑Fi hotspot
 * on Android 10 (API 29) and newer.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/utils/PermissionHelper;", "", "()V", "REQUEST_LOCATION", "", "ensureLocationPermission", "", "activity", "Landroid/app/Activity;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class PermissionHelper {
    private static final int REQUEST_LOCATION = 1001;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.PermissionHelper INSTANCE = null;
    
    private PermissionHelper() {
        super();
    }
    
    /**
     * Returns true if the app already has ACCESS_FINE_LOCATION permission.
     * If not, it launches the Android permission dialog (must be called from an Activity).
     */
    public final boolean ensureLocationPermission(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return false;
    }
}