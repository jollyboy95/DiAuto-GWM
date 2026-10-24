package com.andrerinas.openheadunit.connection.carkey.fyt;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000e\u000f\u0010J9\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH&\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/connection/carkey/fyt/ModuleCallback;", "Landroid/os/IInterface;", "update", "", "updateCode", "", "ints", "", "floats", "", "strings", "", "", "(I[I[F[Ljava/lang/String;)V", "Companion", "Proxy", "Stub", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public abstract interface ModuleCallback extends android.os.IInterface {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DESCRIPTOR = "com.syu.ipc.IModuleCallback";
    public static final int TRANSACTION_UPDATE = 1;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.carkey.fyt.ModuleCallback.Companion Companion = null;
    
    public abstract void update(int updateCode, @org.jetbrains.annotations.Nullable()
    int[] ints, @org.jetbrains.annotations.Nullable()
    float[] floats, @org.jetbrains.annotations.Nullable()
    java.lang.String[] strings);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/connection/carkey/fyt/ModuleCallback$Companion;", "", "()V", "DESCRIPTOR", "", "TRANSACTION_UPDATE", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DESCRIPTOR = "com.syu.ipc.IModuleCallback";
        public static final int TRANSACTION_UPDATE = 1;
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016J9\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0016\u00a2\u0006\u0002\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/connection/carkey/fyt/ModuleCallback$Proxy;", "Lcom/andrerinas/openheadunit/connection/carkey/fyt/ModuleCallback;", "mRemote", "Landroid/os/IBinder;", "(Landroid/os/IBinder;)V", "getMRemote", "()Landroid/os/IBinder;", "asBinder", "update", "", "updateCode", "", "ints", "", "floats", "", "strings", "", "", "(I[I[F[Ljava/lang/String;)V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Proxy implements com.andrerinas.openheadunit.connection.carkey.fyt.ModuleCallback {
        @org.jetbrains.annotations.NotNull()
        private final android.os.IBinder mRemote = null;
        
        public Proxy(@org.jetbrains.annotations.NotNull()
        android.os.IBinder mRemote) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.IBinder getMRemote() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public android.os.IBinder asBinder() {
            return null;
        }
        
        @java.lang.Override()
        public void update(int updateCode, @org.jetbrains.annotations.Nullable()
        int[] ints, @org.jetbrains.annotations.Nullable()
        float[] floats, @org.jetbrains.annotations.Nullable()
        java.lang.String[] strings) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\tH\u0014\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/connection/carkey/fyt/ModuleCallback$Stub;", "Landroid/os/Binder;", "Lcom/andrerinas/openheadunit/connection/carkey/fyt/ModuleCallback;", "()V", "asBinder", "Landroid/os/IBinder;", "onTransact", "", "code", "", "data", "Landroid/os/Parcel;", "reply", "flags", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static abstract class Stub extends android.os.Binder implements com.andrerinas.openheadunit.connection.carkey.fyt.ModuleCallback {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.connection.carkey.fyt.ModuleCallback.Stub.Companion Companion = null;
        
        public Stub() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public android.os.IBinder asBinder() {
            return null;
        }
        
        @java.lang.Override()
        @kotlin.jvm.Throws(exceptionClasses = {android.os.RemoteException.class})
        protected boolean onTransact(int code, @org.jetbrains.annotations.NotNull()
        android.os.Parcel data, @org.jetbrains.annotations.Nullable()
        android.os.Parcel reply, int flags) throws android.os.RemoteException {
            return false;
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.connection.carkey.fyt.ModuleCallback asInterface(@org.jetbrains.annotations.NotNull()
        android.os.IBinder obj) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/connection/carkey/fyt/ModuleCallback$Stub$Companion;", "", "()V", "asInterface", "Lcom/andrerinas/openheadunit/connection/carkey/fyt/ModuleCallback;", "obj", "Landroid/os/IBinder;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @kotlin.jvm.JvmStatic()
            @org.jetbrains.annotations.NotNull()
            public final com.andrerinas.openheadunit.connection.carkey.fyt.ModuleCallback asInterface(@org.jetbrains.annotations.NotNull()
            android.os.IBinder obj) {
                return null;
            }
        }
    }
}