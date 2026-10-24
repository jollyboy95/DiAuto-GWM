package com.andrerinas.openheadunit.gwm;

/**
 * The GWM H7 cluster layer drawn over Android Auto's live cluster map (map-first, after the
 * approved Aston Martin / CarPlay Ultra-style layout). Adapted from DiPlay's GwmClusterHudView
 * (jollyboy95/d-play-gwm-h7 @ 1460810, GPL-3.0-or-later) to DiAuto's guidance and media sources.
 *
 * Layout, in panel percent, around the stock OFF-ROAD theme's telltales (verify on the car):
 * - gear indicator at the top centre is left clear (0–10 %);
 * - navigation card top centre, 10.5–30.5 %, from Android Auto's navigation metadata;
 * - music card top right, 10–28.5 %, from Android Auto's media channel;
 * - instrument strip from 76 % down: fuel and range left, speed centred, odometer right. The car's
 *  lamp row (READY under the speed, limit/assist bottom left, ECO bottom right) draws above it.
 *
 * Only real values are drawn. A value the car does not report shows a dash; when the whole data
 * feed stops, the strip says so instead of freezing the last numbers.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010.\u001a\u00020(2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000202H\u0002J \u00104\u001a\u00020(2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000202H\u0002J(\u00105\u001a\u00020(2\u0006\u0010/\u001a\u0002002\u0006\u00106\u001a\u00020\u00192\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000202H\u0002J0\u00107\u001a\u00020(2\u0006\u0010/\u001a\u0002002\u0006\u00108\u001a\u0002022\u0006\u00109\u001a\u0002022\u0006\u0010:\u001a\u0002022\u0006\u0010;\u001a\u00020\u0010H\u0002J\u0018\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u000202H\u0002J\b\u0010@\u001a\u00020(H\u0014J\b\u0010A\u001a\u00020(H\u0014J\u0010\u0010B\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0014J\u0010\u0010C\u001a\u00020(2\b\u00106\u001a\u0004\u0018\u00010\u0019J\u0010\u0010D\u001a\u00020(2\b\u00106\u001a\u0004\u0018\u00010%R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Lcom/andrerinas/openheadunit/gwm/GwmClusterLayerView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "settings", "Lcom/andrerinas/openheadunit/gwm/GwmSettings;", "(Landroid/content/Context;Lcom/andrerinas/openheadunit/gwm/GwmSettings;)V", "art", "Landroid/graphics/Paint;", "bar", "bold", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "clip", "Landroid/graphics/Path;", "dim", "", "edge", "faint", "fill", "glass", "glyph", "Landroid/graphics/drawable/Drawable;", "glyphRes", "guidance", "Lcom/andrerinas/openheadunit/hud/BydGuidance;", "hadVehicleData", "", "line", "low", "medium", "music", "Lcom/andrerinas/openheadunit/gwm/GwmMusicState$Snapshot;", "rect", "Landroid/graphics/RectF;", "sans", "snapshot", "Lcom/andrerinas/openheadunit/gwm/GwmVehicleData$Snapshot;", "stopMusic", "Lkotlin/Function0;", "", "stroke", "text", "tick", "Ljava/lang/Runnable;", "track", "drawBottomBar", "canvas", "Landroid/graphics/Canvas;", "w", "", "h", "drawMusic", "drawNavigation", "next", "drawPump", "left", "top", "size", "color", "fit", "", "value", "maxWidth", "onAttachedToWindow", "onDetachedFromWindow", "onDraw", "setGuidance", "setSnapshot", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class GwmClusterLayerView extends android.view.View {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.gwm.GwmSettings settings = null;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.gwm.GwmVehicleData.Snapshot snapshot;
    
    /**
     * True once the vehicle feed has delivered anything this session: null afterwards is "stale".
     */
    private boolean hadVehicleData = false;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.hud.BydGuidance guidance;
    @org.jetbrains.annotations.NotNull()
    private com.andrerinas.openheadunit.gwm.GwmMusicState.Snapshot music;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> stopMusic;
    private final android.graphics.Typeface sans = null;
    private final android.graphics.Typeface medium = null;
    private final android.graphics.Typeface bold = null;
    private final int dim = 0;
    private final int faint = 0;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint glass = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint edge = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint bar = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint line = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint text = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint track = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint fill = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint low = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint stroke = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint art = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.RectF rect = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Path clip = null;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Drawable glyph;
    private int glyphRes = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable tick = null;
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String DASH = "\u2014";
    @java.lang.Deprecated()
    public static final float LOW_FUEL_PERCENT = 15.0F;
    @org.jetbrains.annotations.NotNull()
    private static final com.andrerinas.openheadunit.gwm.GwmClusterLayerView.Companion Companion = null;
    
    public GwmClusterLayerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.gwm.GwmSettings settings) {
        super(null);
    }
    
    public final void setSnapshot(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.gwm.GwmVehicleData.Snapshot next) {
    }
    
    public final void setGuidance(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.hud.BydGuidance next) {
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void drawBottomBar(android.graphics.Canvas canvas, float w, float h) {
    }
    
    private final void drawNavigation(android.graphics.Canvas canvas, com.andrerinas.openheadunit.hud.BydGuidance next, float w, float h) {
    }
    
    private final void drawMusic(android.graphics.Canvas canvas, float w, float h) {
    }
    
    private final java.lang.String fit(java.lang.String value, float maxWidth) {
        return null;
    }
    
    /**
     * A plain fuel-pump outline: body, window and nozzle hose.
     */
    private final void drawPump(android.graphics.Canvas canvas, float left, float top, float size, int color) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/gwm/GwmClusterLayerView$Companion;", "", "()V", "DASH", "", "LOW_FUEL_PERCENT", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}