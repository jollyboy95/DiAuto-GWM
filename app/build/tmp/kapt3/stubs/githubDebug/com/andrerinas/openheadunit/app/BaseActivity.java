package com.andrerinas.openheadunit.app;

/**
 * Base Activity that handles app language configuration, HUD mirroring, and live theme switching.
 * All activities should extend this class to properly apply the user's language preference and HUD mode.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0004J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u000eH\u0014J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001c\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\nH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/andrerinas/openheadunit/app/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "currentAppTheme", "Lcom/andrerinas/openheadunit/utils/Settings$AppTheme;", "currentHudMirroring", "", "currentLanguage", "", "currentNightMode", "", "currentUseExtremeDarkMode", "currentUseGradientBackground", "applyHudMirroring", "", "attachBaseContext", "newBase", "Landroid/content/Context;", "onAttachedToWindow", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPostCreate", "onResume", "setContentView", "view", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "layoutResID", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentLanguage;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.utils.Settings.AppTheme currentAppTheme;
    private int currentNightMode = 0;
    private boolean currentUseGradientBackground = false;
    private boolean currentUseExtremeDarkMode = false;
    private boolean currentHudMirroring = false;
    
    public BaseActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context newBase) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void setContentView(int layoutResID) {
    }
    
    @java.lang.Override()
    public void setContentView(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void setContentView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup.LayoutParams params) {
    }
    
    @java.lang.Override()
    protected void onPostCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    protected final void applyHudMirroring() {
    }
}