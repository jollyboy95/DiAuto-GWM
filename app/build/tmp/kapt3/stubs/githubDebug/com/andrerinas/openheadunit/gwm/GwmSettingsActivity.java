package com.andrerinas.openheadunit.gwm;

/**
 * GWM/Haval settings and parked diagnostics, ported from DiPlay's GWM settings card
 * (jollyboy95/d-play-gwm-h7 @ 1460810). Every control saves immediately. Choices that change what
 * is declared to the phone say they apply on the next connection; the rest update a running
 * session's windows at once.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017H\u0002JI\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140 H\u0002\u00a2\u0006\u0002\u0010!J.\u0010\"\u001a\u00020\u00142\b\b\u0001\u0010\u0019\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140 H\u0003J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001dH\u0002J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\'\u001a\u00020(H\u0002J$\u0010)\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+H\u0002J\u0012\u0010-\u001a\u00020\u00142\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020\u0014H\u0014J\b\u00101\u001a\u00020\u0014H\u0014J\b\u00102\u001a\u00020\u0014H\u0002J\b\u00103\u001a\u00020\u0014H\u0003J\b\u00104\u001a\u00020\u0014H\u0003J\b\u00105\u001a\u00020\u0014H\u0003J\b\u00106\u001a\u00020\u0014H\u0003J\b\u00107\u001a\u00020\u0014H\u0003J\u0012\u00108\u001a\u00020\u00122\b\b\u0001\u0010\u0019\u001a\u00020\u001dH\u0002J\b\u00109\u001a\u00020\u0014H\u0002J\b\u0010:\u001a\u00020\fH\u0002J\b\u0010;\u001a\u00020\u0014H\u0002J\u0010\u0010<\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0002J8\u0010=\u001a\u00020\u00142\b\b\u0001\u0010\u0019\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010>\u001a\u00020+2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00140 H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lcom/andrerinas/openheadunit/gwm/GwmSettingsActivity;", "Lcom/andrerinas/openheadunit/app/BaseActivity;", "()V", "appSettings", "Lcom/andrerinas/openheadunit/utils/Settings;", "getAppSettings", "()Lcom/andrerinas/openheadunit/utils/Settings;", "content", "Landroid/widget/LinearLayout;", "gwm", "Lcom/andrerinas/openheadunit/gwm/GwmSettings;", "scanResult", "", "steering", "Lorg/dplay/gwm/GwmSteeringKeyObserver;", "steeringEvents", "Lkotlin/collections/ArrayDeque;", "steeringLabel", "Landroid/widget/TextView;", "button", "", "text", "onClick", "Lkotlin/Function0;", "choice", "title", "labels", "", "index", "", "description", "onPick", "Lkotlin/Function1;", "(Ljava/lang/String;[Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "displayChoice", "selected", "dp", "value", "heading", "size", "", "note", "selectable", "", "mono", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "render", "renderCluster", "renderDiagnostics", "renderHud", "renderStatus", "renderVehicle", "section", "startSteering", "steeringText", "stopSteering", "toast", "toggle", "checked", "onChange", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class GwmSettingsActivity extends com.andrerinas.openheadunit.app.BaseActivity {
    private android.widget.LinearLayout content;
    private com.andrerinas.openheadunit.gwm.GwmSettings gwm;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String scanResult;
    @org.jetbrains.annotations.Nullable()
    private org.dplay.gwm.GwmSteeringKeyObserver steering;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.collections.ArrayDeque<java.lang.String> steeringEvents = null;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView steeringLabel;
    
    public GwmSettingsActivity() {
        super();
    }
    
    private final com.andrerinas.openheadunit.utils.Settings getAppSettings() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void render() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void renderVehicle() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void renderCluster() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void renderHud() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void renderStatus() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void renderDiagnostics() {
    }
    
    private final void startSteering() {
    }
    
    private final void stopSteering() {
    }
    
    private final java.lang.String steeringText() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void displayChoice(@androidx.annotation.StringRes()
    int title, int selected, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onPick) {
    }
    
    private final void choice(java.lang.String title, java.lang.String[] labels, int index, java.lang.String description, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onPick) {
    }
    
    private final void toggle(@androidx.annotation.StringRes()
    int title, java.lang.String description, boolean checked, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onChange) {
    }
    
    private final void button(java.lang.String text, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    private final android.widget.TextView section(@androidx.annotation.StringRes()
    int title) {
        return null;
    }
    
    private final android.widget.TextView heading(java.lang.String text, float size) {
        return null;
    }
    
    private final android.widget.TextView note(java.lang.String text, boolean selectable, boolean mono) {
        return null;
    }
    
    private final void toast(java.lang.String text) {
    }
    
    private final int dp(int value) {
        return 0;
    }
}