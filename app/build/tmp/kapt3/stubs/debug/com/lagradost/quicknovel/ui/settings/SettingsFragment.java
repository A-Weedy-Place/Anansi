package com.lagradost.quicknovel.ui.settings;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\f\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/lagradost/quicknovel/ui/settings/SettingsFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "pathPicker", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/net/Uri;", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "getPref", "Landroidx/preference/Preference;", "id", "", "Companion", "app_debug"})
public final class SettingsFragment extends androidx.preference.PreferenceFragmentCompat {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<kotlin.Triple<java.lang.String, java.lang.String, java.lang.String>> appLanguages = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.net.Uri> pathPicker = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.ui.settings.SettingsFragment.Companion Companion = null;
    
    public SettingsFragment() {
        super();
    }
    
    private final androidx.preference.Preference getPref(androidx.preference.PreferenceFragmentCompat $this$getPref, int id) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    java.lang.String rootKey) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001a\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0014*\u00020\fR)\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/lagradost/quicknovel/ui/settings/SettingsFragment$Companion;", "", "()V", "appLanguages", "", "Lkotlin/Triple;", "", "getAppLanguages", "()Ljava/util/List;", "basePathToFile", "Lcom/lagradost/safefile/SafeFile;", "context", "Landroid/content/Context;", "path", "getCurrentLocale", "getDefaultDir", "getDownloadDirs", "showSearchProviders", "", "getBasePath", "Lkotlin/Pair;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCurrentLocale(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<kotlin.Triple<java.lang.String, java.lang.String, java.lang.String>> getAppLanguages() {
            return null;
        }
        
        public final void showSearchProviders(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.lagradost.safefile.SafeFile getDefaultDir(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * Turns a string to an UniFile. Used for stored string paths such as settings.
         * Should only be used to get a download path.
         */
        private final com.lagradost.safefile.SafeFile basePathToFile(android.content.Context context, java.lang.String path) {
            return null;
        }
        
        /**
         * Base path where downloaded things should be stored, changes depending on settings.
         * Returns the file and a string to be stored for future file retrieval.
         * UniFile.filePath is not sufficient for storage.
         */
        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<com.lagradost.safefile.SafeFile, java.lang.String> getBasePath(@org.jetbrains.annotations.NotNull()
        android.content.Context $this$getBasePath) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getDownloadDirs(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            return null;
        }
    }
}