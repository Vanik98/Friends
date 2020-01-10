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
import android.content.Context
import android.provider.Settings.Global.getString
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.GoogleApiClient
import java.lang.NullPointerException


class FriendsAppFirebase @Inject constructor(
    private var activity : BaseActivity
) {
    private lateinit var mAuth: FirebaseAuth
    private lateinit var verificationID: String
    private lateinit var message:String
    private lateinit var databaseReference:DatabaseReference
    private lateinit var storageReference:StorageReference
    private lateinit var user: User

    fun sendVerificationCode(user: User, onFinishedListener: MainContract.MainModel.OnFinishedListener) {
        mAuth = FirebaseAuth.getInstance()
        this.user = user
        Log.i("vvv", user.phone)
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
            user.phone,
            60,
            TimeUnit.SECONDS,
            activity,
            object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                override fun onVerificationCompleted(phoneAuthCredential: PhoneAuthCredential) {
                    message = "Account has already been created."
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
        if(verificationID.isNotEmpty()) {
            val credential = PhoneAuthProvider.getCredential(verificationID!!, code)
            signInWithPhoneAuthCredential(credential, onFinishedListener)
        }else{
            onFinishedListener.onFailure(NullPointerException())
        }
    }

    private fun signInWithPhoneAuthCredential(credential: AuthCredential, onFinishedListener: MainContract.MainModel.OnFinishedListener) {
        mAuth = FirebaseAuth.getInstance()
        mAuth.signInWithCredential(credential)
            .addOnCompleteListener(activity) { task ->
                if (task.isSuccessful) {
                    user.id = mAuth.currentUser!!.uid
                    addUserInformation(user,onFinishedListener)
                } else {

                    Log.i("vvv", "signInWithCredential:failure", task.exception)
                    if (task.exception is FirebaseAuthInvalidCredentialsException) {
                        onFinishedListener.onFailure(task.exception as FirebaseAuthInvalidCredentialsException)
                    }
                }
            }
    }

    fun getUser(accountId:String,onFinishedListener: MapContract.MapModel.OnFinishedListener){
        Log.i("vvv","$accountId")
        databaseReference = FirebaseDatabase.getInstance().reference
        val userRef = databaseReference.child("users").child(accountId)
        userRef.addValueEventListener(object :ValueEventListener{
            override fun onCancelled(p0: DatabaseError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                Log.i("vvv","BBBBBBBBBBBBBBB")
                onFinishedListener.onFailure(Throwable())
            }
//                            093 82 68 79   374 94 59 25 59
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (postSnapshot in dataSnapshot.children) {
                    var user:User = postSnapshot.getValue(User::class.java)!!
                    onFinishedListener.onFinished(user)
                }
            }
        })
    }

    private fun addUserInformation(user:User,onFinishedListener: MainContract.MainModel.OnFinishedListener){
        val id = user.id
        Log.i("vvv","$user")
        databaseReference = FirebaseDatabase.getInstance().getReference("users/$id")
//        storageReference = FirebaseStorage.getInstance().getReference("images/")

        databaseReference.child("user").setValue(user)
        onFinishedListener.onFinished(user.id)
//        val imageUri: Uri = Uri.parse("content://storage/emulated/0/VK/Downloads/Bht-XvMtEV8")
//        val fileRef = storageReference.child("images/111")
//            fileRef.putFile(imageUri)
//                .addOnSuccessListener {
//                    Log.i("vvv","ynhanrapes anhasaknaliya")
//                    if (id != null) {
//                        databaseReference.child(id).setValue(user)
//                        onFinishedListener.onFinished("")
//                        Log.i("vvv","sax lavaaaaaaaaaaaaaa")
//                    }
//                }
//                .addOnFailureListener{
//                    onFinishedListener.onFinished("${it.message}")
//                    Log.i("vvv","chi ashxatum  ${it.message} ")
//                }
//                .addOnProgressListener {
//                    Log.i("vvv","uraaaaaaaaaaa ese chgitem xi")
//                }
        }

    fun refreshInformation(){
        databaseReference.addChildEventListener(object :ChildEventListener{
            override fun onCancelled(p0: DatabaseError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onChildMoved(p0: DataSnapshot, p1: String?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onChildChanged(p0: DataSnapshot, p1: String?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onChildAdded(p0: DataSnapshot, p1: String?) {
                val geolocation: Geolocation = p0.getValue(Geolocation::class.java)!!

            }

            override fun onChildRemoved(p0: DataSnapshot) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }

    fun addFriend(accountId:String,friendId:String){
        databaseReference = FirebaseDatabase.getInstance().getReference("user/")
        val userId = databaseReference.push().key
        userId?.let { databaseReference.child(it).setValue(friendId) }
    }

}

