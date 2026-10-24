package com.andrerinas.openheadunit.connection;

/**
 * Reaches `WifiP2pManager.setWifiP2pChannels`, which is hidden on every API level but is the only way
 * a pre-Android-10 device can be told which frequency to host its group on.
 *
 * The same reflection shape as `setDeviceName` in [WifiDirectManager], for the same reason: the
 * method is `@hide` rather than absent, and the non-SDK blocklist that would refuse it only starts at
 * API 28, below which this is the only lever there is. See [P2pOperatingChannelPolicy] for what the
 * platform does with the value and why the listen channel must be left alone.
 *
 * Every failure here is non-fatal by construction. A group on the platform's own choice of channel is
 * the behaviour that shipped; a group that never forms because a reflection threw is not, so the
 * caller is told and carries on either way.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JP\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n28\b\u0002\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00060\fJV\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u001426\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00060\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/andrerinas/openheadunit/connection/WifiP2pChannelCompat;", "", "()V", "METHOD", "", "clearOperatingChannel", "", "manager", "Landroid/net/wifi/p2p/WifiP2pManager;", "channel", "Landroid/net/wifi/p2p/WifiP2pManager$Channel;", "onResult", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "applied", "detail", "setOperatingChannel", "operatingChannel", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class WifiP2pChannelCompat {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String METHOD = "setWifiP2pChannels";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.WifiP2pChannelCompat INSTANCE = null;
    
    private WifiP2pChannelCompat() {
        super();
    }
    
    /**
     * Requests [operatingChannel], leaving the listen channel untouched.
     *
     * @param onResult invoked exactly once, with the platform's own verdict where there is one and
     *  with the reflection's where there is not. [onResult] is what continues group creation, so it
     *  must run on every path - including the one where the method does not exist.
     */
    public final void setOperatingChannel(@org.jetbrains.annotations.NotNull()
    android.net.wifi.p2p.WifiP2pManager manager, @org.jetbrains.annotations.NotNull()
    android.net.wifi.p2p.WifiP2pManager.Channel channel, int operatingChannel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> onResult) {
    }
    
    /**
     * Gives the frequency list back to the platform.
     *
     * The restriction outlives the group and the process that set it - it is state in the supplicant,
     * not in this app - so leaving it in place would follow the user into whatever else the unit does
     * with WiFi Direct. Called on teardown for that reason, not for tidiness.
     */
    public final void clearOperatingChannel(@org.jetbrains.annotations.NotNull()
    android.net.wifi.p2p.WifiP2pManager manager, @org.jetbrains.annotations.NotNull()
    android.net.wifi.p2p.WifiP2pManager.Channel channel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> onResult) {
    }
}