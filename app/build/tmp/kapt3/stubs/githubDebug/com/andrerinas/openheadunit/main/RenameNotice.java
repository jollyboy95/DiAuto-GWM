package com.andrerinas.openheadunit.main;

/**
 * One-time app rename notice.
 *
 * Shown on whatever screen is in front when the app opens, including during an auto-connect and
 * on top of an active Android Auto projection. It is not cancelable and the "shown once" flag is
 * only spent when the user actually taps the button, so if a screen change hides it before it is
 * seen it simply comes back on the next screen. It still waits for onboarding to finish so it is
 * never spent behind the wizard.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/andrerinas/openheadunit/main/RenameNotice;", "", "()V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "dismiss", "", "maybeShow", "activity", "Landroid/app/Activity;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class RenameNotice {
    @org.jetbrains.annotations.Nullable()
    private static androidx.appcompat.app.AlertDialog dialog;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.main.RenameNotice INSTANCE = null;
    
    private RenameNotice() {
        super();
    }
    
    public final void maybeShow(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings) {
    }
    
    public final void dismiss() {
    }
}