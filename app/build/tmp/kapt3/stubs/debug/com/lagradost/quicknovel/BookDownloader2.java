package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\'J\u001e\u00100\u001a\u0002012\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\'H\u0082@\u00a2\u0006\u0002\u00102J1\u00103\u001a\u0004\u0018\u00010\u001f2\u0006\u0010.\u001a\u00020\t2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020104\u00a2\u0006\u0002\b5H\u0082@\u00a2\u0006\u0002\u00106J\u0018\u00107\u001a\u0004\u0018\u00010\'2\u0006\u0010.\u001a\u00020\tH\u0082@\u00a2\u0006\u0002\u00108J:\u00109\u001a\u0002012\u0006\u0010.\u001a\u00020\t2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u001f2\b\b\u0002\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020>H\u0082@\u00a2\u0006\u0002\u0010@J \u0010A\u001a\u00020-2\b\u0010B\u001a\u0004\u0018\u00010\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0004J(\u0010E\u001a\u0002012\b\u0010B\u001a\u0004\u0018\u00010\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0004H\u0082@\u00a2\u0006\u0002\u0010FJ\u0016\u0010G\u001a\u00020-2\u0006\u0010:\u001a\u00020H2\u0006\u0010I\u001a\u00020JJ\u0016\u0010G\u001a\u0002012\u0006\u0010:\u001a\u00020;2\u0006\u0010I\u001a\u00020JJ$\u0010G\u001a\u00020-2\u0006\u0010:\u001a\u00020K2\u0006\u0010I\u001a\u00020J2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\t0MJ\u001e\u0010N\u001a\u0002012\u0006\u0010:\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0087@\u00a2\u0006\u0002\u0010OJ\u0016\u0010P\u001a\u0002012\u0006\u0010Q\u001a\u00020RH\u0086@\u00a2\u0006\u0002\u0010SJ6\u0010T\u001a\u0002012\u0006\u0010:\u001a\u00020;2\u0006\u0010U\u001a\u00020\u00042\u0006\u0010V\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00042\u0006\u0010X\u001a\u00020YH\u0082@\u00a2\u0006\u0002\u0010ZJ,\u0010[\u001a\u0002012\b\u0010B\u001a\u0004\u0018\u00010\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00042\b\u0010\\\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010]\u001a\u00020>2\u0006\u0010C\u001a\u00020\u0004H\u0002J\b\u0010^\u001a\u00020-H\u0002J(\u0010_\u001a\u0002012\u0006\u0010`\u001a\u00020\t2\u0006\u0010a\u001a\u00020\t2\u0006\u0010b\u001a\u00020\u00042\u0006\u0010c\u001a\u00020\u0004H\u0002J!\u0010d\u001a\u0002012\u0006\u0010C\u001a\u00020\u00042\n\b\u0002\u0010e\u001a\u0004\u0018\u00010>H\u0002\u00a2\u0006\u0002\u0010fJ\u0010\u0010g\u001a\u00020-2\b\u0010h\u001a\u0004\u0018\u00010iJB\u0010j\u001a\u0002012\u0006\u0010.\u001a\u00020\t2\u0006\u0010k\u001a\u00020\t2\b\u0010B\u001a\u0004\u0018\u00010\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00042\b\u0010\\\u001a\u0004\u0018\u00010\u0004H\u0087@\u00a2\u0006\u0002\u0010lJ,\u0010j\u001a\u0002012\b\u0010B\u001a\u0004\u0018\u00010\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00042\b\u0010\\\u001a\u0004\u0018\u00010\u0004H\u0002J&\u0010m\u001a\u0002012\u0006\u0010:\u001a\u00020;2\u0006\u0010I\u001a\u00020J2\u0006\u0010n\u001a\u00020\tH\u0082@\u00a2\u0006\u0002\u0010oJ\u001e\u0010p\u001a\u0002012\u0006\u0010:\u001a\u00020;2\u0006\u0010I\u001a\u00020JH\u0082@\u00a2\u0006\u0002\u0010qJ\u001e\u0010r\u001a\u0002012\u0006\u0010s\u001a\u00020H2\u0006\u0010D\u001a\u00020\u0004H\u0087@\u00a2\u0006\u0002\u0010tJ\u001e\u0010r\u001a\u0002012\u0006\u0010s\u001a\u00020;2\u0006\u0010D\u001a\u00020\u0004H\u0087@\u00a2\u0006\u0002\u0010uJ\u001e\u0010r\u001a\u0002012\u0006\u0010s\u001a\u00020K2\u0006\u0010D\u001a\u00020\u0004H\u0087@\u00a2\u0006\u0002\u0010vJ\u000e\u0010r\u001a\u00020-2\u0006\u0010Q\u001a\u00020wJ,\u0010x\u001a\u0002012\b\u0010B\u001a\u0004\u0018\u00010\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00042\b\u0010\\\u001a\u0004\u0018\u00010\u0004H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R-\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000fj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010`\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR-\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u000fj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f`\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R#\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u000e\u0010%\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\'0\u000fj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\'`\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006y"}, d2 = {"Lcom/lagradost/quicknovel/BookDownloader2;", "", "()V", "LOCAL_EPUB", "", "LOCAL_EPUB_MIN_SIZE", "", "currentDownloads", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "currentDownloadsMutex", "Lkotlinx/coroutines/sync/Mutex;", "deleteNovelMutex", "downloadData", "Ljava/util/HashMap;", "Lcom/lagradost/quicknovel/ui/download/DownloadFragment$DownloadData;", "Lkotlin/collections/HashMap;", "getDownloadData", "()Ljava/util/HashMap;", "downloadDataChanged", "Lcom/lagradost/quicknovel/util/Event;", "Lkotlin/Pair;", "getDownloadDataChanged", "()Lcom/lagradost/quicknovel/util/Event;", "downloadDataRefreshed", "getDownloadDataRefreshed", "downloadInfoMutex", "getDownloadInfoMutex", "()Lkotlinx/coroutines/sync/Mutex;", "downloadProgress", "Lcom/lagradost/quicknovel/DownloadProgressState;", "getDownloadProgress", "downloadProgressChanged", "getDownloadProgressChanged", "downloadRemoved", "getDownloadRemoved", "migrationNovelMutex", "pendingAction", "Lcom/lagradost/quicknovel/DownloadActionType;", "pendingActionMutex", "readEpubMutex", "streamMutex", "streamResultMutex", "addPendingAction", "Lkotlinx/coroutines/Job;", "id", "action", "addPendingActionAsync", "", "(ILcom/lagradost/quicknovel/DownloadActionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeDownload", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumeAction", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNotification", "load", "Lcom/lagradost/quicknovel/LoadResponse;", "stateProgressState", "show", "", "progressInBytes", "(ILcom/lagradost/quicknovel/LoadResponse;Lcom/lagradost/quicknovel/DownloadProgressState;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNovel", "author", "name", "apiName", "deleteNovelAsync", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "download", "Lcom/lagradost/quicknovel/EpubResponse;", "api", "Lcom/lagradost/quicknovel/APIRepository;", "Lcom/lagradost/quicknovel/StreamResponse;", "range", "Lkotlin/ranges/ClosedRange;", "downloadAsync", "(Lcom/lagradost/quicknovel/EpubResponse;Lcom/lagradost/quicknovel/APIRepository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadFromCard", "card", "Lcom/lagradost/quicknovel/ui/download/DownloadFragment$DownloadDataLoaded;", "(Lcom/lagradost/quicknovel/ui/download/DownloadFragment$DownloadDataLoaded;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadImage", "sApiName", "sAuthor", "sName", "filesDir", "Ljava/io/File;", "(Lcom/lagradost/quicknovel/LoadResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateAndReadEpub", "synopsis", "hasEpub", "initDownloadProgress", "migrateKeys", "from", "to", "oldName", "newName", "openEpub", "openInApp", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "openQuickStream", "uri", "Landroid/net/Uri;", "readEpub", "downloadedCount", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPrefixData", "total", "(Lcom/lagradost/quicknovel/LoadResponse;Lcom/lagradost/quicknovel/APIRepository;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSuffixData", "(Lcom/lagradost/quicknovel/LoadResponse;Lcom/lagradost/quicknovel/APIRepository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stream", "res", "(Lcom/lagradost/quicknovel/EpubResponse;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/lagradost/quicknovel/LoadResponse;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/lagradost/quicknovel/StreamResponse;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/lagradost/quicknovel/util/ResultCached;", "turnToEpub", "app_debug"})
public final class BookDownloader2 {
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.sync.Mutex streamMutex = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.sync.Mutex streamResultMutex = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.sync.Mutex readEpubMutex = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.sync.Mutex deleteNovelMutex = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.sync.Mutex downloadInfoMutex = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashMap<java.lang.Integer, com.lagradost.quicknovel.DownloadProgressState> downloadProgress = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashMap<java.lang.Integer, com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadData> downloadData = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.lagradost.quicknovel.util.Event<kotlin.Pair<java.lang.Integer, com.lagradost.quicknovel.DownloadProgressState>> downloadProgressChanged = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.lagradost.quicknovel.util.Event<kotlin.Pair<java.lang.Integer, com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadData>> downloadDataChanged = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.lagradost.quicknovel.util.Event<java.lang.Integer> downloadRemoved = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.lagradost.quicknovel.util.Event<java.lang.Integer> downloadDataRefreshed = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.sync.Mutex currentDownloadsMutex = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashSet<java.lang.Integer> currentDownloads = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.sync.Mutex pendingActionMutex = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashMap<java.lang.Integer, com.lagradost.quicknovel.DownloadActionType> pendingAction = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.sync.Mutex migrationNovelMutex = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCAL_EPUB = "local_epub.epub";
    public static final long LOCAL_EPUB_MIN_SIZE = 1000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.BookDownloader2 INSTANCE = null;
    
    private BookDownloader2() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job openQuickStream(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object stream(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.LoadResponse res, @org.jetbrains.annotations.NotNull()
    java.lang.String apiName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object stream(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.EpubResponse res, @org.jetbrains.annotations.NotNull()
    java.lang.String apiName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object stream(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.StreamResponse res, @org.jetbrains.annotations.NotNull()
    java.lang.String apiName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job stream(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.util.ResultCached card) {
        return null;
    }
    
    private final void generateAndReadEpub(java.lang.String author, java.lang.String name, java.lang.String apiName, java.lang.String synopsis) {
    }
    
    private final void readEpub(java.lang.String author, java.lang.String name, java.lang.String apiName, java.lang.String synopsis) {
    }
    
    @androidx.annotation.WorkerThread()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object readEpub(int id, int downloadedCount, @org.jetbrains.annotations.Nullable()
    java.lang.String author, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String apiName, @org.jetbrains.annotations.Nullable()
    java.lang.String synopsis, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object deleteNovelAsync(java.lang.String author, java.lang.String name, java.lang.String apiName, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteNovel(@org.jetbrains.annotations.Nullable()
    java.lang.String author, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String apiName) {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {})
    private final void turnToEpub(java.lang.String author, java.lang.String name, java.lang.String apiName, java.lang.String synopsis) {
    }
    
    private final boolean hasEpub(java.lang.String name) {
        return false;
    }
    
    private final void openEpub(java.lang.String name, java.lang.Boolean openInApp) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.sync.Mutex getDownloadInfoMutex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.Integer, com.lagradost.quicknovel.DownloadProgressState> getDownloadProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.Integer, com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadData> getDownloadData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.util.Event<kotlin.Pair<java.lang.Integer, com.lagradost.quicknovel.DownloadProgressState>> getDownloadProgressChanged() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.util.Event<kotlin.Pair<java.lang.Integer, com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadData>> getDownloadDataChanged() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.util.Event<java.lang.Integer> getDownloadRemoved() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.util.Event<java.lang.Integer> getDownloadDataRefreshed() {
        return null;
    }
    
    private final kotlinx.coroutines.Job initDownloadProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addPendingAction(int id, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.DownloadActionType action) {
        return null;
    }
    
    private final java.lang.Object addPendingActionAsync(int id, com.lagradost.quicknovel.DownloadActionType action, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object createNotification(int id, com.lagradost.quicknovel.LoadResponse load, com.lagradost.quicknovel.DownloadProgressState stateProgressState, boolean show, boolean progressInBytes, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object consumeAction(int id, kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.DownloadActionType> $completion) {
        return null;
    }
    
    private final java.lang.Object changeDownload(int id, kotlin.jvm.functions.Function1<? super com.lagradost.quicknovel.DownloadProgressState, kotlin.Unit> action, kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.DownloadProgressState> $completion) {
        return null;
    }
    
    private final void migrateKeys(int from, int to, java.lang.String oldName, java.lang.String newName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object downloadFromCard(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded card, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void download(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.LoadResponse load, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.APIRepository api) {
    }
    
    private final java.lang.Object setSuffixData(com.lagradost.quicknovel.LoadResponse load, com.lagradost.quicknovel.APIRepository api, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object setPrefixData(com.lagradost.quicknovel.LoadResponse load, com.lagradost.quicknovel.APIRepository api, int total, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job download(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.EpubResponse load, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.APIRepository api) {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object downloadAsync(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.EpubResponse load, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.APIRepository api, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object downloadImage(com.lagradost.quicknovel.LoadResponse load, java.lang.String sApiName, java.lang.String sAuthor, java.lang.String sName, java.io.File filesDir, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job download(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.StreamResponse load, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.APIRepository api, @org.jetbrains.annotations.NotNull()
    kotlin.ranges.ClosedRange<java.lang.Integer> range) {
        return null;
    }
}