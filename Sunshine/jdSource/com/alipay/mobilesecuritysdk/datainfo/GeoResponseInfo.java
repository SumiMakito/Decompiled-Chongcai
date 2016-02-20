package com.alipay.mobilesecuritysdk.datainfo;

public class GeoResponseInfo
{
  private int appInterval;
  private boolean isSuccess;
  private int locateInterval;
  private int locationMaxLines;
  private int mainSwitchInterval;
  private String mainSwitchState;
  
  public int getAppInterval()
  {
    return this.appInterval;
  }
  
  public int getLocateInterval()
  {
    return this.locateInterval;
  }
  
  public int getLocationMaxLines()
  {
    return this.locationMaxLines;
  }
  
  public int getMainSwitchInterval()
  {
    return this.mainSwitchInterval;
  }
  
  public String getMainSwitchState()
  {
    return this.mainSwitchState;
  }
  
  public boolean isSuccess()
  {
    return this.isSuccess;
  }
  
  public void setAppInterval(int paramInt)
  {
    this.appInterval = paramInt;
  }
  
  public void setLocateInterval(int paramInt)
  {
    this.locateInterval = paramInt;
  }
  
  public void setLocationMaxLines(int paramInt)
  {
    this.locationMaxLines = paramInt;
  }
  
  public void setMainSwitchInterval(int paramInt)
  {
    this.mainSwitchInterval = paramInt;
  }
  
  public void setMainSwitchState(String paramString)
  {
    this.mainSwitchState = paramString;
  }
  
  public void setSuccess(boolean paramBoolean)
  {
    this.isSuccess = paramBoolean;
  }
}


/* Location:              /Users/makito/Apktool/sunshine_app.apk/classes-dex2jar.jar!/com/alipay/mobilesecuritysdk/datainfo/GeoResponseInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */