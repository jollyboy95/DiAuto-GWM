package com.andrerinas.openheadunit.hud;

/**
 * What DiAuto declares to the phone for the BYD instrument-cluster ("dashboard") screen, and how
 * the decoded picture is cropped back onto it. Pure, so the arithmetic is unit-tested.
 *
 * Android Auto only offers fixed codec sizes, so the 8:3 dashboard is a codec frame with equal
 * top/bottom margins: the phone draws only inside the margins, and [cropMatrix] shows just that
 * part. Content insets are the phone's safe area: navigation apps keep the car marker inside it,
 * which is how the marker is moved without touching the map itself.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u00c0\u0002\u0018\u00002\u00020\u0001:\u0007DEFGHIJB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u001e\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001cJ<\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%J\u001a\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004052\u0006\u0010$\u001a\u00020%J\u000e\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020\u0010J<\u0010(\u001a\u00020)2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%J,\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004052\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u0004H\u0002J\'\u0010@\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u001c2\u0006\u0010A\u001a\u00020-2\b\u0010B\u001a\u0004\u0018\u00010-\u00a2\u0006\u0002\u0010CJ\u000e\u0010$\u001a\u00020%2\u0006\u0010.\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\rR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006K"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterMapConfig;", "", "()V", "BASE_BOTTOM", "", "BASE_LEFT", "BASE_RIGHT", "BASE_TOP", "DISPLAY_ID", "DISPLAY_TYPE_CLUSTER", "HORIZONTAL_STEPS", "Lkotlin/ranges/IntRange;", "getHORIZONTAL_STEPS", "()Lkotlin/ranges/IntRange;", "MEASURED_DILINK51", "", "", "MIN_SPAN_PERCENT", "PANEL_HEIGHT", "PANEL_WIDTH", "RES_1280x720", "RES_1920x1080", "STEP_PERCENT", "UNIFIED", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Insets;", "VERTICAL_STEPS", "getVERTICAL_STEPS", "reportedTheme", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Theme;", "getReportedTheme", "()Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Theme;", "setReportedTheme", "(Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Theme;)V", "basePercent", "width", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Width;", "window", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Window;", "cropMatrix", "", "profile", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Profile;", "viewWidth", "viewHeight", "dark", "", "theme", "insets", "contentWidth", "contentHeight", "markerX", "markerY", "mapOffset", "Lkotlin/Pair;", "measured", "fingerprint", "size", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Size;", "detail", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Detail;", "shift", "start", "end", "delta", "shownOnLayer", "mapCardVisible", "fullMapLayer", "(Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Theme;ZLjava/lang/Boolean;)Z", "Detail", "Insets", "Profile", "Size", "Theme", "Width", "Window", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ClusterMapConfig {
    
    /**
     * DiLink 5.1 firmware whose three-layer cluster DiPlay measured: a Han L, and a Leopard 5 Ultra
     * 2025 (DiPlay #301). Their cluster shows the shared `_0` layer in the Map theme and `_1` in
     * Scenario and Simple, never the base layer DiLink 5.0 uses.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<java.lang.String> MEASURED_DILINK51 = null;
    
    /**
     * The theme the cluster last reported while the dashboard map runs; null when unknown.
     */
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme reportedTheme;
    public static final int RES_1280x720 = 2;
    public static final int RES_1920x1080 = 3;
    public static final int DISPLAY_TYPE_CLUSTER = 1;
    
    /**
     * The cluster is the second display; the main screen is display 0.
     */
    public static final int DISPLAY_ID = 1;
    
    /**
     * The dashboard panel these presets are made for (8:3).
     */
    public static final int PANEL_WIDTH = 1920;
    public static final int PANEL_HEIGHT = 720;
    
    /**
     * BYD's "Small screen navi" window is about x 31–68 %, y 16–89 % of the panel (measured by
     * DiPlay on a DiLink 5 cluster); this safe area keeps the marker inside it in both modes.
     */
    public static final int BASE_LEFT = 35;
    public static final int BASE_RIGHT = 36;
    public static final int BASE_TOP = 16;
    public static final int BASE_BOTTOM = 25;
    
    /**
     * Marker steps move the safe area by this many percent of the panel.
     */
    public static final int STEP_PERCENT = 10;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.ranges.IntRange HORIZONTAL_STEPS = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.ranges.IntRange VERTICAL_STEPS = null;
    
    /**
     * Never let the safe area shrink below this share of the panel in either direction.
     */
    private static final int MIN_SPAN_PERCENT = 10;
    
    /**
     * Measured DiLink 5.1: one safe area for every cluster theme, told to the phone once per
     * connection: as wide as the side window and centred on the panel. Changing it mid-session
     * (UpdateUiConfigRequest on the dashboard channel) made the phone drop the connection, so a
     * theme change instead slides the same picture into the window the cluster shows
     * ([mapOffset]), as DiPlay crops one stream into either window.
     */
    @org.jetbrains.annotations.NotNull()
    private static final com.andrerinas.openheadunit.hud.ClusterMapConfig.Insets UNIFIED = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.ClusterMapConfig INSTANCE = null;
    
    private ClusterMapConfig() {
        super();
    }
    
    public final boolean measured(@org.jetbrains.annotations.NotNull()
    java.lang.String fingerprint) {
        return false;
    }
    
    /**
     * Where [theme] shows the map on a measured DiLink 5.1 cluster: the Map theme's full-width
     * window between the speed readout and the gear/range bar, or the side window on the right of
     * Scenario and Simple.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Window window(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme theme) {
        return null;
    }
    
    /**
     * Whether DiAuto's map should show, given the cluster's [theme] and whether its [mapCardVisible]
     * (the Map theme, or the side map card), for a map drawn on the full-map layer
     * ([fullMapLayer] true) or the side layer (false). Scenario puts both layers over its whole
     * screen, so a map on the layer of another theme must hide. Unknown state keeps it showing.
     */
    public final boolean shownOnLayer(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme theme, boolean mapCardVisible, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean fullMapLayer) {
        return false;
    }
    
    /**
     * The theme the cluster last reported while the dashboard map runs; null when unknown.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme getReportedTheme() {
        return null;
    }
    
    /**
     * The theme the cluster last reported while the dashboard map runs; null when unknown.
     */
    public final void setReportedTheme(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme p0) {
    }
    
    /**
     * Simple keeps a dark background on that firmware; Scenario and Map are light.
     */
    public final boolean dark(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme theme) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.ranges.IntRange getHORIZONTAL_STEPS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.ranges.IntRange getVERTICAL_STEPS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Profile profile(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.hud.ClusterMapConfig.Size size, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.hud.ClusterMapConfig.Detail detail, int markerX, int markerY, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.hud.ClusterMapConfig.Width width, @org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.hud.ClusterMapConfig.Window window) {
        return null;
    }
    
    /**
     * The safe area in content pixels for marker steps [markerX] and [markerY]. With a measured
     * [window] it starts as that window, so the car marker sits in the middle of what the cluster
     * shows; the full-width Map window keeps clear of the trip readouts on both sides.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Insets insets(int contentWidth, int contentHeight, int markerX, int markerY, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.hud.ClusterMapConfig.Width width, @org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.hud.ClusterMapConfig.Window window) {
        return null;
    }
    
    /**
     * The unshifted safe area, in percent of the panel.
     */
    private final com.andrerinas.openheadunit.hud.ClusterMapConfig.Insets basePercent(com.andrerinas.openheadunit.hud.ClusterMapConfig.Width width, com.andrerinas.openheadunit.hud.ClusterMapConfig.Window window) {
        return null;
    }
    
    /**
     * Where the panel-size map goes for [window], in panel pixels: the safe area's centre, where
     * the phone keeps the car, lands on the window's centre.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> mapOffset(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.hud.ClusterMapConfig.Window window) {
        return null;
    }
    
    /**
     * Moves a (start, end) inset pair by [delta] percent, keeping both edges on the panel.
     */
    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> shift(int start, int end, int delta) {
        return null;
    }
    
    /**
     * Scale and translation for a TextureView of [viewWidth]x[viewHeight] whose buffer is the
     * whole codec frame, so that only the drawn content (inside the margins) fills the view.
     * Returned as (scaleX, scaleY, translateX, translateY) for Matrix.setScale + postTranslate.
     */
    @org.jetbrains.annotations.NotNull()
    public final float[] cropMatrix(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.hud.ClusterMapConfig.Profile profile, int viewWidth, int viewHeight) {
        return null;
    }
    
    /**
     * Size of map labels, icons and the car marker, as the display density the phone draws for.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Detail;", "", "value", "", "dpi", "(Ljava/lang/String;III)V", "getDpi", "()I", "getValue", "SMALL", "NORMAL", "LARGE", "EXTRA_LARGE", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Detail {
        /*public static final*/ SMALL /* = new SMALL(0, 0) */,
        /*public static final*/ NORMAL /* = new NORMAL(0, 0) */,
        /*public static final*/ LARGE /* = new LARGE(0, 0) */,
        /*public static final*/ EXTRA_LARGE /* = new EXTRA_LARGE(0, 0) */;
        private final int value = 0;
        private final int dpi = 0;
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.hud.ClusterMapConfig.Detail.Companion Companion = null;
        
        Detail(int value, int dpi) {
        }
        
        public final int getValue() {
            return 0;
        }
        
        public final int getDpi() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.hud.ClusterMapConfig.Detail> getEntries() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Detail$Companion;", "", "()V", "of", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Detail;", "value", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Detail of(int value) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Insets;", "", "top", "", "bottom", "left", "right", "(IIII)V", "getBottom", "()I", "getLeft", "getRight", "getTop", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Insets {
        private final int top = 0;
        private final int bottom = 0;
        private final int left = 0;
        private final int right = 0;
        
        public Insets(int top, int bottom, int left, int right) {
            super();
        }
        
        public final int getTop() {
            return 0;
        }
        
        public final int getBottom() {
            return 0;
        }
        
        public final int getLeft() {
            return 0;
        }
        
        public final int getRight() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Insets copy(int top, int bottom, int left, int right) {
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
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\fH\u00c6\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000f\u00a8\u0006+"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Profile;", "", "codecResolution", "", "codecWidth", "codecHeight", "widthMargin", "heightMargin", "contentWidth", "contentHeight", "density", "contentInsets", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Insets;", "(IIIIIIIILcom/andrerinas/openheadunit/hud/ClusterMapConfig$Insets;)V", "getCodecHeight", "()I", "getCodecResolution", "getCodecWidth", "getContentHeight", "getContentInsets", "()Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Insets;", "getContentWidth", "getDensity", "getHeightMargin", "margins", "getMargins", "getWidthMargin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Profile {
        private final int codecResolution = 0;
        private final int codecWidth = 0;
        private final int codecHeight = 0;
        private final int widthMargin = 0;
        private final int heightMargin = 0;
        private final int contentWidth = 0;
        private final int contentHeight = 0;
        private final int density = 0;
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.hud.ClusterMapConfig.Insets contentInsets = null;
        
        public Profile(int codecResolution, int codecWidth, int codecHeight, int widthMargin, int heightMargin, int contentWidth, int contentHeight, int density, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.hud.ClusterMapConfig.Insets contentInsets) {
            super();
        }
        
        public final int getCodecResolution() {
            return 0;
        }
        
        public final int getCodecWidth() {
            return 0;
        }
        
        public final int getCodecHeight() {
            return 0;
        }
        
        public final int getWidthMargin() {
            return 0;
        }
        
        public final int getHeightMargin() {
            return 0;
        }
        
        public final int getContentWidth() {
            return 0;
        }
        
        public final int getContentHeight() {
            return 0;
        }
        
        public final int getDensity() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Insets getContentInsets() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Insets getMargins() {
            return null;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int component5() {
            return 0;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int component7() {
            return 0;
        }
        
        public final int component8() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Insets component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Profile copy(int codecResolution, int codecWidth, int codecHeight, int widthMargin, int heightMargin, int contentWidth, int contentHeight, int density, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.hud.ClusterMapConfig.Insets contentInsets) {
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
    }
    
    /**
     * How much of the map fits: a smaller stream is enlarged onto the panel.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Size;", "", "value", "", "codecResolution", "codecWidth", "codecHeight", "(Ljava/lang/String;IIIII)V", "getCodecHeight", "()I", "getCodecResolution", "getCodecWidth", "getValue", "NORMAL", "LARGE", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Size {
        /*public static final*/ NORMAL /* = new NORMAL(0, 0, 0, 0) */,
        /*public static final*/ LARGE /* = new LARGE(0, 0, 0, 0) */;
        private final int value = 0;
        private final int codecResolution = 0;
        private final int codecWidth = 0;
        private final int codecHeight = 0;
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.hud.ClusterMapConfig.Size.Companion Companion = null;
        
        Size(int value, int codecResolution, int codecWidth, int codecHeight) {
        }
        
        public final int getValue() {
            return 0;
        }
        
        public final int getCodecResolution() {
            return 0;
        }
        
        public final int getCodecWidth() {
            return 0;
        }
        
        public final int getCodecHeight() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.hud.ClusterMapConfig.Size> getEntries() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Size$Companion;", "", "()V", "of", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Size;", "value", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Size of(int value) {
                return null;
            }
        }
    }
    
    /**
     * The cluster theme picked on the car. On DiLink 5.1 it decides which layer shows the map, and where.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Theme;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "SCENARIO", "MAP", "SIMPLE", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Theme {
        /*public static final*/ SCENARIO /* = new SCENARIO(0) */,
        /*public static final*/ MAP /* = new MAP(0) */,
        /*public static final*/ SIMPLE /* = new SIMPLE(0) */;
        private final int value = 0;
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme.Companion Companion = null;
        
        Theme(int value) {
        }
        
        public final int getValue() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme> getEntries() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Theme$Companion;", "", "()V", "of", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Theme;", "value", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme of(int value) {
                return null;
            }
        }
    }
    
    /**
     * How wide the safe area is. Android Auto keeps the car marker in its middle and lays the
     * turn and trip cards out inside it: in a narrow box they stack above and below the car,
     * covering the road ahead, while on a wide screen it puts them in the left corners, as on
     * the main screen. The wider choices hand the dashboard map a wide box for that layout.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Width;", "", "value", "", "left", "right", "(Ljava/lang/String;IIII)V", "getLeft", "()I", "getRight", "getValue", "COMPACT", "WIDE", "FULL", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Width {
        /*public static final*/ COMPACT /* = new COMPACT(0, 0, 0) */,
        /*public static final*/ WIDE /* = new WIDE(0, 0, 0) */,
        /*public static final*/ FULL /* = new FULL(0, 0, 0) */;
        private final int value = 0;
        private final int left = 0;
        private final int right = 0;
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.hud.ClusterMapConfig.Width.Companion Companion = null;
        
        Width(int value, int left, int right) {
        }
        
        public final int getValue() {
            return 0;
        }
        
        public final int getLeft() {
            return 0;
        }
        
        public final int getRight() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.hud.ClusterMapConfig.Width> getEntries() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Width$Companion;", "", "()V", "of", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Width;", "value", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Width of(int value) {
                return null;
            }
        }
    }
    
    /**
     * The part of the 1920x720 panel where the car shows the map, in panel pixels.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Window;", "", "left", "", "top", "width", "height", "fullMap", "", "(IIIIZ)V", "getFullMap", "()Z", "getHeight", "()I", "getLeft", "getTop", "getWidth", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Window {
        private final int left = 0;
        private final int top = 0;
        private final int width = 0;
        private final int height = 0;
        private final boolean fullMap = false;
        
        public Window(int left, int top, int width, int height, boolean fullMap) {
            super();
        }
        
        public final int getLeft() {
            return 0;
        }
        
        public final int getTop() {
            return 0;
        }
        
        public final int getWidth() {
            return 0;
        }
        
        public final int getHeight() {
            return 0;
        }
        
        public final boolean getFullMap() {
            return false;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final boolean component5() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Window copy(int left, int top, int width, int height, boolean fullMap) {
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
    }
}