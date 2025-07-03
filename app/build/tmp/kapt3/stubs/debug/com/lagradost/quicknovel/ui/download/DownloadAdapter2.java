package com.lagradost.quicknovel.ui.download;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0014\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/lagradost/quicknovel/ui/download/DownloadAdapter2;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/lagradost/quicknovel/ui/download/DownloadFragment$DownloadDataLoaded;", "Lcom/lagradost/quicknovel/ui/download/DownloadAdapter2$DownloadAdapter2Holder;", "viewModel", "Lcom/lagradost/quicknovel/ui/download/DownloadViewModel;", "resView", "Lcom/lagradost/quicknovel/widget/AutofitRecyclerView;", "(Lcom/lagradost/quicknovel/ui/download/DownloadViewModel;Lcom/lagradost/quicknovel/widget/AutofitRecyclerView;)V", "getItemId", "", "position", "", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "DownloadAdapter2Holder", "app_debug"})
public final class DownloadAdapter2 extends androidx.recyclerview.widget.ListAdapter<com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded, com.lagradost.quicknovel.ui.download.DownloadAdapter2.DownloadAdapter2Holder> {
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.ui.download.DownloadViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.widget.AutofitRecyclerView resView = null;
    
    public DownloadAdapter2(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.download.DownloadViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.widget.AutofitRecyclerView resView) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.lagradost.quicknovel.ui.download.DownloadAdapter2.DownloadAdapter2Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.download.DownloadAdapter2.DownloadAdapter2Holder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/lagradost/quicknovel/ui/download/DownloadAdapter2$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/lagradost/quicknovel/ui/download/DownloadFragment$DownloadDataLoaded;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded> {
        
        public DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded oldItem, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded oldItem, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/lagradost/quicknovel/ui/download/DownloadAdapter2$DownloadAdapter2Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/viewbinding/ViewBinding;", "(Landroidx/viewbinding/ViewBinding;)V", "bind", "", "card", "Lcom/lagradost/quicknovel/ui/download/DownloadFragment$DownloadDataLoaded;", "viewModel", "Lcom/lagradost/quicknovel/ui/download/DownloadViewModel;", "resView", "Lcom/lagradost/quicknovel/widget/AutofitRecyclerView;", "app_debug"})
    public static final class DownloadAdapter2Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.viewbinding.ViewBinding binding = null;
        
        public DownloadAdapter2Holder(@org.jetbrains.annotations.NotNull()
        androidx.viewbinding.ViewBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded card, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ui.download.DownloadViewModel viewModel, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.widget.AutofitRecyclerView resView) {
        }
    }
}