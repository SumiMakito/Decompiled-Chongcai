package cn.apppark.vertify.activity.free.self;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.SeekBar;
import cn.apppark.mcd.widget.Mp4VideoView;

class Mp4PlayerActivity$7
  implements View.OnClickListener
{
  Mp4PlayerActivity$7(Mp4PlayerActivity paramMp4PlayerActivity) {}
  
  public void onClick(View paramView)
  {
    if (Mp4PlayerActivity.g(this.a)) {
      if (Mp4PlayerActivity.h(this.a).getProgress() - this.a.a < 0) {
        break label62;
      }
    }
    label62:
    for (int i = Mp4PlayerActivity.h(this.a).getProgress() - this.a.a;; i = 0)
    {
      Mp4PlayerActivity.b(this.a).seekTo(i);
      return;
    }
  }
}


/* Location:              /Users/makito/Apktool/sunshine_app.apk/classes-dex2jar.jar!/cn/apppark/vertify/activity/free/self/Mp4PlayerActivity$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */