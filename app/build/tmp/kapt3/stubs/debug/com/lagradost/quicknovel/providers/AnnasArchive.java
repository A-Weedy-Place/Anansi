package com.lagradost.quicknovel.providers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u001d\u001e\u001f B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\nH\u0082@\u00a2\u0006\u0002\u0010\u0016J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\nX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u00a8\u0006!"}, d2 = {"Lcom/lagradost/quicknovel/providers/AnnasArchive;", "Lcom/lagradost/quicknovel/MainAPI;", "()V", "hasMainPage", "", "getHasMainPage", "()Z", "hasReviews", "getHasReviews", "lang", "", "getLang", "()Ljava/lang/String;", "mainUrl", "getMainUrl", "name", "getName", "extract", "Lcom/lagradost/quicknovel/DownloadLinkType;", "url", "load", "Lcom/lagradost/quicknovel/LoadResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromJsonUrl", "md5", "search", "", "Lcom/lagradost/quicknovel/SearchResponse;", "query", "Additional", "AnnasArchiveRoot", "FileUnifiedData", "TopBox", "app_debug"})
public final class AnnasArchive extends com.lagradost.quicknovel.MainAPI {
    private final boolean hasMainPage = false;
    private final boolean hasReviews = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lang = "en";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = "Annas Archive";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mainUrl = "https://annas-archive.org";
    
    public AnnasArchive() {
        super();
    }
    
    @java.lang.Override()
    public boolean getHasMainPage() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getHasReviews() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLang() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getMainUrl() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object search(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.lagradost.quicknovel.SearchResponse>> $completion) {
        return null;
    }
    
    private final com.lagradost.quicknovel.DownloadLinkType extract(java.lang.String url, java.lang.String name) {
        return null;
    }
    
    private final java.lang.Object loadFromJsonUrl(java.lang.String md5, kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.LoadResponse> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.LoadResponse> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012.\b\u0003\u0010\u0006\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0007j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\b`\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J/\u0010\u0018\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0007j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\b`\bH\u00c6\u0003JO\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052.\b\u0003\u0010\u0006\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0007j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\b`\bH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001R@\u0010\u0006\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0007j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\b`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/lagradost/quicknovel/providers/AnnasArchive$Additional;", "", "topBox", "Lcom/lagradost/quicknovel/providers/AnnasArchive$TopBox;", "filename", "", "downloadUrls", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Lcom/lagradost/quicknovel/providers/AnnasArchive$TopBox;Ljava/lang/String;Ljava/util/ArrayList;)V", "getDownloadUrls", "()Ljava/util/ArrayList;", "setDownloadUrls", "(Ljava/util/ArrayList;)V", "getFilename", "()Ljava/lang/String;", "setFilename", "(Ljava/lang/String;)V", "getTopBox", "()Lcom/lagradost/quicknovel/providers/AnnasArchive$TopBox;", "setTopBox", "(Lcom/lagradost/quicknovel/providers/AnnasArchive$TopBox;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Additional {
        @org.jetbrains.annotations.NotNull()
        private com.lagradost.quicknovel.providers.AnnasArchive.TopBox topBox;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String filename;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.util.ArrayList<java.lang.String>> downloadUrls;
        
        public Additional(@com.fasterxml.jackson.annotation.JsonProperty(value = "top_box")
        @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.AnnasArchive.TopBox topBox, @com.fasterxml.jackson.annotation.JsonProperty(value = "filename")
        @org.jetbrains.annotations.Nullable()
        java.lang.String filename, @com.fasterxml.jackson.annotation.JsonProperty(value = "download_urls")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.util.ArrayList<java.lang.String>> downloadUrls) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.AnnasArchive.TopBox getTopBox() {
            return null;
        }
        
        public final void setTopBox(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.AnnasArchive.TopBox p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFilename() {
            return null;
        }
        
        public final void setFilename(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.util.ArrayList<java.lang.String>> getDownloadUrls() {
            return null;
        }
        
        public final void setDownloadUrls(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.util.ArrayList<java.lang.String>> p0) {
        }
        
        public Additional() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.AnnasArchive.TopBox component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.util.ArrayList<java.lang.String>> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.AnnasArchive.Additional copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "top_box")
        @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.AnnasArchive.TopBox topBox, @com.fasterxml.jackson.annotation.JsonProperty(value = "filename")
        @org.jetbrains.annotations.Nullable()
        java.lang.String filename, @com.fasterxml.jackson.annotation.JsonProperty(value = "download_urls")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.util.ArrayList<java.lang.String>> downloadUrls) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/lagradost/quicknovel/providers/AnnasArchive$AnnasArchiveRoot;", "", "additional", "Lcom/lagradost/quicknovel/providers/AnnasArchive$Additional;", "fileUnifiedData", "Lcom/lagradost/quicknovel/providers/AnnasArchive$FileUnifiedData;", "(Lcom/lagradost/quicknovel/providers/AnnasArchive$Additional;Lcom/lagradost/quicknovel/providers/AnnasArchive$FileUnifiedData;)V", "getAdditional", "()Lcom/lagradost/quicknovel/providers/AnnasArchive$Additional;", "setAdditional", "(Lcom/lagradost/quicknovel/providers/AnnasArchive$Additional;)V", "getFileUnifiedData", "()Lcom/lagradost/quicknovel/providers/AnnasArchive$FileUnifiedData;", "setFileUnifiedData", "(Lcom/lagradost/quicknovel/providers/AnnasArchive$FileUnifiedData;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class AnnasArchiveRoot {
        @org.jetbrains.annotations.NotNull()
        private com.lagradost.quicknovel.providers.AnnasArchive.Additional additional;
        @org.jetbrains.annotations.Nullable()
        private com.lagradost.quicknovel.providers.AnnasArchive.FileUnifiedData fileUnifiedData;
        
        public AnnasArchiveRoot(@com.fasterxml.jackson.annotation.JsonProperty(value = "additional")
        @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.AnnasArchive.Additional additional, @com.fasterxml.jackson.annotation.JsonProperty(value = "file_unified_data")
        @org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.providers.AnnasArchive.FileUnifiedData fileUnifiedData) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.AnnasArchive.Additional getAdditional() {
            return null;
        }
        
        public final void setAdditional(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.AnnasArchive.Additional p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.lagradost.quicknovel.providers.AnnasArchive.FileUnifiedData getFileUnifiedData() {
            return null;
        }
        
        public final void setFileUnifiedData(@org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.providers.AnnasArchive.FileUnifiedData p0) {
        }
        
        public AnnasArchiveRoot() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.AnnasArchive.Additional component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.lagradost.quicknovel.providers.AnnasArchive.FileUnifiedData component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.AnnasArchive.AnnasArchiveRoot copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "additional")
        @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.AnnasArchive.Additional additional, @com.fasterxml.jackson.annotation.JsonProperty(value = "file_unified_data")
        @org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.providers.AnnasArchive.FileUnifiedData fileUnifiedData) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0003\b\u008b\u0001\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0005\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0018\b\u0003\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\u0018\b\u0003\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\u0018\b\u0003\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\u0018\b\u0003\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\u0018\b\u0003\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\u0018\b\u0003\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\u0018\b\u0003\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\'\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010(J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0019\u0010v\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0019\u0010x\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0019\u0010z\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0019\u0010|\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0019\u0010~\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\u0019\u0010\u007f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001a\u0010\u0081\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001a\u0010\u0083\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\u001a\u0010\u0084\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001a\u0010\u0086\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\u001a\u0010\u0087\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\u001a\u0010\u0088\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\u001a\u0010\u0089\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001a\u0010\u008b\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\u001a\u0010\u008c\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001a\u0010\u0091\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001a\u0010\u0093\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\u0011\u0010\u0094\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\u001a\u0010\u0095\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u00c6\u0003J\u00a4\u0005\u0010\u0096\u0001\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\u0018\b\u0003\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\u0018\b\u0003\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\u0018\b\u0003\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\u0018\b\u0003\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\u0018\b\u0003\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\u0018\b\u0003\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\u0018\b\u0003\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\'\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0003\u0010\u0097\u0001J\u0016\u0010\u0098\u0001\u001a\u00030\u0099\u00012\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u009b\u0001\u001a\u00020\rH\u00d6\u0001J\n\u0010\u009c\u0001\u001a\u00020\u0003H\u00d6\u0001R*\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\u001c\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00100\"\u0004\b8\u00102R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010*\"\u0004\b:\u0010,R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00100\"\u0004\b<\u00102R*\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010*\"\u0004\b>\u0010,R*\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010*\"\u0004\b@\u0010,R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u00100\"\u0004\bB\u00102R*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010*\"\u0004\bD\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u00100\"\u0004\bF\u00102R*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010*\"\u0004\bH\u0010,R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010M\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR*\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010*\"\u0004\bO\u0010,R\u001e\u0010&\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010M\u001a\u0004\bP\u0010J\"\u0004\bQ\u0010LR\u001e\u0010\'\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010M\u001a\u0004\bR\u0010J\"\u0004\bS\u0010LR*\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010*\"\u0004\bU\u0010,R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u00100\"\u0004\bW\u00102R*\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010*\"\u0004\bY\u0010,R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010*\"\u0004\b[\u0010,R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u00100\"\u0004\b]\u00102R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u00100\"\u0004\b_\u00102R*\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010*\"\u0004\ba\u0010,R*\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010*\"\u0004\bc\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u00100\"\u0004\be\u00102R*\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010*\"\u0004\bg\u0010,R*\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010*\"\u0004\bi\u0010,R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u00100\"\u0004\bk\u00102R*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010*\"\u0004\bm\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u00100\"\u0004\bo\u00102R*\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010*\"\u0004\bq\u0010,R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u00100\"\u0004\bs\u00102\u00a8\u0006\u009d\u0001"}, d2 = {"Lcom/lagradost/quicknovel/providers/AnnasArchive$FileUnifiedData;", "", "originalFilenameBest", "", "originalFilenameAdditional", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "originalFilenameBestNameOnly", "coverUrlBest", "coverUrlAdditional", "extensionBest", "extensionAdditional", "filesizeBest", "", "filesizeAdditional", "titleBest", "titleAdditional", "authorBest", "authorAdditional", "publisherBest", "publisherAdditional", "editionVariaBest", "editionVariaAdditional", "yearBest", "yearAdditional", "commentsBest", "commentsAdditional", "strippedDescriptionBest", "strippedDescriptionAdditional", "languageCodes", "mostLikelyLanguageCode", "sanitizedIsbns", "asinMultiple", "googlebookidMultiple", "openlibraryidMultiple", "doiMultiple", "problems", "contentType", "hasAaDownloads", "hasAaExclusiveDownloads", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAsinMultiple", "()Ljava/util/ArrayList;", "setAsinMultiple", "(Ljava/util/ArrayList;)V", "getAuthorAdditional", "setAuthorAdditional", "getAuthorBest", "()Ljava/lang/String;", "setAuthorBest", "(Ljava/lang/String;)V", "getCommentsAdditional", "setCommentsAdditional", "getCommentsBest", "setCommentsBest", "getContentType", "setContentType", "getCoverUrlAdditional", "setCoverUrlAdditional", "getCoverUrlBest", "setCoverUrlBest", "getDoiMultiple", "setDoiMultiple", "getEditionVariaAdditional", "setEditionVariaAdditional", "getEditionVariaBest", "setEditionVariaBest", "getExtensionAdditional", "setExtensionAdditional", "getExtensionBest", "setExtensionBest", "getFilesizeAdditional", "setFilesizeAdditional", "getFilesizeBest", "()Ljava/lang/Integer;", "setFilesizeBest", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getGooglebookidMultiple", "setGooglebookidMultiple", "getHasAaDownloads", "setHasAaDownloads", "getHasAaExclusiveDownloads", "setHasAaExclusiveDownloads", "getLanguageCodes", "setLanguageCodes", "getMostLikelyLanguageCode", "setMostLikelyLanguageCode", "getOpenlibraryidMultiple", "setOpenlibraryidMultiple", "getOriginalFilenameAdditional", "setOriginalFilenameAdditional", "getOriginalFilenameBest", "setOriginalFilenameBest", "getOriginalFilenameBestNameOnly", "setOriginalFilenameBestNameOnly", "getProblems", "setProblems", "getPublisherAdditional", "setPublisherAdditional", "getPublisherBest", "setPublisherBest", "getSanitizedIsbns", "setSanitizedIsbns", "getStrippedDescriptionAdditional", "setStrippedDescriptionAdditional", "getStrippedDescriptionBest", "setStrippedDescriptionBest", "getTitleAdditional", "setTitleAdditional", "getTitleBest", "setTitleBest", "getYearAdditional", "setYearAdditional", "getYearBest", "setYearBest", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/lagradost/quicknovel/providers/AnnasArchive$FileUnifiedData;", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class FileUnifiedData {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String originalFilenameBest;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> originalFilenameAdditional;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String originalFilenameBestNameOnly;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String coverUrlBest;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> coverUrlAdditional;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String extensionBest;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> extensionAdditional;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer filesizeBest;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> filesizeAdditional;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String titleBest;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> titleAdditional;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String authorBest;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> authorAdditional;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String publisherBest;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> publisherAdditional;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String editionVariaBest;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> editionVariaAdditional;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String yearBest;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> yearAdditional;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String commentsBest;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> commentsAdditional;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String strippedDescriptionBest;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> strippedDescriptionAdditional;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> languageCodes;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String mostLikelyLanguageCode;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> sanitizedIsbns;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> asinMultiple;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> googlebookidMultiple;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> openlibraryidMultiple;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> doiMultiple;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> problems;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String contentType;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer hasAaDownloads;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer hasAaExclusiveDownloads;
        
        public FileUnifiedData(@com.fasterxml.jackson.annotation.JsonProperty(value = "original_filename_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String originalFilenameBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "original_filename_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> originalFilenameAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "original_filename_best_name_only")
        @org.jetbrains.annotations.Nullable()
        java.lang.String originalFilenameBestNameOnly, @com.fasterxml.jackson.annotation.JsonProperty(value = "cover_url_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String coverUrlBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "cover_url_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> coverUrlAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "extension_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String extensionBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "extension_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> extensionAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "filesize_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.Integer filesizeBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "filesize_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> filesizeAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "title_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String titleBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "title_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> titleAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "author_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String authorBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "author_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> authorAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "publisher_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String publisherBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "publisher_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> publisherAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "edition_varia_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String editionVariaBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "edition_varia_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> editionVariaAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "year_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String yearBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "year_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> yearAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "comments_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String commentsBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "comments_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> commentsAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "stripped_description_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String strippedDescriptionBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "stripped_description_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> strippedDescriptionAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "language_codes")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> languageCodes, @com.fasterxml.jackson.annotation.JsonProperty(value = "most_likely_language_code")
        @org.jetbrains.annotations.Nullable()
        java.lang.String mostLikelyLanguageCode, @com.fasterxml.jackson.annotation.JsonProperty(value = "sanitized_isbns")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> sanitizedIsbns, @com.fasterxml.jackson.annotation.JsonProperty(value = "asin_multiple")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> asinMultiple, @com.fasterxml.jackson.annotation.JsonProperty(value = "googlebookid_multiple")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> googlebookidMultiple, @com.fasterxml.jackson.annotation.JsonProperty(value = "openlibraryid_multiple")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> openlibraryidMultiple, @com.fasterxml.jackson.annotation.JsonProperty(value = "doi_multiple")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> doiMultiple, @com.fasterxml.jackson.annotation.JsonProperty(value = "problems")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> problems, @com.fasterxml.jackson.annotation.JsonProperty(value = "content_type")
        @org.jetbrains.annotations.Nullable()
        java.lang.String contentType, @com.fasterxml.jackson.annotation.JsonProperty(value = "has_aa_downloads")
        @org.jetbrains.annotations.Nullable()
        java.lang.Integer hasAaDownloads, @com.fasterxml.jackson.annotation.JsonProperty(value = "has_aa_exclusive_downloads")
        @org.jetbrains.annotations.Nullable()
        java.lang.Integer hasAaExclusiveDownloads) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOriginalFilenameBest() {
            return null;
        }
        
        public final void setOriginalFilenameBest(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getOriginalFilenameAdditional() {
            return null;
        }
        
        public final void setOriginalFilenameAdditional(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOriginalFilenameBestNameOnly() {
            return null;
        }
        
        public final void setOriginalFilenameBestNameOnly(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCoverUrlBest() {
            return null;
        }
        
        public final void setCoverUrlBest(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getCoverUrlAdditional() {
            return null;
        }
        
        public final void setCoverUrlAdditional(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getExtensionBest() {
            return null;
        }
        
        public final void setExtensionBest(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getExtensionAdditional() {
            return null;
        }
        
        public final void setExtensionAdditional(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getFilesizeBest() {
            return null;
        }
        
        public final void setFilesizeBest(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getFilesizeAdditional() {
            return null;
        }
        
        public final void setFilesizeAdditional(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTitleBest() {
            return null;
        }
        
        public final void setTitleBest(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getTitleAdditional() {
            return null;
        }
        
        public final void setTitleAdditional(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAuthorBest() {
            return null;
        }
        
        public final void setAuthorBest(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getAuthorAdditional() {
            return null;
        }
        
        public final void setAuthorAdditional(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPublisherBest() {
            return null;
        }
        
        public final void setPublisherBest(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getPublisherAdditional() {
            return null;
        }
        
        public final void setPublisherAdditional(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEditionVariaBest() {
            return null;
        }
        
        public final void setEditionVariaBest(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getEditionVariaAdditional() {
            return null;
        }
        
        public final void setEditionVariaAdditional(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getYearBest() {
            return null;
        }
        
        public final void setYearBest(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getYearAdditional() {
            return null;
        }
        
        public final void setYearAdditional(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCommentsBest() {
            return null;
        }
        
        public final void setCommentsBest(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getCommentsAdditional() {
            return null;
        }
        
        public final void setCommentsAdditional(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStrippedDescriptionBest() {
            return null;
        }
        
        public final void setStrippedDescriptionBest(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getStrippedDescriptionAdditional() {
            return null;
        }
        
        public final void setStrippedDescriptionAdditional(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getLanguageCodes() {
            return null;
        }
        
        public final void setLanguageCodes(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMostLikelyLanguageCode() {
            return null;
        }
        
        public final void setMostLikelyLanguageCode(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getSanitizedIsbns() {
            return null;
        }
        
        public final void setSanitizedIsbns(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getAsinMultiple() {
            return null;
        }
        
        public final void setAsinMultiple(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getGooglebookidMultiple() {
            return null;
        }
        
        public final void setGooglebookidMultiple(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getOpenlibraryidMultiple() {
            return null;
        }
        
        public final void setOpenlibraryidMultiple(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getDoiMultiple() {
            return null;
        }
        
        public final void setDoiMultiple(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getProblems() {
            return null;
        }
        
        public final void setProblems(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getContentType() {
            return null;
        }
        
        public final void setContentType(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getHasAaDownloads() {
            return null;
        }
        
        public final void setHasAaDownloads(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getHasAaExclusiveDownloads() {
            return null;
        }
        
        public final void setHasAaExclusiveDownloads(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        public FileUnifiedData() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component16() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component17() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component18() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component19() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component20() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component21() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component22() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component23() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component24() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component25() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component26() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component27() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component28() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component29() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component30() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component31() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component32() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component33() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component34() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.AnnasArchive.FileUnifiedData copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "original_filename_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String originalFilenameBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "original_filename_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> originalFilenameAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "original_filename_best_name_only")
        @org.jetbrains.annotations.Nullable()
        java.lang.String originalFilenameBestNameOnly, @com.fasterxml.jackson.annotation.JsonProperty(value = "cover_url_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String coverUrlBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "cover_url_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> coverUrlAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "extension_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String extensionBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "extension_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> extensionAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "filesize_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.Integer filesizeBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "filesize_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> filesizeAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "title_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String titleBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "title_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> titleAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "author_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String authorBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "author_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> authorAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "publisher_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String publisherBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "publisher_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> publisherAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "edition_varia_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String editionVariaBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "edition_varia_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> editionVariaAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "year_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String yearBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "year_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> yearAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "comments_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String commentsBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "comments_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> commentsAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "stripped_description_best")
        @org.jetbrains.annotations.Nullable()
        java.lang.String strippedDescriptionBest, @com.fasterxml.jackson.annotation.JsonProperty(value = "stripped_description_additional")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> strippedDescriptionAdditional, @com.fasterxml.jackson.annotation.JsonProperty(value = "language_codes")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> languageCodes, @com.fasterxml.jackson.annotation.JsonProperty(value = "most_likely_language_code")
        @org.jetbrains.annotations.Nullable()
        java.lang.String mostLikelyLanguageCode, @com.fasterxml.jackson.annotation.JsonProperty(value = "sanitized_isbns")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> sanitizedIsbns, @com.fasterxml.jackson.annotation.JsonProperty(value = "asin_multiple")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> asinMultiple, @com.fasterxml.jackson.annotation.JsonProperty(value = "googlebookid_multiple")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> googlebookidMultiple, @com.fasterxml.jackson.annotation.JsonProperty(value = "openlibraryid_multiple")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> openlibraryidMultiple, @com.fasterxml.jackson.annotation.JsonProperty(value = "doi_multiple")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> doiMultiple, @com.fasterxml.jackson.annotation.JsonProperty(value = "problems")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> problems, @com.fasterxml.jackson.annotation.JsonProperty(value = "content_type")
        @org.jetbrains.annotations.Nullable()
        java.lang.String contentType, @com.fasterxml.jackson.annotation.JsonProperty(value = "has_aa_downloads")
        @org.jetbrains.annotations.Nullable()
        java.lang.Integer hasAaDownloads, @com.fasterxml.jackson.annotation.JsonProperty(value = "has_aa_exclusive_downloads")
        @org.jetbrains.annotations.Nullable()
        java.lang.Integer hasAaExclusiveDownloads) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003Jk\u0010&\u001a\u00020\u00002\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020\u0004H\u00d6\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010\u00a8\u0006-"}, d2 = {"Lcom/lagradost/quicknovel/providers/AnnasArchive$TopBox;", "", "metaInformation", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "coverUrl", "topRow", "title", "publisherAndEdition", "author", "description", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "setAuthor", "(Ljava/lang/String;)V", "getCoverUrl", "setCoverUrl", "getDescription", "setDescription", "getMetaInformation", "()Ljava/util/ArrayList;", "setMetaInformation", "(Ljava/util/ArrayList;)V", "getPublisherAndEdition", "setPublisherAndEdition", "getTitle", "setTitle", "getTopRow", "setTopRow", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class TopBox {
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> metaInformation;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String coverUrl;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String topRow;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String title;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String publisherAndEdition;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String author;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String description;
        
        public TopBox(@com.fasterxml.jackson.annotation.JsonProperty(value = "meta_information")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> metaInformation, @com.fasterxml.jackson.annotation.JsonProperty(value = "cover_url")
        @org.jetbrains.annotations.Nullable()
        java.lang.String coverUrl, @com.fasterxml.jackson.annotation.JsonProperty(value = "top_row")
        @org.jetbrains.annotations.Nullable()
        java.lang.String topRow, @com.fasterxml.jackson.annotation.JsonProperty(value = "title")
        @org.jetbrains.annotations.Nullable()
        java.lang.String title, @com.fasterxml.jackson.annotation.JsonProperty(value = "publisher_and_edition")
        @org.jetbrains.annotations.Nullable()
        java.lang.String publisherAndEdition, @com.fasterxml.jackson.annotation.JsonProperty(value = "author")
        @org.jetbrains.annotations.Nullable()
        java.lang.String author, @com.fasterxml.jackson.annotation.JsonProperty(value = "description")
        @org.jetbrains.annotations.Nullable()
        java.lang.String description) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getMetaInformation() {
            return null;
        }
        
        public final void setMetaInformation(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCoverUrl() {
            return null;
        }
        
        public final void setCoverUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTopRow() {
            return null;
        }
        
        public final void setTopRow(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPublisherAndEdition() {
            return null;
        }
        
        public final void setPublisherAndEdition(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAuthor() {
            return null;
        }
        
        public final void setAuthor(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        public final void setDescription(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public TopBox() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.AnnasArchive.TopBox copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "meta_information")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> metaInformation, @com.fasterxml.jackson.annotation.JsonProperty(value = "cover_url")
        @org.jetbrains.annotations.Nullable()
        java.lang.String coverUrl, @com.fasterxml.jackson.annotation.JsonProperty(value = "top_row")
        @org.jetbrains.annotations.Nullable()
        java.lang.String topRow, @com.fasterxml.jackson.annotation.JsonProperty(value = "title")
        @org.jetbrains.annotations.Nullable()
        java.lang.String title, @com.fasterxml.jackson.annotation.JsonProperty(value = "publisher_and_edition")
        @org.jetbrains.annotations.Nullable()
        java.lang.String publisherAndEdition, @com.fasterxml.jackson.annotation.JsonProperty(value = "author")
        @org.jetbrains.annotations.Nullable()
        java.lang.String author, @com.fasterxml.jackson.annotation.JsonProperty(value = "description")
        @org.jetbrains.annotations.Nullable()
        java.lang.String description) {
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
}