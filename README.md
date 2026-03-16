# Version Check

Android library to check the current Android version with clear, readable boolean properties.

## Overview

`VersionCheck` provides a simple API based on boolean checks such as `isTiramisuOrHigher`, `isSOrHigher` or `isQOrHigher`, so you can avoid repeating `Build.VERSION.SDK_INT >= ...` across your codebase.

The library is published with:

- **Group:** `com.afquintana`
- **Artifact:** `versioncheck`
- **Repository:** `https://github.com/afquintana/VersionCheck`

## Installation

Make sure `mavenCentral()` is available in your project:

```kotlin
repositories {
    mavenCentral()
}
```

Add the dependency in your app or module:

```kotlin
dependencies {
    implementation("com.afquintana:versioncheck:1.0.5")
}
```

Groovy version:

```groovy
dependencies {
    implementation 'com.afquintana:versioncheck:1.0.5'
}
```

> If you publish a newer version later, replace `1.0.5` with the latest one.

## Usage

Import the object:

```kotlin
import com.afquintana.versioncheck.VersionCheck
```

### Example in an Activity

```kotlin
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.afquintana.versioncheck.VersionCheck

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (VersionCheck.isTiramisuOrHigher) {
            Toast.makeText(this, "Android 13 or higher", Toast.LENGTH_SHORT).show()
        }

        if (VersionCheck.isSOrHigher) {
            // Android 12+
        }

        if (VersionCheck.isQOrHigher) {
            // Android 10+
        }
    }
}
```

### Example in Jetpack Compose

```kotlin
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.afquintana.versioncheck.VersionCheck

@Composable
fun VersionInfo() {
    val text = when {
        VersionCheck.isVanillaIceCreamOrHigher -> "Android 15+"
        VersionCheck.isUpsideDownCakeOrHigher -> "Android 14+"
        VersionCheck.isTiramisuOrHigher -> "Android 13+"
        else -> "Android 12 or lower"
    }

    Text(text = text)
}
```

### Example replacing classic SDK checks

Instead of this:

```kotlin
if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
    // do something
}
```

You can write this:

```kotlin
if (VersionCheck.isTiramisuOrHigher) {
    // do something
}
```

## Available checks

The library exposes boolean properties for Android versions from **Android 1.0** up to **Android 15**, including checks such as:

- `isBaseOrHigher`
- `isCupCakeOrHigher`
- `isDonutOrHigher`
- `isEclairOrHigher`
- `isLollipopOrHigher`
- `isMarshmallowOrHigher`
- `isNougatOrHigher`
- `isOreoOrHigher`
- `isPieOrHigher`
- `isQOrHigher`
- `isROrHigher`
- `isSOrHigher`
- `isSv2OrHigher`
- `isTiramisuOrHigher`
- `isUpsideDownCakeOrHigher`
- `isVanillaIceCreamOrHigher`

## Why use Version Check?

- Improves readability
- Avoids repeating low-level SDK comparisons
- Makes version-gated code cleaner
- Easy to use from Kotlin or Java thanks to `@JvmStatic`

## Example use cases

- Feature gating by Android version
- Runtime behavior changes for newer SDKs
- Cleaner code in Activities, Fragments, ViewModels or Compose UI
- Centralized version checks in shared modules

## License

This project is licensed under the **Apache License 2.0**.

## Author

**Antonio Fco Quintana**

GitHub: `afquintana`
