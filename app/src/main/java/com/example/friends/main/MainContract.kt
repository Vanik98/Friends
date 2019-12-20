package com.example.friends.main

import com.example.friends.base.BaseContract
import com.example.friends.data.model.User

interface MainContract {

    interface MainView : BaseContract.View {

        fun showMessageIsAccountCreated(isCreate:Boolean)

        fun showMessageIsVerifyAccount(isVerify:Boolean)

        fun showVerificationDialog()

        fun showMessageIsSignIn(isVerify:Boolean)

        fun openMapActivity(accountId:String)
    }

    interface MainPresenter : BaseContract.Presenter<MainView> {

        fun checkVerificationCode(verificationCode:String)

        fun createAccount(phoneNumber:String)

        fun addUserInformation(user: User)

    }

    interface MainModel : BaseContract.Model{

        interface OnFinishedListener {

            fun onFinished(message:String)

            fun onFailure(t: Throwable)

        }

        fun checkVerificationCode(verificationCode:String,onFinishedListener: OnFinishedListener)

        fun createAccount(phoneNumber:String,onFinishedListener: OnFinishedListener)

        fun saveAnyUser(boolean: Boolean)

        fun isSaveAnyUser():Boolean

        fun addUserInformation(user: User)
    }

}
