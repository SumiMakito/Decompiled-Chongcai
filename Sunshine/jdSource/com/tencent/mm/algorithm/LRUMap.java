package com.tencent.mm.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LRUMap<K, O>
{
  private Map<K, LRUMap<K, O>.TimeVal<O>> c = null;
  private int d;
  private int e;
  private PreRemoveCallback<K, O> f = null;
  
  public LRUMap(int paramInt)
  {
    this(paramInt, null);
  }
  
  public LRUMap(int paramInt, PreRemoveCallback<K, O> paramPreRemoveCallback)
  {
    this.d = paramInt;
    this.e = 0;
    this.f = paramPreRemoveCallback;
    this.c = new HashMap();
  }
  
  public boolean check(K paramK)
  {
    return this.c.containsKey(paramK);
  }
  
  public boolean checkAndUpTime(K paramK)
  {
    if (this.c.containsKey(paramK))
    {
      ((TimeVal)this.c.get(paramK)).UpTime();
      return true;
    }
    return false;
  }
  
  public void clear()
  {
    this.c.clear();
  }
  
  public void clear(OnClearListener<K, O> paramOnClearListener)
  {
    if (this.c != null)
    {
      if (paramOnClearListener != null)
      {
        Iterator localIterator = this.c.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          paramOnClearListener.onClear(localEntry.getKey(), ((TimeVal)localEntry.getValue()).obj);
        }
      }
      this.c.clear();
    }
  }
  
  public O get(K paramK)
  {
    paramK = (TimeVal)this.c.get(paramK);
    if (paramK == null) {
      return null;
    }
    return (O)paramK.obj;
  }
  
  public O getAndUptime(K paramK)
  {
    TimeVal localTimeVal = (TimeVal)this.c.get(paramK);
    if (localTimeVal == null) {
      return null;
    }
    ((TimeVal)this.c.get(paramK)).UpTime();
    return (O)localTimeVal.obj;
  }
  
  public void remove(K paramK)
  {
    if (!this.c.containsKey(paramK)) {
      return;
    }
    if (this.f != null) {
      this.f.preRemoveCallback(paramK, ((TimeVal)this.c.get(paramK)).obj);
    }
    this.c.remove(paramK);
  }
  
  public void setMaxSize(int paramInt)
  {
    if (paramInt > 0) {
      this.d = paramInt;
    }
  }
  
  public void setPerDeleteSize(int paramInt)
  {
    if (paramInt > 0) {
      this.e = paramInt;
    }
  }
  
  public int size()
  {
    return this.c.size();
  }
  
  public void update(K paramK, O paramO)
  {
    int i;
    if ((TimeVal)this.c.get(paramK) == null)
    {
      paramO = new TimeVal(paramO);
      this.c.put(paramK, paramO);
      if (this.c.size() > this.d)
      {
        paramK = new ArrayList(this.c.entrySet());
        Collections.sort(paramK, new LRUMap.1(this));
        if (this.e > 0) {
          break label150;
        }
        int j = this.d / 10;
        i = j;
        if (j <= 0) {
          i = 1;
        }
        paramK = paramK.iterator();
      }
    }
    for (;;)
    {
      if (paramK.hasNext())
      {
        remove(((Map.Entry)paramK.next()).getKey());
        i -= 1;
        if (i > 0) {}
      }
      else
      {
        return;
        label150:
        i = this.e;
        break;
        ((TimeVal)this.c.get(paramK)).UpTime();
        ((TimeVal)this.c.get(paramK)).obj = paramO;
        return;
      }
    }
  }
  
  public static abstract interface OnClearListener<K, O>
  {
    public abstract void onClear(K paramK, O paramO);
  }
  
  public static abstract interface PreRemoveCallback<K, O>
  {
    public abstract void preRemoveCallback(K paramK, O paramO);
  }
  
  public class TimeVal<OO>
  {
    public OO obj;
    public Long t;
    
    public TimeVal()
    {
      Object localObject;
      this.obj = localObject;
      UpTime();
    }
    
    public void UpTime()
    {
      this.t = Long.valueOf(System.currentTimeMillis());
    }
  }
}


/* Location:              /Users/makito/Apktool/sunshine_app.apk/classes-dex2jar.jar!/com/tencent/mm/algorithm/LRUMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */