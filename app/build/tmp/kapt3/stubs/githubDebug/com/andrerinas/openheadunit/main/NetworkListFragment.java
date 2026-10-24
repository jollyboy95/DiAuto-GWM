package com.andrerinas.openheadunit.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u0003123B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010 \u001a\u00020\u0014H\u0016J\b\u0010!\u001a\u00020\u0014H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0016J\"\u0010%\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010,\u001a\u00020\u0014H\u0002J\b\u0010-\u001a\u00020\u0014H\u0002J\b\u0010.\u001a\u00020\u0014H\u0002J\b\u0010/\u001a\u00020\u0014H\u0002J\b\u00100\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/andrerinas/openheadunit/main/NetworkListFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/andrerinas/openheadunit/connection/NetworkDiscovery$Listener;", "()V", "ADD_ITEM_ID", "", "SCAN_ITEM_ID", "adapter", "Lcom/andrerinas/openheadunit/main/NetworkListFragment$AddressAdapter;", "connectivityManager", "Landroid/net/ConnectivityManager;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkDiscovery", "Lcom/andrerinas/openheadunit/connection/NetworkDiscovery;", "scanDialog", "Landroidx/appcompat/app/AlertDialog;", "toolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "addAddress", "", "ip", "Ljava/net/InetAddress;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPause", "onResume", "onScanFinished", "oneShot", "", "onServiceFound", "", "port", "socket", "Ljava/net/Socket;", "onViewCreated", "view", "setupToolbarMenu", "showAddAddressDialog", "showScanDialog", "startScan", "updateCurrentAddress", "AddressAdapter", "Companion", "DeviceViewHolder", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class NetworkListFragment extends androidx.fragment.app.Fragment implements com.andrerinas.openheadunit.connection.NetworkDiscovery.Listener {
    private com.andrerinas.openheadunit.main.NetworkListFragment.AddressAdapter adapter;
    private android.net.ConnectivityManager connectivityManager;
    private com.google.android.material.appbar.MaterialToolbar toolbar;
    private com.andrerinas.openheadunit.connection.NetworkDiscovery networkDiscovery;
    @org.jetbrains.annotations.Nullable()
    private android.net.ConnectivityManager.NetworkCallback networkCallback;
    private final int ADD_ITEM_ID = 1002;
    private final int SCAN_ITEM_ID = 1003;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog scanDialog;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "NetworkListFragment";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.main.NetworkListFragment.Companion Companion = null;
    
    public NetworkListFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupToolbarMenu() {
    }
    
    private final void startScan() {
    }
    
    private final void showScanDialog() {
    }
    
    @java.lang.Override()
    public void onServiceFound(@org.jetbrains.annotations.NotNull()
    java.lang.String ip, int port, @org.jetbrains.annotations.Nullable()
    java.net.Socket socket) {
    }
    
    @java.lang.Override()
    public void onScanFinished(boolean oneShot) {
    }
    
    private final void showAddAddressDialog() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void updateCurrentAddress() {
    }
    
    public final void addAddress(@org.jetbrains.annotations.NotNull()
    java.net.InetAddress ip) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0000\u00a2\u0006\u0002\b\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\r\u0010\u001e\u001a\u00020\u0018H\u0000\u00a2\u0006\u0002\b\u001fJ\u0018\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001dH\u0016J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001dH\u0016J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\rH\u0002J\u0016\u0010,\u001a\u00020\u00182\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0.H\u0002R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/andrerinas/openheadunit/main/NetworkListFragment$AddressAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/andrerinas/openheadunit/main/NetworkListFragment$DeviceViewHolder;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lkotlinx/coroutines/CoroutineScope;)V", "addressList", "Ljava/util/ArrayList;", "", "getAddressList", "()Ljava/util/ArrayList;", "currentAddress", "getCurrentAddress", "()Ljava/lang/String;", "setCurrentAddress", "(Ljava/lang/String;)V", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "addNewAddress", "", "ip", "Ljava/net/InetAddress;", "addNewAddress$com_andrerinas_headunitrevived_0_3_12_githubDebug", "getItemCount", "", "loadAddresses", "loadAddresses$com_andrerinas_headunitrevived_0_3_12_githubDebug", "onBindViewHolder", "holder", "position", "onClick", "v", "Landroid/view/View;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeAddress", "ipAddress", "set", "addrs", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class AddressAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.andrerinas.openheadunit.main.NetworkListFragment.DeviceViewHolder> implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.fragment.app.FragmentManager fragmentManager = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlinx.coroutines.CoroutineScope scope = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.ArrayList<java.lang.String> addressList = null;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String currentAddress = "";
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.utils.Settings settings = null;
        
        public AddressAdapter(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope scope) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getAddressList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCurrentAddress() {
            return null;
        }
        
        public final void setCurrentAddress(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.andrerinas.openheadunit.main.NetworkListFragment.DeviceViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.main.NetworkListFragment.DeviceViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        public final void addNewAddress$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.NotNull()
        java.net.InetAddress ip) {
        }
        
        public final void loadAddresses$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
        }
        
        private final void set(java.util.Collection<java.lang.String> addrs) {
        }
        
        private final void removeAddress(java.lang.String ipAddress) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/andrerinas/openheadunit/main/NetworkListFragment$Companion;", "", "()V", "TAG", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/andrerinas/openheadunit/main/NetworkListFragment$DeviceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "removeButton", "Landroid/widget/Button;", "kotlin.jvm.PlatformType", "getRemoveButton$com_andrerinas_headunitrevived_0_3_12_githubDebug", "()Landroid/widget/Button;", "startButton", "getStartButton$com_andrerinas_headunitrevived_0_3_12_githubDebug", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class DeviceViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.Button removeButton = null;
        private final android.widget.Button startButton = null;
        
        public DeviceViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final android.widget.Button getRemoveButton$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
            return null;
        }
        
        public final android.widget.Button getStartButton$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
            return null;
        }
    }
}