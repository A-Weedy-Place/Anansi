package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\fJB\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\t\u0010,\u001a\u00020\u0005H\u00d6\u0001J\t\u0010-\u001a\u00020)H\u00d6\u0001R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017\u00a8\u0006."}, d2 = {"Lcom/lagradost/quicknovel/DownloadProgressState;", "", "state", "Lcom/lagradost/quicknovel/DownloadState;", "progress", "", "total", "lastUpdatedMs", "", "etaMs", "(Lcom/lagradost/quicknovel/DownloadState;IIJLjava/lang/Long;)V", "getEtaMs", "()Ljava/lang/Long;", "setEtaMs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLastUpdatedMs", "()J", "setLastUpdatedMs", "(J)V", "getProgress", "()I", "setProgress", "(I)V", "getState", "()Lcom/lagradost/quicknovel/DownloadState;", "setState", "(Lcom/lagradost/quicknovel/DownloadState;)V", "getTotal", "setTotal", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/lagradost/quicknovel/DownloadState;IIJLjava/lang/Long;)Lcom/lagradost/quicknovel/DownloadProgressState;", "equals", "", "other", "eta", "", "context", "Landroid/content/Context;", "hashCode", "toString", "app_debug"})
public final class DownloadProgressState {
    @org.jetbrains.annotations.NotNull()
    private com.lagradost.quicknovel.DownloadState state;
    private int progress;
    private int total;
    private long lastUpdatedMs;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long etaMs;
    
    public DownloadProgressState(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.DownloadState state, int progress, int total, long lastUpdatedMs, @org.jetbrains.annotations.Nullable()
    java.lang.Long etaMs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.DownloadState getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.DownloadState p0) {
    }
    
    public final int getProgress() {
        return 0;
    }
    
    public final void setProgress(int p0) {
    }
    
    public final int getTotal() {
        return 0;
    }
    
    public final void setTotal(int p0) {
    }
    
    public final long getLastUpdatedMs() {
        return 0L;
    }
    
    public final void setLastUpdatedMs(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getEtaMs() {
        return null;
    }
    
    public final void setEtaMs(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String eta(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.DownloadState component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final long component4() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.DownloadProgressState copy(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.DownloadState state, int progress, int total, long lastUpdatedMs, @org.jetbrains.annotations.Nullable()
    java.lang.Long etaMs) {
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