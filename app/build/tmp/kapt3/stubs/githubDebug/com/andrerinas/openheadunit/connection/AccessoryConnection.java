package com.andrerinas.openheadunit.connection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0006\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH&J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0003H&J \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/connection/AccessoryConnection;", "", "isConnected", "", "()Z", "isSingleMessage", "connect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disconnect", "", "recvBlocking", "", "buf", "", "length", "timeout", "readFully", "sendBlocking", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public abstract interface AccessoryConnection {
    
    public abstract boolean isSingleMessage();
    
    public abstract int sendBlocking(@org.jetbrains.annotations.NotNull()
    byte[] buf, int length, int timeout);
    
    public abstract int recvBlocking(@org.jetbrains.annotations.NotNull()
    byte[] buf, int length, int timeout, boolean readFully);
    
    public abstract boolean isConnected();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object connect(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    public abstract void disconnect();
}