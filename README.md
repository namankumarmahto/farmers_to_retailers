# Khet Se Bazaar — Farmers to Retailers

**Khet Se Bazaar** is an Android application prototype for connecting farmers with buyers of agricultural produce. It presents separate farmer and buyer journeys, with screens for browsing produce, viewing a farmer's listing, and accessing chats.

The app is built with Java and XML layouts using Android Studio and Gradle.

## What you can explore

- A welcome screen and language selection screen.
- A role selection screen for **Farmers** and **Buyers** (the current flow is available in English).
- A farmer home screen with service tiles.
- A farmer produce catalogue and a sample pumpkin listing with quantity, freshness, description, and example bids.
- A buyer home screen with sample produce categories and listings.
- A chats screen reachable from the farmer home screen.

> **Prototype status:** The repository currently contains mostly sample UI and navigation. Listings and prices are displayed in layouts; the project does not currently implement a complete marketplace backend, live chat, order processing, payments, or working buyer-to-farmer transactions. Some tiles are visual only. The Hindi option and other displayed language choices are not connected to a translated app flow yet.

## Requirements

- Android Studio with Android SDK support for **API 34**.
- JDK 8 or newer supported by your installed Android Gradle Plugin/Android Studio (the app source targets Java 8).
- An Android device or emulator running **Android 7.0 (API 24)** or newer.
- Internet access for the first Gradle sync to download dependencies.

The project uses Gradle Wrapper 8.7 and Android Gradle Plugin 8.6.0. No separate Gradle installation is needed.

## Run the app

1. Clone the repository:

   ```bash
   git clone https://github.com/namankumarmahto/farmers_to_retailers.git
   cd farmers_to_retailers
   ```

2. Open the project folder in Android Studio. Wait for Gradle sync to finish. If prompted, install the Android SDK platform/build tools required by the project (compile SDK 34).

3. Start an Android emulator (API 24 or later) or connect an Android device with USB debugging enabled.

4. In Android Studio, choose the **app** run configuration and click **Run**.

   From a terminal, you can also build and install the debug app:

   ```bash
   # macOS / Linux
   ./gradlew assembleDebug
   ./gradlew installDebug
   ```

   ```bat
   rem Windows
   gradlew.bat assembleDebug
   gradlew.bat installDebug
   ```

   The debug APK is written to `app/build/outputs/apk/debug/app-debug.apk`.

## Use the app

1. Tap **Get Started** on the welcome screen.
2. Select **English** on the language screen. Other language names are shown, but they are not wired to the app flow.
3. Choose **Farmers** or **Buyers**.
4. As a farmer, open **Vegetables** to browse the sample produce catalogue, then tap the pumpkin listing to see its details and sample bids. Open **Chats** to view the chat screen.
5. As a buyer, browse the sample categories and produce shown on the buyer home screen.

The screens use example content. Actions such as placing an order, submitting a bid, making a payment, or sending a live message are not implemented end-to-end.

## Firebase configuration

The Android app applies the Google Services Gradle plugin, includes Firebase Authentication as a dependency, and contains an `app/google-services.json` configuration file. If you use your own Firebase project, register an Android app with package name `com.farmers_to_retailers`, enable the Firebase services your implementation needs, and replace `app/google-services.json` with the configuration file from your Firebase project.

Firebase setup alone does not add authentication flows: the current screens do not implement sign-in or registration.

## Project structure

```text
.
├── app/
│   ├── google-services.json
│   └── src/main/
│       ├── java/com/farmers_to_retailers/   # Activities and navigation
│       ├── res/layout/                      # Screen layouts
│       └── res/drawable/                    # Images and UI assets
├── gradle/
│   └── wrapper/                             # Gradle Wrapper configuration
├── build.gradle.kts
└── settings.gradle.kts
```

## Contributing

1. Fork the repository and create a branch for your change.
2. Make the change and build the app with `./gradlew assembleDebug` (or `gradlew.bat assembleDebug` on Windows).
3. Open a pull request with a short description and screenshots for UI changes.

## License

No license is currently specified in this repository. Contact the repository owner before reusing or redistributing the project.
