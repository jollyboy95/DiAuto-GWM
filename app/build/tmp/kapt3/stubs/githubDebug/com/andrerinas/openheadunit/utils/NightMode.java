package com.andrerinas.openheadunit.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u00020\u00058FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000bR\u0011\u0010\u001b\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/andrerinas/openheadunit/utils/NightMode;", "", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "hasGPSLocation", "", "(Lcom/andrerinas/openheadunit/utils/Settings;Z)V", "calculator", "Lcom/andrerinas/openheadunit/utils/NightModeCalculator;", "current", "getCurrent", "()Z", "setCurrent", "(Z)V", "currentBrightness", "", "getCurrentBrightness", "()I", "setCurrentBrightness", "(I)V", "currentLux", "", "getCurrentLux", "()F", "setCurrentLux", "(F)V", "getHasGPSLocation", "isSunriseSunsetNight", "getCalculationInfo", "", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class NightMode {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    private final boolean hasGPSLocation = false;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.NightModeCalculator calculator = null;
    private float currentLux = -1.0F;
    private int currentBrightness = -1;
    private boolean current = false;
    
    public NightMode(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings, boolean hasGPSLocation) {
        super();
    }
    
    public final boolean getHasGPSLocation() {
        return false;
    }
    
    public final float getCurrentLux() {
        return 0.0F;
    }
    
    public final void setCurrentLux(float p0) {
    }
    
    public final int getCurrentBrightness() {
        return 0;
    }
    
    public final void setCurrentBrightness(int p0) {
    }
    
    public final boolean isSunriseSunsetNight() {
        return false;
    }
    
    public final void setCurrent(boolean p0) {
    }
    
    public final boolean getCurrent() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCalculationInfo() {
        return null;
    }
}