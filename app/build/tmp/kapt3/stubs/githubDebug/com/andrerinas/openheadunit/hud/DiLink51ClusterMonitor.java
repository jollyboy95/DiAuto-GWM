package com.andrerinas.openheadunit.hud;

/**
 * Follows the stock cluster screens through the owner's Usage access grant, never a privileged BYD
 * API. Ported from DiPlay. Polls every 500 ms and reports a [ClusterActivityState.Snapshot] on the
 * main thread.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\u0006\u0010\u001b\u001a\u00020\u0007J\u0006\u0010\u001c\u001a\u00020\u0007R\u0016\u0010\u0002\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/andrerinas/openheadunit/hud/DiLink51ClusterMonitor;", "", "context", "Landroid/content/Context;", "onState", "Lkotlin/Function1;", "Lcom/andrerinas/openheadunit/hud/ClusterActivityState$Snapshot;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "handler", "Landroid/os/Handler;", "instanceIdMethod", "Ljava/lang/reflect/Method;", "seen", "Ljava/util/LinkedHashMap;", "Lcom/andrerinas/openheadunit/hud/DiLink51ClusterMonitor$EventKey;", "", "since", "state", "Lcom/andrerinas/openheadunit/hud/ClusterActivityState;", "stopped", "", "bootTime", "poll", "start", "stop", "Companion", "EventKey", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.P)
public final class DiLink51ClusterMonitor {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.andrerinas.openheadunit.hud.ClusterActivityState.Snapshot, kotlin.Unit> onState = null;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    private final java.util.concurrent.ScheduledExecutorService executor = null;
    @org.jetbrains.annotations.NotNull()
    private com.andrerinas.openheadunit.hud.ClusterActivityState state;
    private long since;
    @org.jetbrains.annotations.NotNull()
    private final java.util.LinkedHashMap<com.andrerinas.openheadunit.hud.DiLink51ClusterMonitor.EventKey, java.lang.Long> seen = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.reflect.Method instanceIdMethod = null;
    @kotlin.jvm.Volatile()
    private volatile boolean stopped = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.DiLink51ClusterMonitor.Companion Companion = null;
    
    public DiLink51ClusterMonitor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.hud.ClusterActivityState.Snapshot, kotlin.Unit> onState) {
        super();
    }
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    private final long bootTime() {
        return 0L;
    }
    
    private final void poll() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/hud/DiLink51ClusterMonitor$Companion;", "", "()V", "hasAccess", "", "context", "Landroid/content/Context;", "snapshotNow", "Lcom/andrerinas/openheadunit/hud/ClusterActivityState$Snapshot;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * The cluster right now, from the usage events since boot; null without Usage access.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.hud.ClusterActivityState.Snapshot snapshotNow(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final boolean hasAccess(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J?\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u001e"}, d2 = {"Lcom/andrerinas/openheadunit/hud/DiLink51ClusterMonitor$EventKey;", "", "pkg", "", "name", "id", "", "type", "time", "", "(Ljava/lang/String;Ljava/lang/String;IIJ)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getPkg", "getTime", "()J", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class EventKey {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String pkg = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name = null;
        private final int id = 0;
        private final int type = 0;
        private final long time = 0L;
        
        public EventKey(@org.jetbrains.annotations.Nullable()
        java.lang.String pkg, @org.jetbrains.annotations.Nullable()
        java.lang.String name, int id, int type, long time) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPkg() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final int getId() {
            return 0;
        }
        
        public final int getType() {
            return 0;
        }
        
        public final long getTime() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final long component5() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.hud.DiLink51ClusterMonitor.EventKey copy(@org.jetbrains.annotations.Nullable()
        java.lang.String pkg, @org.jetbrains.annotations.Nullable()
        java.lang.String name, int id, int type, long time) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}