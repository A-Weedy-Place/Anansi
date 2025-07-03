package com.lagradost.quicknovel.providers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u001eJ4\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010$\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010\u000fH\u0096@\u00a2\u0006\u0002\u0010&J\u001c\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u00172\u0006\u0010)\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000fX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000fX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00180\u0017X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006*"}, d2 = {"Lcom/lagradost/quicknovel/providers/WPReader;", "Lcom/lagradost/quicknovel/MainAPI;", "()V", "hasMainPage", "", "getHasMainPage", "()Z", "iconBackgroundId", "", "getIconBackgroundId", "()I", "iconId", "getIconId", "()Ljava/lang/Integer;", "lang", "", "getLang", "()Ljava/lang/String;", "mainUrl", "getMainUrl", "name", "getName", "tags", "", "Lkotlin/Pair;", "getTags", "()Ljava/util/List;", "load", "Lcom/lagradost/quicknovel/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadHtml", "loadMainPage", "Lcom/lagradost/quicknovel/HeadMainPageResponse;", "page", "mainCategory", "orderBy", "tag", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/lagradost/quicknovel/SearchResponse;", "query", "app_debug"})
public abstract class WPReader extends com.lagradost.quicknovel.MainAPI {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = "";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mainUrl = "";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lang = "id";
    private final int iconId = 0;
    private final boolean hasMainPage = true;
    private final int iconBackgroundId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> tags = null;
    
    public WPReader() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getMainUrl() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLang() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Integer getIconId() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getHasMainPage() {
        return false;
    }
    
    @java.lang.Override()
    public int getIconBackgroundId() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getTags() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object loadMainPage(int page, @org.jetbrains.annotations.Nullable()
    java.lang.String mainCategory, @org.jetbrains.annotations.Nullable()
    java.lang.String orderBy, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.HeadMainPageResponse> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object loadHtml(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object search(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.lagradost.quicknovel.SearchResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.LoadResponse> $completion) {
        return null;
    }
}