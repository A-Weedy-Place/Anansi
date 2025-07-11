// Generated by view binder compiler. Do not edit!
package com.lagradost.quicknovel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.lagradost.quicknovel.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDownloadsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TabLayout bookmarkTabs;

  @NonNull
  public final ExtendedFloatingActionButton downloadFab;

  @NonNull
  public final LinearLayout downloadRoot;

  @NonNull
  public final SearchView downloadSearch;

  @NonNull
  public final SwipeRefreshLayout swipeContainer;

  @NonNull
  public final ViewPager2 viewpager;

  private FragmentDownloadsBinding(@NonNull LinearLayout rootView, @NonNull TabLayout bookmarkTabs,
      @NonNull ExtendedFloatingActionButton downloadFab, @NonNull LinearLayout downloadRoot,
      @NonNull SearchView downloadSearch, @NonNull SwipeRefreshLayout swipeContainer,
      @NonNull ViewPager2 viewpager) {
    this.rootView = rootView;
    this.bookmarkTabs = bookmarkTabs;
    this.downloadFab = downloadFab;
    this.downloadRoot = downloadRoot;
    this.downloadSearch = downloadSearch;
    this.swipeContainer = swipeContainer;
    this.viewpager = viewpager;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDownloadsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDownloadsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_downloads, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDownloadsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bookmark_tabs;
      TabLayout bookmarkTabs = ViewBindings.findChildViewById(rootView, id);
      if (bookmarkTabs == null) {
        break missingId;
      }

      id = R.id.download_fab;
      ExtendedFloatingActionButton downloadFab = ViewBindings.findChildViewById(rootView, id);
      if (downloadFab == null) {
        break missingId;
      }

      LinearLayout downloadRoot = (LinearLayout) rootView;

      id = R.id.download_search;
      SearchView downloadSearch = ViewBindings.findChildViewById(rootView, id);
      if (downloadSearch == null) {
        break missingId;
      }

      id = R.id.swipe_container;
      SwipeRefreshLayout swipeContainer = ViewBindings.findChildViewById(rootView, id);
      if (swipeContainer == null) {
        break missingId;
      }

      id = R.id.viewpager;
      ViewPager2 viewpager = ViewBindings.findChildViewById(rootView, id);
      if (viewpager == null) {
        break missingId;
      }

      return new FragmentDownloadsBinding((LinearLayout) rootView, bookmarkTabs, downloadFab,
          downloadRoot, downloadSearch, swipeContainer, viewpager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
