package com.example.friends.main

import com.example.friends.data.firebase.MyFirebase
import com.example.friends.data.model.User
import com.example.friends.data.prefs.MySheradPreferans
import javax.inject.Inject

class MainModel @Inject constructor(
    var firebase: MyFirebase,
    var msPref: MySheradPreferans
): MainContract.MainModel {
    override fun addUserInformation(user: User,onFinishedListener: MainContract.MainModel.OnFinishedListener) {
        firebase.addUserInformation(user,onFinishedListener)
    }

    override fun saveUserPhoneNumber(phoneNumber: String) {
        msPref.saveUser(phoneNumber)
    }

    override fun getUserSavePhoneNumber() = msPref.getUserSavePhoneNumber()



    override fun createAccount(phoneNumber: String, onFinishedListener: MainContract.MainModel.OnFinishedListener) {
        firebase.sendVerificationCode(phoneNumber,onFinishedListener)
    }


    override fun checkVerificationCode(verificationCode: String, onFinishedListener: MainContract.MainModel.OnFinishedListener) {
        firebase.verifySignInCode(verificationCode,onFinishedListener)
    }

}