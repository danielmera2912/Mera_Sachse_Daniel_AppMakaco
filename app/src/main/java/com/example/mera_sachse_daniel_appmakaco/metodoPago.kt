package com.example.mera_sachse_daniel_appmakaco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class metodoPago : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metodo_pago)
        var envio = findViewById<Button>(R.id.bEnviarMetodo)
        var terminos= findViewById<CheckBox>(R.id.terminos)
        var radioButton=findViewById<RadioGroup>(R.id.radioGroup)
        var tarj=findViewById<RadioButton>(R.id.rTarj)
        var pay=findViewById<RadioButton>(R.id.rPay)
        var nt= findViewById<TextView>(R.id.nT)
        var nt2= findViewById<EditText>(R.id.nt2)
        var ntf= findViewById<TextView>(R.id.nTF)
        var ntf2= findViewById<EditText>(R.id.ntF2)
        var ntc= findViewById<TextView>(R.id.nTc)
        var ntc2= findViewById<EditText>(R.id.ntc2)

        var payu= findViewById<TextView>(R.id.payU)
        var payu2= findViewById<EditText>(R.id.payU2)
        var payc= findViewById<TextView>(R.id.payCla)
        var payc2= findViewById<EditText>(R.id.payCla2)

        nt.setVisibility(View.INVISIBLE)
        nt2.setVisibility(View.INVISIBLE)
        ntf.setVisibility(View.INVISIBLE)
        ntf2.setVisibility(View.INVISIBLE)
        ntc.setVisibility(View.INVISIBLE)
        ntc2.setVisibility(View.INVISIBLE)

        payu.setVisibility(View.INVISIBLE)
        payu2.setVisibility(View.INVISIBLE)
        payc.setVisibility(View.INVISIBLE)
        payc2.setVisibility(View.INVISIBLE)

        tarj.setOnClickListener{
            if(tarj.isChecked){
                nt.setVisibility(View.VISIBLE)
                nt2.setVisibility(View.VISIBLE)
                ntf.setVisibility(View.VISIBLE)
                ntf2.setVisibility(View.VISIBLE)
                ntc.setVisibility(View.VISIBLE)
                ntc2.setVisibility(View.VISIBLE)
            }
            else{
                nt.setVisibility(View.INVISIBLE)
                nt2.setVisibility(View.INVISIBLE)
                ntf.setVisibility(View.INVISIBLE)
                ntf2.setVisibility(View.INVISIBLE)
                ntc.setVisibility(View.INVISIBLE)
                ntc2.setVisibility(View.INVISIBLE)
            }
        }

        pay.setOnClickListener{
            if(pay.isChecked){
                payu.setVisibility(View.VISIBLE)
                payu2.setVisibility(View.VISIBLE)
                payc.setVisibility(View.VISIBLE)
                payc2.setVisibility(View.VISIBLE)
            }
            else{
                payu.setVisibility(View.INVISIBLE)
                payu2.setVisibility(View.INVISIBLE)
                payc.setVisibility(View.INVISIBLE)
                payc2.setVisibility(View.INVISIBLE)
            }
        }
        envio.setOnClickListener{
            if(terminos.isChecked){
                Toast.makeText(
                    applicationContext,
                    "Está bien",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else{
                Toast.makeText(
                    applicationContext,
                    "No está marcado",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}