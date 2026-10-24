package com.andrerinas.openheadunit.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010&\u001a\u00020\u001aH\u0002J\b\u0010\'\u001a\u00020\u001aH\u0002J\b\u0010(\u001a\u00020\u001aH\u0002J\b\u0010)\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/andrerinas/openheadunit/main/MicSettingsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "SAVE_ITEM_ID", "", "hasChanges", "", "pendingMicAutoGainControl", "Ljava/lang/Boolean;", "pendingMicEchoCanceler", "pendingMicInputSource", "Ljava/lang/Integer;", "pendingMicNoiseSuppressor", "pendingMicSampleRate", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "requiresRestart", "saveButton", "Lcom/google/android/material/button/MaterialButton;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "settingsAdapter", "Lcom/andrerinas/openheadunit/main/settings/SettingsAdapter;", "toolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "checkChanges", "", "handleBackPress", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "saveSettings", "setupToolbar", "updateSaveButtonState", "updateSettingsList", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class MicSettingsFragment extends androidx.fragment.app.Fragment {
    private com.andrerinas.openheadunit.utils.Settings settings;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.andrerinas.openheadunit.main.settings.SettingsAdapter settingsAdapter;
    private com.google.android.material.appbar.MaterialToolbar toolbar;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.button.MaterialButton saveButton;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer pendingMicSampleRate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer pendingMicInputSource;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean pendingMicEchoCanceler;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean pendingMicNoiseSuppressor;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean pendingMicAutoGainControl;
    private boolean hasChanges = false;
    private boolean requiresRestart = false;
    private final int SAVE_ITEM_ID = 1001;
    
    public MicSettingsFragment() {
        super();
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
    
    private final void setupToolbar() {
    }
    
    private final void handleBackPress() {
    }
    
    private final void updateSaveButtonState() {
    }
    
    private final void saveSettings() {
    }
    
    private final void checkChanges() {
    }
    
    private final void updateSettingsList() {
    }
}