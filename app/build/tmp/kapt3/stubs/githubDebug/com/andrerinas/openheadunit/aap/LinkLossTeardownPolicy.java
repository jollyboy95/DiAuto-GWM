package com.andrerinas.openheadunit.aap;

/**
 * Whether to close the current session *now*, while the link still works, rather than let it die
 * with the interface.
 *
 * Android Auto's head unit server is wedged permanently by a peer that vanishes without closing: it
 * goes on accepting connections and answering none of them, and only a restart on the phone brings
 * it back. A session that closes properly does not do that — which is the difference between a
 * drive that ends with the app disconnecting and one that ends with the power being cut.
 *
 * We cannot help the cases that arrive without warning (driving out of range, the access point
 * restarting, a power cut with no orderly shutdown). We can help the ones the system tells us about
 * first, and this decides which of those apply to the session actually running.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J2\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/andrerinas/openheadunit/aap/LinkLossTeardownPolicy;", "", "()V", "ridesOwnAccessPoint", "", "mode", "", "strategy", "transport", "Lcom/andrerinas/openheadunit/aap/NativeTransport;", "shouldTearDown", "trigger", "Lcom/andrerinas/openheadunit/aap/LinkLossTrigger;", "sessionIsWireless", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class LinkLossTeardownPolicy {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.LinkLossTeardownPolicy INSTANCE = null;
    
    private LinkLossTeardownPolicy() {
        super();
    }
    
    /**
     * @param mode [com.andrerinas.openheadunit.utils.Settings.wifiConnectionMode]
     * @param strategy [com.andrerinas.openheadunit.utils.Settings.helperConnectionStrategy]
     * @param transport applies to [mode] 3 only
     * @param sessionIsWireless whether the session actually running rides a socket. The wireless
     *  mode is a stored setting and says nothing about it: a USB session can be live while
     *  [mode] names a WiFi route, and switching WiFi off must not end it.
     */
    public final boolean shouldTearDown(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.LinkLossTrigger trigger, int mode, int strategy, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.NativeTransport transport, boolean sessionIsWireless) {
        return false;
    }
    
    /**
     * The two routes where the phone sits on an access point this device is hosting.
     */
    private final boolean ridesOwnAccessPoint(int mode, int strategy, com.andrerinas.openheadunit.aap.NativeTransport transport) {
        return false;
    }
}