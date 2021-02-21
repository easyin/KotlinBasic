package com.example.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.sendBtn

class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        sendBtn.setOnClickListener {
//            Log.d("메인화면","send버튼 클릭됨.")
//            Toast.makeText(this, "You clicked Send Btn1!", Toast.LENGTH_SHORT).show()
//            target.setText(input.text)
//        }
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        sendBtn.setOnClickListener {
            Log.d("메인화면","send버튼 클릭됨.")
            Log.d("메인화면", inputID.text.toString())
            Log.d("메인화면", inputPasswd.text.toString())
            if(inputID.text.toString() == "admin@test.com" && inputPasswd.text.toString() == "qwer"){
                Toast.makeText(this, "You are administrator", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "login failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}