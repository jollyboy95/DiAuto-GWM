/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /usr/local/lib/android/sdk/build-tools/35.0.0/aidl -p/usr/local/lib/android/sdk/platforms/android-36/framework.aidl -o/home/runner/work/DiAuto-GWM/DiAuto-GWM/app/build/generated/aidl_source_output_dir/githubDebug/out -I/home/runner/work/DiAuto-GWM/DiAuto-GWM/app/src/main/aidl -I/home/runner/work/DiAuto-GWM/DiAuto-GWM/app/src/github/aidl -I/home/runner/work/DiAuto-GWM/DiAuto-GWM/app/src/debug/aidl -I/home/runner/work/DiAuto-GWM/DiAuto-GWM/app/src/githubDebug/aidl -I/home/runner/.gradle/caches/8.13/transforms/77d7e03f967b332152bfd89421c89918/transformed/media-1.6.0/aidl -I/home/runner/.gradle/caches/8.13/transforms/9f15916e77145aeb64057184f98ba8d7/transformed/core-1.12.0/aidl -I/home/runner/.gradle/caches/8.13/transforms/7a278e795645ba663b28b36f34b56f07/transformed/versionedparcelable-1.1.1/aidl -d/tmp/aidl2429707965924165807.d /home/runner/work/DiAuto-GWM/DiAuto-GWM/app/src/main/aidl/com/andrerinas/openheadunit/IShizuku.aidl
 */
package com.andrerinas.openheadunit;
public interface IShizuku extends android.os.IInterface
{
  /** Default implementation for IShizuku. */
  public static class Default implements com.andrerinas.openheadunit.IShizuku
  {
    @Override public int execShell(java.lang.String command) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.andrerinas.openheadunit.IShizuku
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.andrerinas.openheadunit.IShizuku interface,
     * generating a proxy if needed.
     */
    public static com.andrerinas.openheadunit.IShizuku asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.andrerinas.openheadunit.IShizuku))) {
        return ((com.andrerinas.openheadunit.IShizuku)iin);
      }
      return new com.andrerinas.openheadunit.IShizuku.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      if (code == INTERFACE_TRANSACTION) {
        reply.writeString(descriptor);
        return true;
      }
      switch (code)
      {
        case TRANSACTION_execShell:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.execShell(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.andrerinas.openheadunit.IShizuku
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public int execShell(java.lang.String command) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(command);
          boolean _status = mRemote.transact(Stub.TRANSACTION_execShell, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_execShell = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "com.andrerinas.openheadunit.IShizuku";
  public int execShell(java.lang.String command) throws android.os.RemoteException;
}
