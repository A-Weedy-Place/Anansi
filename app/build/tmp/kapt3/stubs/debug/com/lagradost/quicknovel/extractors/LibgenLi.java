package com.lagradost.quicknovel.extractors;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0097@\u00a2\u0006\u0002\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/lagradost/quicknovel/extractors/LibgenLi;", "Lcom/lagradost/quicknovel/extractors/ExtractorApi;", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "name", "getName", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/quicknovel/DownloadLinkType;", "link", "Lcom/lagradost/quicknovel/DownloadExtractLink;", "(Lcom/lagradost/quicknovel/DownloadExtractLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LibgenLi extends com.lagradost.quicknovel.extractors.ExtractorApi {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mainUrl = "https://libgen.li";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = "LibgenLi";
    private final boolean requiresReferer = false;
    
    public LibgenLi() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getMainUrl() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getRequiresReferer() {
        return false;
    }
    
    @java.lang.Override()
    @androidx.annotation.WorkerThread()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getUrl(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.DownloadExtractLink link, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.quicknovel.DownloadLinkType>> $completion) {
        return null;
    }
}