# Cucumber framework using appium - BDD

## Appium set up on Windows (Android):

1) Install [Java JDK11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
   and [IDEA Community Edition](https://www.jetbrains.com/idea/download/?fromIDE=&section=windows)
2) Install [NodeJS](https://nodejs.org/en/download)
3) Install [Android studio](https://developer.android.com/studio)
4) Install Appium Server (v2.x) using npm (CLI) command `npm install -g appium`
```
   Appium server version 2.1.1
```
This will install the Appium server only, but no drivers. Install the latest versions of the UiAutomator2 drivers, after installing Appium you would run the following commands:
```
appium driver install uiautomator2
```
```
Command to check the installed appium version: `appium --version`
```

5) Add below Android SDK path in the environment variables

```
    - ANDROID_HOME = <path to Sdk folder>
    - %ANDROID_HOME%\tools
    - %ANDROID_HOME%\tools\bin
    - %ANDROID_HOME%\platform-tools
```

## Creating Android Virtual Device (Emulator) from Android Studio:

1) Open Android Studio.
2) Click on More Actions -> Virtual Device Manager
3) On Device Manager, click on Create Device -> Select the appropriate device in Select Hardware
4) Select a system image with OS version (API level) equal to 29 and android platform "Android 10.0" (Android version and API level can be anything but we have mentioned it to be specific to run the code)
5) Click Next
6) Click on System Image for Android 10.0 and click on Release Name to install the SDK Component
7) Click Finish
8) On System Image page, click on Next
9) Provide the ADV Name to "Pixel 4 API 29" (this name can be anything as per the user choice. We have mentioned it as 'Pixel 4 API 29' as same has been mentioned in the code we've written)
10) Once Virtual device is created, click on Launch this AVD in the emulator.
11) Command to view the list of devices attached from CLI `adb devices`

## Execute the cucumber tests:

1) Start the appium server from CLI using command "appium"
2) Start the Android Emulator as per the above steps using Android Studio
3) Run `RunnerTest` in the
   path `palringo_mobile_automation\src\test\java\runner\RunnerTest.java`
4) Test Reports could be found under the "ExtentReport_YYYYDDMM_HHMMSS" folder.
