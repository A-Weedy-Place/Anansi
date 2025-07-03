package com.lagradost.quicknovel.ui;

/**
 * ListUpdateCallback that dispatches update events to the given adapter.
 *
 * @see DiffUtil.DiffResult.dispatchUpdatesTo
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0017J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/lagradost/quicknovel/ui/NonFinalAdapterListUpdateCallback;", "Landroidx/recyclerview/widget/ListUpdateCallback;", "mAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "onChanged", "", "position", "", "count", "payload", "", "onInserted", "onMoved", "fromPosition", "toPosition", "onRemoved", "app_debug"})
public class NonFinalAdapterListUpdateCallback implements androidx.recyclerview.widget.ListUpdateCallback {
    @org.jetbrains.annotations.NotNull()
    private androidx.recyclerview.widget.RecyclerView.Adapter<?> mAdapter;
    
    public NonFinalAdapterListUpdateCallback(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> mAdapter) {
        super();
    }
    
    @java.lang.Override()
    public void onInserted(int position, int count) {
    }
    
    @java.lang.Override()
    public void onRemoved(int position, int count) {
    }
    
    @java.lang.Override()
    public void onMoved(int fromPosition, int toPosition) {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"UnknownNullness"})
    public void onChanged(int position, int count, @org.jetbrains.annotations.Nullable()
    java.lang.Object payload) {
    }
}