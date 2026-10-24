package com.andrerinas.openheadunit.connection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 -2\u00020\u0001:\u0002-.B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001f\u001a\u00020\u0014H\u0096@\u00a2\u0006\u0002\u0010 J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\bH\u0002J\u000e\u0010$\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005J(\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0014H\u0016J\b\u0010*\u001a\u00020\"H\u0002J \u0010+\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0016J\u0010\u0010,\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/andrerinas/openheadunit/connection/UsbAccessoryConnection;", "Lcom/andrerinas/openheadunit/connection/AccessoryConnection;", "usbMgr", "Landroid/hardware/usb/UsbManager;", "device", "Landroid/hardware/usb/UsbDevice;", "(Landroid/hardware/usb/UsbManager;Landroid/hardware/usb/UsbDevice;)V", "consecutiveReadErrors", "", "endpointIn", "Landroid/hardware/usb/UsbEndpoint;", "endpointOut", "errorBurstResetGapMs", "", "firstErrorTimeMs", "internalBuffer", "", "internalBufferAvailable", "internalBufferPos", "isConnected", "", "()Z", "isSingleMessage", "lastSuccessTimeMs", "maxErrorDurationBeforeDisconnect", "usbDeviceConnected", "Lcom/andrerinas/openheadunit/connection/UsbDeviceCompat;", "usbDeviceConnection", "Landroid/hardware/usb/UsbDeviceConnection;", "usbInterface", "Landroid/hardware/usb/UsbInterface;", "connect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disconnect", "", "initEndpoint", "isDeviceRunning", "recvBlocking", "buf", "length", "timeout", "readFully", "resetInterface", "sendBlocking", "usbOpen", "Companion", "UsbOpenException", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class UsbAccessoryConnection implements com.andrerinas.openheadunit.connection.AccessoryConnection {
    @org.jetbrains.annotations.NotNull()
    private final android.hardware.usb.UsbManager usbMgr = null;
    @org.jetbrains.annotations.NotNull()
    private final android.hardware.usb.UsbDevice device = null;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile com.andrerinas.openheadunit.connection.UsbDeviceCompat usbDeviceConnected;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile android.hardware.usb.UsbDeviceConnection usbDeviceConnection;
    @org.jetbrains.annotations.Nullable()
    private android.hardware.usb.UsbInterface usbInterface;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile android.hardware.usb.UsbEndpoint endpointIn;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile android.hardware.usb.UsbEndpoint endpointOut;
    @org.jetbrains.annotations.NotNull()
    private final byte[] internalBuffer = null;
    private int internalBufferPos = 0;
    private int internalBufferAvailable = 0;
    private int consecutiveReadErrors = 0;
    private long firstErrorTimeMs = 0L;
    private long lastSuccessTimeMs;
    private final long maxErrorDurationBeforeDisconnect = 60000L;
    
    /**
     * Minimum gap (ms) between a successful read and a new error before treating it as a new burst.
     */
    private final long errorBurstResetGapMs = 5000L;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.Object sStateLock = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.UsbAccessoryConnection.Companion Companion = null;
    
    public UsbAccessoryConnection(@org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbManager usbMgr, @org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbDevice device) {
        super();
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
    
    @kotlin.jvm.Throws(exceptionClasses = {com.andrerinas.openheadunit.connection.UsbAccessoryConnection.UsbOpenException.class})
    private final boolean connect(android.hardware.usb.UsbDevice device) throws com.andrerinas.openheadunit.connection.UsbAccessoryConnection.UsbOpenException {
        return false;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {com.andrerinas.openheadunit.connection.UsbAccessoryConnection.UsbOpenException.class})
    private final void usbOpen(android.hardware.usb.UsbDevice device) throws com.andrerinas.openheadunit.connection.UsbAccessoryConnection.UsbOpenException {
    }
    
    private final int initEndpoint() {
        return 0;
    }
    
    private final void resetInterface() {
    }
    
    @java.lang.Override()
    public void disconnect() {
    }
    
    @java.lang.Override()
    public boolean isConnected() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isSingleMessage() {
        return false;
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0004"}, d2 = {"Lcom/andrerinas/openheadunit/connection/UsbAccessoryConnection$Companion;", "", "()V", "sStateLock", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/connection/UsbAccessoryConnection$UsbOpenException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "tr", "", "(Ljava/lang/Throwable;)V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class UsbOpenException extends java.lang.Exception {
        
        public UsbOpenException(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        public UsbOpenException(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable tr) {
            super();
        }
    }
}