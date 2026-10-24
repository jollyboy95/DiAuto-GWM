package com.andrerinas.openheadunit.aap;

/**
 * Whether ending a session by hand should also take down the access point the phone is sitting on.
 *
 * Closing the AAP socket and sending a `ByeByeRequest` does not make the phone leave the network:
 * it stays associated and Android Auto spins on its wireless-setup restart until it throttles
 * itself, because from its side the car walked away mid-session. The only lever this app has is
 * making the network go away — which is exactly what [AapService] already does for WiFi Direct by
 * removing the P2P group. This decides the same question for the two routes that run on a soft AP
 * instead, and is the deliberate complement of [WifiModePolicy.usesWifiDirect]: for any one
 * disconnect exactly one of the two can answer yes.
 *
 * The gate is ownership rather than symptom. A P2P group is always ours, created for the session
 * and safe to remove; a soft AP usually is not — the user switched it on, and switching one back on
 * is best effort that most unrooted units cannot do at all. Leaving somebody's hotspot off with no
 * way to restore it is worse than the stall, which they can clear themselves. So the access point
 * comes down only when they have already handed the app that job.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bJ\u001e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\u000e"}, d2 = {"Lcom/andrerinas/openheadunit/aap/UserExitHotspotPolicy;", "", "()V", "onUserExit", "Lcom/andrerinas/openheadunit/aap/HotspotExitAction;", "mode", "", "strategy", "transport", "Lcom/andrerinas/openheadunit/aap/NativeTransport;", "autoEnableHotspot", "", "teardownProvenUnsafe", "usesHeadUnitHotspot", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class UserExitHotspotPolicy {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.UserExitHotspotPolicy INSTANCE = null;
    
    private UserExitHotspotPolicy() {
        super();
    }
    
    /**
     * @param mode [com.andrerinas.openheadunit.utils.Settings.wifiConnectionMode]
     * @param strategy [com.andrerinas.openheadunit.utils.Settings.helperConnectionStrategy]
     * @param transport applies to [mode] 3 only
     * @param autoEnableHotspot [com.andrerinas.openheadunit.utils.Settings.autoEnableHotspot] — the
     *  user's standing permission for the app to drive this device's hotspot
     * @param teardownProvenUnsafe whether this device has already failed to bring its access point
     *  back after the app took it down. See the note on the [HotspotExitAction.WARN_LEFT_UP]
     *  branch below.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.HotspotExitAction onUserExit(int mode, int strategy, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.NativeTransport transport, boolean autoEnableHotspot, boolean teardownProvenUnsafe) {
        return null;
    }
    
    /**
     * Whether this combination puts the phone on an access point this device is hosting.
     */
    public final boolean usesHeadUnitHotspot(int mode, int strategy, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.NativeTransport transport) {
        return false;
    }
}