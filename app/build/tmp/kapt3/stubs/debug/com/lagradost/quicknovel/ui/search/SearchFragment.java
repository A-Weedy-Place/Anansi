package com.lagradost.quicknovel.ui.search;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006("}, d2 = {"Lcom/lagradost/quicknovel/ui/search/SearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/lagradost/quicknovel/databinding/FragmentSearchBinding;", "getBinding", "()Lcom/lagradost/quicknovel/databinding/FragmentSearchBinding;", "setBinding", "(Lcom/lagradost/quicknovel/databinding/FragmentSearchBinding;)V", "searchExitIcon", "Landroid/widget/ImageView;", "getSearchExitIcon", "()Landroid/widget/ImageView;", "setSearchExitIcon", "(Landroid/widget/ImageView;)V", "searchMagIcon", "getSearchMagIcon", "setSearchMagIcon", "viewModel", "Lcom/lagradost/quicknovel/ui/search/SearchViewModel;", "getViewModel", "()Lcom/lagradost/quicknovel/ui/search/SearchViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "fixGrid", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_debug"})
public final class SearchFragment extends androidx.fragment.app.Fragment {
    public com.lagradost.quicknovel.databinding.FragmentSearchBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.lagradost.quicknovel.util.Event<java.lang.Integer> configEvent = null;
    private static int currentSpan = 1;
    @org.jetbrains.annotations.Nullable()
    private static android.app.Dialog currentDialog;
    public android.widget.ImageView searchExitIcon;
    public android.widget.ImageView searchMagIcon;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.ui.search.SearchFragment.Companion Companion = null;
    
    public SearchFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.databinding.FragmentSearchBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.databinding.FragmentSearchBinding p0) {
    }
    
    private final com.lagradost.quicknovel.ui.search.SearchViewModel getViewModel() {
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
    
    private final void fixGrid() {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getSearchExitIcon() {
        return null;
    }
    
    public final void setSearchExitIcon(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getSearchMagIcon() {
        return null;
    }
    
    public final void setSearchMagIcon(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lcom/lagradost/quicknovel/ui/search/SearchFragment$Companion;", "", "()V", "configEvent", "Lcom/lagradost/quicknovel/util/Event;", "", "getConfigEvent", "()Lcom/lagradost/quicknovel/util/Event;", "currentDialog", "Landroid/app/Dialog;", "getCurrentDialog", "()Landroid/app/Dialog;", "setCurrentDialog", "(Landroid/app/Dialog;)V", "currentSpan", "getCurrentSpan", "()I", "setCurrentSpan", "(I)V", "loadHomepageList", "", "viewModel", "Lcom/lagradost/quicknovel/ui/search/SearchViewModel;", "item", "Lcom/lagradost/quicknovel/HomePageList;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.util.Event<java.lang.Integer> getConfigEvent() {
            return null;
        }
        
        public final int getCurrentSpan() {
            return 0;
        }
        
        public final void setCurrentSpan(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.app.Dialog getCurrentDialog() {
            return null;
        }
        
        public final void setCurrentDialog(@org.jetbrains.annotations.Nullable()
        android.app.Dialog p0) {
        }
        
        public final void loadHomepageList(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ui.search.SearchViewModel viewModel, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.HomePageList item) {
        }
    }
}