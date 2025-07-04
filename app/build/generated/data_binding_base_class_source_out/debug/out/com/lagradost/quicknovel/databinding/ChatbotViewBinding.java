// Generated by view binder compiler. Do not edit!
package com.lagradost.quicknovel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.lagradost.quicknovel.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ChatbotViewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText chatbotInput;

  @NonNull
  public final MaterialCardView chatbotInputLayout;

  @NonNull
  public final RecyclerView chatbotMessages;

  @NonNull
  public final ImageButton chatbotSendButton;

  @NonNull
  public final MaterialToolbar chatbotToolbar;

  @NonNull
  public final TypingIndicatorBinding typingIndicator;

  private ChatbotViewBinding(@NonNull ConstraintLayout rootView, @NonNull EditText chatbotInput,
      @NonNull MaterialCardView chatbotInputLayout, @NonNull RecyclerView chatbotMessages,
      @NonNull ImageButton chatbotSendButton, @NonNull MaterialToolbar chatbotToolbar,
      @NonNull TypingIndicatorBinding typingIndicator) {
    this.rootView = rootView;
    this.chatbotInput = chatbotInput;
    this.chatbotInputLayout = chatbotInputLayout;
    this.chatbotMessages = chatbotMessages;
    this.chatbotSendButton = chatbotSendButton;
    this.chatbotToolbar = chatbotToolbar;
    this.typingIndicator = typingIndicator;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ChatbotViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChatbotViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.chatbot_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChatbotViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chatbot_input;
      EditText chatbotInput = ViewBindings.findChildViewById(rootView, id);
      if (chatbotInput == null) {
        break missingId;
      }

      id = R.id.chatbot_input_layout;
      MaterialCardView chatbotInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (chatbotInputLayout == null) {
        break missingId;
      }

      id = R.id.chatbot_messages;
      RecyclerView chatbotMessages = ViewBindings.findChildViewById(rootView, id);
      if (chatbotMessages == null) {
        break missingId;
      }

      id = R.id.chatbot_send_button;
      ImageButton chatbotSendButton = ViewBindings.findChildViewById(rootView, id);
      if (chatbotSendButton == null) {
        break missingId;
      }

      id = R.id.chatbot_toolbar;
      MaterialToolbar chatbotToolbar = ViewBindings.findChildViewById(rootView, id);
      if (chatbotToolbar == null) {
        break missingId;
      }

      id = R.id.typing_indicator;
      View typingIndicator = ViewBindings.findChildViewById(rootView, id);
      if (typingIndicator == null) {
        break missingId;
      }
      TypingIndicatorBinding binding_typingIndicator = TypingIndicatorBinding.bind(typingIndicator);

      return new ChatbotViewBinding((ConstraintLayout) rootView, chatbotInput, chatbotInputLayout,
          chatbotMessages, chatbotSendButton, chatbotToolbar, binding_typingIndicator);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
