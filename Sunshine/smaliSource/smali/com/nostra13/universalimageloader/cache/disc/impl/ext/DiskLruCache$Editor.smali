.class public final Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;
.super Ljava/lang/Object;


# instance fields
.field final synthetic a:Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;

.field private committed:Z

.field private final entry:Lxa;

.field private hasErrors:Z

.field private final written:[Z


# direct methods
.method private constructor <init>(Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;Lxa;)V
    .locals 1

    iput-object p1, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->a:Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->entry:Lxa;

    iget-boolean v0, p2, Lxa;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->written:[Z

    return-void

    :cond_0
    invoke-static {p1}, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;->f(Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;)I

    move-result v0

    new-array v0, v0, [Z

    goto :goto_0
.end method

.method synthetic constructor <init>(Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;Lxa;Lwx;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;-><init>(Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;Lxa;)V

    return-void
.end method

.method static synthetic a(Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;)Lxa;
    .locals 1

    iget-object v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->entry:Lxa;

    return-object v0
.end method

.method public static synthetic a(Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;Z)Z
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->hasErrors:Z

    return v0
.end method

.method static synthetic b(Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;)[Z
    .locals 1

    iget-object v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->written:[Z

    return-object v0
.end method


# virtual methods
.method public final abort()V
    .locals 2

    iget-object v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->a:Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;->a(Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;Z)V

    return-void
.end method

.method public final abortUnlessCommitted()V
    .locals 2

    iget-boolean v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->committed:Z

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->a:Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;->a(Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final commit()V
    .locals 3

    const/4 v2, 0x1

    iget-boolean v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->hasErrors:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->a:Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;->a(Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;Z)V

    iget-object v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->a:Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;

    iget-object v1, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->entry:Lxa;

    iget-object v1, v1, Lxa;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;->c(Ljava/lang/String;)Z

    :goto_0
    iput-boolean v2, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->committed:Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->a:Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;

    invoke-static {v0, p0, v2}, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;->a(Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;Z)V

    goto :goto_0
.end method

.method public final getString(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->newInputStream(I)Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final newInputStream(I)Ljava/io/InputStream;
    .locals 4

    const/4 v0, 0x0

    iget-object v2, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->a:Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;

    monitor-enter v2

    :try_start_0
    iget-object v1, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->entry:Lxa;

    iget-object v1, v1, Lxa;->d:Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;

    if-eq v1, p0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->entry:Lxa;

    iget-boolean v1, v1, Lxa;->c:Z

    if-nez v1, :cond_1

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    return-object v0

    :cond_1
    :try_start_2
    new-instance v1, Ljava/io/FileInputStream;

    iget-object v3, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->entry:Lxa;

    invoke-virtual {v3, p1}, Lxa;->a(I)Ljava/io/File;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception v1

    monitor-exit v2

    goto :goto_0
.end method

.method public final newOutputStream(I)Ljava/io/OutputStream;
    .locals 4

    iget-object v2, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->a:Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->entry:Lxa;

    iget-object v0, v0, Lxa;->d:Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;

    if-eq v0, p0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->entry:Lxa;

    iget-boolean v0, v0, Lxa;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->written:[Z

    const/4 v1, 0x1

    aput-boolean v1, v0, p1

    :cond_1
    iget-object v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->entry:Lxa;

    invoke-virtual {v0, p1}, Lxa;->b(I)Ljava/io/File;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    :try_start_2
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v1, v0

    :goto_0
    :try_start_3
    new-instance v0, Lwz;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v3}, Lwz;-><init>(Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;Ljava/io/OutputStream;Lwx;)V

    monitor-exit v2

    :goto_1
    return-object v0

    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->a:Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;

    invoke-static {v0}, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;->g(Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v1, v0

    goto :goto_0

    :catch_1
    move-exception v0

    :try_start_5
    invoke-static {}, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache;->e()Ljava/io/OutputStream;

    move-result-object v0

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1
.end method

.method public final set(ILjava/lang/String;)V
    .locals 4

    const/4 v2, 0x0

    :try_start_0
    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-virtual {p0, p1}, Lcom/nostra13/universalimageloader/cache/disc/impl/ext/DiskLruCache$Editor;->newOutputStream(I)Ljava/io/OutputStream;

    move-result-object v0

    sget-object v3, Lxd;->b:Ljava/nio/charset/Charset;

    invoke-direct {v1, v0, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-static {v1}, Lxd;->a(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_0
    invoke-static {v1}, Lxd;->a(Ljava/io/Closeable;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_0
.end method
