package com.andrerinas.openheadunit.hud;

/**
 * Read-only inventory of the BYD vehicle interfaces present on this head unit, for the diagnostic
 * report. It looks things up and lists them; it never calls a setter, sends a broadcast, binds a
 * service or writes any vehicle value. Every step is isolated so one missing piece cannot hide
 * the rest.
 *
 * Its purpose is to tell, from one report, which navigation/cluster/HUD paths a given firmware
 * could support - in particular on units (such as DiLink 3.0) where none of the validated outputs
 * is available and the setting is therefore hidden.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002J2\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\u001fH\u0002J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydVehicleProbe;", "", "()V", "FEATURE_IDS", "", "INSTRUMENT_DEVICE", "SDK_PREFIX", "featureHints", "Lkotlin/text/Regex;", "packageHints", "", "appliesTo", "", "bydPermissions", "context", "Landroid/content/Context;", "constantsOf", "cls", "Ljava/lang/Class;", "instrumentDevice", "instrumentFeatureIds", "otherFeatureIds", "relatedPackages", "report", "sdkClasses", "section", "", "out", "", "title", "block", "Lkotlin/Function0;", "systemPackages", "Landroid/content/pm/PackageInfo;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BydVehicleProbe {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SDK_PREFIX = "android.hardware.bydauto";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String INSTRUMENT_DEVICE = "android.hardware.bydauto.instrument.BYDAutoInstrumentDevice";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String FEATURE_IDS = "android.hardware.bydauto.BYDAutoFeatureIds";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> packageHints = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.text.Regex featureHints = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.BydVehicleProbe INSTANCE = null;
    
    private BydVehicleProbe() {
        super();
    }
    
    public final boolean appliesTo() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> report(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final void section(java.util.List<java.lang.String> out, java.lang.String title, kotlin.jvm.functions.Function0<? extends java.util.List<java.lang.String>> block) {
    }
    
    private final java.util.List<android.content.pm.PackageInfo> systemPackages(android.content.Context context) {
        return null;
    }
    
    private final java.util.List<java.lang.String> relatedPackages(android.content.Context context) {
        return null;
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final java.util.List<java.lang.String> bydPermissions(android.content.Context context) {
        return null;
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final java.util.List<java.lang.String> sdkClasses() {
        return null;
    }
    
    private final java.util.List<java.lang.String> instrumentDevice(android.content.Context context) {
        return null;
    }
    
    private final java.util.List<java.lang.String> instrumentFeatureIds() {
        return null;
    }
    
    private final java.util.List<java.lang.String> otherFeatureIds() {
        return null;
    }
    
    private final java.util.List<java.lang.String> constantsOf(java.lang.Class<?> cls) {
        return null;
    }
}