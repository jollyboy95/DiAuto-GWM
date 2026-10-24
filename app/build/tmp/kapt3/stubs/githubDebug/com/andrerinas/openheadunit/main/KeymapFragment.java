package com.andrerinas.openheadunit.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002:\u000201B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\u0012\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020\u0019H\u0016J\u001a\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010-\u001a\u00020\u0019H\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0007R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/andrerinas/openheadunit/main/KeymapFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/andrerinas/openheadunit/main/MainActivity$KeyListener;", "()V", "RESET_ITEM_ID", "", "adapter", "Lcom/andrerinas/openheadunit/main/KeymapFragment$KeymapAdapter;", "assignDialog", "Landroidx/appcompat/app/AlertDialog;", "assignTargetCode", "keyCodeReceiver", "Landroid/content/BroadcastReceiver;", "keyList", "", "Lcom/andrerinas/openheadunit/main/KeymapFragment$KeymapItem;", "keypressDebuggerTextView", "Landroid/widget/TextView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "toolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onKeyEvent", "", "event", "Landroid/view/KeyEvent;", "onPause", "onResume", "onViewCreated", "view", "setupToolbar", "showAssignDialog", "item", "KeymapAdapter", "KeymapItem", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class KeymapFragment extends androidx.fragment.app.Fragment implements com.andrerinas.openheadunit.main.MainActivity.KeyListener {
    private com.google.android.material.appbar.MaterialToolbar toolbar;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private android.widget.TextView keypressDebuggerTextView;
    private com.andrerinas.openheadunit.main.KeymapFragment.KeymapAdapter adapter;
    private com.andrerinas.openheadunit.utils.Settings settings;
    private final int RESET_ITEM_ID = 1003;
    private int assignTargetCode = android.view.KeyEvent.KEYCODE_UNKNOWN;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog assignDialog;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.andrerinas.openheadunit.main.KeymapFragment.KeymapItem> keyList = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.BroadcastReceiver keyCodeReceiver = null;
    
    public KeymapFragment() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
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
    
    private final void setupToolbar() {
    }
    
    private final void showAssignDialog(com.andrerinas.openheadunit.main.KeymapFragment.KeymapItem item) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public boolean onKeyEvent(@org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0018B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\tH\u0016J \u0010\u000f\u001a\u00020\f2\u000e\u0010\u0010\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\tH\u0016J \u0010\u0012\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u001a\u0010\u0016\u001a\u00020\f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bR\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/andrerinas/openheadunit/main/KeymapFragment$KeymapAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/andrerinas/openheadunit/main/KeymapFragment$KeymapAdapter$ViewHolder;", "Lcom/andrerinas/openheadunit/main/KeymapFragment;", "items", "", "Lcom/andrerinas/openheadunit/main/KeymapFragment$KeymapItem;", "codesMap", "", "", "onClick", "Lkotlin/Function1;", "", "(Lcom/andrerinas/openheadunit/main/KeymapFragment;Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateCodes", "newMap", "ViewHolder", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public final class KeymapAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.andrerinas.openheadunit.main.KeymapFragment.KeymapAdapter.ViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.andrerinas.openheadunit.main.KeymapFragment.KeymapItem> items = null;
        @org.jetbrains.annotations.NotNull()
        private java.util.Map<java.lang.Integer, java.lang.Integer> codesMap;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<com.andrerinas.openheadunit.main.KeymapFragment.KeymapItem, kotlin.Unit> onClick = null;
        
        public KeymapAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<com.andrerinas.openheadunit.main.KeymapFragment.KeymapItem> items, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.Integer, java.lang.Integer> codesMap, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.main.KeymapFragment.KeymapItem, kotlin.Unit> onClick) {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.andrerinas.openheadunit.main.KeymapFragment.KeymapAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.main.KeymapFragment.KeymapAdapter.ViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        public final void updateCodes(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.Integer, java.lang.Integer> newMap) {
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/main/KeymapFragment$KeymapAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/andrerinas/openheadunit/main/KeymapFragment$KeymapAdapter;Landroid/view/View;)V", "nameText", "Landroid/widget/TextView;", "getNameText", "()Landroid/widget/TextView;", "valueText", "getValueText", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView nameText = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView valueText = null;
            
            public ViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View view) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getNameText() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getValueText() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/main/KeymapFragment$KeymapItem;", "", "nameResId", "", "keyCode", "(II)V", "getKeyCode", "()I", "getNameResId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class KeymapItem {
        private final int nameResId = 0;
        private final int keyCode = 0;
        
        public KeymapItem(int nameResId, int keyCode) {
            super();
        }
        
        public final int getNameResId() {
            return 0;
        }
        
        public final int getKeyCode() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.main.KeymapFragment.KeymapItem copy(int nameResId, int keyCode) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}