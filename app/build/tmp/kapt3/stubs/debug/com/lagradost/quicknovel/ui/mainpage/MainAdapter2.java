package com.lagradost.quicknovel.ui.mainpage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ&\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0016\u0010\u0015\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u000eR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/lagradost/quicknovel/ui/mainpage/MainAdapter2;", "Lcom/lagradost/quicknovel/ui/BaseAdapter;", "Lcom/lagradost/quicknovel/SearchResponse;", "", "resView", "Lcom/lagradost/quicknovel/widget/AutofitRecyclerView;", "fragment", "Landroidx/fragment/app/Fragment;", "footers", "", "(Lcom/lagradost/quicknovel/widget/AutofitRecyclerView;Landroidx/fragment/app/Fragment;I)V", "getFooters", "()I", "loadingItems", "", "onBindContent", "", "holder", "Lcom/lagradost/quicknovel/ui/ViewHolderState;", "item", "position", "onBindFooter", "onCreateContent", "parent", "Landroid/view/ViewGroup;", "onCreateFooter", "setLoading", "to", "app_debug"})
public final class MainAdapter2 extends com.lagradost.quicknovel.ui.BaseAdapter {
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.widget.AutofitRecyclerView resView = null;
    private final int footers = 0;
    private boolean loadingItems = false;
    
    public MainAdapter2(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.widget.AutofitRecyclerView resView, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int footers) {
        super(null, 0, null);
    }
    
    @java.lang.Override()
    public int getFooters() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindFooter(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.ViewHolderState holder) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.lagradost.quicknovel.ui.ViewHolderState onCreateContent(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.lagradost.quicknovel.ui.ViewHolderState onCreateFooter(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindContent(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.ViewHolderState holder, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.SearchResponse item, int position) {
    }
    
    public final void setLoading(boolean to) {
    }
}