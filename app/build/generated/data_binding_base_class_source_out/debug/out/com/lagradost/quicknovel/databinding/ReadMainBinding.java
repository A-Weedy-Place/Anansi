// Generated by view binder compiler. Do not edit!
package com.lagradost.quicknovel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextClock;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.lagradost.quicknovel.R;
import com.lagradost.quicknovel.ui.roundedbg.RoundedBgTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ReadMainBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView failText;

  @NonNull
  public final View lineTopExtra;

  @NonNull
  public final TextView loadingText;

  @NonNull
  public final ImageButton readActionChapters;

  @NonNull
  public final ImageButton readActionChatbot;

  @NonNull
  public final ImageButton readActionRotate;

  @NonNull
  public final ImageButton readActionSettings;

  @NonNull
  public final ImageButton readActionTts;

  @NonNull
  public final TextView readBattery;

  @NonNull
  public final View readBottomItem;

  @NonNull
  public final TextView readChapterName;

  @NonNull
  public final FrameLayout readFail;

  @NonNull
  public final FrameLayout readLoading;

  @NonNull
  public final ProgressBar readLoadingBar;

  @NonNull
  public final FrameLayout readNormalLayout;

  @NonNull
  public final ContentLoadingProgressBar readOverflowProgress;

  @NonNull
  public final FrameLayout readOverlay;

  @NonNull
  public final ScrollView readScroll;

  @NonNull
  public final View readTempBottomMargin;

  @NonNull
  public final RoundedBgTextView readText;

  @NonNull
  public final LinearLayout readTextBackground;

  @NonNull
  public final TextView readTime;

  @NonNull
  public final TextClock readTimeClock;

  @NonNull
  public final TextView readTitleText;

  @NonNull
  public final MaterialToolbar readToolbar;

  @NonNull
  public final AppBarLayout readToolbarHolder;

  @NonNull
  public final View readTopItem;

  @NonNull
  public final View readTopmargin;

  @NonNull
  public final ConstraintLayout readerBottomView;

  @NonNull
  public final LinearLayout readerBottomViewHolder;

  @NonNull
  public final ConstraintLayout readerBottomViewTts;

  @NonNull
  public final FrameLayout readerContainer;

  @NonNull
  public final LinearLayout readerLinContainer;

  @NonNull
  public final RecyclerView realText;

  @NonNull
  public final ImageButton ttsActionBack;

  @NonNull
  public final ImageButton ttsActionForward;

  @NonNull
  public final ImageButton ttsActionPausePlay;

  @NonNull
  public final ImageButton ttsActionStop;

  @NonNull
  public final TextView ttsStopTime;

  private ReadMainBinding(@NonNull FrameLayout rootView, @NonNull TextView failText,
      @NonNull View lineTopExtra, @NonNull TextView loadingText,
      @NonNull ImageButton readActionChapters, @NonNull ImageButton readActionChatbot,
      @NonNull ImageButton readActionRotate, @NonNull ImageButton readActionSettings,
      @NonNull ImageButton readActionTts, @NonNull TextView readBattery,
      @NonNull View readBottomItem, @NonNull TextView readChapterName,
      @NonNull FrameLayout readFail, @NonNull FrameLayout readLoading,
      @NonNull ProgressBar readLoadingBar, @NonNull FrameLayout readNormalLayout,
      @NonNull ContentLoadingProgressBar readOverflowProgress, @NonNull FrameLayout readOverlay,
      @NonNull ScrollView readScroll, @NonNull View readTempBottomMargin,
      @NonNull RoundedBgTextView readText, @NonNull LinearLayout readTextBackground,
      @NonNull TextView readTime, @NonNull TextClock readTimeClock, @NonNull TextView readTitleText,
      @NonNull MaterialToolbar readToolbar, @NonNull AppBarLayout readToolbarHolder,
      @NonNull View readTopItem, @NonNull View readTopmargin,
      @NonNull ConstraintLayout readerBottomView, @NonNull LinearLayout readerBottomViewHolder,
      @NonNull ConstraintLayout readerBottomViewTts, @NonNull FrameLayout readerContainer,
      @NonNull LinearLayout readerLinContainer, @NonNull RecyclerView realText,
      @NonNull ImageButton ttsActionBack, @NonNull ImageButton ttsActionForward,
      @NonNull ImageButton ttsActionPausePlay, @NonNull ImageButton ttsActionStop,
      @NonNull TextView ttsStopTime) {
    this.rootView = rootView;
    this.failText = failText;
    this.lineTopExtra = lineTopExtra;
    this.loadingText = loadingText;
    this.readActionChapters = readActionChapters;
    this.readActionChatbot = readActionChatbot;
    this.readActionRotate = readActionRotate;
    this.readActionSettings = readActionSettings;
    this.readActionTts = readActionTts;
    this.readBattery = readBattery;
    this.readBottomItem = readBottomItem;
    this.readChapterName = readChapterName;
    this.readFail = readFail;
    this.readLoading = readLoading;
    this.readLoadingBar = readLoadingBar;
    this.readNormalLayout = readNormalLayout;
    this.readOverflowProgress = readOverflowProgress;
    this.readOverlay = readOverlay;
    this.readScroll = readScroll;
    this.readTempBottomMargin = readTempBottomMargin;
    this.readText = readText;
    this.readTextBackground = readTextBackground;
    this.readTime = readTime;
    this.readTimeClock = readTimeClock;
    this.readTitleText = readTitleText;
    this.readToolbar = readToolbar;
    this.readToolbarHolder = readToolbarHolder;
    this.readTopItem = readTopItem;
    this.readTopmargin = readTopmargin;
    this.readerBottomView = readerBottomView;
    this.readerBottomViewHolder = readerBottomViewHolder;
    this.readerBottomViewTts = readerBottomViewTts;
    this.readerContainer = readerContainer;
    this.readerLinContainer = readerLinContainer;
    this.realText = realText;
    this.ttsActionBack = ttsActionBack;
    this.ttsActionForward = ttsActionForward;
    this.ttsActionPausePlay = ttsActionPausePlay;
    this.ttsActionStop = ttsActionStop;
    this.ttsStopTime = ttsStopTime;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReadMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReadMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.read_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReadMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fail_text;
      TextView failText = ViewBindings.findChildViewById(rootView, id);
      if (failText == null) {
        break missingId;
      }

      id = R.id.line_top_extra;
      View lineTopExtra = ViewBindings.findChildViewById(rootView, id);
      if (lineTopExtra == null) {
        break missingId;
      }

      id = R.id.loading_text;
      TextView loadingText = ViewBindings.findChildViewById(rootView, id);
      if (loadingText == null) {
        break missingId;
      }

      id = R.id.read_action_chapters;
      ImageButton readActionChapters = ViewBindings.findChildViewById(rootView, id);
      if (readActionChapters == null) {
        break missingId;
      }

      id = R.id.read_action_chatbot;
      ImageButton readActionChatbot = ViewBindings.findChildViewById(rootView, id);
      if (readActionChatbot == null) {
        break missingId;
      }

      id = R.id.read_action_rotate;
      ImageButton readActionRotate = ViewBindings.findChildViewById(rootView, id);
      if (readActionRotate == null) {
        break missingId;
      }

      id = R.id.read_action_settings;
      ImageButton readActionSettings = ViewBindings.findChildViewById(rootView, id);
      if (readActionSettings == null) {
        break missingId;
      }

      id = R.id.read_action_tts;
      ImageButton readActionTts = ViewBindings.findChildViewById(rootView, id);
      if (readActionTts == null) {
        break missingId;
      }

      id = R.id.read_battery;
      TextView readBattery = ViewBindings.findChildViewById(rootView, id);
      if (readBattery == null) {
        break missingId;
      }

      id = R.id.read_bottom_item;
      View readBottomItem = ViewBindings.findChildViewById(rootView, id);
      if (readBottomItem == null) {
        break missingId;
      }

      id = R.id.read_chapter_name;
      TextView readChapterName = ViewBindings.findChildViewById(rootView, id);
      if (readChapterName == null) {
        break missingId;
      }

      id = R.id.read_fail;
      FrameLayout readFail = ViewBindings.findChildViewById(rootView, id);
      if (readFail == null) {
        break missingId;
      }

      id = R.id.read_loading;
      FrameLayout readLoading = ViewBindings.findChildViewById(rootView, id);
      if (readLoading == null) {
        break missingId;
      }

      id = R.id.read_loading_bar;
      ProgressBar readLoadingBar = ViewBindings.findChildViewById(rootView, id);
      if (readLoadingBar == null) {
        break missingId;
      }

      id = R.id.read_normal_layout;
      FrameLayout readNormalLayout = ViewBindings.findChildViewById(rootView, id);
      if (readNormalLayout == null) {
        break missingId;
      }

      id = R.id.read_overflow_progress;
      ContentLoadingProgressBar readOverflowProgress = ViewBindings.findChildViewById(rootView, id);
      if (readOverflowProgress == null) {
        break missingId;
      }

      id = R.id.read_overlay;
      FrameLayout readOverlay = ViewBindings.findChildViewById(rootView, id);
      if (readOverlay == null) {
        break missingId;
      }

      id = R.id.read_scroll;
      ScrollView readScroll = ViewBindings.findChildViewById(rootView, id);
      if (readScroll == null) {
        break missingId;
      }

      id = R.id.read_temp_bottom_margin;
      View readTempBottomMargin = ViewBindings.findChildViewById(rootView, id);
      if (readTempBottomMargin == null) {
        break missingId;
      }

      id = R.id.read_text;
      RoundedBgTextView readText = ViewBindings.findChildViewById(rootView, id);
      if (readText == null) {
        break missingId;
      }

      id = R.id.read_text_background;
      LinearLayout readTextBackground = ViewBindings.findChildViewById(rootView, id);
      if (readTextBackground == null) {
        break missingId;
      }

      id = R.id.read_time;
      TextView readTime = ViewBindings.findChildViewById(rootView, id);
      if (readTime == null) {
        break missingId;
      }

      id = R.id.read_time_clock;
      TextClock readTimeClock = ViewBindings.findChildViewById(rootView, id);
      if (readTimeClock == null) {
        break missingId;
      }

      id = R.id.read_title_text;
      TextView readTitleText = ViewBindings.findChildViewById(rootView, id);
      if (readTitleText == null) {
        break missingId;
      }

      id = R.id.read_toolbar;
      MaterialToolbar readToolbar = ViewBindings.findChildViewById(rootView, id);
      if (readToolbar == null) {
        break missingId;
      }

      id = R.id.read_toolbar_holder;
      AppBarLayout readToolbarHolder = ViewBindings.findChildViewById(rootView, id);
      if (readToolbarHolder == null) {
        break missingId;
      }

      id = R.id.read_top_item;
      View readTopItem = ViewBindings.findChildViewById(rootView, id);
      if (readTopItem == null) {
        break missingId;
      }

      id = R.id.read_topmargin;
      View readTopmargin = ViewBindings.findChildViewById(rootView, id);
      if (readTopmargin == null) {
        break missingId;
      }

      id = R.id.reader_bottom_view;
      ConstraintLayout readerBottomView = ViewBindings.findChildViewById(rootView, id);
      if (readerBottomView == null) {
        break missingId;
      }

      id = R.id.reader_bottom_view_holder;
      LinearLayout readerBottomViewHolder = ViewBindings.findChildViewById(rootView, id);
      if (readerBottomViewHolder == null) {
        break missingId;
      }

      id = R.id.reader_bottom_view_tts;
      ConstraintLayout readerBottomViewTts = ViewBindings.findChildViewById(rootView, id);
      if (readerBottomViewTts == null) {
        break missingId;
      }

      FrameLayout readerContainer = (FrameLayout) rootView;

      id = R.id.reader_lin_container;
      LinearLayout readerLinContainer = ViewBindings.findChildViewById(rootView, id);
      if (readerLinContainer == null) {
        break missingId;
      }

      id = R.id.real_text;
      RecyclerView realText = ViewBindings.findChildViewById(rootView, id);
      if (realText == null) {
        break missingId;
      }

      id = R.id.tts_action_back;
      ImageButton ttsActionBack = ViewBindings.findChildViewById(rootView, id);
      if (ttsActionBack == null) {
        break missingId;
      }

      id = R.id.tts_action_forward;
      ImageButton ttsActionForward = ViewBindings.findChildViewById(rootView, id);
      if (ttsActionForward == null) {
        break missingId;
      }

      id = R.id.tts_action_pause_play;
      ImageButton ttsActionPausePlay = ViewBindings.findChildViewById(rootView, id);
      if (ttsActionPausePlay == null) {
        break missingId;
      }

      id = R.id.tts_action_stop;
      ImageButton ttsActionStop = ViewBindings.findChildViewById(rootView, id);
      if (ttsActionStop == null) {
        break missingId;
      }

      id = R.id.tts_stop_time;
      TextView ttsStopTime = ViewBindings.findChildViewById(rootView, id);
      if (ttsStopTime == null) {
        break missingId;
      }

      return new ReadMainBinding((FrameLayout) rootView, failText, lineTopExtra, loadingText,
          readActionChapters, readActionChatbot, readActionRotate, readActionSettings,
          readActionTts, readBattery, readBottomItem, readChapterName, readFail, readLoading,
          readLoadingBar, readNormalLayout, readOverflowProgress, readOverlay, readScroll,
          readTempBottomMargin, readText, readTextBackground, readTime, readTimeClock,
          readTitleText, readToolbar, readToolbarHolder, readTopItem, readTopmargin,
          readerBottomView, readerBottomViewHolder, readerBottomViewTts, readerContainer,
          readerLinContainer, realText, ttsActionBack, ttsActionForward, ttsActionPausePlay,
          ttsActionStop, ttsStopTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
