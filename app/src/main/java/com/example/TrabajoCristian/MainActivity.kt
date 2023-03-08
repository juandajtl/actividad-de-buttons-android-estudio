package com.example.TrabajoCristian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val botonCalcular: Button =findViewById(R.id.Btncalcular)
        botonCalcular.setOnClickListener {realizarCalculo()}
    }

    private fun realizarCalculo(){

    }

}