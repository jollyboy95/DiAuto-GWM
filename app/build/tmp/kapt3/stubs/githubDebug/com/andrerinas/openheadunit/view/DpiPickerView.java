package com.andrerinas.openheadunit.view;

/**
 * Reusable DPI picker: a live [DpiPreviewView] graphic, a slider, an editable value field and
 * Small/Medium/Large tabs, all kept in sync. Used by the onboarding wizard and the DPI
 * settings sub-screen.
 *
 * The slider covers the full range of real device densities (up to [MAX]) so "Automatic"
 * values like 440 DPI are reachable. The text field lets the user type any exact value; the
 * tabs are handy presets and only light up when the current value matches one.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00132\b\b\u0002\u0010\'\u001a\u00020\u0013H\u0002J\b\u0010(\u001a\u00020\u001bH\u0002J\u0006\u0010)\u001a\u00020\u001bJ\b\u0010*\u001a\u00020\u001bH\u0002J\b\u0010+\u001a\u00020\u001bH\u0014J\u0018\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0007H\u0014J\u001a\u00100\u001a\u00020\u001b2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0016\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007J\u000e\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u0013J\u0010\u00107\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u0006\u00108\u001a\u00020\u001bJ\u0006\u00109\u001a\u00020\u001bJ\u0010\u00109\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u0013H\u0002J\u0010\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u0007H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lcom/andrerinas/openheadunit/view/DpiPickerView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "committedDpi", "demoAnimator", "Landroid/animation/ValueAnimator;", "value", "dpi", "getDpi", "()I", "setDpi", "(I)V", "hasUserInteracted", "", "getHasUserInteracted", "()Z", "input", "Lcom/google/android/material/textfield/TextInputEditText;", "isBinding", "onDpiChanged", "Lkotlin/Function1;", "", "preview", "Lcom/andrerinas/openheadunit/view/DpiPreviewView;", "ready", "slider", "Lcom/google/android/material/slider/Slider;", "tabs", "Lcom/google/android/material/button/MaterialButtonToggleGroup;", "userInteracted", "applyDpi", "raw", "fromSlider", "silent", "commitInput", "commitPendingInput", "dismissKeyboard", "onDetachedFromWindow", "onVisibilityChanged", "changedView", "Landroid/view/View;", "visibility", "setOnDpiChanged", "cb", "setPanelResolution", "widthPx", "heightPx", "setPickerEnabled", "enabled", "snap", "startDemo", "stopDemo", "userDriven", "tabFor", "v", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
@android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
public final class DpiPickerView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.view.DpiPreviewView preview = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.slider.Slider slider = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.textfield.TextInputEditText input = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.button.MaterialButtonToggleGroup tabs = null;
    private boolean isBinding = false;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onDpiChanged;
    private boolean ready = false;
    @org.jetbrains.annotations.Nullable()
    private android.animation.ValueAnimator demoAnimator;
    private boolean userInteracted = false;
    private int committedDpi = 110;
    private static final int MIN = 110;
    private static final int MAX = 640;
    private static final int STEP = 1;
    private static final int SMALL_REP = 132;
    private static final int MEDIUM_REP = 175;
    private static final int LARGE_REP = 218;
    private static final int HUGE_REP = 320;
    private static final int SMALL_MEDIUM_MAX = 153;
    private static final int MEDIUM_LARGE_MAX = 196;
    private static final int LARGE_HUGE_MAX = 269;
    private static final int DEMO_LOW = 160;
    private static final int DEMO_HIGH = 640;
    private static final long DEMO_SWEEP_MS = 3200L;
    private static final long DEMO_START_DELAY_MS = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.view.DpiPickerView.Companion Companion = null;
    
    @kotlin.jvm.JvmOverloads()
    public DpiPickerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public final int getDpi() {
        return 0;
    }
    
    public final void setDpi(int value) {
    }
    
    public final boolean getHasUserInteracted() {
        return false;
    }
    
    public final void setOnDpiChanged(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> cb) {
    }
    
    /**
     * Folds a value typed into the field into the picker. Call this before reading [dpi] from a
     * button handler: buttons do not take focus in touch mode, so tapping Next or Save never moves
     * focus off the field and the typed number would otherwise be dropped. Safe to call repeatedly.
     */
    public final void commitPendingInput() {
    }
    
    public final void setPanelResolution(int widthPx, int heightPx) {
    }
    
    /**
     * Starts a gentle looping demo that sweeps only the preview illustration through the DPI range,
     * so the graphic shows what DPI does while the slider and number stay put. No-op once the user
     * has interacted, or if the picker is disabled. Safe to call repeatedly (e.g. each time the
     * step/screen becomes visible).
     */
    public final void startDemo() {
    }
    
    /**
     * Stops the demo (if running) without counting as user interaction, e.g. when the screen is
     * hidden; the illustration is restored to the intended value.
     */
    public final void stopDemo() {
    }
    
    private final void stopDemo(boolean userDriven) {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    /**
     * The wizard swaps steps through a ViewFlipper and the DPI screen hides the picker when
     * Automatic is switched on, so both leave through here: keep whatever was typed, and do not
     * leave the keyboard covering the screen that comes next.
     */
    @java.lang.Override()
    protected void onVisibilityChanged(@org.jetbrains.annotations.NotNull()
    android.view.View changedView, int visibility) {
    }
    
    private final void dismissKeyboard() {
    }
    
    public final void setPickerEnabled(boolean enabled) {
    }
    
    /**
     * Parse the typed value, clamp it into range and apply; restore on invalid input.
     */
    private final void commitInput() {
    }
    
    private final void applyDpi(int raw, boolean fromSlider, boolean silent) {
    }
    
    /**
     * Rounds to a value the slider can actually hold, then clamps into range.
     */
    private final int snap(int value) {
        return 0;
    }
    
    /**
     * Classifies any value into a tab. Small covers everything below and Huge everything
     * above (so a high custom value like 440 reads as Huge); Medium and Large stay capped to
     * their narrow central bands.
     */
    private final int tabFor(int v) {
        return 0;
    }
    
    @kotlin.jvm.JvmOverloads()
    public DpiPickerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public DpiPickerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/andrerinas/openheadunit/view/DpiPickerView$Companion;", "", "()V", "DEMO_HIGH", "", "DEMO_LOW", "DEMO_START_DELAY_MS", "", "DEMO_SWEEP_MS", "HUGE_REP", "LARGE_HUGE_MAX", "LARGE_REP", "MAX", "MEDIUM_LARGE_MAX", "MEDIUM_REP", "MIN", "SMALL_MEDIUM_MAX", "SMALL_REP", "STEP", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}