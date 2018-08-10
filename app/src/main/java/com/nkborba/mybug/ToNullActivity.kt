package com.nkborba.mybug

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class ToNullActivity : AppCompatActivity() {

    private val hereIsTheNullPoint: Button = findViewById(R.id.buttonNull)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_null)
    }

}
