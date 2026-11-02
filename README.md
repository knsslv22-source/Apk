# LifeOS — Android prototype

## Included
- Daily timeline with automatically calculated prayer times from device coordinates using the offline Adhan astronomy library.
- Runtime location permission; latest coordinates are stored locally for calculation when location is temporarily unavailable.
- Calculation method selection: Muslim World League (default), Karachi, Turkey, Egypt, Umm al-Qura.
- Asr madhab selection: Hanafi or Shafi/Maliki/Hanbali.
- Eisenhower matrix with four quadrants and filters for all tasks, work/projects, and personal life.
- Task creation with sphere, importance, urgency and day slot; task data is stored locally.
- Finance screen with Goods / Services / Other expense types and separate income records.
- Unified dark-green visual style.

## Prayer-time notes
Times are calculated offline from latitude/longitude and the device's current timezone. The default is Muslim World League (MWL) with Hanafi Asr and a middle-of-the-night high-latitude rule. Local mosque timetables can use different parameters or safety offsets; compare with your local mosque for religiously significant timing. Location permission is requested by the app; if declined, prayer times remain unavailable rather than showing invented placeholder times.

## Build / install
This repository is Android Studio source code, not an APK. Open the folder in Android Studio, allow Gradle sync, then use **Build > Build Bundle(s) / APK(s) > Build APK(s)**. Android Studio will create the APK under `app/build/outputs/apk/debug/`.

## Build APK without Android Studio (cloud)
The project includes a GitHub Actions workflow at `.github/workflows/build-apk.yml`. Upload the `LifeOS` folder contents to a GitHub repository, open **Actions**, run **Build LifeOS APK**, then download the `LifeOS-debug-APK` artifact from the completed run. GitHub account/repository setup is required. This workflow has not been run in this environment, so the build result remains unverified.
