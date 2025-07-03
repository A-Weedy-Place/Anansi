package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JD\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006J*\u0010\u0011\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006J:\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0086@\u00a2\u0006\u0002\u0010\u001fJ,\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006J\u0016\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u0006J \u0010$\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u0006J\"\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u0016H\u0002J\u001e\u0010+\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006J&\u0010,\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u001eJ\u001e\u0010-\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006J\u0018\u0010.\u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u0006J\b\u0010/\u001a\u00020\u0016H\u0002J)\u00100\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0002\u00102J\u001a\u00103\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u00104\u001a\u0004\u0018\u000105J\u000e\u00106\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006J6\u00107\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\b\u00108\u001a\u0004\u0018\u00010\u0006H\u0007J\n\u00109\u001a\u00020\u0016*\u00020\nJ\u0016\u0010:\u001a\u0004\u0018\u000105*\u00020\n2\u0006\u0010\u001a\u001a\u00020;H\u0007J\u001e\u0010<\u001a\u0004\u0018\u000105*\u00020=2\u0006\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0006H\u0003J\u001b\u0010@\u001a\u0004\u0018\u00010A*\u00020=2\u0006\u0010B\u001a\u000205H\u0007\u00a2\u0006\u0002\u0010CJ\u001c\u0010D\u001a\u00020\u0006*\u00020#2\u0006\u0010E\u001a\u00020F2\u0006\u0010)\u001a\u00020\u001eH\u0002J4\u0010G\u001a\u0004\u0018\u00010(*\u00020#2\u0006\u0010E\u001a\u00020F2\u0006\u0010H\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0002\u0010IJ\f\u0010J\u001a\u00020\u0016*\u00020#H\u0002J\n\u0010K\u001a\u00020\b*\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006L"}, d2 = {"Lcom/lagradost/quicknovel/BookDownloader2Helper;", "", "()V", "fs", "", "reservedChars", "", "copyAllData", "", "activity", "Landroid/app/Activity;", "fromAuthor", "fromName", "fromApiName", "toAuthor", "toName", "toApiName", "deleteNovel", "author", "name", "apiName", "downloadIndividualChapter", "", "filepath", "api", "Lcom/lagradost/quicknovel/APIRepository;", "data", "Lcom/lagradost/quicknovel/ChapterData;", "forceReload", "maxTries", "", "(Ljava/lang/String;Lcom/lagradost/quicknovel/APIRepository;Lcom/lagradost/quicknovel/ChapterData;ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadInfo", "Lcom/lagradost/quicknovel/DownloadProgress;", "context", "Landroid/content/Context;", "generateId", "load", "Lcom/lagradost/quicknovel/LoadResponse;", "getChapter", "Lcom/lagradost/quicknovel/LoadedChapter;", "index", "stripHtml", "getDirectory", "getFilename", "getFilenameIMG", "hasEpub", "isScopedStorage", "openEpub", "openInApp", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Boolean;)V", "openQuickStream", "uri", "Landroid/net/Uri;", "sanitizeFilename", "turnToEpub", "synopsis", "checkWrite", "createQuickStream", "Lcom/lagradost/quicknovel/QuickStreamData;", "getExistingDownloadUriOrNullQ", "Landroid/content/ContentResolver;", "relativePath", "displayName", "getFileLength", "", "fileUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/Long;", "getFilePath", "meta", "Lcom/lagradost/quicknovel/QuickStreamMetaData;", "getQuickChapter", "chapter", "(Landroid/content/Context;Lcom/lagradost/quicknovel/QuickStreamMetaData;Lcom/lagradost/quicknovel/ChapterData;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStripHtml", "requestRW", "app_debug"})
public final class BookDownloader2Helper {
    private static final char fs = '\u0000';
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String reservedChars = "|\\?*<\":>+[]/\'";
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.BookDownloader2Helper INSTANCE = null;
    
    private BookDownloader2Helper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String sanitizeFilename(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDirectory(@org.jetbrains.annotations.NotNull()
    java.lang.String apiName, @org.jetbrains.annotations.NotNull()
    java.lang.String author, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilename(@org.jetbrains.annotations.NotNull()
    java.lang.String apiName, @org.jetbrains.annotations.NotNull()
    java.lang.String author, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilenameIMG(@org.jetbrains.annotations.NotNull()
    java.lang.String apiName, @org.jetbrains.annotations.NotNull()
    java.lang.String author, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public final int generateId(@org.jetbrains.annotations.NotNull()
    java.lang.String apiName, @org.jetbrains.annotations.Nullable()
    java.lang.String author, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return 0;
    }
    
    public final int generateId(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.LoadResponse load, @org.jetbrains.annotations.NotNull()
    java.lang.String apiName) {
        return 0;
    }
    
    public final boolean checkWrite(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$checkWrite) {
        return false;
    }
    
    public final void requestRW(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$requestRW) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.Q)
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getFileLength(@org.jetbrains.annotations.NotNull()
    android.content.ContentResolver $this$getFileLength, @org.jetbrains.annotations.NotNull()
    android.net.Uri fileUri) {
        return null;
    }
    
    public final boolean hasEpub(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    public final void copyAllData(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.lang.String fromAuthor, @org.jetbrains.annotations.NotNull()
    java.lang.String fromName, @org.jetbrains.annotations.NotNull()
    java.lang.String fromApiName, @org.jetbrains.annotations.Nullable()
    java.lang.String toAuthor, @org.jetbrains.annotations.NotNull()
    java.lang.String toName, @org.jetbrains.annotations.NotNull()
    java.lang.String toApiName) {
    }
    
    public final void deleteNovel(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.lang.String author, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String apiName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.lagradost.quicknovel.DownloadProgress downloadInfo(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String author, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String apiName) {
        return null;
    }
    
    public final void openQuickStream(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
    }
    
    private final boolean isScopedStorage() {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.Q)
    private final android.net.Uri getExistingDownloadUriOrNullQ(android.content.ContentResolver $this$getExistingDownloadUriOrNullQ, java.lang.String relativePath, java.lang.String displayName) {
        return null;
    }
    
    private final java.lang.String getFilePath(android.content.Context $this$getFilePath, com.lagradost.quicknovel.QuickStreamMetaData meta, int index) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getQuickChapter(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getQuickChapter, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.QuickStreamMetaData meta, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ChapterData chapter, int index, boolean forceReload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.LoadedChapter> $completion) {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri createQuickStream(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$createQuickStream, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.QuickStreamData data) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {})
    public final void openEpub(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean openInApp) {
    }
    
    private final boolean getStripHtml(android.content.Context $this$getStripHtml) {
        return false;
    }
    
    private final com.lagradost.quicknovel.LoadedChapter getChapter(java.lang.String filepath, int index, boolean stripHtml) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object downloadIndividualChapter(@org.jetbrains.annotations.NotNull()
    java.lang.String filepath, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.APIRepository api, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ChapterData data, boolean forceReload, int maxTries, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {})
    public final void turnToEpub(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.lang.String author, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String apiName, @org.jetbrains.annotations.Nullable()
    java.lang.String synopsis) {
    }
}