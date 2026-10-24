package com.andrerinas.openheadunit.aap;

/**
 * Which operating channel to ask the P2P stack for, on the devices that have no band API.
 *
 * [NativeGroupBandPolicy] asks for a *band*, and that request only exists from API 29
 * (`WifiP2pConfig.Builder.setGroupOperatingBand`). Below it the app calls the no-argument
 * `createGroup` and the driver picks unaided, which is what every pre-Android-10 head unit in the
 * reports has been doing: `Standard createGroup SUCCESS!`, then `Freq: 0 MHz (unknown)`, with the
 * band unrecorded on our side and unchosen on theirs.
 *
 * There is one lever left on those devices. `WifiP2pManager.setWifiP2pChannels(c, listen, operating,
 * listener)` is hidden but present, and in AOSP 8.1's `SupplicantP2pIfaceHal` an operating channel is
 * turned into `setDisallowedFrequencies` around the single frequency it names - channel 36 becomes
 * 5180 MHz and everything either side of it is disallowed, so the group owner has nowhere else to go.
 * Reflection reaches it because the non-SDK blocklist only starts at API 28, and this app already
 * reflects into the same class for `setDeviceName`.
 *
 * Two constraints come from the platform and both are encoded here rather than left to the caller:
 *
 * - The channel must be set **while no group exists**. `WifiP2pServiceImpl` handles `SET_CHANNEL`
 *   only in its inactive state, so a request made after `createGroup` is dropped silently.
 * - The **listen** channel must be left alone. Discovery happens on the 2.4 GHz social channels
 *   (1, 6, 11) whatever the group runs on, and restricting it would make the unit undiscoverable.
 *   [LISTEN_CHANNEL_UNCHANGED] is the value that means "do not touch it".
 *
 * Channel 36 rather than any other: it is the bottom of UNII-1, it is not a DFS channel, and it is
 * what the reference implementations use - `WirelessAndroidAutoDongle` brings its access point up on
 * channel 36, and the AAWireless dongle's own filing lists 5180-5240 and 5745-5825 while avoiding the
 * DFS range between them. [CHANNEL_UPPER] is offered for the same reason the filing lists two ranges:
 * a unit whose regulatory domain refuses UNII-1 may still take UNII-3.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/andrerinas/openheadunit/aap/P2pOperatingChannelPolicy;", "", "()V", "CHANNEL_24_GHZ_TOP", "", "CHANNEL_LOWER", "CHANNEL_UNRESTRICTED", "CHANNEL_UPPER", "FIRST_API_WITH_BAND_REQUEST", "LISTEN_CHANNEL_UNCHANGED", "appliesTo", "", "sdkInt", "frequencyMhzFor", "channel", "isRequestable", "operatingChannel", "requestFiveGhz", "useUpperBand", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class P2pOperatingChannelPolicy {
    
    /**
     * Ask for nothing and leave the platform's own choice alone.
     */
    public static final int CHANNEL_UNRESTRICTED = 0;
    
    /**
     * Pass this as the listen channel: discovery must stay where the phone looks for it.
     */
    public static final int LISTEN_CHANNEL_UNCHANGED = 0;
    
    /**
     * 5180 MHz, bottom of UNII-1. Not a DFS channel.
     */
    public static final int CHANNEL_LOWER = 36;
    
    /**
     * 5745 MHz, bottom of UNII-3, for a regulatory domain that refuses UNII-1.
     */
    public static final int CHANNEL_UPPER = 149;
    
    /**
     * The last 2.4 GHz channel, and the one the linear formula does not describe.
     */
    public static final int CHANNEL_24_GHZ_TOP = 14;
    
    /**
     * The band request exists from here up, so below it is where this policy applies.
     */
    public static final int FIRST_API_WITH_BAND_REQUEST = 29;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.P2pOperatingChannelPolicy INSTANCE = null;
    
    private P2pOperatingChannelPolicy() {
        super();
    }
    
    /**
     * True when asking for an operating channel is the only way to influence the band.
     *
     * From API 29 the band request is a supported call with a supported fallback, and it is what
     * [NativeGroupBandPolicy] already drives; reaching for a hidden method there would be trading a
     * guarantee for a reflection.
     */
    public final boolean appliesTo(int sdkInt) {
        return false;
    }
    
    /**
     * The operating channel to request, or [CHANNEL_UNRESTRICTED] to ask for nothing.
     *
     * @param sdkInt this device's API level.
     * @param requestFiveGhz the user's opt-in. Off by default, because a unit whose P2P firmware
     *  cannot host a 5 GHz group owner would be left with a frequency list it cannot satisfy, and
     *  the failure would be a group that never forms rather than a group on the wrong band.
     * @param useUpperBand ask for UNII-3 instead of UNII-1.
     */
    public final int operatingChannel(int sdkInt, boolean requestFiveGhz, boolean useUpperBand) {
        return 0;
    }
    
    /**
     * The frequency a channel number names: 2.4 GHz channels count from 2407 MHz, 5 GHz channels from
     * 5000 MHz, and channel 14 is the standard's own exception to both.
     *
     * Here so a test can assert what the app is actually asking the driver for, and so the log can
     * name the frequency rather than a channel number the reader has to convert.
     */
    public final int frequencyMhzFor(int channel) {
        return 0;
    }
    
    /**
     * A channel the platform will accept. Outside this it rejects the whole request.
     */
    public final boolean isRequestable(int channel) {
        return false;
    }
}