package com.andrerinas.openheadunit.connection;

/**
 * Manages Google Nearby Connections on the Headunit (Tablet).
 * The Tablet acts as a DISCOVERER only.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\u00020\u0001:\u0002+,B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ\u000e\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\fJ\b\u0010\'\u001a\u00020\u001dH\u0002J\u0006\u0010(\u001a\u00020\tJ\b\u0010)\u001a\u00020\tH\u0002J\u0006\u0010*\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/andrerinas/openheadunit/connection/NearbyManager;", "", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onSocketReady", "Lkotlin/Function1;", "Ljava/net/Socket;", "", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V", "SERVICE_ID", "", "STRATEGY", "Lcom/google/android/gms/nearby/connection/Strategy;", "activeEndpointId", "activeNearbySocket", "Lcom/andrerinas/openheadunit/connection/NearbySocket;", "activePipes", "", "Landroid/os/ParcelFileDescriptor;", "[Landroid/os/ParcelFileDescriptor;", "connectionLifecycleCallback", "Lcom/google/android/gms/nearby/connection/ConnectionLifecycleCallback;", "connectionsClient", "Lcom/google/android/gms/nearby/connection/ConnectionsClient;", "endpointDiscoveryCallback", "Lcom/google/android/gms/nearby/connection/EndpointDiscoveryCallback;", "isConnecting", "", "isRunning", "payloadCallback", "Lcom/google/android/gms/nearby/connection/PayloadCallback;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "upgradeTimeoutJob", "Lkotlinx/coroutines/Job;", "connectToEndpoint", "endpointId", "hasRequiredPermissions", "start", "startDiscovery", "stop", "Companion", "DiscoveredEndpoint", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class NearbyManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.net.Socket, kotlin.Unit> onSocketReady = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.andrerinas.openheadunit.connection.NearbyManager.DiscoveredEndpoint>> _discoveredEndpoints = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.flow.StateFlow<java.util.List<com.andrerinas.openheadunit.connection.NearbyManager.DiscoveredEndpoint>> discoveredEndpoints = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.nearby.connection.ConnectionsClient connectionsClient = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String SERVICE_ID = "com.andrerinas.openhu";
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.nearby.connection.Strategy STRATEGY = null;
    private boolean isRunning = false;
    private boolean isConnecting = false;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.connection.NearbySocket activeNearbySocket;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String activeEndpointId;
    @org.jetbrains.annotations.Nullable()
    private android.os.ParcelFileDescriptor[] activePipes;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job upgradeTimeoutJob;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.nearby.connection.EndpointDiscoveryCallback endpointDiscoveryCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.nearby.connection.PayloadCallback payloadCallback = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.NearbyManager.Companion Companion = null;
    
    public NearbyManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.net.Socket, kotlin.Unit> onSocketReady) {
        super();
    }
    
    public final void start() {
    }
    
    private final boolean hasRequiredPermissions() {
        return false;
    }
    
    public final void stop() {
    }
    
    /**
     * Manually initiate a connection to a specific discovered endpoint.
     * Called from HomeFragment when user taps a device in the list.
     */
    public final void connectToEndpoint(@org.jetbrains.annotations.NotNull()
    java.lang.String endpointId) {
    }
    
    private final void startDiscovery() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/connection/NearbyManager$Companion;", "", "()V", "_discoveredEndpoints", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/andrerinas/openheadunit/connection/NearbyManager$DiscoveredEndpoint;", "discoveredEndpoints", "Lkotlinx/coroutines/flow/StateFlow;", "getDiscoveredEndpoints", "()Lkotlinx/coroutines/flow/StateFlow;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.andrerinas.openheadunit.connection.NearbyManager.DiscoveredEndpoint>> getDiscoveredEndpoints() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/connection/NearbyManager$DiscoveredEndpoint;", "", "id", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class DiscoveredEndpoint {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        public DiscoveredEndpoint(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.connection.NearbyManager.DiscoveredEndpoint copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String name) {
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