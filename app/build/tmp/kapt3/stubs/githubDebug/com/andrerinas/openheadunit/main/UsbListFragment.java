package com.andrerinas.openheadunit.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u001f B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/andrerinas/openheadunit/main/UsbListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/andrerinas/openheadunit/main/UsbListFragment$DeviceAdapter;", "mainViewModel", "Lcom/andrerinas/openheadunit/main/MainViewModel;", "getMainViewModel", "()Lcom/andrerinas/openheadunit/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "noUsbDeviceTextView", "Landroid/widget/TextView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "toolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "", "onViewCreated", "view", "DeviceAdapter", "DeviceViewHolder", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class UsbListFragment extends androidx.fragment.app.Fragment {
    private com.andrerinas.openheadunit.main.UsbListFragment.DeviceAdapter adapter;
    private com.andrerinas.openheadunit.utils.Settings settings;
    private android.widget.TextView noUsbDeviceTextView;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.google.android.material.appbar.MaterialToolbar toolbar;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mainViewModel$delegate = null;
    
    public UsbListFragment() {
        super();
    }
    
    private final com.andrerinas.openheadunit.main.MainViewModel getMainViewModel() {
        return null;
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
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J\"\u0010\u001e\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/andrerinas/openheadunit/main/UsbListFragment$DeviceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/andrerinas/openheadunit/main/UsbListFragment$DeviceViewHolder;", "Landroid/view/View$OnClickListener;", "mContext", "Landroid/content/Context;", "mSettings", "Lcom/andrerinas/openheadunit/utils/Settings;", "(Landroid/content/Context;Lcom/andrerinas/openheadunit/utils/Settings;)V", "allowedDevices", "", "", "deviceList", "", "Lcom/andrerinas/openheadunit/connection/UsbDeviceCompat;", "lastClickTime", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onClick", "v", "Landroid/view/View;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class DeviceAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.andrerinas.openheadunit.main.UsbListFragment.DeviceViewHolder> implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context mContext = null;
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.utils.Settings mSettings = null;
        @org.jetbrains.annotations.NotNull()
        private java.util.Set<java.lang.String> allowedDevices;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<com.andrerinas.openheadunit.connection.UsbDeviceCompat> deviceList;
        private long lastClickTime = 0L;
        
        public DeviceAdapter(@org.jetbrains.annotations.NotNull()
        android.content.Context mContext, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.utils.Settings mSettings) {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.andrerinas.openheadunit.main.UsbListFragment.DeviceViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.main.UsbListFragment.DeviceViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        public final void setData(@org.jetbrains.annotations.NotNull()
        java.util.List<com.andrerinas.openheadunit.connection.UsbDeviceCompat> deviceList, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> allowedDevices) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/andrerinas/openheadunit/main/UsbListFragment$DeviceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "allowButton", "Landroid/widget/Button;", "kotlin.jvm.PlatformType", "getAllowButton", "()Landroid/widget/Button;", "startButton", "getStartButton", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class DeviceViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.Button allowButton = null;
        private final android.widget.Button startButton = null;
        
        public DeviceViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final android.widget.Button getAllowButton() {
            return null;
        }
        
        public final android.widget.Button getStartButton() {
            return null;
        }
    }
}