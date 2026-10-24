package com.andrerinas.openheadunit.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 42\u00020\u0001:\u00014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0013H\u0002J\u0006\u0010%\u001a\u00020#J\u0006\u0010&\u001a\u00020\u000bJ\u0006\u0010\'\u001a\u00020\rJ\u001a\u0010(\u001a\u00020#2\b\u0010)\u001a\u0004\u0018\u00010\u001a2\u0006\u0010*\u001a\u00020\u000bH\u0016J\u0010\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u000bH\u0002J\b\u0010/\u001a\u00020#H\u0002J\u0006\u00100\u001a\u00020#J\u0006\u00101\u001a\u00020#J\u0012\u00102\u001a\u00020#2\b\b\u0002\u00103\u001a\u00020\u0013H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/andrerinas/openheadunit/utils/AppThemeManager;", "Landroid/hardware/SensorEventListener;", "context", "Landroid/content/Context;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "(Landroid/content/Context;Lcom/andrerinas/openheadunit/utils/Settings;)V", "brightnessObserver", "Landroid/database/ContentObserver;", "carSignalObserver", "currentBrightness", "", "currentLux", "", "debounceRunnable", "Ljava/lang/Runnable;", "handler", "Landroid/os/Handler;", "isCarSignalObserverRegistered", "", "isFirstSensorReading", "isObserverRegistered", "isSensorRegistered", "lastEmittedNight", "Ljava/lang/Boolean;", "lightSensor", "Landroid/hardware/Sensor;", "nightModeCalculator", "Lcom/andrerinas/openheadunit/utils/NightMode;", "pendingValue", "receiver", "Landroid/content/BroadcastReceiver;", "sensorManager", "Landroid/hardware/SensorManager;", "applyNightMode", "", "isNight", "forceRefresh", "getCurrentBrightness", "getCurrentLux", "onAccuracyChanged", "sensor", "accuracy", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "readBrightness", "refreshListeners", "start", "stop", "update", "debounce", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AppThemeManager implements android.hardware.SensorEventListener {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    @org.jetbrains.annotations.NotNull()
    private final android.hardware.SensorManager sensorManager = null;
    @org.jetbrains.annotations.Nullable()
    private final android.hardware.Sensor lightSensor = null;
    @org.jetbrains.annotations.NotNull()
    private com.andrerinas.openheadunit.utils.NightMode nightModeCalculator;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean lastEmittedNight;
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
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<java.lang.Integer> themeVersion = null;
    private static int versionCounter = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.AppThemeManager.Companion Companion = null;
    
    public AppThemeManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings) {
        super();
    }
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    private final void refreshListeners() {
    }
    
    /**
     * Re-evaluates the theme on the EXISTING manager. Unlike [reapply] it does not build
     * a new manager, so it only recreates activities when the day/night value actually
     * changes (avoiding a recreate loop when called repeatedly).
     */
    public final void forceRefresh() {
    }
    
    private final void update(boolean debounce) {
    }
    
    private final void applyNightMode(boolean isNight) {
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
    
    public final float getCurrentLux() {
        return 0.0F;
    }
    
    public final int getCurrentBrightness() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u0014\u001a\u00020\nH\u0002J\u0006\u0010\u0015\u001a\u00020\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/andrerinas/openheadunit/utils/AppThemeManager$Companion;", "", "()V", "themeVersion", "Landroidx/lifecycle/MutableLiveData;", "", "getThemeVersion", "()Landroidx/lifecycle/MutableLiveData;", "versionCounter", "applyStaticTheme", "", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "isStaticMode", "", "theme", "Lcom/andrerinas/openheadunit/utils/Settings$AppTheme;", "reapply", "context", "Landroid/content/Context;", "signalThemeChange", "signalVisualChange", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getThemeVersion() {
            return null;
        }
        
        private final void signalThemeChange() {
        }
        
        public final void signalVisualChange() {
        }
        
        public final void applyStaticTheme(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.utils.Settings settings) {
        }
        
        public final boolean isStaticMode(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.utils.Settings.AppTheme theme) {
            return false;
        }
        
        /**
         * (Re)applies the app theme engine: runs the live manager for dynamic themes
         * (including Location by area), otherwise applies the static theme directly.
         * Call after any change to the app theme, the sunrise source, or the places.
         */
        public final void reapply(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.utils.Settings settings) {
        }
    }
}