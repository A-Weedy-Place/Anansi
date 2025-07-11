// Generated by view binder compiler. Do not edit!
package com.lagradost.quicknovel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.lagradost.quicknovel.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ReadBottomSettingsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialButton hardResetStream;

  @NonNull
  public final MaterialButton readLanguage;

  @NonNull
  public final MaterialButton readReadingType;

  @NonNull
  public final LinearLayout readSettingsColors;

  @NonNull
  public final MaterialCheckBox readSettingsIsTextSelectable;

  @NonNull
  public final MaterialCheckBox readSettingsKeepScreenActive;

  @NonNull
  public final MaterialCheckBox readSettingsLockTts;

  @NonNull
  public final LinearLayout readSettingsRoot;

  @NonNull
  public final MaterialCheckBox readSettingsScrollVol;

  @NonNull
  public final MaterialCheckBox readSettingsShowBattery;

  @NonNull
  public final MaterialCheckBox readSettingsShowBionic;

  @NonNull
  public final MaterialCheckBox readSettingsShowTime;

  @NonNull
  public final TextView readSettingsTextFontText;

  @NonNull
  public final SeekBar readSettingsTextPadding;

  @NonNull
  public final TextView readSettingsTextPaddingText;

  @NonNull
  public final TextView readSettingsTextPaddingTextTop;

  @NonNull
  public final SeekBar readSettingsTextPaddingTop;

  @NonNull
  public final SeekBar readSettingsTextSize;

  @NonNull
  public final TextView readSettingsTextSizeText;

  @NonNull
  public final MaterialButton readSettingsTtsEngine;

  @NonNull
  public final MaterialCheckBox readSettingsTwelveHourTime;

  @NonNull
  public final MaterialButton readShowFonts;

  @NonNull
  public final MaterialButton readVoice;

  private ReadBottomSettingsBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialButton hardResetStream, @NonNull MaterialButton readLanguage,
      @NonNull MaterialButton readReadingType, @NonNull LinearLayout readSettingsColors,
      @NonNull MaterialCheckBox readSettingsIsTextSelectable,
      @NonNull MaterialCheckBox readSettingsKeepScreenActive,
      @NonNull MaterialCheckBox readSettingsLockTts, @NonNull LinearLayout readSettingsRoot,
      @NonNull MaterialCheckBox readSettingsScrollVol,
      @NonNull MaterialCheckBox readSettingsShowBattery,
      @NonNull MaterialCheckBox readSettingsShowBionic,
      @NonNull MaterialCheckBox readSettingsShowTime, @NonNull TextView readSettingsTextFontText,
      @NonNull SeekBar readSettingsTextPadding, @NonNull TextView readSettingsTextPaddingText,
      @NonNull TextView readSettingsTextPaddingTextTop, @NonNull SeekBar readSettingsTextPaddingTop,
      @NonNull SeekBar readSettingsTextSize, @NonNull TextView readSettingsTextSizeText,
      @NonNull MaterialButton readSettingsTtsEngine,
      @NonNull MaterialCheckBox readSettingsTwelveHourTime, @NonNull MaterialButton readShowFonts,
      @NonNull MaterialButton readVoice) {
    this.rootView = rootView;
    this.hardResetStream = hardResetStream;
    this.readLanguage = readLanguage;
    this.readReadingType = readReadingType;
    this.readSettingsColors = readSettingsColors;
    this.readSettingsIsTextSelectable = readSettingsIsTextSelectable;
    this.readSettingsKeepScreenActive = readSettingsKeepScreenActive;
    this.readSettingsLockTts = readSettingsLockTts;
    this.readSettingsRoot = readSettingsRoot;
    this.readSettingsScrollVol = readSettingsScrollVol;
    this.readSettingsShowBattery = readSettingsShowBattery;
    this.readSettingsShowBionic = readSettingsShowBionic;
    this.readSettingsShowTime = readSettingsShowTime;
    this.readSettingsTextFontText = readSettingsTextFontText;
    this.readSettingsTextPadding = readSettingsTextPadding;
    this.readSettingsTextPaddingText = readSettingsTextPaddingText;
    this.readSettingsTextPaddingTextTop = readSettingsTextPaddingTextTop;
    this.readSettingsTextPaddingTop = readSettingsTextPaddingTop;
    this.readSettingsTextSize = readSettingsTextSize;
    this.readSettingsTextSizeText = readSettingsTextSizeText;
    this.readSettingsTtsEngine = readSettingsTtsEngine;
    this.readSettingsTwelveHourTime = readSettingsTwelveHourTime;
    this.readShowFonts = readShowFonts;
    this.readVoice = readVoice;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReadBottomSettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReadBottomSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.read_bottom_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReadBottomSettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.hard_reset_stream;
      MaterialButton hardResetStream = ViewBindings.findChildViewById(rootView, id);
      if (hardResetStream == null) {
        break missingId;
      }

      id = R.id.read_language;
      MaterialButton readLanguage = ViewBindings.findChildViewById(rootView, id);
      if (readLanguage == null) {
        break missingId;
      }

      id = R.id.read_reading_type;
      MaterialButton readReadingType = ViewBindings.findChildViewById(rootView, id);
      if (readReadingType == null) {
        break missingId;
      }

      id = R.id.read_settings_colors;
      LinearLayout readSettingsColors = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsColors == null) {
        break missingId;
      }

      id = R.id.read_settings_is_text_selectable;
      MaterialCheckBox readSettingsIsTextSelectable = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsIsTextSelectable == null) {
        break missingId;
      }

      id = R.id.read_settings_keep_screen_active;
      MaterialCheckBox readSettingsKeepScreenActive = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsKeepScreenActive == null) {
        break missingId;
      }

      id = R.id.read_settings_lock_tts;
      MaterialCheckBox readSettingsLockTts = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsLockTts == null) {
        break missingId;
      }

      LinearLayout readSettingsRoot = (LinearLayout) rootView;

      id = R.id.read_settings_scroll_vol;
      MaterialCheckBox readSettingsScrollVol = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsScrollVol == null) {
        break missingId;
      }

      id = R.id.read_settings_show_battery;
      MaterialCheckBox readSettingsShowBattery = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsShowBattery == null) {
        break missingId;
      }

      id = R.id.read_settings_show_bionic;
      MaterialCheckBox readSettingsShowBionic = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsShowBionic == null) {
        break missingId;
      }

      id = R.id.read_settings_show_time;
      MaterialCheckBox readSettingsShowTime = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsShowTime == null) {
        break missingId;
      }

      id = R.id.read_settings_text_font_text;
      TextView readSettingsTextFontText = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsTextFontText == null) {
        break missingId;
      }

      id = R.id.read_settings_text_padding;
      SeekBar readSettingsTextPadding = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsTextPadding == null) {
        break missingId;
      }

      id = R.id.read_settings_text_padding_text;
      TextView readSettingsTextPaddingText = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsTextPaddingText == null) {
        break missingId;
      }

      id = R.id.read_settings_text_padding_text_top;
      TextView readSettingsTextPaddingTextTop = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsTextPaddingTextTop == null) {
        break missingId;
      }

      id = R.id.read_settings_text_padding_top;
      SeekBar readSettingsTextPaddingTop = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsTextPaddingTop == null) {
        break missingId;
      }

      id = R.id.read_settings_text_size;
      SeekBar readSettingsTextSize = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsTextSize == null) {
        break missingId;
      }

      id = R.id.read_settings_text_size_text;
      TextView readSettingsTextSizeText = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsTextSizeText == null) {
        break missingId;
      }

      id = R.id.read_settings_tts_engine;
      MaterialButton readSettingsTtsEngine = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsTtsEngine == null) {
        break missingId;
      }

      id = R.id.read_settings_twelve_hour_time;
      MaterialCheckBox readSettingsTwelveHourTime = ViewBindings.findChildViewById(rootView, id);
      if (readSettingsTwelveHourTime == null) {
        break missingId;
      }

      id = R.id.read_show_fonts;
      MaterialButton readShowFonts = ViewBindings.findChildViewById(rootView, id);
      if (readShowFonts == null) {
        break missingId;
      }

      id = R.id.read_voice;
      MaterialButton readVoice = ViewBindings.findChildViewById(rootView, id);
      if (readVoice == null) {
        break missingId;
      }

      return new ReadBottomSettingsBinding((LinearLayout) rootView, hardResetStream, readLanguage,
          readReadingType, readSettingsColors, readSettingsIsTextSelectable,
          readSettingsKeepScreenActive, readSettingsLockTts, readSettingsRoot,
          readSettingsScrollVol, readSettingsShowBattery, readSettingsShowBionic,
          readSettingsShowTime, readSettingsTextFontText, readSettingsTextPadding,
          readSettingsTextPaddingText, readSettingsTextPaddingTextTop, readSettingsTextPaddingTop,
          readSettingsTextSize, readSettingsTextSizeText, readSettingsTtsEngine,
          readSettingsTwelveHourTime, readShowFonts, readVoice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
