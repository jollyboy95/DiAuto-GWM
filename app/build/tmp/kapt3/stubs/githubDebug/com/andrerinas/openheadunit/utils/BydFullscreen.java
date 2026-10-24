package com.andrerinas.openheadunit.utils;

/**
 * DiLink 5.1 ("byd-freeform") wraps every activity in a DecorCaptionView that clamps the
 * app's visible area to 1920x984 while the window frame is the full 1920x1080 and all
 * system bars are hidden during projection. The bottom ~96px show a dead black strip and
 * touches there never reach the app (parent hit-testing rejects them).
 *
 * The clamp lands AFTER the first layout pass (the caption system kicks in late), so this
 * cannot be fixed by a one-shot measurement. Instead we install a persistent enforcer:
 * 1. the projection container is forced to the real window height whenever anything
 *    re-shrinks it, with ancestor clipping disabled so it can actually draw there;
 * 2. a transparent sub-window panel covers the strip the decor can no longer hit-test
 *    and forwards touches into the projection touch pipe with corrected Y.
 *
 * Pure app-side; no root, no system changes.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J@\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u001e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\nJ\b\u0010\u0018\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/andrerinas/openheadunit/utils/BydFullscreen;", "", "()V", "layoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "ownerContainer", "Landroid/widget/FrameLayout;", "stripView", "Landroid/view/View;", "ensureStrip", "", "activity", "Landroid/app/Activity;", "wm", "Landroid/view/WindowManager;", "decor", "touchOverlay", "width", "", "top", "height", "expand", "container", "release", "removeStrip", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BydFullscreen {
    @org.jetbrains.annotations.Nullable()
    private android.view.View stripView;
    @org.jetbrains.annotations.Nullable()
    private android.widget.FrameLayout ownerContainer;
    @org.jetbrains.annotations.Nullable()
    private android.view.ViewTreeObserver.OnGlobalLayoutListener layoutListener;
    
    public BydFullscreen() {
        super();
    }
    
    public final void expand(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.widget.FrameLayout container, @org.jetbrains.annotations.NotNull()
    android.view.View touchOverlay) {
    }
    
    private final void ensureStrip(android.app.Activity activity, android.view.WindowManager wm, android.view.View decor, android.view.View touchOverlay, int width, int top, int height) {
    }
    
    public final void release() {
    }
    
    private final void removeStrip() {
    }
}