package com.example.pc1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonEnviar:Button = findViewById(R.id.botonEnviar)
        val num1:EditText=findViewById(R.id.num1)
        val num2:EditText=findViewById(R.id.num2)
        botonEnviar.setOnClickListener{
            this.EnviarNumeros(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()))
        }

    }

    private fun EnviarNumeros(num1: Int, num2: Int){
        val intent = Intent(this, ResultadoActivity::class.java)
        intent.putExtra("num1",num1)
        intent.putExtra("num2",num2)
        startActivity(intent)
    }
}