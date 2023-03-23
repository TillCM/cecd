package com.example.cecd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class ECDVideos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecdvideos)

       val vidwebView = findViewById<WebView>(R.id.wv_vid)
        vidwebView.webViewClient = WebViewClient()
        vidwebView.loadUrl("https://comach-resources.melissadensmore.com/ecd-videos/")
        val webSettings = vidwebView.settings
        webSettings.javaScriptEnabled = true
    }
}