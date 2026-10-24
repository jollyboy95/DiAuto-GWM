package com.andrerinas.openheadunit.hud;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ1\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydNavigationMapper;", "", "()V", "codes", "Lcom/andrerinas/openheadunit/hud/BydNavigationMapper$Codes;", "type", "", "exit", "from", "Lcom/andrerinas/openheadunit/hud/BydGuidance;", "snapshot", "Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$NavigationSnapshot;", "leftHandTraffic", "", "legacyType", "event", "side", "roundaboutExit", "(IIIZ)Ljava/lang/Integer;", "Codes", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BydNavigationMapper {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.BydNavigationMapper INSTANCE = null;
    
    private BydNavigationMapper() {
        super();
    }
    
    /**
     * @param leftHandTraffic the "traffic keeps left" setting. Legacy turn events carry no
     * circulation direction for roundabouts, so this setting supplies it: clockwise where traffic
     * keeps left, counter-clockwise where it keeps right (the default).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.hud.BydGuidance from(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapNavigationHelper.NavigationSnapshot snapshot, boolean leftHandTraffic) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.hud.BydNavigationMapper.Codes codes(int type, int exit) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer legacyType(int event, int side, int roundaboutExit, boolean leftHandTraffic) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydNavigationMapper$Codes;", "", "cluster", "", "gaode", "arrow", "exit", "(IIII)V", "getArrow", "()I", "getCluster", "getExit", "getGaode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Codes {
        private final int cluster = 0;
        private final int gaode = 0;
        private final int arrow = 0;
        private final int exit = 0;
        
        public Codes(int cluster, int gaode, int arrow, int exit) {
            super();
        }
        
        public final int getCluster() {
            return 0;
        }
        
        public final int getGaode() {
            return 0;
        }
        
        public final int getArrow() {
            return 0;
        }
        
        public final int getExit() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.hud.BydNavigationMapper.Codes copy(int cluster, int gaode, int arrow, int exit) {
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