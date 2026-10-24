package com.andrerinas.openheadunit.gwm

import android.content.Context
import android.content.SharedPreferences

/**
 * GWM/Haval preferences, kept in their own file so nothing here can change BYD behaviour.
 * Ported from DiPlay's GWM keys (jollyboy95/d-play-gwm-h7 @ 1460810, AirPlayPersistence).
 *
 * The cluster map itself is still declared to the phone through DiAuto's own
 * [com.andrerinas.openheadunit.utils.Settings.clusterMapEnabled]; [clusterEnabled] only routes it
 * to the GWM display instead of a BYD one.
 */
internal class GwmSettings(context: Context) {
    private val prefs: SharedPreferences =
        context.applicationContext.getSharedPreferences(PREFS, Context.MODE_PRIVATE)

    /** Treat this head unit as GWM even when the build identity names no GWM, Haval or B11. */
    var forced: Boolean
        get() = prefs.getBoolean("forced", false)
        set(value) = prefs.edit().putBoolean("forced", value).apply()

    /** Show Android Auto's cluster map on [clusterDisplayId]. Applies on the next connection. */
    var clusterEnabled: Boolean
        get() = prefs.getBoolean("cluster-enabled", false)
        set(value) = prefs.edit().putBoolean("cluster-enabled", value).apply()

    /** Logical display of the instrument cluster: 2 on the 2026 H7 Vanta (B11). */
    var clusterDisplayId: Int
        get() = prefs.getInt("cluster-display-id", DEFAULT_CLUSTER_DISPLAY_ID)
        set(value) = prefs.edit().putInt("cluster-display-id", value).apply()

    /** The map-first layer: navigation card, music card and the bottom instrument strip. */
    var styledLayer: Boolean
        get() = prefs.getBoolean("styled-layer", true)
        set(value) = prefs.edit().putBoolean("styled-layer", value).apply()

    var navCard: Boolean
        get() = prefs.getBoolean("nav-card", true)
        set(value) = prefs.edit().putBoolean("nav-card", value).apply()

    var musicCard: Boolean
        get() = prefs.getBoolean("music-card", true)
        set(value) = prefs.edit().putBoolean("music-card", value).apply()

    var vehicleStrip: Boolean
        get() = prefs.getBoolean("vehicle-strip", true)
        set(value) = prefs.edit().putBoolean("vehicle-strip", value).apply()

    /** Turn arrow, distance and arrival time in the head-up display's arrow area. */
    var hudEnabled: Boolean
        get() = prefs.getBoolean("hud-enabled", false)
        set(value) = prefs.edit().putBoolean("hud-enabled", value).apply()

    /** Logical display of the head-up display's arrow area: 3 on the H7 the owner uses. */
    var hudDisplayId: Int
        get() = prefs.getInt("hud-display-id", DEFAULT_HUD_DISPLAY_ID)
        set(value) = prefs.edit().putInt("hud-display-id", value).apply()

    var hudAnchor: Int
        get() = prefs.getInt("hud-anchor", 1)
        set(value) = prefs.edit().putInt("hud-anchor", value).apply()

    companion object {
        const val PREFS = "gwm_h7"
        const val DEFAULT_CLUSTER_DISPLAY_ID = 2
        const val DEFAULT_HUD_DISPLAY_ID = 3
    }
}
