// Generated by view binder compiler. Do not edit!
package com.lagradost.quicknovel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.lagradost.quicknovel.R;
import com.lagradost.quicknovel.ui.roundedbg.RoundedBgTextView;
import java.lang.NullPointerException;
import java.lang.Override;

public final class SingleTextBinding implements ViewBinding {
  @NonNull
  private final RoundedBgTextView rootView;

  private SingleTextBinding(@NonNull RoundedBgTextView rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public RoundedBgTextView getRoot() {
    return rootView;
  }

  @NonNull
  public static SingleTextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SingleTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.single_text, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SingleTextBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new SingleTextBinding((RoundedBgTextView) rootView);
  }
}
