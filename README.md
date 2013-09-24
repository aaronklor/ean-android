#ean-android

This project contains two components:

- api-lib: An Android optimized java library to handle making calls to [Expedia Affiliate Network API] [EAN].
- sample-app: A sample Android app that uses the api-lib to make all of its calls.

##Downloading
The output jars are hosted in [Maven Central][mavencentral]:

    group: com.ean.mobile
    artifact: api-lib

##Building both the Library and the App
It is possible to build the library and the app in a single step using the gradle build at the root of the project.

###Requirements

- [Java JDK (1.6+)] [java]
- [Android SDK] [android-sdk] needs to be installed and both the tools and platform-tools directories are assumed to be on the path. Additionally you'll need to have at least Android version 14 setup (4.0 Ice Cream Sandwich).

###Steps

1. Download the source code from git: `git clone git@github.com:ExpediaInc/ean-android.git`

2. Open a command line in the cloned directory: `cd ean-android`

3. Now run the gradle task target to build the api-lib and sample-app: `gradlew :sample-app:assembleDebug`
    - The library has now been built and imported into sample-app, and its apk built.

4. The output apk can be found at `sample-app/build/apk/sample-app-debug-unaligned.apk` and can be installed using the command line function `adb install sample-app/build/apk/sample-app-debug-unaligned.apk`.
    - Alternatively, the gradle task `installDebug` can do steps 3 and 4 in one step: `gradlew :sample-app:installDebug`

##Building Only The Library

###Requirements

- [Java JDK (1.6+)] [java]

###Steps

1. Download the source code from git: `git clone git@github.com:ExpediaInc/ean-android.git`

2. Open a command line in the cloned directory: `cd ean-android`

3. Run the gradle task install: `gradlew :api-lib:install`

3. You should now have built the api-lib and published it to the local maven repository in: `~/.m2/`

4. The main, javadoc, and source jars can now be found in `api-lib/build/libs/`.

####Without Publishing

To build without installing to the local repo, just run the assemble task: `gradlew :api-lib:assemble`.

##IDE Setup Tips

Use the appropriate Gradle plugin for your IDE. For Intellij, this is known as JetGradle. For Eclipse, it is Eclipse-Integration-Gradle. Android Studio comes with the gradle plugin built-in.

###api-lib
- Add .json as a resource file type. This will allow certain IDEs (Intellij, at least) to include the .json resources in the classpath for the tests that need them.

###sample-app


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
