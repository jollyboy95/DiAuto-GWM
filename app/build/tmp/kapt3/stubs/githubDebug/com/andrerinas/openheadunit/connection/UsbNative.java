package com.andrerinas.openheadunit.connection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0006J\u0011\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0082 J\u0019\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0082 J\u0006\u0010\r\u001a\u00020\u000eJ\u0011\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0004H\u0082 J\u0019\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0082 J\u0011\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0004H\u0082 J\t\u0010\u0013\u001a\u00020\u0004H\u0082 J)\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0082 J\u0011\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0004H\u0082 J1\u0010\u001a\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0082 J\u0016\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006J\u0006\u0010 \u001a\u00020\u000eJ\u001e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006J\u0019\u0010\'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0006H\u0082 J\u001e\u0010)\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/andrerinas/openheadunit/connection/UsbNative;", "", "()V", "contextPtr", "", "epIn", "", "epOut", "handlePtr", "accModeSwitch", "handle", "claimInterface", "iface", "close", "", "closeDevice", "detachKernel", "exitContext", "ctx", "initContext", "nativeRead", "jbuf", "Ljava/nio/ByteBuffer;", "endpoint", "timeout", "nativeResetDevice", "nativeWrite", "data", "", "length", "read", "buffer", "reset", "wrap", "", "connection", "Landroid/hardware/usb/UsbDeviceConnection;", "epInAddr", "epOutAddr", "wrapDevice", "fd", "write", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class UsbNative {
    private long contextPtr = 0L;
    private long handlePtr = 0L;
    private int epIn = 0;
    private int epOut = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.UsbNative.Companion Companion = null;
    
    public UsbNative() {
        super();
    }
    
    public final boolean wrap(@org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbDeviceConnection connection, int epInAddr, int epOutAddr) {
        return false;
    }
    
    public final int write(@org.jetbrains.annotations.NotNull()
    byte[] data, int length, int timeout) {
        return 0;
    }
    
    public final int read(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer buffer, int timeout) {
        return 0;
    }
    
    public final void reset() {
    }
    
    public final void close() {
    }
    
    public final int accModeSwitch() {
        return 0;
    }
    
    private final native long initContext() {
        return 0L;
    }
    
    private final native long wrapDevice(long ctx, int fd) {
        return 0L;
    }
    
    private final native int detachKernel(long handle, int iface) {
        return 0;
    }
    
    private final native int claimInterface(long handle, int iface) {
        return 0;
    }
    
    private final native int nativeWrite(long handle, byte[] data, int length, int endpoint, int timeout) {
        return 0;
    }
    
    private final native int nativeRead(long handle, java.nio.ByteBuffer jbuf, int endpoint, int timeout) {
        return 0;
    }
    
    private final native void nativeResetDevice(long handle) {
    }
    
    private final native void closeDevice(long handle) {
    }
    
    private final native void exitContext(long ctx) {
    }
    
    private final native int accModeSwitch(long handle) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/connection/UsbNative$Companion;", "", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}