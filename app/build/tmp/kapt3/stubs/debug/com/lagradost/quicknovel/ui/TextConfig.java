package com.lagradost.quicknovel.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0002\u0010\u000eJ\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\tH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\fH\u00c6\u0003J\t\u0010*\u001a\u00020\fH\u00c6\u0003JY\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u00c6\u0001J\u0013\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J\u0016\u0010/\u001a\u0002002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0003J\u0010\u00106\u001a\u0002002\u0006\u00103\u001a\u000204H\u0002J\u0010\u00107\u001a\u0002002\u0006\u00103\u001a\u000204H\u0002J\u0018\u00108\u001a\u0002002\u0006\u00103\u001a\u0002042\u0006\u00109\u001a\u00020\u0003H\u0002J\u0010\u0010:\u001a\u0002002\u0006\u00103\u001a\u000204H\u0002J\t\u0010;\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0010\u00a8\u0006<"}, d2 = {"Lcom/lagradost/quicknovel/ui/TextConfig;", "", "toolbarHeight", "", "textColor", "textSize", "textFont", "", "defaultFont", "Landroid/graphics/Typeface;", "backgroundColor", "bionicReading", "", "isTextSelectable", "(IIILjava/lang/String;Landroid/graphics/Typeface;IZZ)V", "getBackgroundColor", "()I", "getBionicReading", "()Z", "cachedFont", "getCachedFont", "()Landroid/graphics/Typeface;", "cachedFont$delegate", "Lkotlin/Lazy;", "getDefaultFont", "fontFile", "Ljava/io/File;", "getFontFile", "()Ljava/io/File;", "fontFile$delegate", "getTextColor", "getTextFont", "()Ljava/lang/String;", "getTextSize", "getToolbarHeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "setArgs", "", "progressBar", "Landroid/widget/ProgressBar;", "textView", "Landroid/widget/TextView;", "args", "setBgTextColor", "setTextColor", "setTextFont", "flags", "setTextSize", "toString", "app_debug"})
public final class TextConfig {
    private final int toolbarHeight = 0;
    private final int textColor = 0;
    private final int textSize = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String textFont = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Typeface defaultFont = null;
    private final int backgroundColor = 0;
    private final boolean bionicReading = false;
    private final boolean isTextSelectable = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy fontFile$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy cachedFont$delegate = null;
    
    public TextConfig(int toolbarHeight, int textColor, int textSize, @org.jetbrains.annotations.NotNull()
    java.lang.String textFont, @org.jetbrains.annotations.NotNull()
    android.graphics.Typeface defaultFont, int backgroundColor, boolean bionicReading, boolean isTextSelectable) {
        super();
    }
    
    public final int getToolbarHeight() {
        return 0;
    }
    
    public final int getTextColor() {
        return 0;
    }
    
    public final int getTextSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTextFont() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Typeface getDefaultFont() {
        return null;
    }
    
    public final int getBackgroundColor() {
        return 0;
    }
    
    public final boolean getBionicReading() {
        return false;
    }
    
    public final boolean isTextSelectable() {
        return false;
    }
    
    private final java.io.File getFontFile() {
        return null;
    }
    
    private final android.graphics.Typeface getCachedFont() {
        return null;
    }
    
    private final void setTextFont(android.widget.TextView textView, int flags) {
    }
    
    private final void setTextSize(android.widget.TextView textView) {
    }
    
    private final void setTextColor(android.widget.TextView textView) {
    }
    
    private final void setBgTextColor(android.widget.TextView textView) {
    }
    
    public final void setArgs(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar progressBar) {
    }
    
    public final void setArgs(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, int args) {
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
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Typeface component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.ui.TextConfig copy(int toolbarHeight, int textColor, int textSize, @org.jetbrains.annotations.NotNull()
    java.lang.String textFont, @org.jetbrains.annotations.NotNull()
    android.graphics.Typeface defaultFont, int backgroundColor, boolean bionicReading, boolean isTextSelectable) {
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