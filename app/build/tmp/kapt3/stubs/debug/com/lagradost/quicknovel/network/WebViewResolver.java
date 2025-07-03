package com.lagradost.quicknovel.network;

/**
 * When used as Interceptor additionalUrls cannot be returned, use WebViewResolver(...).resolveUsingWebView(...)
 * @param interceptUrl will stop the WebView when reaching this url.
 * @param additionalUrls this will make resolveUsingWebView also return all other requests matching the list of Regex.
 * @param userAgent if null then will use the default user agent
 * @param useOkhttp will try to use the okhttp client as much as possible, but this might cause some requests to fail. Disable for cloudflare.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016JV\u0010\u0017\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00182\u0006\u0010\u001a\u001a\u00020\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u001eH\u0086@\u00a2\u0006\u0002\u0010\u001fJ@\u0010\u0017\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00182\u0006\u0010 \u001a\u00020\u00192\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u001eH\u0087@\u00a2\u0006\u0002\u0010!R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006#"}, d2 = {"Lcom/lagradost/quicknovel/network/WebViewResolver;", "Lokhttp3/Interceptor;", "interceptUrl", "Lkotlin/text/Regex;", "additionalUrls", "", "userAgent", "", "useOkhttp", "", "(Lkotlin/text/Regex;Ljava/util/List;Ljava/lang/String;Z)V", "getAdditionalUrls", "()Ljava/util/List;", "getInterceptUrl", "()Lkotlin/text/Regex;", "getUseOkhttp", "()Z", "getUserAgent", "()Ljava/lang/String;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "resolveUsingWebView", "Lkotlin/Pair;", "Lokhttp3/Request;", "url", "referer", "method", "requestCallBack", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "(Lokhttp3/Request;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class WebViewResolver implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.text.Regex interceptUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<kotlin.text.Regex> additionalUrls = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String userAgent = null;
    private final boolean useOkhttp = false;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String webViewUserAgent;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.network.WebViewResolver.Companion Companion = null;
    
    public WebViewResolver(@org.jetbrains.annotations.NotNull()
    kotlin.text.Regex interceptUrl, @org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.text.Regex> additionalUrls, @org.jetbrains.annotations.Nullable()
    java.lang.String userAgent, boolean useOkhttp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.text.Regex getInterceptUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.text.Regex> getAdditionalUrls() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserAgent() {
        return null;
    }
    
    public final boolean getUseOkhttp() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object resolveUsingWebView(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String referer, @org.jetbrains.annotations.NotNull()
    java.lang.String method, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super okhttp3.Request, java.lang.Boolean> requestCallBack, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Pair<okhttp3.Request, ? extends java.util.List<okhttp3.Request>>> $completion) {
        return null;
    }
    
    /**
     * @param requestCallBack asynchronously return matched requests by either interceptUrl or additionalUrls. If true, destroy WebView.
     * @return the final request (by interceptUrl) and all the collected urls (by additionalUrls).
     */
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object resolveUsingWebView(@org.jetbrains.annotations.NotNull()
    okhttp3.Request request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super okhttp3.Request, java.lang.Boolean> requestCallBack, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Pair<okhttp3.Request, ? extends java.util.List<okhttp3.Request>>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\b\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/lagradost/quicknovel/network/WebViewResolver$Companion;", "", "()V", "webViewUserAgent", "", "getWebViewUserAgent", "()Ljava/lang/String;", "setWebViewUserAgent", "(Ljava/lang/String;)V", "getWebViewUserAgent1", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getWebViewUserAgent() {
            return null;
        }
        
        public final void setWebViewUserAgent(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @kotlin.jvm.JvmName(name = "getWebViewUserAgent1")
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getWebViewUserAgent1() {
            return null;
        }
    }
}