.class public final Lkq;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcn/apppark/vertify/activity/free/dyn/PicGallery;


# direct methods
.method public constructor <init>(Lcn/apppark/vertify/activity/free/dyn/PicGallery;)V
    .locals 0

    iput-object p1, p0, Lkq;->a:Lcn/apppark/vertify/activity/free/dyn/PicGallery;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    :try_start_0
    check-cast p2, Lcn/apppark/mcd/widget/RemoteImageView;

    invoke-virtual {p2}, Lcn/apppark/mcd/widget/RemoteImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lkq;->a:Lcn/apppark/vertify/activity/free/dyn/PicGallery;

    invoke-virtual {p2}, Lcn/apppark/mcd/widget/RemoteImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v1, v0}, Lcn/apppark/vertify/activity/free/dyn/PicGallery;->a(Lcn/apppark/vertify/activity/free/dyn/PicGallery;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    iget-object v0, p0, Lkq;->a:Lcn/apppark/vertify/activity/free/dyn/PicGallery;

    invoke-static {v0, p3}, Lcn/apppark/vertify/activity/free/dyn/PicGallery;->a(Lcn/apppark/vertify/activity/free/dyn/PicGallery;I)I

    iget-object v0, p0, Lkq;->a:Lcn/apppark/vertify/activity/free/dyn/PicGallery;

    invoke-static {v0}, Lcn/apppark/vertify/activity/free/dyn/PicGallery;->a(Lcn/apppark/vertify/activity/free/dyn/PicGallery;)Lku;

    move-result-object v0

    invoke-virtual {v0}, Lku;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkq;->a:Lcn/apppark/vertify/activity/free/dyn/PicGallery;

    invoke-static {v0}, Lcn/apppark/vertify/activity/free/dyn/PicGallery;->a(Lcn/apppark/vertify/activity/free/dyn/PicGallery;)Lku;

    move-result-object v0

    invoke-virtual {v0}, Lku;->dismiss()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lkq;->a:Lcn/apppark/vertify/activity/free/dyn/PicGallery;

    invoke-static {v0}, Lcn/apppark/vertify/activity/free/dyn/PicGallery;->a(Lcn/apppark/vertify/activity/free/dyn/PicGallery;)Lku;

    move-result-object v0

    iget-object v1, p0, Lkq;->a:Lcn/apppark/vertify/activity/free/dyn/PicGallery;

    invoke-static {v1}, Lcn/apppark/vertify/activity/free/dyn/PicGallery;->b(Lcn/apppark/vertify/activity/free/dyn/PicGallery;)Landroid/widget/Gallery;

    move-result-object v1

    const/16 v2, 0x50

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lku;->showAtLocation(Landroid/view/View;III)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
