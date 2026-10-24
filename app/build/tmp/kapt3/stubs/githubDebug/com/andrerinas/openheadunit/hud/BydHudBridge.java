package com.andrerinas.openheadunit.hud;

/**
 * Publishes CarPlay route arrows, distance and street to BYD's native windshield HUD.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020\u0015H\u0002J\u0012\u00100\u001a\u0004\u0018\u00010$2\u0006\u00101\u001a\u00020\u000fH\u0002J\u000e\u00102\u001a\u00020-2\u0006\u00103\u001a\u00020\u001eJ\u0014\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$0#H\u0002J\u0016\u00105\u001a\u00020-2\f\u00106\u001a\b\u0012\u0004\u0012\u00020-07H\u0002J\b\u00108\u001a\u00020-H\u0002J\b\u00109\u001a\u00020-H\u0002J\u0010\u0010:\u001a\u00020\u00152\u0006\u0010;\u001a\u00020$H\u0002J\b\u0010<\u001a\u00020-H\u0002J/\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000f2\b\b\u0002\u0010?\u001a\u00020\u00152\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020-0AH\u0082\bJ\u0010\u0010C\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u00010 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010%\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010&R\u000e\u0010\'\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lcom/andrerinas/openheadunit/hud/BydHudBridge;", "", "()V", "CALLBACK_TOKEN", "", "HUD_TOPIC", "", "ICON_ASSET_DIR", "SERVICE_ID", "SOMEIP_ACTION", "SOMEIP_CLASS", "SOMEIP_PACKAGE", "SOMEIP_TOKEN", "TAG", "TX_FIRE_EVENT", "", "TX_REGISTER_CALLBACK", "TX_START_SERVICE", "binder", "Landroid/os/IBinder;", "binding", "", "callback", "Landroid/os/Binder;", "callbacks", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "connection", "Landroid/content/ServiceConnection;", "context", "Landroid/content/Context;", "guidance", "Lcom/andrerinas/openheadunit/hud/BydGuidance;", "guidanceSentLogged", "icons", "", "", "lastSendResult", "Ljava/lang/Integer;", "lock", "sendCount", "senderStarted", "showing", "started", "bindLocked", "", "clearHudLocked", "enabled", "iconFor", "gaode", "initialize", "appContext", "loadIcons", "onGatewayCallback", "action", "Lkotlin/Function0;", "resetBindingLocked", "sendCurrentLocked", "sendLocked", "payload", "tick", "transactLocked", "code", "returnsValue", "write", "Lkotlin/Function1;", "Landroid/os/Parcel;", "update", "value", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BydHudBridge {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "DiAuto-BYD-HUD";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SOMEIP_PACKAGE = "com.ts.car.someip.service";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SOMEIP_CLASS = "com.ts.car.someip.service.manager.SomeIpServerService";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SOMEIP_ACTION = "com.ts.car.someip.SomeIpServerService";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SOMEIP_TOKEN = "ts.car.someip.sdk.ISomeIpServerInterface";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CALLBACK_TOKEN = "ts.car.someip.sdk.ISomeIpCallback";
    private static final long SERVICE_ID = 3097367205183488L;
    private static final long HUD_TOPIC = 1127042368241665L;
    private static final int TX_REGISTER_CALLBACK = 1;
    private static final int TX_START_SERVICE = 4;
    private static final int TX_FIRE_EVENT = 6;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ICON_ASSET_DIR = "byd-hud-icons";
    private static final java.util.concurrent.ExecutorService callbacks = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.Object lock = null;
    @org.jetbrains.annotations.Nullable()
    private static com.andrerinas.openheadunit.hud.BydGuidance guidance;
    @org.jetbrains.annotations.Nullable()
    private static android.content.Context context;
    @org.jetbrains.annotations.Nullable()
    private static android.os.IBinder binder;
    private static boolean binding = false;
    private static boolean started = false;
    private static boolean senderStarted = false;
    private static boolean guidanceSentLogged = false;
    private static boolean showing = false;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Integer lastSendResult;
    private static long sendCount = 0L;
    @org.jetbrains.annotations.Nullable()
    private static java.util.Map<java.lang.Integer, byte[]> icons;
    @org.jetbrains.annotations.NotNull()
    private static final android.os.Binder callback = null;
    @org.jetbrains.annotations.NotNull()
    private static final android.content.ServiceConnection connection = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.hud.BydHudBridge INSTANCE = null;
    
    private BydHudBridge() {
        super();
    }
    
    public final void initialize(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext) {
    }
    
    public final void update(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.hud.BydGuidance value) {
    }
    
    private final void tick() {
    }
    
    private final boolean enabled() {
        return false;
    }
    
    private final void sendCurrentLocked() {
    }
    
    private final void clearHudLocked() {
    }
    
    private final byte[] iconFor(int gaode) {
        return null;
    }
    
    private final java.util.Map<java.lang.Integer, byte[]> loadIcons() {
        return null;
    }
    
    private final void bindLocked() {
    }
    
    private final void onGatewayCallback(kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    private final int transactLocked(int code, boolean returnsValue, kotlin.jvm.functions.Function1<? super android.os.Parcel, kotlin.Unit> write) {
        return 0;
    }
    
    private final boolean sendLocked(byte[] payload) {
        return false;
    }
    
    private final void resetBindingLocked() {
    }
}