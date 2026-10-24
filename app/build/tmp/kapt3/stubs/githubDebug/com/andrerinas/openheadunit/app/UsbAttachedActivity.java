package com.andrerinas.openheadunit.app;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/app/UsbAttachedActivity;", "Landroid/app/Activity;", "()V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "resolveUsbDevice", "Landroid/hardware/usb/UsbDevice;", "Companion", "DeviceSource", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class UsbAttachedActivity extends android.app.Activity {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.app.UsbAttachedActivity.Companion Companion = null;
    
    public UsbAttachedActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context newBase) {
    }
    
    private final android.hardware.usb.UsbDevice resolveUsbDevice(android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.app.UsbAttachedActivity.DeviceSource pickDeviceSource$com_andrerinas_headunitrevived_0_3_12_githubDebug(boolean intentHasDevice, int fallbackCount) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.Nullable()
    public static final android.hardware.usb.UsbDevice resolveDevice$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, @org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends android.hardware.usb.UsbDevice> androidDevices) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001\u00a2\u0006\u0002\b\tJ\'\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0001\u00a2\u0006\u0002\b\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/app/UsbAttachedActivity$Companion;", "", "()V", "pickDeviceSource", "Lcom/andrerinas/openheadunit/app/UsbAttachedActivity$DeviceSource;", "intentHasDevice", "", "fallbackCount", "", "pickDeviceSource$com_andrerinas_headunitrevived_0_3_12_githubDebug", "resolveDevice", "Landroid/hardware/usb/UsbDevice;", "intent", "Landroid/content/Intent;", "androidDevices", "", "resolveDevice$com_andrerinas_headunitrevived_0_3_12_githubDebug", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Determines which USB device to act on given the intent extras and the current
         * USB device list. Extracted for testability — the caller must pass both pieces
         * so tests can verify the logic without an Android Context.
         */
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.Nullable()
        public final android.hardware.usb.UsbDevice resolveDevice$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.Nullable()
        android.content.Intent intent, @org.jetbrains.annotations.NotNull()
        java.util.Collection<? extends android.hardware.usb.UsbDevice> androidDevices) {
            return null;
        }
        
        /**
         * Pure decision logic extracted for unit testing.
         */
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.app.UsbAttachedActivity.DeviceSource pickDeviceSource$com_andrerinas_headunitrevived_0_3_12_githubDebug(boolean intentHasDevice, int fallbackCount) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/app/UsbAttachedActivity$DeviceSource;", "", "(Ljava/lang/String;I)V", "FROM_INTENT", "FROM_FALLBACK", "AMBIGUOUS", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum DeviceSource {
        /*public static final*/ FROM_INTENT /* = new FROM_INTENT() */,
        /*public static final*/ FROM_FALLBACK /* = new FROM_FALLBACK() */,
        /*public static final*/ AMBIGUOUS /* = new AMBIGUOUS() */;
        
        DeviceSource() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.app.UsbAttachedActivity.DeviceSource> getEntries() {
            return null;
        }
    }
}