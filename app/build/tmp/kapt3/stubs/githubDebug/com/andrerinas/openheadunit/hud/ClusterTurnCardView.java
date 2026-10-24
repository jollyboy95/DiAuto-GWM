package com.andrerinas.openheadunit.hud;

/**
 * The next-turn card on the dashboard, the same card DiPlay draws: a dark glass capsule,
 * the maneuver glyph in a chip on the left, distance and road on the right, and an arrival strip
 * below when the phone reports the route's remaining time and distance. Glyphs are Material Symbols
 * (Apache 2.0) keyed by the cluster icon codes in [BydGuidance.clusterIcon].
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J0\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%H\u0002J \u0010(\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*H\u0002J \u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020\bH\u0002J\u0010\u0010/\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0014J\u0010\u00100\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u0011J\u000e\u00101\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0014J\u0010\u00102\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterTurnCardView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "accent", "", "badgePaint", "Landroid/graphics/Paint;", "badgeTextPaint", "chipPaint", "distancePaint", "glassPaint", "glyph", "Landroid/graphics/drawable/Drawable;", "glyphRes", "guidance", "Lcom/andrerinas/openheadunit/hud/BydGuidance;", "infoPaint", "night", "", "plan", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Window;", "rect", "Landroid/graphics/RectF;", "roadPaint", "strokePaint", "applyPalette", "", "distanceLabel", "", "meters", "drawGlyph", "canvas", "Landroid/graphics/Canvas;", "next", "left", "", "top", "side", "drawInfoStrip", "card", "Lcom/andrerinas/openheadunit/hud/ClusterTurnCardPlacement$Box;", "ellipsize", "text", "maxWidth", "paint", "onDraw", "setGuidance", "setNightMode", "setPlan", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ClusterTurnCardView extends android.view.View {
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.hud.BydGuidance guidance;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.hud.ClusterMapConfig.Window plan;
    private boolean night = false;
    private final int accent = 0;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint glassPaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint chipPaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint strokePaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint badgePaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint badgeTextPaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint distancePaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint roadPaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint infoPaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.RectF rect = null;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Drawable glyph;
    private int glyphRes = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.ClusterTurnCardView.Companion Companion = null;
    
    public ClusterTurnCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public final void setPlan(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.hud.ClusterMapConfig.Window next) {
    }
    
    /**
     * Day: dark glass on a light map; night: a lighter translucent panel for the dark map.
     */
    public final void setNightMode(boolean next) {
    }
    
    public final void setGuidance(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.hud.BydGuidance next) {
    }
    
    private final void applyPalette() {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    /**
     * The arrival/duration/distance pill under the card, like the stock navigation bar.
     */
    private final void drawInfoStrip(android.graphics.Canvas canvas, com.andrerinas.openheadunit.hud.BydGuidance next, com.andrerinas.openheadunit.hud.ClusterTurnCardPlacement.Box card) {
    }
    
    private final void drawGlyph(android.graphics.Canvas canvas, com.andrerinas.openheadunit.hud.BydGuidance next, float left, float top, float side) {
    }
    
    private final java.lang.String distanceLabel(int meters) {
        return null;
    }
    
    private final java.lang.String ellipsize(java.lang.String text, float maxWidth, android.graphics.Paint paint) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterTurnCardView$Companion;", "", "()V", "glyphRes", "", "icon", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * DiPlay's glyph table for the cluster icon codes.
         */
        public final int glyphRes(int icon) {
            return 0;
        }
    }
}