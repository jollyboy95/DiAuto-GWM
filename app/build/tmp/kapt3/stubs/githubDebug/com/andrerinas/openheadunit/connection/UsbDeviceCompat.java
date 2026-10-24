package com.andrerinas.openheadunit.connection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/connection/UsbDeviceCompat;", "", "wrappedDevice", "Landroid/hardware/usb/UsbDevice;", "(Landroid/hardware/usb/UsbDevice;)V", "deviceName", "", "getDeviceName", "()Ljava/lang/String;", "isInAccessoryMode", "", "()Z", "uniqueName", "getUniqueName", "getWrappedDevice", "()Landroid/hardware/usb/UsbDevice;", "toString", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class UsbDeviceCompat {
    @org.jetbrains.annotations.NotNull()
    private final android.hardware.usb.UsbDevice wrappedDevice = null;
    private static final int USB_VID_GOO = 6353;
    private static final int USB_PID_ACC = 11520;
    private static final int USB_PID_ACC_ADB = 11521;
    private static final int APPLE_VID = 1452;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.UsbDeviceCompat.Companion Companion = null;
    
    public UsbDeviceCompat(@org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbDevice wrappedDevice) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.hardware.usb.UsbDevice getWrappedDevice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUniqueName() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    public final boolean isInAccessoryMode() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/andrerinas/openheadunit/connection/UsbDeviceCompat$Companion;", "", "()V", "APPLE_VID", "", "USB_PID_ACC", "USB_PID_ACC_ADB", "USB_VID_GOO", "getUniqueName", "", "device", "Landroid/hardware/usb/UsbDevice;", "hasAndroidInterface", "", "hasBulkEndpoint", "usbInterface", "Landroid/hardware/usb/UsbInterface;", "isAndroidDevice", "isInAccessoryMode", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUniqueName(@org.jetbrains.annotations.NotNull()
        android.hardware.usb.UsbDevice device) {
            return null;
        }
        
        public final boolean isInAccessoryMode(@org.jetbrains.annotations.NotNull()
        android.hardware.usb.UsbDevice device) {
            return false;
        }
        
        public final boolean isAndroidDevice(@org.jetbrains.annotations.NotNull()
        android.hardware.usb.UsbDevice device) {
            return false;
        }
        
        /**
         * Identifies an Android device by USB class/subclass
         * More reliable than a VID list
         */
        private final boolean hasAndroidInterface(android.hardware.usb.UsbDevice device) {
            return false;
        }
        
        /**
         * Checks for the presence of a bulk endpoint (needed for data transfer)
         */
        private final boolean hasBulkEndpoint(android.hardware.usb.UsbInterface usbInterface) {
            return false;
        }
    }
}