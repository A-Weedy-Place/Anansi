package com.lagradost.quicknovel.ui.mainpage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J:\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0086@\u00a2\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/lagradost/quicknovel/ui/mainpage/MainPageRepository;", "", "api", "Lcom/lagradost/quicknovel/APIRepository;", "(Lcom/lagradost/quicknovel/APIRepository;)V", "getApi", "()Lcom/lagradost/quicknovel/APIRepository;", "loadMainPage", "Lcom/lagradost/quicknovel/mvvm/Resource;", "Lcom/lagradost/quicknovel/HeadMainPageResponse;", "page", "", "mainCategory", "orderBy", "tag", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/quicknovel/SearchResponse;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MainPageRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.APIRepository api = null;
    
    public MainPageRepository(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.APIRepository api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.APIRepository getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadMainPage(int page, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mainCategory, @org.jetbrains.annotations.Nullable()
    java.lang.Integer orderBy, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tag, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.mvvm.Resource<com.lagradost.quicknovel.HeadMainPageResponse>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object search(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.mvvm.Resource<? extends java.util.List<com.lagradost.quicknovel.SearchResponse>>> $completion) {
        return null;
    }
}