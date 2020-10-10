package com.engmob.android.certification.core.paginglists.model

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {
    private val baseURL = "https://api.stackexchange.com/2.2/"
    val api: Api
        get() {
            val client = OkHttpClient.Builder()
                .readTimeout(1, TimeUnit.MINUTES)
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(1, TimeUnit.MINUTES)
            val retrofitInstance = Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client.build()).build()
            return retrofitInstance.create(Api::class.java)
        }

}