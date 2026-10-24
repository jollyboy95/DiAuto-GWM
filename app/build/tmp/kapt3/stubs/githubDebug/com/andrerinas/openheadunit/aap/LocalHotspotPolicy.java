package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J4\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fJ\u0015\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/aap/LocalHotspotPolicy;", "", "()V", "eui64Mac", "", "bytes", "", "pick", "Lcom/andrerinas/openheadunit/aap/ApInterfaceCandidate;", "candidates", "", "previousAddresses", "", "upstreamInterfaces", "preferredFiveGhzChannel", "", "stationFrequency", "(Ljava/lang/Integer;)I", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class LocalHotspotPolicy {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.LocalHotspotPolicy INSTANCE = null;
    
    private LocalHotspotPolicy() {
        super();
    }
    
    public final int preferredFiveGhzChannel(@org.jetbrains.annotations.Nullable()
    java.lang.Integer stationFrequency) {
        return 0;
    }
    
    /**
     * Refuse ambiguous candidates rather than advertise a station/cellular address to the phone.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.aap.ApInterfaceCandidate pick(@org.jetbrains.annotations.NotNull()
    java.util.List<com.andrerinas.openheadunit.aap.ApInterfaceCandidate> candidates, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> previousAddresses, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> upstreamInterfaces) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String eui64Mac(@org.jetbrains.annotations.NotNull()
    byte[] bytes) {
        return null;
    }
}