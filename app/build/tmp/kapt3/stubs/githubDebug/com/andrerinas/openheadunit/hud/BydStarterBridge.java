package com.andrerinas.openheadunit.hud;

/**
 * Test-only client of the user's explicitly ADB-started, navigation-only local bridge.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001-B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0015J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\u0016\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006J\u0014\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0006H\u0002J \u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0002J\b\u0010)\u001a\u00020\u0019H\u0002J\u001e\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydStarterBridge;", "", "()V", "MAGIC", "", "TAG", "", "demoStartMs", "", "Ljava/lang/Long;", "input", "Ljava/io/DataInputStream;", "lastNotice", "latest", "Lcom/andrerinas/openheadunit/hud/BydStarterBridge$Frame;", "output", "Ljava/io/DataOutputStream;", "retryAfterMs", "socket", "Ljava/net/Socket;", "started", "", "token", "", "clear", "", "cancelDemo", "close", "configure", "context", "Landroid/content/Context;", "secret", "decodeToken", "demonstrate", "initialize", "notice", "message", "send", "operation", "turn", "distance", "tick", "update", "icon", "exit", "Frame", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BydStarterBridge {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "BYD-Starter-Bridge";
    private static final int MAGIC = 1113146417;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.andrerinas.openheadunit.hud.BydStarterBridge.Frame latest;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile java.lang.Long demoStartMs;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile byte[] token;
    private static boolean started = false;
    @org.jetbrains.annotations.Nullable()
    private static java.net.Socket socket;
    @org.jetbrains.annotations.Nullable()
    private static java.io.DataOutputStream output;
    @org.jetbrains.annotations.Nullable()
    private static java.io.DataInputStream input;
    private static long retryAfterMs = 0L;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String lastNotice;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.BydStarterBridge INSTANCE = null;
    
    private BydStarterBridge() {
        super();
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void initialize(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void configure(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String secret) {
    }
    
    private final byte[] decodeToken(java.lang.String secret) {
        return null;
    }
    
    public final void update(int icon, int exit, int distance) {
    }
    
    public final void clear(boolean cancelDemo) {
    }
    
    /**
     * Called only by the DUMP-protected debug receiver after the parked-demo request.
     */
    public final void demonstrate(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void tick() {
    }
    
    private final void send(int operation, int turn, int distance) {
    }
    
    private final void close() {
    }
    
    private final void notice(java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydStarterBridge$Frame;", "", "turn", "", "distance", "receivedMs", "", "(IIJ)V", "getDistance", "()I", "getReceivedMs", "()J", "getTurn", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class Frame {
        private final int turn = 0;
        private final int distance = 0;
        private final long receivedMs = 0L;
        
        public Frame(int turn, int distance, long receivedMs) {
            super();
        }
        
        public final int getTurn() {
            return 0;
        }
        
        public final int getDistance() {
            return 0;
        }
        
        public final long getReceivedMs() {
            return 0L;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.hud.BydStarterBridge.Frame copy(int turn, int distance, long receivedMs) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}