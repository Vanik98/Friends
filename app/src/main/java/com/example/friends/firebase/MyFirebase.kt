package com.example.friends.firebase

import android.content.ContentValues.TAG
import android.util.Log
import com.example.friends.base.BaseActivity
import com.example.friends.entity.Friends
import com.example.friends.entity.Geolocation
import com.example.friends.entity.User
import com.example.friends.activtymain.MainContract
import com.google.firebase.FirebaseException
import com.google.firebase.auth.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class MyFirebase @Inject constructor(
      var activity : BaseActivity
) {
    private lateinit var mAuth: FirebaseAuth
    private lateinit var verificationID: String
    private lateinit var message:String

    fun sendVerificationCode(
        phoneNumber: String,
        onFinishedListener: MainContract.MainModel.OnFinishedListener
    ) {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
            phoneNumber,
            60,
            TimeUnit.SECONDS,
            activity,
            object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                override fun onVerificationCompleted(phoneAuthCredential: PhoneAuthCredential) {
                    message = "created"
                    onFinishedListener.onFinished(message)
                }

                override fun onVerificationFailed(e: FirebaseException) {

                    Log.i("vvv", e?.message!!)
                    onFinishedListener.onFailure(e)
                }

                override fun onCodeSent(
                    verificationId: String,
                    token: PhoneAuthProvider.ForceResendingToken
                ) {
                    super.onCodeSent(verificationId, token)
                    message = token.toString()
                    verificationID = verificationId
                    onFinishedListener.onFinished(message)
                }
            }
        )
    }

    fun verifySignInCode(
        code: String,
        onFinishedListener: MainContract.MainModel.OnFinishedListener
    ) {
        val credential = PhoneAuthProvider.getCredential(verificationID!!, code)
        signInWithPhoneAuthCrendential(credential, onFinishedListener)
    }

    fun signInWithPhoneAuthCrendential(
        credential: AuthCredential,
        onFinishedListener: MainContract.MainModel.OnFinishedListener
    ) {
        mAuth = FirebaseAuth.getInstance()
        mAuth.signInWithCredential(credential)
            .addOnCompleteListener(activity) { task ->
                if (task.isSuccessful) {
                    message = ""
                    onFinishedListener.onFinished(message)
                } else {

                    Log.w(TAG, "signInWithCredential:failure", task.exception)
                    if (task.exception is FirebaseAuthInvalidCredentialsException) {
                        onFinishedListener.onFailure(task.exception as FirebaseAuthInvalidCredentialsException)

                    }
                }
            }
    }
    fun getUser():User{
        return User("","","",1, Geolocation(), Friends())
    }


}

