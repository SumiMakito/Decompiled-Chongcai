package com.tencent.mm.sdk.platformtools;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.view.View;
import com.tencent.mm.algorithm.MD5;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import junit.framework.Assert;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public final class Util
{
  public static final int BEGIN_TIME = 22;
  public static final int BIT_OF_KB = 10;
  public static final int BIT_OF_MB = 20;
  public static final int BYTE_OF_KB = 1024;
  public static final int BYTE_OF_MB = 1048576;
  public static final String CHINA = "zh_CN";
  public static final int DAY = 0;
  public static final int END_TIME = 8;
  public static final String ENGLISH = "en";
  private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
  public static final String HONGKONG = "zh_HK";
  public static final String LANGUAGE_DEFAULT = "language_default";
  public static final int MASK_16BIT = 65535;
  public static final int MASK_32BIT = -1;
  public static final int MASK_4BIT = 15;
  public static final int MASK_8BIT = 255;
  public static final long MAX_32BIT_VALUE = 4294967295L;
  public static final int MAX_ACCOUNT_LENGTH = 20;
  public static final int MAX_DECODE_PICTURE_SIZE = 2764800;
  public static final int MAX_PASSWORD_LENGTH = 9;
  public static final long MILLSECONDS_OF_DAY = 86400000L;
  public static final long MILLSECONDS_OF_HOUR = 3600000L;
  public static final long MILLSECONDS_OF_MINUTE = 60000L;
  public static final long MILLSECONDS_OF_SECOND = 1000L;
  public static final long MINUTE_OF_HOUR = 60L;
  public static final int MIN_ACCOUNT_LENGTH = 6;
  public static final int MIN_PASSWORD_LENGTH = 4;
  public static final String PHOTO_DEFAULT_EXT = ".jpg";
  public static final long SECOND_OF_MINUTE = 60L;
  public static final String TAIWAN = "zh_TW";
  private static final long[] bt = { 300L, 200L, 300L, 200L };
  private static final char[] bu = { 9, 10, 13 };
  private static final char[] bv = { 60, 62, 34, 39, 38 };
  private static final String[] bw = { "&lt;", "&gt;", "&quot;", "&apos;", "&amp;" };
  
  public static String GetHostIp()
  {
    try
    {
      InetAddress localInetAddress;
      do
      {
        localObject = NetworkInterface.getNetworkInterfaces();
        Enumeration localEnumeration;
        while (!localEnumeration.hasMoreElements())
        {
          if (!((Enumeration)localObject).hasMoreElements()) {
            break;
          }
          localEnumeration = ((NetworkInterface)((Enumeration)localObject).nextElement()).getInetAddresses();
        }
        localInetAddress = (InetAddress)localEnumeration.nextElement();
      } while (localInetAddress.isLoopbackAddress());
      Object localObject = localInetAddress.getHostAddress();
      return (String)localObject;
    }
    catch (Exception localException)
    {
      return null;
    }
    catch (SocketException localSocketException)
    {
      for (;;) {}
    }
  }
  
  public static int UnZipFolder(String paramString1, String paramString2)
  {
    for (;;)
    {
      try
      {
        android.util.Log.v("XZip", "UnZipFolder(String, String)");
        paramString1 = new ZipInputStream(new FileInputStream(paramString1));
        Object localObject1 = paramString1.getNextEntry();
        if (localObject1 == null) {
          break;
        }
        Object localObject2 = ((ZipEntry)localObject1).getName();
        if (((ZipEntry)localObject1).isDirectory())
        {
          localObject1 = ((String)localObject2).substring(0, ((String)localObject2).length() - 1);
          new File(paramString2 + File.separator + (String)localObject1).mkdirs();
        }
        else
        {
          int i;
          ((FileOutputStream)localObject1).close();
        }
      }
      catch (FileNotFoundException paramString1)
      {
        paramString1.printStackTrace();
        return -1;
        localObject1 = new File(paramString2 + File.separator + (String)localObject2);
        ((File)localObject1).createNewFile();
        localObject1 = new FileOutputStream((File)localObject1);
        localObject2 = new byte['Ѐ'];
        i = paramString1.read((byte[])localObject2);
        if (i != -1)
        {
          ((FileOutputStream)localObject1).write((byte[])localObject2, 0, i);
          ((FileOutputStream)localObject1).flush();
        }
      }
      catch (IOException paramString1)
      {
        paramString1.printStackTrace();
        return -2;
      }
    }
    paramString1.close();
    return 0;
  }
  
  private static int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= 0) {
      return 0;
    }
    if ((paramArrayOfChar[paramInt1] != '#') || ((paramInt2 > 1) && ((paramArrayOfChar[(paramInt1 + 1)] == 'x') || (paramArrayOfChar[(paramInt1 + 1)] == 'X')))) {}
    for (;;)
    {
      try
      {
        paramInt1 = Integer.parseInt(new String(paramArrayOfChar, paramInt1 + 2, paramInt2 - 2), 16);
        return paramInt1;
      }
      catch (NumberFormatException paramArrayOfChar) {}
      try
      {
        paramInt1 = Integer.parseInt(new String(paramArrayOfChar, paramInt1 + 1, paramInt2 - 1), 10);
        return paramInt1;
      }
      catch (NumberFormatException paramArrayOfChar)
      {
        return 0;
      }
    }
    new String(paramArrayOfChar, paramInt1, paramInt2);
    return 0;
    return 0;
  }
  
  private static void a(Map<String, String> paramMap, String paramString, Node paramNode, int paramInt)
  {
    int i = 0;
    if (paramNode.getNodeName().equals("#text")) {
      paramMap.put(paramString, paramNode.getNodeValue());
    }
    for (;;)
    {
      return;
      if (paramNode.getNodeName().equals("#cdata-section"))
      {
        paramMap.put(paramString, paramNode.getNodeValue());
        return;
      }
      Object localObject = new StringBuilder().append(paramString).append(".").append(paramNode.getNodeName());
      if (paramInt > 0) {}
      Node localNode;
      for (paramString = Integer.valueOf(paramInt);; paramString = "")
      {
        paramString = paramString;
        paramMap.put(paramString, paramNode.getNodeValue());
        localObject = paramNode.getAttributes();
        if (localObject == null) {
          break;
        }
        paramInt = 0;
        while (paramInt < ((NamedNodeMap)localObject).getLength())
        {
          localNode = ((NamedNodeMap)localObject).item(paramInt);
          paramMap.put(paramString + ".$" + localNode.getNodeName(), localNode.getNodeValue());
          paramInt += 1;
        }
      }
      localObject = new HashMap();
      paramNode = paramNode.getChildNodes();
      paramInt = i;
      while (paramInt < paramNode.getLength())
      {
        localNode = paramNode.item(paramInt);
        i = nullAsNil((Integer)((HashMap)localObject).get(localNode.getNodeName()));
        a(paramMap, paramString, localNode, i);
        ((HashMap)localObject).put(localNode.getNodeName(), Integer.valueOf(i + 1));
        paramInt += 1;
      }
    }
  }
  
  public static byte[] bmpToByteArray(Bitmap paramBitmap, boolean paramBoolean)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
    if (paramBoolean) {
      paramBitmap.recycle();
    }
    paramBitmap = localByteArrayOutputStream.toByteArray();
    try
    {
      localByteArrayOutputStream.close();
      return paramBitmap;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return paramBitmap;
  }
  
  public static boolean checkPermission(Context paramContext, String paramString)
  {
    Assert.assertNotNull(paramContext);
    Object localObject = paramContext.getPackageName();
    boolean bool;
    if (paramContext.getPackageManager().checkPermission(paramString, (String)localObject) == 0)
    {
      bool = true;
      localObject = new StringBuilder().append((String)localObject).append(" has ");
      if (!bool) {
        break label74;
      }
    }
    label74:
    for (paramContext = "permission ";; paramContext = "no permission ")
    {
      Log.d("MicroMsg.Util", paramContext + paramString);
      return bool;
      bool = false;
      break;
    }
  }
  
  public static boolean checkSDCardFull()
  {
    if (!"mounted".equals(Environment.getExternalStorageState())) {}
    int i;
    long l3;
    do
    {
      StatFs localStatFs;
      long l1;
      long l2;
      do
      {
        return false;
        localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        l1 = localStatFs.getBlockCount();
        l2 = localStatFs.getAvailableBlocks();
      } while ((l1 <= 0L) || (l1 - l2 < 0L));
      i = (int)((l1 - l2) * 100L / l1);
      l3 = localStatFs.getBlockSize() * localStatFs.getFreeBlocks();
      Log.d("MicroMsg.Util", "checkSDCardFull per:" + i + " blockCount:" + l1 + " availCount:" + l2 + " availSize:" + l3);
    } while ((95 > i) || (l3 > 52428800L));
    return true;
  }
  
  public static String convertStreamToString(InputStream paramInputStream)
  {
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      for (;;)
      {
        String str = localBufferedReader.readLine();
        if (str == null) {
          break;
        }
        localStringBuilder.append(str + "\n");
      }
      try
      {
        paramInputStream.close();
        throw ((Throwable)localObject);
      }
      catch (IOException paramInputStream)
      {
        for (;;)
        {
          paramInputStream.printStackTrace();
        }
      }
    }
    catch (IOException localIOException)
    {
      localIOException = localIOException;
      localIOException.printStackTrace();
      try
      {
        paramInputStream.close();
        for (;;)
        {
          return localStringBuilder.toString();
          try
          {
            paramInputStream.close();
          }
          catch (IOException paramInputStream)
          {
            paramInputStream.printStackTrace();
          }
        }
      }
      catch (IOException paramInputStream)
      {
        for (;;)
        {
          paramInputStream.printStackTrace();
        }
      }
    }
    finally {}
  }
  
  public static long currentDayInMills()
  {
    return nowMilliSecond() / 86400000L * 86400000L;
  }
  
  public static long currentMonthInMills()
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    localGregorianCalendar = new GregorianCalendar(localGregorianCalendar.get(1), localGregorianCalendar.get(2), 1);
    localGregorianCalendar.setTimeZone(GMT);
    return localGregorianCalendar.getTimeInMillis();
  }
  
  public static long currentTicks()
  {
    return SystemClock.elapsedRealtime();
  }
  
  public static long currentWeekInMills()
  {
    GregorianCalendar localGregorianCalendar1 = new GregorianCalendar();
    GregorianCalendar localGregorianCalendar2 = new GregorianCalendar(localGregorianCalendar1.get(1), localGregorianCalendar1.get(2), localGregorianCalendar1.get(5));
    localGregorianCalendar2.setTimeZone(GMT);
    localGregorianCalendar2.add(6, -(localGregorianCalendar1.get(7) - localGregorianCalendar1.getFirstDayOfWeek()));
    return localGregorianCalendar2.getTimeInMillis();
  }
  
  public static long currentYearInMills()
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar(new GregorianCalendar().get(1), 1, 1);
    localGregorianCalendar.setTimeZone(GMT);
    return localGregorianCalendar.getTimeInMillis();
  }
  
  public static byte[] decodeHexString(String paramString)
  {
    Object localObject;
    if ((paramString == null) || (paramString.length() <= 0)) {
      localObject = new byte[0];
    }
    for (;;)
    {
      return (byte[])localObject;
      try
      {
        byte[] arrayOfByte = new byte[paramString.length() / 2];
        int i = 0;
        for (;;)
        {
          localObject = arrayOfByte;
          if (i >= arrayOfByte.length) {
            break;
          }
          arrayOfByte[i] = ((byte)(Integer.parseInt(paramString.substring(i * 2, i * 2 + 2), 16) & 0xFF));
          i += 1;
        }
        return new byte[0];
      }
      catch (NumberFormatException paramString)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  public static String dumpArray(Object[] paramArrayOfObject)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramArrayOfObject.length;
    int i = 0;
    while (i < j)
    {
      localStringBuilder.append(paramArrayOfObject[i]);
      localStringBuilder.append(",");
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static String dumpHex(byte[] paramArrayOfByte)
  {
    int i = 0;
    if (paramArrayOfByte == null) {
      return "(null)";
    }
    char[] arrayOfChar1 = new char[16];
    char[] tmp18_16 = arrayOfChar1;
    tmp18_16[0] = 48;
    char[] tmp24_18 = tmp18_16;
    tmp24_18[1] = 49;
    char[] tmp30_24 = tmp24_18;
    tmp30_24[2] = 50;
    char[] tmp36_30 = tmp30_24;
    tmp36_30[3] = 51;
    char[] tmp42_36 = tmp36_30;
    tmp42_36[4] = 52;
    char[] tmp48_42 = tmp42_36;
    tmp48_42[5] = 53;
    char[] tmp54_48 = tmp48_42;
    tmp54_48[6] = 54;
    char[] tmp61_54 = tmp54_48;
    tmp61_54[7] = 55;
    char[] tmp68_61 = tmp61_54;
    tmp68_61[8] = 56;
    char[] tmp75_68 = tmp68_61;
    tmp75_68[9] = 57;
    char[] tmp82_75 = tmp75_68;
    tmp82_75[10] = 97;
    char[] tmp89_82 = tmp82_75;
    tmp89_82[11] = 98;
    char[] tmp96_89 = tmp89_82;
    tmp96_89[12] = 99;
    char[] tmp103_96 = tmp96_89;
    tmp103_96[13] = 100;
    char[] tmp110_103 = tmp103_96;
    tmp110_103[14] = 101;
    char[] tmp117_110 = tmp110_103;
    tmp117_110[15] = 102;
    tmp117_110;
    int m = paramArrayOfByte.length;
    char[] arrayOfChar2 = new char[m * 3 + m / 16];
    int j = 0;
    if (j < m)
    {
      int k = paramArrayOfByte[j];
      int n = i + 1;
      arrayOfChar2[i] = ' ';
      int i1 = n + 1;
      arrayOfChar2[n] = arrayOfChar1[(k >>> 4 & 0xF)];
      i = i1 + 1;
      arrayOfChar2[i1] = arrayOfChar1[(k & 0xF)];
      if ((j % 16 != 0) || (j <= 0)) {
        break label243;
      }
      k = i + 1;
      arrayOfChar2[i] = '\n';
      i = k;
    }
    label243:
    for (;;)
    {
      j += 1;
      break;
      return new String(arrayOfChar2);
    }
  }
  
  public static String encodeHexString(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    if (paramArrayOfByte != null)
    {
      int i = 0;
      while (i < paramArrayOfByte.length)
      {
        localStringBuilder.append(String.format("%02x", new Object[] { Integer.valueOf(paramArrayOfByte[i] & 0xFF) }));
        i += 1;
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String escapeSqlValue(String paramString)
  {
    String str = paramString;
    if (paramString != null) {
      str = paramString.replace("\\[", "[[]").replace("%", "").replace("\\^", "").replace("'", "").replace("\\{", "").replace("\\}", "").replace("\"", "");
    }
    return str;
  }
  
  public static String escapeStringForXml(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    int k = paramString.length();
    int i = 0;
    char c;
    if (i < k)
    {
      c = paramString.charAt(i);
      if (((c < ' ') && (c != bu[0]) && (c != bu[1]) && (c != bu[2])) || (c > ''))
      {
        localStringBuffer.append("&#");
        localStringBuffer.append(Integer.toString(c));
        localStringBuffer.append(';');
      }
    }
    label117:
    label173:
    for (;;)
    {
      i += 1;
      break;
      int j = bv.length - 1;
      if (j >= 0) {
        if (bv[j] == c) {
          localStringBuffer.append(bw[j]);
        }
      }
      for (j = 0;; j = 1)
      {
        if (j == 0) {
          break label173;
        }
        localStringBuffer.append(c);
        break;
        j -= 1;
        break label117;
        return localStringBuffer.toString();
      }
    }
  }
  
  public static String expandEntities(String paramString)
  {
    int i1 = paramString.length();
    char[] arrayOfChar = new char[i1];
    int n = 0;
    int i = 0;
    int j = -1;
    int k;
    int m;
    if (n < i1)
    {
      char c = paramString.charAt(n);
      k = i + 1;
      arrayOfChar[i] = c;
      if ((c == '&') && (j == -1))
      {
        i = k;
        m = k;
      }
      do
      {
        do
        {
          do
          {
            do
            {
              n += 1;
              j = i;
              i = m;
              break;
              i = j;
              m = k;
            } while (j == -1);
            i = j;
            m = k;
          } while (Character.isLetter(c));
          i = j;
          m = k;
        } while (Character.isDigit(c));
        i = j;
        m = k;
      } while (c == '#');
      if (c == ';')
      {
        i = a(arrayOfChar, j, k - j - 1);
        if (i > 65535)
        {
          i -= 65536;
          arrayOfChar[(j - 1)] = ((char)((i >> 10) + 55296));
          arrayOfChar[j] = ((char)((i & 0x3FF) + 56320));
          i = j + 1;
        }
      }
    }
    for (;;)
    {
      m = i;
      i = -1;
      break;
      if (i != 0)
      {
        arrayOfChar[(j - 1)] = ((char)i);
        i = j;
        continue;
        i = -1;
        m = k;
        break;
        return new String(arrayOfChar, 0, i);
      }
      i = k;
    }
  }
  
  public static String formatSecToMin(int paramInt)
  {
    return String.format("%d:%02d", new Object[] { Long.valueOf(paramInt / 60L), Long.valueOf(paramInt % 60L) });
  }
  
  public static String formatUnixTime(long paramLong)
  {
    return new SimpleDateFormat("[yy-MM-dd HH:mm:ss]").format(new Date(1000L * paramLong));
  }
  
  public static void freeBitmapMap(Map<String, Bitmap> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Bitmap localBitmap = (Bitmap)((Map.Entry)localIterator.next()).getValue();
      if (localBitmap != null) {
        localBitmap.recycle();
      }
    }
    paramMap.clear();
  }
  
  public static String getCutPasswordMD5(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    if (str.length() <= 16) {
      return getFullPasswordMD5(str);
    }
    return getFullPasswordMD5(str.substring(0, 16));
  }
  
  public static String getDeviceId(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext == null) {
        return null;
      }
      paramContext = paramContext.getDeviceId();
      if (paramContext == null) {
        return null;
      }
      paramContext = paramContext.trim();
      return paramContext;
    }
    catch (SecurityException paramContext)
    {
      Log.e("MicroMsg.Util", "getDeviceId failed, security exception");
      return null;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
      }
    }
  }
  
  public static String getFullPasswordMD5(String paramString)
  {
    return MD5.getMessageDigest(paramString.getBytes());
  }
  
  public static int getHex(String paramString, int paramInt)
  {
    if (paramString == null) {
      return paramInt;
    }
    try
    {
      long l = Long.decode(paramString).longValue();
      return (int)(l & 0xFFFFFFFF);
    }
    catch (NumberFormatException paramString)
    {
      paramString.printStackTrace();
    }
    return paramInt;
  }
  
  public static BitmapFactory.Options getImageOptions(String paramString)
  {
    if ((paramString != null) && (!paramString.equals(""))) {}
    BitmapFactory.Options localOptions;
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      try
      {
        paramString = BitmapFactory.decodeFile(paramString, localOptions);
        if (paramString != null) {
          paramString.recycle();
        }
        return localOptions;
      }
      catch (OutOfMemoryError paramString)
      {
        Log.e("MicroMsg.Util", "decode bitmap failed: " + paramString.getMessage());
      }
    }
    return localOptions;
  }
  
  public static Intent getInstallPackIntent(String paramString, Context paramContext)
  {
    if ((paramString != null) && (!paramString.equals(""))) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      paramContext = new Intent("android.intent.action.VIEW");
      paramContext.addFlags(268435456);
      paramContext.setDataAndType(Uri.fromFile(new File(paramString)), "application/vnd.android.package-archive");
      return paramContext;
    }
  }
  
  public static int getInt(String paramString, int paramInt)
  {
    if (paramString == null) {
      return paramInt;
    }
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (NumberFormatException paramString)
    {
      paramString.printStackTrace();
    }
    return paramInt;
  }
  
  public static int getIntRandom(int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      return new Random(System.currentTimeMillis()).nextInt(paramInt1 - paramInt2 + 1) + paramInt2;
    }
  }
  
  public static String getLine1Number(Context paramContext)
  {
    if (paramContext == null) {}
    for (;;)
    {
      return null;
      try
      {
        if ((TelephonyManager)paramContext.getSystemService("phone") == null)
        {
          Log.e("MicroMsg.Util", "get line1 number failed, null tm");
          return null;
        }
      }
      catch (SecurityException paramContext)
      {
        Log.e("MicroMsg.Util", "getLine1Number failed, security exception");
        return null;
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
      }
    }
    return null;
  }
  
  public static long getLong(String paramString, long paramLong)
  {
    if (paramString == null) {
      return paramLong;
    }
    try
    {
      long l = Long.parseLong(paramString);
      return l;
    }
    catch (NumberFormatException paramString)
    {
      paramString.printStackTrace();
    }
    return paramLong;
  }
  
  public static Element getRootElementFromXML(byte[] paramArrayOfByte)
  {
    Object localObject = DocumentBuilderFactory.newInstance();
    try
    {
      localObject = ((DocumentBuilderFactory)localObject).newDocumentBuilder();
      if (localObject == null)
      {
        Log.e("MicroMsg.Util", "new Document Builder failed");
        return null;
      }
    }
    catch (ParserConfigurationException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return null;
    }
    try
    {
      paramArrayOfByte = ((DocumentBuilder)localObject).parse(new ByteArrayInputStream(paramArrayOfByte));
      if (paramArrayOfByte == null)
      {
        Log.e("MicroMsg.Util", "new Document failed");
        return null;
      }
    }
    catch (SAXException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return null;
    }
    catch (IOException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return null;
    }
    return paramArrayOfByte.getDocumentElement();
  }
  
  public static Bitmap getRoundedCornerBitmap(Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    Assert.assertNotNull(paramBitmap);
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    Rect localRect = new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
    RectF localRectF = new RectF(localRect);
    localPaint.setAntiAlias(true);
    localPaint.setDither(true);
    localPaint.setFilterBitmap(true);
    localCanvas.drawARGB(0, 0, 0, 0);
    localPaint.setColor(-4144960);
    localCanvas.drawRoundRect(localRectF, paramFloat, paramFloat, localPaint);
    localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    localCanvas.drawBitmap(paramBitmap, localRect, localRect, localPaint);
    if (paramBoolean) {
      paramBitmap.recycle();
    }
    return localBitmap;
  }
  
  public static String getSizeKB(long paramLong)
  {
    if (paramLong >> 20 > 0L) {
      return getSizeMB(paramLong);
    }
    if (paramLong >> 9 > 0L)
    {
      float f = Math.round((float)paramLong * 10.0F / 1024.0F) / 10.0F;
      return f + "KB";
    }
    return paramLong + "B";
  }
  
  public static String getSizeMB(long paramLong)
  {
    float f = Math.round((float)paramLong * 10.0F / 1048576.0F) / 10.0F;
    return f + "MB";
  }
  
  public static String getStack()
  {
    StackTraceElement[] arrayOfStackTraceElement = new Throwable().getStackTrace();
    Object localObject;
    if ((arrayOfStackTraceElement == null) || (arrayOfStackTraceElement.length < 2))
    {
      localObject = "";
      return (String)localObject;
    }
    String str = "";
    int i = 1;
    for (;;)
    {
      localObject = str;
      if (i >= arrayOfStackTraceElement.length) {
        break;
      }
      localObject = str;
      if (!arrayOfStackTraceElement[i].getClassName().contains("com.tencent.mm")) {
        break;
      }
      str = str + "[" + arrayOfStackTraceElement[i].getClassName().substring(15) + ":" + arrayOfStackTraceElement[i].getMethodName() + "]";
      i += 1;
    }
  }
  
  public static int getSystemVersion(Context paramContext, int paramInt)
  {
    if (paramContext == null) {
      return paramInt;
    }
    return Settings.System.getInt(paramContext.getContentResolver(), "sys.settings_system_version", paramInt);
  }
  
  public static String getTimeZone()
  {
    Object localObject = getTimeZoneDef();
    int j = ((String)localObject).indexOf('+');
    int i = j;
    if (j == -1) {
      i = ((String)localObject).indexOf('-');
    }
    if (i == -1) {
      localObject = "";
    }
    String str;
    do
    {
      return (String)localObject;
      str = ((String)localObject).substring(i, i + 3);
      localObject = str;
    } while (str.charAt(1) != '0');
    return str.substring(0, 1) + str.substring(2, 3);
  }
  
  public static String getTimeZoneDef()
  {
    int j = (int)(TimeZone.getDefault().getRawOffset() / 60000L);
    char c = '+';
    int i = j;
    if (j < 0)
    {
      c = '-';
      i = -j;
    }
    return String.format("GMT%s%02d:%02d", new Object[] { Character.valueOf(c), Long.valueOf(i / 60L), Long.valueOf(i % 60L) });
  }
  
  public static String getTimeZoneOffset()
  {
    TimeZone localTimeZone = TimeZone.getDefault();
    double d = localTimeZone.getRawOffset() * 100 / 3600000L / 100.0D;
    if (localTimeZone.useDaylightTime()) {}
    for (int i = 1;; i = 0) {
      return String.format("%.2f", new Object[] { Double.valueOf(d + i) });
    }
  }
  
  public static String getTopActivityName(Context paramContext)
  {
    try
    {
      paramContext = ((ActivityManager.RunningTaskInfo)((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getClassName();
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return "(null)";
  }
  
  public static int guessHttpContinueRecvLength(int paramInt)
  {
    return ((paramInt - 1) / 1462 + 1) * 52 + 52 + paramInt;
  }
  
  public static int guessHttpRecvLength(int paramInt)
  {
    return ((paramInt - 1) / 1462 + 1) * 52 + 208 + paramInt;
  }
  
  public static int guessHttpSendLength(int paramInt)
  {
    return ((paramInt - 1) / 1462 + 1) * 52 + 224 + paramInt;
  }
  
  public static int guessTcpConnectLength()
  {
    return 172;
  }
  
  public static int guessTcpDisconnectLength()
  {
    return 156;
  }
  
  public static int guessTcpRecvLength(int paramInt)
  {
    return ((paramInt - 1) / 1462 + 1) * 52 + 40 + paramInt;
  }
  
  public static int guessTcpSendLength(int paramInt)
  {
    return ((paramInt - 1) / 1462 + 1) * 52 + 40 + paramInt;
  }
  
  public static void installPack(String paramString, Context paramContext)
  {
    paramContext.startActivity(getInstallPackIntent(paramString, paramContext));
  }
  
  public static boolean isAlpha(char paramChar)
  {
    return ((paramChar >= 'a') && (paramChar <= 'z')) || ((paramChar >= 'A') && (paramChar <= 'Z'));
  }
  
  public static boolean isChinese(char paramChar)
  {
    Character.UnicodeBlock localUnicodeBlock = Character.UnicodeBlock.of(paramChar);
    return (localUnicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || (localUnicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || (localUnicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || (localUnicodeBlock == Character.UnicodeBlock.GENERAL_PUNCTUATION) || (localUnicodeBlock == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION) || (localUnicodeBlock == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS);
  }
  
  public static boolean isDayTimeNow()
  {
    int i = new GregorianCalendar().get(11);
    return (i >= 6L) && (i < 18L);
  }
  
  public static boolean isImgFile(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      Log.e("MicroMsg.Util", "isImgFile, invalid argument");
    }
    BitmapFactory.Options localOptions;
    do
    {
      do
      {
        return false;
      } while ((paramString.length() < 3) || (!new File(paramString).exists()));
      localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeFile(paramString, localOptions);
    } while ((localOptions.outWidth <= 0) || (localOptions.outHeight <= 0));
    return true;
  }
  
  public static boolean isIntentAvailable(Context paramContext, Intent paramIntent)
  {
    return paramContext.getPackageManager().queryIntentActivities(paramIntent, 65536).size() > 0;
  }
  
  public static boolean isLockScreen(Context paramContext)
  {
    try
    {
      boolean bool = ((KeyguardManager)paramContext.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
      return bool;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return false;
  }
  
  public static boolean isNightTime(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramInt2 > paramInt3) {
      if (paramInt1 < paramInt2)
      {
        bool1 = bool2;
        if (paramInt1 > paramInt3) {}
      }
      else
      {
        bool1 = true;
      }
    }
    do
    {
      do
      {
        return bool1;
        if (paramInt2 >= paramInt3) {
          break;
        }
        bool1 = bool2;
      } while (paramInt1 > paramInt3);
      bool1 = bool2;
    } while (paramInt1 < paramInt2);
    return true;
    return true;
  }
  
  public static boolean isNullOrNil(String paramString)
  {
    return (paramString == null) || (paramString.length() <= 0);
  }
  
  public static boolean isNullOrNil(byte[] paramArrayOfByte)
  {
    return (paramArrayOfByte == null) || (paramArrayOfByte.length <= 0);
  }
  
  public static boolean isNum(char paramChar)
  {
    return (paramChar >= '0') && (paramChar <= '9');
  }
  
  public static boolean isProcessRunning(Context paramContext, String paramString)
  {
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
    while (paramContext.hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
      if ((localRunningAppProcessInfo != null) && (localRunningAppProcessInfo.processName != null) && (localRunningAppProcessInfo.processName.equals(paramString)))
      {
        Log.w("MicroMsg.Util", "process " + paramString + " is running");
        return true;
      }
    }
    Log.w("MicroMsg.Util", "process " + paramString + " is not running");
    return false;
  }
  
  public static boolean isServiceRunning(Context paramContext, String paramString)
  {
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
    while (paramContext.hasNext())
    {
      ActivityManager.RunningServiceInfo localRunningServiceInfo = (ActivityManager.RunningServiceInfo)paramContext.next();
      if ((localRunningServiceInfo != null) && (localRunningServiceInfo.service != null) && (localRunningServiceInfo.service.getClassName().toString().equals(paramString)))
      {
        Log.w("MicroMsg.Util", "service " + paramString + " is running");
        return true;
      }
    }
    Log.w("MicroMsg.Util", "service " + paramString + " is not running");
    return false;
  }
  
  public static boolean isTopActivity(Context paramContext)
  {
    String str = paramContext.getClass().getName();
    paramContext = getTopActivityName(paramContext);
    Log.d("MicroMsg.Util", "top activity=" + paramContext + ", context=" + str);
    return paramContext.equalsIgnoreCase(str);
  }
  
  public static boolean isTopApplication(Context paramContext)
  {
    try
    {
      String str = ((ActivityManager.RunningTaskInfo)((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getClassName();
      paramContext = paramContext.getPackageName();
      Log.d("MicroMsg.Util", "top activity=" + str + ", context=" + paramContext);
      boolean bool = str.contains(paramContext);
      return bool;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return false;
  }
  
  public static boolean isValidAccount(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return false;
      paramString = paramString.trim();
    } while ((paramString.length() < 6) || (paramString.length() > 20) || (!isAlpha(paramString.charAt(0))));
    int i = 0;
    for (;;)
    {
      if (i >= paramString.length()) {
        break label89;
      }
      char c = paramString.charAt(i);
      if ((!isAlpha(c)) && (!isNum(c)) && (c != '-') && (c != '_')) {
        break;
      }
      i += 1;
    }
    label89:
    return true;
  }
  
  public static boolean isValidEmail(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return false;
    }
    return paramString.trim().matches("^[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$");
  }
  
  public static boolean isValidPassword(String paramString)
  {
    if (paramString == null) {}
    while (paramString.length() < 4) {
      return false;
    }
    if (paramString.length() >= 9) {
      return true;
    }
    try
    {
      Integer.parseInt(paramString);
      return false;
    }
    catch (NumberFormatException paramString) {}
    return true;
  }
  
  public static boolean isValidQQNum(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {}
    for (;;)
    {
      return false;
      paramString = paramString.trim();
      try
      {
        long l = Long.valueOf(paramString).longValue();
        if ((l > 0L) && (l <= 4294967295L)) {
          return true;
        }
      }
      catch (NumberFormatException paramString)
      {
        paramString.printStackTrace();
      }
    }
    return false;
  }
  
  public static boolean jump(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    if (!isIntentAvailable(paramContext, localIntent))
    {
      Log.e("MicroMsg.Util", "jump to url failed, " + paramString);
      return false;
    }
    paramContext.startActivity(localIntent);
    return true;
  }
  
  public static String listToString(List<String> paramList, String paramString)
  {
    if (paramList == null) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder("");
    int i = 0;
    if (i < paramList.size())
    {
      if (i == paramList.size() - 1) {
        localStringBuilder.append(((String)paramList.get(i)).trim());
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuilder.append(((String)paramList.get(i)).trim() + paramString);
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String mapToXml(String paramString, LinkedHashMap<String, String> paramLinkedHashMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<key>");
    Iterator localIterator = paramLinkedHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramString = (Map.Entry)localIterator.next();
      paramLinkedHashMap = paramString.getKey();
      Object localObject = paramString.getValue();
      paramString = paramLinkedHashMap;
      if (paramLinkedHashMap == null) {
        paramString = "unknow";
      }
      paramLinkedHashMap = (LinkedHashMap<String, String>)localObject;
      if (localObject == null) {
        paramLinkedHashMap = "unknow";
      }
      localStringBuilder.append("<" + paramString + ">");
      localStringBuilder.append(paramLinkedHashMap);
      localStringBuilder.append("</" + paramString + ">");
    }
    localStringBuilder.append("</key>");
    return localStringBuilder.toString();
  }
  
  public static long milliSecondsToNow(long paramLong)
  {
    return System.currentTimeMillis() - paramLong;
  }
  
  public static long nowMilliSecond()
  {
    return System.currentTimeMillis();
  }
  
  public static long nowSecond()
  {
    return System.currentTimeMillis() / 1000L;
  }
  
  public static int nullAs(Integer paramInteger, int paramInt)
  {
    if (paramInteger == null) {
      return paramInt;
    }
    return paramInteger.intValue();
  }
  
  public static long nullAs(Long paramLong, long paramLong1)
  {
    if (paramLong == null) {
      return paramLong1;
    }
    return paramLong.longValue();
  }
  
  public static String nullAs(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return paramString2;
    }
    return paramString1;
  }
  
  public static boolean nullAs(Boolean paramBoolean, boolean paramBoolean1)
  {
    if (paramBoolean == null) {
      return paramBoolean1;
    }
    return paramBoolean.booleanValue();
  }
  
  public static boolean nullAsFalse(Boolean paramBoolean)
  {
    if (paramBoolean == null) {
      return false;
    }
    return paramBoolean.booleanValue();
  }
  
  public static int nullAsInt(Object paramObject, int paramInt)
  {
    if (paramObject == null) {}
    do
    {
      return paramInt;
      if ((paramObject instanceof Integer)) {
        return ((Integer)paramObject).intValue();
      }
    } while (!(paramObject instanceof Long));
    return ((Long)paramObject).intValue();
  }
  
  public static int nullAsNil(Integer paramInteger)
  {
    if (paramInteger == null) {
      return 0;
    }
    return paramInteger.intValue();
  }
  
  public static long nullAsNil(Long paramLong)
  {
    if (paramLong == null) {
      return 0L;
    }
    return paramLong.longValue();
  }
  
  public static String nullAsNil(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  public static boolean nullAsTrue(Boolean paramBoolean)
  {
    if (paramBoolean == null) {
      return true;
    }
    return paramBoolean.booleanValue();
  }
  
  public static Map<String, String> parseIni(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = null;
      return paramString;
    }
    HashMap localHashMap = new HashMap();
    String[] arrayOfString = paramString.split("\n");
    int j = arrayOfString.length;
    int i = 0;
    for (;;)
    {
      paramString = localHashMap;
      if (i >= j) {
        break;
      }
      paramString = arrayOfString[i];
      if ((paramString != null) && (paramString.length() > 0))
      {
        Object localObject = paramString.trim().split("=", 2);
        if ((localObject != null) && (localObject.length >= 2))
        {
          paramString = localObject[0];
          localObject = localObject[1];
          if ((paramString != null) && (paramString.length() > 0) && (paramString.matches("^[a-zA-Z0-9_]*"))) {
            localHashMap.put(paramString, localObject);
          }
        }
      }
      i += 1;
    }
  }
  
  public static Map<String, String> parseXml(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString1 == null) || (paramString1.length() <= 0)) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    Object localObject = DocumentBuilderFactory.newInstance();
    try
    {
      localObject = ((DocumentBuilderFactory)localObject).newDocumentBuilder();
      if (localObject == null)
      {
        Log.e("MicroMsg.Util", "new Document Builder failed");
        return null;
      }
    }
    catch (ParserConfigurationException paramString1)
    {
      paramString1.printStackTrace();
      return null;
    }
    try
    {
      paramString1 = new InputSource(new ByteArrayInputStream(paramString1.getBytes()));
      if (paramString3 != null) {
        paramString1.setEncoding(paramString3);
      }
      paramString1 = ((DocumentBuilder)localObject).parse(paramString1);
      paramString1 = paramString1.getDocumentElement();
    }
    catch (DOMException paramString3)
    {
      for (;;)
      {
        try
        {
          paramString1.normalize();
          if (paramString1 != null) {
            continue;
          }
          Log.e("MicroMsg.Util", "new Document failed");
          return null;
        }
        catch (DOMException paramString3)
        {
          continue;
        }
        paramString3 = paramString3;
        paramString1 = null;
        paramString3.printStackTrace();
      }
    }
    catch (SAXException paramString1)
    {
      paramString1.printStackTrace();
      return null;
    }
    catch (IOException paramString1)
    {
      paramString1.printStackTrace();
      return null;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
      return null;
    }
    if (paramString1 == null)
    {
      Log.e("MicroMsg.Util", "getDocumentElement failed");
      return null;
    }
    if ((paramString2 != null) && (paramString2.equals(paramString1.getNodeName()))) {
      a(localHashMap, "", paramString1, 0);
    }
    for (;;)
    {
      paramString1 = localHashMap.entrySet().iterator();
      while (paramString1.hasNext())
      {
        paramString2 = (Map.Entry)paramString1.next();
        Log.v("MicroMsg.Util", "key=" + (String)paramString2.getKey() + " value=" + (String)paramString2.getValue());
      }
      paramString1 = paramString1.getElementsByTagName(paramString2);
      if (paramString1.getLength() <= 0)
      {
        Log.e("MicroMsg.Util", "parse item null");
        return null;
      }
      if (paramString1.getLength() > 1) {
        Log.w("MicroMsg.Util", "parse items more than one");
      }
      a(localHashMap, "", paramString1.item(0), 0);
    }
    return localHashMap;
  }
  
  public static MediaPlayer playSound(Context paramContext, int paramInt, MediaPlayer.OnCompletionListener paramOnCompletionListener)
  {
    try
    {
      Object localObject = paramContext.getString(paramInt);
      paramContext = paramContext.getAssets().openFd((String)localObject);
      localObject = new MediaPlayer();
      ((MediaPlayer)localObject).setDataSource(paramContext.getFileDescriptor(), paramContext.getStartOffset(), paramContext.getLength());
      paramContext.close();
      ((MediaPlayer)localObject).prepare();
      ((MediaPlayer)localObject).setLooping(false);
      ((MediaPlayer)localObject).start();
      ((MediaPlayer)localObject).setOnCompletionListener(paramOnCompletionListener);
      return (MediaPlayer)localObject;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
  
  public static void playSound(Context paramContext, int paramInt)
  {
    playSound(paramContext, paramInt, new Util.1());
  }
  
  public static String processXml(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    while (Build.VERSION.SDK_INT >= 8) {
      return paramString;
    }
    return expandEntities(paramString);
  }
  
  public static void saveBitmapToImage(Bitmap paramBitmap, int paramInt, Bitmap.CompressFormat paramCompressFormat, String paramString1, String paramString2, boolean paramBoolean)
  {
    if ((paramString1 != null) && (paramString2 != null)) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      Log.d("MicroMsg.Util", "saving to " + paramString1 + paramString2);
      paramString1 = new File(paramString1 + paramString2);
      paramString1.createNewFile();
      try
      {
        paramString1 = new FileOutputStream(paramString1);
        paramBitmap.compress(paramCompressFormat, paramInt, paramString1);
        paramString1.flush();
        return;
      }
      catch (FileNotFoundException paramBitmap)
      {
        paramBitmap.printStackTrace();
      }
    }
  }
  
  /* Error */
  public static void saveBitmapToImage(Bitmap paramBitmap, int paramInt, Bitmap.CompressFormat paramCompressFormat, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_3
    //   1: invokestatic 1330	com/tencent/mm/sdk/platformtools/Util:isNullOrNil	(Ljava/lang/String;)Z
    //   4: ifne +84 -> 88
    //   7: iconst_1
    //   8: istore 4
    //   10: iload 4
    //   12: invokestatic 700	junit/framework/Assert:assertTrue	(Z)V
    //   15: ldc_w 392
    //   18: new 211	java/lang/StringBuilder
    //   21: dup
    //   22: ldc_w 1327
    //   25: invokespecial 435	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   28: aload_3
    //   29: invokevirtual 216	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: invokestatic 398	com/tencent/mm/sdk/platformtools/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   38: new 209	java/io/File
    //   41: dup
    //   42: aload_3
    //   43: invokespecial 223	java/io/File:<init>	(Ljava/lang/String;)V
    //   46: astore_3
    //   47: aload_3
    //   48: invokevirtual 232	java/io/File:createNewFile	()Z
    //   51: pop
    //   52: new 234	java/io/FileOutputStream
    //   55: dup
    //   56: aload_3
    //   57: invokespecial 237	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   60: astore 5
    //   62: aload 5
    //   64: astore_3
    //   65: aload_0
    //   66: aload_2
    //   67: iload_1
    //   68: aload 5
    //   70: invokevirtual 356	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   73: pop
    //   74: aload 5
    //   76: astore_3
    //   77: aload 5
    //   79: invokevirtual 248	java/io/FileOutputStream:flush	()V
    //   82: aload 5
    //   84: invokevirtual 252	java/io/FileOutputStream:close	()V
    //   87: return
    //   88: iconst_0
    //   89: istore 4
    //   91: goto -81 -> 10
    //   94: astore_2
    //   95: aconst_null
    //   96: astore_0
    //   97: aload_0
    //   98: astore_3
    //   99: aload_2
    //   100: invokevirtual 229	java/io/FileNotFoundException:printStackTrace	()V
    //   103: aload_0
    //   104: invokevirtual 252	java/io/FileOutputStream:close	()V
    //   107: return
    //   108: astore_0
    //   109: aconst_null
    //   110: astore_3
    //   111: aload_3
    //   112: invokevirtual 252	java/io/FileOutputStream:close	()V
    //   115: aload_0
    //   116: athrow
    //   117: astore_0
    //   118: goto -7 -> 111
    //   121: astore_2
    //   122: aload 5
    //   124: astore_0
    //   125: goto -28 -> 97
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	paramBitmap	Bitmap
    //   0	128	1	paramInt	int
    //   0	128	2	paramCompressFormat	Bitmap.CompressFormat
    //   0	128	3	paramString	String
    //   0	128	4	paramBoolean	boolean
    //   60	63	5	localFileOutputStream	FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   52	62	94	java/io/FileNotFoundException
    //   52	62	108	finally
    //   65	74	117	finally
    //   77	82	117	finally
    //   99	103	117	finally
    //   65	74	121	java/io/FileNotFoundException
    //   77	82	121	java/io/FileNotFoundException
  }
  
  public static long secondsToNow(long paramLong)
  {
    return System.currentTimeMillis() / 1000L - paramLong;
  }
  
  public static void selectPicture(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent("android.intent.action.GET_CONTENT");
    localIntent.setType("image/*");
    localIntent = Intent.createChooser(localIntent, null);
    ((Activity)paramContext).startActivityForResult(localIntent, paramInt);
  }
  
  public static void shake(Context paramContext, boolean paramBoolean)
  {
    paramContext = (Vibrator)paramContext.getSystemService("vibrator");
    if (paramContext == null) {
      return;
    }
    if (paramBoolean)
    {
      paramContext.vibrate(bt, -1);
      return;
    }
    paramContext.cancel();
  }
  
  public static int[] splitToIntArray(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    Object localObject = paramString.split(":");
    paramString = new ArrayList();
    int j = localObject.length;
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        String str = localObject[i];
        if ((str != null) && (str.length() > 0)) {}
        try
        {
          paramString.add(Integer.valueOf(Integer.valueOf(str).intValue()));
          i += 1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            localException.printStackTrace();
            Log.e("MicroMsg.Util", "invalid port num, ignore");
          }
        }
      }
    }
    localObject = new int[paramString.size()];
    i = 0;
    while (i < localObject.length)
    {
      localObject[i] = ((Integer)paramString.get(i)).intValue();
      i += 1;
    }
    return (int[])localObject;
  }
  
  public static List<String> stringsToList(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      localArrayList.add(paramArrayOfString[i]);
      i += 1;
    }
    return localArrayList;
  }
  
  public static long ticksToNow(long paramLong)
  {
    return SystemClock.elapsedRealtime() - paramLong;
  }
  
  public static void transClickToSelect(View paramView1, View paramView2)
  {
    paramView1.setOnTouchListener(new Util.2(paramView2, paramView1));
  }
}


/* Location:              /Users/makito/Apktool/sunshine_app.apk/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/Util.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */