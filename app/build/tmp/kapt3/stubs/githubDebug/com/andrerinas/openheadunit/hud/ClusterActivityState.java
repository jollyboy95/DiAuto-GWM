package com.andrerinas.openheadunit.hud;

/**
 * Which stock BYD cluster screens are on, from Android's usage events, ported from DiPlay. The
 * cluster theme follows from the theme's own activity, and the side map is on screen only while
 * its card (MeterSmallScreenActivity) is open: Scenario keeps the projection layer up on every
 * card, so DiAuto hides its map itself when another card is open. Head-unit apps are irrelevant.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0003\u0014\u0015\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterActivityState;", "", "()V", "visible", "", "Lcom/andrerinas/openheadunit/hud/ClusterActivityState$Activity;", "", "event", "", "pkg", "", "name", "instance", "", "type", "time", "snapshot", "Lcom/andrerinas/openheadunit/hud/ClusterActivityState$Snapshot;", "themeOf", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Theme;", "Activity", "Companion", "Snapshot", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ClusterActivityState {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<com.andrerinas.openheadunit.hud.ClusterActivityState.Activity, java.lang.Long> visible = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FULL_MAP = "com.byd.automap.meter.MeterActivity";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MINI_MAP = "com.byd.automap.meter.MeterSmallScreenActivity";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SCENARIO = "com.byd.sr.cluster.ClusterActivity";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIMPLE = "com.byd.cluster.SimpleClusterDynastyActivity";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.ClusterActivityState.Companion Companion = null;
    
    public ClusterActivityState() {
        super();
    }
    
    public final void event(@org.jetbrains.annotations.Nullable()
    java.lang.String pkg, @org.jetbrains.annotations.Nullable()
    java.lang.String name, int instance, int type, long time) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.hud.ClusterActivityState.Snapshot snapshot() {
        return null;
    }
    
    private final com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme themeOf(java.lang.String name) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterActivityState$Activity;", "", "name", "", "instance", "", "(Ljava/lang/String;I)V", "getInstance", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class Activity {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        private final int instance = 0;
        
        public Activity(@org.jetbrains.annotations.NotNull()
        java.lang.String name, int instance) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final int getInstance() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.hud.ClusterActivityState.Activity copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name, int instance) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterActivityState$Companion;", "", "()V", "FULL_MAP", "", "MINI_MAP", "SCENARIO", "SIMPLE", "accepted", "", "pkg", "name", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean accepted(@org.jetbrains.annotations.Nullable()
        java.lang.String pkg, @org.jetbrains.annotations.Nullable()
        java.lang.String name) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/andrerinas/openheadunit/hud/ClusterActivityState$Snapshot;", "", "theme", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Theme;", "mapVisible", "", "smallWindow", "(Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Theme;ZZ)V", "getMapVisible", "()Z", "getSmallWindow", "getTheme", "()Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Theme;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Snapshot {
        @org.jetbrains.annotations.Nullable()
        private final com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme theme = null;
        private final boolean mapVisible = false;
        
        /**
         * The small navi window (not the full map) is the newest visible map activity.
         */
        private final boolean smallWindow = false;
        
        public Snapshot(@org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme theme, boolean mapVisible, boolean smallWindow) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme getTheme() {
            return null;
        }
        
        public final boolean getMapVisible() {
            return false;
        }
        
        /**
         * The small navi window (not the full map) is the newest visible map activity.
         */
        public final boolean getSmallWindow() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.hud.ClusterActivityState.Snapshot copy(@org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme theme, boolean mapVisible, boolean smallWindow) {
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