package com.andrerinas.openheadunit.connection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u0000 )2\u00020\u0001:\u0003)*+B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0002\u0010\u0013J$\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002J\u0016\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u001e\u001a\u00020\u0011H\u0002J$\u0010\u001f\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\"\u001a\u00020\bH\u0002J\u000e\u0010#\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u001aH\u0082@\u00a2\u0006\u0002\u0010$J\u0010\u0010&\u001a\u00020\u00112\b\b\u0002\u0010\'\u001a\u00020\u0011J\u0006\u0010(\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R2\u0010\t\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/andrerinas/openheadunit/connection/NetworkDiscovery;", "", "context", "Landroid/content/Context;", "listener", "Lcom/andrerinas/openheadunit/connection/NetworkDiscovery$Listener;", "(Landroid/content/Context;Lcom/andrerinas/openheadunit/connection/NetworkDiscovery$Listener;)V", "currentGeneration", "Lcom/andrerinas/openheadunit/connection/NetworkDiscovery$Generation;", "reportedIps", "", "", "kotlin.jvm.PlatformType", "", "scanJob", "Lkotlinx/coroutines/Job;", "checkAndReport", "", "ip", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPort", "Ljava/net/Socket;", "port", "", "timeout", "collectInterfaceSuspects", "", "suspects", "getLocalIpAddress", "getSubnet", "isEmulator", "newScanJob", "previous", "priorProbe", "generation", "scanGateways", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scanSubnet", "startScan", "oneShot", "stop", "Companion", "Generation", "Listener", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class NetworkDiscovery {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.connection.NetworkDiscovery.Listener listener = null;
    
    /**
     * The most recently started scan, whichever instance owns it. Probing port 5277 is not an
     * instance-local activity: the server on the other end is a process-wide singleton, so two
     * instances probing at once break it exactly as two scans in one instance would.
     *
     * Guarded by [PROBE_LOCK] rather than by the instance, because the whole point is that the
     * two racing callers are usually *different* instances, and a per-instance lock would let
     * them straight past each other.
     */
    @org.jetbrains.annotations.Nullable()
    private static kotlinx.coroutines.Job inFlightScan;
    
    /**
     * Held across the read-modify-write of [inFlightScan]. Never held while blocking.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.Object PROBE_LOCK = null;
    
    /**
     * @Volatile: written under [PROBE_LOCK], read by [stop] and by the promotion check.
     */
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile kotlinx.coroutines.Job scanJob;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile com.andrerinas.openheadunit.connection.NetworkDiscovery.Generation currentGeneration;
    private final java.util.Set<java.lang.String> reportedIps = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.NetworkDiscovery.Companion Companion = null;
    
    public NetworkDiscovery(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.connection.NetworkDiscovery.Listener listener) {
        super();
    }
    
    /**
     * [oneShot] belongs to the scan being started, not to the instance, because callers that want
     * a single sweep and callers that want the 10 s re-arm now share one instance.
     *
     * @return `true` if a scan was started, `false` if one was already in flight and this request
     *  was folded into it. A caller that kicked the scan because the *network changed* wants to
     *  know the difference — see `AapService`'s network monitor.
     */
    public final boolean startScan(boolean oneShot) {
        return false;
    }
    
    private final kotlinx.coroutines.Job newScanJob(kotlinx.coroutines.Job previous, kotlinx.coroutines.Job priorProbe, com.andrerinas.openheadunit.connection.NetworkDiscovery.Generation generation) {
        return null;
    }
    
    private final java.lang.Object scanGateways(kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    private final java.lang.Object scanSubnet(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.String getLocalIpAddress() {
        return null;
    }
    
    private final java.lang.Object checkAndReport(java.lang.String ip, kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    private final java.net.Socket checkPort(java.lang.String ip, int port, int timeout) {
        return null;
    }
    
    private final void collectInterfaceSuspects(java.util.Set<java.lang.String> suspects) {
    }
    
    private final java.lang.String getSubnet() {
        return null;
    }
    
    public final void stop() {
    }
    
    private final boolean isEmulator() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/connection/NetworkDiscovery$Companion;", "", "()V", "PROBE_LOCK", "inFlightScan", "Lkotlinx/coroutines/Job;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    /**
     * One scan, with the disposition that belongs to it. Kept together rather than in an instance
     * field so a scan can never report the *next* scan's kind: a cancelled scan is replaced while
     * it is still unwinding, and a continuous sweep that reported itself as one-shot would decline
     * to re-arm and end discovery for good.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/connection/NetworkDiscovery$Generation;", "", "initialOneShot", "", "(Z)V", "oneShot", "getOneShot", "()Z", "setOneShot", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class Generation {
        
        /**
         * Written by a promotion on another thread, read by this scan's own `finally`.
         */
        @kotlin.jvm.Volatile()
        private volatile boolean oneShot;
        
        public Generation(boolean initialOneShot) {
            super();
        }
        
        /**
         * Written by a promotion on another thread, read by this scan's own `finally`.
         */
        public final boolean getOneShot() {
            return false;
        }
        
        /**
         * Written by a promotion on another thread, read by this scan's own `finally`.
         */
        public final void setOneShot(boolean p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/connection/NetworkDiscovery$Listener;", "", "onScanFinished", "", "oneShot", "", "onServiceFound", "ip", "", "port", "", "socket", "Ljava/net/Socket;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static abstract interface Listener {
        
        public abstract void onServiceFound(@org.jetbrains.annotations.NotNull()
        java.lang.String ip, int port, @org.jetbrains.annotations.Nullable()
        java.net.Socket socket);
        
        /**
         * [oneShot] is the disposition of the scan that just finished, not of the last request.
         * A one-shot request made while a continuous scan was already running is ignored, so the
         * running scan has to report its own kind or it would silently lose its re-arm.
         */
        public abstract void onScanFinished(boolean oneShot);
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
        }
    }
}