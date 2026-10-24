package com.andrerinas.openheadunit.hud;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u00a2\u0006\u0002\b\u0014J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fJ.\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00180\u001cH\u0002J6\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00180\u001cH\u0002J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\"\u001a\u00020\u0018J\u0017\u0010#\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0013H\u0000\u00a2\u0006\u0002\b%R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006&"}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydNavigationOutputs;", "", "()V", "active", "", "initialized", "latest", "Lcom/andrerinas/openheadunit/hud/LatestNavigationOutput;", "syntheticHold", "getSyntheticHold$com_andrerinas_headunitrevived_0_3_12_githubDebug", "()Z", "setSyntheticHold$com_andrerinas_headunitrevived_0_3_12_githubDebug", "(Z)V", "available", "context", "Landroid/content/Context;", "clusterPackage", "", "currentForDiagnostic", "Lcom/andrerinas/openheadunit/hud/BydGuidance;", "currentForDiagnostic$com_andrerinas_headunitrevived_0_3_12_githubDebug", "installed", "pkg", "onAppOpened", "", "schedule", "name", "send", "Lkotlin/Function1;", "repeatNs", "", "setDiagnosticHold", "hold", "start", "stop", "update", "value", "update$com_andrerinas_headunitrevived_0_3_12_githubDebug", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BydNavigationOutputs {
    @org.jetbrains.annotations.NotNull()
    private static final com.andrerinas.openheadunit.hud.LatestNavigationOutput latest = null;
    @kotlin.jvm.Volatile()
    private static volatile boolean active = false;
    @kotlin.jvm.Volatile()
    private static volatile boolean syntheticHold = false;
    private static boolean initialized = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.BydNavigationOutputs INSTANCE = null;
    
    private BydNavigationOutputs() {
        super();
    }
    
    /**
     * Recover a journaled interrupted output when the app opens, even before a phone reconnects.
     */
    public final void onAppOpened(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void setDiagnosticHold(boolean hold) {
    }
    
    public final boolean getSyntheticHold$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
        return false;
    }
    
    public final void setSyntheticHold$com_andrerinas_headunitrevived_0_3_12_githubDebug(boolean p0) {
    }
    
    public final boolean available(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    private final java.lang.String clusterPackage(android.content.Context context) {
        return null;
    }
    
    private final boolean installed(android.content.Context context, java.lang.String pkg) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.jvm.Synchronized()
    @org.jetbrains.annotations.Nullable()
    public final synchronized com.andrerinas.openheadunit.hud.BydGuidance currentForDiagnostic$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void update$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.hud.BydGuidance value) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void stop() {
    }
    
    private final void schedule(java.lang.String name, android.content.Context context, kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.hud.BydGuidance, kotlin.Unit> send) {
    }
    
    private final void schedule(java.lang.String name, android.content.Context context, long repeatNs, kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.hud.BydGuidance, kotlin.Unit> send) {
    }
}