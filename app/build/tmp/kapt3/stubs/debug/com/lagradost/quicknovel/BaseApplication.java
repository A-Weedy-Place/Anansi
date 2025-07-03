package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\b"}, d2 = {"Lcom/lagradost/quicknovel/BaseApplication;", "Landroid/app/Application;", "()V", "attachBaseContext", "", "base", "Landroid/content/Context;", "Companion", "app_debug"})
public final class BaseApplication extends android.app.Application {
    @org.jetbrains.annotations.Nullable()
    private static java.lang.ref.WeakReference<android.content.Context> _context;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.BaseApplication.Companion Companion = null;
    
    public BaseApplication() {
        super();
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context base) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\f\u001a\u0004\u0018\u0001H\r\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\b\u00a2\u0006\u0002\u0010\u0010J.\u0010\f\u001a\u0004\u0018\u0001H\r\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u0001H\rH\u0086\b\u00a2\u0006\u0002\u0010\u0012J,\u0010\f\u001a\u0004\u0018\u0001H\r\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\b\u00a2\u0006\u0002\u0010\u0014J6\u0010\f\u001a\u0004\u0018\u0001H\r\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u0001H\rH\u0086\b\u00a2\u0006\u0002\u0010\u0015J-\u0010\u0016\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\r0\u0018\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001b2\u0006\u0010\u0013\u001a\u00020\u000fJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0013\u001a\u00020\u000f\u00a2\u0006\u0002\u0010!J!\u0010\"\u001a\u00020\u001d\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u0002H\r\u00a2\u0006\u0002\u0010#J)\u0010\"\u001a\u00020\u001d\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u0002H\r\u00a2\u0006\u0002\u0010$J%\u0010%\u001a\u00020\u001d\"\b\b\u0000\u0010\r*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u0002H\r\u00a2\u0006\u0002\u0010#J\u000f\u0010&\u001a\u0004\u0018\u00010\'*\u00020\u0005H\u0086\u0010R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006("}, d2 = {"Lcom/lagradost/quicknovel/BaseApplication$Companion;", "", "()V", "_context", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "value", "context", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getKey", "T", "path", "", "(Ljava/lang/String;)Ljava/lang/Object;", "defVal", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "folder", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getKeyClass", "valueType", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getKeys", "", "removeKey", "", "removeKeyClass", "removeKeys", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "setKey", "(Ljava/lang/String;Ljava/lang/Object;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "setKeyClass", "getActivity", "Landroid/app/Activity;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Use to get activity from Context
         */
        @org.jetbrains.annotations.Nullable()
        public final android.app.Activity getActivity(@org.jetbrains.annotations.NotNull()
        android.content.Context $this$getActivity) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.content.Context getContext() {
            return null;
        }
        
        private final void setContext(android.content.Context value) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer removeKeys(@org.jetbrains.annotations.NotNull()
        java.lang.String folder) {
            return null;
        }
        
        public final <T extends java.lang.Object>void setKey(@org.jetbrains.annotations.NotNull()
        java.lang.String path, T value) {
        }
        
        public final <T extends java.lang.Object>void setKey(@org.jetbrains.annotations.NotNull()
        java.lang.String folder, @org.jetbrains.annotations.NotNull()
        java.lang.String path, T value) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final <T extends java.lang.Object>T getKeyClass(@org.jetbrains.annotations.NotNull()
        java.lang.String path, @org.jetbrains.annotations.NotNull()
        java.lang.Class<T> valueType) {
            return null;
        }
        
        public final <T extends java.lang.Object>void setKeyClass(@org.jetbrains.annotations.NotNull()
        java.lang.String path, @org.jetbrains.annotations.NotNull()
        T value) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getKeys(@org.jetbrains.annotations.NotNull()
        java.lang.String folder) {
            return null;
        }
        
        public final void removeKey(@org.jetbrains.annotations.NotNull()
        java.lang.String folder, @org.jetbrains.annotations.NotNull()
        java.lang.String path) {
        }
        
        public final void removeKeyClass(@org.jetbrains.annotations.NotNull()
        java.lang.String path) {
        }
        
        public final void removeKey(@org.jetbrains.annotations.NotNull()
        java.lang.String path) {
        }
    }
}