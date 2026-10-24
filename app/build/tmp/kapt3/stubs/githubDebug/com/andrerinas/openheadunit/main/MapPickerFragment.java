package com.andrerinas.openheadunit.main;

/**
 * Full-screen OpenStreetMap picker (Leaflet in a WebView, tiles fetched over the
 * network). Two modes:
 * - MODE_GEOFENCE: pick center + radius, name it, and configure two independent
 *   capabilities (force a theme with a scope, and/or gate automation), then save/delete.
 * - MODE_POINT: pick a single fixed coordinate used as the shared sunrise/sunset
 *   reference (issue #647). Name / radius / capability toggles are hidden.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 .2\u00020\u0001:\u0002./B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0003J\b\u0010\u001f\u001a\u00020\u0017H\u0002J$\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020\u0017H\u0016J\u001a\u0010(\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010)\u001a\u00020\u0017H\u0002J\b\u0010*\u001a\u00020\u0017H\u0002J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\tH\u0002J\b\u0010-\u001a\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\t0\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/andrerinas/openheadunit/main/MapPickerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "currentLat", "", "currentLon", "currentRadius", "", "editingId", "", "forceNight", "", "mode", "requestLocationPermission", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "saveButton", "Landroid/widget/Button;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "webView", "Landroid/webkit/WebView;", "applyThemeConfigChange", "", "bindViews", "view", "Landroid/view/View;", "callJs", "script", "deleteGeofence", "loadMap", "maybeShowInternetNotice", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "requestOrUseLocation", "resolveInitialState", "save", "name", "useCurrentLocation", "Companion", "JsBridge", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class MapPickerFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_MODE = "mode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_GEOFENCE_ID = "geofenceId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MODE_GEOFENCE = "geofence";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MODE_POINT = "point";
    private com.andrerinas.openheadunit.utils.Settings settings;
    private android.webkit.WebView webView;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button saveButton;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mode = "geofence";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String editingId;
    private double currentLat = 0.0;
    private double currentLon = 0.0;
    private float currentRadius = 150.0F;
    private boolean forceNight = true;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestLocationPermission = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.main.MapPickerFragment.Companion Companion = null;
    
    public MapPickerFragment() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void resolveInitialState() {
    }
    
    private final void bindViews(android.view.View view) {
    }
    
    /**
     * Shows the "internet required" notice once (with a don't-show-again option).
     */
    private final void maybeShowInternetNotice() {
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    private final void loadMap() {
    }
    
    private final void callJs(java.lang.String script) {
    }
    
    private final void requestOrUseLocation() {
    }
    
    private final void useCurrentLocation() {
    }
    
    /**
     * Applies a place/coordinate change right away: re-evaluates the running app theme
     * manager (recreates only if the appearance actually changed) and asks the service to
     * re-send the Android Auto night mode. Does NOT rebuild the manager, to avoid a
     * recreate loop.
     */
    private final void applyThemeConfigChange() {
    }
    
    private final void save(java.lang.String name) {
    }
    
    private final void deleteGeofence() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/andrerinas/openheadunit/main/MapPickerFragment$Companion;", "", "()V", "ARG_GEOFENCE_ID", "", "ARG_MODE", "MODE_GEOFENCE", "MODE_POINT", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    /**
     * Bridge invoked from map_picker.html when the user taps/moves the pin.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/andrerinas/openheadunit/main/MapPickerFragment$JsBridge;", "", "(Lcom/andrerinas/openheadunit/main/MapPickerFragment;)V", "onPointChanged", "", "lat", "", "lon", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    final class JsBridge {
        
        public JsBridge() {
            super();
        }
        
        @android.webkit.JavascriptInterface()
        public final void onPointChanged(double lat, double lon) {
        }
    }
}