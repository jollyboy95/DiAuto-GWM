package com.andrerinas.openheadunit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/App;", "Landroid/app/Application;", "()V", "component", "Lcom/andrerinas/openheadunit/AppComponent;", "getComponent", "()Lcom/andrerinas/openheadunit/AppComponent;", "component$delegate", "Lkotlin/Lazy;", "attachBaseContext", "", "base", "Landroid/content/Context;", "isUserUnlocked", "", "onCreate", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy component$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String defaultChannel = "headunit_service_v2";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String bootStartChannel = "headunit_boot_start";
    private static final long appStartTime = 0L;
    @org.jetbrains.annotations.Nullable()
    private static com.andrerinas.openheadunit.utils.AppThemeManager appThemeManager;
    private static boolean isPiPActive = false;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.andrerinas.openheadunit.App instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.App.Companion Companion = null;
    
    public App() {
        super();
    }
    
    private final com.andrerinas.openheadunit.AppComponent getComponent() {
        return null;
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context base) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final boolean isUserUnlocked() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001cR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0086T\u00a2\u0006\u0002\n\u0000R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/andrerinas/openheadunit/App$Companion;", "", "()V", "appStartTime", "", "getAppStartTime", "()J", "appThemeManager", "Lcom/andrerinas/openheadunit/utils/AppThemeManager;", "getAppThemeManager", "()Lcom/andrerinas/openheadunit/utils/AppThemeManager;", "setAppThemeManager", "(Lcom/andrerinas/openheadunit/utils/AppThemeManager;)V", "bootStartChannel", "", "defaultChannel", "<set-?>", "Lcom/andrerinas/openheadunit/App;", "instance", "getInstance", "()Lcom/andrerinas/openheadunit/App;", "isPiPActive", "", "()Z", "setPiPActive", "(Z)V", "get", "context", "Landroid/content/Context;", "provide", "Lcom/andrerinas/openheadunit/AppComponent;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final long getAppStartTime() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.utils.AppThemeManager getAppThemeManager() {
            return null;
        }
        
        public final void setAppThemeManager(@org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.utils.AppThemeManager p0) {
        }
        
        public final boolean isPiPActive() {
            return false;
        }
        
        public final void setPiPActive(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.App getInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.App get(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.AppComponent provide(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}