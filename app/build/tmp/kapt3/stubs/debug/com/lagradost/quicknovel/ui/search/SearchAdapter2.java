package com.lagradost.quicknovel.ui.search;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/lagradost/quicknovel/ui/search/SearchAdapter2;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/lagradost/quicknovel/SearchResponse;", "Lcom/lagradost/quicknovel/ui/search/SearchAdapter2$SearchAdapter2Holder;", "viewModel", "Lcom/lagradost/quicknovel/ui/search/SearchViewModel;", "resView", "Lcom/lagradost/quicknovel/widget/AutofitRecyclerView;", "(Lcom/lagradost/quicknovel/ui/search/SearchViewModel;Lcom/lagradost/quicknovel/widget/AutofitRecyclerView;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "SearchAdapter2Holder", "app_debug"})
public final class SearchAdapter2 extends androidx.recyclerview.widget.ListAdapter<com.lagradost.quicknovel.SearchResponse, com.lagradost.quicknovel.ui.search.SearchAdapter2.SearchAdapter2Holder> {
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.ui.search.SearchViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.widget.AutofitRecyclerView resView = null;
    
    public SearchAdapter2(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.search.SearchViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.widget.AutofitRecyclerView resView) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.lagradost.quicknovel.ui.search.SearchAdapter2.SearchAdapter2Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.search.SearchAdapter2.SearchAdapter2Holder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/lagradost/quicknovel/ui/search/SearchAdapter2$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/lagradost/quicknovel/SearchResponse;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.lagradost.quicknovel.SearchResponse> {
        
        public DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.SearchResponse oldItem, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.SearchResponse newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.SearchResponse oldItem, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.SearchResponse newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/lagradost/quicknovel/ui/search/SearchAdapter2$SearchAdapter2Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/lagradost/quicknovel/databinding/SearchResultGridBinding;", "resView", "Lcom/lagradost/quicknovel/widget/AutofitRecyclerView;", "viewModel", "Lcom/lagradost/quicknovel/ui/search/SearchViewModel;", "(Lcom/lagradost/quicknovel/databinding/SearchResultGridBinding;Lcom/lagradost/quicknovel/widget/AutofitRecyclerView;Lcom/lagradost/quicknovel/ui/search/SearchViewModel;)V", "bind", "", "card", "Lcom/lagradost/quicknovel/SearchResponse;", "app_debug"})
    public static final class SearchAdapter2Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.databinding.SearchResultGridBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.widget.AutofitRecyclerView resView = null;
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.ui.search.SearchViewModel viewModel = null;
        
        public SearchAdapter2Holder(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.databinding.SearchResultGridBinding binding, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.widget.AutofitRecyclerView resView, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ui.search.SearchViewModel viewModel) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.SearchResponse card) {
        }
    }
}