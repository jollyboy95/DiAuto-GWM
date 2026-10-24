package com.andrerinas.openheadunit.hud;

/**
 * Parked, finite probe of stock IPC. No shell, socket, SDK privilege or helper.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0014J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/andrerinas/openheadunit/hud/StandaloneHudDemoActivity;", "Landroid/app/Activity;", "()V", "handler", "Landroid/os/Handler;", "lastTurn", "", "running", "", "showing", "started", "", "status", "Landroid/widget/TextView;", "target", "Landroid/content/ComponentName;", "tick", "Ljava/lang/Runnable;", "clear", "", "reason", "", "onCreate", "state", "Landroid/os/Bundle;", "onDestroy", "onStop", "startDemo", "transmit", "packet", "validateTarget", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class StandaloneHudDemoActivity extends android.app.Activity {
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    private android.widget.TextView status;
    private boolean showing = false;
    private long started = 0L;
    private int lastTurn = 0;
    private boolean running = false;
    @org.jetbrains.annotations.NotNull()
    private final android.content.ComponentName target = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable tick = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "BYD-Standalone";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.StandaloneHudDemoActivity.Companion Companion = null;
    
    public StandaloneHudDemoActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle state) {
    }
    
    private final void validateTarget() {
    }
    
    private final void startDemo() {
    }
    
    private final void transmit(java.lang.String packet) {
    }
    
    private final void clear(java.lang.String reason) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/andrerinas/openheadunit/hud/StandaloneHudDemoActivity$Companion;", "", "()V", "TAG", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}