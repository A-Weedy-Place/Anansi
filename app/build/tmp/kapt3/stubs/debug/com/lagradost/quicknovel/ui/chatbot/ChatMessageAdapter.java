package com.lagradost.quicknovel.ui.chatbot;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/lagradost/quicknovel/ui/chatbot/ChatMessageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/lagradost/quicknovel/ui/chatbot/ChatMessageAdapter$ChatMessageViewHolder;", "messages", "", "Lcom/lagradost/quicknovel/ui/chatbot/ChatMessage;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ChatMessageViewHolder", "app_debug"})
public final class ChatMessageAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.lagradost.quicknovel.ui.chatbot.ChatMessageAdapter.ChatMessageViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.lagradost.quicknovel.ui.chatbot.ChatMessage> messages = null;
    
    public ChatMessageAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.lagradost.quicknovel.ui.chatbot.ChatMessage> messages) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.lagradost.quicknovel.ui.chatbot.ChatMessageAdapter.ChatMessageViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.ui.chatbot.ChatMessageAdapter.ChatMessageViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/lagradost/quicknovel/ui/chatbot/ChatMessageAdapter$ChatMessageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/lagradost/quicknovel/databinding/ItemChatMessageBinding;", "(Lcom/lagradost/quicknovel/databinding/ItemChatMessageBinding;)V", "bind", "", "message", "Lcom/lagradost/quicknovel/ui/chatbot/ChatMessage;", "app_debug"})
    public static final class ChatMessageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.databinding.ItemChatMessageBinding binding = null;
        
        public ChatMessageViewHolder(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.databinding.ItemChatMessageBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.ui.chatbot.ChatMessage message) {
        }
    }
}