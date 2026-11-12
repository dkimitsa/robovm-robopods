---
name: alt-pods-smoke-tests
description: Guidelines and step-by-step procedures for creating, configuring, validating, and running iOS simulator smoke tests in the alt-pods-tests suite.
---

# RoboPods Smoke Test Suite (`alt-pods-tests`)

Use this skill whenever an agent needs to add, configure, diagnose, or execute smoke tests for RoboVM framework bindings in `alt-pods-tests` (`/Users/ihorus/dkimitsa/alt-pods-tests`).

---

## 1. Architecture & Dual-Mode Pattern

`alt-pods-tests` is a dual-purpose test and demonstration repository:
1. **Interactive Demo Mode (Default)**:
   - When launched normally (`./gradlew :<module>:launchIPhoneSimulator`), the app presents interactive UI with `MyViewController`, buttons, labels, and visual flows.
   - `didFinishLaunching` must retain its full UI setup code without truncation or alteration.
2. **Headless Smoke Test Mode (`--test`)**:
   - Triggered when passed `--args="--test"` from the command line.
   - `main(args)` detects `--test` (or sets a headless flag) and routes to a dedicated static `test()` method.
   - `test()` executes the framework binding API headlessly, verifies runtime binding instantiation, outputs the standard success marker `[SMOKE-TEST] SUCCESS: <Target>`, and calls `System.exit(0)`.
   - If an error occurs, it prints the stack trace, outputs `[SMOKE-TEST] FAILED: ...`, and calls `System.exit(1)`.

### Standard `Main.java` Template
```java
package io.github.dkimitsa.tests;

import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.*;

public class Main extends UIApplicationDelegateAdapter {
    private UIWindow window;
    private MyViewController rootViewController;

    @Override
    public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) {
        rootViewController = new MyViewController();
        window = new UIWindow(UIScreen.getMainScreen().getBounds());
        window.setRootViewController(rootViewController);
        window.makeKeyAndVisible();
        return true;
    }

    private static void test() {
        try (NSAutoreleasePool pool = new NSAutoreleasePool()) {
            System.out.println("[SMOKE-TEST] Running Demo<Module> in headless test mode...");
            Demo<Module>.demo();
            System.out.println("[SMOKE-TEST] SUCCESS: Demo<Module>");
            System.exit(0);
        } catch (Throwable t) {
            System.err.println("[SMOKE-TEST] FAILED: Demo<Module>");
            t.printStackTrace(System.err);
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        if (args.length > 0 && "--test".equals(args[0])) {
            test();
            return;
        }

        try (NSAutoreleasePool pool = new NSAutoreleasePool()) {
            UIApplication.main(args, null, Main.class);
        }
    }
}
```

---

## 2. Native Framework Version Validation (`validateFrameworks`)

To guarantee tests never link against missing, outdated, or mismatched native frameworks in `robovm-robopods/.robopods-wip/`:
1. **`.version-metadata` in `.robopods-wip/`**:
   - Every staged framework bundle or folder in `robovm-robopods/.robopods-wip/<framework>` MUST contain a single-line `.version-metadata` file with the exact upstream version (e.g. `13.7.0`).
2. **Reusing Version Properties from `versions.gradle`**:
   - `versions.gradle` defines binding versions: `podAppLovinVersion = '13.7.0.0'`.
   - In `build.gradle`, the `validateFrameworks` task uses `stripPatch` to drop the trailing build revision:
     ```groovy
     def stripPatch = { String v -> v ? v.replaceFirst('\\.[0-9]+$', '') : v }
     ```
   - Register new frameworks in the `frameworkVersions` map in `build.gradle`:
     ```groovy
     'AppLovinSDK.xcframework': stripPatch(podAppLovinVersion),
     ```
3. **Decoupled Pre-flight**:
   - Framework validation is decoupled from standard Gradle tasks (no automatic `dependsOn` injection).
   - Upfront pre-flight is triggered by `./gradlew validateFrameworks` or runs automatically as the first step in `run-smoke-tests.sh`.

---

## 3. Module Configuration Rules

When creating a new test module `<module>` in `alt-pods-tests`:

### A. Directory Layout
```text
alt-pods-tests/<module>/
├── .gitignore
├── build.gradle
├── Info.plist.xml
├── robovm.properties
├── robovm.xml
└── src/main/java/io/github/dkimitsa/tests/
    ├── Demo<Module>.java
    ├── Main.java
    └── MyViewController.java
```

### B. Module `.gitignore` (MANDATORY)
Every module directory MUST include a `.gitignore` to prevent compiler and linker artifacts from cluttering the working tree:
```gitignore
# Compiled class file
*.class

# Log file
*.log

# Package Files #
*.jar
*.war
*.nar
*.ear
*.zip
*.tar.gz
*.rar

# virtual machine crash logs
hs_err_pid*

# gradle
.gradle/
gradle/
gradlew
gradlew.bat

# idea
.idea/
*.iml

# build folders
build/
robovm-build/
```

### C. `build.gradle`
```groovy
buildscript {
    apply from: '../versions.gradle'
    repositories {
        mavenLocal()
        mavenCentral()
        maven { url 'https://central.sonatype.com/repository/maven-snapshots/' }
    }
    dependencies {
        classpath "com.mobidevelop.robovm:robovm-gradle-plugin:${roboVMVersion}"
    }
}

apply plugin: 'java'
apply plugin: 'robovm'

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenLocal()
    mavenCentral()
    maven { url 'https://central.sonatype.com/repository/maven-snapshots/' }
}

dependencies {
    implementation "com.mobidevelop.robovm:robovm-rt:${roboVMVersion}"
    implementation "com.mobidevelop.robovm:robovm-cocoatouch:${roboVMVersion}"
    implementation "io.github.dkimitsa.robovm:robopods-<pod>-ios:$<versionProperty>"
}
```
*(If the framework binding transitively uses types from another robopod, e.g. Tenjin referencing GADAdValue, declare that robopod dependency as well).*

### D. `robovm.xml`
```xml
<config>
    <executableName>${app.executable}</executableName>
    <mainClass>${app.mainclass}</mainClass>
    <os>ios</os>    
    <target>ios</target>
    <iosInfoPList>Info.plist.xml</iosInfoPList>
    <resources>
        <resource>
            <directory>../resources-common</directory>
        </resource>
    </resources>

    <frameworkPaths>
        <path>../../robovm-robopods/.robopods-wip</path>
    </frameworkPaths>
</config>
```
> [!IMPORTANT]
> **Do NOT include `-ld_classic`:** The `-ld_classic` linker flag was an obsolete Xcode 15 workaround and is unsupported in modern Xcode linker toolchains (`ld-27106.1+`), causing warnings or errors. Do NOT add `<tools><linker><flags><flag>-ld_classic</flag></flags></linker></tools>`.

### E. `robovm.properties`
```properties
app.version=1.0
app.id=io.github.dkimitsa.tests.<module>
app.mainclass=io.github.dkimitsa.tests.Main
app.executable=Main
app.build=1
app.name=<module>
```

---

## 4. Step-by-Step Procedure for Introducing a New Framework Test

1. **Verify Native Staging in `robovm-robopods/.robopods-wip/`**:
   - Ensure the `.xcframework` or framework bundle is flattened directly under `.robopods-wip/<Framework>.xcframework` (avoid deep nested repository subfolders).
   - Ensure `.version-metadata` exists containing the version string (e.g. `echo "1.2.3" > .robopods-wip/<Framework>.xcframework/.version-metadata`).
2. **Verify Binding Installed to Maven Local**:
   - Check `~/.m2/repository/io/github/dkimitsa/robovm/robopods-<framework>-ios/`.
   - If missing, compile and install via `mvn install` in `robovm-robopods/<module>`.
3. **Declare Version in `alt-pods-tests/versions.gradle`**:
   - Add `pod<Name>Version = 'X.Y.Z.0'`.
4. **Register Validation Mapping in `alt-pods-tests/build.gradle`**:
   - Add `<Location>: stripPatch(pod<Name>Version)` inside `validateFrameworks`.
5. **Register Module in `alt-pods-tests/settings.gradle`**:
   - Add `include ':<module>'`.
6. **Create Module Configuration and Code**:
   - Create `.gitignore`, `build.gradle`, `robovm.properties`, `Info.plist.xml`, and `robovm.xml`.
   - Implement `Demo<Module>.java`, `MyViewController.java`, and Dual-Mode `Main.java`.
7. **Run Pre-flight Framework Validation**:
   ```bash
   cd /Users/ihorus/dkimitsa/alt-pods-tests && ./gradlew validateFrameworks
   ```
8. **Verify Headless Execution in Simulator**:
   ```bash
   cd /Users/ihorus/dkimitsa/alt-pods-tests && ./gradlew :<module>:launchIPhoneSimulator --args="--test"
   ```
   Confirm output contains:
   `[SMOKE-TEST] SUCCESS: Demo<Module>` and `BUILD SUCCESSFUL`.
9. **Register in `alt-pods-tests/run-smoke-tests.sh`**:
   - Add `"<module>"` to `DEFAULT_MODULES`.
10. **Run Full Smoke Suite**:
    ```bash
    cd /Users/ihorus/dkimitsa/alt-pods-tests && ./run-smoke-tests.sh
    ```
    Confirm 100% pass rate in the final summary table.

---

## 5. Troubleshooting & Common Pitfalls

- **Linker Failure (`ld: framework '<Name>' not found`)**:
  Check `src/main/robopods/META-INF/robovm/ios/robovm.xml` in the robopod module. Upstream framework name might have changed (e.g., `Branch` -> `BranchSDK`). Reinstall the jar to `~/.m2` after fixing.
- **Simulator Dynamic Linker Crash (`dyld: Library not loaded`)**:
  The native framework is dynamic and depends on sibling frameworks (e.g. `OneSignalFramework` depending on `OneSignalLiveActivities`). All dynamic dependencies MUST be listed under `<frameworks>` in the pod's `robovm.xml` so RoboVM copies and signs them in `Main.app/Frameworks/`.
- **Missing Symbol / Bridge Marshaler Error**:
  The framework binding uses types from another RoboPod (e.g., `GADAdValue`). Add that pod to `build.gradle` and its framework path to `robovm.xml`.
- **Git Working Tree Dirty with Build Artifacts**:
  Ensure module-level `.gitignore` and root `.gitignore` include `build/` and `robovm-build/`. Never commit `.o`, `.dylib`, or `robovm.tmp` artifacts.
