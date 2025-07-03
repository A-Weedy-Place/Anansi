package com.lagradost.quicknovel.ui.download;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B8\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t\u00a2\u0006\u0002\u0010\u000fJ&\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J&\u0010\u001d\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R,\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/lagradost/quicknovel/ui/download/ViewpagerAdapter;", "Lcom/lagradost/quicknovel/ui/BaseAdapter;", "Lcom/lagradost/quicknovel/ui/download/Page;", "Landroid/os/Bundle;", "downloadViewModel", "Lcom/lagradost/quicknovel/ui/download/DownloadViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "scrollCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isScrollingDown", "", "(Lcom/lagradost/quicknovel/ui/download/DownloadViewModel;Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getScrollCallback", "()Lkotlin/jvm/functions/Function1;", "onBindContent", "holder", "Lcom/lagradost/quicknovel/ui/ViewHolderState;", "item", "position", "", "onCreateContent", "parent", "Landroid/view/ViewGroup;", "onUpdateContent", "app_debug"})
public final class ViewpagerAdapter extends com.lagradost.quicknovel.ui.BaseAdapter<com.lagradost.quicknovel.ui.download.Page, android.os.Bundle> {
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.ui.download.DownloadViewModel downloadViewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.Fragment fragment = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> scrollCallback = null;
    
    public ViewpagerAdapter(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.download.DownloadViewModel downloadViewModel, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> scrollCallback) {
        super(null, 0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.Fragment getFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getScrollCallback() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.lagradost.quicknovel.ui.ViewHolderState<android.os.Bundle> onCreateContent(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void onUpdateContent(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.ViewHolderState<android.os.Bundle> holder, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.download.Page item, int position) {
    }
    
    @java.lang.Override()
    public void onBindContent(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.ViewHolderState<android.os.Bundle> holder, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.download.Page item, int position) {
    }
}