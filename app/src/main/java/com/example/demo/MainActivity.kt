package com.example.demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var leftnumber= (0 ..100).random()
    var rightnumber= (0+Math.random()*100).toInt()

    fun rightclick(param1: View) {
        println("Di click en el boton derecho :D")
        if(rightnumber>leftnumber){
            Toast.makeText(this, "Ganaste!", Toast.LENGTH_LONG).show()
        }
        else {
            Toast.makeText(this, "Perdiste!", Toast.LENGTH_LONG).show()
        }
        leftnumber= (0 ..100).random()
        rightnumber= (0+Math.random()*100).toInt()


    }

    fun leftclick(param1: View) {
        println("Di click en el boton izquierdo :DDDDDDDDDDDDDDDD")
        if(rightnumber<leftnumber){
            Toast.makeText(this, "Ganaste", Toast.LENGTH_LONG).show()
        }
        else {
            Toast.makeText(this, "Perdiste", Toast.LENGTH_LONG).show()
        }
        leftnumber= (0 ..100).random()
        rightnumber= (0+Math.random()*100).toInt()

    }
}