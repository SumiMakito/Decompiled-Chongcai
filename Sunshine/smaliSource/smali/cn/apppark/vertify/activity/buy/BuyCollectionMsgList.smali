.class public Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;
.super Lcn/apppark/vertify/activity/buy/BuyBaseAct;

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final DEL_DATA:I = 0x3

.field private static final INIT_DATA:I = 0x1

.field public static final METHOD:Ljava/lang/String; = "newsFavorites"

.field public static final METHOD_DEL:Ljava/lang/String; = "deleteNewsFavorites"

.field private static final REF_DATA:I = 0x2


# instance fields
.field private adapter:Lcn/apppark/vertify/activity/buy/adapter/BuyCollectionMsgAdapter;

.field private btn_back:Landroid/widget/Button;

.field private context:Landroid/content/Context;

.field private currentDelPositon:I

.field private currentPage:I

.field private handler:Lcl;

.field private isFinish:Z

.field private itemList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcn/apppark/mcd/vo/dyn/DynMsgListReturnVo;",
            ">;"
        }
    .end annotation
.end field

.field private itemListTemp:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcn/apppark/mcd/vo/dyn/DynMsgListReturnVo;",
            ">;"
        }
    .end annotation
.end field

.field private listView:Lcn/apppark/mcd/widget/PullDownListView;

.field private ll_null:Landroid/widget/LinearLayout;

.field private load:Lcn/apppark/mcd/widget/LoadDataProgress;

.field private loadDialog:Landroid/app/Dialog;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x1

    invoke-direct {p0}, Lcn/apppark/vertify/activity/buy/BuyBaseAct;-><init>()V

    iput-object p0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->context:Landroid/content/Context;

    iput v1, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->currentPage:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->itemList:Ljava/util/ArrayList;

    iput-boolean v1, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->isFinish:Z

    return-void
.end method

.method public static synthetic a(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;I)I
    .locals 0

    iput p1, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->currentDelPositon:I

    return p1
.end method

.method public static synthetic a(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;Lcn/apppark/vertify/activity/buy/adapter/BuyCollectionMsgAdapter;)Lcn/apppark/vertify/activity/buy/adapter/BuyCollectionMsgAdapter;
    .locals 0

    iput-object p1, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->adapter:Lcn/apppark/vertify/activity/buy/adapter/BuyCollectionMsgAdapter;

    return-object p1
.end method

.method public static synthetic a(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    iput-object p1, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->itemListTemp:Ljava/util/ArrayList;

    return-object p1
.end method

.method public static synthetic a(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->currentPage:I

    iget v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->currentPage:I

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->getData(II)V

    return-void
.end method

.method public static synthetic a(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;II)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->getData(II)V

    return-void
.end method

.method public static synthetic a(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->initToast(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;Z)Z
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->isFinish:Z

    return v0
.end method

.method public static synthetic b(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)I
    .locals 1

    iget v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->currentPage:I

    return v0
.end method

.method public static synthetic b(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    iput-object p1, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->itemList:Ljava/util/ArrayList;

    return-object p1
.end method

.method public static synthetic b(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->initToast(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic c(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->itemList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static synthetic c(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->initToast(Ljava/lang/String;I)V

    return-void
.end method

.method private checkResult()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->itemList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcn/apppark/ckj10185912/HQCHApplication;->instance:Lcn/apppark/ckj10185912/HQCHApplication;

    const-string v1, "\u6682\u65e0\u6536\u85cf"

    invoke-virtual {v0, v1, v2}, Lcn/apppark/ckj10185912/HQCHApplication;->initToast(Ljava/lang/String;I)V

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->ll_null:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_0
    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->itemList:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->itemList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v1, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->listView:Lcn/apppark/mcd/widget/PullDownListView;

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->itemList:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/apppark/mcd/vo/dyn/DynMsgListReturnVo;

    invoke-virtual {v0}, Lcn/apppark/mcd/vo/dyn/DynMsgListReturnVo;->getCount()I

    move-result v0

    iget-object v2, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->itemList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lcn/apppark/mcd/widget/PullDownListView;->onFootNodata(II)V

    :goto_1
    return-void

    :cond_0
    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->ll_null:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->listView:Lcn/apppark/mcd/widget/PullDownListView;

    invoke-virtual {v0, v2, v2}, Lcn/apppark/mcd/widget/PullDownListView;->onFootNodata(II)V

    goto :goto_1
.end method

.method public static synthetic d(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->context:Landroid/content/Context;

    return-object v0
.end method

.method private delData(Ljava/lang/String;I)V
    .locals 8

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "appId"

    const-string v2, "10185912"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "memberId"

    invoke-virtual {p0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->getInfo()Lcn/apppark/vertify/base/ClientPersionInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcn/apppark/vertify/base/ClientPersionInfo;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "id"

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcn/apppark/vertify/network/request/WebServicePool;

    iget-object v2, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->handler:Lcl;

    const-string v3, "json"

    invoke-virtual {p0, v1}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->map2Json(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "http://ws.ckj.hqch.com"

    const-string v6, "http://www.apppark.cn/member.ws"

    const-string v7, "deleteNewsFavorites"

    move v1, p2

    invoke-direct/range {v0 .. v7}, Lcn/apppark/vertify/network/request/WebServicePool;-><init>(ILandroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v0}, Lcn/apppark/vertify/network/request/WebServicePool;->doRequest(Lcn/apppark/vertify/network/request/NetWorkRequest;)V

    return-void
.end method

.method public static synthetic e(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)Lcn/apppark/mcd/widget/PullDownListView;
    .locals 1

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->listView:Lcn/apppark/mcd/widget/PullDownListView;

    return-object v0
.end method

.method public static synthetic f(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)Lcn/apppark/vertify/activity/buy/adapter/BuyCollectionMsgAdapter;
    .locals 1

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->adapter:Lcn/apppark/vertify/activity/buy/adapter/BuyCollectionMsgAdapter;

    return-object v0
.end method

.method public static synthetic g(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)Lcn/apppark/mcd/widget/LoadDataProgress;
    .locals 1

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->load:Lcn/apppark/mcd/widget/LoadDataProgress;

    return-object v0
.end method

.method private getData(II)V
    .locals 8

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "appId"

    const-string v2, "10185912"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "memberId"

    invoke-virtual {p0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->getInfo()Lcn/apppark/vertify/base/ClientPersionInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcn/apppark/vertify/base/ClientPersionInfo;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "currPage"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "pageSize"

    const/16 v2, 0x14

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcn/apppark/vertify/network/request/WebServicePool;

    iget-object v2, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->handler:Lcl;

    const-string v3, "json"

    invoke-virtual {p0, v1}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->map2Json(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "http://ws.ckj.hqch.com"

    const-string v6, "http://www.apppark.cn/member.ws"

    const-string v7, "newsFavorites"

    move v1, p2

    invoke-direct/range {v0 .. v7}, Lcn/apppark/vertify/network/request/WebServicePool;-><init>(ILandroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v0}, Lcn/apppark/vertify/network/request/WebServicePool;->doRequest(Lcn/apppark/vertify/network/request/NetWorkRequest;)V

    return-void
.end method

.method public static synthetic h(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->itemListTemp:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static synthetic i(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)I
    .locals 2

    iget v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->currentPage:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->currentPage:I

    return v0
.end method

.method private initWidget()V
    .locals 3

    const v0, 0x7f0a0001

    invoke-virtual {p0, v0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    sget-object v1, Lcn/apppark/ckj10185912/YYGYContants;->PERSIONCENTER_TOP_COLOR:Ljava/lang/String;

    invoke-static {v1, v0}, Lcn/apppark/mcd/util/FunctionPublic;->setBackgroundColor(Ljava/lang/String;Landroid/view/View;)V

    const v0, 0x7f0a0028

    invoke-virtual {p0, v0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->ll_null:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->ll_null:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    const v0, 0x7f0a0040

    invoke-virtual {p0, v0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->btn_back:Landroid/widget/Button;

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->btn_back:Landroid/widget/Button;

    invoke-static {v0}, Lcn/apppark/mcd/util/ButtonColorFilter;->setButtonFocusChanged(Landroid/view/View;)V

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->btn_back:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0041

    invoke-virtual {p0, v0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcn/apppark/mcd/widget/PullDownListView;

    iput-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->listView:Lcn/apppark/mcd/widget/PullDownListView;

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->listView:Lcn/apppark/mcd/widget/PullDownListView;

    new-instance v1, Lcf;

    invoke-direct {v1, p0}, Lcf;-><init>(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcn/apppark/mcd/widget/PullDownListView;->setonRefreshListener(Lcn/apppark/mcd/widget/PullDownListView$OnRefreshListener;Z)V

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->listView:Lcn/apppark/mcd/widget/PullDownListView;

    new-instance v1, Lcg;

    invoke-direct {v1, p0}, Lcg;-><init>(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)V

    invoke-virtual {v0, v1}, Lcn/apppark/mcd/widget/PullDownListView;->setonFootRefreshListener(Lcn/apppark/mcd/widget/PullDownListView$OnFootRefreshListener;)V

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->listView:Lcn/apppark/mcd/widget/PullDownListView;

    new-instance v1, Lch;

    invoke-direct {v1, p0}, Lch;-><init>(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)V

    invoke-virtual {v0, v1}, Lcn/apppark/mcd/widget/PullDownListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->listView:Lcn/apppark/mcd/widget/PullDownListView;

    new-instance v1, Lci;

    invoke-direct {v1, p0}, Lci;-><init>(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)V

    invoke-virtual {v0, v1}, Lcn/apppark/mcd/widget/PullDownListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void
.end method

.method public static synthetic j(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)V
    .locals 0

    invoke-direct {p0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->checkResult()V

    return-void
.end method

.method public static synthetic k(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)Landroid/app/Dialog;
    .locals 1

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->loadDialog:Landroid/app/Dialog;

    return-object v0
.end method

.method public static synthetic l(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)I
    .locals 1

    iget v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->currentDelPositon:I

    return v0
.end method

.method public static synthetic m(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;)Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->ll_null:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private refData()V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->currentPage:I

    iget v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->currentPage:I

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->getData(II)V

    return-void
.end method


# virtual methods
.method public del()V
    .locals 2

    iget-boolean v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->isFinish:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->loadDialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->isFinish:Z

    iget-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->itemList:Ljava/util/ArrayList;

    iget v1, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->currentDelPositon:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/apppark/mcd/vo/dyn/DynMsgListReturnVo;

    invoke-virtual {v0}, Lcn/apppark/mcd/vo/dyn/DynMsgListReturnVo;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->delData(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    invoke-virtual {p0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->finish()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x7f0a0040
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lcn/apppark/vertify/activity/buy/BuyBaseAct;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f030008

    invoke-virtual {p0, v0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->setContentView(I)V

    const v0, 0x7f080024

    invoke-virtual {p0, v0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->createLoadingDialog(I)Landroid/app/Dialog;

    move-result-object v0

    iput-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->loadDialog:Landroid/app/Dialog;

    const v0, 0x7f0a0011

    invoke-virtual {p0, v0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcn/apppark/mcd/widget/LoadDataProgress;

    iput-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->load:Lcn/apppark/mcd/widget/LoadDataProgress;

    new-instance v0, Lcl;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcl;-><init>(Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;Lcf;)V

    iput-object v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->handler:Lcl;

    invoke-direct {p0}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->initWidget()V

    iget v0, p0, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->currentPage:I

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcn/apppark/vertify/activity/buy/BuyCollectionMsgList;->getData(II)V

    return-void
.end method
