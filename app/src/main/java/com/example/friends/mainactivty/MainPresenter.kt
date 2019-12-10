package com.example.friends.mainactivty

import javax.inject.Inject


class MainPresenter @Inject constructor(
    var mainModel: MainScreenContract.MainModel
) : MainScreenContract.MainPresenter {

    private lateinit var view: MainScreenContract.MainView

    override fun createAccount(phoneNumber: String) {
        mainModel.createAccount(phoneNumber,
            object:MainScreenContract.MainModel.OnFinishedListener{
                override fun onFinished(message: String) {
                    mainModel.saveAnyUser(true)
                    if (message == "created")
                    {
                        view.openMapActivity("")
                    }else {
                       //: onFinished taki main modely petqa jnjel,u bacel stex
//                        mainModel.saveAnyUser(true)
                        view.showVerificationDialog()
                        accountCreatedMessage(true)
                    }
                }
                override fun onFailure(t: Throwable) {
                    accountCreatedMessage(false)
                }
            })
    }

    override fun checkVerificationCode(verificationCode: String){
        mainModel.checkVerificationCode(verificationCode,object :MainScreenContract.MainModel.OnFinishedListener{
            override fun onFinished(message: String) {
                verificationMessage(true)

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

    override  fun attach(view: MainScreenContract.MainView) {
        this.view = view
        if(mainModel.isSaveAnyUser()){
            view.openMapActivity("")
        }
    }
}