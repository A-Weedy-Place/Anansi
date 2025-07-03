package com.lagradost.quicknovel.ui.download;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003345B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u001a\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0017J\b\u0010.\u001a\u00020!H\u0002J\u0014\u0010/\u001a\u00020!*\u0002002\b\b\u0002\u00101\u001a\u000202R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00066"}, d2 = {"Lcom/lagradost/quicknovel/ui/download/DownloadFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/lagradost/quicknovel/databinding/FragmentDownloadsBinding;", "getBinding", "()Lcom/lagradost/quicknovel/databinding/FragmentDownloadsBinding;", "setBinding", "(Lcom/lagradost/quicknovel/databinding/FragmentDownloadsBinding;)V", "isOnDownloads", "", "()Z", "normalSortingMethods", "", "Lcom/lagradost/quicknovel/ui/download/DownloadFragment$SortingMethod;", "[Lcom/lagradost/quicknovel/ui/download/DownloadFragment$SortingMethod;", "searchExitIcon", "Landroid/widget/ImageView;", "getSearchExitIcon", "()Landroid/widget/ImageView;", "setSearchExitIcon", "(Landroid/widget/ImageView;)V", "searchMagIcon", "getSearchMagIcon", "setSearchMagIcon", "sortingMethods", "viewModel", "Lcom/lagradost/quicknovel/ui/download/DownloadViewModel;", "getViewModel", "()Lcom/lagradost/quicknovel/ui/download/DownloadViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setupGridView", "reduceDragSensitivity", "Landroidx/viewpager2/widget/ViewPager2;", "f", "", "DownloadData", "DownloadDataLoaded", "SortingMethod", "app_debug"})
public final class DownloadFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    public com.lagradost.quicknovel.databinding.FragmentDownloadsBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.ui.download.DownloadFragment.SortingMethod[] sortingMethods = null;
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.ui.download.DownloadFragment.SortingMethod[] normalSortingMethods = null;
    public android.widget.ImageView searchExitIcon;
    public android.widget.ImageView searchMagIcon;
    
    public DownloadFragment() {
        super();
    }
    
    private final com.lagradost.quicknovel.ui.download.DownloadViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.databinding.FragmentDownloadsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.databinding.FragmentDownloadsBinding p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupGridView() {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    public final void reduceDragSensitivity(@org.jetbrains.annotations.NotNull()
    androidx.viewpager2.widget.ViewPager2 $this$reduceDragSensitivity, int f) {
    }
    
    public final boolean isOnDownloads() {
        return false;
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
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0012J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010(\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010-\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010.\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u00c6\u0003J\u009e\u0001\u00101\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0003\u0010\u000e\u001a\u00020\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u00020\bH\u00d6\u0001J\t\u00107\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\n\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b$\u0010\u001c\u00a8\u00068"}, d2 = {"Lcom/lagradost/quicknovel/ui/download/DownloadFragment$DownloadData;", "", "source", "", "name", "author", "posterUrl", "rating", "", "peopleVoted", "views", "synopsis", "tags", "", "apiName", "lastUpdated", "", "lastDownloaded", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getApiName", "()Ljava/lang/String;", "getAuthor", "getLastDownloaded", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLastUpdated", "getName", "getPeopleVoted", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPosterUrl", "getRating", "getSource", "getSynopsis", "getTags", "()Ljava/util/List;", "getViews", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/lagradost/quicknovel/ui/download/DownloadFragment$DownloadData;", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class DownloadData {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String source = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String author = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String posterUrl = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer rating = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer peopleVoted = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer views = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String synopsis = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<java.lang.String> tags = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String apiName = null;
        
        /**
         * Unix time ms
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long lastUpdated = null;
        
        /**
         * Unix time ms
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long lastDownloaded = null;
        
        public DownloadData(@com.fasterxml.jackson.annotation.JsonProperty(value = "source")
        @org.jetbrains.annotations.NotNull()
        java.lang.String source, @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
        @org.jetbrains.annotations.NotNull()
        java.lang.String name, @com.fasterxml.jackson.annotation.JsonProperty(value = "author")
        @org.jetbrains.annotations.Nullable()
        java.lang.String author, @com.fasterxml.jackson.annotation.JsonProperty(value = "posterUrl")
        @org.jetbrains.annotations.Nullable()
        java.lang.String posterUrl, @com.fasterxml.jackson.annotation.JsonProperty(value = "rating")
        @org.jetbrains.annotations.Nullable()
        java.lang.Integer rating, @com.fasterxml.jackson.annotation.JsonProperty(value = "peopleVoted")
        @org.jetbrains.annotations.Nullable()
        java.lang.Integer peopleVoted, @com.fasterxml.jackson.annotation.JsonProperty(value = "views")
        @org.jetbrains.annotations.Nullable()
        java.lang.Integer views, @com.fasterxml.jackson.annotation.JsonProperty(value = "synopsis")
        @org.jetbrains.annotations.Nullable()
        java.lang.String synopsis, @com.fasterxml.jackson.annotation.JsonProperty(value = "tags")
        @org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> tags, @com.fasterxml.jackson.annotation.JsonProperty(value = "apiName")
        @org.jetbrains.annotations.NotNull()
        java.lang.String apiName, @com.fasterxml.jackson.annotation.JsonProperty(value = "lastUpdated")
        @org.jetbrains.annotations.Nullable()
        java.lang.Long lastUpdated, @com.fasterxml.jackson.annotation.JsonProperty(value = "lastDownloaded")
        @org.jetbrains.annotations.Nullable()
        java.lang.Long lastDownloaded) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSource() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPosterUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getRating() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPeopleVoted() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getViews() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSynopsis() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getTags() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getApiName() {
            return null;
        }
        
        /**
         * Unix time ms
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getLastUpdated() {
            return null;
        }
        
        /**
         * Unix time ms
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getLastDownloaded() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component12() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadData copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "source")
        @org.jetbrains.annotations.NotNull()
        java.lang.String source, @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
        @org.jetbrains.annotations.NotNull()
        java.lang.String name, @com.fasterxml.jackson.annotation.JsonProperty(value = "author")
        @org.jetbrains.annotations.Nullable()
        java.lang.String author, @com.fasterxml.jackson.annotation.JsonProperty(value = "posterUrl")
        @org.jetbrains.annotations.Nullable()
        java.lang.String posterUrl, @com.fasterxml.jackson.annotation.JsonProperty(value = "rating")
        @org.jetbrains.annotations.Nullable()
        java.lang.Integer rating, @com.fasterxml.jackson.annotation.JsonProperty(value = "peopleVoted")
        @org.jetbrains.annotations.Nullable()
        java.lang.Integer peopleVoted, @com.fasterxml.jackson.annotation.JsonProperty(value = "views")
        @org.jetbrains.annotations.Nullable()
        java.lang.Integer views, @com.fasterxml.jackson.annotation.JsonProperty(value = "synopsis")
        @org.jetbrains.annotations.Nullable()
        java.lang.String synopsis, @com.fasterxml.jackson.annotation.JsonProperty(value = "tags")
        @org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> tags, @com.fasterxml.jackson.annotation.JsonProperty(value = "apiName")
        @org.jetbrains.annotations.NotNull()
        java.lang.String apiName, @com.fasterxml.jackson.annotation.JsonProperty(value = "lastUpdated")
        @org.jetbrains.annotations.Nullable()
        java.lang.Long lastUpdated, @com.fasterxml.jackson.annotation.JsonProperty(value = "lastDownloaded")
        @org.jetbrains.annotations.Nullable()
        java.lang.Long lastDownloaded) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u0010\u001aJ\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\bH\u00c6\u0003J\t\u0010=\u001a\u00020\bH\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0013H\u00c6\u0003J\t\u0010@\u001a\u00020\bH\u00c6\u0003J\t\u0010A\u001a\u00020\u0016H\u00c6\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010C\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0010\u0010H\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0010\u0010I\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u00c6\u0003J\u00da\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u00c6\u0001\u00a2\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020\u00162\b\u0010O\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\b\u0010P\u001a\u00020\bH\u0016J\t\u0010Q\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0014\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0013\u0010%\u001a\u0004\u0018\u00010&8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\n\n\u0002\u0010+\u001a\u0004\b,\u0010*R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0015\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u00100\u001a\u0004\b2\u0010/R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001cR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0015\u0010\n\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u00100\u001a\u0004\b9\u0010/\u00a8\u0006R"}, d2 = {"Lcom/lagradost/quicknovel/ui/download/DownloadFragment$DownloadDataLoaded;", "", "source", "", "name", "author", "posterUrl", "rating", "", "peopleVoted", "views", "synopsis", "tags", "", "apiName", "downloadedCount", "downloadedTotal", "ETA", "state", "Lcom/lagradost/quicknovel/DownloadState;", "id", "generating", "", "lastUpdated", "", "lastDownloaded", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;IILjava/lang/String;Lcom/lagradost/quicknovel/DownloadState;IZLjava/lang/Long;Ljava/lang/Long;)V", "getETA", "()Ljava/lang/String;", "getApiName", "getAuthor", "getDownloadedCount", "()I", "getDownloadedTotal", "getGenerating", "()Z", "getId", "image", "Lcom/lagradost/quicknovel/ui/UiImage;", "getImage", "()Lcom/lagradost/quicknovel/ui/UiImage;", "getLastDownloaded", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLastUpdated", "getName", "getPeopleVoted", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPosterUrl", "getRating", "getSource", "getState", "()Lcom/lagradost/quicknovel/DownloadState;", "getSynopsis", "getTags", "()Ljava/util/List;", "getViews", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;IILjava/lang/String;Lcom/lagradost/quicknovel/DownloadState;IZLjava/lang/Long;Ljava/lang/Long;)Lcom/lagradost/quicknovel/ui/download/DownloadFragment$DownloadDataLoaded;", "equals", "other", "hashCode", "toString", "app_debug"})
    public static final class DownloadDataLoaded {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String source = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String author = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String posterUrl = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer rating = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer peopleVoted = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer views = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String synopsis = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<java.lang.String> tags = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String apiName = null;
        private final int downloadedCount = 0;
        private final int downloadedTotal = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ETA = null;
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.DownloadState state = null;
        private final int id = 0;
        private final boolean generating = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long lastUpdated = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long lastDownloaded = null;
        
        public DownloadDataLoaded(@org.jetbrains.annotations.NotNull()
        java.lang.String source, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String author, @org.jetbrains.annotations.Nullable()
        java.lang.String posterUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Integer rating, @org.jetbrains.annotations.Nullable()
        java.lang.Integer peopleVoted, @org.jetbrains.annotations.Nullable()
        java.lang.Integer views, @org.jetbrains.annotations.Nullable()
        java.lang.String synopsis, @org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> tags, @org.jetbrains.annotations.NotNull()
        java.lang.String apiName, int downloadedCount, int downloadedTotal, @org.jetbrains.annotations.NotNull()
        java.lang.String ETA, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.DownloadState state, int id, boolean generating, @org.jetbrains.annotations.Nullable()
        java.lang.Long lastUpdated, @org.jetbrains.annotations.Nullable()
        java.lang.Long lastDownloaded) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSource() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPosterUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getRating() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPeopleVoted() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getViews() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSynopsis() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getTags() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getApiName() {
            return null;
        }
        
        public final int getDownloadedCount() {
            return 0;
        }
        
        public final int getDownloadedTotal() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getETA() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.DownloadState getState() {
            return null;
        }
        
        public final int getId() {
            return 0;
        }
        
        public final boolean getGenerating() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getLastUpdated() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getLastDownloaded() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.lagradost.quicknovel.ui.UiImage getImage() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component10() {
            return null;
        }
        
        public final int component11() {
            return 0;
        }
        
        public final int component12() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.DownloadState component14() {
            return null;
        }
        
        public final int component15() {
            return 0;
        }
        
        public final boolean component16() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component17() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component18() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.ui.download.DownloadFragment.DownloadDataLoaded copy(@org.jetbrains.annotations.NotNull()
        java.lang.String source, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String author, @org.jetbrains.annotations.Nullable()
        java.lang.String posterUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Integer rating, @org.jetbrains.annotations.Nullable()
        java.lang.Integer peopleVoted, @org.jetbrains.annotations.Nullable()
        java.lang.Integer views, @org.jetbrains.annotations.Nullable()
        java.lang.String synopsis, @org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> tags, @org.jetbrains.annotations.NotNull()
        java.lang.String apiName, int downloadedCount, int downloadedTotal, @org.jetbrains.annotations.NotNull()
        java.lang.String ETA, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.DownloadState state, int id, boolean generating, @org.jetbrains.annotations.Nullable()
        java.lang.Long lastUpdated, @org.jetbrains.annotations.Nullable()
        java.lang.Long lastDownloaded) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/lagradost/quicknovel/ui/download/DownloadFragment$SortingMethod;", "", "name", "", "id", "inverse", "(III)V", "getId", "()I", "getInverse", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class SortingMethod {
        private final int name = 0;
        private final int id = 0;
        private final int inverse = 0;
        
        public SortingMethod(@androidx.annotation.StringRes()
        int name, int id, int inverse) {
            super();
        }
        
        public final int getName() {
            return 0;
        }
        
        public final int getId() {
            return 0;
        }
        
        public final int getInverse() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.ui.download.DownloadFragment.SortingMethod copy(@androidx.annotation.StringRes()
        int name, int id, int inverse) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}