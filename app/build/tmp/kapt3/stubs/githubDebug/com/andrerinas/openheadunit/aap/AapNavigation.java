package com.andrerinas.openheadunit.aap;

/**
 * Handles navigation messages from the ID_NAV channel from any Android Auto-enabled app
 * (Google Maps, Yandex Maps, etc.). Shows notifications with turn-by-turn directions and current street.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapNavigation;", "", "context", "Landroid/content/Context;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "(Landroid/content/Context;Lcom/andrerinas/openheadunit/utils/Settings;)V", "debounceHandler", "Landroid/os/Handler;", "debouncedBroadcastEmitter", "Ljava/lang/Runnable;", "helper", "Lcom/andrerinas/openheadunit/aap/AapNavigationHelper;", "isBroadcastScheduled", "", "pendingNavEventType", "", "snapshot", "Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$NavigationSnapshot;", "clearAccumulatedData", "", "clearAccumulatedDataPreservingStatus", "status", "Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$TimedMessage;", "Lcom/andrerinas/openheadunit/aap/protocol/proto/NavigationStatus$NavigationClusterStatus;", "process", "message", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "scheduleDebouncedBroadcast", "navEventType", "updateClusterStatus", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapNavigation {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapNavigationHelper helper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapNavigationHelper.NavigationSnapshot snapshot = null;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler debounceHandler = null;
    private boolean isBroadcastScheduled = false;
    private int pendingNavEventType = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable debouncedBroadcastEmitter = null;
    private static final long BROADCAST_DEBOUNCE_MS = 1000L;
    private static final int NAV_EVENT_TYPE_TURN = 0;
    private static final int NAV_EVENT_TYPE_START = 1;
    private static final int NAV_EVENT_TYPE_STOP = 2;
    private static final int NAV_EVENT_TYPE_STATUS = 3;
    private static final int NAV_EVENT_TYPE_STATE = 4;
    private static final int NAV_EVENT_TYPE_CURRENT_POSITION = 5;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.AapNavigation.Companion Companion = null;
    
    public AapNavigation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings) {
        super();
    }
    
    public final boolean process(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapMessage message) {
        return false;
    }
    
    private final void clearAccumulatedData() {
    }
    
    private final void clearAccumulatedDataPreservingStatus(com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationClusterStatus> status) {
    }
    
    private final void updateClusterStatus(com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationClusterStatus status) {
    }
    
    private final void scheduleDebouncedBroadcast(int navEventType) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapNavigation$Companion;", "", "()V", "BROADCAST_DEBOUNCE_MS", "", "NAV_EVENT_TYPE_CURRENT_POSITION", "", "NAV_EVENT_TYPE_START", "NAV_EVENT_TYPE_STATE", "NAV_EVENT_TYPE_STATUS", "NAV_EVENT_TYPE_STOP", "NAV_EVENT_TYPE_TURN", "createNotificationChannel", "", "context", "Landroid/content/Context;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void createNotificationChannel(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}