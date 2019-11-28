package com.example.friends.mainactivty

import com.example.friends.firebase.MyFirebase
import com.example.friends.savedata.MySheradPreferans
import javax.inject.Inject

class MainModel @Inject constructor(
    var firebase: MyFirebase,
    var msPref: MySheradPreferans
): MainScreenContract.MainModel {
    override fun saveAnyUser(boolean: Boolean) {
        msPref.saveAnyUser(boolean)
    }

    override fun isSaveAnyUser() = msPref.isSaveAnyUser()



    override fun createAccount(phoneNumber: String, onFinishedListener: MainScreenContract.MainModel.OnFinishedListener) {
        firebase.sendVerificationCode(phoneNumber,onFinishedListener)
    }


    override fun checkVerificationCode(verificationCode: String, onFinishedListener: MainScreenContract.MainModel.OnFinishedListener) {
        firebase.verifySignInCode(verificationCode,onFinishedListener)
    }

}