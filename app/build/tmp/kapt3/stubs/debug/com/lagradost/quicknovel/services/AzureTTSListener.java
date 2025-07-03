package com.lagradost.quicknovel.services;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/lagradost/quicknovel/services/AzureTTSListener;", "", "onError", "", "error", "", "onStatusChanged", "status", "Lcom/lagradost/quicknovel/services/AzureTTSStatus;", "app_debug"})
public abstract interface AzureTTSListener {
    
    public abstract void onStatusChanged(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.services.AzureTTSStatus status);
    
    public abstract void onError(@org.jetbrains.annotations.NotNull()
    java.lang.String error);
}