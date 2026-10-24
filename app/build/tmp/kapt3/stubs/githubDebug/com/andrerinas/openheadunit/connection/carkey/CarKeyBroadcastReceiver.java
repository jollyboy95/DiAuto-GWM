package com.andrerinas.openheadunit.connection.carkey;

/**
 * A comprehensive receiver for steering wheel and hardware buttons,
 * covering both standard Android events and proprietary Chinese headunit broadcasts.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/connection/carkey/CarKeyBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Lcom/andrerinas/openheadunit/connection/carkey/CarKeyReceiver;", "()V", "context", "Landroid/content/Context;", "isSUNeeded", "", "()Z", "isSupported", "onReceive", "", "intent", "Landroid/content/Intent;", "register", "unregister", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class CarKeyBroadcastReceiver extends android.content.BroadcastReceiver implements com.andrerinas.openheadunit.connection.carkey.CarKeyReceiver {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] ACTIONS = {"android.intent.action.MEDIA_BUTTON", "hy.intent.action.MEDIA_BUTTON", "geely.intent.action.MEDIA_BUTTON", "ecarx.intent.action.MEDIA_BUTTON", "com.ecarx.intent.action.MEDIA_BUTTON", "com.geely.intent.action.MEDIA_BUTTON", "com.ecarx.media.action.KEY_EVENT", "com.geely.car.media.action.KEY_EVENT", "com.nwd.action.ACTION_KEY_VALUE", "com.microntek.irkeyUp", "com.microntek.irkeyDown", "com.winca.service.Setting.KEY_ACTION", "android.intent.action.C3_HARDKEY", "IKeyClick.KEY_CLICK", "com.eryanet.music.prev", "com.eryanet.music.next", "com.eryanet.media.playorpause", "com.eryanet.media.play", "com.eryanet.media.pause", "com.bz.action.phone.pickup", "com.bz.action.phone.hangup", "com.tencent.qqmusiccar.action.MEDIA_BUTTON_INNER_ONKEY", "cn.kuwo.kwmusicauto.action.MEDIA_BUTTON"};
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    private final boolean isSupported = true;
    private final boolean isSUNeeded = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.carkey.CarKeyBroadcastReceiver.Companion Companion = null;
    
    public CarKeyBroadcastReceiver() {
        super();
    }
    
    @java.lang.Override()
    public boolean isSupported() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isSUNeeded() {
        return false;
    }
    
    @java.lang.Override()
    public void register(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void unregister() {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void handleClick(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int keyCode) {
    }
    
    @java.lang.Override()
    public void handleKey(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int keyCode, boolean isDown) {
    }
    
    @java.lang.Override()
    public void toggleVoiceAssistant(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/connection/carkey/CarKeyBroadcastReceiver$Companion;", "", "()V", "ACTIONS", "", "", "getACTIONS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getACTIONS() {
            return null;
        }
    }
}