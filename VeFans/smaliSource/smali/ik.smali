.class public final Lik;
.super Landroid/os/Handler;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation


# instance fields
.field final synthetic a:Lcn/apppark/vertify/activity/free/dyn/DynPersonCenter5006;


# direct methods
.method private constructor <init>(Lcn/apppark/vertify/activity/free/dyn/DynPersonCenter5006;)V
    .locals 0

    iput-object p1, p0, Lik;->a:Lcn/apppark/vertify/activity/free/dyn/DynPersonCenter5006;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcn/apppark/vertify/activity/free/dyn/DynPersonCenter5006;Lii;)V
    .locals 0

    invoke-direct {p0, p1}, Lik;-><init>(Lcn/apppark/vertify/activity/free/dyn/DynPersonCenter5006;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "soresult"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "count"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "0"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lik;->a:Lcn/apppark/vertify/activity/free/dyn/DynPersonCenter5006;

    invoke-static {v1}, Lcn/apppark/vertify/activity/free/dyn/DynPersonCenter5006;->b(Lcn/apppark/vertify/activity/free/dyn/DynPersonCenter5006;)Landroid/widget/TextView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, p0, Lik;->a:Lcn/apppark/vertify/activity/free/dyn/DynPersonCenter5006;

    invoke-static {v1}, Lcn/apppark/vertify/activity/free/dyn/DynPersonCenter5006;->b(Lcn/apppark/vertify/activity/free/dyn/DynPersonCenter5006;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lik;->a:Lcn/apppark/vertify/activity/free/dyn/DynPersonCenter5006;

    invoke-static {v0}, Lcn/apppark/vertify/activity/free/dyn/DynPersonCenter5006;->b(Lcn/apppark/vertify/activity/free/dyn/DynPersonCenter5006;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method
