package com.example.myposts

import android.graphics.PostProcessor
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {
    @GET("posts")
    fun getPosts(): Call<List<Post>>
}