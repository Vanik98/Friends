package com.example.friends.data.firebase

import android.content.ContentValues.TAG
import android.util.Log
import com.example.friends.base.BaseActivity
import com.example.friends.data.model.AccountImage
import com.example.friends.data.model.Friends
import com.example.friends.data.model.Geolocation
import com.example.friends.data.model.User
import com.example.friends.main.MainContract
import com.example.friends.map.MapContract
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.FirebaseException
import com.google.firebase.auth.*
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.google.firebase.storage.UploadTask
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class MyFirebase @Inject constructor(
    private var activity : BaseActivity
) {
    private lateinit var mAuth: FirebaseAuth
    private lateinit var verificationID: String
    private lateinit var message:String
    private lateinit var databaseReference:DatabaseReference
    private lateinit var storageReference:StorageReference
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
        signInWithPhoneAuthCredential(credential, onFinishedListener)
    }

    private fun signInWithPhoneAuthCredential(
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

                    Log.i("vvv", "signInWithCredential:failure", task.exception)
                    if (task.exception is FirebaseAuthInvalidCredentialsException) {
                        onFinishedListener.onFailure(task.exception as FirebaseAuthInvalidCredentialsException)

                    }
                }
            }
    }
    fun getUser(accountId:String,onFinishedListener: MapContract.MapModel.OnFinishedListener):User{

        return User("","","",1, Geolocation(),null,Friends())
    }
    private fun addUser(user:User){
        databaseReference = FirebaseDatabase.getInstance().getReference("user")
        storageReference = FirebaseStorage.getInstance().getReference("image")
        val id = databaseReference.push().key
        if(id !=null) {
            user.accountImage?.let {uploadImage(it)}
            val user = User(id, user.name, user.surname, user.phone, user.geolocation,user.accountImage,user.friends)
            databaseReference.child(id).setValue(user)

        }
    }
    private fun uploadImage(image:AccountImage){
        val fileRef = storageReference.child("image/${System.currentTimeMillis()}+.${image.extension}")
        fileRef.putFile(image.imageUri)
            .addOnSuccessListener {

            }
            .addOnFailureListener{
                Log.i("vvv",it.message)
            }
            .addOnProgressListener {

            }
    }
    fun addFriend(){
        databaseReference = FirebaseDatabase.getInstance().getReference("user")
    }

}

