package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/aap/ProjectionKeyPolicy;", "", "()V", "shouldRouteBackKeyToProjection", "", "actionToPhysicalKeyCode", "", "", "keyCode", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ProjectionKeyPolicy {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.ProjectionKeyPolicy INSTANCE = null;
    
    private ProjectionKeyPolicy() {
        super();
    }
    
    public final boolean shouldRouteBackKeyToProjection(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, java.lang.Integer> actionToPhysicalKeyCode, int keyCode) {
        return false;
    }
}