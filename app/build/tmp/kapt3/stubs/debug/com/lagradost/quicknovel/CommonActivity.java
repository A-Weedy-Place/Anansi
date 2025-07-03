package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004J-\u0010\u001c\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007\u00a2\u0006\u0002\u0010 J-\u0010\u001c\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007\u00a2\u0006\u0002\u0010!J!\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0002\u0010#J!\u0010\u001c\u001a\u00020\u00152\b\b\u0001\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0002\u0010$J!\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0002\u0010%J\f\u0010&\u001a\u00020\u0015*\u0004\u0018\u00010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\'"}, d2 = {"Lcom/lagradost/quicknovel/CommonActivity;", "", "()V", "TAG", "", "_activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "value", "activity", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "currentToast", "Landroid/widget/Toast;", "getCurrentToast", "()Landroid/widget/Toast;", "setCurrentToast", "(Landroid/widget/Toast;)V", "init", "", "act", "loadThemes", "setLocale", "context", "Landroid/content/Context;", "languageCode", "showToast", "message", "", "duration", "(Landroid/app/Activity;ILjava/lang/Integer;)V", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Integer;)V", "Lcom/lagradost/quicknovel/ui/UiText;", "(Lcom/lagradost/quicknovel/ui/UiText;Ljava/lang/Integer;)V", "(ILjava/lang/Integer;)V", "(Ljava/lang/String;Ljava/lang/Integer;)V", "updateLocale", "app_debug"})
public final class CommonActivity {
    @org.jetbrains.annotations.Nullable()
    private static java.lang.ref.WeakReference<android.app.Activity> _activity;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "COMPACT";
    @org.jetbrains.annotations.Nullable()
    private static android.widget.Toast currentToast;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.CommonActivity INSTANCE = null;
    
    private CommonActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.Nullable()
    android.app.Activity value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Toast getCurrentToast() {
        return null;
    }
    
    public final void setCurrentToast(@org.jetbrains.annotations.Nullable()
    android.widget.Toast p0) {
    }
    
    public final void showToast(@androidx.annotation.StringRes()
    int message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer duration) {
    }
    
    public final void showToast(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer duration) {
    }
    
    public final void showToast(@org.jetbrains.annotations.Nullable()
    com.lagradost.quicknovel.ui.UiText message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer duration) {
    }
    
    /**
     * duration is Toast.LENGTH_SHORT if null
     */
    @androidx.annotation.MainThread()
    public final void showToast(@org.jetbrains.annotations.Nullable()
    android.app.Activity act, @androidx.annotation.StringRes()
    int message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer duration) {
    }
    
    @androidx.annotation.MainThread()
    public final void showToast(@org.jetbrains.annotations.Nullable()
    android.app.Activity act, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer duration) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.app.Activity act) {
    }
    
    public final void setLocale(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String languageCode) {
    }
    
    public final void updateLocale(@org.jetbrains.annotations.Nullable()
    android.content.Context $this$updateLocale) {
    }
    
    public final void loadThemes(@org.jetbrains.annotations.Nullable()
    android.app.Activity act) {
    }
}