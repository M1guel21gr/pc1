package com.example.pc1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val suma:TextView=findViewById(R.id.textSuma)
        val resta:TextView=findViewById(R.id.textResta)
        val multiplicacion:TextView=findViewById(R.id.textMulti)
        val division:TextView=findViewById(R.id.textDiv)

        val num1 = intent.getIntExtra("num1", 0)
        val num2 = intent.getIntExtra("num2", 0)
        val val1= num1
        val val2= num2

        val r1=(val1+val2).toString()
        val r2=(val1-val2).toString()
        val r3=(val1*val2).toString()
        val r4=(val1/val2).toString()

        suma.setText(r1)
        resta.setText(r2)
        multiplicacion.setText(r3)
        division.setText(r4)
    }
}