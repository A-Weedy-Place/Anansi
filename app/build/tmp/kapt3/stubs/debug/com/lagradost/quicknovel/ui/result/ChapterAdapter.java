package com.lagradost.quicknovel.ui.result;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/lagradost/quicknovel/ui/result/ChapterAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/lagradost/quicknovel/ChapterData;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewModel", "Lcom/lagradost/quicknovel/ui/result/ResultViewModel;", "(Lcom/lagradost/quicknovel/ui/result/ResultViewModel;)V", "getViewModel", "()Lcom/lagradost/quicknovel/ui/result/ResultViewModel;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ChapterAdapterHolder", "DiffCallback", "app_debug"})
public final class ChapterAdapter extends androidx.recyclerview.widget.ListAdapter<com.lagradost.quicknovel.ChapterData, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.ui.result.ResultViewModel viewModel = null;
    
    public ChapterAdapter(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.result.ResultViewModel viewModel) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.ui.result.ResultViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/lagradost/quicknovel/ui/result/ChapterAdapter$ChapterAdapterHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/lagradost/quicknovel/databinding/SimpleChapterBinding;", "(Lcom/lagradost/quicknovel/databinding/SimpleChapterBinding;)V", "bind", "", "card", "Lcom/lagradost/quicknovel/ChapterData;", "viewModel", "Lcom/lagradost/quicknovel/ui/result/ResultViewModel;", "refresh", "app_debug"})
    public static final class ChapterAdapterHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.databinding.SimpleChapterBinding binding = null;
        
        public ChapterAdapterHolder(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.databinding.SimpleChapterBinding binding) {
            super(null);
        }
        
        private final void refresh(com.lagradost.quicknovel.ChapterData card, com.lagradost.quicknovel.ui.result.ResultViewModel viewModel) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ChapterData card, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ui.result.ResultViewModel viewModel) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/lagradost/quicknovel/ui/result/ChapterAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/lagradost/quicknovel/ChapterData;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.lagradost.quicknovel.ChapterData> {
        
        public DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ChapterData oldItem, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ChapterData newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ChapterData oldItem, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ChapterData newItem) {
            return false;
        }
    }
}