package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0094@\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001e"}, d2 = {"Lcom/lagradost/quicknovel/QuickBook;", "Lcom/lagradost/quicknovel/AbstractBook;", "data", "Lcom/lagradost/quicknovel/QuickStreamData;", "(Lcom/lagradost/quicknovel/QuickStreamData;)V", "canReload", "", "getCanReload", "()Z", "getData", "()Lcom/lagradost/quicknovel/QuickStreamData;", "author", "", "expand", "last", "getChapterData", "index", "", "reload", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChapterTitle", "Lcom/lagradost/quicknovel/ui/UiText;", "getLoadingStatus", "posterBytes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolveUrl", "url", "size", "title", "app_debug"})
public final class QuickBook extends com.lagradost.quicknovel.AbstractBook {
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.QuickStreamData data = null;
    private final boolean canReload = true;
    
    public QuickBook(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.QuickStreamData data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.QuickStreamData getData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String resolveUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String author() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getCanReload() {
        return false;
    }
    
    @java.lang.Override()
    public int size() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String title() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.lagradost.quicknovel.ui.UiText getChapterTitle(int index) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLoadingStatus(int index) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getChapterData(int index, boolean reload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @java.lang.Override()
    public boolean expand(@org.jetbrains.annotations.NotNull()
    java.lang.String last) {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object posterBytes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super byte[]> $completion) {
        return null;
    }
}