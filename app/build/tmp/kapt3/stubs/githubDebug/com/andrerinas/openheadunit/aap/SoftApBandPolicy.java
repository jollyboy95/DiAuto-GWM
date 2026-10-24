package com.andrerinas.openheadunit.aap;

/**
 * Which band to bring the head unit's access point up on for wireless Android Auto, and in what
 * order to try.
 *
 * 5 GHz first is not a preference, it is what the link needs. On 2.4 GHz the handshake completes
 * and the projection then dies within seconds — a failure mode that reads as "Android Auto starts
 * and drops" and has cost several rounds of log-reading to recognise. The reference head unit
 * software running this route on the same class of hardware brings its AP up on channel 36, and
 * the AA protocol itself carries the phone's answer to the same question (`selected_wifi_channel
 * _type`, one of 2.4-only / 5-only / dual).
 *
 * 2.4 GHz is kept only as a fallback for radios with no 5 GHz support at all, where the choice is
 * between a shaky link and none.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0005\u00a8\u0006\u000e"}, d2 = {"Lcom/andrerinas/openheadunit/aap/SoftApBandPolicy;", "", "()V", "attemptOrder", "", "Lcom/andrerinas/openheadunit/aap/ApBand;", "prefer5Ghz", "", "describe", "", "band", "legacyApBand", "", "softApConfigurationBand", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class SoftApBandPolicy {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.SoftApBandPolicy INSTANCE = null;
    
    private SoftApBandPolicy() {
        super();
    }
    
    /**
     * The bands to try, best first. Trying is the only way to find out: an app cannot ask whether
     * the soft AP will accept 5 GHz — `is5GHzBandSupported()` describes the station side, and
     * vendors ship radios that answer yes there and still refuse to host an AP on it.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.andrerinas.openheadunit.aap.ApBand> attemptOrder(boolean prefer5Ghz) {
        return null;
    }
    
    /**
     * `SoftApConfiguration.BAND_2GHZ` / `BAND_5GHZ` (API 30+).
     */
    public final int softApConfigurationBand(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.ApBand band) {
        return 0;
    }
    
    /**
     * The hidden `WifiConfiguration.apBand` field's values, used below API 30.
     */
    public final int legacyApBand(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.ApBand band) {
        return 0;
    }
    
    /**
     * How the band reads in a log line users paste into bug reports.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String describe(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.ApBand band) {
        return null;
    }
}