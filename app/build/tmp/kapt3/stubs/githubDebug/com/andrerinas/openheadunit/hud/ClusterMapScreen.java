package com.andrerinas.openheadunit.hud;

/**
 * Shows the Android Auto cluster stream on BYD's instrument-cluster projection display.
 *
 * BYD exposes that area as a public presentation display (owned by com.byd.containerservice on
 * DiLink 5, com.xdja.containerservice on DiLink 3/4); the dashboard shows it while its own navi
 * mode is Small or Full screen, which only the driver can switch. Display names and sizes are the
 * ones DiPlay measured on those firmwares; anything else is left alone rather than guessed.
 *
 * The decoded frame is the whole codec frame; [ClusterMapConfig.cropMatrix] shows only the part
 * the phone drew, so the 8:3 picture is not squashed by the frame's 16:9 shape.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0018H\u0014J\b\u0010!\u001a\u00020\u0018H\u0014J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterMapScreen;", "Landroid/app/Presentation;", "context", "Landroid/content/Context;", "display", "Landroid/view/Display;", "profile", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Profile;", "(Landroid/content/Context;Landroid/view/Display;Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Profile;)V", "contentRoot", "Landroid/widget/FrameLayout;", "fullMapLayer", "", "getFullMapLayer", "()Ljava/lang/Boolean;", "guidanceTick", "Ljava/lang/Runnable;", "handler", "Landroid/os/Handler;", "mapWindow", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Window;", "turnCard", "Lcom/andrerinas/openheadunit/hud/ClusterTurnCardView;", "addMap", "", "root", "window", "decoder", "Lcom/andrerinas/openheadunit/decoder/VideoDecoder;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "setMapVisible", "visible", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
public final class ClusterMapScreen extends android.app.Presentation {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.hud.ClusterMapConfig.Profile profile = null;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.hud.ClusterTurnCardView turnCard;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable guidanceTick = null;
    @org.jetbrains.annotations.Nullable()
    private android.widget.FrameLayout contentRoot;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.hud.ClusterMapConfig.Window mapWindow;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DILINK5_BASE = "fission_bg_XDJAScreenProjection";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DILINK4_NAME = "fission_bg_xdjaVirtualSurface";
    private static final long GUIDANCE_TICK_MS = 500L;
    @org.jetbrains.annotations.Nullable()
    private static com.andrerinas.openheadunit.hud.ClusterMapScreen current;
    @org.jetbrains.annotations.Nullable()
    private static com.andrerinas.openheadunit.hud.ClusterMapScreen.Companion.Owner currentOwner;
    
    /**
     * What [show] was last called with, so the map can move layers when the cluster theme changes.
     */
    @org.jetbrains.annotations.Nullable()
    private static java.lang.ref.WeakReference<android.content.Context> showContext;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Object monitor;
    @org.jetbrains.annotations.Nullable()
    private static com.andrerinas.openheadunit.hud.ClusterActivityState.Snapshot clusterState;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Boolean lastMoveTo;
    private static long lastMoveAt = 0L;
    private static final long MOVE_RETRY_MS = 10000L;
    @org.jetbrains.annotations.Nullable()
    private static android.graphics.SurfaceTexture sharedTexture;
    @org.jetbrains.annotations.Nullable()
    private static android.view.Surface sharedSurface;
    private static boolean keepSurface = false;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.ref.WeakReference<android.content.Context> decoderContext;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.ClusterMapScreen.Companion Companion = null;
    
    public ClusterMapScreen(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.Display display, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.hud.ClusterMapConfig.Profile profile) {
        super(null, null);
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getFullMapLayer() {
        return null;
    }
    
    /**
     * Hides the content, not the window: the overlay owner gives this window a type its window
     * context does not have, and Android refuses any window attribute update on it ("Window type
     * mismatch"). A transparent view still draws, so the TextureView keeps taking frames.
     */
    public final void setMapVisible(boolean visible) {
    }
    
    /**
     * Adds the map: across the whole layer, or only inside [window], where it is cut out of the panel.
     */
    private final void addMap(android.widget.FrameLayout root, com.andrerinas.openheadunit.hud.ClusterMapConfig.Window window) {
    }
    
    private final com.andrerinas.openheadunit.decoder.VideoDecoder decoder() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u00012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0011J\u0006\u0010!\u001a\u00020\u001eJ\u0010\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u0011J\b\u0010$\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\nH\u0002J\u0006\u0010\'\u001a\u00020\u001eJ\u001a\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u0013H\u0002J\u000e\u0010+\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0011J\u000e\u0010,\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0011J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020#H\u0002J\u0010\u00100\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0011H\u0002J\b\u00101\u001a\u00020\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterMapScreen$Companion;", "", "()V", "DILINK4_NAME", "", "DILINK5_BASE", "GUIDANCE_TICK_MS", "", "MOVE_RETRY_MS", "clusterState", "Lcom/andrerinas/openheadunit/hud/ClusterActivityState$Snapshot;", "current", "Lcom/andrerinas/openheadunit/hud/ClusterMapScreen;", "currentOwner", "Lcom/andrerinas/openheadunit/hud/ClusterMapScreen$Companion$Owner;", "decoderContext", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "keepSurface", "", "lastMoveAt", "lastMoveTo", "Ljava/lang/Boolean;", "monitor", "sharedSurface", "Landroid/view/Surface;", "sharedTexture", "Landroid/graphics/SurfaceTexture;", "showContext", "closeWindow", "", "describeDisplays", "context", "dismiss", "findDisplay", "Landroid/view/Display;", "moveLayer", "onClusterState", "state", "onScreenHidden", "releaseSharedSurface", "reason", "releaseTexture", "requestKeyframe", "show", "sizeOf", "Landroid/graphics/Point;", "display", "startMonitor", "stopMonitor", "Owner", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * [releaseTexture] false when the TextureView releases it itself (its destroy callback returned true).
         */
        private final void releaseSharedSurface(java.lang.String reason, boolean releaseTexture) {
        }
        
        private final void startMonitor(android.content.Context context) {
        }
        
        private final void stopMonitor() {
        }
        
        /**
         * Follows the cluster: the map goes on the layer of the theme the cluster shows, and on the
         * side layer only shows while the map card is open. Main thread.
         */
        private final void onClusterState(com.andrerinas.openheadunit.hud.ClusterActivityState.Snapshot state) {
        }
        
        /**
         * Reopens the map on the layer of the cluster's current theme. Nothing goes to the phone:
         * the safe area is the same for every theme, so only the picture moves.
         */
        private final void moveLayer() {
        }
        
        /**
         * Shows the dashboard map while a session with it enabled is up. Safe to call repeatedly.
         */
        public final void show(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        /**
         * DiAuto's screen is going away: closes the map only if that screen owns its window.
         */
        public final void onScreenHidden() {
        }
        
        /**
         * The session ended.
         */
        public final void dismiss() {
        }
        
        private final void closeWindow(boolean keepSurface) {
        }
        
        public final void requestKeyframe(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.view.Display findDisplay(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String describeDisplays(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final android.graphics.Point sizeOf(android.view.Display display) {
            return null;
        }
        
        /**
         * Who the dashboard window belongs to, tried in this order. A window owned by DiAuto's
         * screen is stopped with it, so the map would vanish whenever the camera or another app
         * comes to the front; the first two belong to the app and stay up until the session ends.
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterMapScreen$Companion$Owner;", "", "(Ljava/lang/String;I)V", "OVERLAY", "APP", "SCREEN", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        static enum Owner {
            /*public static final*/ OVERLAY /* = new OVERLAY() */,
            /*public static final*/ APP /* = new APP() */,
            /*public static final*/ SCREEN /* = new SCREEN() */;
            
            Owner() {
            }
            
            @org.jetbrains.annotations.NotNull()
            public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.hud.ClusterMapScreen.Companion.Owner> getEntries() {
                return null;
            }
        }
    }
}