package com.nostra13.universalimageloader.core.display;

import android.graphics.Bitmap;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;

public class RoundedVignetteBitmapDisplayer$RoundedVignetteDrawable
  extends RoundedBitmapDisplayer.RoundedDrawable
{
  RoundedVignetteBitmapDisplayer$RoundedVignetteDrawable(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    super(paramBitmap, paramInt1, paramInt2);
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    float f1 = this.mRect.centerX();
    float f2 = this.mRect.centerY() * 1.0F / 0.7F;
    float f3 = this.mRect.centerX();
    paramRect = Shader.TileMode.CLAMP;
    paramRect = new RadialGradient(f1, f2, f3 * 1.3F, new int[] { 0, 0, 2130706432 }, new float[] { 0.0F, 0.7F, 1.0F }, paramRect);
    Matrix localMatrix = new Matrix();
    localMatrix.setScale(1.0F, 0.7F);
    paramRect.setLocalMatrix(localMatrix);
    this.paint.setShader(new ComposeShader(this.bitmapShader, paramRect, PorterDuff.Mode.SRC_OVER));
  }
}


/* Location:              /Users/makito/Apktool/sunshine_app.apk/classes-dex2jar.jar!/com/nostra13/universalimageloader/core/display/RoundedVignetteBitmapDisplayer$RoundedVignetteDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */