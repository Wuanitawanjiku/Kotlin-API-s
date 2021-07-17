package com.example.myposts



data class Comments(
    var  post_id: Int,
    var id: Int,
    var name: String,
    var email: String,
    var body: String
)
