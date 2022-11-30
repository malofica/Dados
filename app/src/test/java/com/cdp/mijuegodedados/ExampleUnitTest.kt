package com.cdp.mijuegodedados

import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.os.Budle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContenView(R.layout.activity_main)

        val btnjuegueylanceaqui: Button = findViewById(R.id.btnjuegueylanceaqui)

        btnjuegueyl anceaqui.setOnClickListener{
            tiempo()

        }
        rollDice()

    }

    private fun rollDice()  {
       var numero: Int = juegueylanceaqui(6)
        val txtResult: TextView = findViewById(R.id)
        txtResult.text = numero.toString()



        val drawableResource = when(numero){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6

        }
    }
        val imgDado: ImageView = findViewById(R.id.imgDado)
        imgDado.sentImageResource(drawableResource)

    private fun juegueylanceaqui(max: Int): Int {
        return (1..max).random()

    }
    private fun tiempo() {
        object: CountDownTimer(millislnFuture: 3000, countDownInterval: 200){
            pverride fun onTick(pO: Long){
               rollDice()
            }
            override fun onFinish(){

            }
        }.start()

    }

    }







