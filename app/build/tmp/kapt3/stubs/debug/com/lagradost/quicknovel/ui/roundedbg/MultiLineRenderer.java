package com.lagradost.quicknovel.ui.roundedbg;

/**
 * Draws the background for text that starts and ends on different lines.
 *
 * @param horizontalPadding the padding to be applied to left & right of the background
 * @param verticalPadding the padding to be applied to top & bottom of the background
 * @param drawableLeft the drawable used to draw left edge of the background
 * @param drawableMid the drawable used to draw for whole line
 * @param drawableRight the drawable used to draw right edge of the background
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ8\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J0\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0002J0\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/lagradost/quicknovel/ui/roundedbg/MultiLineRenderer;", "Lcom/lagradost/quicknovel/ui/roundedbg/TextRoundedBgRenderer;", "horizontalPadding", "", "verticalPadding", "drawableLeft", "Landroid/graphics/drawable/Drawable;", "drawableMid", "drawableRight", "(IILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "getDrawableLeft", "()Landroid/graphics/drawable/Drawable;", "getDrawableMid", "getDrawableRight", "draw", "", "canvas", "Landroid/graphics/Canvas;", "layout", "Landroid/text/Layout;", "startLine", "endLine", "startOffset", "endOffset", "drawEnd", "start", "top", "end", "bottom", "drawStart", "app_debug"})
public final class MultiLineRenderer extends com.lagradost.quicknovel.ui.roundedbg.TextRoundedBgRenderer {
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.drawable.Drawable drawableLeft = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.drawable.Drawable drawableMid = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.drawable.Drawable drawableRight = null;
    
    public MultiLineRenderer(int horizontalPadding, int verticalPadding, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawableLeft, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawableMid, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawableRight) {
        super(0, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable getDrawableLeft() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable getDrawableMid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable getDrawableRight() {
        return null;
    }
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    android.text.Layout layout, int startLine, int endLine, int startOffset, int endOffset) {
    }
    
    /**
     * Draw the first line of a multiline annotation. Handles LTR/RTL.
     *
     * @param canvas Canvas to draw onto
     * @param start start coordinate for the background
     * @param top top coordinate for the background
     * @param end end coordinate for the background
     * @param bottom bottom coordinate for the background
     */
    private final void drawStart(android.graphics.Canvas canvas, int start, int top, int end, int bottom) {
    }
    
    /**
     * Draw the last line of a multiline annotation. Handles LTR/RTL.
     *
     * @param canvas Canvas to draw onto
     * @param start start coordinate for the background
     * @param top top position for the background
     * @param end end coordinate for the background
     * @param bottom bottom coordinate for the background
     */
    private final void drawEnd(android.graphics.Canvas canvas, int start, int top, int end, int bottom) {
    }
}