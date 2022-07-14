package com.example.spinnerandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.spinnerandroidkotlin.databinding.ActivityMainBinding
import java.util.*
import java.util.Arrays.asList

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var pais: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

         pais = ArrayAdapter<String> (
            this,android.R.layout.simple_spinner_dropdown_item)

        pais.addAll(
            Arrays.asList("Cap-Haitien", "Hinche", "Jacmel",
            "Fort-Liberte", "Jeremie", "Petion-Ville", "Saint-Marc", "Limbe", "Gonaive" ))

        binding.spinnerPais.onItemSelectedListener
        binding.spinnerPais.adapter = pais

//        binding.spinnerPais.onItemClickListener = this
//        binding.spinnerPais.adapter = pais
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val paisSelected = pais.getItem(position)
        binding.tvSelected.text = position.toString()
    }

}