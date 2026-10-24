package com.andrerinas.openheadunit.aap;

/**
 * Prefer the associated station channel only on the initial native group attempt.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/NativeGroupFrequencyPolicy;", "", "()V", "preferredFrequency", "", "stationFrequency", "associated", "", "force24", "retryCount", "recreateCount", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class NativeGroupFrequencyPolicy {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.NativeGroupFrequencyPolicy INSTANCE = null;
    
    private NativeGroupFrequencyPolicy() {
        super();
    }
    
    public final int preferredFrequency(int stationFrequency, boolean associated, boolean force24, int retryCount, int recreateCount) {
        return 0;
    }
}