package com.alipay.sdk.util;

import com.alipay.sdk.cons.GlobalConstants;
import com.alipay.sdk.encrypt.Rsa;
import com.alipay.sdk.encrypt.TriDes;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtils
{
  public static String a(String paramString1, String paramString2)
  {
    String str = Rsa.a(paramString1, GlobalConstants.d);
    paramString1 = TriDes.a(paramString1, paramString2);
    return String.format(Locale.getDefault(), "%08X%s%08X%s", new Object[] { Integer.valueOf(str.length()), str, Integer.valueOf(paramString1.length()), paramString1 });
  }
  
  public static JSONObject a(JSONObject paramJSONObject1, JSONObject paramJSONObject2)
  {
    JSONObject localJSONObject = new JSONObject();
    for (;;)
    {
      int i;
      try
      {
        JSONObject[] arrayOfJSONObject = new JSONObject[2];
        arrayOfJSONObject[0] = paramJSONObject1;
        arrayOfJSONObject[1] = paramJSONObject2;
        int j = arrayOfJSONObject.length;
        i = 0;
        if (i < j)
        {
          paramJSONObject1 = arrayOfJSONObject[i];
          if (paramJSONObject1 != null)
          {
            paramJSONObject2 = paramJSONObject1.keys();
            if (paramJSONObject2.hasNext())
            {
              String str = (String)paramJSONObject2.next();
              localJSONObject.put(str, paramJSONObject1.get(str));
              continue;
            }
          }
        }
        else
        {
          return localJSONObject;
        }
      }
      catch (JSONException paramJSONObject1) {}
      i += 1;
    }
  }
}


/* Location:              /Users/makito/Apktool/sunshine_app.apk/classes-dex2jar.jar!/com/alipay/sdk/util/JsonUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */