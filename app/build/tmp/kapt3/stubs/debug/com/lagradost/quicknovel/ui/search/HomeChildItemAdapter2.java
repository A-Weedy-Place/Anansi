package com.lagradost.quicknovel.ui.search;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/lagradost/quicknovel/ui/search/HomeChildItemAdapter2;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/lagradost/quicknovel/SearchResponse;", "Lcom/lagradost/quicknovel/ui/search/HomeChildItemAdapter2$HomeChildItemAdapter2Holder;", "viewModel", "Lcom/lagradost/quicknovel/ui/search/SearchViewModel;", "(Lcom/lagradost/quicknovel/ui/search/SearchViewModel;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "HomeChildItemAdapter2Holder", "app_debug"})
public final class HomeChildItemAdapter2 extends androidx.recyclerview.widget.ListAdapter<com.lagradost.quicknovel.SearchResponse, com.lagradost.quicknovel.ui.search.HomeChildItemAdapter2.HomeChildItemAdapter2Holder> {
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.ui.search.SearchViewModel viewModel = null;
    
    public HomeChildItemAdapter2(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.search.SearchViewModel viewModel) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.lagradost.quicknovel.ui.search.HomeChildItemAdapter2.HomeChildItemAdapter2Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.search.HomeChildItemAdapter2.HomeChildItemAdapter2Holder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/lagradost/quicknovel/ui/search/HomeChildItemAdapter2$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/lagradost/quicknovel/SearchResponse;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/lagradost/quicknovel/ui/search/HomeChildItemAdapter2$HomeChildItemAdapter2Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/lagradost/quicknovel/databinding/HomeResultGridBinding;", "viewModel", "Lcom/lagradost/quicknovel/ui/search/SearchViewModel;", "(Lcom/lagradost/quicknovel/databinding/HomeResultGridBinding;Lcom/lagradost/quicknovel/ui/search/SearchViewModel;)V", "bind", "", "card", "Lcom/lagradost/quicknovel/SearchResponse;", "app_debug"})
    public static final class HomeChildItemAdapter2Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.databinding.HomeResultGridBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.ui.search.SearchViewModel viewModel = null;
        
        public HomeChildItemAdapter2Holder(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.databinding.HomeResultGridBinding binding, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ui.search.SearchViewModel viewModel) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.SearchResponse card) {
        }
    }
}