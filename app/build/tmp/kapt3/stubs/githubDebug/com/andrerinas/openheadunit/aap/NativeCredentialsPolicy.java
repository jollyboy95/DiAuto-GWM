package com.andrerinas.openheadunit.aap;

/**
 * Whether a set of credentials is fit to hand the phone. The interesting case is a missing BSSID,
 * where the answer differs by transport:
 *
 * - **WiFi Direct** aborts. Measured, not cautious: a masked BSSID there means the phone rejects
 *  the credentials anyway, and the usual cause (location services off) is fixable once the log
 *  says so rather than showing a healthy-looking handshake and a phone that never arrives.
 * - **Hotspot** sends anyway, with the field empty. Not because an empty one works — it does not —
 *  but because the phone's refusal is a message we can explain, where aborting leaves nothing to
 *  read, and because the route stays open for any client that is less strict than the one measured.
 *
 * The justification this used to carry — that aa-proxy-rs and ZLink ship without a BSSID, so an
 * ordinary AP is identified by SSID — was wrong, and it is worth recording how wrong. Both reference
 * implementations declare `required string bssid = 3` in a byte-identical proto2 schema, and both
 * read it from the access point's own interface: aa-proxy-rs takes `mac_address_by_name(iface)` and
 * **fails to start** with "No MAC address found" if it cannot, and WirelessAndroidAutoDongle
 * defaults it to `getMacAddress("wlan0")`. Neither has a no-BSSID mode. The one aa-proxy-rs path
 * that has no address to hand sets an empty string, precisely because `required` forbids dropping
 * the field, with a comment anticipating that phones may need a real one.
 *
 * The phone side agrees. A current Gearhead joins with a `WifiNetworkSpecifier`, which matches SSID
 * *and* BSSID under a full `ff:ff:ff:ff:ff:ff` mask: credentials with no BSSID drew
 * `WIFI_INVALID_BSSID` and a type 6 `status=-3` on every attempt, with no fallback to matching on
 * the name. Measured 2026-08-05, phone-to-phone.
 *
 * So a missing BSSID is a failure everywhere it has been looked at, and the static BSSID setting is
 * the fix rather than a workaround. What this policy still buys is the *shape* of the failure: one
 * explained refusal instead of a silent abort.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/aap/NativeCredentialsPolicy;", "", "()V", "isUsableBssid", "", "bssid", "", "onUnusableBssid", "Lcom/andrerinas/openheadunit/aap/UnusableBssidAction;", "transport", "Lcom/andrerinas/openheadunit/aap/NativeTransport;", "shouldPublishCredentials", "apState", "Lcom/andrerinas/openheadunit/aap/SoftApState;", "interfaceNamedByUser", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class NativeCredentialsPolicy {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.NativeCredentialsPolicy INSTANCE = null;
    
    private NativeCredentialsPolicy() {
        super();
    }
    
    /**
     * Whether [bssid] is a real address rather than absent, blank or a masking placeholder.
     */
    public final boolean isUsableBssid(@org.jetbrains.annotations.Nullable()
    java.lang.String bssid) {
        return false;
    }
    
    /**
     * What to do when [isUsableBssid] said no.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.UnusableBssidAction onUnusableBssid(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.NativeTransport transport) {
        return null;
    }
    
    /**
     * Whether to advertise a network the framework says is not running.
     *
     * The failure this prevents, measured on a Unisoc head unit: with the real access point down,
     * the cellular bridge `seth_lte0` was the only interface up with a private address, so the app
     * paired the right network name with an address no phone could reach and logged SUCCESS. Name
     * exclusions alone cannot fix that class of thing — the list has needed extending three times —
     * because it is a guess about which unknown interfaces are not access points.
     *
     * Two exemptions, and only two:
     *
     * - [SoftApState.UNKNOWN] never refuses. `getWifiApState()` is not public API and is blocked
     *  outright on some devices, and a question we could not ask is not a question answered no.
     * - [interfaceNamedByUser] never refuses. Naming the interface is a specific claim about which
     *  network is up, and it is the escape hatch for a vendor that starts hostapd outside the
     *  framework — where the state read is silent while the access point is plainly there.
     *
     * A hand-typed *SSID* is deliberately not an exemption, though it was once: it names a network,
     * not an interface, and it is required on any device that refuses the config-read API — so
     * exempting it disabled this check on exactly the hardware that needed it.
     */
    public final boolean shouldPublishCredentials(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.SoftApState apState, boolean interfaceNamedByUser) {
        return false;
    }
}