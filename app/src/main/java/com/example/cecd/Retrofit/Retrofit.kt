package com.example.cecd.Retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class Retrofit {

    object ServiceBuilder {
        private val client = OkHttpClient
            .Builder()
            .connectTimeout(5, TimeUnit.MINUTES)
            .readTimeout(2, TimeUnit.MINUTES)
            .build()

        private val retrofit = Retrofit.Builder()
            .baseUrl("https://comach-resources.melissadensmore.com/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(IAPI::class.java)


        fun buildService(): IAPI {
            return retrofit
        }
    }

}