import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import cn.apppark.ckj10185912.HQCHApplication;
import cn.apppark.ckj10185912.Main;
import cn.apppark.mcd.vo.base.FreePageVo;
import cn.apppark.mcd.vo.free.SelfListViewItem2Vo;
import cn.apppark.vertify.PageGroup;
import cn.apppark.vertify.activity.free.typelist.SelfListView4003;
import java.util.ArrayList;

public final class nn
  implements AdapterView.OnItemClickListener
{
  public nn(SelfListView4003 paramSelfListView4003, ArrayList paramArrayList, FreePageVo paramFreePageVo) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (SelfListViewItem2Vo)this.a.get(paramInt);
    HQCHApplication.mainActivity.pageGroup.goNextPage(this.b.getSys_pageID(), paramAdapterView.getnPageId(), true, paramAdapterView.getnPageType(), paramAdapterView.getnPageModuleType());
  }
}


/* Location:              /Users/makito/Apktool/sunshine_app.apk/classes-dex2jar.jar!/nn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */