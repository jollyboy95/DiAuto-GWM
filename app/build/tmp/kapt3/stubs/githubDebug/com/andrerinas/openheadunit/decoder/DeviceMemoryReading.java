package com.andrerinas.openheadunit.decoder;

/**
 * A [DeviceMemoryProfile] plus the numbers behind it, for logging.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\b\u0010 \u001a\u00020!H\u0016R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006\""}, d2 = {"Lcom/andrerinas/openheadunit/decoder/DeviceMemoryReading;", "", "profile", "Lcom/andrerinas/openheadunit/decoder/DeviceMemoryProfile;", "totalRamMb", "", "heapLimitMb", "memoryClassMb", "systemLowRamFlag", "", "forced", "(Lcom/andrerinas/openheadunit/decoder/DeviceMemoryProfile;JJJZZ)V", "getForced", "()Z", "getHeapLimitMb", "()J", "getMemoryClassMb", "getProfile", "()Lcom/andrerinas/openheadunit/decoder/DeviceMemoryProfile;", "getSystemLowRamFlag", "getTotalRamMb", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class DeviceMemoryReading {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.decoder.DeviceMemoryProfile profile = null;
    private final long totalRamMb = 0L;
    private final long heapLimitMb = 0L;
    private final long memoryClassMb = 0L;
    private final boolean systemLowRamFlag = false;
    
    /**
     * True when [profile] was overridden for testing rather than measured.
     */
    private final boolean forced = false;
    
    public DeviceMemoryReading(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.decoder.DeviceMemoryProfile profile, long totalRamMb, long heapLimitMb, long memoryClassMb, boolean systemLowRamFlag, boolean forced) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.decoder.DeviceMemoryProfile getProfile() {
        return null;
    }
    
    public final long getTotalRamMb() {
        return 0L;
    }
    
    public final long getHeapLimitMb() {
        return 0L;
    }
    
    public final long getMemoryClassMb() {
        return 0L;
    }
    
    public final boolean getSystemLowRamFlag() {
        return false;
    }
    
    /**
     * True when [profile] was overridden for testing rather than measured.
     */
    public final boolean getForced() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.decoder.DeviceMemoryProfile component1() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.decoder.DeviceMemoryReading copy(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.decoder.DeviceMemoryProfile profile, long totalRamMb, long heapLimitMb, long memoryClassMb, boolean systemLowRamFlag, boolean forced) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
}