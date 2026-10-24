package com.andrerinas.openheadunit.connection.carkey;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/andrerinas/openheadunit/connection/carkey/CarKeysManager;", "", "()V", "all", "", "Lcom/andrerinas/openheadunit/connection/carkey/CarKeyReceiver;", "[Lcom/andrerinas/openheadunit/connection/carkey/CarKeyReceiver;", "registered", "", "isSUNeeded", "", "registerReceivers", "", "context", "Landroid/content/Context;", "unregisterReceivers", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class CarKeysManager {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.connection.carkey.CarKeyReceiver[] all = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Collection<com.andrerinas.openheadunit.connection.carkey.CarKeyReceiver> registered = null;
    
    public CarKeysManager() {
        super();
    }
    
    public final void registerReceivers(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void unregisterReceivers() {
    }
    
    public final boolean isSUNeeded() {
        return false;
    }
}