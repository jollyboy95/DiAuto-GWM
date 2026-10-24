package com.andrerinas.openheadunit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0010R\u0011\u0010%\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(\u00a8\u0006)"}, d2 = {"Lcom/andrerinas/openheadunit/AppComponent;", "", "app", "Lcom/andrerinas/openheadunit/App;", "(Lcom/andrerinas/openheadunit/App;)V", "audioDecoder", "Lcom/andrerinas/openheadunit/decoder/AudioDecoder;", "getAudioDecoder", "()Lcom/andrerinas/openheadunit/decoder/AudioDecoder;", "carKeysManager", "Lcom/andrerinas/openheadunit/connection/carkey/CarKeysManager;", "getCarKeysManager", "()Lcom/andrerinas/openheadunit/connection/carkey/CarKeysManager;", "clusterVideoDecoder", "Lcom/andrerinas/openheadunit/decoder/VideoDecoder;", "getClusterVideoDecoder", "()Lcom/andrerinas/openheadunit/decoder/VideoDecoder;", "clusterVideoDecoder$delegate", "Lkotlin/Lazy;", "commManager", "Lcom/andrerinas/openheadunit/connection/CommManager;", "getCommManager", "()Lcom/andrerinas/openheadunit/connection/CommManager;", "notificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "()Landroid/app/NotificationManager;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "getSettings", "()Lcom/andrerinas/openheadunit/utils/Settings;", "suExecutor", "Lcom/andrerinas/openheadunit/utils/SUExecutor;", "getSuExecutor", "()Lcom/andrerinas/openheadunit/utils/SUExecutor;", "videoDecoder", "getVideoDecoder", "wifiManager", "Landroid/net/wifi/WifiManager;", "getWifiManager", "()Landroid/net/wifi/WifiManager;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AppComponent {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.App app = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.decoder.VideoDecoder videoDecoder = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.decoder.AudioDecoder audioDecoder = null;
    
    /**
     * Decodes the instrument-cluster (dashboard) stream; created only if a session uses one.
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy clusterVideoDecoder$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.connection.CommManager commManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.SUExecutor suExecutor = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.connection.carkey.CarKeysManager carKeysManager = null;
    
    public AppComponent(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.App app) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.utils.Settings getSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.decoder.VideoDecoder getVideoDecoder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.decoder.AudioDecoder getAudioDecoder() {
        return null;
    }
    
    /**
     * Decodes the instrument-cluster (dashboard) stream; created only if a session uses one.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.decoder.VideoDecoder getClusterVideoDecoder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.NotificationManager getNotificationManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.wifi.WifiManager getWifiManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.connection.CommManager getCommManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.utils.SUExecutor getSuExecutor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.connection.carkey.CarKeysManager getCarKeysManager() {
        return null;
    }
}