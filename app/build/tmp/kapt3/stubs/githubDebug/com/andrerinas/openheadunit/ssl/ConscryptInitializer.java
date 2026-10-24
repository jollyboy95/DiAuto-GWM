package com.andrerinas.openheadunit.ssl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/ssl/ConscryptInitializer;", "", "()V", "conscryptAvailable", "", "initialized", "getProviderName", "", "initialize", "isAvailable", "isNeededForTls12", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ConscryptInitializer {
    @kotlin.jvm.Volatile()
    private static volatile boolean initialized = false;
    @kotlin.jvm.Volatile()
    private static volatile boolean conscryptAvailable = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.ssl.ConscryptInitializer INSTANCE = null;
    
    private ConscryptInitializer() {
        super();
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean initialize() {
        return false;
    }
    
    public final boolean isAvailable() {
        return false;
    }
    
    public final boolean isNeededForTls12() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProviderName() {
        return null;
    }
}