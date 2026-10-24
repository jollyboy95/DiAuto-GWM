package com.andrerinas.openheadunit.main;

/**
 * A guided entry point to the existing native wireless transports.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J,\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\u0012\u0010\u001e\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010\'\u001a\u00020\u0013H\u0016J\b\u0010(\u001a\u00020\u0013H\u0016J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020 H\u0016J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u0013H\u0002J\u0010\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u0018H\u0002J \u00101\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u0018H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u00063"}, d2 = {"Lcom/andrerinas/openheadunit/main/ConnectionSetupFragment;", "Landroidx/fragment/app/Fragment;", "()V", "content", "Landroid/widget/LinearLayout;", "pendingCarHotspotSetup", "", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "getSettings", "()Lcom/andrerinas/openheadunit/utils/Settings;", "button", "Lcom/google/android/material/button/MaterialButton;", "parent", "title", "", "selected", "action", "Lkotlin/Function0;", "", "card", "body", "Lkotlin/Function1;", "color", "", "id", "dp", "value", "editHotspot", "select", "onCreate", "state", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onResume", "onSaveInstanceState", "outState", "openSystem", "intent", "Landroid/content/Intent;", "render", "selectMode", "mode", "text", "size", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ConnectionSetupFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private android.widget.LinearLayout content;
    private boolean pendingCarHotspotSetup = false;
    
    public ConnectionSetupFragment() {
        super();
    }
    
    private final com.andrerinas.openheadunit.utils.Settings getSettings() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle state) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle state) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void render() {
    }
    
    private final void selectMode(int mode) {
    }
    
    private final void editHotspot(boolean select) {
    }
    
    private final void openSystem(android.content.Intent intent) {
    }
    
    private final void card(android.widget.LinearLayout parent, java.lang.String title, kotlin.jvm.functions.Function1<? super android.widget.LinearLayout, kotlin.Unit> body) {
    }
    
    private final void text(android.widget.LinearLayout parent, java.lang.String value, int size) {
    }
    
    private final com.google.android.material.button.MaterialButton button(android.widget.LinearLayout parent, java.lang.String title, boolean selected, kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        return null;
    }
    
    private final int dp(int value) {
        return 0;
    }
    
    private final int color(int id) {
        return 0;
    }
}