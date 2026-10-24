package com.andrerinas.openheadunit.connection.carkey;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J(\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/connection/carkey/CarKeyReceiver;", "", "isSUNeeded", "", "()Z", "isSupported", "handleClick", "", "context", "Landroid/content/Context;", "commManager", "Lcom/andrerinas/openheadunit/connection/CommManager;", "keyCode", "", "handleKey", "isDown", "register", "toggleVoiceAssistant", "unregister", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public abstract interface CarKeyReceiver {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.carkey.CarKeyReceiver.Companion Companion = null;
    
    public abstract boolean isSupported();
    
    public abstract boolean isSUNeeded();
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public abstract void register(@org.jetbrains.annotations.NotNull()
    android.content.Context context) throws java.lang.Exception;
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public abstract void unregister() throws java.lang.Exception;
    
    public abstract void handleKey(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int keyCode, boolean isDown);
    
    public abstract void handleClick(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int keyCode);
    
    public abstract void toggleVoiceAssistant(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static com.andrerinas.openheadunit.connection.carkey.CarKeyReceiver[] newDefaultReceivers() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/connection/carkey/CarKeyReceiver$Companion;", "", "()V", "newDefaultReceivers", "", "Lcom/andrerinas/openheadunit/connection/carkey/CarKeyReceiver;", "()[Lcom/andrerinas/openheadunit/connection/carkey/CarKeyReceiver;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.connection.carkey.CarKeyReceiver[] newDefaultReceivers() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        /**
         * Single key press or release — broadcasts for learning and projection handling.
         */
        private static void handleKey(com.andrerinas.openheadunit.connection.carkey.CarKeyReceiver $this, android.content.Context context, com.andrerinas.openheadunit.connection.CommManager commManager, int keyCode, boolean isDown) {
        }
        
        public static void handleKey(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.connection.carkey.CarKeyReceiver $this, @org.jetbrains.annotations.NotNull()
        android.content.Context context, int keyCode, boolean isDown) {
        }
        
        /**
         * Full click (DOWN + UP) — broadcasts both events for learning AND sends to AA.
         */
        private static void handleClick(com.andrerinas.openheadunit.connection.carkey.CarKeyReceiver $this, android.content.Context context, com.andrerinas.openheadunit.connection.CommManager commManager, int keyCode) {
        }
        
        public static void handleClick(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.connection.carkey.CarKeyReceiver $this, @org.jetbrains.annotations.NotNull()
        android.content.Context context, int keyCode) {
        }
        
        public static void toggleVoiceAssistant(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.connection.carkey.CarKeyReceiver $this, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}