package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/andrerinas/openheadunit/aap/DummyVpnService;", "Landroid/net/VpnService;", "()V", "vpnInterface", "Landroid/os/ParcelFileDescriptor;", "onDestroy", "", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "startVpn", "stopVpn", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class DummyVpnService extends android.net.VpnService {
    @org.jetbrains.annotations.Nullable()
    private android.os.ParcelFileDescriptor vpnInterface;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_STOP_VPN = "com.andrerinas.openheadunit.ACTION_STOP_VPN";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.DummyVpnService.Companion Companion = null;
    
    public DummyVpnService() {
        super();
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void startVpn() {
    }
    
    private final void stopVpn() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/andrerinas/openheadunit/aap/DummyVpnService$Companion;", "", "()V", "ACTION_STOP_VPN", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}