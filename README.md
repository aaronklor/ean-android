#ean-android

This project contains two components:

- api-lib: An Android library to handle making calls to [Expedia Affiliate Network API] [EAN].
- sample-app: A sample Android app that uses the api-lib to make all of its calls.

##Downloading
The output jars are hosted in [Maven Central][mavencentral]:

    group: com.ean.mobile
    artifact: api-lib

##Building both the Library and the App
It is possible to build the library and the app in a single step using the gradle build at the root of the project.

###Requirements

- [Java JDK (1.7+)] [java]
- [Android Studio][androidstudio] (Recommended) - Great IDE for developing android, and integrates very easily with gradle.

###Steps

1. Download the source code from git: `git clone git@github.com:ExpediaInc/ean-android.git`

2. Open a command line in the cloned directory: `cd ean-android`

3. Now run the gradle task target to build the api-lib and sample-app: `gradlew clean build`
    - The library has now been built and imported into sample-app, and its apk built.

4. The output apk can be found at `sample-app/build/outputs/apk/sample-app-debug-unaligned.apk` and can be installed using the command line function `adb install sample-app/build/outputs/apk/sample-app-debug-unaligned.apk`.
    - Alternatively, the gradle task `installDebug` can do steps 3 and 4 in one step: `gradlew :sample-app:installDebug`

##Building Only The Library

###Requirements

- [Java JDK (1.7+)] [java]

###Steps

1. Download the source code from git: `git clone git@github.com:ExpediaInc/ean-android.git`

2. Open a command line in the cloned directory: `cd ean-android`

3. Run the gradle task install: `gradlew :api-lib:build`

3. The output aar can be found in api-lib/build/outputs/aar/api-lib-{debug|release}.aar

##IDE Setup Tips

Use the appropriate Gradle plugin for your IDE. For Intellij, this is known as JetGradle. For Eclipse, it is Eclipse-Integration-Gradle. Android Studio comes with the gradle plugin built-in.

###api-lib
- Add .json as a resource file type. This will allow certain IDEs (Intellij, at least) to include the .json resources in the classpath for the tests that need them.


## More Help

More assistance can be found on our [wiki for this project] [git-project-wiki] and our [developer hub] [dev-hub].

For a step by step overview of the library and sample app, as well as a guided tutorial on creating an Android app using the library, visit the [docs] directory of the project.

[EAN]: http://www.expediaaffiliate.com/ "Expedia Affiliate Network"
[dev-hub]: http://developer.ean.com "EAN Developer Hub"
[git-project]: http://ExpediaInc/ean-android/ean-android.git "ean-android project"
[git-project-wiki]: https://github.com/ExpediaInc/ean-android/wiki "ean-android project wiki"
[java]: http://www.oracle.com/technetwork/java/javase/downloads/index.html "Java"
[android-sdk]: http://developer.android.com/sdk/index.html "Android SDK"
[docs]: https://github.com/ExpediaInc/ean-android/tree/master/docs "ean-android/docs"
[mavencentral]: http://search.maven.org/#search%7Cga%7C1%7Ca%3A%22api-lib%22 "api-lib at search.maven.org."
[androidstudio]: https://developer.android.com/sdk/index.html "Android Studio"
