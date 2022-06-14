package com.example.recyclerviewmio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewmio.adapter.PeliculasAdapter
import com.example.recyclerviewmio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initrecyclerPeliculas()
    }
    fun initrecyclerPeliculas(){
        val manager = LinearLayoutManager(this) //Actuan como bloques de celda
        val decoration = DividerItemDecoration(this,manager.orientation) //Son las lineas para saber que se separan
        binding.recyclerPeliculas.layoutManager = manager
        binding.recyclerPeliculas.addItemDecoration(decoration)
        binding.recyclerPeliculas.layoutManager = LinearLayoutManager(this)
        binding.recyclerPeliculas.adapter = PeliculasAdapter(SuperHeroProvider.PeliculasList)

    }


}