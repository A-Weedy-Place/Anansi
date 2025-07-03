package com.lagradost.quicknovel.ui.history;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006J\b\u0010\u0014\u001a\u00020\rH\u0002R1\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/lagradost/quicknovel/ui/history/HistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "cards", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/lagradost/quicknovel/util/ResultCached;", "Lkotlin/collections/ArrayList;", "getCards", "()Landroidx/lifecycle/MutableLiveData;", "cards$delegate", "Lkotlin/Lazy;", "delete", "", "card", "deleteAlert", "deleteAllAlert", "open", "showMetadata", "stream", "updateHistory", "app_debug"})
public final class HistoryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy cards$delegate = null;
    
    public HistoryViewModel() {
        super();
    }
    
    private final void updateHistory() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.lagradost.quicknovel.util.ResultCached>> getCards() {
        return null;
    }
    
    public final void deleteAllAlert() {
    }
    
    public final void open(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.util.ResultCached card) {
    }
    
    public final void showMetadata(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.util.ResultCached card) {
    }
    
    public final void deleteAlert(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.util.ResultCached card) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.util.ResultCached card) {
    }
    
    public final void stream(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.util.ResultCached card) {
    }
}