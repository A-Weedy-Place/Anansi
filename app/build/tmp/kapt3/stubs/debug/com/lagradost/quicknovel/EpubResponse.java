package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u00bb\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\r\u00a2\u0006\u0002\u0010\u0017J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0017\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011H\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00130\rH\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\rH\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010E\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010F\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u00c6\u0003J\u00cc\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NH\u00d6\u0003J\t\u0010O\u001a\u00020\bH\u00d6\u0001J\t\u0010P\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0014\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0019\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001cR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010/R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u0010\u001cR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001e\"\u0004\b7\u0010/R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0019R\u001e\u0010\n\u001a\u0004\u0018\u00010\bX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b9\u0010!\"\u0004\b:\u0010#\u00a8\u0006Q"}, d2 = {"Lcom/lagradost/quicknovel/EpubResponse;", "Lcom/lagradost/quicknovel/LoadResponse;", "url", "", "name", "author", "posterUrl", "rating", "", "peopleVoted", "views", "synopsis", "tags", "", "status", "Lcom/lagradost/quicknovel/ReleaseStatus;", "posterHeaders", "", "links", "Lcom/lagradost/quicknovel/DownloadLinkType;", "apiName", "related", "Lcom/lagradost/quicknovel/SearchResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/lagradost/quicknovel/ReleaseStatus;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getApiName", "()Ljava/lang/String;", "getAuthor", "setAuthor", "(Ljava/lang/String;)V", "getLinks", "()Ljava/util/List;", "getName", "getPeopleVoted", "()Ljava/lang/Integer;", "setPeopleVoted", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPosterHeaders", "()Ljava/util/Map;", "setPosterHeaders", "(Ljava/util/Map;)V", "getPosterUrl", "setPosterUrl", "getRating", "setRating", "getRelated", "setRelated", "(Ljava/util/List;)V", "getStatus", "()Lcom/lagradost/quicknovel/ReleaseStatus;", "setStatus", "(Lcom/lagradost/quicknovel/ReleaseStatus;)V", "getSynopsis", "setSynopsis", "getTags", "setTags", "getUrl", "getViews", "setViews", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/lagradost/quicknovel/ReleaseStatus;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lcom/lagradost/quicknovel/EpubResponse;", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class EpubResponse implements com.lagradost.quicknovel.LoadResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String author;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String posterUrl;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer rating;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer peopleVoted;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer views;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String synopsis;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> tags;
    @org.jetbrains.annotations.Nullable()
    private com.lagradost.quicknovel.ReleaseStatus status;
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, java.lang.String> posterHeaders;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.lagradost.quicknovel.DownloadLinkType> links = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String apiName = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.lagradost.quicknovel.SearchResponse> related;
    
    public EpubResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String author, @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer peopleVoted, @org.jetbrains.annotations.Nullable()
    java.lang.Integer views, @org.jetbrains.annotations.Nullable()
    java.lang.String synopsis, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> tags, @org.jetbrains.annotations.Nullable()
    com.lagradost.quicknovel.ReleaseStatus status, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> posterHeaders, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.lagradost.quicknovel.DownloadLinkType> links, @org.jetbrains.annotations.NotNull()
    java.lang.String apiName, @org.jetbrains.annotations.Nullable()
    java.util.List<com.lagradost.quicknovel.SearchResponse> related) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getUrl() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getAuthor() {
        return null;
    }
    
    @java.lang.Override()
    public void setAuthor(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getPosterUrl() {
        return null;
    }
    
    @java.lang.Override()
    public void setPosterUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getRating() {
        return null;
    }
    
    @java.lang.Override()
    public void setRating(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getPeopleVoted() {
        return null;
    }
    
    @java.lang.Override()
    public void setPeopleVoted(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getViews() {
        return null;
    }
    
    @java.lang.Override()
    public void setViews(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getSynopsis() {
        return null;
    }
    
    @java.lang.Override()
    public void setSynopsis(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.util.List<java.lang.String> getTags() {
        return null;
    }
    
    @java.lang.Override()
    public void setTags(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.lagradost.quicknovel.ReleaseStatus getStatus() {
        return null;
    }
    
    @java.lang.Override()
    public void setStatus(@org.jetbrains.annotations.Nullable()
    com.lagradost.quicknovel.ReleaseStatus p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.util.Map<java.lang.String, java.lang.String> getPosterHeaders() {
        return null;
    }
    
    @java.lang.Override()
    public void setPosterHeaders(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.lagradost.quicknovel.DownloadLinkType> getLinks() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getApiName() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.util.List<com.lagradost.quicknovel.SearchResponse> getRelated() {
        return null;
    }
    
    @java.lang.Override()
    public void setRelated(@org.jetbrains.annotations.Nullable()
    java.util.List<com.lagradost.quicknovel.SearchResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.lagradost.quicknovel.ReleaseStatus component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.lagradost.quicknovel.DownloadLinkType> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.lagradost.quicknovel.SearchResponse> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
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
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.EpubResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String author, @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer peopleVoted, @org.jetbrains.annotations.Nullable()
    java.lang.Integer views, @org.jetbrains.annotations.Nullable()
    java.lang.String synopsis, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> tags, @org.jetbrains.annotations.Nullable()
    com.lagradost.quicknovel.ReleaseStatus status, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> posterHeaders, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.lagradost.quicknovel.DownloadLinkType> links, @org.jetbrains.annotations.NotNull()
    java.lang.String apiName, @org.jetbrains.annotations.Nullable()
    java.util.List<com.lagradost.quicknovel.SearchResponse> related) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.lagradost.quicknovel.ui.UiImage getImage() {
        return null;
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