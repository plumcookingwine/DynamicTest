/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.morgoo.droidplugin.pm;
/**
 * Code by Andy Zhang (zhangyong232@gmail.com) on 2015/2/12.
 */
public interface IPluginManager extends android.os.IInterface
{
  /** Default implementation for IPluginManager. */
  public static class Default implements com.morgoo.droidplugin.pm.IPluginManager
  {
    //for my api

    @Override public boolean waitForReady() throws android.os.RemoteException
    {
      return false;
    }
    //////////////////////////////////////
    //
    //  THIS API FOR PACKAGE MANAGER
    //
    //////////////////////////////////////

    @Override public android.content.pm.PackageInfo getPackageInfo(java.lang.String packageName, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public boolean isPluginPackage(java.lang.String packageName) throws android.os.RemoteException
    {
      return false;
    }
    @Override public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.content.pm.ResolveInfo resolveIntent(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<android.content.pm.ResolveInfo> queryIntentReceivers(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.content.pm.ResolveInfo resolveService(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<android.content.pm.ResolveInfo> queryIntentServices(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<android.content.pm.ResolveInfo> queryIntentContentProviders(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<android.content.pm.PackageInfo> getInstalledPackages(int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<android.content.pm.ApplicationInfo> getInstalledApplications(int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String name, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<android.content.pm.PermissionInfo> queryPermissionsByGroup(java.lang.String group, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String name, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.content.pm.ProviderInfo resolveContentProvider(java.lang.String name, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void deleteApplicationCacheFiles(java.lang.String packageName, com.morgoo.droidplugin.pm.IPackageDataObserver observer) throws android.os.RemoteException
    {
    }
    @Override public void clearApplicationUserData(java.lang.String packageName, com.morgoo.droidplugin.pm.IPackageDataObserver observer) throws android.os.RemoteException
    {
    }
    @Override public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String packageName, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public int installPackage(java.lang.String filepath, int flags) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int deletePackage(java.lang.String packageName, int flags) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public java.util.List<android.content.pm.ActivityInfo> getReceivers(java.lang.String packageName, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<android.content.IntentFilter> getReceiverIntentFilter(android.content.pm.ActivityInfo info) throws android.os.RemoteException
    {
      return null;
    }
    @Override public int checkSignatures(java.lang.String pkg1, java.lang.String pkg2) throws android.os.RemoteException
    {
      return 0;
    }
    //////////////////////////////////////
    //
    //  THIS API FOR ACTIVITY MANAGER
    //
    //////////////////////////////////////

    @Override public android.content.pm.ActivityInfo selectStubActivityInfo(android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.content.pm.ActivityInfo selectStubActivityInfoByIntent(android.content.Intent targetIntent) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.content.pm.ServiceInfo selectStubServiceInfo(android.content.pm.ServiceInfo targetInfo) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.content.pm.ServiceInfo selectStubServiceInfoByIntent(android.content.Intent targetIntent) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.content.pm.ServiceInfo getTargetServiceInfo(android.content.pm.ServiceInfo stubInfo) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.content.pm.ProviderInfo selectStubProviderInfo(java.lang.String name) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<java.lang.String> getPackageNameByPid(int pid) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.lang.String getProcessNameByPid(int pid) throws android.os.RemoteException
    {
      return null;
    }
    @Override public boolean killBackgroundProcesses(java.lang.String packageName) throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean killApplicationProcess(java.lang.String pluginPackageName) throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean forceStopPackage(java.lang.String pluginPackageName) throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean registerApplicationCallback(com.morgoo.droidplugin.pm.IApplicationCallback callback) throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean unregisterApplicationCallback(com.morgoo.droidplugin.pm.IApplicationCallback callback) throws android.os.RemoteException
    {
      return false;
    }
    @Override public void onActivityCreated(android.content.pm.ActivityInfo stubInfo, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException
    {
    }
    @Override public void onActivityDestory(android.content.pm.ActivityInfo stubInfo, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException
    {
    }
    @Override public void onServiceCreated(android.content.pm.ServiceInfo stubInfo, android.content.pm.ServiceInfo targetInfo) throws android.os.RemoteException
    {
    }
    @Override public void onServiceDestory(android.content.pm.ServiceInfo stubInfo, android.content.pm.ServiceInfo targetInfo) throws android.os.RemoteException
    {
    }
    @Override public void onProviderCreated(android.content.pm.ProviderInfo stubInfo, android.content.pm.ProviderInfo targetInfo) throws android.os.RemoteException
    {
    }
    @Override public void reportMyProcessName(java.lang.String stubProcessName, java.lang.String targetProcessName, java.lang.String targetPkg) throws android.os.RemoteException
    {
    }
    @Override public void onActivtyOnNewIntent(android.content.pm.ActivityInfo stubInfo, android.content.pm.ActivityInfo targetInfo, android.content.Intent intent) throws android.os.RemoteException
    {
    }
    @Override public int getMyPid() throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.morgoo.droidplugin.pm.IPluginManager
  {
    private static final java.lang.String DESCRIPTOR = "com.morgoo.droidplugin.pm.IPluginManager";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.morgoo.droidplugin.pm.IPluginManager interface,
     * generating a proxy if needed.
     */
    public static com.morgoo.droidplugin.pm.IPluginManager asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.morgoo.droidplugin.pm.IPluginManager))) {
        return ((com.morgoo.droidplugin.pm.IPluginManager)iin);
      }
      return new com.morgoo.droidplugin.pm.IPluginManager.Stub.Proxy(obj);
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
        case TRANSACTION_waitForReady:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.waitForReady();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getPackageInfo:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.content.pm.PackageInfo _result = this.getPackageInfo(_arg0, _arg1);
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
        case TRANSACTION_isPluginPackage:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.isPluginPackage(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getActivityInfo:
        {
          data.enforceInterface(descriptor);
          android.content.ComponentName _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          android.content.pm.ActivityInfo _result = this.getActivityInfo(_arg0, _arg1);
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
        case TRANSACTION_getReceiverInfo:
        {
          data.enforceInterface(descriptor);
          android.content.ComponentName _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          android.content.pm.ActivityInfo _result = this.getReceiverInfo(_arg0, _arg1);
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
        case TRANSACTION_getServiceInfo:
        {
          data.enforceInterface(descriptor);
          android.content.ComponentName _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          android.content.pm.ServiceInfo _result = this.getServiceInfo(_arg0, _arg1);
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
        case TRANSACTION_getProviderInfo:
        {
          data.enforceInterface(descriptor);
          android.content.ComponentName _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          android.content.pm.ProviderInfo _result = this.getProviderInfo(_arg0, _arg1);
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
        case TRANSACTION_resolveIntent:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          android.content.pm.ResolveInfo _result = this.resolveIntent(_arg0, _arg1, _arg2);
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
        case TRANSACTION_queryIntentActivities:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          java.util.List<android.content.pm.ResolveInfo> _result = this.queryIntentActivities(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_queryIntentReceivers:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          java.util.List<android.content.pm.ResolveInfo> _result = this.queryIntentReceivers(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_resolveService:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          android.content.pm.ResolveInfo _result = this.resolveService(_arg0, _arg1, _arg2);
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
        case TRANSACTION_queryIntentServices:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          java.util.List<android.content.pm.ResolveInfo> _result = this.queryIntentServices(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_queryIntentContentProviders:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          java.util.List<android.content.pm.ResolveInfo> _result = this.queryIntentContentProviders(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_getInstalledPackages:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<android.content.pm.PackageInfo> _result = this.getInstalledPackages(_arg0);
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_getInstalledApplications:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<android.content.pm.ApplicationInfo> _result = this.getInstalledApplications(_arg0);
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_getPermissionInfo:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.content.pm.PermissionInfo _result = this.getPermissionInfo(_arg0, _arg1);
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
        case TRANSACTION_queryPermissionsByGroup:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          java.util.List<android.content.pm.PermissionInfo> _result = this.queryPermissionsByGroup(_arg0, _arg1);
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_getPermissionGroupInfo:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.content.pm.PermissionGroupInfo _result = this.getPermissionGroupInfo(_arg0, _arg1);
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
        case TRANSACTION_getAllPermissionGroups:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<android.content.pm.PermissionGroupInfo> _result = this.getAllPermissionGroups(_arg0);
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_resolveContentProvider:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.content.pm.ProviderInfo _result = this.resolveContentProvider(_arg0, _arg1);
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
        case TRANSACTION_deleteApplicationCacheFiles:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          com.morgoo.droidplugin.pm.IPackageDataObserver _arg1;
          _arg1 = com.morgoo.droidplugin.pm.IPackageDataObserver.Stub.asInterface(data.readStrongBinder());
          this.deleteApplicationCacheFiles(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_clearApplicationUserData:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          com.morgoo.droidplugin.pm.IPackageDataObserver _arg1;
          _arg1 = com.morgoo.droidplugin.pm.IPackageDataObserver.Stub.asInterface(data.readStrongBinder());
          this.clearApplicationUserData(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getApplicationInfo:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.content.pm.ApplicationInfo _result = this.getApplicationInfo(_arg0, _arg1);
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
        case TRANSACTION_installPackage:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.installPackage(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_deletePackage:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.deletePackage(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getReceivers:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          java.util.List<android.content.pm.ActivityInfo> _result = this.getReceivers(_arg0, _arg1);
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_getReceiverIntentFilter:
        {
          data.enforceInterface(descriptor);
          android.content.pm.ActivityInfo _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.util.List<android.content.IntentFilter> _result = this.getReceiverIntentFilter(_arg0);
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_checkSignatures:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _result = this.checkSignatures(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_selectStubActivityInfo:
        {
          data.enforceInterface(descriptor);
          android.content.pm.ActivityInfo _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.content.pm.ActivityInfo _result = this.selectStubActivityInfo(_arg0);
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
        case TRANSACTION_selectStubActivityInfoByIntent:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.content.pm.ActivityInfo _result = this.selectStubActivityInfoByIntent(_arg0);
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
        case TRANSACTION_selectStubServiceInfo:
        {
          data.enforceInterface(descriptor);
          android.content.pm.ServiceInfo _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.pm.ServiceInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.content.pm.ServiceInfo _result = this.selectStubServiceInfo(_arg0);
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
        case TRANSACTION_selectStubServiceInfoByIntent:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.content.pm.ServiceInfo _result = this.selectStubServiceInfoByIntent(_arg0);
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
        case TRANSACTION_getTargetServiceInfo:
        {
          data.enforceInterface(descriptor);
          android.content.pm.ServiceInfo _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.pm.ServiceInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.content.pm.ServiceInfo _result = this.getTargetServiceInfo(_arg0);
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
        case TRANSACTION_selectStubProviderInfo:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          android.content.pm.ProviderInfo _result = this.selectStubProviderInfo(_arg0);
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
        case TRANSACTION_getPackageNameByPid:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<java.lang.String> _result = this.getPackageNameByPid(_arg0);
          reply.writeNoException();
          reply.writeStringList(_result);
          return true;
        }
        case TRANSACTION_getProcessNameByPid:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _result = this.getProcessNameByPid(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_killBackgroundProcesses:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.killBackgroundProcesses(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_killApplicationProcess:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.killApplicationProcess(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_forceStopPackage:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.forceStopPackage(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_registerApplicationCallback:
        {
          data.enforceInterface(descriptor);
          com.morgoo.droidplugin.pm.IApplicationCallback _arg0;
          _arg0 = com.morgoo.droidplugin.pm.IApplicationCallback.Stub.asInterface(data.readStrongBinder());
          boolean _result = this.registerApplicationCallback(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_unregisterApplicationCallback:
        {
          data.enforceInterface(descriptor);
          com.morgoo.droidplugin.pm.IApplicationCallback _arg0;
          _arg0 = com.morgoo.droidplugin.pm.IApplicationCallback.Stub.asInterface(data.readStrongBinder());
          boolean _result = this.unregisterApplicationCallback(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_onActivityCreated:
        {
          data.enforceInterface(descriptor);
          android.content.pm.ActivityInfo _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.content.pm.ActivityInfo _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.onActivityCreated(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onActivityDestory:
        {
          data.enforceInterface(descriptor);
          android.content.pm.ActivityInfo _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.content.pm.ActivityInfo _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.onActivityDestory(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onServiceCreated:
        {
          data.enforceInterface(descriptor);
          android.content.pm.ServiceInfo _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.pm.ServiceInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.content.pm.ServiceInfo _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.content.pm.ServiceInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.onServiceCreated(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onServiceDestory:
        {
          data.enforceInterface(descriptor);
          android.content.pm.ServiceInfo _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.pm.ServiceInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.content.pm.ServiceInfo _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.content.pm.ServiceInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.onServiceDestory(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onProviderCreated:
        {
          data.enforceInterface(descriptor);
          android.content.pm.ProviderInfo _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.pm.ProviderInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.content.pm.ProviderInfo _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.content.pm.ProviderInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.onProviderCreated(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_reportMyProcessName:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          this.reportMyProcessName(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onActivtyOnNewIntent:
        {
          data.enforceInterface(descriptor);
          android.content.pm.ActivityInfo _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.content.pm.ActivityInfo _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          android.content.Intent _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.onActivtyOnNewIntent(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getMyPid:
        {
          data.enforceInterface(descriptor);
          int _result = this.getMyPid();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.morgoo.droidplugin.pm.IPluginManager
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
      //for my api

      @Override public boolean waitForReady() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_waitForReady, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().waitForReady();
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //////////////////////////////////////
      //
      //  THIS API FOR PACKAGE MANAGER
      //
      //////////////////////////////////////

      @Override public android.content.pm.PackageInfo getPackageInfo(java.lang.String packageName, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.PackageInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPackageInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPackageInfo(packageName, flags);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.PackageInfo.CREATOR.createFromParcel(_reply);
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
      @Override public boolean isPluginPackage(java.lang.String packageName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isPluginPackage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isPluginPackage(packageName);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.ActivityInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((className!=null)) {
            _data.writeInt(1);
            className.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getActivityInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getActivityInfo(className, flags);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.ActivityInfo.CREATOR.createFromParcel(_reply);
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
      @Override public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.ActivityInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((className!=null)) {
            _data.writeInt(1);
            className.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getReceiverInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getReceiverInfo(className, flags);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.ActivityInfo.CREATOR.createFromParcel(_reply);
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
      @Override public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.ServiceInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((className!=null)) {
            _data.writeInt(1);
            className.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getServiceInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getServiceInfo(className, flags);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.ServiceInfo.CREATOR.createFromParcel(_reply);
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
      @Override public android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.ProviderInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((className!=null)) {
            _data.writeInt(1);
            className.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getProviderInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getProviderInfo(className, flags);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.ProviderInfo.CREATOR.createFromParcel(_reply);
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
      @Override public android.content.pm.ResolveInfo resolveIntent(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.ResolveInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(resolvedType);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_resolveIntent, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().resolveIntent(intent, resolvedType, flags);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.ResolveInfo.CREATOR.createFromParcel(_reply);
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
      @Override public java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<android.content.pm.ResolveInfo> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(resolvedType);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_queryIntentActivities, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().queryIntentActivities(intent, resolvedType, flags);
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(android.content.pm.ResolveInfo.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<android.content.pm.ResolveInfo> queryIntentReceivers(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<android.content.pm.ResolveInfo> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(resolvedType);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_queryIntentReceivers, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().queryIntentReceivers(intent, resolvedType, flags);
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(android.content.pm.ResolveInfo.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.content.pm.ResolveInfo resolveService(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.ResolveInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(resolvedType);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_resolveService, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().resolveService(intent, resolvedType, flags);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.ResolveInfo.CREATOR.createFromParcel(_reply);
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
      @Override public java.util.List<android.content.pm.ResolveInfo> queryIntentServices(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<android.content.pm.ResolveInfo> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(resolvedType);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_queryIntentServices, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().queryIntentServices(intent, resolvedType, flags);
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(android.content.pm.ResolveInfo.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<android.content.pm.ResolveInfo> queryIntentContentProviders(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<android.content.pm.ResolveInfo> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(resolvedType);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_queryIntentContentProviders, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().queryIntentContentProviders(intent, resolvedType, flags);
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(android.content.pm.ResolveInfo.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<android.content.pm.PackageInfo> getInstalledPackages(int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<android.content.pm.PackageInfo> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getInstalledPackages, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getInstalledPackages(flags);
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(android.content.pm.PackageInfo.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<android.content.pm.ApplicationInfo> getInstalledApplications(int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<android.content.pm.ApplicationInfo> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getInstalledApplications, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getInstalledApplications(flags);
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(android.content.pm.ApplicationInfo.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String name, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.PermissionInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPermissionInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPermissionInfo(name, flags);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.PermissionInfo.CREATOR.createFromParcel(_reply);
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
      @Override public java.util.List<android.content.pm.PermissionInfo> queryPermissionsByGroup(java.lang.String group, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<android.content.pm.PermissionInfo> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(group);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_queryPermissionsByGroup, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().queryPermissionsByGroup(group, flags);
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(android.content.pm.PermissionInfo.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String name, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.PermissionGroupInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPermissionGroupInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPermissionGroupInfo(name, flags);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.PermissionGroupInfo.CREATOR.createFromParcel(_reply);
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
      @Override public java.util.List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<android.content.pm.PermissionGroupInfo> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAllPermissionGroups, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAllPermissionGroups(flags);
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(android.content.pm.PermissionGroupInfo.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.content.pm.ProviderInfo resolveContentProvider(java.lang.String name, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.ProviderInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_resolveContentProvider, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().resolveContentProvider(name, flags);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.ProviderInfo.CREATOR.createFromParcel(_reply);
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
      @Override public void deleteApplicationCacheFiles(java.lang.String packageName, com.morgoo.droidplugin.pm.IPackageDataObserver observer) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteApplicationCacheFiles, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().deleteApplicationCacheFiles(packageName, observer);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void clearApplicationUserData(java.lang.String packageName, com.morgoo.droidplugin.pm.IPackageDataObserver observer) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_clearApplicationUserData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().clearApplicationUserData(packageName, observer);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String packageName, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.ApplicationInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getApplicationInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getApplicationInfo(packageName, flags);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.ApplicationInfo.CREATOR.createFromParcel(_reply);
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
      @Override public int installPackage(java.lang.String filepath, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(filepath);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_installPackage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().installPackage(filepath, flags);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int deletePackage(java.lang.String packageName, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deletePackage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().deletePackage(packageName, flags);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<android.content.pm.ActivityInfo> getReceivers(java.lang.String packageName, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<android.content.pm.ActivityInfo> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getReceivers, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getReceivers(packageName, flags);
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(android.content.pm.ActivityInfo.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<android.content.IntentFilter> getReceiverIntentFilter(android.content.pm.ActivityInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<android.content.IntentFilter> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((info!=null)) {
            _data.writeInt(1);
            info.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getReceiverIntentFilter, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getReceiverIntentFilter(info);
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(android.content.IntentFilter.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int checkSignatures(java.lang.String pkg1, java.lang.String pkg2) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(pkg1);
          _data.writeString(pkg2);
          boolean _status = mRemote.transact(Stub.TRANSACTION_checkSignatures, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().checkSignatures(pkg1, pkg2);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //////////////////////////////////////
      //
      //  THIS API FOR ACTIVITY MANAGER
      //
      //////////////////////////////////////

      @Override public android.content.pm.ActivityInfo selectStubActivityInfo(android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.ActivityInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((targetInfo!=null)) {
            _data.writeInt(1);
            targetInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_selectStubActivityInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().selectStubActivityInfo(targetInfo);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.ActivityInfo.CREATOR.createFromParcel(_reply);
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
      @Override public android.content.pm.ActivityInfo selectStubActivityInfoByIntent(android.content.Intent targetIntent) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.ActivityInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((targetIntent!=null)) {
            _data.writeInt(1);
            targetIntent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_selectStubActivityInfoByIntent, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().selectStubActivityInfoByIntent(targetIntent);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.ActivityInfo.CREATOR.createFromParcel(_reply);
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
      @Override public android.content.pm.ServiceInfo selectStubServiceInfo(android.content.pm.ServiceInfo targetInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.ServiceInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((targetInfo!=null)) {
            _data.writeInt(1);
            targetInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_selectStubServiceInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().selectStubServiceInfo(targetInfo);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.ServiceInfo.CREATOR.createFromParcel(_reply);
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
      @Override public android.content.pm.ServiceInfo selectStubServiceInfoByIntent(android.content.Intent targetIntent) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.ServiceInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((targetIntent!=null)) {
            _data.writeInt(1);
            targetIntent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_selectStubServiceInfoByIntent, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().selectStubServiceInfoByIntent(targetIntent);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.ServiceInfo.CREATOR.createFromParcel(_reply);
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
      @Override public android.content.pm.ServiceInfo getTargetServiceInfo(android.content.pm.ServiceInfo stubInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.ServiceInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((stubInfo!=null)) {
            _data.writeInt(1);
            stubInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTargetServiceInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTargetServiceInfo(stubInfo);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.ServiceInfo.CREATOR.createFromParcel(_reply);
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
      @Override public android.content.pm.ProviderInfo selectStubProviderInfo(java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.pm.ProviderInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_selectStubProviderInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().selectStubProviderInfo(name);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.pm.ProviderInfo.CREATOR.createFromParcel(_reply);
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
      @Override public java.util.List<java.lang.String> getPackageNameByPid(int pid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPackageNameByPid, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPackageNameByPid(pid);
          }
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.lang.String getProcessNameByPid(int pid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getProcessNameByPid, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getProcessNameByPid(pid);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean killBackgroundProcesses(java.lang.String packageName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_killBackgroundProcesses, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().killBackgroundProcesses(packageName);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean killApplicationProcess(java.lang.String pluginPackageName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(pluginPackageName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_killApplicationProcess, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().killApplicationProcess(pluginPackageName);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean forceStopPackage(java.lang.String pluginPackageName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(pluginPackageName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_forceStopPackage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().forceStopPackage(pluginPackageName);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean registerApplicationCallback(com.morgoo.droidplugin.pm.IApplicationCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerApplicationCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().registerApplicationCallback(callback);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean unregisterApplicationCallback(com.morgoo.droidplugin.pm.IApplicationCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_unregisterApplicationCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().unregisterApplicationCallback(callback);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void onActivityCreated(android.content.pm.ActivityInfo stubInfo, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((stubInfo!=null)) {
            _data.writeInt(1);
            stubInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((targetInfo!=null)) {
            _data.writeInt(1);
            targetInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onActivityCreated, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onActivityCreated(stubInfo, targetInfo);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onActivityDestory(android.content.pm.ActivityInfo stubInfo, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((stubInfo!=null)) {
            _data.writeInt(1);
            stubInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((targetInfo!=null)) {
            _data.writeInt(1);
            targetInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onActivityDestory, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onActivityDestory(stubInfo, targetInfo);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onServiceCreated(android.content.pm.ServiceInfo stubInfo, android.content.pm.ServiceInfo targetInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((stubInfo!=null)) {
            _data.writeInt(1);
            stubInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((targetInfo!=null)) {
            _data.writeInt(1);
            targetInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onServiceCreated, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onServiceCreated(stubInfo, targetInfo);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onServiceDestory(android.content.pm.ServiceInfo stubInfo, android.content.pm.ServiceInfo targetInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((stubInfo!=null)) {
            _data.writeInt(1);
            stubInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((targetInfo!=null)) {
            _data.writeInt(1);
            targetInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onServiceDestory, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onServiceDestory(stubInfo, targetInfo);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onProviderCreated(android.content.pm.ProviderInfo stubInfo, android.content.pm.ProviderInfo targetInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((stubInfo!=null)) {
            _data.writeInt(1);
            stubInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((targetInfo!=null)) {
            _data.writeInt(1);
            targetInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onProviderCreated, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onProviderCreated(stubInfo, targetInfo);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void reportMyProcessName(java.lang.String stubProcessName, java.lang.String targetProcessName, java.lang.String targetPkg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(stubProcessName);
          _data.writeString(targetProcessName);
          _data.writeString(targetPkg);
          boolean _status = mRemote.transact(Stub.TRANSACTION_reportMyProcessName, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().reportMyProcessName(stubProcessName, targetProcessName, targetPkg);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onActivtyOnNewIntent(android.content.pm.ActivityInfo stubInfo, android.content.pm.ActivityInfo targetInfo, android.content.Intent intent) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((stubInfo!=null)) {
            _data.writeInt(1);
            stubInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((targetInfo!=null)) {
            _data.writeInt(1);
            targetInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onActivtyOnNewIntent, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onActivtyOnNewIntent(stubInfo, targetInfo, intent);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int getMyPid() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getMyPid, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getMyPid();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.morgoo.droidplugin.pm.IPluginManager sDefaultImpl;
    }
    static final int TRANSACTION_waitForReady = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getPackageInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_isPluginPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getActivityInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getReceiverInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getServiceInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getProviderInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_resolveIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_queryIntentActivities = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_queryIntentReceivers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_resolveService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_queryIntentServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_queryIntentContentProviders = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getInstalledPackages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_getInstalledApplications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_getPermissionInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_queryPermissionsByGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_getPermissionGroupInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_getAllPermissionGroups = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_resolveContentProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_deleteApplicationCacheFiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_clearApplicationUserData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_getApplicationInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_installPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_deletePackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_getReceivers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_getReceiverIntentFilter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_checkSignatures = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_selectStubActivityInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_selectStubActivityInfoByIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_selectStubServiceInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_selectStubServiceInfoByIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_getTargetServiceInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_selectStubProviderInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_getPackageNameByPid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_getProcessNameByPid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_killBackgroundProcesses = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_killApplicationProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_forceStopPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_registerApplicationCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
    static final int TRANSACTION_unregisterApplicationCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
    static final int TRANSACTION_onActivityCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
    static final int TRANSACTION_onActivityDestory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
    static final int TRANSACTION_onServiceCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
    static final int TRANSACTION_onServiceDestory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
    static final int TRANSACTION_onProviderCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
    static final int TRANSACTION_reportMyProcessName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
    static final int TRANSACTION_onActivtyOnNewIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
    static final int TRANSACTION_getMyPid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
    public static boolean setDefaultImpl(com.morgoo.droidplugin.pm.IPluginManager impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.morgoo.droidplugin.pm.IPluginManager getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  //for my api

  public boolean waitForReady() throws android.os.RemoteException;
  //////////////////////////////////////
  //
  //  THIS API FOR PACKAGE MANAGER
  //
  //////////////////////////////////////

  public android.content.pm.PackageInfo getPackageInfo(java.lang.String packageName, int flags) throws android.os.RemoteException;
  public boolean isPluginPackage(java.lang.String packageName) throws android.os.RemoteException;
  public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException;
  public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException;
  public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException;
  public android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException;
  public android.content.pm.ResolveInfo resolveIntent(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException;
  public java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException;
  public java.util.List<android.content.pm.ResolveInfo> queryIntentReceivers(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException;
  public android.content.pm.ResolveInfo resolveService(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException;
  public java.util.List<android.content.pm.ResolveInfo> queryIntentServices(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException;
  public java.util.List<android.content.pm.ResolveInfo> queryIntentContentProviders(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException;
  public java.util.List<android.content.pm.PackageInfo> getInstalledPackages(int flags) throws android.os.RemoteException;
  public java.util.List<android.content.pm.ApplicationInfo> getInstalledApplications(int flags) throws android.os.RemoteException;
  public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String name, int flags) throws android.os.RemoteException;
  public java.util.List<android.content.pm.PermissionInfo> queryPermissionsByGroup(java.lang.String group, int flags) throws android.os.RemoteException;
  public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String name, int flags) throws android.os.RemoteException;
  public java.util.List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int flags) throws android.os.RemoteException;
  public android.content.pm.ProviderInfo resolveContentProvider(java.lang.String name, int flags) throws android.os.RemoteException;
  public void deleteApplicationCacheFiles(java.lang.String packageName, com.morgoo.droidplugin.pm.IPackageDataObserver observer) throws android.os.RemoteException;
  public void clearApplicationUserData(java.lang.String packageName, com.morgoo.droidplugin.pm.IPackageDataObserver observer) throws android.os.RemoteException;
  public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String packageName, int flags) throws android.os.RemoteException;
  public int installPackage(java.lang.String filepath, int flags) throws android.os.RemoteException;
  public int deletePackage(java.lang.String packageName, int flags) throws android.os.RemoteException;
  public java.util.List<android.content.pm.ActivityInfo> getReceivers(java.lang.String packageName, int flags) throws android.os.RemoteException;
  public java.util.List<android.content.IntentFilter> getReceiverIntentFilter(android.content.pm.ActivityInfo info) throws android.os.RemoteException;
  public int checkSignatures(java.lang.String pkg1, java.lang.String pkg2) throws android.os.RemoteException;
  //////////////////////////////////////
  //
  //  THIS API FOR ACTIVITY MANAGER
  //
  //////////////////////////////////////

  public android.content.pm.ActivityInfo selectStubActivityInfo(android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException;
  public android.content.pm.ActivityInfo selectStubActivityInfoByIntent(android.content.Intent targetIntent) throws android.os.RemoteException;
  public android.content.pm.ServiceInfo selectStubServiceInfo(android.content.pm.ServiceInfo targetInfo) throws android.os.RemoteException;
  public android.content.pm.ServiceInfo selectStubServiceInfoByIntent(android.content.Intent targetIntent) throws android.os.RemoteException;
  public android.content.pm.ServiceInfo getTargetServiceInfo(android.content.pm.ServiceInfo stubInfo) throws android.os.RemoteException;
  public android.content.pm.ProviderInfo selectStubProviderInfo(java.lang.String name) throws android.os.RemoteException;
  public java.util.List<java.lang.String> getPackageNameByPid(int pid) throws android.os.RemoteException;
  public java.lang.String getProcessNameByPid(int pid) throws android.os.RemoteException;
  public boolean killBackgroundProcesses(java.lang.String packageName) throws android.os.RemoteException;
  public boolean killApplicationProcess(java.lang.String pluginPackageName) throws android.os.RemoteException;
  public boolean forceStopPackage(java.lang.String pluginPackageName) throws android.os.RemoteException;
  public boolean registerApplicationCallback(com.morgoo.droidplugin.pm.IApplicationCallback callback) throws android.os.RemoteException;
  public boolean unregisterApplicationCallback(com.morgoo.droidplugin.pm.IApplicationCallback callback) throws android.os.RemoteException;
  public void onActivityCreated(android.content.pm.ActivityInfo stubInfo, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException;
  public void onActivityDestory(android.content.pm.ActivityInfo stubInfo, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException;
  public void onServiceCreated(android.content.pm.ServiceInfo stubInfo, android.content.pm.ServiceInfo targetInfo) throws android.os.RemoteException;
  public void onServiceDestory(android.content.pm.ServiceInfo stubInfo, android.content.pm.ServiceInfo targetInfo) throws android.os.RemoteException;
  public void onProviderCreated(android.content.pm.ProviderInfo stubInfo, android.content.pm.ProviderInfo targetInfo) throws android.os.RemoteException;
  public void reportMyProcessName(java.lang.String stubProcessName, java.lang.String targetProcessName, java.lang.String targetPkg) throws android.os.RemoteException;
  public void onActivtyOnNewIntent(android.content.pm.ActivityInfo stubInfo, android.content.pm.ActivityInfo targetInfo, android.content.Intent intent) throws android.os.RemoteException;
  public int getMyPid() throws android.os.RemoteException;
}
