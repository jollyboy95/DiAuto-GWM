package com.andrerinas.openheadunit.aap;

/**
 * Whether a given WiFi mode/strategy combination uses [com.andrerinas.openheadunit.connection.WifiDirectManager]
 * to run a WiFi Direct P2P group. Shared between [AapService.initWifiMode] (stop it on a
 * *settings change*) and [AapService.onDisconnected] (stop it on a *user disconnect*) so the
 * two call sites can't drift out of sync.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WifiModePolicy;", "", "()V", "usesWifiDirect", "", "mode", "", "strategy", "transport", "Lcom/andrerinas/openheadunit/aap/NativeTransport;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class WifiModePolicy {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.WifiModePolicy INSTANCE = null;
    
    private WifiModePolicy() {
        super();
    }
    
    /**
     * [transport] applies to mode 3 only, and is the whole reason this takes a third argument:
     * on the hotspot route the answer must be false, because the caller reacts to a true by
     * force-disabling the hotspot before starting P2P — which would tear down the very access
     * point the route is about to advertise.
     */
    public final boolean usesWifiDirect(int mode, int strategy, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.NativeTransport transport) {
        return false;
    }
}