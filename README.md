# Anansi - Novel Reader App

<div align="center">
  <img src="app/src/main/ic_launcher-playstore.png" alt="Anansi Logo" width="128" height="128">
  
  [![Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://android.com)
  [![Kotlin](https://img.shields.io/badge/Language-Kotlin-blue.svg)](https://kotlinlang.org)
  [![API](https://img.shields.io/badge/API-26%2B-brightgreen.svg)](https://android-arsenal.com/api?level=26)
  [![License](https://img.shields.io/github/license/your-username/anansi)](LICENSE)
</div>

## 📖 About

Anansi is a feature-rich Android application for reading novels from multiple online sources. Named after the West African trickster god of stories, this app brings together novels from various providers in a unified, user-friendly interface.

### ✨ Key Features

- **Multi-Provider Support**: Access novels from multiple online sources including:
  - AllNovel
  - RanobesNet
  - WuxiaWorldOnline
  - FreeWebNovel
  - MTL Novels
  - And many more!

- **Advanced Reading Experience**:
  - Offline reading with local downloads
  - Text-to-Speech (TTS) support
  - Translation capabilities with Google ML Kit
  - Customizable reading themes and fonts
  - Night mode and AMOLED themes

- **Smart Features**:
  - AI-powered chatbot using OpenAI gpt-4.0 nano
  - Azure Microsoft Cognitive Services Speech integration
  - EPUB generation and export
  - Search across multiple providers
  - Reading history and bookmarks
  - Download management

- **Modern UI/UX**:
  - Material Design 3
  - Multiple color themes
  - Responsive design
  - Smooth navigation

## 🚀 Getting Started

### Prerequisites

- Android Studio Arctic Fox or later
- Android SDK 26+ (Android 8.0)
- JDK 8 or later
- Gradle 8.9.0

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/anansi.git
   cd anansi
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an Existing Project"
   - Navigate to the cloned directory

3. **Sync dependencies**
   ```bash
   ./gradlew sync
   ```

4. **Build the project**
   ```bash
   ./gradlew build
   ```

5. **Run on device/emulator**
   ```bash
   ./gradlew installDebug
   ```

## 🏗️ Project Structure

```
app/
├── src/main/
│   ├── java/com/lagradost/quicknovel/
│   │   ├── providers/          # Novel source providers
│   │   ├── ui/                 # UI components and fragments
│   │   ├── util/              # Utility classes
│   │   ├── MainActivity.kt     # Main activity
│   │   └── BaseApplication.kt  # Application class
│   ├── res/                   # Resources (layouts, strings, etc.)
│   └── AndroidManifest.xml    # App manifest
├── build.gradle              # Module build configuration
└── proguard-rules.pro       # ProGuard configuration
```

## 🔧 Configuration

### API Keys and Services

The app integrates with several external services. You may need to configure:

1. **OpenAI API** (for AI chatbot)
2. **Microsoft Cognitive Services** (for TTS)
3. **Google ML Kit** (for translation)

### Build Variants

- **Debug**: Development build with debugging enabled
- **Release**: Production build with optimizations

## 📱 Features in Detail

### Novel Providers
The app supports multiple novel sources through a provider system:
- **AllNovelProvider**: Access to AllNovel.net
- **RanobesProvider**: Ranobes.net integration
- **WattpadProvider**: Wattpad stories
- **MtlNovelsProvider**: Machine translated novels
- And 15+ more providers

### Reading Features
- **Text Customization**: Font selection, size adjustment, line spacing
- **Theme Options**: Light, dark, AMOLED, and custom color themes
- **Translation**: Real-time translation with multiple backends
- **Audio**: Text-to-Speech with natural voices
- **Downloads**: Offline reading with EPUB export

### Smart Search
- Cross-provider search functionality
- Advanced filtering by genre, status, and rating
- Search history and suggestions

## 🛠️ Technologies Used

- **Language**: Kotlin 1.9.23
- **UI Framework**: Android Jetpack (Navigation, LiveData, ViewModel)
- **Networking**: OkHttp, NiceHttp
- **JSON Parsing**: Jackson
- **Image Loading**: Glide
- **HTML Parsing**: JSoup
- **Machine Learning**: Google ML Kit
- **Speech**: Microsoft Cognitive Services
- **AI**: OpenAI API
- **File Handling**: SafeFile library
- **EPUB**: epub4j-core

## 🎨 Themes and Customization

Anansi offers extensive customization options:

### Available Themes
- **Dark Themes**: Black, Amoled, AmoledLight
- **Light Themes**: Light, Monet (Android 12+)
- **Color Variants**: Normal, CarnationPink, DarkGreen, Maroon, NavyBlue, Grey, White, Brown, Purple, Green, GreenApple, Red, Banana, Party, Pink

### Font Support
- System fonts
- Custom font loading
- Font size and line spacing adjustment

## 🌐 Localization

The app supports multiple languages:
- English (default)
- Turkish (Türkçe)
- And growing...


### How to Contribute
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Adding New Providers
To add support for a new novel source:
1. Create a new provider class extending `MainAPI`
2. Implement required methods for searching and loading content
3. Add appropriate tags and metadata
4. Test thoroughly


## 🙏 Acknowledgments

- **JSoup** for HTML parsing
- **OkHttp** for networking
- **Glide** for image loading
- **Google ML Kit** for translation capabilities
- **Microsoft Cognitive Services** for speech synthesis
- **OpenAI** for AI-powered features
- All the novel provider websites for content access



## 📊 Stats

- **Minimum SDK**: 26 (Android 8.0)
- **Target SDK**: 35 (Android 15)
- **Supported Providers**: 15+
- **Languages**: Multiple
- **Themes**: 15+ color variants

---

<div align="center">
  Made with ❤️ for novel enthusiasts
</div>
