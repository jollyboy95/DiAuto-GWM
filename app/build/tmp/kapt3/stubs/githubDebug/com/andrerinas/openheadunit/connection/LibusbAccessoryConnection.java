package com.andrerinas.openheadunit.connection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010 \u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H\u0016J\u000e\u0010$\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005J(\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\rH\u0016J \u0010+\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0013H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/andrerinas/openheadunit/connection/LibusbAccessoryConnection;", "Lcom/andrerinas/openheadunit/connection/AccessoryConnection;", "usbMgr", "Landroid/hardware/usb/UsbManager;", "device", "Landroid/hardware/usb/UsbDevice;", "(Landroid/hardware/usb/UsbManager;Landroid/hardware/usb/UsbDevice;)V", "activeTransfers", "Ljava/util/concurrent/atomic/AtomicInteger;", "endpointIn", "Landroid/hardware/usb/UsbEndpoint;", "endpointOut", "isConnected", "", "()Z", "isConnectedVal", "isConnecting", "isSingleMessage", "leftoverPos", "", "leftoverSize", "readBuffer", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "stateLock", "", "usbDeviceConnection", "Landroid/hardware/usb/UsbDeviceConnection;", "usbInterface", "Landroid/hardware/usb/UsbInterface;", "usbNative", "Lcom/andrerinas/openheadunit/connection/UsbNative;", "connect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disconnect", "", "isDeviceRunning", "recvBlocking", "buf", "", "length", "timeout", "readFully", "sendBlocking", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class LibusbAccessoryConnection implements com.andrerinas.openheadunit.connection.AccessoryConnection {
    @org.jetbrains.annotations.NotNull()
    private final android.hardware.usb.UsbManager usbMgr = null;
    @org.jetbrains.annotations.NotNull()
    private final android.hardware.usb.UsbDevice device = null;
    @kotlin.jvm.Volatile()
    private volatile boolean isConnectedVal = false;
    @kotlin.jvm.Volatile()
    private volatile boolean isConnecting = false;
    @org.jetbrains.annotations.Nullable()
    private android.hardware.usb.UsbDeviceConnection usbDeviceConnection;
    @org.jetbrains.annotations.Nullable()
    private android.hardware.usb.UsbInterface usbInterface;
    @org.jetbrains.annotations.Nullable()
    private android.hardware.usb.UsbEndpoint endpointIn;
    @org.jetbrains.annotations.Nullable()
    private android.hardware.usb.UsbEndpoint endpointOut;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.connection.UsbNative usbNative;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object stateLock = null;
    private final java.nio.ByteBuffer readBuffer = null;
    private int leftoverSize = 0;
    private int leftoverPos = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.atomic.AtomicInteger activeTransfers = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.LibusbAccessoryConnection.Companion Companion = null;
    
    public LibusbAccessoryConnection(@org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbManager usbMgr, @org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbDevice device) {
        super();
    }
    
    @java.lang.Override()
    public boolean isSingleMessage() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isConnected() {
        return false;
    }
    
    public final boolean isDeviceRunning(@org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbDevice device) {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object connect(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override()
    public void disconnect() {
    }
    
    @java.lang.Override()
    public int sendBlocking(@org.jetbrains.annotations.NotNull()
    byte[] buf, int length, int timeout) {
        return 0;
    }
    
    @java.lang.Override()
    public int recvBlocking(@org.jetbrains.annotations.NotNull()
    byte[] buf, int length, int timeout, boolean readFully) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/connection/LibusbAccessoryConnection$Companion;", "", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}