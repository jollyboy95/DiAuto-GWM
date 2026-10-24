package com.andrerinas.openheadunit.hud;

/**
 * Wire shape emitted by BYD HUD's DirectTbtPayload; field order matters to the HUD firmware.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J6\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u001c\u0010\u0017\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0018H\u0002J\f\u0010\u0019\u001a\u00020\u0007*\u00020\u0007H\u0002J\u0014\u0010\u001a\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydHudPayload;", "", "()V", "MAX_TEXT_BYTES", "", "MIN_DISTANCE_METERS", "clear", "", "displayDistance", "meters", "guidance", "distanceMeters", "maneuver", "icon", "road", "", "eta", "text", "value", "bytes", "", "Ljava/io/ByteArrayOutputStream;", "number", "field", "", "wrap", "writeVarint", "initialValue", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BydHudPayload {
    private static final int MIN_DISTANCE_METERS = 11;
    private static final int MAX_TEXT_BYTES = 200;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.BydHudPayload INSTANCE = null;
    
    private BydHudPayload() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] guidance(int distanceMeters, int maneuver, @org.jetbrains.annotations.Nullable()
    byte[] icon, @org.jetbrains.annotations.NotNull()
    java.lang.String road, @org.jetbrains.annotations.NotNull()
    java.lang.String eta) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] clear() {
        return null;
    }
    
    private final int displayDistance(int meters) {
        return 0;
    }
    
    private final byte[] text(java.lang.String value) {
        return null;
    }
    
    private final void field(java.io.ByteArrayOutputStream $this$field, int number, long value) {
    }
    
    private final void bytes(java.io.ByteArrayOutputStream $this$bytes, int number, byte[] value) {
    }
    
    private final byte[] wrap(byte[] $this$wrap) {
        return null;
    }
    
    private final void writeVarint(java.io.ByteArrayOutputStream $this$writeVarint, long initialValue) {
    }
}