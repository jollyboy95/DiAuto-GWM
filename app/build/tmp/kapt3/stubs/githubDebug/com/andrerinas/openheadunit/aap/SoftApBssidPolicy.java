package com.andrerinas.openheadunit.aap;

/**
 * Picks the BSSID to advertise for our own access point, best source first.
 *
 * A chain rather than one source because `NetworkInterface.getHardwareAddress()` returns null or a
 * placeholder on plenty of devices since Android 6.0, while `/sys/class/net/<iface>/address` still
 * works on most head units. Pure and tested: case, placeholder detection and empty-vs-null are
 * easy to get subtly wrong and impossible to check by reading a log.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/aap/SoftApBssidPolicy;", "", "()V", "MAC_SHAPE", "Lkotlin/text/Regex;", "PLACEHOLDERS", "", "", "choose", "staticOverride", "shellMac", "hardwareAddress", "ipv6DerivedMac", "isUsable", "", "mac", "normalise", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class SoftApBssidPolicy {
    
    /**
     * Android's masking placeholders. Note what is *not* here: anything merely beginning with
     * `02:`. That bit marks a locally-administered MAC and Android's own soft AP routinely uses a
     * randomised one, so rejecting the range would discard the BSSID this exists to find.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<java.lang.String> PLACEHOLDERS = null;
    
    /**
     * Six hex pairs separated by colons or dashes.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.text.Regex MAC_SHAPE = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.SoftApBssidPolicy INSTANCE = null;
    
    private SoftApBssidPolicy() {
        super();
    }
    
    /**
     * The first usable address of [staticOverride], [shellMac] and [hardwareAddress], normalised to
     * colon-separated upper case, or "" if none yields one. What to do about "" differs by
     * transport — see [NativeCredentialsPolicy].
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String choose(@org.jetbrains.annotations.Nullable()
    java.lang.String staticOverride, @org.jetbrains.annotations.Nullable()
    java.lang.String shellMac, @org.jetbrains.annotations.Nullable()
    java.lang.String hardwareAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String ipv6DerivedMac) {
        return null;
    }
    
    /**
     * Whether [mac] is a real address.
     *
     * [BUG_FIX] Checks the shape, not a list of known non-addresses. The setting this reads first
     * stores the string "0" when it is unset, which is not MAC-shaped but passed the old
     * placeholder check, won the chain over the real interface MAC, and was published verbatim —
     * the phone then rejected the credentials on every retry. A free-text field can produce any
     * number of such values, so validate what an address looks like instead.
     */
    public final boolean isUsable(@org.jetbrains.annotations.Nullable()
    java.lang.String mac) {
        return false;
    }
    
    /**
     * Dashes to colons, upper case. Accepts either separator so a hand-typed address still works.
     */
    private final java.lang.String normalise(java.lang.String mac) {
        return null;
    }
}