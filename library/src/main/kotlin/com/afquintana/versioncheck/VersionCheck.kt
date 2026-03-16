package com.afquintana.versioncheck

import android.annotation.SuppressLint
import android.os.Build
import android.os.Build.VERSION
import androidx.annotation.ChecksSdkIntAtLeast

@Suppress("unused")
object VersionCheck {

    /**
     * API level 35+, Android 15.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.VANILLA_ICE_CREAM)
    @JvmStatic
    val isVanillaIceCreamOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.VANILLA_ICE_CREAM

    /**
     * API level 34+, Android 14.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
    @JvmStatic
    val isUpsideDownCakeOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE

    /**
     * API level 33+, Android 13.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.TIRAMISU)
    @JvmStatic
    val isTiramisuOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU

    /**
     * API level 32+, Android 12 L.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.S_V2)
    @JvmStatic
    val isSv2OrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.S_V2

    /**
     * API level 31+, Android 12.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.S)
    @JvmStatic
    val isSOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.S

    /**
     * API level 30+, Android 11.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.R)
    @JvmStatic
    val isROrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.R

    /**
     * API level 29+, Android 10.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.Q)
    @JvmStatic
    val isQOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.Q

    /**
     * API level 28+, Android 9.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.P)
    @JvmStatic
    val isPieOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.P

    /**
     * API level 27+, Android 8.1.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.O_MR1)
    @JvmStatic
    val isOreoMR1OrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1

    /**
     * API level 26+, Android 8.0.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.O)
    @JvmStatic
    val isOreoOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.O

    /**
     * API level 25+, Android 7.1.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.N_MR1)
    @JvmStatic
    val isNougatMR1OrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1

    /**
     * API level 24+, Android 7.0.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.N)
    @JvmStatic
    val isNougatOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.N

    /**
     * API level 23+, Android 6.0.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.M)
    @JvmStatic
    val isMarshmallowOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.M

    /**
     * API level 22+, Android 5.1.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.LOLLIPOP_MR1)
    @JvmStatic
    val isLollipopMR1OrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1

    /**
     * API level 21+, Android 5.0.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.LOLLIPOP)
    @JvmStatic
    val isLollipopOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP

    /**
     * API level 20+, Android 4.4.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.KITKAT_WATCH)
    @JvmStatic
    val isKitKatWatchOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT_WATCH

    /**
     * API level 19+, Android 4.4.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.KITKAT)
    @JvmStatic
    val isKitKatOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT

    /**
     * API level 18+, Android 4.3.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
    @JvmStatic
    val isJellyBeanMR2OrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2

    /**
     * API level 17+, Android 4.2.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @JvmStatic
    val isJellyBeanMR1OrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1

    /**
     * API level 16+, Android 4.1.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.JELLY_BEAN)
    @JvmStatic
    val isJellyBeanOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN

    /**
     * API level 15+, Android 4.0.3–4.0.4.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
    @JvmStatic
    val isIceCreamSandwichMR1OrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1

    /**
     * API level 14+, Android 4.0.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @JvmStatic
    val isIceCreamSandwichOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH

    /**
     * API level 13+, Android 3.2.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.HONEYCOMB_MR2)
    @JvmStatic
    val isHoneyCombMR2OrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2

    /**
     * API level 12+, Android 3.1.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.HONEYCOMB_MR1)
    @JvmStatic
    val isHoneyCombMR1OrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR1

    /**
     * API level 11+, Android 3.0.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.HONEYCOMB)
    @JvmStatic
    val isHoneyCombOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB

    /**
     * API level 10+, Android 2.3.3–2.3.7.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.GINGERBREAD_MR1)
    @JvmStatic
    val isGingerBreadMR1OrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD_MR1

    /**
     * API level 9+, Android 2.3.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.GINGERBREAD)
    @JvmStatic
    val isGingerBreadOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD

    /**
     * API level 8+, Android 2.1.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.FROYO)
    @JvmStatic
    val isFloyoOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.FROYO

    /**
     * API level 7+, Android 2.1.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.ECLAIR_MR1)
    @JvmStatic
    val isEclairMR1OrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR_MR1

    /**
     * API level 6+, Android 2.0.1.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.ECLAIR_0_1)
    @JvmStatic
    val isEclair_0_1OrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR_0_1

    /**
     * API level 5+, Android 2.0.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.ECLAIR)
    @JvmStatic
    val isEclairOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR

    /**
     * API level 4+, Android 1.6.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.DONUT)
    @JvmStatic
    val isDonutOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.DONUT

    /**
     * API level 3+, Android 1.5.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.CUPCAKE)
    @JvmStatic
    val isCupCakeOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.CUPCAKE

    /**
     * API level 2+, Android 1.1.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.BASE_1_1)
    @JvmStatic
    val isBase1_1OrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.BASE_1_1

    /**
     * API level 1+, Android 1.0.
     */
    @get:ChecksSdkIntAtLeast(api = Build.VERSION_CODES.BASE)
    @JvmStatic
    val isBaseOrHigher: Boolean
        @SuppressLint("ObsoleteSdkInt")
        get() = VERSION.SDK_INT >= Build.VERSION_CODES.BASE

}