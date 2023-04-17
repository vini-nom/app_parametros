package com.example.app_parametros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val i = Intent(this, ParametroActivity::class.java)
        var parametro = findViewById<EditText>(R.id.edtParametro)
        var btn = findViewById<Button>(R.id.btnParametro)

        btn.setOnClickListener {
                i.putExtra("parametro", parametro.text.toString())
                startActivity(i)
        }
    }
}