package com.andrerinas.openheadunit.utils;

/**
 * Renders the [AppPermissions] registry as a checklist of rows into [container], reused by both
 * the setup wizard permissions step and the Settings > Permissions screen. Each row shows a title,
 * a help line, and either a green check (already granted) or an "Allow" button. The host owns the
 * two activity-result launchers and passes them in so results route back to the host.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/andrerinas/openheadunit/utils/PermissionRowBinder;", "", "activity", "Landroid/app/Activity;", "container", "Landroid/widget/LinearLayout;", "normalLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "specialLauncher", "Landroid/content/Intent;", "(Landroid/app/Activity;Landroid/widget/LinearLayout;Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/ActivityResultLauncher;)V", "attempted", "", "onGrantClicked", "", "entry", "Lcom/andrerinas/openheadunit/utils/AppPermissions$Entry;", "openAppSettings", "packageUri", "Landroid/net/Uri;", "rebind", "requestAllMissing", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class PermissionRowBinder {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.LinearLayout container = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> normalLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> specialLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> attempted = null;
    
    public PermissionRowBinder(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout container, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<java.lang.String[]> normalLauncher, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> specialLauncher) {
        super();
    }
    
    /**
     * Rebuild every row from the registry and its current granted state.
     */
    public final void rebind() {
    }
    
    /**
     * Request every missing normal permission in one system dialog. Special ones stay per-row.
     */
    public final void requestAllMissing() {
    }
    
    private final void onGrantClicked(com.andrerinas.openheadunit.utils.AppPermissions.Entry entry) {
    }
    
    private final void openAppSettings() {
    }
    
    private final android.net.Uri packageUri() {
        return null;
    }
}