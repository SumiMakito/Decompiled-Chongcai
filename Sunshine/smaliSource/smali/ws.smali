.class public final Lws;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcn/apppark/vertify/network/request/HttpPostRequestPool;


# direct methods
.method public constructor <init>(Lcn/apppark/vertify/network/request/HttpPostRequestPool;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lws;->b:Lcn/apppark/vertify/network/request/HttpPostRequestPool;

    iput-object p2, p0, Lws;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lws;->b:Lcn/apppark/vertify/network/request/HttpPostRequestPool;

    iget-object v0, v0, Lcn/apppark/vertify/network/request/HttpPostRequestPool;->onSuccessListener:Lcn/apppark/vertify/network/request/NetWorkRequest$OnSuccessListener;

    iget-object v1, p0, Lws;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcn/apppark/vertify/network/request/NetWorkRequest$OnSuccessListener;->onResponse(Ljava/lang/String;)V

    return-void
.end method
