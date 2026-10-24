package com.andrerinas.openheadunit.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0012\u001a\u00020\fH\u0002J\u0006\u0010\u0013\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/andrerinas/openheadunit/utils/SUExecutor;", "", "()V", "active", "Lcom/andrerinas/openheadunit/utils/SUExecutor$SUImplementation;", "all", "", "checkedPermissionOnBoot", "", "registered", "checkPermission", "checkPermissionOnBoot", "", "register", "setProp", "key", "", "value", "testRegistered", "unregister", "RootImpl", "SUImplementation", "ShizukuImpl", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class SUExecutor {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Collection<com.andrerinas.openheadunit.utils.SUExecutor.SUImplementation> all = null;
    private boolean registered = false;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.utils.SUExecutor.SUImplementation active;
    private boolean checkedPermissionOnBoot = false;
    
    public SUExecutor() {
        super();
    }
    
    public final void register() {
    }
    
    public final void unregister() {
    }
    
    public final void checkPermissionOnBoot() {
    }
    
    public final boolean checkPermission() {
        return false;
    }
    
    public final boolean setProp(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
    
    private final void testRegistered() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/utils/SUExecutor$RootImpl;", "Lcom/andrerinas/openheadunit/utils/SUExecutor$SUImplementation;", "()V", "name", "", "getName", "()Ljava/lang/String;", "checkPermission", "", "register", "", "runShell", "", "cmd", "unregister", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class RootImpl implements com.andrerinas.openheadunit.utils.SUExecutor.SUImplementation {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = "Root";
        
        public RootImpl() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String getName() {
            return null;
        }
        
        @java.lang.Override()
        public void register() {
        }
        
        @java.lang.Override()
        public void unregister() {
        }
        
        @java.lang.Override()
        public boolean checkPermission() {
            return false;
        }
        
        @java.lang.Override()
        public int runShell(@org.jetbrains.annotations.NotNull()
        java.lang.String cmd) {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u000e"}, d2 = {"Lcom/andrerinas/openheadunit/utils/SUExecutor$SUImplementation;", "", "name", "", "getName", "()Ljava/lang/String;", "checkPermission", "", "register", "", "runShell", "", "cmd", "unregister", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static abstract interface SUImplementation {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getName();
        
        public abstract void register();
        
        public abstract void unregister();
        
        public abstract boolean checkPermission();
        
        public abstract int runShell(@org.jetbrains.annotations.NotNull()
        java.lang.String cmd);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016R\u0015\u0010\u0004\u001a\u00060\u0005R\u00020\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lcom/andrerinas/openheadunit/utils/SUExecutor$ShizukuImpl;", "Lcom/andrerinas/openheadunit/utils/SUExecutor$SUImplementation;", "Lrikka/shizuku/Shizuku$OnRequestPermissionResultListener;", "()V", "connection", "Lcom/andrerinas/openheadunit/utils/SUExecutor$ShizukuImpl$ShizukuServiceConnection;", "getConnection", "()Lcom/andrerinas/openheadunit/utils/SUExecutor$ShizukuImpl$ShizukuServiceConnection;", "hasPermission", "", "getHasPermission", "()Z", "setHasPermission", "(Z)V", "name", "", "getName", "()Ljava/lang/String;", "checkPermission", "isShizukuGranted", "onRequestPermissionResult", "", "requestCode", "", "grantResult", "register", "runShell", "cmd", "unregister", "PrivilegedService", "ShizukuServiceConnection", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class ShizukuImpl implements com.andrerinas.openheadunit.utils.SUExecutor.SUImplementation, rikka.shizuku.Shizuku.OnRequestPermissionResultListener {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = "Shizuku";
        private boolean hasPermission = false;
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.utils.SUExecutor.ShizukuImpl.ShizukuServiceConnection connection = null;
        
        public ShizukuImpl() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String getName() {
            return null;
        }
        
        public final boolean getHasPermission() {
            return false;
        }
        
        public final void setHasPermission(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.utils.SUExecutor.ShizukuImpl.ShizukuServiceConnection getConnection() {
            return null;
        }
        
        private final boolean isShizukuGranted() {
            return false;
        }
        
        @java.lang.Override()
        public void register() {
        }
        
        @java.lang.Override()
        public void unregister() {
        }
        
        @java.lang.Override()
        public boolean checkPermission() {
            return false;
        }
        
        @java.lang.Override()
        public int runShell(@org.jetbrains.annotations.NotNull()
        java.lang.String cmd) {
            return 0;
        }
        
        @java.lang.Override()
        public void onRequestPermissionResult(int requestCode, int grantResult) {
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/utils/SUExecutor$ShizukuImpl$PrivilegedService;", "Lcom/andrerinas/openheadunit/IShizuku$Stub;", "()V", "execShell", "", "command", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        static final class PrivilegedService extends com.andrerinas.openheadunit.IShizuku.Stub {
            
            public PrivilegedService() {
                super();
            }
            
            @java.lang.Override()
            public int execShell(@org.jetbrains.annotations.NotNull()
            java.lang.String command) {
                return 0;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u001c\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0006\u0010\u0019\u001a\u00020\u0013R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Lcom/andrerinas/openheadunit/utils/SUExecutor$ShizukuImpl$ShizukuServiceConnection;", "Landroid/content/ServiceConnection;", "(Lcom/andrerinas/openheadunit/utils/SUExecutor$ShizukuImpl;)V", "args", "Lrikka/shizuku/Shizuku$UserServiceArgs;", "kotlin.jvm.PlatformType", "getArgs", "()Lrikka/shizuku/Shizuku$UserServiceArgs;", "args$delegate", "Lkotlin/Lazy;", "isBound", "", "service", "Lcom/andrerinas/openheadunit/IShizuku;", "getService", "()Lcom/andrerinas/openheadunit/IShizuku;", "setService", "(Lcom/andrerinas/openheadunit/IShizuku;)V", "bind", "", "onServiceConnected", "p0", "Landroid/content/ComponentName;", "Landroid/os/IBinder;", "onServiceDisconnected", "unbind", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        final class ShizukuServiceConnection implements android.content.ServiceConnection {
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy args$delegate = null;
            private boolean isBound = false;
            @org.jetbrains.annotations.Nullable()
            private com.andrerinas.openheadunit.IShizuku service;
            
            public ShizukuServiceConnection() {
                super();
            }
            
            private final rikka.shizuku.Shizuku.UserServiceArgs getArgs() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.andrerinas.openheadunit.IShizuku getService() {
                return null;
            }
            
            public final void setService(@org.jetbrains.annotations.Nullable()
            com.andrerinas.openheadunit.IShizuku p0) {
            }
            
            @java.lang.Override()
            public void onServiceConnected(@org.jetbrains.annotations.Nullable()
            android.content.ComponentName p0, @org.jetbrains.annotations.Nullable()
            android.os.IBinder service) {
            }
            
            @java.lang.Override()
            public void onServiceDisconnected(@org.jetbrains.annotations.Nullable()
            android.content.ComponentName p0) {
            }
            
            public final void bind() {
            }
            
            public final void unbind() {
            }
        }
    }
}