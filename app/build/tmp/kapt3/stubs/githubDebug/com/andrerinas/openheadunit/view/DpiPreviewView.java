package com.andrerinas.openheadunit.view;

/**
 * A schematic, value-driven preview of the head-unit layout. It is NOT a real Android Auto
 * render; it draws a mock launcher (a grid of fixed-size cards plus a bottom bar) inside a
 * frame with the panel's aspect ratio. The number of cards that fit is derived from how many
 * density-independent pixels the panel has at the chosen DPI, so:
 *  higher DPI -> fewer, larger cards (less fits);  lower DPI -> more, smaller cards.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0007J\u0016\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/andrerinas/openheadunit/view/DpiPreviewView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accent", "barPaint", "Landroid/graphics/Paint;", "dotPaint", "dpi", "framePaint", "panelHeightPx", "panelWidthPx", "strokePaint", "tilePaint", "dp", "", "value", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "readRealMetrics", "Landroid/util/DisplayMetrics;", "resolveAttrColor", "attr", "fallback", "setDpi", "setPanelResolution", "widthPx", "heightPx", "withAlpha", "color", "alpha", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class DpiPreviewView extends android.view.View {
    private int dpi = 160;
    private int panelWidthPx = 0;
    private int panelHeightPx = 0;
    private final int accent = 0;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint tilePaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint strokePaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint framePaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint barPaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint dotPaint = null;
    
    @kotlin.jvm.JvmOverloads()
    public DpiPreviewView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public final void setDpi(int value) {
    }
    
    /**
     * Override the panel resolution used to compute how much content fits (e.g. the
     * resolution detected by the wizard).
     */
    public final void setPanelResolution(int widthPx, int heightPx) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final android.util.DisplayMetrics readRealMetrics() {
        return null;
    }
    
    private final float dp(float value) {
        return 0.0F;
    }
    
    private final int withAlpha(int color, int alpha) {
        return 0;
    }
    
    private final int resolveAttrColor(int attr, int fallback) {
        return 0;
    }
    
    @kotlin.jvm.JvmOverloads()
    public DpiPreviewView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public DpiPreviewView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
}