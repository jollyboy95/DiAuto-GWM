package com.andrerinas.openheadunit.gwm;

/**
 * GWM/Haval preferences, kept in their own file so nothing here can change BYD behaviour.
 * Ported from DiPlay's GWM keys (jollyboy95/d-play-gwm-h7 @ 1460810, AirPlayPersistence).
 *
 * The cluster map itself is still declared to the phone through DiAuto's own
 * [com.andrerinas.openheadunit.utils.Settings.clusterMapEnabled]; [clusterEnabled] only routes it
 * to the GWM display instead of a BYD one.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR$\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R$\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R$\u0010!\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010&\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\'\u0010\u000f\"\u0004\b(\u0010\u0011R$\u0010)\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b*\u0010\u000f\"\u0004\b+\u0010\u0011\u00a8\u0006-"}, d2 = {"Lcom/andrerinas/openheadunit/gwm/GwmSettings;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "", "clusterDisplayId", "getClusterDisplayId", "()I", "setClusterDisplayId", "(I)V", "", "clusterEnabled", "getClusterEnabled", "()Z", "setClusterEnabled", "(Z)V", "forced", "getForced", "setForced", "hudAnchor", "getHudAnchor", "setHudAnchor", "hudDisplayId", "getHudDisplayId", "setHudDisplayId", "hudEnabled", "getHudEnabled", "setHudEnabled", "musicCard", "getMusicCard", "setMusicCard", "navCard", "getNavCard", "setNavCard", "prefs", "Landroid/content/SharedPreferences;", "styledLayer", "getStyledLayer", "setStyledLayer", "vehicleStrip", "getVehicleStrip", "setVehicleStrip", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class GwmSettings {
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences prefs = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFS = "gwm_h7";
    public static final int DEFAULT_CLUSTER_DISPLAY_ID = 2;
    public static final int DEFAULT_HUD_DISPLAY_ID = 3;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.gwm.GwmSettings.Companion Companion = null;
    
    public GwmSettings(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final boolean getForced() {
        return false;
    }
    
    public final void setForced(boolean value) {
    }
    
    public final boolean getClusterEnabled() {
        return false;
    }
    
    public final void setClusterEnabled(boolean value) {
    }
    
    public final int getClusterDisplayId() {
        return 0;
    }
    
    public final void setClusterDisplayId(int value) {
    }
    
    public final boolean getStyledLayer() {
        return false;
    }
    
    public final void setStyledLayer(boolean value) {
    }
    
    public final boolean getNavCard() {
        return false;
    }
    
    public final void setNavCard(boolean value) {
    }
    
    public final boolean getMusicCard() {
        return false;
    }
    
    public final void setMusicCard(boolean value) {
    }
    
    public final boolean getVehicleStrip() {
        return false;
    }
    
    public final void setVehicleStrip(boolean value) {
    }
    
    public final boolean getHudEnabled() {
        return false;
    }
    
    public final void setHudEnabled(boolean value) {
    }
    
    public final int getHudDisplayId() {
        return 0;
    }
    
    public final void setHudDisplayId(int value) {
    }
    
    public final int getHudAnchor() {
        return 0;
    }
    
    public final void setHudAnchor(int value) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/andrerinas/openheadunit/gwm/GwmSettings$Companion;", "", "()V", "DEFAULT_CLUSTER_DISPLAY_ID", "", "DEFAULT_HUD_DISPLAY_ID", "PREFS", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}