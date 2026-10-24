package com.andrerinas.openheadunit.gwm;

/**
 * Ported from jollyboy95/d-play-gwm-h7 @ 1460810 (GwmVehicleData.kt), GPL-3.0-or-later.
 *
 * Read-only vehicle values from the GWM head unit's `gwm_adapter` binder service
 * (com.gwm.android.adapter.IGwmAdapterService), the same source the H7 dashboard apps use.
 *
 * Transaction 1 takes the caller package and a list of signal keys and returns their values.
 * Nothing is written to the car. Values that stop arriving are reported as missing, not frozen.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\r\b\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001JB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/2\u0014\u00100\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020*0)J\u000e\u00101\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/J%\u00102\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u00010\u001a2\b\u00104\u001a\u0004\u0018\u00010\u001aH\u0000\u00a2\u0006\u0004\b5\u00106J\b\u00107\u001a\u00020\u001cH\u0002J\u001b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010\u0004H\u0000\u00a2\u0006\u0004\b;\u0010<J7\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040>2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0000\u00a2\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020*2\u0006\u0010.\u001a\u00020/H\u0002J/\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040>2\u0006\u0010.\u001a\u00020/2\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0002\u0010EJ\u001c\u0010F\u001a\u00020*2\u0014\u00100\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020*0)J)\u0010G\u001a\u00020#2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040>2\u0006\u0010H\u001a\u00020\u0012H\u0000\u00a2\u0006\u0002\bIR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\"\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u001f\u001a\u0004\u0018\u00010#@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\"\u0010\'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020*0)0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lcom/andrerinas/openheadunit/gwm/GwmVehicleData;", "", "()V", "CURRENT_GEAR", "", "DESCRIPTOR", "FUEL_PERCENT", "GEAR_STATUS", "KEYS", "", "getKEYS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "NUMBER", "Lkotlin/text/Regex;", "ODOMETER", "OUTSIDE_TEMP", "POLL_MILLIS", "", "RANGE_KM", "SERVICE", "SPEED", "STALE_MILLIS", "TAG", "TOTAL_ODOMETER", "TRANSACTION_GET_DATA", "", "binder", "Landroid/os/IBinder;", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "<set-?>", "lastError", "getLastError", "()Ljava/lang/String;", "Lcom/andrerinas/openheadunit/gwm/GwmVehicleData$Snapshot;", "latest", "getLatest", "()Lcom/andrerinas/openheadunit/gwm/GwmVehicleData$Snapshot;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lkotlin/Function1;", "", "task", "Ljava/util/concurrent/ScheduledFuture;", "addListener", "context", "Landroid/content/Context;", "listener", "describe", "gearLabel", "status", "step", "gearLabel$com_andrerinas_headunitrevived_0_3_12_githubDebug", "(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;", "lookup", "number", "", "raw", "number$com_andrerinas_headunitrevived_0_3_12_githubDebug", "(Ljava/lang/String;)Ljava/lang/Float;", "pair", "", "keys", "values", "pair$com_andrerinas_headunitrevived_0_3_12_githubDebug", "([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/Map;", "poll", "read", "(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/Map;", "removeListener", "snapshotFrom", "now", "snapshotFrom$com_andrerinas_headunitrevived_0_3_12_githubDebug", "Snapshot", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class GwmVehicleData {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "DiAutoGwmVehicle";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SERVICE = "gwm_adapter";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DESCRIPTOR = "com.gwm.android.adapter.IGwmAdapterService";
    private static final int TRANSACTION_GET_DATA = 1;
    private static final long POLL_MILLIS = 250L;
    
    /**
     * A value older than this is treated as unavailable so the cluster never shows a stale speed.
     */
    public static final long STALE_MILLIS = 2000L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SPEED = "car.basic.vehicle_speed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GEAR_STATUS = "car.basic.gear_status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CURRENT_GEAR = "car.basic.current_gear";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FUEL_PERCENT = "car.basic.remain_fuel_percentage";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RANGE_KM = "car.basic.remain_odometer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OUTSIDE_TEMP = "car.basic.outside_temp";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOTAL_ODOMETER = "car.basic.total_odometer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ODOMETER = "car.basic.odometer";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] KEYS = {"car.basic.vehicle_speed", "car.basic.gear_status", "car.basic.current_gear", "car.basic.remain_fuel_percentage", "car.basic.remain_odometer", "car.basic.outside_temp", "car.basic.total_odometer", "car.basic.odometer"};
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.andrerinas.openheadunit.gwm.GwmVehicleData.Snapshot latest;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile java.lang.String lastError;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.CopyOnWriteArraySet<kotlin.jvm.functions.Function1<com.andrerinas.openheadunit.gwm.GwmVehicleData.Snapshot, kotlin.Unit>> listeners = null;
    @org.jetbrains.annotations.Nullable()
    private static java.util.concurrent.ScheduledExecutorService executor;
    @org.jetbrains.annotations.Nullable()
    private static java.util.concurrent.ScheduledFuture<?> task;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile android.os.IBinder binder;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.text.Regex NUMBER = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.gwm.GwmVehicleData INSTANCE = null;
    
    private GwmVehicleData() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getKEYS() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.gwm.GwmVehicleData.Snapshot getLatest() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastError() {
        return null;
    }
    
    /**
     * Starts polling while at least one listener is registered. Listeners run on the poll thread.
     */
    @kotlin.jvm.Synchronized()
    public final synchronized void addListener(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.gwm.GwmVehicleData.Snapshot, kotlin.Unit> listener) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void removeListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.gwm.GwmVehicleData.Snapshot, kotlin.Unit> listener) {
    }
    
    private final void poll(android.content.Context context) {
    }
    
    /**
     * One read of every key; used by the settings scan as well as the poller.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> read(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String[] keys) {
        return null;
    }
    
    private final android.os.IBinder lookup() {
        return null;
    }
    
    /**
     * The reply lists values in key order; some firmware answers "key=value" instead.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> pair$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.NotNull()
    java.lang.String[] keys, @org.jetbrains.annotations.NotNull()
    java.lang.String[] values) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float number$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.Nullable()
    java.lang.String raw) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.gwm.GwmVehicleData.Snapshot snapshotFrom$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> values, long now) {
        return null;
    }
    
    /**
     * gear_status 0 N, 2 D, 3 P, 4 R, 5 M; in D or M, current_gear 1..8 adds the step (D3, M3).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String gearLabel$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.Nullable()
    java.lang.Integer status, @org.jetbrains.annotations.Nullable()
    java.lang.Integer step) {
        return null;
    }
    
    /**
     * Human-readable dump for the GWM settings scan.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String describe(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J`\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0010\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\nJ\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0017\u0010\u0010\u00a8\u0006)"}, d2 = {"Lcom/andrerinas/openheadunit/gwm/GwmVehicleData$Snapshot;", "", "speedKph", "", "gear", "", "fuelPercent", "rangeKm", "outsideTempC", "atMillis", "", "odometerKm", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;JLjava/lang/Float;)V", "getAtMillis", "()J", "getFuelPercent", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getGear", "()Ljava/lang/String;", "getOdometerKm", "getOutsideTempC", "getRangeKm", "getSpeedKph", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;JLjava/lang/Float;)Lcom/andrerinas/openheadunit/gwm/GwmVehicleData$Snapshot;", "equals", "", "other", "fresh", "now", "hashCode", "", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Snapshot {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Float speedKph = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String gear = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Float fuelPercent = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Float rangeKm = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Float outsideTempC = null;
        private final long atMillis = 0L;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Float odometerKm = null;
        
        public Snapshot(@org.jetbrains.annotations.Nullable()
        java.lang.Float speedKph, @org.jetbrains.annotations.Nullable()
        java.lang.String gear, @org.jetbrains.annotations.Nullable()
        java.lang.Float fuelPercent, @org.jetbrains.annotations.Nullable()
        java.lang.Float rangeKm, @org.jetbrains.annotations.Nullable()
        java.lang.Float outsideTempC, long atMillis, @org.jetbrains.annotations.Nullable()
        java.lang.Float odometerKm) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Float getSpeedKph() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGear() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Float getFuelPercent() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Float getRangeKm() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Float getOutsideTempC() {
            return null;
        }
        
        public final long getAtMillis() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Float getOdometerKm() {
            return null;
        }
        
        public final boolean fresh(long now) {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Float component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Float component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Float component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Float component5() {
            return null;
        }
        
        public final long component6() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Float component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.gwm.GwmVehicleData.Snapshot copy(@org.jetbrains.annotations.Nullable()
        java.lang.Float speedKph, @org.jetbrains.annotations.Nullable()
        java.lang.String gear, @org.jetbrains.annotations.Nullable()
        java.lang.Float fuelPercent, @org.jetbrains.annotations.Nullable()
        java.lang.Float rangeKm, @org.jetbrains.annotations.Nullable()
        java.lang.Float outsideTempC, long atMillis, @org.jetbrains.annotations.Nullable()
        java.lang.Float odometerKm) {
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