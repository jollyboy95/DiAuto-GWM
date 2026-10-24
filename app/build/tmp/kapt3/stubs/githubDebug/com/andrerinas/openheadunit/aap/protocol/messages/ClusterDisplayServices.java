package com.andrerinas.openheadunit.aap.protocol.messages;

/**
 * The extra services that declare the BYD dashboard to the phone as a second display.
 *
 * Android Auto renders a navigation app's cluster map on a video sink whose display_type is
 * CLUSTER (Waze and Google Maps both support it), declared with an input service of its own.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/aap/protocol/messages/ClusterDisplayServices;", "", "()V", "VIEWING_DISTANCE_MM", "", "build", "", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Control$Service;", "context", "Landroid/content/Context;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "profile", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Profile;", "theme", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Theme;", "window", "Lcom/andrerinas/openheadunit/hud/ClusterMapConfig$Window;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ClusterDisplayServices {
    
    /**
     * Roughly the driver's distance to an instrument cluster.
     */
    private static final int VIEWING_DISTANCE_MM = 750;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.protocol.messages.ClusterDisplayServices INSTANCE = null;
    
    private ClusterDisplayServices() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Profile profile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings) {
        return null;
    }
    
    /**
     * The car's cluster theme: as the cluster itself reports it when DiAuto has Usage access (as
     * DiPlay follows it), otherwise the theme picked in Settings. A wrong guess puts the map on a
     * layer the cluster shows over everything, so the reported theme always wins.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Theme theme(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings) {
        return null;
    }
    
    /**
     * The map window of the car's cluster theme, on measured DiLink 5.1 firmware only.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.hud.ClusterMapConfig.Window window(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.andrerinas.openheadunit.aap.protocol.proto.Control.Service> build(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings) {
        return null;
    }
}