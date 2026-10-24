package com.andrerinas.openheadunit.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J,\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0007J,\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/utils/ToastUtils;", "", "()V", "isToastEnabled", "", "context", "Landroid/content/Context;", "showToast", "", "resId", "", "duration", "force", "text", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ToastUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.ToastUtils INSTANCE = null;
    
    private ToastUtils() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration, boolean force) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int resId, int duration, boolean force) {
    }
    
    private final boolean isToastEnabled(android.content.Context context) {
        return false;
    }
}