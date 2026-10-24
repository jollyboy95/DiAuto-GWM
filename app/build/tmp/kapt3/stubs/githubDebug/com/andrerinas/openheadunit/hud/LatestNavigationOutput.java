package com.andrerinas.openheadunit.hud;

/**
 * A one-slot mailbox: slow outputs skip obsolete complete snapshots without blocking the input.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/hud/LatestNavigationOutput;", "", "nanoTime", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "latest", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/andrerinas/openheadunit/hud/BydGuidance;", "current", "update", "", "value", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class LatestNavigationOutput {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<java.lang.Long> nanoTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.atomic.AtomicReference<com.andrerinas.openheadunit.hud.BydGuidance> latest = null;
    
    public LatestNavigationOutput(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Long> nanoTime) {
        super();
    }
    
    public final void update(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.hud.BydGuidance value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.hud.BydGuidance current() {
        return null;
    }
    
    public LatestNavigationOutput() {
        super();
    }
}