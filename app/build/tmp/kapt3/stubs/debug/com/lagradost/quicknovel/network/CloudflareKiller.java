package com.lagradost.quicknovel.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082@\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J*\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0006H\u0082@\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\fH\u0002R)\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lcom/lagradost/quicknovel/network/CloudflareKiller;", "Lokhttp3/Interceptor;", "()V", "savedCookies", "", "", "", "getSavedCookies", "()Ljava/util/Map;", "bypassCloudflare", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCookieHeaders", "Lokhttp3/Headers;", "url", "getWebViewCookie", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "proceed", "cookies", "(Lokhttp3/Request;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySolveWithSavedCookies", "", "Companion", "app_debug"})
@androidx.annotation.AnyThread()
public final class CloudflareKiller implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "CloudflareKiller";
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> savedCookies = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.network.CloudflareKiller.Companion Companion = null;
    
    public CloudflareKiller() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> getSavedCookies() {
        return null;
    }
    
    /**
     * Gets the headers with cookies, webview user agent included!
     */
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.Headers getCookieHeaders(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    private final java.lang.String getWebViewCookie(java.lang.String url) {
        return null;
    }
    
    /**
     * Returns true if the cf cookies were successfully fetched from the CookieManager
     * Also saves the cookies.
     */
    private final boolean trySolveWithSavedCookies(okhttp3.Request request) {
        return false;
    }
    
    private final java.lang.Object proceed(okhttp3.Request request, java.util.Map<java.lang.String, java.lang.String> cookies, kotlin.coroutines.Continuation<? super okhttp3.Response> $completion) {
        return null;
    }
    
    private final java.lang.Object bypassCloudflare(okhttp3.Request request, kotlin.coroutines.Continuation<? super okhttp3.Response> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/lagradost/quicknovel/network/CloudflareKiller$Companion;", "", "()V", "TAG", "", "parseCookieMap", "", "cookie", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.String> parseCookieMap(@org.jetbrains.annotations.NotNull()
        java.lang.String cookie) {
            return null;
        }
    }
}