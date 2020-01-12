/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.morgoo.droidplugin.pm;
/**
 * API for package data change related callbacks from the Package Manager.
 * Some usage scenarios include deletion of cache directory, generate
 * statistics related to code, data, cache usage
 * {@hide}
 */
public interface IApplicationCallback extends android.os.IInterface
{
  /** Default implementation for IApplicationCallback. */
  public static class Default implements com.morgoo.droidplugin.pm.IApplicationCallback
  {
    @Override public android.os.Bundle onCallback(android.os.Bundle extra) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.morgoo.droidplugin.pm.IApplicationCallback
  {
    private static final java.lang.String DESCRIPTOR = "com.morgoo.droidplugin.pm.IApplicationCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.morgoo.droidplugin.pm.IApplicationCallback interface,
     * generating a proxy if needed.
     */
    public static com.morgoo.droidplugin.pm.IApplicationCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.morgoo.droidplugin.pm.IApplicationCallback))) {
        return ((com.morgoo.droidplugin.pm.IApplicationCallback)iin);
      }
      return new com.morgoo.droidplugin.pm.IApplicationCallback.Stub.Proxy(obj);
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
        case TRANSACTION_onCallback:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.os.Bundle _result = this.onCallback(_arg0);
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.morgoo.droidplugin.pm.IApplicationCallback
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
      @Override public android.os.Bundle onCallback(android.os.Bundle extra) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((extra!=null)) {
            _data.writeInt(1);
            extra.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().onCallback(extra);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.os.Bundle.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.morgoo.droidplugin.pm.IApplicationCallback sDefaultImpl;
    }
    static final int TRANSACTION_onCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(com.morgoo.droidplugin.pm.IApplicationCallback impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.morgoo.droidplugin.pm.IApplicationCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public android.os.Bundle onCallback(android.os.Bundle extra) throws android.os.RemoteException;
}
