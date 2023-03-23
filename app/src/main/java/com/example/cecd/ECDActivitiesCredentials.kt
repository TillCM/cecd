package com.example.cecd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ECDActivitiesCredentials : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecdactivities_credentials)

        val TAG:String ="Data"

        val btn_continue = findViewById<Button>(R.id.btn_continue)
        val et_username = findViewById<EditText>(R.id.et_username)
        val et_password = findViewById<EditText>(R.id.et_password)



        //Log.d(TAG, "onCreate: USERNAME FROM CRED " +name)
        val password = et_password.text

        btn_continue.setOnClickListener()
        {val name: String = et_username.text.toString()
            intent = Intent(applicationContext, ECDActivities::class.java)
            intent.putExtra("userName" , name)
            startActivity(intent)

        }
    }
}