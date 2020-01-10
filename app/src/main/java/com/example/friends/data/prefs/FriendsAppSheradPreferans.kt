package com.example.friends.data.prefs

import android.content.LocusId
import android.content.SharedPreferences
import android.util.Log

class FriendsAppSheradPreferans(val sPref: SharedPreferences){

    fun saveUserId(accountId: String){
        val ed = sPref.edit()
        ed.putString("accountId",accountId)
        ed.commit()
        Log.i("vvv","save any user")
    }
    fun getUserId():String{
        Log.i("vvv","get accountId")
        return sPref.getString("accountId", "")!!
    }
}
