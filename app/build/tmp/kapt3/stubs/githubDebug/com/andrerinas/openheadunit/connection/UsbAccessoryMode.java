package com.andrerinas.openheadunit.connection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0006J \u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/connection/UsbAccessoryMode;", "", "usbMgr", "Landroid/hardware/usb/UsbManager;", "(Landroid/hardware/usb/UsbManager;)V", "connectAndSwitch", "", "device", "Landroid/hardware/usb/UsbDevice;", "useLibusb", "initStringControlTransfer", "conn", "Landroid/hardware/usb/UsbDeviceConnection;", "index", "", "string", "", "switch", "connection", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class UsbAccessoryMode {
    @org.jetbrains.annotations.NotNull()
    private final android.hardware.usb.UsbManager usbMgr = null;
    private static final int USB_TIMEOUT_IN_MS = 100;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MANUFACTURER = "Android";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MODEL = "Android Auto";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DESCRIPTION = "Android Auto";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String VERSION = "2.0.1";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String URI = "https://developer.android.com/auto/index.html";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SERIAL = "HU-AAAAAA001";
    private static final int ACC_IDX_MAN = 0;
    private static final int ACC_IDX_MOD = 1;
    private static final int ACC_IDX_DES = 2;
    private static final int ACC_IDX_VER = 3;
    private static final int ACC_IDX_URI = 4;
    private static final int ACC_IDX_SER = 5;
    private static final int ACC_REQ_GET_PROTOCOL = 51;
    private static final int ACC_REQ_SEND_STRING = 52;
    private static final int ACC_REQ_START = 53;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.UsbAccessoryMode.Companion Companion = null;
    
    public UsbAccessoryMode(@org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbManager usbMgr) {
        super();
    }
    
    public final boolean connectAndSwitch(@org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbDevice device, boolean useLibusb) {
        return false;
    }
    
    private final boolean initStringControlTransfer(android.hardware.usb.UsbDeviceConnection conn, int index, java.lang.String string) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/andrerinas/openheadunit/connection/UsbAccessoryMode$Companion;", "", "()V", "ACC_IDX_DES", "", "ACC_IDX_MAN", "ACC_IDX_MOD", "ACC_IDX_SER", "ACC_IDX_URI", "ACC_IDX_VER", "ACC_REQ_GET_PROTOCOL", "ACC_REQ_SEND_STRING", "ACC_REQ_START", "DESCRIPTION", "", "MANUFACTURER", "MODEL", "SERIAL", "URI", "USB_TIMEOUT_IN_MS", "VERSION", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}