package com.sina.weibo.sdk.api.share;

import android.content.Context;
import android.text.TextUtils;
import com.sina.weibo.sdk.WeiboAppManager;
import com.sina.weibo.sdk.WeiboAppManager.WeiboInfo;
import com.sina.weibo.sdk.api.CmdObject;
import com.sina.weibo.sdk.api.VoiceObject;
import com.sina.weibo.sdk.api.WeiboMessage;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.utils.LogUtil;

public class VersionCheckHandler
  implements IVersionCheckHandler
{
  private static final String TAG = VersionCheckHandler.class.getName();
  
  public boolean checkRequest(Context paramContext, WeiboAppManager.WeiboInfo paramWeiboInfo, WeiboMessage paramWeiboMessage)
  {
    if ((paramWeiboInfo == null) || (!paramWeiboInfo.isLegal())) {
      return false;
    }
    LogUtil.d(TAG, "WeiboMessage WeiboInfo package : " + paramWeiboInfo.getPackageName());
    LogUtil.d(TAG, "WeiboMessage WeiboInfo supportApi : " + paramWeiboInfo.getSupportApi());
    if ((paramWeiboInfo.getSupportApi() < 10351) && (paramWeiboMessage.mediaObject != null) && ((paramWeiboMessage.mediaObject instanceof VoiceObject))) {
      paramWeiboMessage.mediaObject = null;
    }
    if ((paramWeiboInfo.getSupportApi() < 10352) && (paramWeiboMessage.mediaObject != null) && ((paramWeiboMessage.mediaObject instanceof CmdObject))) {
      paramWeiboMessage.mediaObject = null;
    }
    return true;
  }
  
  public boolean checkRequest(Context paramContext, WeiboAppManager.WeiboInfo paramWeiboInfo, WeiboMultiMessage paramWeiboMultiMessage)
  {
    if ((paramWeiboInfo == null) || (!paramWeiboInfo.isLegal())) {}
    do
    {
      return false;
      LogUtil.d(TAG, "WeiboMultiMessage WeiboInfo package : " + paramWeiboInfo.getPackageName());
      LogUtil.d(TAG, "WeiboMultiMessage WeiboInfo supportApi : " + paramWeiboInfo.getSupportApi());
    } while (paramWeiboInfo.getSupportApi() < 10351);
    if ((paramWeiboInfo.getSupportApi() < 10352) && (paramWeiboMultiMessage.mediaObject != null) && ((paramWeiboMultiMessage.mediaObject instanceof CmdObject))) {
      paramWeiboMultiMessage.mediaObject = null;
    }
    return true;
  }
  
  public boolean checkResponse(Context paramContext, String paramString, WeiboMessage paramWeiboMessage)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    return checkRequest(paramContext, WeiboAppManager.getInstance(paramContext).parseWeiboInfoByAsset(paramString), paramWeiboMessage);
  }
  
  public boolean checkResponse(Context paramContext, String paramString, WeiboMultiMessage paramWeiboMultiMessage)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    return checkRequest(paramContext, WeiboAppManager.getInstance(paramContext).parseWeiboInfoByAsset(paramString), paramWeiboMultiMessage);
  }
}


/* Location:              /Users/makito/Apktool/sunshine_app.apk/classes-dex2jar.jar!/com/sina/weibo/sdk/api/share/VersionCheckHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */