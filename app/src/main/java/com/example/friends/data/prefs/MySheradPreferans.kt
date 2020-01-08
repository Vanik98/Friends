package com.example.friends.data.prefs

import android.content.SharedPreferences
import android.util.Log

class MySheradPreferans(val sPref: SharedPreferences){

    fun saveUser(phoneNumber:String){
        val ed = sPref.edit()
        ed.putString("phoneNumber",phoneNumber)
        ed.commit()
        Log.i("vvv","save any user")
    }
    fun getUserSavePhoneNumber():String{
        Log.i("vvv","get any user")
        return sPref.getString("phoneNumber", "")!!
    }
}
