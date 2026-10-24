package com.andrerinas.openheadunit.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ\u001a\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\'\u001a\u00020\u000fH\u0016J\u0010\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u000fH\u0002J\b\u0010,\u001a\u00020\tH\u0002J\u0006\u0010-\u001a\u00020\tJ\u0006\u0010.\u001a\u00020\tJ\u0006\u0010/\u001a\u00020\tJ\u0010\u00100\u001a\u00020\t2\b\b\u0002\u00101\u001a\u00020\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001bR\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/andrerinas/openheadunit/utils/NightModeManager;", "Landroid/hardware/SensorEventListener;", "context", "Landroid/content/Context;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "onUpdate", "Lkotlin/Function1;", "", "", "(Landroid/content/Context;Lcom/andrerinas/openheadunit/utils/Settings;Lkotlin/jvm/functions/Function1;)V", "brightnessObserver", "Landroid/database/ContentObserver;", "carSignalObserver", "currentBrightness", "", "currentLux", "", "debounceRunnable", "Ljava/lang/Runnable;", "handler", "Landroid/os/Handler;", "isCarSignalObserverRegistered", "isFirstSensorReading", "isObserverRegistered", "isSensorRegistered", "lastEmittedValue", "Ljava/lang/Boolean;", "lightSensor", "Landroid/hardware/Sensor;", "nightModeCalculator", "Lcom/andrerinas/openheadunit/utils/NightMode;", "pendingValue", "receiver", "Landroid/content/BroadcastReceiver;", "sensorManager", "Landroid/hardware/SensorManager;", "onAccuracyChanged", "sensor", "accuracy", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "readBrightness", "refreshListeners", "resendCurrentState", "start", "stop", "update", "debounce", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class NightModeManager implements android.hardware.SensorEventListener {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onUpdate = null;
    @org.jetbrains.annotations.NotNull()
    private final android.hardware.SensorManager sensorManager = null;
    @org.jetbrains.annotations.Nullable()
    private final android.hardware.Sensor lightSensor = null;
    @org.jetbrains.annotations.NotNull()
    private com.andrerinas.openheadunit.utils.NightMode nightModeCalculator;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean lastEmittedValue;
    private float currentLux = -1.0F;
    private int currentBrightness = -1;
    private boolean isFirstSensorReading = true;
    private boolean isSensorRegistered = false;
    private boolean isObserverRegistered = false;
    private boolean isCarSignalObserverRegistered = false;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean pendingValue;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable debounceRunnable = null;
    @org.jetbrains.annotations.NotNull()
    private final android.database.ContentObserver brightnessObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final android.database.ContentObserver carSignalObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.BroadcastReceiver receiver = null;
    
    public NightModeManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onUpdate) {
        super();
    }
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    public final void resendCurrentState() {
    }
    
    private final void refreshListeners() {
    }
    
    public final void update(boolean debounce) {
    }
    
    @java.lang.Override()
    public void onSensorChanged(@org.jetbrains.annotations.NotNull()
    android.hardware.SensorEvent event) {
    }
    
    @java.lang.Override()
    public void onAccuracyChanged(@org.jetbrains.annotations.Nullable()
    android.hardware.Sensor sensor, int accuracy) {
    }
    
    private final int readBrightness() {
        return 0;
    }
}