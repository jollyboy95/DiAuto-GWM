package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u000e\u001a\u00020\u0006*\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/aap/KeyCode;", "", "()V", "BYD_VOICE_LONG_PRESS", "", "isByd", "", "()Z", "isByd$delegate", "Lkotlin/Lazy;", "supported", "", "getSupported", "()Ljava/util/List;", "isMediaSessionKey", "Landroid/view/KeyEvent;", "(Landroid/view/KeyEvent;)Z", "convert", "keyCode", "convert$com_andrerinas_headunitrevived_0_3_12_githubDebug", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class KeyCode {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.Integer> supported = null;
    
    /**
     * BYD's KEYCODE_AUTO_MEDIA_VOICE_LP, verified on DiLink 3.0 (Android 10).
     */
    public static final int BYD_VOICE_LONG_PRESS = 312;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy isByd$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.KeyCode INSTANCE = null;
    
    private KeyCode() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getSupported() {
        return null;
    }
    
    private final boolean isByd() {
        return false;
    }
    
    public final boolean isMediaSessionKey(@org.jetbrains.annotations.NotNull()
    android.view.KeyEvent $this$isMediaSessionKey) {
        return false;
    }
    
    public final int convert$com_andrerinas_headunitrevived_0_3_12_githubDebug(int keyCode) {
        return 0;
    }
}