package com.andrerinas.openheadunit.gwm;

/**
 * What DiAuto declares to the phone for the GWM cluster map, built on DiAuto's own
 * [ClusterMapConfig.Profile] so the declaration, decoder and crop are the existing ones.
 *
 * The phone draws its map (and, for Google Maps, its own small cluster cards) inside the content
 * insets. On the GWM layout those insets are the band between the custom navigation card at the
 * top and the instrument strip at the bottom, so the car marker sits in the clear part of the map
 * and the phone's cards stay out from under the custom layer. The map itself still fills the panel.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004J.\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004J1\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/andrerinas/openheadunit/gwm/GwmClusterProfile;", "", "()V", "SAFE_BOTTOM", "", "SAFE_LEFT", "SAFE_RIGHT", "SAFE_TOP", "STEP", "forDisplay", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Profile;", "context", "Landroid/content/Context;", "display", "Landroid/view/Display;", "forSession", "insets", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Insets;", "contentWidth", "contentHeight", "markerX", "markerY", "profile", "panelWidth", "panelHeight", "detail", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Detail;", "shift", "Lkotlin/Pair;", "start", "end", "delta", "shift$com_andrerinas_headunitrevived_0_3_12_githubDebug", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class GwmClusterProfile {
    
    /**
     * Panel percentages of the approved layout; see [GwmClusterLayerView].
     */
    public static final int SAFE_TOP = 31;
    public static final int SAFE_BOTTOM = 25;
    public static final int SAFE_LEFT = 6;
    public static final int SAFE_RIGHT = 6;
    
    /**
     * Marker steps reuse DiAuto's dashboard settings; this many percent per step.
     */
    private static final int STEP = 5;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.gwm.GwmClusterProfile INSTANCE = null;
    
    private GwmClusterProfile() {
        super();
    }
    
    /**
     * The profile declared to the phone this connection, for the selected cluster display.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Profile forSession(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * The same profile for an already resolved [display]; null assumes the H7's 1920x720 panel.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Profile forDisplay(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.view.Display display) {
        return null;
    }
    
    /**
     * @param panelWidth size of the selected cluster display, or 0 when it is not present yet
     * (then the H7's 8:3 panel is assumed).
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Profile profile(int panelWidth, int panelHeight, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.hud.ClusterMapConfig.Detail detail, int markerX, int markerY) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Insets insets(int contentWidth, int contentHeight, int markerX, int markerY) {
        return null;
    }
    
    /**
     * Moves an inset pair by [delta] percent, keeping the span and both edges on the panel.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> shift$com_andrerinas_headunitrevived_0_3_12_githubDebug(int start, int end, int delta) {
        return null;
    }
}