package com.xgh.learnKotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener {
            Toast.makeText(this, "Button 1", Toast.LENGTH_SHORT).show()
        }
        button1.setOnLongClickListener(View.OnLongClickListener {
            Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show()
            true
        })
    }
}
