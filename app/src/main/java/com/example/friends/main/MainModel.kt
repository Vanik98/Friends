package com.example.friends.main

import com.example.friends.data.firebase.MyFirebase
import com.example.friends.data.model.User
import com.example.friends.data.prefs.MySheradPreferans
import javax.inject.Inject

class MainModel @Inject constructor(
    var firebase: MyFirebase,
    var msPref: MySheradPreferans
): MainContract.MainModel {

    override fun saveUserId(accountId: String) {
        msPref.saveUserId(accountId)
    }

    override fun getUserId() = msPref.getUserId()

    override fun createAccount(user: User, onFinishedListener: MainContract.MainModel.OnFinishedListener) {
        firebase.sendVerificationCode(user,onFinishedListener)
    }

    override fun checkVerificationCode(verificationCode: String, onFinishedListener: MainContract.MainModel.OnFinishedListener) {
        firebase.verifySignInCode(verificationCode,onFinishedListener)
    }

}