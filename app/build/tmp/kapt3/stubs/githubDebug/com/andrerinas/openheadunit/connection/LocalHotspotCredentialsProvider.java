package com.andrerinas.openheadunit.connection;

/**
 * An app-owned local AP reservation; never changes saved Wi-Fi or global tethering settings.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001;B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\nH\u0002J\b\u0010#\u001a\u00020\rH\u0002J\u0010\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u000fH\u0002J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'H\u0002J\b\u0010)\u001a\u00020\rH\u0002J\u0006\u0010*\u001a\u00020\rJ\u0010\u0010+\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u000fH\u0002J8\u0010,\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\n2\n\u0010-\u001a\u00060\u0019R\u00020\u001a2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000f0/H\u0002J,\u00101\u001a\u00020\r2$\u00102\u001a \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u0011J\u0014\u00103\u001a\u00020\r2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0006\u00104\u001a\u00020\rJ\u0010\u00105\u001a\u00020\r2\u0006\u00106\u001a\u000207H\u0002J\u0006\u00108\u001a\u00020\rJ\b\u00109\u001a\u00020\rH\u0002J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000f0/H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R.\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0018\u00010\u0019R\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/andrerinas/openheadunit/connection/LocalHotspotCredentialsProvider;", "", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "connectivity", "Landroid/net/ConnectivityManager;", "generation", "", "invalidated", "Lkotlin/Function0;", "", "lastFailure", "", "listener", "Lkotlin/Function4;", "main", "Landroid/os/Handler;", "ready", "Lcom/andrerinas/openheadunit/connection/LocalHotspotCredentialsProvider$Credentials;", "requested", "", "reservation", "Landroid/net/wifi/WifiManager$LocalOnlyHotspotReservation;", "Landroid/net/wifi/WifiManager;", "resolveJob", "Lkotlinx/coroutines/Job;", "timeout", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "wifi", "current", "token", "disconnectTwoPointFourStation", "fail", "message", "interfaces", "", "Lcom/andrerinas/openheadunit/aap/ApInterfaceCandidate;", "publish", "refresh", "report", "resolve", "owned", "before", "", "upstreams", "setCredentialsListener", "value", "setInvalidatedListener", "start", "startFiveGhzHotspot", "callback", "Landroid/net/wifi/WifiManager$LocalOnlyHotspotCallback;", "stop", "stopOnMain", "upstreamInterfaces", "Credentials", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class LocalHotspotCredentialsProvider {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler main = null;
    @org.jetbrains.annotations.NotNull()
    private final android.net.wifi.WifiManager wifi = null;
    @org.jetbrains.annotations.NotNull()
    private final android.net.ConnectivityManager connectivity = null;
    private int generation = 0;
    private boolean requested = false;
    @org.jetbrains.annotations.Nullable()
    private android.net.wifi.WifiManager.LocalOnlyHotspotReservation reservation;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job resolveJob;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Runnable timeout;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.connection.LocalHotspotCredentialsProvider.Credentials ready;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lastFailure;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> listener;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> invalidated;
    
    public LocalHotspotCredentialsProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope) {
        super();
    }
    
    public final void setCredentialsListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> value) {
    }
    
    public final void setInvalidatedListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> value) {
    }
    
    public final void start() {
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final void disconnectTwoPointFourStation() {
    }
    
    private final void startFiveGhzHotspot(android.net.wifi.WifiManager.LocalOnlyHotspotCallback callback) {
    }
    
    public final void refresh() {
    }
    
    public final void stop() {
    }
    
    private final boolean current(int token) {
        return false;
    }
    
    private final void stopOnMain() {
    }
    
    private final void fail(java.lang.String message) {
    }
    
    private final void report(java.lang.String message) {
    }
    
    private final void publish() {
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final void resolve(int token, android.net.wifi.WifiManager.LocalOnlyHotspotReservation owned, java.util.Set<java.lang.String> before, java.util.Set<java.lang.String> upstreams) {
    }
    
    private final java.util.List<com.andrerinas.openheadunit.aap.ApInterfaceCandidate> interfaces() {
        return null;
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final java.util.Set<java.lang.String> upstreamInterfaces() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/connection/LocalHotspotCredentialsProvider$Credentials;", "", "ssid", "", "password", "ip", "bssid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBssid", "()Ljava/lang/String;", "getIp", "getPassword", "getSsid", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class Credentials {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ssid = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String password = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ip = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String bssid = null;
        
        public Credentials(@org.jetbrains.annotations.NotNull()
        java.lang.String ssid, @org.jetbrains.annotations.NotNull()
        java.lang.String password, @org.jetbrains.annotations.NotNull()
        java.lang.String ip, @org.jetbrains.annotations.NotNull()
        java.lang.String bssid) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSsid() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPassword() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIp() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBssid() {
            return null;
        }
    }
}