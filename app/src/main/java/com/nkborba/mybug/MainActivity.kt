package com.nkborba.mybug

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activity2 = Intent(this, ToNullActivity::class.java)
        val btnNull = findViewById(R.id.buttonNull) as Button

        btnNull.setOnClickListener{
            startActivity(activity2)
        }
    }

}
