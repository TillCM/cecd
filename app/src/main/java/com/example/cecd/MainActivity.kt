package com.example.cecd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.webkit.WebView
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imv_ecd = findViewById<ImageView>(R.id.iv_baby)
        val imv_parent = findViewById<ImageView>(R.id.iv_mom)
        val imv_nutrition = findViewById<ImageView>(R.id.nutrition)



      imv_ecd.setOnClickListener()
      {
          intent = Intent(applicationContext, ECDResources::class.java)
          startActivity(intent)

      }

        imv_parent.setOnClickListener()
        {
            Toast.makeText(this,"coming soon",Toast.LENGTH_LONG).show()

        }

        imv_nutrition.setOnClickListener()
        {
            Toast.makeText(this,"coming soon",Toast.LENGTH_LONG).show()

        }




    }
}