package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000|\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001\u001a+\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\f\u001a\u0012\u0010\r\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0087@\u00a2\u0006\u0002\u0010\u0013\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u0014H\u0087@\u00a2\u0006\u0002\u0010\u0015\u001a?\u0010\u0016\u001a\u00020\u0017*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001d0\u001c\u00a2\u0006\u0002\b\u001e\u001ae\u0010\u001f\u001a\u00020 *\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2)\b\u0002\u0010\u001b\u001a#\b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0%\u0012\u0006\u0012\u0004\u0018\u00010&0$\u00a2\u0006\u0002\b\u001eH\u0086@\u00a2\u0006\u0002\u0010\'\u001a?\u0010(\u001a\u00020)*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001d0\u001c\u00a2\u0006\u0002\b\u001e\u001ae\u0010*\u001a\u00020+*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170\"2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2)\b\u0002\u0010\u001b\u001a#\b\u0001\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0%\u0012\u0006\u0012\u0004\u0018\u00010&0$\u00a2\u0006\u0002\b\u001eH\u0086@\u00a2\u0006\u0002\u0010\'\u001a\u0014\u0010-\u001a\u00020\u001a*\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u00060"}, d2 = {"USER_AGENT", "", "textClean", "getTextClean", "(Ljava/lang/String;)Ljava/lang/String;", "makeLinkSafe", "url", "stripHtml", "txt", "chapterName", "chapterIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "fixUrl", "Lcom/lagradost/quicknovel/MainAPI;", "fixUrlNull", "get", "Lcom/lagradost/nicehttp/NiceResponse;", "Lcom/lagradost/quicknovel/DownloadExtractLink;", "(Lcom/lagradost/quicknovel/DownloadExtractLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/lagradost/quicknovel/DownloadLink;", "(Lcom/lagradost/quicknovel/DownloadLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newChapterData", "Lcom/lagradost/quicknovel/ChapterData;", "name", "fix", "", "initializer", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "newEpubResponse", "Lcom/lagradost/quicknovel/EpubResponse;", "links", "", "Lcom/lagradost/quicknovel/DownloadLinkType;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/lagradost/quicknovel/MainAPI;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newSearchResponse", "Lcom/lagradost/quicknovel/SearchResponse;", "newStreamResponse", "Lcom/lagradost/quicknovel/StreamResponse;", "data", "setStatus", "Lcom/lagradost/quicknovel/LoadResponse;", "status", "app_debug"})
public final class MainAPIKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36";
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String fixUrlNull(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.MainAPI $this$fixUrlNull, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String fixUrl(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.MainAPI $this$fixUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getTextClean(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$textClean) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String stripHtml(@org.jetbrains.annotations.NotNull()
    java.lang.String txt, @org.jetbrains.annotations.Nullable()
    java.lang.String chapterName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer chapterIndex) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.SearchResponse newSearchResponse(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.MainAPI $this$newSearchResponse, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String url, boolean fix, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.lagradost.quicknovel.SearchResponse, kotlin.Unit> initializer) {
        return null;
    }
    
    public static final boolean setStatus(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.LoadResponse $this$setStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String status) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object newStreamResponse(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.MainAPI $this$newStreamResponse, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.util.List<com.lagradost.quicknovel.ChapterData> data, boolean fix, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.lagradost.quicknovel.StreamResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> initializer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.StreamResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String makeLinkSafe(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object get(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.DownloadExtractLink $this$get, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.nicehttp.NiceResponse> $completion) {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object get(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.DownloadLink $this$get, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.nicehttp.NiceResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object newEpubResponse(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.MainAPI $this$newEpubResponse, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.lagradost.quicknovel.DownloadLinkType> links, boolean fix, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.lagradost.quicknovel.EpubResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> initializer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.EpubResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.ChapterData newChapterData(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.MainAPI $this$newChapterData, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String url, boolean fix, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.lagradost.quicknovel.ChapterData, kotlin.Unit> initializer) {
        return null;
    }
}