/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.morgoo.droidplugin.pm;
/**
 * API for package data change related callbacks from the Package Manager.
 * Some usage scenarios include deletion of cache directory, generate
 * statistics related to code, data, cache usage
 */
public interface IPackageDataObserver extends android.os.IInterface
{
  /** Default implementation for IPackageDataObserver. */
  public static class Default implements com.morgoo.droidplugin.pm.IPackageDataObserver
  {
    @Override public void onRemoveCompleted(java.lang.String packageName, boolean succeeded) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.morgoo.droidplugin.pm.IPackageDataObserver
  {
    private static final java.lang.String DESCRIPTOR = "com.morgoo.droidplugin.pm.IPackageDataObserver";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.morgoo.droidplugin.pm.IPackageDataObserver interface,
     * generating a proxy if needed.
     */
    public static com.morgoo.droidplugin.pm.IPackageDataObserver asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.morgoo.droidplugin.pm.IPackageDataObserver))) {
        return ((com.morgoo.droidplugin.pm.IPackageDataObserver)iin);
      }
      return new com.morgoo.droidplugin.pm.IPackageDataObserver.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_onRemoveCompleted:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.onRemoveCompleted(_arg0, _arg1);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.morgoo.droidplugin.pm.IPackageDataObserver
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
      @Override public void onRemoveCompleted(java.lang.String packageName, boolean succeeded) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeInt(((succeeded)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRemoveCompleted, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onRemoveCompleted(packageName, succeeded);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.morgoo.droidplugin.pm.IPackageDataObserver sDefaultImpl;
    }
    static final int TRANSACTION_onRemoveCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(com.morgoo.droidplugin.pm.IPackageDataObserver impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.morgoo.droidplugin.pm.IPackageDataObserver getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void onRemoveCompleted(java.lang.String packageName, boolean succeeded) throws android.os.RemoteException;
}
