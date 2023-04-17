package com.example.app_parametros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ParametroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parametro)

        val i = Intent(this, MainActivity::class.java)
        var res = findViewById<TextView>(R.id.txtParametro)
        var par = intent.getStringExtra("parametro")
        var btn = findViewById<Button>(R.id.btnBack)
        res.setText(par)

        btn.setOnClickListener {
            startActivity(i)
        }
    }
}