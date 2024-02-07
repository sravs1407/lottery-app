package com.example.lotteryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.content.Intent

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var textView: TextView
    lateinit var imageView: ImageView
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=findViewById(R.id.textview1)
        imageView=findViewById(R.id.imageview1)
        editText=findViewById(R.id.edit_text1)
        button=findViewById(R.id.button)
        button.setOnClickListener{
             val explicit_intent=Intent(this,second_activity::class.java)
            explicit_intent.putExtra("name",editText.text.toString())
            startActivity(explicit_intent)
        }
    }

}