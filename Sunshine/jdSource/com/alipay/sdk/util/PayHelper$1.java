package com.alipay.sdk.util;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.alipay.android.app.IAlixPay.Stub;

class PayHelper$1
  implements ServiceConnection
{
  PayHelper$1(PayHelper paramPayHelper) {}
  
  public void onServiceConnected(ComponentName arg1, IBinder paramIBinder)
  {
    synchronized (PayHelper.a(this.a))
    {
      PayHelper.a(this.a, IAlixPay.Stub.asInterface(paramIBinder));
      PayHelper.a(this.a).notify();
      return;
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    PayHelper.a(this.a, null);
  }
}


/* Location:              /Users/makito/Apktool/sunshine_app.apk/classes-dex2jar.jar!/com/alipay/sdk/util/PayHelper$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */