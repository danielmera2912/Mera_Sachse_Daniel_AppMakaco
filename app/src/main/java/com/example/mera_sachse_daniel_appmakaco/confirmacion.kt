package com.example.mera_sachse_daniel_appmakaco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.TextView

class confirmacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacion)
        var confirmation = findViewById<Button>(R.id.confirmation)
        var salir = findViewById<Button>(R.id.back)
        val message = intent.getStringExtra(AlarmClock.EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
        salir.setOnClickListener{
            finish()
        }
        confirmation.setOnClickListener{
            finish()
        }
    }
}