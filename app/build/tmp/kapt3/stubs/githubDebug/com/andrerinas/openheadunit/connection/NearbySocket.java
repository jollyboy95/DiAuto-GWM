package com.andrerinas.openheadunit.connection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lcom/andrerinas/openheadunit/connection/NearbySocket;", "Ljava/net/Socket;", "()V", "inputLatch", "Ljava/util/concurrent/CountDownLatch;", "value", "Ljava/io/InputStream;", "inputStreamWrapper", "getInputStreamWrapper", "()Ljava/io/InputStream;", "setInputStreamWrapper", "(Ljava/io/InputStream;)V", "internalInputStream", "internalOutputStream", "Ljava/io/OutputStream;", "outputLatch", "outputStreamWrapper", "getOutputStreamWrapper", "()Ljava/io/OutputStream;", "setOutputStreamWrapper", "(Ljava/io/OutputStream;)V", "getInetAddress", "Ljava/net/InetAddress;", "getInputStream", "getOutputStream", "isConnected", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class NearbySocket extends java.net.Socket {
    @org.jetbrains.annotations.Nullable()
    private java.io.InputStream internalInputStream;
    @org.jetbrains.annotations.Nullable()
    private java.io.OutputStream internalOutputStream;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.CountDownLatch inputLatch = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.CountDownLatch outputLatch = null;
    
    public NearbySocket() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.InputStream getInputStreamWrapper() {
        return null;
    }
    
    public final void setInputStreamWrapper(@org.jetbrains.annotations.Nullable()
    java.io.InputStream value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.OutputStream getOutputStreamWrapper() {
        return null;
    }
    
    public final void setOutputStreamWrapper(@org.jetbrains.annotations.Nullable()
    java.io.OutputStream value) {
    }
    
    @java.lang.Override()
    public boolean isConnected() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.net.InetAddress getInetAddress() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.io.InputStream getInputStream() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.io.OutputStream getOutputStream() {
        return null;
    }
}