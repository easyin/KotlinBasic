package com.example.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendBtn.setOnClickListener {
            Log.d("메인화면","send버튼 클릭됨.")
            Toast.makeText(this, "You clicked Send Btn!", Toast.LENGTH_SHORT).show()
            target.setText(input.text)
        }
    }
}