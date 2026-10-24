package com.andrerinas.openheadunit.hud;

/**
 * Navigation records traced from the installed IVI HAL; no arbitrary feature input.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J,\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\f\u0010\u0012\u001a\u00020\u0006*\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydStandalonePackets;", "", "()V", "MAX_DISTANCE_METERS", "", "clear", "", "guidance", "icon", "exit", "distanceMeters", "road", "record", "", "feature", "value", "start", "streetName", "toHex", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BydStandalonePackets {
    public static final int MAX_DISTANCE_METERS = 16777214;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.BydStandalonePackets INSTANCE = null;
    
    private BydStandalonePackets() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String start() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String clear() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String guidance(int icon, int exit, int distanceMeters, @org.jetbrains.annotations.Nullable()
    java.lang.String road) {
        return null;
    }
    
    /**
     * Exact non-RCS encodeReqSplitString format from the inspected IVI HAL.
     * The HAL caps this feature at 96 bytes. Each record carries seven content bytes,
     * a sequence byte, and the original feature incremented by 0x1000.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String streetName(@org.jetbrains.annotations.NotNull()
    java.lang.String road) {
        return null;
    }
    
    private final java.lang.String toHex(byte[] $this$toHex) {
        return null;
    }
    
    private final byte[] record(int feature, int value) {
        return null;
    }
}