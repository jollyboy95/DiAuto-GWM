package com.andrerinas.openheadunit.main;

/**
 * Sub-screen to choose the Android Auto DPI with a slider, a live graphic and
 * Small/Medium/Large tabs, plus an Automatic switch (0 = use the device density).
 * It saves on its own Save button and also hands the value back to SettingsFragment so the
 * main list stays in sync. DPI takes effect on the next Android Auto connection.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\b\u0010\u0017\u001a\u00020\bH\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\u001a\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\u0019H\u0002J\b\u0010)\u001a\u00020\u0019H\u0002J\b\u0010*\u001a\u00020\u0019H\u0002J\b\u0010+\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/andrerinas/openheadunit/main/DpiSettingsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "autoDesc", "Landroid/widget/TextView;", "autoSwitch", "Lcom/google/android/material/switchmaterial/SwitchMaterial;", "initialValue", "", "overPanelWarning", "picker", "Lcom/andrerinas/openheadunit/view/DpiPickerView;", "saveButton", "Lcom/google/android/material/button/MaterialButton;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "getSettings", "()Lcom/andrerinas/openheadunit/utils/Settings;", "settings$delegate", "Lkotlin/Lazy;", "toolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "currentValue", "detectedDensityDpi", "handleBackPress", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onViewCreated", "view", "realMetrics", "Landroid/util/DisplayMetrics;", "saveSettings", "setupToolbar", "updateOverPanelWarning", "updateSaveButtonState", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class DpiSettingsFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy settings$delegate = null;
    private com.google.android.material.appbar.MaterialToolbar toolbar;
    private com.andrerinas.openheadunit.view.DpiPickerView picker;
    private com.google.android.material.switchmaterial.SwitchMaterial autoSwitch;
    private android.widget.TextView autoDesc;
    private android.widget.TextView overPanelWarning;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.button.MaterialButton saveButton;
    private int initialValue = 0;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DPI_RESULT = "dpi_result";
    private static final int SAVE_ITEM_ID = 1001;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.main.DpiSettingsFragment.Companion Companion = null;
    
    public DpiSettingsFragment() {
        super();
    }
    
    private final com.andrerinas.openheadunit.utils.Settings getSettings() {
        return null;
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
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void setupToolbar() {
    }
    
    /**
     * 0 = Automatic (device density), otherwise the chosen DPI.
     */
    private final int currentValue() {
        return 0;
    }
    
    private final void updateSaveButtonState() {
    }
    
    private final void saveSettings() {
    }
    
    private final void handleBackPress() {
    }
    
    private final int detectedDensityDpi() {
        return 0;
    }
    
    private final android.util.DisplayMetrics realMetrics() {
        return null;
    }
    
    /**
     * Warn (in red) when the chosen resolution is higher than the panel: the DPI is then computed
     * for the capped resolution the device actually projects, not the one the user picked.
     */
    private final void updateOverPanelWarning() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/main/DpiSettingsFragment$Companion;", "", "()V", "KEY_DPI_RESULT", "", "SAVE_ITEM_ID", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}