package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\nH&J\u001e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\nJ\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u00a5@\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\u000fH&J\b\u0010\u001e\u001a\u00020\nH&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/lagradost/quicknovel/AbstractBook;", "", "()V", "canReload", "", "getCanReload", "()Z", "poster", "Landroid/graphics/Bitmap;", "author", "", "expand", "last", "getChapterData", "index", "", "reload", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChapterTitle", "Lcom/lagradost/quicknovel/ui/UiText;", "getLoadingStatus", "loadImage", "", "image", "loadImageBitmap", "posterBytes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolveUrl", "url", "size", "title", "app_debug"})
public abstract class AbstractBook {
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Bitmap poster;
    
    public AbstractBook() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String resolveUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    public abstract boolean getCanReload();
    
    public abstract int size();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String title();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.lagradost.quicknovel.ui.UiText getChapterTitle(int index);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getLoadingStatus(int index);
    
    @kotlin.jvm.Throws(exceptionClasses = {})
    @org.jetbrains.annotations.Nullable()
    public byte[] loadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String image) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap loadImageBitmap(@org.jetbrains.annotations.NotNull()
    java.lang.String image) {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {})
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getChapterData(int index, boolean reload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion);
    
    public abstract boolean expand(@org.jetbrains.annotations.NotNull()
    java.lang.String last);
    
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {})
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object posterBytes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super byte[]> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap poster() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String author();
}