package com.example.mera_sachse_daniel_appmakaco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.Button
import android.widget.Switch

class BonosExtras : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bonos_extras)
        var bEnviar = findViewById<Button>(R.id.bEnviar)
        var s1=findViewById<Switch>(R.id.s1)
        var s2=findViewById<Switch>(R.id.s2)
        var s3=findViewById<Switch>(R.id.s3)

        var l1=findViewById<Switch>(R.id.l1)
        var l2=findViewById<Switch>(R.id.l2)

        s1.setOnClickListener{
            if(s1.isChecked){
                s2.isChecked=false
                s3.isChecked=false
            }
        }
        s2.setOnClickListener{
            if(s2.isChecked){
                s1.isChecked=false
                s3.isChecked=false
            }
        }
        s3.setOnClickListener{
            if(s3.isChecked){
                s1.isChecked=false
                s2.isChecked=false
            }
        }

        l1.setOnClickListener{
            if(l1.isChecked){
                l2.isChecked=false
            }
        }
        l2.setOnClickListener{
            if(l2.isChecked){
                l1.isChecked=false
            }
        }

        bEnviar.setOnClickListener {
            // var res:Resources= resources
            var seleccionado:String= "Bonos seleccionados: \n"
            var seleccionado2:String= "\n"
            if (s1.isChecked) seleccionado += s1.text.toString() +"\n"
            if(s2.isChecked) seleccionado +=  s2.text.toString()+ "\n"
            if(s3.isChecked) seleccionado += s3.text.toString() + "\n"

            if(l1.isChecked) seleccionado2+= l1.text.toString()+"\n"
            if(l2.isChecked) seleccionado2+= l1.text.toString()+"\n"
            seleccionado=seleccionado + seleccionado2

            val intent = Intent(this, confirmacion::class.java).apply {
                putExtra(AlarmClock.EXTRA_MESSAGE, seleccionado)
            }
            startActivity(intent)
        }
    }
}