package com.lagradost.quicknovel.providers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 72\u00020\u0001:\u00017B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010)\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010*\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010+\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00a0\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u000203H\u00d6\u0001J\u000e\u00104\u001a\n 5*\u0004\u0018\u00010\u00030\u0003J\t\u00106\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0007\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0007\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001b\u0010\u0013R\u001b\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\n\u001a\u0004\u0018\u00010\u00068\u0007\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u00068"}, d2 = {"Lcom/lagradost/quicknovel/providers/Chapterdatajson;", "", "bookTitle", "", "bookLink", "bookID", "", "chapters", "", "Lcom/lagradost/quicknovel/providers/Chapter;", "pagesCount", "countAll", "cstart", "limit", "search", "default", "searchTimeout", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;)V", "getBookID", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBookLink", "()Ljava/lang/String;", "getBookTitle", "getChapters", "()Ljava/util/List;", "getCountAll", "getCstart", "getDefault", "getLimit", "getPagesCount", "getSearch", "getSearchTimeout", "()Ljava/lang/Object;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;)Lcom/lagradost/quicknovel/providers/Chapterdatajson;", "equals", "", "other", "hashCode", "", "toJson", "kotlin.jvm.PlatformType", "toString", "Companion", "app_debug"})
public final class Chapterdatajson {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String bookTitle = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String bookLink = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long bookID = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.lagradost.quicknovel.providers.Chapter> chapters = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long pagesCount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long countAll = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long cstart = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long limit = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String search = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object searchTimeout = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.providers.Chapterdatajson.Companion Companion = null;
    
    public Chapterdatajson(@org.jetbrains.annotations.Nullable()
    java.lang.String bookTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String bookLink, @org.jetbrains.annotations.Nullable()
    java.lang.Long bookID, @org.jetbrains.annotations.Nullable()
    java.util.List<com.lagradost.quicknovel.providers.Chapter> chapters, @org.jetbrains.annotations.Nullable()
    java.lang.Long pagesCount, @org.jetbrains.annotations.Nullable()
    java.lang.Long countAll, @org.jetbrains.annotations.Nullable()
    java.lang.Long cstart, @org.jetbrains.annotations.Nullable()
    java.lang.Long limit, @org.jetbrains.annotations.Nullable()
    java.lang.String search, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p9_772401952, @org.jetbrains.annotations.Nullable()
    java.lang.Object searchTimeout) {
        super();
    }
    
    @com.fasterxml.jackson.annotation.JsonProperty(value = "book_title")
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBookTitle() {
        return null;
    }
    
    @com.fasterxml.jackson.annotation.JsonProperty(value = "book_link")
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBookLink() {
        return null;
    }
    
    @com.fasterxml.jackson.annotation.JsonProperty(value = "book_id")
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getBookID() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.lagradost.quicknovel.providers.Chapter> getChapters() {
        return null;
    }
    
    @com.fasterxml.jackson.annotation.JsonProperty(value = "pages_count")
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPagesCount() {
        return null;
    }
    
    @com.fasterxml.jackson.annotation.JsonProperty(value = "count_all")
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getCountAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getCstart() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLimit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSearch() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getDefault() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSearchTimeout() {
        return null;
    }
    
    public final java.lang.String toJson() {
        return null;
    }
    
    public Chapterdatajson() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.lagradost.quicknovel.providers.Chapter> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.providers.Chapterdatajson copy(@org.jetbrains.annotations.Nullable()
    java.lang.String bookTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String bookLink, @org.jetbrains.annotations.Nullable()
    java.lang.Long bookID, @org.jetbrains.annotations.Nullable()
    java.util.List<com.lagradost.quicknovel.providers.Chapter> chapters, @org.jetbrains.annotations.Nullable()
    java.lang.Long pagesCount, @org.jetbrains.annotations.Nullable()
    java.lang.Long countAll, @org.jetbrains.annotations.Nullable()
    java.lang.Long cstart, @org.jetbrains.annotations.Nullable()
    java.lang.Long limit, @org.jetbrains.annotations.Nullable()
    java.lang.String search, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p9_772401952, @org.jetbrains.annotations.Nullable()
    java.lang.Object searchTimeout) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/lagradost/quicknovel/providers/Chapterdatajson$Companion;", "", "()V", "fromJson", "Lcom/lagradost/quicknovel/providers/Chapterdatajson;", "json", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.Chapterdatajson fromJson(@org.jetbrains.annotations.NotNull()
        java.lang.String json) {
            return null;
        }
    }
}