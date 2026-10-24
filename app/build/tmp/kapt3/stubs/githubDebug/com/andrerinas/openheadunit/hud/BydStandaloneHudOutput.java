package com.andrerinas.openheadunit.hud;

/**
 * Ordinary-app IPC to the real stock receiver. No shell, local socket or permission grant.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydStandaloneHudOutput;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "app", "kotlin.jvm.PlatformType", "prefs", "Landroid/content/SharedPreferences;", "session", "Lcom/andrerinas/openheadunit/hud/BydStandaloneSession;", "clear", "", "update", "icon", "", "exit", "distanceMeters", "road", "", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BydStandaloneHudOutput {
    private final android.content.Context app = null;
    private final android.content.SharedPreferences prefs = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.hud.BydStandaloneSession session = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "BYD-Standalone-Live";
    @org.jetbrains.annotations.NotNull()
    private static final android.content.ComponentName TARGET = null;
    @kotlin.jvm.Volatile()
    private static volatile boolean syntheticHold = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.BydStandaloneHudOutput.Companion Companion = null;
    
    private BydStandaloneHudOutput(android.content.Context context) {
        super();
    }
    
    public final void update(int icon, int exit, int distanceMeters, @org.jetbrains.annotations.NotNull()
    java.lang.String road) {
    }
    
    public final void clear() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydStandaloneHudOutput$Companion;", "", "()V", "TAG", "", "TARGET", "Landroid/content/ComponentName;", "syntheticHold", "", "getSyntheticHold", "()Z", "setSyntheticHold", "(Z)V", "available", "context", "Landroid/content/Context;", "create", "Lcom/andrerinas/openheadunit/hud/BydStandaloneHudOutput;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean getSyntheticHold() {
            return false;
        }
        
        public final void setSyntheticHold(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.hud.BydStandaloneHudOutput create(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * Enable production and diagnostic packages only on the physically tested firmware.
         */
        public final boolean available(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
    }
}