package com.example.homework19

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AndroidViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {

    fun onBind(itemFilm: Film) {
        val number = itemView.findViewById<TextView>(R.id.tvNumber)
        val poster = itemView.findViewById<ImageView>(R.id.ivPoster)
        val name = itemView.findViewById<TextView>(R.id.tvName)
        val rating = itemView.findViewById<TextView>(R.id.tvRating)
        val isOscar = itemView.findViewById<ImageView>(R.id.ivIsOscar)

        number.text = itemFilm.id.toString()
        Glide
            .with(itemView)
            .load(itemFilm.poster)
            .into(poster)
        name.text = itemFilm.name
        rating.text = itemFilm.rating.toString()
        isOscar.isVisible = itemFilm.isOscar
    }
}