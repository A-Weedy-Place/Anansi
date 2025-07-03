package com.lagradost.quicknovel.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000212B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0012J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0012J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0016J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0012H\u0016J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020\'J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0012H\u0016J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0012H\u0016J\u0010\u0010/\u001a\u00020)2\b\u00100\u001a\u0004\u0018\u00010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/lagradost/quicknovel/ui/TextAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/lagradost/quicknovel/SpanDisplay;", "Lcom/lagradost/quicknovel/ui/TextAdapter$TextAdapterHolder;", "viewModel", "Lcom/lagradost/quicknovel/ReadActivityViewModel;", "config", "Lcom/lagradost/quicknovel/ui/TextConfig;", "(Lcom/lagradost/quicknovel/ReadActivityViewModel;Lcom/lagradost/quicknovel/ui/TextConfig;)V", "getConfig", "()Lcom/lagradost/quicknovel/ui/TextConfig;", "setConfig", "(Lcom/lagradost/quicknovel/ui/TextConfig;)V", "currentTTSLine", "Lcom/lagradost/quicknovel/TTSHelper$TTSLine;", "changeBackgroundColor", "", "color", "", "changeBionicReading", "to", "changeColor", "changeFont", "font", "", "changeHeight", "height", "changeSize", "size", "changeTextSelectable", "isTextSelectable", "getItemId", "", "position", "getItemViewType", "getLines", "", "Lcom/lagradost/quicknovel/ui/TextVisualLine;", "scrollVisibility", "Lcom/lagradost/quicknovel/ui/ScrollVisibilityItem;", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateTTSLine", "line", "DiffCallback", "TextAdapterHolder", "app_debug"})
public final class TextAdapter extends androidx.recyclerview.widget.ListAdapter<com.lagradost.quicknovel.SpanDisplay, com.lagradost.quicknovel.ui.TextAdapter.TextAdapterHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.ReadActivityViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private com.lagradost.quicknovel.ui.TextConfig config;
    @org.jetbrains.annotations.Nullable()
    private com.lagradost.quicknovel.TTSHelper.TTSLine currentTTSLine;
    
    public TextAdapter(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ReadActivityViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.TextConfig config) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.ui.TextConfig getConfig() {
        return null;
    }
    
    public final void setConfig(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.TextConfig p0) {
    }
    
    public final boolean changeHeight(int height) {
        return false;
    }
    
    public final boolean changeBionicReading(boolean to) {
        return false;
    }
    
    public final boolean changeColor(int color) {
        return false;
    }
    
    public final boolean changeSize(int size) {
        return false;
    }
    
    public final boolean changeFont(@org.jetbrains.annotations.NotNull()
    java.lang.String font) {
        return false;
    }
    
    public final boolean changeBackgroundColor(int color) {
        return false;
    }
    
    public final boolean changeTextSelectable(boolean isTextSelectable) {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.lagradost.quicknovel.ui.TextAdapter.TextAdapterHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    /**
     * updates new onbind calls, but not current
     */
    public final void updateTTSLine(@org.jetbrains.annotations.Nullable()
    com.lagradost.quicknovel.TTSHelper.TTSLine line) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.lagradost.quicknovel.ui.TextVisualLine> getLines(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.ScrollVisibilityItem scrollVisibility) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.TextAdapter.TextAdapterHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/lagradost/quicknovel/ui/TextAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/lagradost/quicknovel/SpanDisplay;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.lagradost.quicknovel.SpanDisplay> {
        
        public DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.SpanDisplay oldItem, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.SpanDisplay newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.SpanDisplay oldItem, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.SpanDisplay newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\'\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/lagradost/quicknovel/ui/TextAdapter$TextAdapterHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/viewbinding/ViewBinding;", "viewModel", "Lcom/lagradost/quicknovel/ReadActivityViewModel;", "(Landroidx/viewbinding/ViewBinding;Lcom/lagradost/quicknovel/ReadActivityViewModel;)V", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "span", "Lcom/lagradost/quicknovel/SpanDisplay;", "getSpan", "()Lcom/lagradost/quicknovel/SpanDisplay;", "setSpan", "(Lcom/lagradost/quicknovel/SpanDisplay;)V", "bind", "", "obj", "ttsLine", "Lcom/lagradost/quicknovel/TTSHelper$TTSLine;", "config", "Lcom/lagradost/quicknovel/ui/TextConfig;", "bindChapter", "Lcom/lagradost/quicknovel/ChapterStartSpanned;", "bindFailed", "Lcom/lagradost/quicknovel/FailedSpanned;", "bindImage", "Lcom/lagradost/quicknovel/databinding/SingleImageBinding;", "img", "Lio/noties/markwon/image/AsyncDrawable;", "bindLoadChapter", "Lcom/lagradost/quicknovel/ChapterLoadSpanned;", "bindLoading", "Lcom/lagradost/quicknovel/LoadingSpanned;", "bindOverscrollChapter", "Lcom/lagradost/quicknovel/ChapterOverscrollSpanned;", "bindText", "Lcom/lagradost/quicknovel/TextSpan;", "setConfig", "updateTTSLine", "line", "app_debug"})
    public static final class TextAdapterHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.viewbinding.ViewBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.ReadActivityViewModel viewModel = null;
        @org.jetbrains.annotations.Nullable()
        private com.lagradost.quicknovel.SpanDisplay span;
        
        public TextAdapterHolder(@org.jetbrains.annotations.NotNull()
        androidx.viewbinding.ViewBinding binding, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ReadActivityViewModel viewModel) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.viewbinding.ViewBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.lagradost.quicknovel.SpanDisplay getSpan() {
            return null;
        }
        
        public final void setSpan(@org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.SpanDisplay p0) {
        }
        
        private final void setConfig(com.lagradost.quicknovel.ui.TextConfig config) {
        }
        
        public final void updateTTSLine(@org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.TTSHelper.TTSLine line) {
        }
        
        private final void bindImage(com.lagradost.quicknovel.databinding.SingleImageBinding binding, io.noties.markwon.image.AsyncDrawable img) {
        }
        
        private final void bindText(com.lagradost.quicknovel.TextSpan obj, com.lagradost.quicknovel.ui.TextConfig config) {
        }
        
        private final void bindLoading(com.lagradost.quicknovel.LoadingSpanned obj) {
        }
        
        private final void bindFailed(com.lagradost.quicknovel.FailedSpanned obj) {
        }
        
        private final void bindLoadChapter(com.lagradost.quicknovel.ChapterLoadSpanned obj) {
        }
        
        private final void bindOverscrollChapter(com.lagradost.quicknovel.ChapterOverscrollSpanned obj) {
        }
        
        private final void bindChapter(com.lagradost.quicknovel.ChapterStartSpanned obj) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.SpanDisplay obj, @org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.TTSHelper.TTSLine ttsLine, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ui.TextConfig config) {
        }
    }
}