// Generated by view binder compiler. Do not edit!
package com.lagradost.quicknovel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.lagradost.quicknovel.R;
import com.lagradost.quicknovel.widget.AutofitRecyclerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSearchBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final SearchView mainSearch;

  @NonNull
  public final AutofitRecyclerView searchAllRecycler;

  @NonNull
  public final ImageView searchFilter;

  @NonNull
  public final ContentLoadingProgressBar searchLoadingBar;

  @NonNull
  public final RecyclerView searchMasterRecycler;

  @NonNull
  public final LinearLayout searchRoot;

  private FragmentSearchBinding(@NonNull LinearLayout rootView, @NonNull SearchView mainSearch,
      @NonNull AutofitRecyclerView searchAllRecycler, @NonNull ImageView searchFilter,
      @NonNull ContentLoadingProgressBar searchLoadingBar,
      @NonNull RecyclerView searchMasterRecycler, @NonNull LinearLayout searchRoot) {
    this.rootView = rootView;
    this.mainSearch = mainSearch;
    this.searchAllRecycler = searchAllRecycler;
    this.searchFilter = searchFilter;
    this.searchLoadingBar = searchLoadingBar;
    this.searchMasterRecycler = searchMasterRecycler;
    this.searchRoot = searchRoot;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.main_search;
      SearchView mainSearch = ViewBindings.findChildViewById(rootView, id);
      if (mainSearch == null) {
        break missingId;
      }

      id = R.id.search_all_recycler;
      AutofitRecyclerView searchAllRecycler = ViewBindings.findChildViewById(rootView, id);
      if (searchAllRecycler == null) {
        break missingId;
      }

      id = R.id.search_filter;
      ImageView searchFilter = ViewBindings.findChildViewById(rootView, id);
      if (searchFilter == null) {
        break missingId;
      }

      id = R.id.search_loading_bar;
      ContentLoadingProgressBar searchLoadingBar = ViewBindings.findChildViewById(rootView, id);
      if (searchLoadingBar == null) {
        break missingId;
      }

      id = R.id.search_master_recycler;
      RecyclerView searchMasterRecycler = ViewBindings.findChildViewById(rootView, id);
      if (searchMasterRecycler == null) {
        break missingId;
      }

      LinearLayout searchRoot = (LinearLayout) rootView;

      return new FragmentSearchBinding((LinearLayout) rootView, mainSearch, searchAllRecycler,
          searchFilter, searchLoadingBar, searchMasterRecycler, searchRoot);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
