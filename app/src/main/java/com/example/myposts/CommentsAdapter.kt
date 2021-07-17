package com.example.myposts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CommentsAdapter(var userComments: List<Comments>): RecyclerView.Adapter<CommentsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentsViewHolder {
        var commentsView = LayoutInflater.from(parent.context).inflate(R.layout.comments_list, parent, false)
        return CommentsViewHolder(commentsView)
    }


    override fun onBindViewHolder(holder: CommentsViewHolder, position: Int) {
        var currentComments = userComments.get(position)
        holder.tvCommentName.text = currentComments.name
        holder.tvCommentsEmail.text = currentComments.email
        holder.tvCommentBody.text = currentComments.body
        }

    override fun getItemCount(): Int {
        return userComments.size
    }

}

    class CommentsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvCommentName = itemView.findViewById<TextView>(R.id.tvCommentName)
        var tvCommentsEmail = itemView.findViewById<TextView>(R.id.tvCommentEmail)
        var tvCommentBody= itemView.findViewById<TextView>(R.id.tvCommentBody)
    }



