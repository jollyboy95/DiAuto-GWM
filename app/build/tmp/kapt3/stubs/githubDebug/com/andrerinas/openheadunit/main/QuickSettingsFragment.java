package com.andrerinas.openheadunit.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002\u00a2\u0006\u0002\u0010\u0018J0\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u0004H\u0002J\u0012\u0010\u001e\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J$\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010&\u001a\u00020\u0012H\u0016J\u001a\u0010\'\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010(\u001a\u00020\u0012H\u0002J\b\u0010)\u001a\u00020\u0012H\u0002J\b\u0010*\u001a\u00020\u0012H\u0002J\b\u0010+\u001a\u00020\u0012H\u0002J\b\u0010,\u001a\u00020\u0012H\u0002J\b\u0010-\u001a\u00020\u0012H\u0002J\b\u0010.\u001a\u00020\u0012H\u0002J\b\u0010/\u001a\u00020\u0012H\u0002J\b\u00100\u001a\u00020\u0012H\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/andrerinas/openheadunit/main/QuickSettingsFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "originalScale", "", "Ljava/lang/Boolean;", "originalStretch", "originalViewMode", "Lcom/andrerinas/openheadunit/utils/Settings$ViewMode;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "settingsAdapter", "Lcom/andrerinas/openheadunit/main/settings/SettingsAdapter;", "settingsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "toolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "applyHudMirroring", "", "view", "Landroid/view/View;", "fullscreenModeLabels", "", "", "()[Ljava/lang/String;", "notifyChange", "needsViewRecreate", "needsAudioRestart", "sensorRefresh", "applyFullscreen", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onViewCreated", "showAudioLatencyDialog", "showAudioOffsetsDialog", "showAudioQueueCapacityDialog", "showFullscreenDialog", "showNightModeDialog", "showOrientationDialog", "showViewModeDialog", "triggerLogExport", "updateSettingsList", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class QuickSettingsFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_SETTINGS_CHANGED = "com.andrerinas.openheadunit.SETTINGS_CHANGED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_NEEDS_VIEW_RECREATE = "needs_view_recreate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_NEEDS_AUDIO_RESTART = "needs_audio_restart";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SENSOR_REFRESH = "sensor_refresh";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_APPLY_FULLSCREEN = "apply_fullscreen";
    private com.andrerinas.openheadunit.utils.Settings settings;
    private androidx.recyclerview.widget.RecyclerView settingsRecyclerView;
    private com.andrerinas.openheadunit.main.settings.SettingsAdapter settingsAdapter;
    private com.google.android.material.appbar.MaterialToolbar toolbar;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.utils.Settings.ViewMode originalViewMode;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean originalStretch;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean originalScale;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.main.QuickSettingsFragment.Companion Companion = null;
    
    public QuickSettingsFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void applyHudMirroring(android.view.View view) {
    }
    
    private final void updateSettingsList() {
    }
    
    private final void notifyChange(boolean needsViewRecreate, boolean needsAudioRestart, boolean sensorRefresh, boolean applyFullscreen) {
    }
    
    private final java.lang.String[] fullscreenModeLabels() {
        return null;
    }
    
    private final void showOrientationDialog() {
    }
    
    private final void showFullscreenDialog() {
    }
    
    private final void showAudioOffsetsDialog() {
    }
    
    private final void showAudioLatencyDialog() {
    }
    
    private final void showAudioQueueCapacityDialog() {
    }
    
    private final void showNightModeDialog() {
    }
    
    private final void showViewModeDialog() {
    }
    
    private final void triggerLogExport() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/main/QuickSettingsFragment$Companion;", "", "()V", "ACTION_SETTINGS_CHANGED", "", "EXTRA_APPLY_FULLSCREEN", "EXTRA_NEEDS_AUDIO_RESTART", "EXTRA_NEEDS_VIEW_RECREATE", "EXTRA_SENSOR_REFRESH", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}