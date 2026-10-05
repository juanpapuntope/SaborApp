package com.senati.proyectosesion2checkbox

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etNumero1=findViewById<EditText>(R.id.etNumero1)
        val etNumero2=findViewById<EditText>(R.id.etNumero2)
        val checkSumar=findViewById<CheckBox>(R.id.checkSumar)
        val checkRestar=findViewById<CheckBox>(R.id.checkRestar)
        val tvResultado=findViewById<TextView>(R.id.tvResultado)
        val button=findViewById<Button>(R.id.btnOperar)

        button.setOnClickListener {
            var resultado=""
            if (checkSumar.isChecked)
                resultado = "Suma = ${etNumero1.text.toString().toInt() + etNumero2.text.toString().toInt()} "
            if (checkRestar.isChecked)
                resultado += "Resta = ${etNumero1.text.toString().toInt() - etNumero2.text.toString().toInt()}"
            tvResultado.text = resultado
        }

    }
}