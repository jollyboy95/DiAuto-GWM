package com.andrerinas.openheadunit.gwm;

/**
 * Whether the GWM/Haval path applies. Detection reads the build identity (ported from DiPlay's
 * GwmMode); the driver can turn it on by hand when a firmware build does not name GWM, Haval or B11.
 * Everything GWM-specific checks this first, so a BYD head unit never takes the GWM path.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/gwm/GwmMode;", "", "()V", "supported", "", "getSupported", "()Z", "active", "context", "Landroid/content/Context;", "clusterRoute", "detected", "wantsGuidance", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class GwmMode {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.gwm.GwmMode INSTANCE = null;
    
    private GwmMode() {
        super();
    }
    
    public final boolean detected() {
        return false;
    }
    
    public final boolean active(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean getSupported() {
        return false;
    }
    
    /**
     * The Android Auto cluster map goes to the GWM cluster display this session.
     */
    public final boolean clusterRoute(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Any GWM output that draws turn guidance from Android Auto's navigation metadata.
     */
    public final boolean wantsGuidance(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}