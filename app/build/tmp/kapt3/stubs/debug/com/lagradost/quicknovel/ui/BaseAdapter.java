package com.lagradost.quicknovel.ui;

/**
 * BaseAdapter is a persistent state stored adapter that supports headers and footers.
 * This should be used for restoring eg scroll or focus related to a view when it is recreated.
 *
 * Id is a per fragment based unique id used to store the underlying data done in an internal ViewModel.
 *
 * diffCallback is how the view should be handled when updating, override onUpdateContent for updates
 *
 * NOTE:
 *
 * By default it should save automatically, but you can also call save(recycle)
 *
 * By default no state is stored, but doing an id != 0 will store
 *
 * By default no headers or footers exist, override footers and headers count
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0002\b&\u0018\u0000 F*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00050\u0004:\u0001FB\'\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\t\u00a2\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\tH\u0016J\u0015\u0010#\u001a\u0004\u0018\u00018\u00002\u0006\u0010 \u001a\u00020\t\u00a2\u0006\u0002\u0010!J\u000e\u0010$\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tJ\u0010\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0002H\u0014J\u001d\u0010\'\u001a\u0004\u0018\u00018\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0002\u00a2\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,J+\u0010-\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010&\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\tH\u0016\u00a2\u0006\u0002\u0010.J\u0016\u0010/\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0016\u00100\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u001c\u00101\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010 \u001a\u00020\tJ,\u00101\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010 \u001a\u00020\t2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000203H\u0016J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u00105\u001a\u000206H\u0016J\u001e\u00107\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u00105\u001a\u0002062\u0006\u00108\u001a\u00020\tH\u0016J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u00105\u001a\u000206H\u0016J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u00105\u001a\u000206H\u0016J\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u00105\u001a\u0002062\u0006\u00108\u001a\u00020\tJ\u000e\u0010<\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,J+\u0010=\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010&\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\tH\u0016\u00a2\u0006\u0002\u0010.J\u0016\u0010>\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0016\u0010?\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0014\u0010@\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005J\u000e\u0010A\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,J\u0016\u0010B\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0002J\u0018\u0010C\u001a\u00020\u001e2\u000e\u0010D\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010EH\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006G"}, d2 = {"Lcom/lagradost/quicknovel/ui/BaseAdapter;", "T", "", "S", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/lagradost/quicknovel/ui/ViewHolderState;", "fragment", "Landroidx/fragment/app/Fragment;", "id", "", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/fragment/app/Fragment;ILandroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "attachListener", "Landroid/view/View$OnAttachStateChangeListener;", "footers", "getFooters", "()I", "headers", "getHeaders", "getId", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "stateViewModel", "Lcom/lagradost/quicknovel/ui/StateViewModel;", "getStateViewModel", "()Lcom/lagradost/quicknovel/ui/StateViewModel;", "stateViewModel$delegate", "Lkotlin/Lazy;", "clear", "", "getItem", "position", "(I)Ljava/lang/Object;", "getItemCount", "getItemOrNull", "getItemViewType", "getItemViewTypeCustom", "item", "getState", "holder", "(Lcom/lagradost/quicknovel/ui/ViewHolderState;)Ljava/lang/Object;", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindContent", "(Lcom/lagradost/quicknovel/ui/ViewHolderState;Ljava/lang/Object;I)V", "onBindFooter", "onBindHeader", "onBindViewHolder", "payloads", "", "onCreateContent", "parent", "Landroid/view/ViewGroup;", "onCreateCustom", "viewType", "onCreateFooter", "onCreateHeader", "onCreateViewHolder", "onDetachedFromRecyclerView", "onUpdateContent", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "save", "setState", "submitList", "list", "", "Companion", "app_debug"})
public abstract class BaseAdapter<T extends java.lang.Object, S extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.lagradost.quicknovel.ui.ViewHolderState<S>> {
    private final int id = 0;
    private final int footers = 0;
    private final int headers = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<T> mDiffer = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnAttachStateChangeListener attachListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy stateViewModel$delegate = null;
    public static final int HEADER = 2147483646;
    public static final int FOOTER = 2147483645;
    public static final int CONTENT = 2147483647;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.ui.BaseAdapter.Companion Companion = null;
    
    public BaseAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int id, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallback) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public int getFooters() {
        return 0;
    }
    
    public int getHeaders() {
        return 0;
    }
    
    protected int getItemViewTypeCustom(@org.jetbrains.annotations.NotNull()
    java.lang.Object item) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T getItem(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getItemOrNull(int position) {
        return null;
    }
    
    public void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> list) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public void onUpdateContent(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.ViewHolderState<S> holder, @org.jetbrains.annotations.NotNull()
    T item, int position) {
    }
    
    public void onBindContent(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.ViewHolderState<S> holder, @org.jetbrains.annotations.NotNull()
    T item, int position) {
    }
    
    public void onBindFooter(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.ViewHolderState<S> holder) {
    }
    
    public void onBindHeader(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.ViewHolderState<S> holder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.lagradost.quicknovel.ui.ViewHolderState<S> onCreateContent(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.lagradost.quicknovel.ui.ViewHolderState<S> onCreateFooter(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.lagradost.quicknovel.ui.ViewHolderState<S> onCreateHeader(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.lagradost.quicknovel.ui.ViewHolderState<S> onCreateCustom(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.ViewHolderState<S> holder) {
    }
    
    @java.lang.Override()
    public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.ViewHolderState<S> holder) {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public final void save(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    public final void clear() {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    private final S getState(com.lagradost.quicknovel.ui.ViewHolderState<S> holder) {
        return null;
    }
    
    private final void setState(com.lagradost.quicknovel.ui.ViewHolderState<S> holder) {
    }
    
    @java.lang.Override()
    public final void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public final void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public final int getItemViewType(int position) {
        return 0;
    }
    
    private final com.lagradost.quicknovel.ui.StateViewModel getStateViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public final void onViewRecycled(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.ViewHolderState<S> holder) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.ui.ViewHolderState<S> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.ViewHolderState<S> holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @java.lang.Override()
    public final void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.ViewHolderState<S> holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/lagradost/quicknovel/ui/BaseAdapter$Companion;", "", "()V", "CONTENT", "", "FOOTER", "HEADER", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}