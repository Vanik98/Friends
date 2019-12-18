package com.example.friends.main

import com.example.friends.data.firebase.MyFirebase
import com.example.friends.data.prefs.MySheradPreferans
import javax.inject.Inject

class MainModel @Inject constructor(
    var firebase: MyFirebase,
    var msPref: MySheradPreferans
): MainContract.MainModel {
    override fun saveAnyUser(boolean: Boolean) {
        msPref.saveAnyUser(boolean)
    }

    override fun isSaveAnyUser() = msPref.isSaveAnyUser()



    override fun createAccount(phoneNumber: String, onFinishedListener: MainContract.MainModel.OnFinishedListener) {
        firebase.sendVerificationCode(phoneNumber,onFinishedListener)
    }


    override fun checkVerificationCode(verificationCode: String, onFinishedListener: MainContract.MainModel.OnFinishedListener) {
        firebase.verifySignInCode(verificationCode,onFinishedListener)
    }

}