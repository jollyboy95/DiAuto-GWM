package com.andrerinas.openheadunit.decoder;

/**
 * How much room this device has for the video pipeline to spend.
 *
 * The pipeline's buffers were sized for a unit that has memory to spare, and the same numbers land
 * very differently on one that does not. A 1 GB MediaTek head unit was measured running a 12-20 MB
 * Java heap while the app asked for a 2 MB `KEY_MAX_INPUT_SIZE`, which the component answered with
 * eight buffers of that size - 16 MB of graphics memory for input alone - and while the collector
 * ran every 5-10 seconds freeing 84-208 large arrays a cycle, once pausing for 1.4 s. The decoder
 * itself was keeping up throughout (`dropped=0`), so what hurt was the size of the machinery rather
 * than its speed.
 *
 * The classification is deliberately coarse and total-RAM-first. The allocations that matter most
 * are the codec's own input and output buffers, which come from graphics memory rather than the Java
 * heap, so the heap limit alone would miss them; and `isLowRamDevice` cannot be relied on because
 * these units set it as often as they do not.
 *
 * Only [classify] holds the rule, so it can be tested without a device.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/DeviceMemoryProfile;", "", "(Ljava/lang/String;I)V", "CONSTRAINED", "NORMAL", "AMPLE", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public enum DeviceMemoryProfile {
    /*public static final*/ CONSTRAINED /* = new CONSTRAINED() */,
    /*public static final*/ NORMAL /* = new NORMAL() */,
    /*public static final*/ AMPLE /* = new AMPLE() */;
    
    /**
     * At or below this much total RAM, treat the device as constrained.
     */
    public static final long CONSTRAINED_TOTAL_RAM_MB = 1536L;
    
    /**
     * At or below this heap ceiling, treat the device as constrained whatever its total RAM.
     */
    public static final long CONSTRAINED_HEAP_LIMIT_MB = 96L;
    
    /**
     * Both of these are needed before extra buffering is considered free.
     */
    public static final long AMPLE_TOTAL_RAM_MB = 3584L;
    public static final long AMPLE_HEAP_LIMIT_MB = 192L;
    private static final long BYTES_PER_MB = 1048576L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.DeviceMemoryProfile.Companion Companion = null;
    
    DeviceMemoryProfile() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.decoder.DeviceMemoryProfile> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/DeviceMemoryProfile$Companion;", "", "()V", "AMPLE_HEAP_LIMIT_MB", "", "AMPLE_TOTAL_RAM_MB", "BYTES_PER_MB", "CONSTRAINED_HEAP_LIMIT_MB", "CONSTRAINED_TOTAL_RAM_MB", "activityManager", "Landroid/app/ActivityManager;", "context", "Landroid/content/Context;", "classify", "Lcom/andrerinas/openheadunit/decoder/DeviceMemoryProfile;", "totalRamMb", "heapLimitMb", "systemLowRamFlag", "", "fromName", "name", "", "read", "Lcom/andrerinas/openheadunit/decoder/DeviceMemoryReading;", "readTotalRamMb", "readWithOverride", "override", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Classifies a device from three numbers.
         *
         * [totalRamMb] is the whole device's physical memory, [heapLimitMb] the app's Java heap
         * ceiling, and [systemLowRamFlag] whatever `ActivityManager.isLowRamDevice()` reports. The
         * flag can only push the verdict down, never up: a unit that admits to being low-RAM is
         * believed, one that does not is still judged on its numbers.
         *
         * A non-positive input is treated as unknown and ignored rather than as constrained, so a
         * platform that fails to report something does not silently shrink the pipeline.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.decoder.DeviceMemoryProfile classify(long totalRamMb, long heapLimitMb, boolean systemLowRamFlag) {
            return null;
        }
        
        /**
         * Reads the device's numbers and classifies them, keeping every input in the result so a bug
         * report carries what the verdict rested on and not only the verdict.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.decoder.DeviceMemoryReading read(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * [read], with [override] replacing the verdict when it is set.
         *
         * The override exists so the rig can run the constrained path without a 1 GB device. The
         * measured numbers are kept in the reading either way, and the reading says it was forced, so
         * a log from a forced run cannot be mistaken for a log from the hardware it imitates.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.decoder.DeviceMemoryReading readWithOverride(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.decoder.DeviceMemoryProfile override) {
            return null;
        }
        
        /**
         * Parses a stored profile name, tolerating anything unrecognised.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.decoder.DeviceMemoryProfile fromName(@org.jetbrains.annotations.Nullable()
        java.lang.String name) {
            return null;
        }
        
        private final android.app.ActivityManager activityManager(android.content.Context context) {
            return null;
        }
        
        private final long readTotalRamMb(android.content.Context context) {
            return 0L;
        }
    }
}