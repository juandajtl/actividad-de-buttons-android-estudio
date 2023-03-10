package com.example.TrabajoCristian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    var checkBox1: CheckBox? = null
    var checkBox2: CheckBox? = null
    var radioButton1: RadioButton? = null
    var radioButton2: RadioButton? = null
    var toggleButton: ToggleButton? = null
    var switch1: Switch? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkBox1 = findViewById(R.id.checkBox1)
        checkBox2 = findViewById(R.id.checkBox2)
        radioButton1 = findViewById(R.id.Radio1)
        radioButton2 = findViewById(R.id.Radio2)
        toggleButton = findViewById(R.id.toggleButton)
        switch1 = findViewById(R.id.switch2)

        val BottonImage: ImageButton = findViewById(R.id.imageButton)
        BottonImage.setOnClickListener { mensajeBoton() }

        val botonCalcular: Button = findViewById(R.id.button)
        botonCalcular.setOnClickListener { mostrarCaracteres() }

    }

    private fun mostrarCaracteres() {
        val textView: EditText = findViewById(R.id.textView)
        val nombre: String = textView.text.toString()
        var cad: String = "seleccionado:\n"
        if (checkBox1?.isChecked == true) {
            cad += "CheckBox 1"
        }
        if (checkBox2?.isChecked == true) {
            cad += "CheckBox 2"
        } else {
            cad += "usted no ha seleccionado nada"
        }

        var rad: String = "seleccionado:\n"
        if (radioButton1?.isChecked == true) {
            rad += "Radio 1"
        }
        if (radioButton2?.isChecked == true) {
            rad += "Radio 2"
        }
        var Toggle: String = "Toggle \n"
        Toggle += if (toggleButton?.isChecked == true) {
            "ON"
        } else {
            "OFF"
        }
        var switche: String = "switch:\n"
        switche += if (switch1?.isChecked == true) {
            "ON"
        } else {
            "OFF"
        }

        Toast.makeText(
            this,
            "bienvenido $nombre, $cad, $rad, $Toggle,$switche ",Toast.LENGTH_SHORT).show()

    }

    public fun mensajeBoton( ) {

        Toast.makeText(this, "esto es un image button", Toast.LENGTH_SHORT).show()

}
}