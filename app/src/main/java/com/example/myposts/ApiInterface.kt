package com.example.myposts

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("posts")
    fun getPosts(): Call<List<Post>>

    @GET("posts/{postId}")
    fun getPost(@Path("postId") id: Int): Call<Post>
}