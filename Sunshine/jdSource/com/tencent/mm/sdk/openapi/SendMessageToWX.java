package com.tencent.mm.sdk.openapi;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.Log;

public class SendMessageToWX
{
  public static class Req
    extends BaseReq
  {
    public static final int WXSceneSession = 0;
    public static final int WXSceneTimeline = 1;
    public WXMediaMessage message;
    public int scene;
    
    public Req() {}
    
    public Req(Bundle paramBundle)
    {
      fromBundle(paramBundle);
    }
    
    final boolean checkArgs()
    {
      if (this.message == null)
      {
        Log.e("MicroMsg.SDK.SendMessageToWX.Req", "checkArgs fail ,message is null");
        return false;
      }
      return this.message.checkArgs();
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      super.fromBundle(paramBundle);
      this.message = WXMediaMessage.Builder.fromBundle(paramBundle);
      this.scene = paramBundle.getInt("_wxapi_sendmessagetowx_req_scene");
    }
    
    public int getType()
    {
      return 2;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      super.toBundle(paramBundle);
      paramBundle.putAll(WXMediaMessage.Builder.toBundle(this.message));
      paramBundle.putInt("_wxapi_sendmessagetowx_req_scene", this.scene);
    }
  }
  
  public static class Resp
    extends BaseResp
  {
    public Resp() {}
    
    public Resp(Bundle paramBundle)
    {
      fromBundle(paramBundle);
    }
    
    final boolean checkArgs()
    {
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      super.fromBundle(paramBundle);
    }
    
    public int getType()
    {
      return 2;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      super.toBundle(paramBundle);
    }
  }
}


/* Location:              /Users/makito/Apktool/sunshine_app.apk/classes-dex2jar.jar!/com/tencent/mm/sdk/openapi/SendMessageToWX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */