package org.example.demo.https

import retrofit2.Call
import retrofit2.http.GET

interface HttpsApi {

    @GET("/api/health")
    fun hello(): Call<Any>
}