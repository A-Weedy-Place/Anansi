package com.lagradost.quicknovel.ui.download;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0012J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0012J\u000e\u0010\'\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0011H\u0002J\u0010\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\u0011H\u0002J\u000e\u0010-\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0012J\u000e\u0010/\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0006\u00100\u001a\u00020)J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\nH\u0002J\b\u00104\u001a\u00020$H\u0014J\u000e\u00105\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0012J\u000e\u00106\u001a\u00020$H\u0082@\u00a2\u0006\u0002\u0010.J\u001c\u00107\u001a\u00020)2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020:09H\u0002J\u001c\u0010;\u001a\u00020)2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020<09H\u0002J\u000e\u0010=\u001a\u00020)2\u0006\u0010%\u001a\u00020\u0012J\u0006\u0010>\u001a\u00020)J\u000e\u0010?\u001a\u00020)2\u0006\u0010%\u001a\u00020\u0012J\u0006\u0010@\u001a\u00020$J\u000e\u0010A\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0012J\u000e\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020\nJ\u000e\u0010D\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0012J\u000e\u0010D\u001a\u00020$2\u0006\u0010%\u001a\u00020&J&\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u001fj\b\u0012\u0004\u0012\u00020\u0012`GH\u0002J&\u0010H\u001a\b\u0012\u0004\u0012\u00020&0\u00052\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020&0\u001fj\b\u0012\u0004\u0012\u00020&`GH\u0002J\u000e\u0010I\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u000e\u0010J\u001a\u00020$2\u0006\u0010K\u001a\u00020\u0011R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u0006L"}, d2 = {"Lcom/lagradost/quicknovel/ui/download/DownloadViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_pages", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/lagradost/quicknovel/ui/download/Page;", "get_pages", "()Landroidx/lifecycle/MutableLiveData;", "activeQuery", "", "getActiveQuery", "()Ljava/lang/String;", "setActiveQuery", "(Ljava/lang/String;)V", "cardsData", "Ljava/util/HashMap;", "", "Lcom/lagradost/quicknovel/ui/download/DownloadFragment$DownloadDataLoaded;", "Lkotlin/collections/HashMap;", "cardsDataMutex", "Lkotlinx/coroutines/sync/Mutex;", "currentTab", "getCurrentTab", "setCurrentTab", "(Landroidx/lifecycle/MutableLiveData;)V", "pages", "Landroidx/lifecycle/LiveData;", "getPages", "()Landroidx/lifecycle/LiveData;", "readList", "Ljava/util/ArrayList;", "Lcom/lagradost/quicknovel/ui/ReadType;", "getReadList", "()Ljava/util/ArrayList;", "delete", "", "card", "Lcom/lagradost/quicknovel/util/ResultCached;", "deleteAlert", "downloadDataRefreshed", "Lkotlinx/coroutines/Job;", "_id", "downloadRemoved", "id", "getDownloadedCards", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "loadAllData", "matchesQuery", "", "x", "onCleared", "pause", "postCards", "progressChanged", "data", "Lkotlin/Pair;", "Lcom/lagradost/quicknovel/DownloadProgressState;", "progressDataChanged", "Lcom/lagradost/quicknovel/ui/download/DownloadFragment$DownloadData;", "readEpub", "refresh", "refreshCard", "resortAllData", "resume", "search", "query", "showMetadata", "sortArray", "currentArray", "Lkotlin/collections/ArrayList;", "sortNormalArray", "stream", "switchPage", "position", "app_debug"})
public final class DownloadViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.lagradost.quicknovel.ui.ReadType> readList = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String activeQuery = "";
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.lagradost.quicknovel.ui.download.Page>> _pages = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.lagradost.quicknovel.ui.download.Page>> pages = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> currentTab;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.sync.Mutex cardsDataMutex = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<java.lang.Integer, com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded> cardsData = null;
    
    public DownloadViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.lagradost.quicknovel.ui.ReadType> getReadList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getActiveQuery() {
        return null;
    }
    
    public final void setActiveQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.lagradost.quicknovel.ui.download.Page>> get_pages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.lagradost.quicknovel.ui.download.Page>> getPages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCurrentTab() {
        return null;
    }
    
    public final void setCurrentTab(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    public final void switchPage(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job refreshCard(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded card) {
        return null;
    }
    
    public final void pause(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded card) {
    }
    
    public final void resume(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded card) {
    }
    
    public final void load(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.util.ResultCached card) {
    }
    
    public final void stream(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.util.ResultCached card) {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job readEpub(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded card) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job refresh() {
        return null;
    }
    
    public final void showMetadata(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded card) {
    }
    
    public final void showMetadata(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.util.ResultCached card) {
    }
    
    public final void load(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded card) {
    }
    
    public final void deleteAlert(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.util.ResultCached card) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.util.ResultCached card) {
    }
    
    public final void deleteAlert(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded card) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded card) {
    }
    
    private final boolean matchesQuery(java.lang.String x) {
        return false;
    }
    
    private final java.util.List<com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded> sortArray(java.util.ArrayList<com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded> currentArray) {
        return null;
    }
    
    private final java.util.List<com.lagradost.quicknovel.util.ResultCached> sortNormalArray(java.util.ArrayList<com.lagradost.quicknovel.util.ResultCached> currentArray) {
        return null;
    }
    
    public final void resortAllData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job loadAllData() {
        return null;
    }
    
    private final java.lang.Object getDownloadedCards(kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.ui.download.Page> $completion) {
        return null;
    }
    
    private final java.lang.Object postCards(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final kotlinx.coroutines.Job progressChanged(kotlin.Pair<java.lang.Integer, com.lagradost.quicknovel.DownloadProgressState> data) {
        return null;
    }
    
    private final kotlinx.coroutines.Job downloadRemoved(int id) {
        return null;
    }
    
    private final kotlinx.coroutines.Job progressDataChanged(kotlin.Pair<java.lang.Integer, com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadData> data) {
        return null;
    }
    
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    private final kotlinx.coroutines.Job downloadDataRefreshed(int _id) {
        return null;
    }
}