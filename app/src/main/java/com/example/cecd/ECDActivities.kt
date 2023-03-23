package com.example.cecd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.cecd.Adapters.ECDAdapter
import com.example.cecd.Models.AssignedUser
import com.example.cecd.Models.IndividualECD
import com.example.cecd.Models.IndividualECDItem

import com.example.cecd.Retrofit.Retrofit
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlin.math.log


class ECDActivities : AppCompatActivity() {

    private final val TAG: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecdactivities)


        val username: String?  = intent.getStringExtra("userName")
        Log.d(TAG, "onCreate: USERNAME " + username )
        val compositeDisposable = CompositeDisposable()
        compositeDisposable.add(
            Retrofit.ServiceBuilder.buildService().getUserECD(username)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({response -> onResponse(response)}, {t -> onFailure(t) }))


    }

    private fun onFailure(t: Throwable) {
        //Toast.makeText(this,t.message, Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onFailure: " + t.message)

    }

    private fun onResponse(response: ArrayList<IndividualECDItem>)
    {
        val video_recycler = findViewById<RecyclerView>(R.id.rv_videos)
        video_recycler.layoutManager = LinearLayoutManager(this)
        Log.d(TAG, "onResponse:  RESPONSE" + response)

        val data = response.get(0)
        val numVideos = data.assigned_user.size
        val grrr = data.assigned_user
        Log.d(TAG, "onResponse: GRRRR" + grrr)
        val videoadapter = ECDAdapter(grrr)
        video_recycler.adapter = videoadapter


    }

}