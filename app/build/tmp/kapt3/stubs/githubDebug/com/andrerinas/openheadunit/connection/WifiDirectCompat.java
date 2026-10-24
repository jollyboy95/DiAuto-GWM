package com.andrerinas.openheadunit.connection;

/**
 * Handles WiFi P2P API calls that require higher API levels to avoid NoClassDefFoundError
 * on older Android versions during class loading of [WifiDirectManager].
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J=\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\b0\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/connection/WifiDirectCompat;", "", "()V", "getGroupFrequency", "", "group", "Landroid/net/wifi/p2p/WifiP2pGroup;", "requestDeviceInfo", "", "manager", "Landroid/net/wifi/p2p/WifiP2pManager;", "channel", "Landroid/net/wifi/p2p/WifiP2pManager$Channel;", "onDeviceAvailable", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "address", "Api29Impl", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class WifiDirectCompat {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.WifiDirectCompat INSTANCE = null;
    
    private WifiDirectCompat() {
        super();
    }
    
    /**
     * Safely calls [WifiP2pManager.requestDeviceInfo] if running on API 29+.
     */
    public final void requestDeviceInfo(@org.jetbrains.annotations.Nullable()
    android.net.wifi.p2p.WifiP2pManager manager, @org.jetbrains.annotations.Nullable()
    android.net.wifi.p2p.WifiP2pManager.Channel channel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDeviceAvailable) {
    }
    
    public final int getGroupFrequency(@org.jetbrains.annotations.Nullable()
    android.net.wifi.p2p.WifiP2pGroup group) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c3\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J9\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\b0\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/andrerinas/openheadunit/connection/WifiDirectCompat$Api29Impl;", "", "()V", "getGroupFrequency", "", "group", "Landroid/net/wifi/p2p/WifiP2pGroup;", "requestDeviceInfo", "", "manager", "Landroid/net/wifi/p2p/WifiP2pManager;", "channel", "Landroid/net/wifi/p2p/WifiP2pManager$Channel;", "onDeviceAvailable", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "address", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.Q)
    static final class Api29Impl {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.connection.WifiDirectCompat.Api29Impl INSTANCE = null;
        
        private Api29Impl() {
            super();
        }
        
        public final void requestDeviceInfo(@org.jetbrains.annotations.NotNull()
        android.net.wifi.p2p.WifiP2pManager manager, @org.jetbrains.annotations.NotNull()
        android.net.wifi.p2p.WifiP2pManager.Channel channel, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDeviceAvailable) {
        }
        
        public final int getGroupFrequency(@org.jetbrains.annotations.NotNull()
        android.net.wifi.p2p.WifiP2pGroup group) {
            return 0;
        }
    }
}