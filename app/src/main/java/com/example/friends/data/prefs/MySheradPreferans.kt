package com.example.friends.data.prefs

import android.content.SharedPreferences
import android.util.Log

class MySheradPreferans(val sPref: SharedPreferences){

    fun saveAnyUser(boolean: Boolean){
        val ed = sPref.edit()
        ed.putBoolean("user",boolean)
        ed.commit()
        Log.i("vvv","save any user")
    }
    fun isSaveAnyUser():Boolean{
        Log.i("vvv","get any user")
        return sPref.getBoolean("user", false)}


}
