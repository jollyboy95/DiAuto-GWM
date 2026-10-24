package com.andrerinas.openheadunit.connection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001#B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u000e\u0010\u0019\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0017H\u0016J(\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u000fH\u0016J \u0010\"\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/andrerinas/openheadunit/connection/SocketAccessoryConnection;", "Lcom/andrerinas/openheadunit/connection/AccessoryConnection;", "socket", "Ljava/net/Socket;", "context", "Landroid/content/Context;", "(Ljava/net/Socket;Landroid/content/Context;)V", "ip", "", "port", "", "(Ljava/lang/String;ILandroid/content/Context;)V", "input", "Ljava/io/DataInputStream;", "isConnected", "", "()Z", "isSingleMessage", "output", "Ljava/io/OutputStream;", "singleMessage", "transport", "applyLowLatencySocketOptions", "", "beforeConnect", "connect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disconnect", "recvBlocking", "buf", "", "length", "timeout", "readFully", "sendBlocking", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class SocketAccessoryConnection implements com.andrerinas.openheadunit.connection.AccessoryConnection {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ip = null;
    private final int port = 0;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private java.io.OutputStream output;
    @org.jetbrains.annotations.Nullable()
    private java.io.DataInputStream input;
    @org.jetbrains.annotations.NotNull()
    private java.net.Socket transport;
    private boolean singleMessage = false;
    private static final int DEF_BUFFER_LENGTH = 131080;
    private static final int LOW_LATENCY_SOCKET_BUFFER_BYTES = 262144;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.SocketAccessoryConnection.Companion Companion = null;
    
    public SocketAccessoryConnection(@org.jetbrains.annotations.NotNull()
    java.lang.String ip, int port, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public SocketAccessoryConnection(@org.jetbrains.annotations.NotNull()
    java.net.Socket socket, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override()
    public boolean isSingleMessage() {
        return false;
    }
    
    @java.lang.Override()
    public int sendBlocking(@org.jetbrains.annotations.NotNull()
    byte[] buf, int length, int timeout) {
        return 0;
    }
    
    @java.lang.Override()
    public int recvBlocking(@org.jetbrains.annotations.NotNull()
    byte[] buf, int length, int timeout, boolean readFully) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean isConnected() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object connect(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override()
    public void disconnect() {
    }
    
    private final void applyLowLatencySocketOptions(boolean beforeConnect) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/connection/SocketAccessoryConnection$Companion;", "", "()V", "DEF_BUFFER_LENGTH", "", "LOW_LATENCY_SOCKET_BUFFER_BYTES", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}