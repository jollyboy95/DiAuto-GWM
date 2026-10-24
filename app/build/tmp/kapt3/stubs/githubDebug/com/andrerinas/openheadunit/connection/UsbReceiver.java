package com.andrerinas.openheadunit.connection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/connection/UsbReceiver;", "Landroid/content/BroadcastReceiver;", "mListener", "Lcom/andrerinas/openheadunit/connection/UsbReceiver$Listener;", "(Lcom/andrerinas/openheadunit/connection/UsbReceiver$Listener;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "Listener", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class UsbReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.connection.UsbReceiver.Listener mListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_USB_DEVICE_PERMISSION = "com.andrerinas.openheadunit.ACTION_USB_DEVICE_PERMISSION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_CONNECT = "EXTRA_CONNECT";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.UsbReceiver.Companion Companion = null;
    
    public UsbReceiver(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.connection.UsbReceiver.Listener mListener) {
        super();
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/connection/UsbReceiver$Companion;", "", "()V", "ACTION_USB_DEVICE_PERMISSION", "", "EXTRA_CONNECT", "createFilter", "Landroid/content/IntentFilter;", "createPermissionPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "match", "", "action", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.PendingIntent createPermissionPendingIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.IntentFilter createFilter() {
            return null;
        }
        
        public final boolean match(@org.jetbrains.annotations.NotNull()
        java.lang.String action) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\f"}, d2 = {"Lcom/andrerinas/openheadunit/connection/UsbReceiver$Listener;", "", "onUsbAccessoryDetach", "", "onUsbAttach", "device", "Landroid/hardware/usb/UsbDevice;", "onUsbDetach", "onUsbPermission", "granted", "", "connect", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static abstract interface Listener {
        
        public abstract void onUsbDetach(@org.jetbrains.annotations.NotNull()
        android.hardware.usb.UsbDevice device);
        
        public abstract void onUsbAttach(@org.jetbrains.annotations.NotNull()
        android.hardware.usb.UsbDevice device);
        
        public abstract void onUsbAccessoryDetach();
        
        public abstract void onUsbPermission(boolean granted, boolean connect, @org.jetbrains.annotations.NotNull()
        android.hardware.usb.UsbDevice device);
    }
}