package com.lagradost.quicknovel.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014J\u0018\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0018\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u000fJ\u0012\u0010 \u001a\u00020\u000b*\u00020!2\u0006\u0010\"\u001a\u00020\u0017J\u0012\u0010#\u001a\u00020\u0017*\u00020\u001c2\u0006\u0010$\u001a\u00020\u0017J\u0012\u0010%\u001a\u00020\u0017*\u00020\u001c2\u0006\u0010$\u001a\u00020\u0017J\u0016\u0010&\u001a\u00020\u000b*\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010!J\u0012\u0010)\u001a\u00020\u000b*\u00020!2\u0006\u0010*\u001a\u00020+J \u0010,\u001a\u00020\u0017*\u00020\u001c2\b\b\u0001\u0010-\u001a\u00020\u00172\b\b\u0002\u0010.\u001a\u00020/H\u0007J\n\u00100\u001a\u00020\u0017*\u00020!J\u0012\u00101\u001a\u00020\u000b*\u00020\u001c2\u0006\u00102\u001a\u00020+J\n\u00101\u001a\u00020\u000b*\u000203J\f\u00104\u001a\u00020\u0012*\u0004\u0018\u00010\u0014J\n\u00105\u001a\u00020\u000b*\u000206JR\u00107\u001a\u000208*\u00020+2\b\b\u0001\u00109\u001a\u00020\u00172\u001b\b\n\u0010:\u001a\u0015\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u000b\u0018\u00010;\u00a2\u0006\u0002\b=2\u0019\b\b\u0010>\u001a\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000b0;\u00a2\u0006\u0002\b=H\u0086\b\u00f8\u0001\u0000JV\u00107\u001a\u000208*\u00020+2\u0018\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170B0A2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00172\u0019\b\b\u0010>\u001a\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000b0;\u00a2\u0006\u0002\b=H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJK\u00107\u001a\u000208*\u00020+2\u001e\u0010@\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170E0A2\u0019\b\b\u0010>\u001a\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000b0;\u00a2\u0006\u0002\b=H\u0087\b\u00f8\u0001\u0000J\u0014\u0010F\u001a\u00020\u000b*\u00020\u001c2\b\u0010G\u001a\u0004\u0018\u00010HJO\u0010I\u001a\u00020J*\u0004\u0018\u00010\r2\b\u0010K\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010M\u001a\u00020J2\b\b\u0002\u0010N\u001a\u00020\u00172\b\b\u0002\u0010O\u001a\u00020\u00172\b\b\u0002\u0010P\u001a\u00020J\u00a2\u0006\u0002\u0010QJ]\u0010I\u001a\u00020J*\u0004\u0018\u00010\r2\b\u0010R\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010T2\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010M\u001a\u00020J2\b\b\u0002\u0010N\u001a\u00020\u00172\b\b\u0002\u0010O\u001a\u00020\u0017\u00a2\u0006\u0002\u0010UR!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006V"}, d2 = {"Lcom/lagradost/quicknovel/util/UIHelper;", "", "()V", "systemFonts", "", "Ljava/io/File;", "getSystemFonts", "()[Ljava/io/File;", "systemFonts$delegate", "Lkotlin/Lazy;", "bindImage", "", "imageView", "Landroid/widget/ImageView;", "img", "Lio/noties/markwon/image/AsyncDrawable;", "getAllFonts", "getHtmlText", "Landroid/text/Spanned;", "text", "", "humanReadableByteCountSI", "bytes", "", "parseFontFileName", "name", "showImage", "context", "Landroid/content/Context;", "image", "Lcom/lagradost/quicknovel/ui/UiImage;", "drawable", "checkPermissions", "Landroid/app/Activity;", "requestCode", "colorFromAttribute", "attribute", "dimensionFromAttribute", "dismissSafe", "Landroid/app/Dialog;", "activity", "fixPaddingStatusbar", "v", "Landroid/view/View;", "getResourceColor", "resource", "alphaFactor", "", "getStatusBarHeight", "hideKeyboard", "view", "Landroidx/fragment/app/Fragment;", "html", "popCurrentPage", "Landroidx/fragment/app/FragmentActivity;", "popupMenu", "Landroidx/appcompat/widget/PopupMenu;", "menuRes", "initMenu", "Lkotlin/Function1;", "Landroid/view/Menu;", "Lkotlin/ExtensionFunctionType;", "onMenuItemClick", "Landroid/view/MenuItem;", "items", "", "Lkotlin/Pair;", "selectedItemId", "(Landroid/view/View;Ljava/util/List;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)Landroidx/appcompat/widget/PopupMenu;", "Lkotlin/Triple;", "requestAudioFocus", "focusRequest", "Landroid/media/AudioFocusRequest;", "setImage", "", "uiImage", "errorImageDrawable", "fadeIn", "radius", "sample", "skipCache", "(Landroid/widget/ImageView;Lcom/lagradost/quicknovel/ui/UiImage;Ljava/lang/Integer;ZIIZ)Z", "url", "headers", "", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;ZII)Z", "app_debug"})
public final class UIHelper {
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy systemFonts$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.util.UIHelper INSTANCE = null;
    
    private UIHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.Spanned html(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$html) {
        return null;
    }
    
    private final android.text.Spanned getHtmlText(java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String humanReadableByteCountSI(int bytes) {
        return null;
    }
    
    public final void dismissSafe(@org.jetbrains.annotations.Nullable()
    android.app.Dialog $this$dismissSafe, @org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    public final void bindImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    io.noties.markwon.image.AsyncDrawable img) {
    }
    
    public final void showImage(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.UiImage image) {
    }
    
    public final void showImage(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    io.noties.markwon.image.AsyncDrawable drawable) {
    }
    
    public final void popCurrentPage(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$popCurrentPage) {
    }
    
    public final int dimensionFromAttribute(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$dimensionFromAttribute, int attribute) {
        return 0;
    }
    
    public final int colorFromAttribute(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$colorFromAttribute, int attribute) {
        return 0;
    }
    
    public final boolean setImage(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView $this$setImage, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> headers, @androidx.annotation.DrawableRes()
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer errorImageDrawable, boolean fadeIn, int radius, int sample) {
        return false;
    }
    
    public final boolean setImage(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView $this$setImage, @org.jetbrains.annotations.Nullable()
    com.lagradost.quicknovel.ui.UiImage uiImage, @androidx.annotation.DrawableRes()
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer errorImageDrawable, boolean fadeIn, int radius, int sample, boolean skipCache) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File[] getSystemFonts() {
        return null;
    }
    
    private final java.io.File[] getAllFonts() {
        return null;
    }
    
    public final int getStatusBarHeight(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$getStatusBarHeight) {
        return 0;
    }
    
    public final void fixPaddingStatusbar(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$fixPaddingStatusbar, @org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void requestAudioFocus(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$requestAudioFocus, @org.jetbrains.annotations.Nullable()
    android.media.AudioFocusRequest focusRequest) {
    }
    
    @androidx.annotation.ColorInt()
    public final int getResourceColor(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getResourceColor, @androidx.annotation.AttrRes()
    int resource, float alphaFactor) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String parseFontFileName(@org.jetbrains.annotations.Nullable()
    java.lang.String name) {
        return null;
    }
    
    /**
     * Shows a popup menu on top of this view.
     *
     * @param menuRes menu items to inflate the menu with.
     * @param initMenu function to execute when the menu after is inflated.
     * @param onMenuItemClick function to execute when a menu item is clicked.
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.PopupMenu popupMenu(@org.jetbrains.annotations.NotNull()
    android.view.View $this$popupMenu, @androidx.annotation.MenuRes()
    int menuRes, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super android.view.Menu, kotlin.Unit> initMenu, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.MenuItem, kotlin.Unit> onMenuItemClick) {
        return null;
    }
    
    /**
     * Shows a popup menu on top of this view.
     *
     * @param items menu item names to inflate the menu with. List of itemId to stringRes pairs.
     * @param selectedItemId optionally show a checkmark beside an item with this itemId.
     * @param onMenuItemClick function to execute when a menu item is clicked.
     */
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.PopupMenu popupMenu(@org.jetbrains.annotations.NotNull()
    android.view.View $this$popupMenu, @org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> items, @org.jetbrains.annotations.Nullable()
    java.lang.Integer selectedItemId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.MenuItem, kotlin.Unit> onMenuItemClick) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.PopupMenu popupMenu(@org.jetbrains.annotations.NotNull()
    android.view.View $this$popupMenu, @org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer>> items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.MenuItem, kotlin.Unit> onMenuItemClick) {
        return null;
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$hideKeyboard) {
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hideKeyboard, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void checkPermissions(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$checkPermissions, int requestCode) {
    }
}