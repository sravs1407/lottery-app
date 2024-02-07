package com.example.lotteryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class second_activity : AppCompatActivity() {
    lateinit var textView2: TextView
    lateinit var imageView: ImageView
    lateinit var textView3: TextView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        textView2=findViewById(R.id.textview2)
        imageView=findViewById(R.id.imageView2)
        textView3=findViewById(R.id.textview3)
        button=findViewById(R.id.button2)
        textView3.text=randomnumbers(6)
        var random_numbers=textView3.text.toString()
        var user_name=recieveusername()
        button.setOnClickListener{
            var i=Intent(Intent.ACTION_SEND)
            i.setType("text/plain")
            i.putExtra(Intent.EXTRA_SUBJECT,"$user_name generates these numbers")
            i.putExtra(Intent.EXTRA_TEXT,"Generated numbers are $random_numbers")
            startActivity(i)
        }
    }
    fun randomnumbers(count:Int):String{
        var random_variables=List(count){(0..42).random()}
        var random_string=random_variables.joinToString(" ")
        return random_string
    }
    fun recieveusername():String?{
        var bundle:Bundle?=intent.extras
        var user_name=bundle?.getString("name")
        return user_name
    }
}