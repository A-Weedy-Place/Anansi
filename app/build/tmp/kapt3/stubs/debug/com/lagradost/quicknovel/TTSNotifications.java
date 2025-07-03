package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J4\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J2\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001d\u001a\u00020\u001bJ\u0016\u0010\r\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\""}, d2 = {"Lcom/lagradost/quicknovel/TTSNotifications;", "", "()V", "TTS_CHANNEL_ID", "", "TTS_NOTIFICATION_ID", "", "hasCreateedNotificationChannel", "", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "getMediaSession", "()Landroid/support/v4/media/session/MediaSessionCompat;", "setMediaSession", "(Landroid/support/v4/media/session/MediaSessionCompat;)V", "createNotification", "Landroid/app/Notification;", "title", "chapter", "Lcom/lagradost/quicknovel/ui/UiText;", "icon", "Landroid/graphics/Bitmap;", "status", "Lcom/lagradost/quicknovel/TTSHelper$TTSStatus;", "context", "Landroid/content/Context;", "createNotificationChannel", "", "notify", "releaseMediaSession", "viewModel", "Lcom/lagradost/quicknovel/ReadActivityViewModel;", "book", "Lcom/lagradost/quicknovel/AbstractBook;", "app_debug"})
public final class TTSNotifications {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TTS_CHANNEL_ID = "QuickNovelTTS";
    public static final int TTS_NOTIFICATION_ID = 133742;
    private static boolean hasCreateedNotificationChannel = false;
    @org.jetbrains.annotations.Nullable()
    private static android.support.v4.media.session.MediaSessionCompat mediaSession;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.TTSNotifications INSTANCE = null;
    
    private TTSNotifications() {
        super();
    }
    
    private final void createNotificationChannel(android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v4.media.session.MediaSessionCompat getMediaSession() {
        return null;
    }
    
    public final void setMediaSession(@org.jetbrains.annotations.Nullable()
    android.support.v4.media.session.MediaSessionCompat p0) {
    }
    
    public final void setMediaSession(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ReadActivityViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.AbstractBook book) {
    }
    
    public final void releaseMediaSession() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Notification createNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.UiText chapter, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap icon, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.TTSHelper.TTSStatus status, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    public final void notify(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.UiText chapter, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap icon, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.TTSHelper.TTSStatus status, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
}