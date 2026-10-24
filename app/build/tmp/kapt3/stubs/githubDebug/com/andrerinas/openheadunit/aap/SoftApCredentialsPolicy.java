package com.andrerinas.openheadunit.aap;

/**
 * Whether this head unit knows enough about its own access point to describe it to a phone, and if
 * not, whether waiting could ever change that.
 *
 * The distinction is the whole point. "No access point yet" is worth polling for and is what the
 * hotspot auto-enable exists to fix; "there is one and this device will not name it" is a dead end
 * that polling only hides. They were one boolean once, and on a locked-down unit the resolve loop
 * spent its entire budget re-reading a configuration the device had already refused — logging the
 * same line once a second, switching on an access point that was already up, and never reaching the
 * handshake's first message. From the car that looks like Bluetooth connecting and nothing else
 * happening.
 *
 * Pure so it can be tested at all: the device this matters on is not the device available to test
 * with, so the outcome table pinned in `SoftApCredentialsPolicyTest` is the only place the
 * behaviour is checked.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006J \u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a8\u0006\f"}, d2 = {"Lcom/andrerinas/openheadunit/aap/SoftApCredentialsPolicy;", "", "()V", "decide", "Lcom/andrerinas/openheadunit/aap/SoftApCredentialsAttempt;", "manualSsid", "", "manualPassphrase", "systemConfig", "Lcom/andrerinas/openheadunit/aap/SoftApCredentials;", "siteLocalIpv4", "resolve", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class SoftApCredentialsPolicy {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.SoftApCredentialsPolicy INSTANCE = null;
    
    private SoftApCredentialsPolicy() {
        super();
    }
    
    /**
     * @param manualSsid [com.andrerinas.openheadunit.utils.Settings.hotspotSsid] — the user's
     *  override, and the one thing that makes this route work on a device that hides its own
     *  configuration
     * @param manualPassphrase [com.andrerinas.openheadunit.utils.Settings.hotspotPassword]
     * @param systemConfig what the device says its own access point is named, or null where it will
     *  not say. The caller reads it only when [manualSsid] is empty — a name the user typed is a
     *  claim about their own hardware, and reading past it would cost a reflective call whose
     *  answer is already outranked.
     * @param siteLocalIpv4 the chosen interface's own address, or null if it has none yet
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.SoftApCredentialsAttempt decide(@org.jetbrains.annotations.NotNull()
    java.lang.String manualSsid, @org.jetbrains.annotations.NotNull()
    java.lang.String manualPassphrase, @org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.aap.SoftApCredentials systemConfig, @org.jetbrains.annotations.Nullable()
    java.lang.String siteLocalIpv4) {
        return null;
    }
    
    /**
     * The credentials to send: each field the user's override where they set one, the device's own
     * configuration where they did not.
     *
     * Note what this means at the call site, since it is a real outcome and not an oversight. A user
     * who names the network but leaves the password blank gets an **empty passphrase**, not the
     * device's — the caller does not read the system configuration at all once a manual name is set,
     * so there is nothing to fall back to. Sending an open network is worse than sending nothing on
     * a protocol that refuses one, so the caller warns; it is not silently corrected here, because
     * pairing a name the user typed with a passphrase read off the device would hand the phone a
     * mismatched pair and fail with no line pointing at why.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.SoftApCredentials resolve(@org.jetbrains.annotations.NotNull()
    java.lang.String manualSsid, @org.jetbrains.annotations.NotNull()
    java.lang.String manualPassphrase, @org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.aap.SoftApCredentials systemConfig) {
        return null;
    }
}