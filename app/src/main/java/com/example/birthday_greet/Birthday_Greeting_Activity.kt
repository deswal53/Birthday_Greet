package com.example.birthday_greet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Birthday_Greeting_Activity : AppCompatActivity() {

//    companion object{
//        const val NAME_EXTRA = "name_extra"
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

       // val name = intent.getStringExtra(NAME_EXTRA)
      //  findViewById<TextView>(R.id.birthdayGreeting).text = "Happy Birthday $name"

        val text1: TextView = findViewById(R.id.birthdayGreeting)
        val name = intent.getStringExtra(MainActivity.NAME_EXTRA)
       // text1.text = "Happy Birthday $name"
        text1.setText("Happy Birthday $name")

    }
}