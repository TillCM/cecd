package com.example.cecd.Adapters

import android.app.Application
import android.content.Context
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.example.cecd.Models.AssignedUser
import com.example.cecd.Models.IndividualECD
import com.example.cecd.Models.IndividualECDItem
import com.example.cecd.R
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.ui.StyledPlayerView
import com.google.android.exoplayer2.upstream.BandwidthMeter
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import java.net.URL
import kotlin.math.log

class ECDAdapter( private val userlist: List<AssignedUser>): RecyclerView.Adapter<ECDAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ECDAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.ecd_items, parent, false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ECDAdapter.ViewHolder, position: Int) {
        val TAG:String=""
        Log.d(TAG, "onBindViewHolder: ENTIRE LIST " + userlist)
        holder.ecdVideoView.webViewClient = WebViewClient()
        val webSettings = holder.ecdVideoView.settings
        webSettings.javaScriptEnabled = true
        Log.d(TAG, "onBindViewHolder: VIDEOS" + userlist[position].video)
        holder.ecdVideoView.loadUrl(userlist[position].video)







        }

    override fun getItemCount(): Int {
        val TAG:String=""

       // val assignedUserSize = userlist[0].assigned_user.size
        Log.d(TAG, "getItemCount: " + userlist.size)
        return userlist.size

    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view)
    {
        val ecdVideoView = view.findViewById<WebView>(R.id.wv_vid)



    }

}

