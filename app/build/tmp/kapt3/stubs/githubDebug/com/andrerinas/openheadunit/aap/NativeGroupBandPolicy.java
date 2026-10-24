package com.andrerinas.openheadunit.aap;

/**
 * Which band the Native AA P2P group is requested on, and whether a group that came up on the other
 * one should be torn down and remade.
 *
 * Native AA asks for 5 GHz because that is the band the reporters' working sessions run on, and a
 * group that lands on 2.4 GHz anyway is recreated rather than used. That default is not in question
 * here. What this exists for is the opposite case: two reporter threads describe a link that dies
 * for seconds at a time on a fixed cadence, on 2.4 GHz head units, and nothing on the rig could ever
 * be put on that band to look for it - `createQuietGroup` asks for 5 GHz and
 * `onGroupInfoAvailable` undoes any group that does not come up there, so the rig had two
 * independent reasons never to run the configuration the reports come from.
 *
 * The override is a debug lever, off by default, and it turns off *both* of those: asking for 2.4
 * GHz while leaving the mismatch retry armed would tear the group down as soon as it succeeded.
 * That coupling is the whole reason this is one object with a test rather than two booleans read in
 * two places.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J&\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/aap/NativeGroupBandPolicy;", "", "()V", "MAX_24GHZ_FREQUENCY_MHZ", "", "bandFor", "Lcom/andrerinas/openheadunit/aap/NativeGroupBandPolicy$Band;", "force24Ghz", "", "label", "", "band", "shouldRetryFor5Ghz", "requested", "frequencyMhz", "retriesSoFar", "maxRetries", "Band", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class NativeGroupBandPolicy {
    
    /**
     * Below this, a P2P group is on 2.4 GHz. The 5 GHz band starts at 5170 MHz.
     */
    private static final int MAX_24GHZ_FREQUENCY_MHZ = 4000;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.NativeGroupBandPolicy INSTANCE = null;
    
    private NativeGroupBandPolicy() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.NativeGroupBandPolicy.Band bandFor(boolean force24Ghz) {
        return null;
    }
    
    /**
     * True when the group that came up must be torn down and remade because it is not on the band
     * that was asked for.
     *
     * Only ever true when 5 GHz was requested: a group we deliberately put on 2.4 GHz is on the band
     * it was asked for, so there is nothing to correct, and retrying it would recreate the group
     * every time it succeeded.
     */
    public final boolean shouldRetryFor5Ghz(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.NativeGroupBandPolicy.Band requested, int frequencyMhz, int retriesSoFar, int maxRetries) {
        return false;
    }
    
    /**
     * The band label used in the log, so a capture says which band was asked for and which arrived.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String label(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.NativeGroupBandPolicy.Band band) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/aap/NativeGroupBandPolicy$Band;", "", "(Ljava/lang/String;I)V", "GHZ_2_4", "GHZ_5", "UNSPECIFIED", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Band {
        /*public static final*/ GHZ_2_4 /* = new GHZ_2_4() */,
        /*public static final*/ GHZ_5 /* = new GHZ_5() */,
        /*public static final*/ UNSPECIFIED /* = new UNSPECIFIED() */;
        
        Band() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.NativeGroupBandPolicy.Band> getEntries() {
            return null;
        }
    }
}