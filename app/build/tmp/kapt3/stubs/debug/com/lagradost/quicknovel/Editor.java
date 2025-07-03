package com.lagradost.quicknovel;

/**
 * When inserting many keys use this function, this is because apply for every key is very expensive on memory
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0002J!\u0010\u0012\u001a\u00020\b\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u0002H\u0013\u00a2\u0006\u0002\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lcom/lagradost/quicknovel/Editor;", "", "editor", "Landroid/content/SharedPreferences$Editor;", "(Landroid/content/SharedPreferences$Editor;)V", "getEditor", "()Landroid/content/SharedPreferences$Editor;", "apply", "", "component1", "copy", "equals", "", "other", "hashCode", "", "isStringSet", "value", "setKeyRaw", "T", "path", "", "(Ljava/lang/String;Ljava/lang/Object;)V", "toString", "app_debug"})
public final class Editor {
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences.Editor editor = null;
    
    public Editor(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor editor) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.Editor getEditor() {
        return null;
    }
    
    /**
     * Always remember to call apply after
     */
    public final <T extends java.lang.Object>void setKeyRaw(@org.jetbrains.annotations.NotNull()
    java.lang.String path, T value) {
    }
    
    private final boolean isStringSet(java.lang.Object value) {
        return false;
    }
    
    public final void apply() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.Editor component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.Editor copy(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor editor) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}