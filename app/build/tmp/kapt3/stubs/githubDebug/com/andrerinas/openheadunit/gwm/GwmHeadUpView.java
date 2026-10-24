package com.andrerinas.openheadunit.gwm;

/**
 * The GWM head-up display's arrow area: turn arrow, distance to the turn and arrival time, only
 * while a route is active. The car already projects speed and its own readouts, and apps can only
 * draw in the arrow area, so nothing else is drawn and the background stays transparent.
 * Adapted from DiPlay's GwmHeadUpView (jollyboy95/d-play-gwm-h7 @ 1460810, GPL-3.0-or-later).
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J:\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0018H\u0002J:\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0018H\u0002J \u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\nH\u0002J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u000e\u0010\'\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0006J\u0010\u0010(\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/andrerinas/openheadunit/gwm/GwmHeadUpView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "anchor", "Lcom/andrerinas/openheadunit/gwm/GwmHeadUpView$Anchor;", "arrowTint", "", "distancePaint", "Landroid/graphics/Paint;", "etaLabelPaint", "etaPaint", "glyph", "Landroid/graphics/drawable/Drawable;", "glyphRes", "guidance", "Lcom/andrerinas/openheadunit/hud/BydGuidance;", "drawArrow", "", "canvas", "Landroid/graphics/Canvas;", "next", "left", "", "top", "side", "drawRow", "distance", "", "eta", "w", "h", "drawStacked", "ellipsize", "text", "maxWidth", "paint", "onDraw", "setAnchor", "setGuidance", "Anchor", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class GwmHeadUpView extends android.view.View {
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.hud.BydGuidance guidance;
    @org.jetbrains.annotations.NotNull()
    private com.andrerinas.openheadunit.gwm.GwmHeadUpView.Anchor anchor = com.andrerinas.openheadunit.gwm.GwmHeadUpView.Anchor.CENTRE;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint distancePaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint etaPaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint etaLabelPaint = null;
    private final int arrowTint = 0;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Drawable glyph;
    private int glyphRes = 0;
    
    public GwmHeadUpView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public final void setGuidance(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.hud.BydGuidance next) {
    }
    
    public final void setAnchor(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.gwm.GwmHeadUpView.Anchor next) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void drawRow(android.graphics.Canvas canvas, com.andrerinas.openheadunit.hud.BydGuidance next, java.lang.String distance, java.lang.String eta, float w, float h) {
    }
    
    /**
     * Arrow on top, distance under it, arrival time last; everything centred and sized to fit.
     */
    private final void drawStacked(android.graphics.Canvas canvas, com.andrerinas.openheadunit.hud.BydGuidance next, java.lang.String distance, java.lang.String eta, float w, float h) {
    }
    
    private final void drawArrow(android.graphics.Canvas canvas, com.andrerinas.openheadunit.hud.BydGuidance next, float left, float top, float side) {
    }
    
    private final java.lang.String ellipsize(java.lang.String text, float maxWidth, android.graphics.Paint paint) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/gwm/GwmHeadUpView$Anchor;", "", "(Ljava/lang/String;I)V", "LEFT", "CENTRE", "RIGHT", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Anchor {
        /*public static final*/ LEFT /* = new LEFT() */,
        /*public static final*/ CENTRE /* = new CENTRE() */,
        /*public static final*/ RIGHT /* = new RIGHT() */;
        
        Anchor() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.gwm.GwmHeadUpView.Anchor> getEntries() {
            return null;
        }
    }
}