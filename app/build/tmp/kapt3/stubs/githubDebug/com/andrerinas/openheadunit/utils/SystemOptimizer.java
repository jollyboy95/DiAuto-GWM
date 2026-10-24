package com.andrerinas.openheadunit.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0003\f\r\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/utils/SystemOptimizer;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "calculateOptimalSettings", "Lcom/andrerinas/openheadunit/utils/SystemOptimizer$OptimizationResult;", "sizePreset", "Lcom/andrerinas/openheadunit/utils/SystemOptimizer$DisplaySizePreset;", "isPortraitTarget", "", "checkH265HardwareSupport", "Companion", "DisplaySizePreset", "OptimizationResult", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class SystemOptimizer {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    /**
     * Small upward nudge on the computed density so the Android Auto UI reads well at the car
     * viewing distance (the panel is farther from the eyes than a phone). Kept modest so the
     * result stays near the ~150-170 dpi range that works well on head units instead of the
     * larger, more cramped UI a raw physical-DPI value would give.
     */
    private static final float LEGIBILITY_FACTOR = 1.1F;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.SystemOptimizer.Companion Companion = null;
    
    public SystemOptimizer(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final boolean checkH265HardwareSupport() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.utils.SystemOptimizer.OptimizationResult calculateOptimalSettings(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.SystemOptimizer.DisplaySizePreset sizePreset, boolean isPortraitTarget) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/utils/SystemOptimizer$Companion;", "", "()V", "LEGIBILITY_FACTOR", "", "panelCeiling", "Lcom/andrerinas/openheadunit/utils/Settings$Resolution;", "realWidthPx", "", "realHeightPx", "canHevc", "", "recommendedResolution", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * The single source of truth for the largest resolution a physical panel warrants, shared
         * by the recommended resolution, the runtime resolution cap (HeadUnitScreenConfig) and the
         * DPI calculation, so all three always agree (issue #767). Bucketed by the panel's real
         * pixels, in landscape terms (long side x short side); 1440p/4K are gated behind hardware
         * HEVC on a recent enough Android, matching what the phone will actually stream. Mild
         * downscaling (e.g. 1080p onto a 1024x600 panel) is allowed on purpose; only genuinely
         * small panels are dropped to 720p/480p, which avoids the heavy per-frame downscale that
         * overloads the MediaTek MDP scaler (issue #650).
         */
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.utils.Settings.Resolution panelCeiling(int realWidthPx, int realHeightPx, boolean canHevc) {
            return null;
        }
        
        /**
         * The resolution the panel warrants. Thin wrapper over [panelCeiling] (the shared source of
         * truth) so the recommended label, the wizard and the runtime cap never diverge.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.utils.Settings.Resolution recommendedResolution(int realWidthPx, int realHeightPx) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/utils/SystemOptimizer$DisplaySizePreset;", "", "diagonalInch", "", "(Ljava/lang/String;IF)V", "getDiagonalInch", "()F", "PHONE_4_6", "SMALL_7_8", "STANDARD_9_10", "LARGE_11_PLUS", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum DisplaySizePreset {
        /*public static final*/ PHONE_4_6 /* = new PHONE_4_6(0.0F) */,
        /*public static final*/ SMALL_7_8 /* = new SMALL_7_8(0.0F) */,
        /*public static final*/ STANDARD_9_10 /* = new STANDARD_9_10(0.0F) */,
        /*public static final*/ LARGE_11_PLUS /* = new LARGE_11_PLUS(0.0F) */;
        private final float diagonalInch = 0.0F;
        
        DisplaySizePreset(float diagonalInch) {
        }
        
        public final float getDiagonalInch() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.utils.SystemOptimizer.DisplaySizePreset> getEntries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\fH\u00c6\u0003J\t\u0010 \u001a\u00020\nH\u00c6\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\t\u0010%\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Lcom/andrerinas/openheadunit/utils/SystemOptimizer$OptimizationResult;", "", "recommendedResolutionId", "", "recommendedDpi", "recommendedVideoCodec", "", "recommendedViewMode", "Lcom/andrerinas/openheadunit/utils/Settings$ViewMode;", "isWidescreen", "", "suggestedOrientation", "Lcom/andrerinas/openheadunit/utils/Settings$ScreenOrientation;", "h265Support", "(IILjava/lang/String;Lcom/andrerinas/openheadunit/utils/Settings$ViewMode;ZLcom/andrerinas/openheadunit/utils/Settings$ScreenOrientation;Z)V", "getH265Support", "()Z", "getRecommendedDpi", "()I", "getRecommendedResolutionId", "getRecommendedVideoCodec", "()Ljava/lang/String;", "getRecommendedViewMode", "()Lcom/andrerinas/openheadunit/utils/Settings$ViewMode;", "getSuggestedOrientation", "()Lcom/andrerinas/openheadunit/utils/Settings$ScreenOrientation;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class OptimizationResult {
        private final int recommendedResolutionId = 0;
        private final int recommendedDpi = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String recommendedVideoCodec = null;
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.utils.Settings.ViewMode recommendedViewMode = null;
        private final boolean isWidescreen = false;
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.utils.Settings.ScreenOrientation suggestedOrientation = null;
        private final boolean h265Support = false;
        
        public OptimizationResult(int recommendedResolutionId, int recommendedDpi, @org.jetbrains.annotations.NotNull()
        java.lang.String recommendedVideoCodec, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.utils.Settings.ViewMode recommendedViewMode, boolean isWidescreen, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.utils.Settings.ScreenOrientation suggestedOrientation, boolean h265Support) {
            super();
        }
        
        public final int getRecommendedResolutionId() {
            return 0;
        }
        
        public final int getRecommendedDpi() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRecommendedVideoCodec() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.utils.Settings.ViewMode getRecommendedViewMode() {
            return null;
        }
        
        public final boolean isWidescreen() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.utils.Settings.ScreenOrientation getSuggestedOrientation() {
            return null;
        }
        
        public final boolean getH265Support() {
            return false;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.utils.Settings.ViewMode component4() {
            return null;
        }
        
        public final boolean component5() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.utils.Settings.ScreenOrientation component6() {
            return null;
        }
        
        public final boolean component7() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.utils.SystemOptimizer.OptimizationResult copy(int recommendedResolutionId, int recommendedDpi, @org.jetbrains.annotations.NotNull()
        java.lang.String recommendedVideoCodec, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.utils.Settings.ViewMode recommendedViewMode, boolean isWidescreen, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.utils.Settings.ScreenOrientation suggestedOrientation, boolean h265Support) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}