.class Lcn/apppark/vertify/base/PushWebView$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcn/apppark/vertify/base/PushWebView;


# direct methods
.method constructor <init>(Lcn/apppark/vertify/base/PushWebView;)V
    .locals 0

    iput-object p1, p0, Lcn/apppark/vertify/base/PushWebView$1;->a:Lcn/apppark/vertify/base/PushWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcn/apppark/vertify/base/PushWebView$1;->a:Lcn/apppark/vertify/base/PushWebView;

    invoke-static {v0}, Lcn/apppark/vertify/base/PushWebView;->a(Lcn/apppark/vertify/base/PushWebView;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcn/apppark/vertify/base/PushWebView$1;->a:Lcn/apppark/vertify/base/PushWebView;

    invoke-static {v0}, Lcn/apppark/vertify/base/PushWebView;->b(Lcn/apppark/vertify/base/PushWebView;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcn/apppark/vertify/base/PushWebView$1;->a:Lcn/apppark/vertify/base/PushWebView;

    invoke-static {v0}, Lcn/apppark/vertify/base/PushWebView;->c(Lcn/apppark/vertify/base/PushWebView;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lcn/apppark/vertify/base/PushWebView$1;->a:Lcn/apppark/vertify/base/PushWebView;

    invoke-static {v0, v2}, Lcn/apppark/vertify/base/PushWebView;->a(Lcn/apppark/vertify/base/PushWebView;I)I

    return-void
.end method
