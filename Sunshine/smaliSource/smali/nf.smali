.class public final Lnf;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcn/apppark/vertify/activity/free/typegallery/SelfGalleryView4012;


# direct methods
.method public constructor <init>(Lcn/apppark/vertify/activity/free/typegallery/SelfGalleryView4012;)V
    .locals 0

    iput-object p1, p0, Lnf;->a:Lcn/apppark/vertify/activity/free/typegallery/SelfGalleryView4012;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object v0, p0, Lnf;->a:Lcn/apppark/vertify/activity/free/typegallery/SelfGalleryView4012;

    invoke-static {v0}, Lcn/apppark/vertify/activity/free/typegallery/SelfGalleryView4012;->g(Lcn/apppark/vertify/activity/free/typegallery/SelfGalleryView4012;)Lcn/apppark/vertify/activity/free/typegallery/SelfGalleryView4012$PublicHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcn/apppark/vertify/activity/free/typegallery/SelfGalleryView4012$PublicHandler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    iput p3, v0, Landroid/os/Message;->arg1:I

    const/4 v1, 0x2

    iput v1, v0, Landroid/os/Message;->what:I

    iget-object v1, p0, Lnf;->a:Lcn/apppark/vertify/activity/free/typegallery/SelfGalleryView4012;

    invoke-static {v1}, Lcn/apppark/vertify/activity/free/typegallery/SelfGalleryView4012;->g(Lcn/apppark/vertify/activity/free/typegallery/SelfGalleryView4012;)Lcn/apppark/vertify/activity/free/typegallery/SelfGalleryView4012$PublicHandler;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcn/apppark/vertify/activity/free/typegallery/SelfGalleryView4012$PublicHandler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
