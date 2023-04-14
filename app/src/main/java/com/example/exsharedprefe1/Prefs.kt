package com.example.exsharedprefe1

import android.content.Context
import android.content.SharedPreferences

class Prefs(context: Context) {

    private val PREF_TEXT_TEST = "PrefTest"

    private val preferences: SharedPreferences = context.getSharedPreferences(PREF_TEXT_TEST,Context.MODE_PRIVATE)

    var ExamplePrefString: String?
        get() = preferences.getString(PREF_TEXT_TEST, "")
        set(value) = preferences.edit().putString(PREF_TEXT_TEST, value).apply()

}