package com.example.superheroapi

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.superheroapi.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(superHeroItemResponse: SuperHeroItemResponse, onItemSelected: (String) -> Unit) {
        binding.tvSuperHeroName.text = superHeroItemResponse.name
        Picasso.get().load(superHeroItemResponse.superheroImage.url).into(binding.ivSuperHero)
        binding.root.setOnClickListener { onItemSelected(superHeroItemResponse.superheroId) }
    }
}