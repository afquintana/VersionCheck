package com.afquintana.demo;

import android.os.Bundle;
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.afquintana.versioncheck.VersionCheck

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            setComposable()
        }
    }
}

@Composable
fun setComposable() {

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        if (VersionCheck.isBaklavaOrHigher) {
            Text("API level 36, Android 16")
        } else if (VersionCheck.isVanillaIceCreamOrHigher) {
            Text("API level 35, Android 15")
        } else if (VersionCheck.isUpsideDownCakeOrHigher) {
            Text("API level 34, Android 14")
        } else if (VersionCheck.isTiramisuOrHigher) {
            Text("API level 33, Android 13")
        } else if (VersionCheck.isSv2OrHigher) {
            Text("API level 32, Android 12 L")
        } else if (VersionCheck.isSOrHigher) {
            Text("API level 31, Android 12")
        } else if (VersionCheck.isROrHigher) {
            Text("API level 30, Android 11")
        } else if (VersionCheck.isQOrHigher) {
            Text("API level 29, Android 10")
        } else if (VersionCheck.isPieOrHigher) {
            Text("API level 28, Android 9")
        } else if (VersionCheck.isOreoMR1OrHigher) {
            Text("API level 27, Android 8.1")
        } else if (VersionCheck.isOreoOrHigher) {
            Text("API level 26, Android 8.0")
        } else if (VersionCheck.isNougatMR1OrHigher) {
            Text("API level 25, Android 7.1")
        } else if (VersionCheck.isNougatOrHigher) {
            Text("API level 24, Android 7.0")
        } else if (VersionCheck.isMarshmallowOrHigher) {
            Text("API level 23, Android 6.0")
        } else if (VersionCheck.isLollipopMR1OrHigher) {
            Text("API level 22, Android 5.1")
        } else if (VersionCheck.isLollipopOrHigher) {
            Text("API level 21, Android 5.0")
        } else if (VersionCheck.isKitKatWatchOrHigher) {
            Text("API level 20, Android 4.4")
        } else if (VersionCheck.isKitKatOrHigher) {
            Text("API level 19, Android 4.4")
        } else if (VersionCheck.isJellyBeanMR2OrHigher) {
            Text("API level 18, Android 4.3")
        } else if (VersionCheck.isJellyBeanMR1OrHigher) {
            Text("API level 17, Android 4.2")
        } else if (VersionCheck.isJellyBeanOrHigher) {
            Text("API level 16, Android 4.1")
        } else if (VersionCheck.isIceCreamSandwichMR1OrHigher) {
            Text("API level 15, Android 4.0.3–4.0.4")
        } else if (VersionCheck.isIceCreamSandwichOrHigher) {
            Text("API level 14, Android 4.0")
        } else if (VersionCheck.isHoneyCombMR2OrHigher) {
            Text("API level 13, Android 3.2")
        } else if (VersionCheck.isHoneyCombMR1OrHigher) {
            Text("API level 12, Android 3.1")
        } else if (VersionCheck.isHoneyCombOrHigher) {
            Text("API level 11, Android 3.0")
        } else if (VersionCheck.isGingerBreadMR1OrHigher) {
            Text("API level 10, Android 2.3.3–2.3.7")
        } else if (VersionCheck.isGingerBreadOrHigher) {
            Text("API level 9, Android 2.3")
        } else if (VersionCheck.isFloyoOrHigher) {
            Text("API level 8, Android 2.1")
        } else if (VersionCheck.isEclairMR1OrHigher) {
            Text("API level 7, Android 2.1")
        } else if (VersionCheck.isEclair_0_1OrHigher) {
            Text("API level 6, Android 2.0.1")
        } else if (VersionCheck.isEclairOrHigher) {
            Text("API level 5, Android 2.0")
        } else if (VersionCheck.isDonutOrHigher) {
            Text("API level 4, Android 1.6")
        } else if (VersionCheck.isCupCakeOrHigher) {
            Text("API level 3, Android 1.5")
        } else if (VersionCheck.isBase1_1OrHigher) {
            Text("API level 2, Android 1.1")
        } else if (VersionCheck.isBaseOrHigher) {
            Text("API level 1, Android 1.0")
        }
    }
}