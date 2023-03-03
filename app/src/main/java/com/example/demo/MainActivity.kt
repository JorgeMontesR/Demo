package com.example.demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var leftnumber= 0
    var rightnumber= 0

    fun assignNumbers(){
        leftnumber= (0 ..100).random()
        rightnumber= (0+Math.random()*100).toInt()
    }

    fun buttonclick(button: View){
        println("El Numero derecho es: $rightnumber y el izquierdo es $leftnumber")
        println (" El usuario dio click en el boton ${button.id}")
        val result = findViewById <TextView> (R.id.txtResult)
        if(button.id == R.id.btnder && rightnumber>leftnumber){
            Toast.makeText(this, "Ganaste!", Toast.LENGTH_LONG).show()
            result.text = "Has ganado bien hecho"
        }
        else  if(button.id == R.id.btnizq && rightnumber<leftnumber){
            Toast.makeText(this, "Ganaste!", Toast.LENGTH_LONG).show()
            result.text = "Has ganado bien hecho"
        }
        else {
            Toast.makeText(this, "Perdiste!", Toast.LENGTH_LONG).show()
            result.text = "Has Perdido :CC"
        }
        assignNumbers()
    }

    fun rightclick(param1: View) {
        println("Di click en el boton derecho :D")
        if(rightnumber>leftnumber){
            Toast.makeText(this, "Ganaste!", Toast.LENGTH_LONG).show()
        }
        else {
            Toast.makeText(this, "Perdiste!", Toast.LENGTH_LONG).show()
        }
       assignNumbers()
    }

    fun leftclick(param1: View) {
        println("Di click en el boton izquierdo :DDDDDDDDDDDDDDDD")
        if(rightnumber<leftnumber){
            Toast.makeText(this, "Ganaste", Toast.LENGTH_LONG).show()
        }
        else {
            Toast.makeText(this, "Perdiste", Toast.LENGTH_LONG).show()
        }
        assignNumbers()
    }
}