package com.alipay.sdk.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.alipay.sdk.cons.GlobalConstants;
import com.alipay.sdk.data.FrameUtils;
import com.alipay.sdk.data.InteractionData;
import com.alipay.sdk.data.Request;
import com.alipay.sdk.exception.AppErrorException;
import com.alipay.sdk.exception.FailOperatingException;
import com.alipay.sdk.exception.NetErrorException;
import com.alipay.sdk.exception.UnZipException;
import com.alipay.sdk.net.RequestWrapper;
import com.alipay.sdk.protocol.ActionType;
import com.alipay.sdk.protocol.ElementAction;
import com.alipay.sdk.protocol.FrameData;
import com.alipay.sdk.util.ActionUtil;
import com.alipay.sdk.util.FileDownloader;
import com.alipay.sdk.util.PayHelper;
import com.alipay.sdk.widget.Loading;
import java.io.File;
import org.json.JSONObject;

public class PayTask
{
  static final Object a = PayHelper.class;
  private Activity b;
  private String c;
  private Dialog d;
  private FileDownloader e;
  private Handler f;
  private String g;
  private boolean h;
  private String i;
  private Runnable j = new PayTask.4(this);
  private BroadcastReceiver k = new PayTask.5(this);
  
  public PayTask(Activity paramActivity)
  {
    this.b = paramActivity;
  }
  
  private String a()
  {
    if (GlobalConstants.n)
    {
      if (!this.c.startsWith("https://wappaygw.alipay.com/home/exterfaceAssign.htm?")) {
        break label74;
      }
      this.c = this.c.substring(this.c.indexOf("https://wappaygw.alipay.com/home/exterfaceAssign.htm?") + 53);
    }
    PayHelper localPayHelper;
    for (;;)
    {
      localPayHelper = new PayHelper(this.b);
      if (!this.c.contains("bizcontext=")) {
        break;
      }
      return localPayHelper.a(this.c);
      label74:
      if (this.c.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm?")) {
        this.c = this.c.substring(this.c.indexOf("https://mclient.alipay.com/home/exterfaceAssign.htm?") + 52);
      } else if (this.c.startsWith("http://mcashier.stable.alipay.net/home/exterfaceAssign.htm?")) {
        this.c = this.c.substring(this.c.indexOf("http://mcashier.stable.alipay.net/home/exterfaceAssign.htm?") + 59);
      } else if (this.c.startsWith("http://mobileclientgw.stable.alipay.net/home/exterfaceAssign.htm?")) {
        this.c = this.c.substring(this.c.indexOf("http://mobileclientgw.stable.alipay.net/home/exterfaceAssign.htm?") + 65);
      }
    }
    if (this.c.contains("\"")) {
      return localPayHelper.a(this.c + "&bizcontext=\"{\"appkey\":\"2014052600006128\"}\"");
    }
    return localPayHelper.a(this.c + "&bizcontext={\"appkey\":\"2014052600006128\"}");
  }
  
  private String a(ActionType arg1)
  {
    ??? = ActionUtil.a(???.e());
    Object localObject1 = new Intent(this.b, H5PayActivity.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("url", ???[0]);
    if (???.length == 2) {
      localBundle.putString("cookie", ???[1]);
    }
    ((Intent)localObject1).putExtras(localBundle);
    this.b.startActivity((Intent)localObject1);
    try
    {
      synchronized (a)
      {
        a.wait();
        localObject1 = Result.a();
        ??? = (ActionType)localObject1;
        if (TextUtils.isEmpty((CharSequence)localObject1)) {
          ??? = Result.b();
        }
        return (String)???;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  private void a(String paramString1, String paramString2, String paramString3, ActionType[] paramArrayOfActionType1, String paramString4, ActionType[] paramArrayOfActionType2)
  {
    this.b.runOnUiThread(new PayTask.1(this, paramArrayOfActionType1, paramArrayOfActionType2, paramString1, paramString2, paramString3, paramString4));
  }
  
  private void a(ActionType[] paramArrayOfActionType)
  {
    int n = paramArrayOfActionType.length;
    int m = 0;
    for (;;)
    {
      if (m < n)
      {
        ??? = paramArrayOfActionType[m];
        if (??? == ActionType.b)
        {
          this.g = ActionUtil.a(???.e())[0];
          c();
        }
        if (??? == ActionType.g) {
          synchronized (a)
          {
            Result.a(Result.b());
          }
        }
      }
      try
      {
        a.notify();
        m += 1;
        continue;
        paramArrayOfActionType = finally;
        throw paramArrayOfActionType;
        return;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  private String b()
  {
    int n = 0;
    try
    {
      if ((this.b != null) && (!this.b.isFinishing()))
      {
        Loading localLoading = new Loading(this.b);
        localLoading.b();
        if (GlobalConstants.n)
        {
          if (this.c.startsWith("https://wappaygw.alipay.com/home/exterfaceAssign.htm?")) {
            this.c = this.c.substring(this.c.indexOf("https://wappaygw.alipay.com/home/exterfaceAssign.htm?") + 53);
          }
        }
        else
        {
          localObject2 = FrameUtils.a(new InteractionData(), this.c, new JSONObject());
          localRequestWrapper = new RequestWrapper(new InteractionData());
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          RequestWrapper localRequestWrapper;
          localObject2 = ActionType.a(ElementAction.a(localRequestWrapper.a(this.b, (Request)localObject2, false).c().optJSONObject("form"), "onload"));
          int i1 = localObject2.length;
          int m = 0;
          if (m < i1)
          {
            localRequestWrapper = localObject2[m];
            if (localRequestWrapper == ActionType.f) {
              ActionUtil.b(localRequestWrapper.e());
            }
            m += 1;
            continue;
            localException = localException;
            localObject1 = null;
            continue;
            if (this.c.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm?"))
            {
              this.c = this.c.substring(this.c.indexOf("https://mclient.alipay.com/home/exterfaceAssign.htm?") + 52);
              continue;
            }
            if (this.c.startsWith("http://mcashier.stable.alipay.net/home/exterfaceAssign.htm?"))
            {
              this.c = this.c.substring(this.c.indexOf("http://mcashier.stable.alipay.net/home/exterfaceAssign.htm?") + 59);
              GlobalConstants.b = "https://mobiletestabc.alipaydev.com/mobileclientgw/stable/gateway.do";
              continue;
            }
            if (!this.c.startsWith("http://mobileclientgw.stable.alipay.net/home/exterfaceAssign.htm?")) {
              continue;
            }
            this.c = this.c.substring(this.c.indexOf("http://mobileclientgw.stable.alipay.net/home/exterfaceAssign.htm?") + 65);
            GlobalConstants.b = "https://mobiletestabc.alipaydev.com/mobileclientgw/stable/gateway.do";
            continue;
          }
          if (localObject1 != null) {
            ((Loading)localObject1).c();
          }
          i1 = localObject2.length;
          m = n;
          if (m < i1)
          {
            localRequestWrapper = localObject2[m];
            if (localRequestWrapper == ActionType.a)
            {
              localObject2 = a(localRequestWrapper);
              return (String)localObject2;
            }
            if (localRequestWrapper == ActionType.d)
            {
              this.f = new Handler(this.b.getMainLooper());
              this.i = (this.b.getCacheDir().getAbsolutePath() + "/temp.apk");
              localObject2 = b(localRequestWrapper);
              return (String)localObject2;
            }
            m += 1;
            continue;
          }
          if (localObject1 == null) {
            break label613;
          }
          ((Loading)localObject1).c();
          localObject1 = null;
        }
        catch (NetErrorException localNetErrorException)
        {
          Object localObject2;
          ResultStatus localResultStatus = ResultStatus.a(ResultStatus.d.a());
          if (localObject1 == null) {
            break label619;
          }
          ((Loading)localObject1).c();
          localObject1 = localResultStatus;
          continue;
        }
        catch (FailOperatingException localFailOperatingException)
        {
          if (localObject1 == null) {
            break label613;
          }
          ((Loading)localObject1).c();
          localObject1 = null;
          continue;
        }
        catch (AppErrorException localAppErrorException)
        {
          if (localObject1 == null) {
            break label613;
          }
          ((Loading)localObject1).c();
          localObject1 = null;
          continue;
        }
        catch (UnZipException localUnZipException)
        {
          if (localObject1 == null) {
            break label613;
          }
          ((Loading)localObject1).c();
          localObject1 = null;
          continue;
        }
        finally
        {
          if (localObject1 == null) {
            continue;
          }
          ((Loading)localObject1).c();
        }
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = ResultStatus.a(ResultStatus.b.a());
        }
        return Result.a(((ResultStatus)localObject2).a(), ((ResultStatus)localObject2).b(), "");
        label613:
        Object localObject1 = null;
        continue;
        label619:
        localObject1 = localObject3;
        continue;
        localObject1 = null;
      }
    }
  }
  
  private String b(ActionType arg1)
  {
    Object localObject2 = ActionUtil.a(???.e());
    if ((localObject2.length > 4) && (!TextUtils.isEmpty(localObject2[4]))) {}
    String str1;
    for (ActionType[] arrayOfActionType = ActionType.a(ElementAction.a(localObject2[4], ???));; str1 = null)
    {
      if ((localObject2.length > 5) && (!TextUtils.isEmpty(localObject2[5]))) {}
      for (??? = ActionType.a(ElementAction.a(localObject2[5], ???));; ??? = null)
      {
        String str2 = localObject2[0];
        String str3 = localObject2[1];
        String str4 = localObject2[2];
        localObject2 = localObject2[3];
        this.b.runOnUiThread(new PayTask.1(this, arrayOfActionType, ???, str2, str3, str4, (String)localObject2));
        do
        {
          synchronized (a)
          {
            try
            {
              a.wait();
              if (this.h)
              {
                ??? = a();
                return (String)???;
              }
            }
            catch (InterruptedException localInterruptedException)
            {
              for (;;)
              {
                localInterruptedException.printStackTrace();
              }
            }
          }
          str1 = Result.a();
          ??? = str1;
        } while (!TextUtils.isEmpty(str1));
        return Result.b();
      }
    }
  }
  
  private void c()
  {
    Object localObject = new Loading(this.b);
    ((Loading)localObject).a("正在下载中", true, new PayTask.2(this, (Loading)localObject));
    this.e = new FileDownloader();
    this.e.a(this.g);
    this.e.b(this.i);
    this.e.a(new PayTask.3(this, (Loading)localObject));
    this.e.b();
    localObject = new IntentFilter();
    ((IntentFilter)localObject).addAction("android.intent.action.PACKAGE_ADDED");
    ((IntentFilter)localObject).addDataScheme("package");
    this.b.registerReceiver(this.k, (IntentFilter)localObject);
    this.f.postDelayed(this.j, 180000L);
  }
  
  private void d()
  {
    PayTask.6 local6 = new PayTask.6(this);
    this.f.post(local6);
  }
  
  public boolean checkAccountIfExist()
  {
    Request localRequest = FrameUtils.a();
    try
    {
      boolean bool = new RequestWrapper().a(this.b, localRequest, true).c().optBoolean("hasAccount", false);
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  public String getVersion()
  {
    return "9.1.8";
  }
  
  /* Error */
  public String pay(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield 61	com/alipay/sdk/app/PayTask:c	Ljava/lang/String;
    //   7: invokestatic 400	com/alipay/sdk/sys/GlobalContext:a	()Lcom/alipay/sdk/sys/GlobalContext;
    //   10: aload_0
    //   11: getfield 49	com/alipay/sdk/app/PayTask:b	Landroid/app/Activity;
    //   14: invokestatic 405	com/alipay/sdk/data/MspConfig:a	()Lcom/alipay/sdk/data/MspConfig;
    //   17: invokevirtual 408	com/alipay/sdk/sys/GlobalContext:a	(Landroid/content/Context;Lcom/alipay/sdk/data/MspConfig;)V
    //   20: aload_0
    //   21: getfield 61	com/alipay/sdk/app/PayTask:c	Ljava/lang/String;
    //   24: ldc_w 410
    //   27: invokevirtual 85	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   30: ifeq +7 -> 37
    //   33: iconst_1
    //   34: putstatic 59	com/alipay/sdk/cons/GlobalConstants:n	Z
    //   37: aload_1
    //   38: ldc_w 412
    //   41: invokevirtual 85	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   44: ifeq +12 -> 56
    //   47: aload_0
    //   48: invokespecial 413	com/alipay/sdk/app/PayTask:b	()Ljava/lang/String;
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: areturn
    //   56: aload_0
    //   57: getfield 49	com/alipay/sdk/app/PayTask:b	Landroid/app/Activity;
    //   60: invokestatic 418	com/alipay/sdk/util/Utils:b	(Landroid/content/Context;)Z
    //   63: ifeq +42 -> 105
    //   66: aload_0
    //   67: invokespecial 320	com/alipay/sdk/app/PayTask:a	()Ljava/lang/String;
    //   70: astore_2
    //   71: aload_2
    //   72: ldc_w 420
    //   75: invokestatic 424	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   78: ifeq +11 -> 89
    //   81: aload_0
    //   82: invokespecial 413	com/alipay/sdk/app/PayTask:b	()Ljava/lang/String;
    //   85: astore_1
    //   86: goto -34 -> 52
    //   89: aload_2
    //   90: astore_1
    //   91: aload_2
    //   92: invokestatic 162	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   95: ifeq -43 -> 52
    //   98: invokestatic 164	com/alipay/sdk/app/Result:b	()Ljava/lang/String;
    //   101: astore_1
    //   102: goto -50 -> 52
    //   105: aload_0
    //   106: invokespecial 413	com/alipay/sdk/app/PayTask:b	()Ljava/lang/String;
    //   109: astore_1
    //   110: goto -58 -> 52
    //   113: astore_1
    //   114: aload_0
    //   115: monitorexit
    //   116: aload_1
    //   117: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	this	PayTask
    //   0	118	1	paramString	String
    //   70	22	2	str	String
    // Exception table:
    //   from	to	target	type
    //   2	37	113	finally
    //   37	52	113	finally
    //   56	86	113	finally
    //   91	102	113	finally
    //   105	110	113	finally
  }
}


/* Location:              /Users/makito/Apktool/sunshine_app.apk/classes-dex2jar.jar!/com/alipay/sdk/app/PayTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */