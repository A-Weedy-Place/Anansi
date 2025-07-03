package com.lagradost.quicknovel.extractors;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0087@\u00a2\u0006\u0002\u0010\u0016J\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0097@\u00a2\u0006\u0002\u0010\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/lagradost/quicknovel/extractors/ExtractorApi;", "", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "mainUrlNoHttp", "getMainUrlNoHttp", "mainUrlNoHttp$delegate", "Lkotlin/Lazy;", "name", "getName", "requiresReferer", "", "getRequiresReferer", "()Z", "getSafeUrl", "", "Lcom/lagradost/quicknovel/DownloadLinkType;", "link", "Lcom/lagradost/quicknovel/DownloadExtractLink;", "(Lcom/lagradost/quicknovel/DownloadExtractLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUrl", "Companion", "app_debug"})
public abstract class ExtractorApi {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.lagradost.quicknovel.extractors.ExtractorApi> extractors = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mainUrlNoHttp$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.extractors.ExtractorApi.Companion Companion = null;
    
    public ExtractorApi() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getMainUrl();
    
    public abstract boolean getRequiresReferer();
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMainUrlNoHttp() {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSafeUrl(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.DownloadExtractLink link, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.quicknovel.DownloadLinkType>> $completion) {
        return null;
    }
    
    /**
     * Will throw errors, use getSafeUrl if you don't want to handle the exception yourself
     */
    @androidx.annotation.WorkerThread()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getUrl(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.DownloadExtractLink link, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.quicknovel.DownloadLinkType>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/lagradost/quicknovel/extractors/ExtractorApi$Companion;", "", "()V", "extractors", "", "Lcom/lagradost/quicknovel/extractors/ExtractorApi;", "extract", "Lcom/lagradost/quicknovel/DownloadLink;", "links", "Lcom/lagradost/quicknovel/DownloadLinkType;", "depth", "", "(Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removePrefixHttp", "", "url", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String removePrefixHttp(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return null;
        }
        
        /**
         * recursive extraction of links
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object extract(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.lagradost.quicknovel.DownloadLinkType> links, int depth, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<com.lagradost.quicknovel.DownloadLink>> $completion) {
            return null;
        }
    }
}