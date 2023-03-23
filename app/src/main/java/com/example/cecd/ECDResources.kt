package com.example.cecd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ECDResources : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecdresources)

        val imv_ecdactivity = findViewById<ImageView>(R.id.iv_ecdactivity)
        val imv_ecdvideo = findViewById<ImageView>(R.id.iv_video)
        val imv_ecdwhseet = findViewById<ImageView>(R.id.iv_wsheet)

        imv_ecdactivity.setOnClickListener()
        {
            intent = Intent(applicationContext, ECDActivitiesCredentials::class.java)
            startActivity(intent)

        }

        imv_ecdvideo.setOnClickListener()
        {
            intent = Intent(applicationContext, ECDVideos::class.java)
            startActivity(intent)

        }

        imv_ecdwhseet.setOnClickListener(){
            Toast.makeText(this,"Coming Soon",Toast.LENGTH_LONG).show()
        }
    }
}