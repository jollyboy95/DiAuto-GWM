package com.andrerinas.openheadunit.gwm;

/**
 * Shared text for the cluster card and the head-up strip.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/gwm/GwmFormat;", "", "()V", "arrival", "", "next", "Lcom/andrerinas/openheadunit/hud/BydGuidance;", "nowMillis", "", "distance", "context", "Landroid/content/Context;", "meters", "", "road", "tripParts", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class GwmFormat {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.gwm.GwmFormat INSTANCE = null;
    
    private GwmFormat() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String distance(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int meters) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String road(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.hud.BydGuidance next) {
        return null;
    }
    
    /**
     * Arrival time, as now plus the phone's reported time to arrival; null when not reported.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String arrival(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.hud.BydGuidance next, long nowMillis) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> tripParts(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.hud.BydGuidance next) {
        return null;
    }
}