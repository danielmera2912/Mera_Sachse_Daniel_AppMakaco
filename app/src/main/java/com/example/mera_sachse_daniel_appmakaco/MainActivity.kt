package com.example.mera_sachse_daniel_appmakaco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var boton1 = findViewById<Button>(R.id.bonos)
        var boton2 = findViewById<Button>(R.id.pagos)
        var boton3 = findViewById<Button>(R.id.ocultar)
        boton1.setOnClickListener{
            val intent1 = Intent(this, BonosExtras::class.java).apply {

            }
            startActivity(intent1)
        }

        boton2.setOnClickListener{
            val intent2 = Intent(this, metodoPago::class.java).apply {

            }
            startActivity(intent2)
        }
        boton3.setOnClickListener{
            if(boton1.visibility==0){
                boton1.setVisibility(View.INVISIBLE)
                boton2.setVisibility(View.INVISIBLE)
            }
            else{
                boton1.setVisibility(View.VISIBLE)
                boton2.setVisibility(View.VISIBLE)
            }
        }
    }

}