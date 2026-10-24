package com.andrerinas.openheadunit.location;

/**
 * Process-wide, single source of truth for the device's most recent live location.
 *
 * It aggregates two sources, whichever is available:
 * - the head unit's own GPS (fed from [GpsLocation.onLocationChanged]); and
 * - the phone-forwarded GPS delivered during projection via LocationUpdateIntent
 *   (fed from AapBroadcastReceiver).
 *
 * Kept as a plain object (not tied to AppComponent) so it can be consulted from
 * short-lived receivers and from the locked-boot automation gate without touching
 * credential-encrypted preferences.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tJ \u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0003J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0004J\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/andrerinas/openheadunit/location/LocationHolder;", "", "()V", "MAX_AGE_MS", "", "lastFix", "Landroid/location/Location;", "bestEffortDeviceFix", "context", "Landroid/content/Context;", "bestEffortFix", "providers", "", "", "currentGpsFix", "maxAgeMs", "currentLocation", "geofenceFix", "update", "", "location", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class LocationHolder {
    
    /**
     * Fixes older than this are treated as "no live location".
     */
    public static final long MAX_AGE_MS = 600000L;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile android.location.Location lastFix;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.location.LocationHolder INSTANCE = null;
    
    private LocationHolder() {
        super();
    }
    
    /**
     * Feed a fresh fix from either GPS source. Keeps the newest by timestamp.
     */
    public final void update(@org.jetbrains.annotations.Nullable()
    android.location.Location location) {
    }
    
    /**
     * The freshest known fix within [maxAgeMs], or null if none / too stale.
     * When [context] is provided, also consults the OS last-known GPS fix.
     */
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location currentLocation(@org.jetbrains.annotations.Nullable()
    android.content.Context context, long maxAgeMs) {
        return null;
    }
    
    /**
     * The freshest fix from this head unit's own GPS chip, within [maxAgeMs] - the only kind of
     * fix that may be forwarded to the phone as the car's LOCATION sensor. A network- or
     * passive-derived position must never travel under that label: on a unit whose GPS never
     * locks it is often derived from the very hotspot or P2P group we created. Returns null when
     * the GPS has produced nothing recent, which is the correct answer - the phone then keeps
     * using its own location.
     */
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location currentGpsFix(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long maxAgeMs) {
        return null;
    }
    
    /**
     * The best available fix for geofence containment tests, IGNORING age. A parked
     * head unit may not get a fresh fix for a long time, but its last known position
     * is still exactly where it is, so for "am I inside this area?" the newest known
     * fix (fed or OS last-known) is the right answer regardless of how old it is.
     */
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location geofenceFix(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * A best-effort one-shot fix straight from the OS (getLastKnownLocation), used
     * by the automation gate before any connection exists. Returns null if no
     * permission / provider / cached fix is available.
     */
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location bestEffortDeviceFix(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final android.location.Location bestEffortFix(android.content.Context context, java.util.List<java.lang.String> providers) {
        return null;
    }
}