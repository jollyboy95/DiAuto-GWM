package com.andrerinas.openheadunit.hud;

/**
 * The latest mapped guidance for the dashboard turn card: the same turn, distance and street the
 * HUD gets. Written by the navigation handler, read by the dashboard window.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/andrerinas/openheadunit/hud/DashboardGuidance;", "", "()V", "TTL_NS", "", "latest", "Lcom/andrerinas/openheadunit/hud/BydGuidance;", "getLatest", "()Lcom/andrerinas/openheadunit/hud/BydGuidance;", "setLatest", "(Lcom/andrerinas/openheadunit/hud/BydGuidance;)V", "current", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class DashboardGuidance {
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.andrerinas.openheadunit.hud.BydGuidance latest;
    
    /**
     * Matches the BYD outputs: a route the phone stopped describing is not shown for long.
     */
    private static final long TTL_NS = 30000000000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.DashboardGuidance INSTANCE = null;
    
    private DashboardGuidance() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.hud.BydGuidance getLatest() {
        return null;
    }
    
    public final void setLatest(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.hud.BydGuidance p0) {
    }
    
    /**
     * The guidance, unless the phone stopped describing the route a while ago.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.hud.BydGuidance current() {
        return null;
    }
}