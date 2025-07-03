package com.lagradost.quicknovel.widget;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001 B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J0\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0014J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/lagradost/quicknovel/widget/FlowLayout;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "c", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "itemSpacing", "", "getItemSpacing", "()I", "setItemSpacing", "(I)V", "checkLayoutParams", "", "p", "Landroid/view/ViewGroup$LayoutParams;", "generateDefaultLayoutParams", "Lcom/lagradost/quicknovel/widget/FlowLayout$LayoutParams;", "generateLayoutParams", "onLayout", "", "b", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "LayoutParams", "app_debug"})
public final class FlowLayout extends android.view.ViewGroup {
    private int itemSpacing = 0;
    
    public final int getItemSpacing() {
        return 0;
    }
    
    public final void setItemSpacing(int p0) {
    }
    
    public FlowLayout(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    @android.annotation.SuppressLint(value = {"CustomViewStyleable"})
    public FlowLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context c, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean b, int left, int top, int right, int bottom) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.lagradost.quicknovel.widget.FlowLayout.LayoutParams generateLayoutParams(@org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected com.lagradost.quicknovel.widget.FlowLayout.LayoutParams generateDefaultLayoutParams() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected com.lagradost.quicknovel.widget.FlowLayout.LayoutParams generateLayoutParams(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup.LayoutParams p) {
        return null;
    }
    
    @java.lang.Override()
    protected boolean checkLayoutParams(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup.LayoutParams p) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0019\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nB\u0011\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\fB\u0011\b\u0010\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013\u00a8\u0006\u001a"}, d2 = {"Lcom/lagradost/quicknovel/widget/FlowLayout$LayoutParams;", "Landroid/view/ViewGroup$MarginLayoutParams;", "c", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "width", "", "height", "(II)V", "source", "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)V", "spacing", "getSpacing", "()I", "setSpacing", "(I)V", "x", "getX", "setX", "y", "getY", "setY", "app_debug"})
    public static final class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        private int spacing = -1;
        private int x = 0;
        private int y = 0;
        
        public final int getSpacing() {
            return 0;
        }
        
        public final void setSpacing(int p0) {
        }
        
        public final int getX() {
            return 0;
        }
        
        public final void setX(int p0) {
        }
        
        public final int getY() {
            return 0;
        }
        
        public final void setY(int p0) {
        }
        
        @android.annotation.SuppressLint(value = {"CustomViewStyleable"})
        public LayoutParams(@org.jetbrains.annotations.NotNull()
        android.content.Context c, @org.jetbrains.annotations.Nullable()
        android.util.AttributeSet attrs) {
            super(null, null);
        }
        
        public LayoutParams(int width, int height) {
            super(null, null);
        }
        
        public LayoutParams(@org.jetbrains.annotations.Nullable()
        android.view.ViewGroup.MarginLayoutParams source) {
            super(null, null);
        }
        
        public LayoutParams(@org.jetbrains.annotations.Nullable()
        android.view.ViewGroup.LayoutParams source) {
            super(null, null);
        }
    }
}