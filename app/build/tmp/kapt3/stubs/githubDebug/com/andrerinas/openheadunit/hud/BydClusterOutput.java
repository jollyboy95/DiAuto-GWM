package com.andrerinas.openheadunit.hud;

/**
 * AutoNavi standard broadcast to the stock map service that feeds the cluster/HUD.
 * DiLink 5 ships it as com.byd.amapservice; DiLink 3.0 (Android 10) ships the same role as
 * com.example.amapservice. On a DiLink 3.0 unit the same extras sent to it (together with
 * com.byd.automap) drew the turn arrow and countdown on the HUD.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydClusterOutput;", "", "context", "Landroid/content/Context;", "targetPackage", "", "(Landroid/content/Context;Ljava/lang/String;)V", "showing", "", "roadName", "road", "segmentDistance", "", "meters", "update", "", "frame", "Lcom/andrerinas/openheadunit/hud/BydGuidance;", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BydClusterOutput {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String targetPackage = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DILINK3_PACKAGE = "com.example.amapservice";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> PACKAGES = null;
    
    /**
     * Shortest distance DiLink 3.0's HUD draws as a number (on a test unit 1 m and 5 m showed "现在", 10 m did not).
     */
    public static final int DILINK3_MIN_DISTANCE_METERS = 10;
    private boolean showing = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.BydClusterOutput.Companion Companion = null;
    
    public BydClusterOutput(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String targetPackage) {
        super();
    }
    
    /**
     * DiLink 3.0's com.example.amapservice renders a short distance (below 10 m) as a Chinese
     * "now" caption on the HUD, and it has no other locale. Report 10 m there instead; the arrow
     * and the countdown are unchanged. A negative (unknown) distance is passed through.
     */
    private final int segmentDistance(int meters) {
        return 0;
    }
    
    private final java.lang.String roadName(java.lang.String road) {
        return null;
    }
    
    public final void update(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.hud.BydGuidance frame) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydClusterOutput$Companion;", "", "()V", "DILINK3_MIN_DISTANCE_METERS", "", "DILINK3_PACKAGE", "", "PACKAGES", "", "getPACKAGES", "()Ljava/util/List;", "plainLetters", "text", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getPACKAGES() {
            return null;
        }
        
        /**
         * DiLink 3.0's HUD font has no accented letters: "Ferretería" was drawn as "Ferreter a".
         * Drop the diacritics (á→a, ñ→n, ü→u) so the street name stays readable.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String plainLetters(@org.jetbrains.annotations.NotNull()
        java.lang.String text) {
            return null;
        }
    }
}