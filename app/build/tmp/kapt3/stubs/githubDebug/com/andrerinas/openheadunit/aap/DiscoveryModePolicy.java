package com.andrerinas.openheadunit.aap;

/**
 * Which wireless configurations reach [com.andrerinas.openheadunit.connection.NetworkDiscovery],
 * and therefore probe Android Auto's head unit server on port 5277.
 *
 * Worth naming rather than leaving inline, because the answer surprises people: "Headunit Server"
 * (mode 1) and "Wireless Helper / Phone Hotspot (Host)" (mode 2, strategy 3) look like unrelated
 * features in the settings screen and are the same code path underneath. A defect found on one is
 * a defect on the other, which is how one bug report has read like two.
 *
 * @see com.andrerinas.openheadunit.utils.Settings.wifiConnectionMode
 * @see com.andrerinas.openheadunit.utils.Settings.helperConnectionStrategy
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a8\u0006\b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/DiscoveryModePolicy;", "", "()V", "usesNetworkDiscovery", "", "mode", "", "strategy", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class DiscoveryModePolicy {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.DiscoveryModePolicy INSTANCE = null;
    
    private DiscoveryModePolicy() {
        super();
    }
    
    /**
     * @param mode 0 = Manual, 1 = Auto (Headunit Server), 2 = Helper, 3 = Native AA.
     * @param strategy only meaningful when [mode] is 2: 0 = Common WiFi (NSD), 1 = WiFi Direct,
     *  2 = Google Nearby, 3 = Phone Hotspot (Host), 4 = Headunit Hotspot (Passive).
     */
    public final boolean usesNetworkDiscovery(int mode, int strategy) {
        return false;
    }
}