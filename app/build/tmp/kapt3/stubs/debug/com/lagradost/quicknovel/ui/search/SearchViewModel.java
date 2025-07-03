package com.lagradost.quicknovel.ui.search;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\nR$\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\u0005j\b\u0012\u0004\u0012\u00020\n`\u00070\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R-\u0010\u0018\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\u0005j\b\u0012\u0004\u0012\u00020\n`\u00070\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u000e\u00a8\u0006&"}, d2 = {"Lcom/lagradost/quicknovel/ui/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_currentSearch", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/lagradost/quicknovel/OnGoingSearch;", "Lkotlin/collections/ArrayList;", "_searchResponse", "Lcom/lagradost/quicknovel/mvvm/Resource;", "Lcom/lagradost/quicknovel/SearchResponse;", "currentSearch", "Landroidx/lifecycle/LiveData;", "getCurrentSearch", "()Landroidx/lifecycle/LiveData;", "repos", "", "Lcom/lagradost/quicknovel/APIRepository;", "searchCounter", "", "getSearchCounter", "()I", "setSearchCounter", "(I)V", "searchResponse", "getSearchResponse", "clearSearch", "", "load", "card", "loadHomepageList", "item", "Lcom/lagradost/quicknovel/HomePageList;", "search", "Lkotlinx/coroutines/Job;", "query", "", "showMetadata", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.lagradost.quicknovel.mvvm.Resource<java.util.ArrayList<com.lagradost.quicknovel.SearchResponse>>> _searchResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.lagradost.quicknovel.OnGoingSearch>> _currentSearch = null;
    private int searchCounter = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.lagradost.quicknovel.APIRepository> repos = null;
    
    public SearchViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.lagradost.quicknovel.mvvm.Resource<java.util.ArrayList<com.lagradost.quicknovel.SearchResponse>>> getSearchResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.lagradost.quicknovel.OnGoingSearch>> getCurrentSearch() {
        return null;
    }
    
    public final int getSearchCounter() {
        return 0;
    }
    
    public final void setSearchCounter(int p0) {
    }
    
    private final void clearSearch() {
    }
    
    public final void load(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.SearchResponse card) {
    }
    
    public final void showMetadata(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.SearchResponse card) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job search(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    public final void loadHomepageList(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.HomePageList item) {
    }
}