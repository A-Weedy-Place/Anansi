package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\"\u0010\n\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/lagradost/quicknovel/TTSNotificationService;", "Landroid/app/Service;", "()V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "", "flags", "startId", "Companion", "app_debug"})
public final class TTSNotificationService extends android.app.Service {
    @org.jetbrains.annotations.NotNull()
    private static java.lang.ref.WeakReference<com.lagradost.quicknovel.ReadActivityViewModel> _viewModel;
    @org.jetbrains.annotations.NotNull()
    private static kotlinx.coroutines.sync.Semaphore isRunning;
    @org.jetbrains.annotations.Nullable()
    private static kotlinx.coroutines.Job currentJob;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.TTSNotificationService.Companion Companion = null;
    
    public TTSNotificationService() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0002J\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0018R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/lagradost/quicknovel/TTSNotificationService$Companion;", "", "()V", "_viewModel", "Ljava/lang/ref/WeakReference;", "Lcom/lagradost/quicknovel/ReadActivityViewModel;", "currentJob", "Lkotlinx/coroutines/Job;", "isRunning", "Lkotlinx/coroutines/sync/Semaphore;", "value", "viewModel", "getViewModel", "()Lcom/lagradost/quicknovel/ReadActivityViewModel;", "setViewModel", "(Lcom/lagradost/quicknovel/ReadActivityViewModel;)V", "isServiceRunning", "", "ctx", "Landroid/content/Context;", "service", "Ljava/lang/Class;", "start", "", "(Lcom/lagradost/quicknovel/ReadActivityViewModel;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.lagradost.quicknovel.ReadActivityViewModel getViewModel() {
            return null;
        }
        
        public final void setViewModel(@org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.ReadActivityViewModel value) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object start(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ReadActivityViewModel viewModel, @org.jetbrains.annotations.NotNull()
        android.content.Context ctx, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
        
        private final boolean isServiceRunning(android.content.Context ctx, java.lang.Class<?> service) {
            return false;
        }
    }
}