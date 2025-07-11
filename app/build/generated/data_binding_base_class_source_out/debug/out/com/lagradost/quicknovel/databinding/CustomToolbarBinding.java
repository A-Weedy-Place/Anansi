// Generated by view binder compiler. Do not edit!
package com.lagradost.quicknovel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.lagradost.quicknovel.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomToolbarBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView downloadFilter;

  private CustomToolbarBinding(@NonNull FrameLayout rootView, @NonNull ImageView downloadFilter) {
    this.rootView = rootView;
    this.downloadFilter = downloadFilter;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_toolbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomToolbarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.download_filter;
      ImageView downloadFilter = ViewBindings.findChildViewById(rootView, id);
      if (downloadFilter == null) {
        break missingId;
      }

      return new CustomToolbarBinding((FrameLayout) rootView, downloadFilter);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
