package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ?2\u00020\u0001:\u0001?B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020\u00172\b\b\u0002\u0010-\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010.J\u0018\u0010/\u001a\u0004\u0018\u00010\u00172\u0006\u0010,\u001a\u00020\u0017H\u0086@\u00a2\u0006\u0002\u00100J:\u00101\u001a\b\u0012\u0004\u0012\u0002020*2\u0006\u00103\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u00172\b\u00105\u001a\u0004\u0018\u00010\u00172\b\u00106\u001a\u0004\u0018\u00010\u0017H\u0086@\u00a2\u0006\u0002\u00107J4\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00150*2\u0006\u0010,\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u000e2\b\b\u0002\u0010:\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010;J\"\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00150*2\u0006\u0010>\u001a\u00020\u0017H\u0086@\u00a2\u0006\u0002\u00100R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00160\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR#\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00160\u00158F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0019R\u0011\u0010!\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R#\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00160\u00158F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u0019R\u0011\u0010\'\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010$\u00a8\u0006@"}, d2 = {"Lcom/lagradost/quicknovel/APIRepository;", "", "api", "Lcom/lagradost/quicknovel/MainAPI;", "(Lcom/lagradost/quicknovel/MainAPI;)V", "getApi", "()Lcom/lagradost/quicknovel/MainAPI;", "hasMainPage", "", "getHasMainPage", "()Z", "hasReviews", "getHasReviews", "iconBackgroundId", "", "getIconBackgroundId", "()I", "iconId", "getIconId", "()Ljava/lang/Integer;", "mainCategories", "", "Lkotlin/Pair;", "", "getMainCategories", "()Ljava/util/List;", "mainUrl", "getMainUrl", "()Ljava/lang/String;", "name", "getName", "orderBys", "getOrderBys", "rateLimitTime", "", "getRateLimitTime", "()J", "tags", "getTags", "unixTime", "getUnixTime", "load", "Lcom/lagradost/quicknovel/mvvm/Resource;", "Lcom/lagradost/quicknovel/LoadResponse;", "url", "allowCache", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadHtml", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMainPage", "Lcom/lagradost/quicknovel/HeadMainPageResponse;", "page", "mainCategory", "orderBy", "tag", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadReviews", "Lcom/lagradost/quicknovel/UserReview;", "showSpoilers", "(Ljava/lang/String;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/lagradost/quicknovel/SearchResponse;", "query", "Companion", "app_debug"})
public final class APIRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.MainAPI api = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashSet<java.lang.String> providersActive;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.lagradost.quicknovel.APIRepository.Companion.SavedLoadResponse> cache = null;
    private static int cacheIndex = 0;
    public static final int cacheSize = 20;
    public static final int cacheTimeSec = 600;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.APIRepository.Companion Companion = null;
    
    public APIRepository(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.MainAPI api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.MainAPI getApi() {
        return null;
    }
    
    public final long getUnixTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMainUrl() {
        return null;
    }
    
    public final boolean getHasReviews() {
        return false;
    }
    
    public final long getRateLimitTime() {
        return 0L;
    }
    
    public final boolean getHasMainPage() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIconId() {
        return null;
    }
    
    public final int getIconBackgroundId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getMainCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getOrderBys() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object load(@org.jetbrains.annotations.NotNull()
    java.lang.String url, boolean allowCache, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.mvvm.Resource<? extends com.lagradost.quicknovel.LoadResponse>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object search(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.mvvm.Resource<? extends java.util.List<com.lagradost.quicknovel.SearchResponse>>> $completion) {
        return null;
    }
    
    /**
     * Automatically strips adsbygoogle
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadHtml(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadReviews(@org.jetbrains.annotations.NotNull()
    java.lang.String url, int page, boolean showSpoilers, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.mvvm.Resource<? extends java.util.List<com.lagradost.quicknovel.UserReview>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadMainPage(int page, @org.jetbrains.annotations.Nullable()
    java.lang.String mainCategory, @org.jetbrains.annotations.Nullable()
    java.lang.String orderBy, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.mvvm.Resource<com.lagradost.quicknovel.HeadMainPageResponse>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0012"}, d2 = {"Lcom/lagradost/quicknovel/APIRepository$Companion;", "", "()V", "cache", "", "Lcom/lagradost/quicknovel/APIRepository$Companion$SavedLoadResponse;", "cacheIndex", "", "cacheSize", "cacheTimeSec", "providersActive", "Ljava/util/HashSet;", "", "getProvidersActive", "()Ljava/util/HashSet;", "setProvidersActive", "(Ljava/util/HashSet;)V", "SavedLoadResponse", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashSet<java.lang.String> getProvidersActive() {
            return null;
        }
        
        public final void setProvidersActive(@org.jetbrains.annotations.NotNull()
        java.util.HashSet<java.lang.String> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\bH\u00d6\u0001R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/lagradost/quicknovel/APIRepository$Companion$SavedLoadResponse;", "", "unixTime", "", "response", "Lcom/lagradost/quicknovel/LoadResponse;", "hash", "Lkotlin/Pair;", "", "(JLcom/lagradost/quicknovel/LoadResponse;Lkotlin/Pair;)V", "getHash", "()Lkotlin/Pair;", "getResponse", "()Lcom/lagradost/quicknovel/LoadResponse;", "getUnixTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
        public static final class SavedLoadResponse {
            private final long unixTime = 0L;
            @org.jetbrains.annotations.NotNull()
            private final com.lagradost.quicknovel.LoadResponse response = null;
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Pair<java.lang.String, java.lang.String> hash = null;
            
            public SavedLoadResponse(long unixTime, @org.jetbrains.annotations.NotNull()
            com.lagradost.quicknovel.LoadResponse response, @org.jetbrains.annotations.NotNull()
            kotlin.Pair<java.lang.String, java.lang.String> hash) {
                super();
            }
            
            public final long getUnixTime() {
                return 0L;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.lagradost.quicknovel.LoadResponse getResponse() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlin.Pair<java.lang.String, java.lang.String> getHash() {
                return null;
            }
            
            public final long component1() {
                return 0L;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.lagradost.quicknovel.LoadResponse component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlin.Pair<java.lang.String, java.lang.String> component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.lagradost.quicknovel.APIRepository.Companion.SavedLoadResponse copy(long unixTime, @org.jetbrains.annotations.NotNull()
            com.lagradost.quicknovel.LoadResponse response, @org.jetbrains.annotations.NotNull()
            kotlin.Pair<java.lang.String, java.lang.String> hash) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
        }
    }
}