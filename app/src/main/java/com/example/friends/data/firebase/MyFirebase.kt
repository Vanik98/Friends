package com.example.friends.data.firebase

import android.content.ContentValues.TAG
import android.net.Uri
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
import com.google.firebase.database.*
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.google.firebase.storage.UploadTask
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import com.google.firebase.database.DatabaseReference
import android.R



class MyFirebase @Inject constructor(
    private var activity : BaseActivity
) {
    private lateinit var mAuth: FirebaseAuth
    private lateinit var verificationID: String
    private lateinit var message:String
    private lateinit var databaseReference:DatabaseReference
    private lateinit var storageReference:StorageReference

    fun sendVerificationCode(phoneNumber: String, onFinishedListener: MainContract.MainModel.OnFinishedListener) {
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

    fun verifySignInCode(code: String, onFinishedListener: MainContract.MainModel.OnFinishedListener) {
        val credential = PhoneAuthProvider.getCredential(verificationID!!, code)
        signInWithPhoneAuthCredential(credential, onFinishedListener)
    }

    private fun signInWithPhoneAuthCredential(credential: AuthCredential, onFinishedListener: MainContract.MainModel.OnFinishedListener) {
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

    fun getUser(accountId:String,onFinishedListener: MapContract.MapModel.OnFinishedListener){
        databaseReference = FirebaseDatabase.getInstance().reference
        val userRef = databaseReference.child("users")
        userRef.addValueEventListener(object :ValueEventListener{
            override fun onCancelled(p0: DatabaseError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                Log.i("vvv","BBBBBBBBBBBBBBB")
            }

            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (postSnapshot in dataSnapshot.children) {
                    var user:User = postSnapshot.getValue(User::class.java)!!
                    onFinishedListener.onFinished(user)
                }
            }
        })
    }

    fun addUserInformation(user:User,onFinishedListener: MainContract.MainModel.OnFinishedListener){
        databaseReference = FirebaseDatabase.getInstance().getReference("users/")
        storageReference = FirebaseStorage.getInstance().getReference("images/")
        val id = databaseReference.push().key
        val imageUri: Uri = Uri.parse("content://media/external/images/media/32196")
        val fileRef = storageReference.child("1")
            fileRef.putFile(imageUri)
                .addOnSuccessListener {
                    if (id != null) {
                        databaseReference.child(id).setValue(user)
                        onFinishedListener.onFinished("")
                    }
                }
                .addOnFailureListener{
                    onFinishedListener.onFinished("${it.message}")
                }
                .addOnProgressListener {
                    Log.i("vvv","uraaaaaaaaaaa ese chgitem xi")
                }
        }

    fun addFriend(accountId:String,friendId:String){
        databaseReference = FirebaseDatabase.getInstance().getReference("user/")
        val userId = databaseReference.push().key
        userId?.let { databaseReference.child(it).setValue(friendId) }
    }
}

