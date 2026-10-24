package com.andrerinas.openheadunit.hud;

/**
 * Temporary HUD-test output using the installed factory SDK and the app's own identity.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002J\u0006\u0010\u000f\u001a\u00020\u000bJ\u001e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydFactoryNavigationOutput;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "device", "disabled", "", "logged", "showing", "checkResult", "", "operation", "", "result", "clear", "update", "icon", "", "exit", "distance", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BydFactoryNavigationOutput {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object device;
    private boolean disabled = false;
    private boolean showing = false;
    private boolean logged = false;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "BYD-Factory-Navi";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.BydFactoryNavigationOutput.Companion Companion = null;
    
    public BydFactoryNavigationOutput(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void update(int icon, int exit, int distance) {
    }
    
    public final void clear() {
    }
    
    private final void checkResult(java.lang.String operation, java.lang.Object result) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydFactoryNavigationOutput$Companion;", "", "()V", "TAG", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}