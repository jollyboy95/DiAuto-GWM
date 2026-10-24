package com.andrerinas.openheadunit.hud;

/**
 * Binder transport to the installed car server's property service. The service checks
 * the original caller's permissions before writing. Use synchronous setProperties:
 * setMultiProperties only acknowledges queueing and hides later permission failures.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0004J\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydCarServerTransport;", "", "()V", "CAR_SERVER_APK", "", "INTERFACE", "PROVIDER_URI", "readMethod", "Ljava/lang/reflect/Method;", "service", "setMethod", "valueClass", "Ljava/lang/Class;", "valueCtor", "Ljava/lang/reflect/Constructor;", "ensureService", "context", "Landroid/content/Context;", "queryBinder", "Landroid/os/IBinder;", "read", "key", "write", "", "value", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BydCarServerTransport {
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Object service;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.reflect.Constructor<?> valueCtor;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Class<?> valueClass;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.reflect.Method setMethod;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.reflect.Method readMethod;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CAR_SERVER_APK = "/system/priv-app/DiCarServer/DiCarServer.apk";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PROVIDER_URI = "content://com.byd.car.server.provider.CarServiceProvider/sync_binder";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String INTERFACE = "com.byd.car.property.ICarPropertyService";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.BydCarServerTransport INSTANCE = null;
    
    private BydCarServerTransport() {
        super();
    }
    
    @kotlin.jvm.Synchronized()
    private final synchronized java.lang.Object ensureService(android.content.Context context) {
        return null;
    }
    
    private final android.os.IBinder queryBinder(android.content.Context context) {
        return null;
    }
    
    /**
     * Returns the completed property-handler status; 0 still does not prove rendering.
     */
    public final int write(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
        return 0;
    }
    
    /**
     * Reads a property through the same service; returns "code=value" description.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String read(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
}