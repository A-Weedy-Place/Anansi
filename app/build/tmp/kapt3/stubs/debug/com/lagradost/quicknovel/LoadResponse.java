package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0007\u0010\u0005\"\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u0005\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u0011X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R \u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u0004\u0018\u00010*X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b0\u0010\u0005\"\u0004\b1\u0010\tR \u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010#X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\u0012\u00105\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b6\u0010\u0005R\u001a\u00107\u001a\u0004\u0018\u00010\u0011X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b8\u0010\u0013\"\u0004\b9\u0010\u0015\u00a8\u0006:"}, d2 = {"Lcom/lagradost/quicknovel/LoadResponse;", "", "apiName", "", "getApiName", "()Ljava/lang/String;", "author", "getAuthor", "setAuthor", "(Ljava/lang/String;)V", "image", "Lcom/lagradost/quicknovel/ui/UiImage;", "getImage", "()Lcom/lagradost/quicknovel/ui/UiImage;", "name", "getName", "peopleVoted", "", "getPeopleVoted", "()Ljava/lang/Integer;", "setPeopleVoted", "(Ljava/lang/Integer;)V", "posterHeaders", "", "getPosterHeaders", "()Ljava/util/Map;", "setPosterHeaders", "(Ljava/util/Map;)V", "posterUrl", "getPosterUrl", "setPosterUrl", "rating", "getRating", "setRating", "related", "", "Lcom/lagradost/quicknovel/SearchResponse;", "getRelated", "()Ljava/util/List;", "setRelated", "(Ljava/util/List;)V", "status", "Lcom/lagradost/quicknovel/ReleaseStatus;", "getStatus", "()Lcom/lagradost/quicknovel/ReleaseStatus;", "setStatus", "(Lcom/lagradost/quicknovel/ReleaseStatus;)V", "synopsis", "getSynopsis", "setSynopsis", "tags", "getTags", "setTags", "url", "getUrl", "views", "getViews", "setViews", "app_debug"})
public abstract interface LoadResponse {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUrl();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getAuthor();
    
    public abstract void setAuthor(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getPosterUrl();
    
    public abstract void setPosterUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getRating();
    
    public abstract void setRating(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getPeopleVoted();
    
    public abstract void setPeopleVoted(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getViews();
    
    public abstract void setViews(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getSynopsis();
    
    public abstract void setSynopsis(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<java.lang.String> getTags();
    
    public abstract void setTags(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.lagradost.quicknovel.ReleaseStatus getStatus();
    
    public abstract void setStatus(@org.jetbrains.annotations.Nullable()
    com.lagradost.quicknovel.ReleaseStatus p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.Map<java.lang.String, java.lang.String> getPosterHeaders();
    
    public abstract void setPosterHeaders(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.lagradost.quicknovel.ui.UiImage getImage();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getApiName();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<com.lagradost.quicknovel.SearchResponse> getRelated();
    
    public abstract void setRelated(@org.jetbrains.annotations.Nullable()
    java.util.List<com.lagradost.quicknovel.SearchResponse> p0);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable()
        public static com.lagradost.quicknovel.ui.UiImage getImage(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.LoadResponse $this) {
            return null;
        }
    }
}