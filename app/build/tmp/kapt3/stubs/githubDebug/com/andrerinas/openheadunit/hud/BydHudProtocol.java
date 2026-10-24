package com.andrerinas.openheadunit.hud;

/**
 * Shared wire contract; keep DiPlay and DiAuto copies identical apart from their package.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydHudProtocol;", "", "()V", "NAVIGATION_TOPIC", "", "REPEAT_MILLIS", "SERVICE_TOPIC", "eventAccepted", "", "code", "", "serviceStarted", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BydHudProtocol {
    public static final long SERVICE_TOPIC = 3097367205183488L;
    public static final long NAVIGATION_TOPIC = 1127042368241665L;
    public static final long REPEAT_MILLIS = 300L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.BydHudProtocol INSTANCE = null;
    
    private BydHudProtocol() {
        super();
    }
    
    public final boolean serviceStarted(int code) {
        return false;
    }
    
    public final boolean eventAccepted(int code) {
        return false;
    }
}