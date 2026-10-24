package com.andrerinas.openheadunit.connection;

/**
 * Device-wide P2P broadcasts describe the radio, not the app that created its group.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003J\u0006\u0010\u001a\u001a\u00020\u0018J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003J\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0006J\u0006\u0010 \u001a\u00020\u0018J\u0006\u0010!\u001a\u00020\u0018R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\t\u00a8\u0006\""}, d2 = {"Lcom/andrerinas/openheadunit/connection/P2pSessionOwnership;", "", "recordedName", "", "(Ljava/lang/String;)V", "<set-?>", "", "created", "getCreated", "()Z", "enabled", "getEnabled", "", "generation", "getGeneration", "()I", "networkName", "getNetworkName", "()Ljava/lang/String;", "requested", "getRequested", "token", "current", "expect", "", "name", "expectSystemName", "observeCreatedGroup", "isOwner", "owns", "setEnabled", "value", "start", "stop", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class P2pSessionOwnership {
    private boolean requested = false;
    private boolean enabled = true;
    @kotlin.jvm.Volatile()
    private volatile int generation = 0;
    private boolean created = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String networkName;
    
    public P2pSessionOwnership(@org.jetbrains.annotations.Nullable()
    java.lang.String recordedName) {
        super();
    }
    
    public final boolean getRequested() {
        return false;
    }
    
    public final boolean getEnabled() {
        return false;
    }
    
    public final int getGeneration() {
        return 0;
    }
    
    public final boolean getCreated() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNetworkName() {
        return null;
    }
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    public final void setEnabled(boolean value) {
    }
    
    public final boolean current(int token) {
        return false;
    }
    
    public final void expect(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final boolean created(int token) {
        return false;
    }
    
    public final boolean owns(boolean isOwner, @org.jetbrains.annotations.Nullable()
    java.lang.String name) {
        return false;
    }
    
    public final void observeCreatedGroup(boolean isOwner, @org.jetbrains.annotations.Nullable()
    java.lang.String name) {
    }
    
    public final void expectSystemName() {
    }
    
    public P2pSessionOwnership() {
        super();
    }
}