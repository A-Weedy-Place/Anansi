package com.lagradost.quicknovel.widget;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/lagradost/quicknovel/widget/AutofitRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "columnWidth", "", "itemWidth", "getItemWidth", "()I", "manager", "Lcom/lagradost/quicknovel/widget/GrdLayoutManager;", "value", "spanCount", "getSpanCount", "setSpanCount", "(I)V", "app_debug"})
public final class AutofitRecyclerView extends androidx.recyclerview.widget.RecyclerView {
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.widget.GrdLayoutManager manager = null;
    private int columnWidth = -1;
    private int spanCount = 0;
    
    @kotlin.jvm.JvmOverloads()
    public AutofitRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final int getSpanCount() {
        return 0;
    }
    
    public final void setSpanCount(int value) {
    }
    
    public final int getItemWidth() {
        return 0;
    }
    
    @kotlin.jvm.JvmOverloads()
    public AutofitRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}