.class Lcn/apppark/vertify/activity/free/dyn/STogetherBase$5;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcn/apppark/vertify/activity/free/dyn/STogetherBase;


# direct methods
.method constructor <init>(Lcn/apppark/vertify/activity/free/dyn/STogetherBase;)V
    .locals 0

    iput-object p1, p0, Lcn/apppark/vertify/activity/free/dyn/STogetherBase$5;->a:Lcn/apppark/vertify/activity/free/dyn/STogetherBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    const/4 v2, 0x0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move v1, v2

    :goto_0
    iget-object v0, p0, Lcn/apppark/vertify/activity/free/dyn/STogetherBase$5;->a:Lcn/apppark/vertify/activity/free/dyn/STogetherBase;

    invoke-static {v0}, Lcn/apppark/vertify/activity/free/dyn/STogetherBase;->f(Lcn/apppark/vertify/activity/free/dyn/STogetherBase;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Lcn/apppark/vertify/activity/free/dyn/STogetherBase$5;->a:Lcn/apppark/vertify/activity/free/dyn/STogetherBase;

    invoke-static {v0}, Lcn/apppark/vertify/activity/free/dyn/STogetherBase;->f(Lcn/apppark/vertify/activity/free/dyn/STogetherBase;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iget-object v4, p0, Lcn/apppark/vertify/activity/free/dyn/STogetherBase$5;->a:Lcn/apppark/vertify/activity/free/dyn/STogetherBase;

    invoke-virtual {v4}, Lcn/apppark/vertify/activity/free/dyn/STogetherBase;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0201b8

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setTextColor(I)V

    iget-object v0, p0, Lcn/apppark/vertify/activity/free/dyn/STogetherBase$5;->a:Lcn/apppark/vertify/activity/free/dyn/STogetherBase;

    invoke-static {v0}, Lcn/apppark/vertify/activity/free/dyn/STogetherBase;->g(Lcn/apppark/vertify/activity/free/dyn/STogetherBase;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/16 v4, 0x8

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcn/apppark/vertify/activity/free/dyn/STogetherBase$5;->a:Lcn/apppark/vertify/activity/free/dyn/STogetherBase;

    invoke-static {v0}, Lcn/apppark/vertify/activity/free/dyn/STogetherBase;->f(Lcn/apppark/vertify/activity/free/dyn/STogetherBase;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget-object v1, Lcn/apppark/ckj10185912/YYGYContants;->PERSIONCENTER_TOP_COLOR:Ljava/lang/String;

    invoke-static {v0, v1}, Lcn/apppark/mcd/util/FunctionPublic;->setTextColor(Landroid/widget/TextView;Ljava/lang/String;)V

    iget-object v0, p0, Lcn/apppark/vertify/activity/free/dyn/STogetherBase$5;->a:Lcn/apppark/vertify/activity/free/dyn/STogetherBase;

    invoke-static {v0}, Lcn/apppark/vertify/activity/free/dyn/STogetherBase;->g(Lcn/apppark/vertify/activity/free/dyn/STogetherBase;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, p0, Lcn/apppark/vertify/activity/free/dyn/STogetherBase$5;->a:Lcn/apppark/vertify/activity/free/dyn/STogetherBase;

    iget-object v0, p0, Lcn/apppark/vertify/activity/free/dyn/STogetherBase$5;->a:Lcn/apppark/vertify/activity/free/dyn/STogetherBase;

    invoke-static {v0}, Lcn/apppark/vertify/activity/free/dyn/STogetherBase;->h(Lcn/apppark/vertify/activity/free/dyn/STogetherBase;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/apppark/mcd/vo/dyn/DynMsgGroupVo;

    invoke-virtual {v0}, Lcn/apppark/mcd/vo/dyn/DynMsgGroupVo;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcn/apppark/vertify/activity/free/dyn/STogetherBase;->a(Lcn/apppark/vertify/activity/free/dyn/STogetherBase;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcn/apppark/vertify/activity/free/dyn/STogetherBase$5;->a:Lcn/apppark/vertify/activity/free/dyn/STogetherBase;

    invoke-static {v0}, Lcn/apppark/vertify/activity/free/dyn/STogetherBase;->i(Lcn/apppark/vertify/activity/free/dyn/STogetherBase;)V

    return-void
.end method
