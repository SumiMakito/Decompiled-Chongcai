import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import cn.apppark.ckj10185912.HQCHApplication;
import cn.apppark.ckj10185912.Main;
import cn.apppark.vertify.activity.free.dyn.DynMsgDetail;
import cn.apppark.vertify.activity.free.dyn.SMsgBase;
import java.io.Serializable;
import java.util.ArrayList;

public final class kv
  implements AdapterView.OnItemClickListener
{
  public kv(SMsgBase paramSMsgBase) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = new Intent(HQCHApplication.mainActivity, DynMsgDetail.class);
    paramAdapterView.putExtra("type", 2);
    paramView = new Bundle();
    paramView.putSerializable("vo", (Serializable)SMsgBase.a(this.a).get(paramInt - 1));
    paramAdapterView.putExtra("bund", paramView);
    HQCHApplication.mainActivity.startActivity(paramAdapterView);
  }
}


/* Location:              /Users/makito/Apktool/sunshine_app.apk/classes-dex2jar.jar!/kv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */