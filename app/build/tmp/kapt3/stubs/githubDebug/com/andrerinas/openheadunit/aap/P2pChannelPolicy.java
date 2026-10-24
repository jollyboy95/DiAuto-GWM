package com.andrerinas.openheadunit.aap;

/**
 * Whether the channel a P2P group came up on is one a phone can actually join.
 *
 * Android picks the group owner's operating channel itself; below API 29 there is no way to ask for
 * one. On a device whose WiFi country code is unset or permissive the driver can pick 2.4 GHz
 * channel 12 or 13, which most phones will refuse - a client in the FCC domain is limited to
 * channels 1-11 and generally will not even list an access point above that in a scan. The result
 * is a group that is up and beaconing while the phone reports only that it cannot find the network.
 *
 * This only names the condition; nothing acts on it beyond telling the user. The channel is settled
 * when the WiFi radio initialises, not when the group is created, so recreating the group re-picks
 * the same one - measured on a unit where this failed as six recreates all landing on 2467 MHz.
 * Restarting WiFi, or a country code the driver honours, is what moves it.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/aap/P2pChannelPolicy;", "", "()V", "CHANNEL_13_MHZ", "", "CHANNEL_14_MHZ", "CHANNEL_1_MHZ", "MAX_CLIENT_SAFE_2GHZ_MHZ", "channelFor", "frequencyMhz", "describe", "", "is24GHz", "", "isClientUnfriendly", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class P2pChannelPolicy {
    
    /**
     * Channel 1. Below this is not a 2.4 GHz channel.
     */
    private static final int CHANNEL_1_MHZ = 2412;
    
    /**
     * Channel 11, the top of the range every regulatory domain lets a client associate on.
     */
    private static final int MAX_CLIENT_SAFE_2GHZ_MHZ = 2462;
    
    /**
     * Channel 13, the top of the regular 5 MHz spacing.
     */
    private static final int CHANNEL_13_MHZ = 2472;
    
    /**
     * Channel 14: Japan only, 802.11b only, and off the 5 MHz grid.
     *
     * Public because [P2pOperatingChannelPolicy] converts the other way and needs the same exception.
     * The two were written independently and only this one had it, so the number is shared rather
     * than repeated.
     */
    public static final int CHANNEL_14_MHZ = 2484;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.P2pChannelPolicy INSTANCE = null;
    
    private P2pChannelPolicy() {
        super();
    }
    
    /**
     * True for a 2.4 GHz frequency, by the span the band occupies rather than by exact channel.
     */
    public final boolean is24GHz(int frequencyMhz) {
        return false;
    }
    
    /**
     * The 2.4 GHz channel number for [frequencyMhz], or 0 when it is not one. Channels 1-13 are
     * 5 MHz apart starting at 2412; channel 14 breaks the pattern and sits at 2484.
     */
    public final int channelFor(int frequencyMhz) {
        return 0;
    }
    
    /**
     * True when a group on [frequencyMhz] is one many phones cannot join: 2.4 GHz above channel 11.
     *
     * Deliberately false for an unknown frequency - 0 is what the pre-API-29 reflection returns when
     * no field name matches - and for 5 GHz. Telling a user their channel is the problem on the
     * strength of a measurement we do not have would send them chasing the wrong thing.
     */
    public final boolean isClientUnfriendly(int frequencyMhz) {
        return false;
    }
    
    /**
     * How the channel should read in a log line: "channel 12", or "unknown channel" for a 0.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String describe(int frequencyMhz) {
        return null;
    }
}