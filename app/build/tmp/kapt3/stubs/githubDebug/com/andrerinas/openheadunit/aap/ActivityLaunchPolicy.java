package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\n"}, d2 = {"Lcom/andrerinas/openheadunit/aap/ActivityLaunchPolicy;", "", "()V", "chooseLaunchStrategy", "Lcom/andrerinas/openheadunit/aap/ActivityLaunchPolicy$LaunchStrategy;", "apiLevel", "", "canDrawOverlays", "", "LaunchStrategy", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ActivityLaunchPolicy {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.ActivityLaunchPolicy INSTANCE = null;
    
    private ActivityLaunchPolicy() {
        super();
    }
    
    /**
     * Chooses the safest activity-start strategy for the given API level.
     *
     * On Android 10+ (API 29+), direct startActivity() from a background Service is
     * silently blocked by the OS. The overlay trampoline bypasses this if the
     * SYSTEM_ALERT_WINDOW permission is granted; otherwise a full-screen notification
     * is used as fallback.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.ActivityLaunchPolicy.LaunchStrategy chooseLaunchStrategy(int apiLevel, boolean canDrawOverlays) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/aap/ActivityLaunchPolicy$LaunchStrategy;", "", "(Ljava/lang/String;I)V", "DIRECT", "OVERLAY", "NOTIFICATION", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum LaunchStrategy {
        /*public static final*/ DIRECT /* = new DIRECT() */,
        /*public static final*/ OVERLAY /* = new OVERLAY() */,
        /*public static final*/ NOTIFICATION /* = new NOTIFICATION() */;
        
        LaunchStrategy() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.ActivityLaunchPolicy.LaunchStrategy> getEntries() {
            return null;
        }
    }
}