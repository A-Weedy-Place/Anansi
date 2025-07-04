// Generated by view binder compiler. Do not edit!
package com.lagradost.quicknovel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.lagradost.quicknovel.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SearchResultGridBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView backgroundCard;

  @NonNull
  public final TextView imageText;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout searchResultRoot;

  private SearchResultGridBinding(@NonNull LinearLayout rootView, @NonNull CardView backgroundCard,
      @NonNull TextView imageText, @NonNull ImageView imageView,
      @NonNull LinearLayout searchResultRoot) {
    this.rootView = rootView;
    this.backgroundCard = backgroundCard;
    this.imageText = imageText;
    this.imageView = imageView;
    this.searchResultRoot = searchResultRoot;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SearchResultGridBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SearchResultGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.search_result_grid, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SearchResultGridBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backgroundCard;
      CardView backgroundCard = ViewBindings.findChildViewById(rootView, id);
      if (backgroundCard == null) {
        break missingId;
      }

      id = R.id.imageText;
      TextView imageText = ViewBindings.findChildViewById(rootView, id);
      if (imageText == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      LinearLayout searchResultRoot = (LinearLayout) rootView;

      return new SearchResultGridBinding((LinearLayout) rootView, backgroundCard, imageText,
          imageView, searchResultRoot);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
