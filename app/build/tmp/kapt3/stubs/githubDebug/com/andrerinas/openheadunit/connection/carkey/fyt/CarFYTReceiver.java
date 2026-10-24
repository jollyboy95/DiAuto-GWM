package com.andrerinas.openheadunit.connection.carkey.fyt;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/connection/carkey/fyt/CarFYTReceiver;", "Lcom/andrerinas/openheadunit/connection/carkey/CarKeyReceiver;", "()V", "connection", "Lcom/andrerinas/openheadunit/connection/carkey/fyt/CarFYTReceiver$IPCConnection;", "isSUNeeded", "", "()Z", "isSupported", "register", "", "context", "Landroid/content/Context;", "unregister", "IPCConnection", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class CarFYTReceiver implements com.andrerinas.openheadunit.connection.carkey.CarKeyReceiver {
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.connection.carkey.fyt.CarFYTReceiver.IPCConnection connection;
    private final boolean isSUNeeded = true;
    
    public CarFYTReceiver() {
        super();
    }
    
    @java.lang.Override()
    public boolean isSupported() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isSUNeeded() {
        return false;
    }
    
    @java.lang.Override()
    public void register(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void unregister() {
    }
    
    @java.lang.Override()
    public void handleClick(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int keyCode) {
    }
    
    @java.lang.Override()
    public void handleKey(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int keyCode, boolean isDown) {
    }
    
    @java.lang.Override()
    public void toggleVoiceAssistant(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001*B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u001bJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"J\u0018\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020%H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/andrerinas/openheadunit/connection/carkey/fyt/CarFYTReceiver$IPCConnection;", "Landroid/content/ServiceConnection;", "context", "Landroid/content/Context;", "suExecutor", "Lcom/andrerinas/openheadunit/utils/SUExecutor;", "receiver", "Lcom/andrerinas/openheadunit/connection/carkey/fyt/CarFYTReceiver;", "(Landroid/content/Context;Lcom/andrerinas/openheadunit/utils/SUExecutor;Lcom/andrerinas/openheadunit/connection/carkey/fyt/CarFYTReceiver;)V", "CLASS_NAME", "", "PACKAGE_NAME", "getContext", "()Landroid/content/Context;", "handler", "Landroid/os/Handler;", "modules", "Ljava/util/HashMap;", "", "Lcom/andrerinas/openheadunit/connection/carkey/fyt/RemoteModule;", "getReceiver", "()Lcom/andrerinas/openheadunit/connection/carkey/fyt/CarFYTReceiver;", "getSuExecutor", "()Lcom/andrerinas/openheadunit/utils/SUExecutor;", "toolkit", "Lcom/andrerinas/openheadunit/connection/carkey/fyt/RemoteToolkit;", "attemptConnect", "", "connect", "disconnect", "observe", "", "moduleCode", "codes", "", "onServiceConnected", "name", "Landroid/content/ComponentName;", "binder", "Landroid/os/IBinder;", "onServiceDisconnected", "p0", "AAPCallback", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class IPCConnection implements android.content.ServiceConnection {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.utils.SUExecutor suExecutor = null;
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.connection.carkey.fyt.CarFYTReceiver receiver = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String PACKAGE_NAME = "com.syu.ms";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String CLASS_NAME = "app.ToolkitService";
        @org.jetbrains.annotations.Nullable()
        private android.os.Handler handler;
        @org.jetbrains.annotations.Nullable()
        private com.andrerinas.openheadunit.connection.carkey.fyt.RemoteToolkit toolkit;
        @org.jetbrains.annotations.NotNull()
        private final java.util.HashMap<java.lang.Integer, com.andrerinas.openheadunit.connection.carkey.fyt.RemoteModule> modules = null;
        
        public IPCConnection(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.utils.SUExecutor suExecutor, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.connection.carkey.fyt.CarFYTReceiver receiver) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.utils.SUExecutor getSuExecutor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.connection.carkey.fyt.CarFYTReceiver getReceiver() {
            return null;
        }
        
        public final void connect() {
        }
        
        private final void attemptConnect() {
        }
        
        public final void disconnect() {
        }
        
        @java.lang.Override()
        public void onServiceConnected(@org.jetbrains.annotations.NotNull()
        android.content.ComponentName name, @org.jetbrains.annotations.NotNull()
        android.os.IBinder binder) {
        }
        
        public final boolean observe(int moduleCode, @org.jetbrains.annotations.NotNull()
        int[] codes) {
            return false;
        }
        
        @java.lang.Override()
        public void onServiceDisconnected(@org.jetbrains.annotations.NotNull()
        android.content.ComponentName p0) {
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J9\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016\u00a2\u0006\u0002\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/connection/carkey/fyt/CarFYTReceiver$IPCConnection$AAPCallback;", "Lcom/andrerinas/openheadunit/connection/carkey/fyt/ModuleCallback$Stub;", "moduleCode", "", "(Lcom/andrerinas/openheadunit/connection/carkey/fyt/CarFYTReceiver$IPCConnection;I)V", "getModuleCode", "()I", "update", "", "updateCode", "ints", "", "floats", "", "strings", "", "", "(I[I[F[Ljava/lang/String;)V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        final class AAPCallback extends com.andrerinas.openheadunit.connection.carkey.fyt.ModuleCallback.Stub {
            private final int moduleCode = 0;
            
            public AAPCallback(int moduleCode) {
                super();
            }
            
            public final int getModuleCode() {
                return 0;
            }
            
            @java.lang.Override()
            public void update(int updateCode, @org.jetbrains.annotations.Nullable()
            int[] ints, @org.jetbrains.annotations.Nullable()
            float[] floats, @org.jetbrains.annotations.Nullable()
            java.lang.String[] strings) {
            }
        }
    }
}