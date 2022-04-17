package com.example.recyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.R
import com.example.recyclerviewexample.SuperHero

class SuperHeroAdapter(private val superherolist: List<SuperHero>) : RecyclerView.Adapter<SuperHeroViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent,false))


    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
            val item = superherolist[position]
            holder.render(item)
    }

    override fun getItemCount(): Int = superherolist.size
}