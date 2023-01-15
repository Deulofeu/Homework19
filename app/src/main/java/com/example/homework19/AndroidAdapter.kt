package com.example.homework19

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AndroidAdapter :
    RecyclerView.Adapter<AndroidViewHolder>() {
    private val list: MutableList<Film> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.rv_item_films, parent, false)
        return AndroidViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    fun setItems(list: List<Film>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: AndroidViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}