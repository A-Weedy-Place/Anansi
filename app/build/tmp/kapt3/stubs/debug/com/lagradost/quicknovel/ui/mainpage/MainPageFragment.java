package com.lagradost.quicknovel.ui.mainpage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 =2\u00020\u0001:\u0001=B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J$\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u001a\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u0002032\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010<\u001a\u00020/H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\'\u0010(R\u001a\u0010+\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!\u00a8\u0006>"}, d2 = {"Lcom/lagradost/quicknovel/ui/mainpage/MainPageFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/lagradost/quicknovel/databinding/FragmentMainpageBinding;", "getBinding", "()Lcom/lagradost/quicknovel/databinding/FragmentMainpageBinding;", "setBinding", "(Lcom/lagradost/quicknovel/databinding/FragmentMainpageBinding;)V", "defMainCategory", "", "getDefMainCategory", "()Ljava/lang/Integer;", "setDefMainCategory", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "defOrderBy", "getDefOrderBy", "setDefOrderBy", "defTag", "getDefTag", "setDefTag", "isInSearch", "", "()Z", "setInSearch", "(Z)V", "isLoading", "setLoading", "pastVisiblesItems", "getPastVisiblesItems", "()I", "setPastVisiblesItems", "(I)V", "totalItemCount", "getTotalItemCount", "setTotalItemCount", "viewModel", "Lcom/lagradost/quicknovel/ui/mainpage/MainPageViewModel;", "getViewModel", "()Lcom/lagradost/quicknovel/ui/mainpage/MainPageViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "visibleItemCount", "getVisibleItemCount", "setVisibleItemCount", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setupGridView", "Companion", "app_debug"})
public final class MainPageFragment extends androidx.fragment.app.Fragment {
    public com.lagradost.quicknovel.databinding.FragmentMainpageBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isLoading = false;
    private int pastVisiblesItems = 0;
    private int visibleItemCount = 0;
    private int totalItemCount = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer defMainCategory;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer defOrderBy;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer defTag;
    private boolean isInSearch = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.ui.mainpage.MainPageFragment.Companion Companion = null;
    
    public MainPageFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.databinding.FragmentMainpageBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.databinding.FragmentMainpageBinding p0) {
    }
    
    private final com.lagradost.quicknovel.ui.mainpage.MainPageViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    public final int getPastVisiblesItems() {
        return 0;
    }
    
    public final void setPastVisiblesItems(int p0) {
    }
    
    public final int getVisibleItemCount() {
        return 0;
    }
    
    public final void setVisibleItemCount(int p0) {
    }
    
    public final int getTotalItemCount() {
        return 0;
    }
    
    public final void setTotalItemCount(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDefMainCategory() {
        return null;
    }
    
    public final void setDefMainCategory(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDefOrderBy() {
        return null;
    }
    
    public final void setDefOrderBy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDefTag() {
        return null;
    }
    
    public final void setDefTag(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final boolean isInSearch() {
        return false;
    }
    
    public final void setInSearch(boolean p0) {
    }
    
    private final void setupGridView() {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/lagradost/quicknovel/ui/mainpage/MainPageFragment$Companion;", "", "()V", "newInstance", "Landroid/os/Bundle;", "apiName", "", "mainCategory", "", "orderBy", "tag", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/os/Bundle;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String apiName, @org.jetbrains.annotations.Nullable()
        java.lang.Integer mainCategory, @org.jetbrains.annotations.Nullable()
        java.lang.Integer orderBy, @org.jetbrains.annotations.Nullable()
        java.lang.Integer tag) {
            return null;
        }
    }
}