package com.andrerinas.openheadunit.connection;

/**
 * A comprehensive receiver for steering wheel and hardware buttons, 
 * covering both standard Android events and proprietary Chinese headunit broadcasts.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/connection/CarKeyReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "handleClick", "", "context", "Landroid/content/Context;", "commManager", "Lcom/andrerinas/openheadunit/connection/CommManager;", "keyCode", "", "handleKey", "isDown", "", "onReceive", "intent", "Landroid/content/Intent;", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class CarKeyReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] ACTIONS = {"android.intent.action.MEDIA_BUTTON", "hy.intent.action.MEDIA_BUTTON", "geely.intent.action.MEDIA_BUTTON", "ecarx.intent.action.MEDIA_BUTTON", "com.ecarx.intent.action.MEDIA_BUTTON", "com.geely.intent.action.MEDIA_BUTTON", "com.ecarx.media.action.KEY_EVENT", "com.geely.car.media.action.KEY_EVENT", "com.nwd.action.ACTION_KEY_VALUE", "com.microntek.irkeyUp", "com.microntek.irkeyDown", "com.winca.service.Setting.KEY_ACTION", "android.intent.action.C3_HARDKEY", "IKeyClick.KEY_CLICK", "com.eryanet.music.prev", "com.eryanet.music.next", "com.eryanet.media.playorpause", "com.eryanet.media.play", "com.eryanet.media.pause", "com.bz.action.phone.pickup", "com.bz.action.phone.hangup", "com.tencent.qqmusiccar.action.MEDIA_BUTTON_INNER_ONKEY", "cn.kuwo.kwmusicauto.action.MEDIA_BUTTON"};
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.CarKeyReceiver.Companion Companion = null;
    
    public CarKeyReceiver() {
        super();
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    /**
     * Single key press or release — broadcasts for learning and projection handling.
     */
    private final void handleKey(android.content.Context context, com.andrerinas.openheadunit.connection.CommManager commManager, int keyCode, boolean isDown) {
    }
    
    /**
     * Full click (DOWN + UP) — broadcasts both events for learning AND sends to AA.
     */
    private final void handleClick(android.content.Context context, com.andrerinas.openheadunit.connection.CommManager commManager, int keyCode) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/connection/CarKeyReceiver$Companion;", "", "()V", "ACTIONS", "", "", "getACTIONS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
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