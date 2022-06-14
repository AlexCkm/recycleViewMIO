package com.example.recyclerviewmio.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewmio.Peliculas
import com.example.recyclerviewmio.R
import com.example.recyclerviewmio.databinding.PeliculasPersonajesBinding
import com.google.android.material.snackbar.Snackbar

class PeliculasViewHolder (view: View):RecyclerView.ViewHolder(view) {
    val binding = PeliculasPersonajesBinding.bind(view)
    fun render(PeliculasModel: Peliculas){
        binding.tvPelicula.text = PeliculasModel.pelicula
        binding.tvDirector.text = PeliculasModel.Director
        binding.tvEmpresa.text = PeliculasModel.Compañia
        Glide.with(binding.ivPeliculas.context)
            .load(PeliculasModel.photo)
            .error(R.drawable.error) //La imagen se saca de internet y se pone el mismo nombre
            .into(binding.ivPeliculas)
        binding.ivPeliculas.setOnClickListener {
            Snackbar.make(binding.ivPeliculas, PeliculasModel.Director,Snackbar.LENGTH_SHORT).show()
        }
        itemView.setOnClickListener {
            Snackbar.make(binding.ivPeliculas, PeliculasModel.Compañia,Snackbar.LENGTH_SHORT).show()
        }
    }
}