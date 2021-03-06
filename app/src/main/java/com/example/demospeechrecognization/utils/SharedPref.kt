package com.example.demospeechrecognization.utils

import android.content.Context
import android.content.SharedPreferences

class SharedPref(val context: Context) {

    val SESSION="SESSION"

    val pref: SharedPreferences =context.getSharedPreferences("MAIN",Context.MODE_PRIVATE)

    fun getString(key:String):String{
        return pref.getString(key,"")?:""
    }

    fun setString(key: String,value:String){
        pref.edit().putString(key,value).apply()
    }

    var state: Boolean
        get() = pref.getBoolean("THEME_MODE", true)
        set(bVal) {
            val editor = pref.edit()
            editor.putBoolean("THEME_MODE", bVal)
            editor.apply()
        }


}