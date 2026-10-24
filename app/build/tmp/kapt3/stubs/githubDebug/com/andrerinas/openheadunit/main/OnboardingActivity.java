package com.andrerinas.openheadunit.main;

/**
 * Intelligent, device-aware first-run wizard. Replaces the old
 * SafetyDisclaimerDialog + SetupWizard dialog chain with a single guided flow.
 *
 * Shown once to everyone (including upgraders) when the stored onboardingVersion
 * is older than CURRENT_ONBOARDING_VERSION, and re-launchable from Settings.
 *
 * Steps: Welcome(+language) / Safety(mandatory) / Connection / Display scan /
 * Appearance / Automation / Location / Ready.
 *
 * Every step reuses the real settings and their strings, and deep-links into the
 * full settings sub-screens for advanced configuration.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 S2\u00020\u0001:\u0001SB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0002J\b\u0010\'\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020$H\u0002J\b\u0010)\u001a\u00020$H\u0002J\b\u0010*\u001a\u00020\u000fH\u0002J\b\u0010+\u001a\u00020\u000fH\u0002J\b\u0010,\u001a\u00020\u000fH\u0002J\b\u0010-\u001a\u00020\u0017H\u0002J\b\u0010.\u001a\u00020$H\u0002J\u0010\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020 H\u0002J\b\u00101\u001a\u00020$H\u0002J\b\u00102\u001a\u00020$H\u0002J\u0010\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020 H\u0002J\b\u00105\u001a\u00020\nH\u0002J\b\u00106\u001a\u00020$H\u0016J\u0012\u00107\u001a\u00020$2\b\u00108\u001a\u0004\u0018\u000109H\u0014J\b\u0010:\u001a\u00020$H\u0002J\b\u0010;\u001a\u00020$H\u0002J\b\u0010<\u001a\u00020$H\u0014J\b\u0010=\u001a\u00020$H\u0014J\u0010\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u000209H\u0014J\b\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020 H\u0002J\b\u0010C\u001a\u00020$H\u0002J\u0010\u0010D\u001a\u00020 2\u0006\u0010E\u001a\u00020 H\u0002J\b\u0010F\u001a\u00020$H\u0002J\b\u0010G\u001a\u00020$H\u0002J\b\u0010H\u001a\u00020$H\u0002J\u0010\u0010I\u001a\u00020 2\u0006\u0010J\u001a\u00020\u0017H\u0002J\b\u0010K\u001a\u00020\u000fH\u0002J\b\u0010L\u001a\u00020$H\u0002J\b\u0010M\u001a\u00020$H\u0002J\b\u0010N\u001a\u00020$H\u0002J\b\u0010O\u001a\u00020$H\u0002J\b\u0010P\u001a\u00020$H\u0002J\u000e\u0010Q\u001a\b\u0012\u0004\u0012\u00020 0RH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006T"}, d2 = {"Lcom/andrerinas/openheadunit/main/OnboardingActivity;", "Lcom/andrerinas/openheadunit/app/BaseActivity;", "()V", "backBtn", "Lcom/google/android/material/button/MaterialButton;", "dpiPicker", "Lcom/andrerinas/openheadunit/view/DpiPickerView;", "flipper", "Landroid/widget/ViewFlipper;", "isBinding", "", "nextBtn", "permNormalLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "permSpecialLauncher", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "permissionBinder", "Lcom/andrerinas/openheadunit/utils/PermissionRowBinder;", "selectedPortrait", "selectedSize", "Lcom/andrerinas/openheadunit/utils/SystemOptimizer$DisplaySizePreset;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "getSettings", "()Lcom/andrerinas/openheadunit/utils/Settings;", "settings$delegate", "Lkotlin/Lazy;", "skipBtn", "step", "", "stepper", "Landroid/widget/LinearLayout;", "applyAutomationVisibility", "", "applyDisplaySettings", "bindPermissionsStep", "bindSteps", "bindVehicleStep", "buildStepperDots", "connectionModesLabel", "currentLanguageLabel", "detectedDisplayText", "estimateSizePreset", "finishOnboarding", "finishOnboardingInto", "destinationId", "goBack", "goForward", "isStepHidden", "s", "isUpgrader", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDoItLater", "onNext", "onPause", "onResume", "onSaveInstanceState", "outState", "realMetrics", "Landroid/util/DisplayMetrics;", "recommendedDpi", "render", "resolveAttrColor", "attr", "showLanguageDialog", "showNightModeDialog", "showThemeDialog", "sizeButtonId", "preset", "summaryText", "updateConnectionDetail", "updateDpiOverPanelWarning", "updateNightButtonText", "updateStepperDots", "updateThemeButtonText", "visibleSteps", "", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class OnboardingActivity extends com.andrerinas.openheadunit.app.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy settings$delegate = null;
    private android.widget.ViewFlipper flipper;
    private com.google.android.material.button.MaterialButton backBtn;
    private com.google.android.material.button.MaterialButton nextBtn;
    private com.google.android.material.button.MaterialButton skipBtn;
    private android.widget.LinearLayout stepper;
    private int step = 0;
    private boolean isBinding = false;
    @org.jetbrains.annotations.NotNull()
    private com.andrerinas.openheadunit.utils.SystemOptimizer.DisplaySizePreset selectedSize = com.andrerinas.openheadunit.utils.SystemOptimizer.DisplaySizePreset.STANDARD_9_10;
    private boolean selectedPortrait = false;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.view.DpiPickerView dpiPicker;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.utils.PermissionRowBinder permissionBinder;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> permNormalLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> permSpecialLauncher = null;
    public static final int CURRENT_ONBOARDING_VERSION = 2;
    @kotlin.jvm.Volatile()
    private static volatile boolean deferredThisSession = false;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_STEP = "onb_step";
    private static final int STEP_COUNT = 11;
    private static final int STEP_SAFETY = 1;
    private static final int STEP_CONNECTION = 2;
    private static final int STEP_DISPLAY = 3;
    private static final int STEP_DPI = 4;
    private static final int STEP_AUTOMATION = 6;
    private static final int STEP_GPS = 7;
    private static final int STEP_VEHICLE = 8;
    private static final int STEP_PERMISSIONS = 9;
    private static final int STEP_READY = 10;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DHU_MAKE = "Google";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<java.lang.String> NOT_A_MANUFACTURER = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.main.OnboardingActivity.Companion Companion = null;
    
    public OnboardingActivity() {
        super();
    }
    
    private final com.andrerinas.openheadunit.utils.Settings getSettings() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    /**
     * A wizard step that does not apply to the chosen setup and is skipped entirely. The GPS source
     * choice (this device vs the connected phone) makes no sense in Self Mode, where there is no
     * separate phone, so it is hidden there.
     */
    private final boolean isStepHidden(int s) {
        return false;
    }
    
    /**
     * The steps actually shown, in order, after removing the ones that do not apply.
     */
    private final java.util.List<java.lang.Integer> visibleSteps() {
        return null;
    }
    
    /**
     * Move forward to the next visible step, or finish on the last one.
     */
    private final void goForward() {
    }
    
    /**
     * Move back to the previous visible step.
     */
    private final void goBack() {
    }
    
    private final void buildStepperDots() {
    }
    
    private final void updateStepperDots() {
    }
    
    private final void bindSteps() {
    }
    
    /**
     * Binds the car-brand step: a live head-unit screen, an editable field and a horizontal
     * strip of brand chips. The current stored value is shown first and pre-selected, and the
     * field is the source of truth (chips are shortcuts).
     */
    private final void bindVehicleStep() {
    }
    
    private final void render() {
    }
    
    /**
     * Wire the permissions checklist. Rows are rendered from the AppPermissions registry, so a
     * future permission only needs a registry entry, not changes here.
     */
    private final void bindPermissionsStep() {
    }
    
    /**
     * Show only the auto-start toggles that match the chosen connection type. Self Mode
     * connects without USB or WiFi, so both groups are hidden.
     */
    private final void applyAutomationVisibility() {
    }
    
    private final void onNext() {
    }
    
    /**
     * "Do it later": close the wizard for now WITHOUT marking it complete, so it appears
     * again on the next app launch. The safety disclaimer is still mandatory, so if it has
     * not been accepted yet we route to that step first instead of leaving.
     */
    private final void onDoItLater() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void finishOnboarding() {
    }
    
    /**
     * Complete the wizard and open a specific Settings sub-screen (e.g. the loading screen setup).
     */
    private final void finishOnboardingInto(int destinationId) {
    }
    
    private final java.lang.String currentLanguageLabel() {
        return null;
    }
    
    private final void showLanguageDialog() {
    }
    
    private final void updateConnectionDetail() {
    }
    
    /**
     * The chosen connection types as a readable label, e.g. "USB, WiFi".
     */
    private final java.lang.String connectionModesLabel() {
        return null;
    }
    
    private final android.util.DisplayMetrics realMetrics() {
        return null;
    }
    
    /**
     * Estimate the physical diagonal from real pixels and physical DPI, pick the closest preset.
     */
    private final com.andrerinas.openheadunit.utils.SystemOptimizer.DisplaySizePreset estimateSizePreset() {
        return null;
    }
    
    private final int sizeButtonId(com.andrerinas.openheadunit.utils.SystemOptimizer.DisplaySizePreset preset) {
        return 0;
    }
    
    private final java.lang.String detectedDisplayText() {
        return null;
    }
    
    private final int recommendedDpi() {
        return 0;
    }
    
    /**
     * Warn (in red) when the current resolution is higher than the panel: the DPI is computed for
     * the capped resolution the device actually projects (issue #767). Relevant mainly for
     * upgraders who forced a resolution above their panel; fresh installs get a fitted value.
     */
    private final void updateDpiOverPanelWarning() {
    }
    
    /**
     * True for users who already ran the app before this wizard version (finished the old wizard,
     * or an earlier onboarding). Their display settings are a working config we must not overwrite.
     */
    private final boolean isUpgrader() {
        return false;
    }
    
    /**
     * Writes the recommended display settings plus the DPI chosen in the picker. Called when
     * leaving the Display and Android Auto size steps, so no separate Apply tap is needed.
     */
    private final void applyDisplaySettings() {
    }
    
    private final void updateThemeButtonText() {
    }
    
    private final void updateNightButtonText() {
    }
    
    private final void showThemeDialog() {
    }
    
    private final void showNightModeDialog() {
    }
    
    private final java.lang.String summaryText() {
        return null;
    }
    
    private final int resolveAttrColor(int attr) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/andrerinas/openheadunit/main/OnboardingActivity$Companion;", "", "()V", "CURRENT_ONBOARDING_VERSION", "", "DHU_MAKE", "", "KEY_STEP", "NOT_A_MANUFACTURER", "", "STEP_AUTOMATION", "STEP_CONNECTION", "STEP_COUNT", "STEP_DISPLAY", "STEP_DPI", "STEP_GPS", "STEP_PERMISSIONS", "STEP_READY", "STEP_SAFETY", "STEP_VEHICLE", "deferredThisSession", "", "getDeferredThisSession", "()Z", "setDeferredThisSession", "(Z)V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean getDeferredThisSession() {
            return false;
        }
        
        public final void setDeferredThisSession(boolean p0) {
        }
    }
}