package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JH\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0002\u0010\u001aJ\f\u0010\u001b\u001a\u00020\n*\u00020\fH\u0002J\n\u0010\u001c\u001a\u00020\n*\u00020\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/lagradost/quicknovel/NotificationHelper;", "", "()V", "CHANNEL_DESCRIPT", "", "CHANNEL_ID", "CHANNEL_NAME", "hasCreatedNotChanel", "", "createNotification", "", "context", "Landroid/content/Context;", "source", "id", "", "load", "Lcom/lagradost/quicknovel/LoadResponse;", "stateProgressState", "Lcom/lagradost/quicknovel/DownloadProgressState;", "showNotification", "progressInBytes", "(Landroid/content/Context;Ljava/lang/String;ILcom/lagradost/quicknovel/LoadResponse;Lcom/lagradost/quicknovel/DownloadProgressState;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "etaToString", "etaMs", "", "(Ljava/lang/Long;)Ljava/lang/String;", "createNotificationChannel", "requestNotifications", "Landroidx/activity/ComponentActivity;", "app_debug"})
public final class NotificationHelper {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_ID = "epubdownloader.general";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_NAME = "Downloads";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_DESCRIPT = "The download notification channel";
    private static boolean hasCreatedNotChanel = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.NotificationHelper INSTANCE = null;
    
    private NotificationHelper() {
        super();
    }
    
    public final void requestNotifications(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity $this$requestNotifications) {
    }
    
    private final void createNotificationChannel(android.content.Context $this$createNotificationChannel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String etaToString(@org.jetbrains.annotations.Nullable()
    java.lang.Long etaMs) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createNotification(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String source, int id, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.LoadResponse load, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.DownloadProgressState stateProgressState, boolean showNotification, boolean progressInBytes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}