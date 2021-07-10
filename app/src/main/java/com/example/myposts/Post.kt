package com.example.myposts

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.annotations.SerializedName
import retrofit2.http.Body

data class Post(
    var userId: Int,
    var id: Int,
    var title: String,
    var body: String
    )

