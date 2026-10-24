package com.andrerinas.openheadunit.location;

/**
 * A user-defined place (e.g. "Home", "Garage"): a circular area that sets a light or
 * dark appearance while the device is inside it. Only used by the "Location (by area)"
 * theme mode; whether it affects the app UI, Android Auto, or both depends on which
 * selector is set to that mode.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u000bH\u00c6\u0003J\u000e\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001fJE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u000e\u0010!\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\u0006\u0010&\u001a\u00020\'J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006*"}, d2 = {"Lcom/andrerinas/openheadunit/location/GeofenceLocation;", "", "id", "", "name", "latitude", "", "longitude", "radiusMeters", "", "forceNight", "", "(Ljava/lang/String;Ljava/lang/String;DDFZ)V", "getForceNight", "()Z", "getId", "()Ljava/lang/String;", "getLatitude", "()D", "getLongitude", "getName", "getRadiusMeters", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "contains", "location", "Landroid/location/Location;", "copy", "distanceTo", "equals", "other", "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class GeofenceLocation {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final double latitude = 0.0;
    private final double longitude = 0.0;
    private final float radiusMeters = 0.0F;
    
    /**
     * true -> dark inside this area, false -> light inside this area.
     */
    private final boolean forceNight = false;
    public static final float DEFAULT_RADIUS_METERS = 150.0F;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.location.GeofenceLocation.Companion Companion = null;
    
    public GeofenceLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double latitude, double longitude, float radiusMeters, boolean forceNight) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    public final float getRadiusMeters() {
        return 0.0F;
    }
    
    /**
     * true -> dark inside this area, false -> light inside this area.
     */
    public final boolean getForceNight() {
        return false;
    }
    
    public final float distanceTo(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
        return 0.0F;
    }
    
    public final boolean contains(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.json.JSONObject toJson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final float component5() {
        return 0.0F;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.location.GeofenceLocation copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double latitude, double longitude, float radiusMeters, boolean forceNight) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0014\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/andrerinas/openheadunit/location/GeofenceLocation$Companion;", "", "()V", "DEFAULT_RADIUS_METERS", "", "currentPlace", "Lcom/andrerinas/openheadunit/location/GeofenceLocation;", "context", "Landroid/content/Context;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "fromJson", "o", "Lorg/json/JSONObject;", "listFromJson", "", "json", "", "listToJson", "list", "resolveNight", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.location.GeofenceLocation fromJson(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject o) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.andrerinas.openheadunit.location.GeofenceLocation> listFromJson(@org.jetbrains.annotations.Nullable()
        java.lang.String json) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String listToJson(@org.jetbrains.annotations.NotNull()
        java.util.List<com.andrerinas.openheadunit.location.GeofenceLocation> list) {
            return null;
        }
        
        /**
         * The place the device is currently inside, or null if outside all places /
         * no usable location. Uses the last known fix regardless of age (a parked head
         * unit rarely gets a fresh fix, but its last position is still where it is).
         */
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.location.GeofenceLocation currentPlace(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.utils.Settings settings) {
            return null;
        }
        
        /**
         * Resolves the "Location (by area)" appearance: the current place's day/night if
         * inside one, otherwise the user's configured outside-places default.
         */
        public final boolean resolveNight(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.utils.Settings settings) {
            return false;
        }
    }
}