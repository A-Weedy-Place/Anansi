package com.lagradost.quicknovel.ui.download;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J&\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/lagradost/quicknovel/ui/download/AnyAdapter;", "Lcom/lagradost/quicknovel/ui/BaseAdapter;", "", "", "resView", "Lcom/lagradost/quicknovel/widget/AutofitRecyclerView;", "downloadViewModel", "Lcom/lagradost/quicknovel/ui/download/DownloadViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "id", "", "(Lcom/lagradost/quicknovel/widget/AutofitRecyclerView;Lcom/lagradost/quicknovel/ui/download/DownloadViewModel;Landroidx/fragment/app/Fragment;I)V", "getItemViewTypeCustom", "item", "onBindContent", "", "holder", "Lcom/lagradost/quicknovel/ui/ViewHolderState;", "position", "onCreateCustom", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "app_debug"})
public final class AnyAdapter extends com.lagradost.quicknovel.ui.BaseAdapter {
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.widget.AutofitRecyclerView resView = null;
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.ui.download.DownloadViewModel downloadViewModel = null;
    public static final int RESULT_CACHED = 1;
    public static final int DOWNLOAD_DATA_LOADED = 2;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.ui.download.AnyAdapter.Companion Companion = null;
    
    public AnyAdapter(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.widget.AutofitRecyclerView resView, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.download.DownloadViewModel downloadViewModel, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int id) {
        super(null, 0, null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.lagradost.quicknovel.ui.ViewHolderState onCreateCustom(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindContent(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.ViewHolderState holder, @org.jetbrains.annotations.NotNull()
    java.lang.Object item, int position) {
    }
    
    @java.lang.Override()
    protected int getItemViewTypeCustom(@org.jetbrains.annotations.NotNull()
    java.lang.Object item) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/lagradost/quicknovel/ui/download/AnyAdapter$Companion;", "", "()V", "DOWNLOAD_DATA_LOADED", "", "RESULT_CACHED", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}