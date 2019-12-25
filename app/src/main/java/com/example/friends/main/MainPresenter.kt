package com.example.friends.main

import android.util.Log
import com.example.friends.data.model.User
import javax.inject.Inject

class MainPresenter @Inject constructor(
    var mainModel: MainContract.MainModel
) : MainContract.MainPresenter {

    private lateinit var view: MainContract.MainView

    override fun createAccount(phoneNumber: String) {
        mainModel.createAccount(phoneNumber,
            object:MainContract.MainModel.OnFinishedListener{
                override fun onFinished(message: String) {
                    mainModel.saveAnyUser(true)
                    view.showVerificationDialog()
                    accountCreatedMessage(true)
//                    Log.i("vvv",message)
//                    if (message == "created")
//                    {
////                        view.openMapActivity("")
//                    }else {
//                       //: onFinished taki main modely petqa jnjel,u bacel stex
////                        mainModel.saveAnyUser(true)
//                        view.showVerificationDialog()
//                        accountCreatedMessage(true)
//                    }
                }

                override fun onProgress() {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onFailure(t: Throwable) {
                    accountCreatedMessage(false)
                }
            })
    }

    private fun addUserInformation() {
        val user : User = view.takeUserInformation()
        mainModel.addUserInformation(user,object : MainContract.MainModel.OnFinishedListener{
            override fun onFinished(message: String) {
                verificationMessage(true)
            }

            override fun onProgress() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onFailure(t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })

    }

    override fun checkVerificationCode(verificationCode: String){
        mainModel.checkVerificationCode(verificationCode,object :MainContract.MainModel.OnFinishedListener{
            override fun onFinished(message: String) {
                addUserInformation()
            }

            override fun onProgress() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onFailure(t: Throwable) {
                verificationMessage(false)
            }
        })

    }

    private fun accountCreatedMessage(isCreated:Boolean) {
        view.showMessageIsAccountCreated(isCreated)
    }

    private fun verificationMessage(isVerify:Boolean) {
        view.showMessageIsVerifyAccount(isVerify)
        if(isVerify){
            view.openMapActivity("")
        }
    }

    override fun subscribe() {

    }

    override fun unsubscribe() {

    }

    override  fun attach(view: MainContract.MainView) {
        this.view = view
        if(mainModel.isSaveAnyUser()){
            view.openMapActivity("")
        }
    }
}