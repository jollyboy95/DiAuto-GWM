package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 !2\u00020\u0001:\u0004!\"#$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0003J\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0002J\u0016\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fJ\'\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0002\u00a2\u0006\u0002\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapNavigationHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cancelNotification", "", "maneuverTypeToAction", "", "type", "Lcom/andrerinas/openheadunit/aap/protocol/proto/NavigationStatus$NavigationManeuver$NavigationType;", "maneuverTypeToLegacyNextEvent", "", "maneuverTypeToLegacyTurnSide", "(Lcom/andrerinas/openheadunit/aap/protocol/proto/NavigationStatus$NavigationManeuver$NavigationType;)Ljava/lang/Integer;", "nextEventToAction", "nextEvent", "Lcom/andrerinas/openheadunit/aap/protocol/proto/NavigationStatus$NextTurnDetail$NextEvent;", "nowElapsedRealtimeMs", "", "prepareFullNavigationMessage", "Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$FullNavigationMessage;", "snapshot", "Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$NavigationSnapshot;", "navEventType", "sendFullNavigationBroadcast", "showNotification", "distanceMeters", "action", "street", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "showNotificationForSnapshot", "(Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$NavigationSnapshot;Ljava/lang/Integer;)V", "Companion", "FullNavigationMessage", "NavigationSnapshot", "TimedMessage", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapNavigationHelper {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAV_CHANNEL_ID = "headunit_navigation";
    private static final int NAV_NOTIFICATION_ID = 2;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.AapNavigationHelper.Companion Companion = null;
    
    public AapNavigationHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final long nowElapsedRealtimeMs() {
        return 0L;
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    public final void sendFullNavigationBroadcast(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapNavigationHelper.NavigationSnapshot snapshot, int navEventType) {
    }
    
    public final void showNotificationForSnapshot(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapNavigationHelper.NavigationSnapshot snapshot, @org.jetbrains.annotations.Nullable()
    java.lang.Integer distanceMeters) {
    }
    
    public final void cancelNotification() {
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final com.andrerinas.openheadunit.aap.AapNavigationHelper.FullNavigationMessage prepareFullNavigationMessage(com.andrerinas.openheadunit.aap.AapNavigationHelper.NavigationSnapshot snapshot, int navEventType) {
        return null;
    }
    
    private final void showNotification(java.lang.Integer distanceMeters, java.lang.String action, java.lang.String street) {
    }
    
    private final java.lang.String nextEventToAction(com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NextTurnDetail.NextEvent nextEvent) {
        return null;
    }
    
    /**
     * Maps instrument-cluster [NavigationManeuver.NavigationType] to legacy broadcast
     * [NextTurnDetail.NextEvent] wire values expected by external consumers.
     */
    @java.lang.Deprecated()
    private final int maneuverTypeToLegacyNextEvent(com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationManeuver.NavigationType type) {
        return 0;
    }
    
    /**
     * Maps [NavigationManeuver.NavigationType] to legacy [NextTurnDetail.Side] (1=LEFT, 2=RIGHT).
     * Returns null when side is not meaningful → [NavigationUpdateIntent] uses UNSPECIFIED (3).
     */
    @java.lang.Deprecated()
    private final java.lang.Integer maneuverTypeToLegacyTurnSide(com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationManeuver.NavigationType type) {
        return null;
    }
    
    private final java.lang.String maneuverTypeToAction(com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationManeuver.NavigationType type) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$Companion;", "", "()V", "NAV_CHANNEL_ID", "", "NAV_NOTIFICATION_ID", "", "createNotificationChannel", "", "context", "Landroid/content/Context;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void createNotificationChannel(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010)\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0098\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0003H\u00d6\u0001J\t\u00109\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001e\u0010\u0015R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001f\u0010\u0015R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b#\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b$\u0010\u0015R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u0015\u00a8\u0006:"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$FullNavigationMessage;", "", "distanceMeters", "", "timeSeconds", "road", "", "nextEventType", "actionText", "turnSide", "turnNumber", "turnAngle", "nextManeuver", "totalDistanceMeters", "totalTimeSeconds", "", "estimatedArrival", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)V", "getActionText", "()Ljava/lang/String;", "getDistanceMeters", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEstimatedArrival", "getNextEventType$annotations", "()V", "getNextEventType", "()I", "getNextManeuver", "getRoad", "getTimeSeconds", "getTotalDistanceMeters", "getTotalTimeSeconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTurnAngle", "getTurnNumber", "getTurnSide$annotations", "getTurnSide", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$FullNavigationMessage;", "equals", "", "other", "hashCode", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class FullNavigationMessage {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer distanceMeters = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer timeSeconds = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String road = null;
        @java.lang.Deprecated()
        private final int nextEventType = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String actionText = null;
        @org.jetbrains.annotations.Nullable()
        @java.lang.Deprecated()
        private final java.lang.Integer turnSide = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer turnNumber = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer turnAngle = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer nextManeuver = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer totalDistanceMeters = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long totalTimeSeconds = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String estimatedArrival = null;
        
        public FullNavigationMessage(@org.jetbrains.annotations.Nullable()
        java.lang.Integer distanceMeters, @org.jetbrains.annotations.Nullable()
        java.lang.Integer timeSeconds, @org.jetbrains.annotations.NotNull()
        java.lang.String road, int nextEventType, @org.jetbrains.annotations.NotNull()
        java.lang.String actionText, @org.jetbrains.annotations.Nullable()
        java.lang.Integer turnSide, @org.jetbrains.annotations.Nullable()
        java.lang.Integer turnNumber, @org.jetbrains.annotations.Nullable()
        java.lang.Integer turnAngle, @org.jetbrains.annotations.Nullable()
        java.lang.Integer nextManeuver, @org.jetbrains.annotations.Nullable()
        java.lang.Integer totalDistanceMeters, @org.jetbrains.annotations.Nullable()
        java.lang.Long totalTimeSeconds, @org.jetbrains.annotations.Nullable()
        java.lang.String estimatedArrival) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getDistanceMeters() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTimeSeconds() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRoad() {
            return null;
        }
        
        @java.lang.Deprecated()
        public final int getNextEventType() {
            return 0;
        }
        
        @java.lang.Deprecated()
        public static void getNextEventType$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getActionText() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Deprecated()
        public final java.lang.Integer getTurnSide() {
            return null;
        }
        
        @java.lang.Deprecated()
        public static void getTurnSide$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTurnNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTurnAngle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getNextManeuver() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTotalDistanceMeters() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getTotalTimeSeconds() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEstimatedArrival() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        public final int component4() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.AapNavigationHelper.FullNavigationMessage copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer distanceMeters, @org.jetbrains.annotations.Nullable()
        java.lang.Integer timeSeconds, @org.jetbrains.annotations.NotNull()
        java.lang.String road, int nextEventType, @org.jetbrains.annotations.NotNull()
        java.lang.String actionText, @org.jetbrains.annotations.Nullable()
        java.lang.Integer turnSide, @org.jetbrains.annotations.Nullable()
        java.lang.Integer turnNumber, @org.jetbrains.annotations.Nullable()
        java.lang.Integer turnAngle, @org.jetbrains.annotations.Nullable()
        java.lang.Integer nextManeuver, @org.jetbrains.annotations.Nullable()
        java.lang.Integer totalDistanceMeters, @org.jetbrains.annotations.Nullable()
        java.lang.Long totalTimeSeconds, @org.jetbrains.annotations.Nullable()
        java.lang.String estimatedArrival) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003H\u00c6\u0003Ju\u0010\'\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\t\u0010-\u001a\u00020\u000eH\u00d6\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R,\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R,\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013\u00a8\u0006."}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$NavigationSnapshot;", "", "clusterStatus", "Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$TimedMessage;", "Lcom/andrerinas/openheadunit/aap/protocol/proto/NavigationStatus$NavigationClusterStatus;", "nextTurnDetail", "Lcom/andrerinas/openheadunit/aap/protocol/proto/NavigationStatus$NextTurnDetail;", "nextTurnDistance", "Lcom/andrerinas/openheadunit/aap/protocol/proto/NavigationStatus$NextTurnDistanceEvent;", "navigationState", "Lcom/andrerinas/openheadunit/aap/protocol/proto/NavigationStatus$NavigationState;", "currentPosition", "Lcom/andrerinas/openheadunit/aap/protocol/proto/NavigationStatus$NavigationCurrentPosition;", "currentStreet", "", "(Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$TimedMessage;Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$TimedMessage;Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$TimedMessage;Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$TimedMessage;Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$TimedMessage;Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$TimedMessage;)V", "getClusterStatus", "()Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$TimedMessage;", "setClusterStatus", "(Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$TimedMessage;)V", "getCurrentPosition", "setCurrentPosition", "getCurrentStreet", "setCurrentStreet", "getNavigationState", "setNavigationState", "getNextTurnDetail$annotations", "()V", "getNextTurnDetail", "setNextTurnDetail", "getNextTurnDistance$annotations", "getNextTurnDistance", "setNextTurnDistance", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class NavigationSnapshot {
        @org.jetbrains.annotations.Nullable()
        private com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationClusterStatus> clusterStatus;
        @org.jetbrains.annotations.Nullable()
        @java.lang.Deprecated()
        private com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NextTurnDetail> nextTurnDetail;
        @org.jetbrains.annotations.Nullable()
        @java.lang.Deprecated()
        private com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NextTurnDistanceEvent> nextTurnDistance;
        @org.jetbrains.annotations.Nullable()
        private com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationState> navigationState;
        @org.jetbrains.annotations.Nullable()
        private com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationCurrentPosition> currentPosition;
        @org.jetbrains.annotations.Nullable()
        private com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<java.lang.String> currentStreet;
        
        public NavigationSnapshot(@org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationClusterStatus> clusterStatus, @org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NextTurnDetail> nextTurnDetail, @org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NextTurnDistanceEvent> nextTurnDistance, @org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationState> navigationState, @org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationCurrentPosition> currentPosition, @org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<java.lang.String> currentStreet) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationClusterStatus> getClusterStatus() {
            return null;
        }
        
        public final void setClusterStatus(@org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationClusterStatus> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Deprecated()
        public final com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NextTurnDetail> getNextTurnDetail() {
            return null;
        }
        
        @java.lang.Deprecated()
        public static void getNextTurnDetail$annotations() {
        }
        
        @java.lang.Deprecated()
        public final void setNextTurnDetail(@org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NextTurnDetail> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Deprecated()
        public final com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NextTurnDistanceEvent> getNextTurnDistance() {
            return null;
        }
        
        @java.lang.Deprecated()
        public static void getNextTurnDistance$annotations() {
        }
        
        @java.lang.Deprecated()
        public final void setNextTurnDistance(@org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NextTurnDistanceEvent> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationState> getNavigationState() {
            return null;
        }
        
        public final void setNavigationState(@org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationState> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationCurrentPosition> getCurrentPosition() {
            return null;
        }
        
        public final void setCurrentPosition(@org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationCurrentPosition> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<java.lang.String> getCurrentStreet() {
            return null;
        }
        
        public final void setCurrentStreet(@org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<java.lang.String> p0) {
        }
        
        public NavigationSnapshot() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationClusterStatus> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NextTurnDetail> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NextTurnDistanceEvent> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationState> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationCurrentPosition> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<java.lang.String> component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.AapNavigationHelper.NavigationSnapshot copy(@org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationClusterStatus> clusterStatus, @org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NextTurnDetail> nextTurnDetail, @org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NextTurnDistanceEvent> nextTurnDistance, @org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationState> navigationState, @org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<com.andrerinas.openheadunit.aap.protocol.proto.NavigationStatus.NavigationCurrentPosition> currentPosition, @org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<java.lang.String> currentStreet) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$TimedMessage;", "T", "", "payload", "updatedAtElapsedRealtimeMs", "", "(Ljava/lang/Object;J)V", "getPayload", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getUpdatedAtElapsedRealtimeMs", "()J", "component1", "component2", "copy", "(Ljava/lang/Object;J)Lcom/andrerinas/openheadunit/aap/AapNavigationHelper$TimedMessage;", "equals", "", "other", "hashCode", "", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class TimedMessage<T extends java.lang.Object> {
        private final T payload = null;
        private final long updatedAtElapsedRealtimeMs = 0L;
        
        public TimedMessage(T payload, long updatedAtElapsedRealtimeMs) {
            super();
        }
        
        public final T getPayload() {
            return null;
        }
        
        public final long getUpdatedAtElapsedRealtimeMs() {
            return 0L;
        }
        
        public final T component1() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.AapNavigationHelper.TimedMessage<T> copy(T payload, long updatedAtElapsedRealtimeMs) {
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