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

        fun getUserPhoneNumber():String

        fun openLoadingDialog()

        fun closeLoadingDialog()
    }

    interface MainPresenter : BaseContract.Presenter<MainView> {

        fun checkVerificationCode(verificationCode:String)

        fun createAccount(user: User)

    }

    interface MainModel : BaseContract.Model{

        interface OnFinishedListener {

            fun onFinished(message:String)

            fun onProgress()

            fun onFailure(t: Throwable)

        }

        fun checkVerificationCode(verificationCode:String,onFinishedListener: OnFinishedListener)

        fun createAccount(user: User,onFinishedListener: OnFinishedListener)

        fun saveUserId(accountId: String)

        fun getUserId():String


    }

}
