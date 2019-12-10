package com.example.friends.mainactivty

import com.example.friends.base.BaseContract

interface MainScreenContract {

    interface MainView : BaseContract.View {

        fun showMessageIsAccountCreated(isCreate:Boolean)

        fun showMessageIsVerifyAccount(isVerify:Boolean)

        fun showVerificationDialog()

        fun showMessageisSignIn(isVerify:Boolean)

        fun openMapActivity()
    }

    interface MainPresenter : BaseContract.Presenter<MainView> {

        fun checkVerificationCode(verificationCode:String)

        fun createAccount(phoneNumber:String)

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
    }

}
