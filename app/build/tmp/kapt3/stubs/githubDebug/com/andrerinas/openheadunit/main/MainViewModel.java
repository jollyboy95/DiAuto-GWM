package com.andrerinas.openheadunit.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010#\u001a\u00020\u0019R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/andrerinas/openheadunit/main/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/andrerinas/openheadunit/connection/UsbReceiver$Listener;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "app", "Lcom/andrerinas/openheadunit/App;", "getApp", "()Lcom/andrerinas/openheadunit/App;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "usbDevices", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/andrerinas/openheadunit/connection/UsbDeviceCompat;", "getUsbDevices", "()Landroidx/lifecycle/MutableLiveData;", "usbReceiver", "Lcom/andrerinas/openheadunit/connection/UsbReceiver;", "createDeviceList", "allowDevices", "", "", "onCleared", "", "onUsbAccessoryDetach", "onUsbAttach", "device", "Landroid/hardware/usb/UsbDevice;", "onUsbDetach", "onUsbPermission", "granted", "", "connect", "register", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel implements com.andrerinas.openheadunit.connection.UsbReceiver.Listener {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.andrerinas.openheadunit.connection.UsbDeviceCompat>> usbDevices = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.connection.UsbReceiver usbReceiver = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.main.MainViewModel.Companion Companion = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.andrerinas.openheadunit.connection.UsbDeviceCompat>> getUsbDevices() {
        return null;
    }
    
    private final com.andrerinas.openheadunit.App getApp() {
        return null;
    }
    
    public final void register() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @java.lang.Override()
    public void onUsbDetach(@org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbDevice device) {
    }
    
    @java.lang.Override()
    public void onUsbAccessoryDetach() {
    }
    
    @java.lang.Override()
    public void onUsbAttach(@org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbDevice device) {
    }
    
    @java.lang.Override()
    public void onUsbPermission(boolean granted, boolean connect, @org.jetbrains.annotations.NotNull()
    android.hardware.usb.UsbDevice device) {
    }
    
    private final java.util.List<com.andrerinas.openheadunit.connection.UsbDeviceCompat> createDeviceList(java.util.Set<java.lang.String> allowDevices) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<java.lang.String> deduplicateNames$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> names) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.andrerinas.openheadunit.connection.UsbDeviceCompat> filterAndSort$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.andrerinas.openheadunit.connection.UsbDeviceCompat> devices, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> allowDevices) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean shouldIncludeDevice$com_andrerinas_headunitrevived_0_3_12_githubDebug(boolean isInAccessoryMode, boolean anyNonAccessoryPresent) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001\u00a2\u0006\u0002\b\u0007J/\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0001\u00a2\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0001\u00a2\u0006\u0002\b\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/andrerinas/openheadunit/main/MainViewModel$Companion;", "", "()V", "deduplicateNames", "", "", "names", "deduplicateNames$com_andrerinas_headunitrevived_0_3_12_githubDebug", "filterAndSort", "Lcom/andrerinas/openheadunit/connection/UsbDeviceCompat;", "devices", "allowDevices", "", "filterAndSort$com_andrerinas_headunitrevived_0_3_12_githubDebug", "shouldIncludeDevice", "", "isInAccessoryMode", "anyNonAccessoryPresent", "shouldIncludeDevice$com_andrerinas_headunitrevived_0_3_12_githubDebug", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * During AOA mode switching the phone briefly appears as two separate USB entries:
         * normal mode (e.g. "Samsung Galaxy") and accessory mode ("18D1:2D00").
         * When both are present we hide the accessory-mode entry — it requires no user
         * action and causes the duplicate-device confusion reported as Bug 2.
         */
        @kotlin.jvm.JvmStatic()
        public final boolean shouldIncludeDevice$com_andrerinas_headunitrevived_0_3_12_githubDebug(boolean isInAccessoryMode, boolean anyNonAccessoryPresent) {
            return false;
        }
        
        /**
         * Removes duplicate names — same phone can get different kernel paths on each reconnect.
         */
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> deduplicateNames$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> names) {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.andrerinas.openheadunit.connection.UsbDeviceCompat> filterAndSort$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.NotNull()
        java.util.List<com.andrerinas.openheadunit.connection.UsbDeviceCompat> devices, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> allowDevices) {
            return null;
        }
    }
}