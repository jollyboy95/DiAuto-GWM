package com.andrerinas.openheadunit.gwm;

/**
 * GWM outputs for one Android Auto session: the cluster map window on the selected cluster
 * display, and the head-up arrow strip.
 *
 * The cluster window uses the route that works on the H7 with DiPlay (jollyboy95/d-play-gwm-h7,
 * GwmLiveProjectionOverlay): a non-interactive TYPE_APPLICATION_OVERLAY window added through a
 * display context of the selected logical display. Its picture is DiAuto's existing Android Auto
 * cluster stream: the same CLUSTER video sink declared by
 * [com.andrerinas.openheadunit.aap.protocol.messages.ClusterDisplayServices], decoded by
 * [com.andrerinas.openheadunit.AppComponent.clusterVideoDecoder] and cropped with
 * [ClusterMapConfig.cropMatrix]. No second receiver or decoder is created here.
 *
 * Main thread only.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u0006J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020\u000eH\u0002J\u0010\u00101\u001a\u00020,2\u0006\u00100\u001a\u00020\u000eH\u0002J\u0006\u00102\u001a\u00020,J(\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u001fH\u0002J\u000e\u0010>\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0006J\u0018\u0010?\u001a\u00020,2\u0006\u00105\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u000eH\u0002J\u0018\u0010@\u001a\u00020,2\u0006\u00105\u001a\u00020\u00062\u0006\u0010A\u001a\u00020BH\u0002J\u0018\u0010C\u001a\u00020,2\u0006\u00105\u001a\u00020\u00062\u0006\u0010A\u001a\u00020BH\u0002J\u0018\u0010D\u001a\u0004\u0018\u00010\u000e2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\bJ\u000e\u0010F\u001a\u00020G2\u0006\u00107\u001a\u000208J\u000e\u0010H\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0006J\u0010\u0010I\u001a\u00020,2\b\b\u0002\u00100\u001a\u00020\u000eJ.\u0010J\u001a\u0004\u0018\u0001082\u0006\u00105\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\b2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020,0*H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\"R\u0010\u0010(\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020,0*X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006M"}, d2 = {"Lcom/andrerinas/openheadunit/gwm/GwmOutputs;", "", "()V", "GUIDANCE_TICK_MS", "", "appContext", "Landroid/content/Context;", "clusterDisplayId", "", "clusterManager", "Landroid/view/WindowManager;", "clusterRoot", "Landroid/view/View;", "<set-?>", "", "clusterStatus", "getClusterStatus", "()Ljava/lang/String;", "guidanceTick", "Ljava/lang/Runnable;", "handler", "Landroid/os/Handler;", "hudDisplayId", "hudManager", "hudStatus", "getHudStatus", "hudView", "Lcom/andrerinas/openheadunit/gwm/GwmHeadUpView;", "layer", "Lcom/andrerinas/openheadunit/gwm/GwmClusterLayerView;", "running", "", "sessionRunning", "getSessionRunning", "()Z", "surface", "Landroid/view/Surface;", "testManager", "testShowing", "getTestShowing", "testView", "vehicleListener", "Lkotlin/Function1;", "Lcom/andrerinas/openheadunit/gwm/GwmVehicleData$Snapshot;", "", "describeDisplays", "context", "hideCluster", "reason", "hideHud", "hideTest", "mapView", "Landroid/view/TextureView;", "app", "displayContext", "display", "Landroid/view/Display;", "profile", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Profile;", "overlayParams", "Landroid/view/WindowManager$LayoutParams;", "opaque", "refresh", "releaseSurface", "showCluster", "gwm", "Lcom/andrerinas/openheadunit/gwm/GwmSettings;", "showHud", "showTest", "displayId", "sizeOf", "Landroid/graphics/Point;", "start", "stop", "usableDisplay", "id", "report", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
public final class GwmOutputs {
    private static final long GUIDANCE_TICK_MS = 500L;
    
    /**
     * Plain-language results for the GWM settings screen.
     */
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.NotNull()
    private static volatile java.lang.String clusterStatus = "Not started yet: connect a phone with the cluster output on.";
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.NotNull()
    private static volatile java.lang.String hudStatus = "Not started yet.";
    @org.jetbrains.annotations.NotNull()
    private static final android.os.Handler handler = null;
    @org.jetbrains.annotations.Nullable()
    private static android.content.Context appContext;
    private static boolean running = false;
    @org.jetbrains.annotations.Nullable()
    private static android.view.WindowManager clusterManager;
    @org.jetbrains.annotations.Nullable()
    private static android.view.View clusterRoot;
    private static int clusterDisplayId = android.view.Display.INVALID_DISPLAY;
    @org.jetbrains.annotations.Nullable()
    private static com.andrerinas.openheadunit.gwm.GwmClusterLayerView layer;
    @org.jetbrains.annotations.Nullable()
    private static android.view.Surface surface;
    @org.jetbrains.annotations.Nullable()
    private static android.view.WindowManager hudManager;
    @org.jetbrains.annotations.Nullable()
    private static com.andrerinas.openheadunit.gwm.GwmHeadUpView hudView;
    private static int hudDisplayId = android.view.Display.INVALID_DISPLAY;
    @org.jetbrains.annotations.Nullable()
    private static android.view.WindowManager testManager;
    @org.jetbrains.annotations.Nullable()
    private static android.view.View testView;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.jvm.functions.Function1<com.andrerinas.openheadunit.gwm.GwmVehicleData.Snapshot, kotlin.Unit> vehicleListener = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.Runnable guidanceTick = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.gwm.GwmOutputs INSTANCE = null;
    
    private GwmOutputs() {
        super();
    }
    
    /**
     * Plain-language results for the GWM settings screen.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClusterStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHudStatus() {
        return null;
    }
    
    public final boolean getSessionRunning() {
        return false;
    }
    
    /**
     * A session's screen is up: show whatever GWM output is switched on. Safe to call repeatedly.
     */
    public final void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * The session ended: remove every window, stop polling and free the decoder's surface.
     */
    public final void stop(@org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
    }
    
    /**
     * Settings changed during a session: rebuild the windows with the new choices.
     */
    public final void refresh(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void showCluster(android.content.Context app, com.andrerinas.openheadunit.gwm.GwmSettings gwm) {
    }
    
    private final android.view.TextureView mapView(android.content.Context app, android.content.Context displayContext, android.view.Display display, com.andrerinas.openheadunit.hud.ClusterMapConfig.Profile profile) {
        return null;
    }
    
    private final void releaseSurface(android.content.Context app, java.lang.String reason) {
    }
    
    private final void hideCluster(java.lang.String reason) {
    }
    
    private final void showHud(android.content.Context app, com.andrerinas.openheadunit.gwm.GwmSettings gwm) {
    }
    
    private final void hideHud(java.lang.String reason) {
    }
    
    /**
     * Shows DiPlay's labelled test pattern (no vehicle values) on [displayId]; null on success.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String showTest(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int displayId) {
        return null;
    }
    
    public final void hideTest() {
    }
    
    public final boolean getTestShowing() {
        return false;
    }
    
    /**
     * The display, if it exists, is not the centre screen, and DiAuto may draw over other apps.
     */
    private final android.view.Display usableDisplay(android.content.Context app, int id, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> report) {
        return null;
    }
    
    private final android.view.WindowManager.LayoutParams overlayParams(boolean opaque) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String describeDisplays(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Point sizeOf(@org.jetbrains.annotations.NotNull()
    android.view.Display display) {
        return null;
    }
}