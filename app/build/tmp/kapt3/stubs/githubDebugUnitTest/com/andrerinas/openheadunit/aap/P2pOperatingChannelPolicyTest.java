package com.andrerinas.openheadunit.aap;

/**
 * The frequencies are the ones the platform derives, not ones chosen here: `SupplicantP2pIfaceHal`
 * turns an operating channel into `(channel <= 14 ? 2407 : 5000) + channel * 5` and disallows
 * everything either side of it. If these numbers are wrong the driver is asked for the wrong band.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\bH\u0007J\b\u0010\r\u001a\u00020\bH\u0007J\b\u0010\u000e\u001a\u00020\bH\u0007J\b\u0010\u000f\u001a\u00020\bH\u0007J\b\u0010\u0010\u001a\u00020\bH\u0007J\b\u0010\u0011\u001a\u00020\bH\u0007J\b\u0010\u0012\u001a\u00020\bH\u0007J\b\u0010\u0013\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/aap/P2pOperatingChannelPolicyTest;", "", "()V", "api27", "", "api29", "api34", "a channel the platform would reject has no frequency", "", "a modern device is never given a channel, because it has the supported band request", "both offered channels are outside the DFS range a group owner may not use", "channel 36 is 5180 MHz, which is what makes this worth doing", "every channel this policy can return is one the platform accepts", "opting in on an old device asks for channel 36", "the 2_4 GHz channels use the other base, so a mix-up would be visible", "the 2_4 GHz conversion agrees with the one that reads a group\'s frequency back", "the default is to ask for nothing, so an untouched install behaves as it always did", "the upper band channel is 5745 MHz", "the upper band is only reached when it is asked for", "this applies only below the API that has a band request", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class P2pOperatingChannelPolicyTest {
    private final int api27 = 27;
    private final int api29 = 29;
    private final int api34 = 34;
    
    public P2pOperatingChannelPolicyTest() {
        super();
    }
}