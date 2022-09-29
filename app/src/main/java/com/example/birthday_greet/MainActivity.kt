package com.example.birthday_greet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object{
        const val NAME_EXTRA = "name_extra"
    }


    fun createBirthdayCard(view: View) {
         // val name = findViewById<TextView>(R.id.nameInput).editableText.toString()
         //   val name = findViewById<EditText>(R.id.nameInput).editableText.toString()
         //    val name = findViewById<EditText>(R.id.nameInput).text.toString()
        val name1: EditText = findViewById(R.id.nameInput)
        val name: String = name1.text.toString()

        Toast.makeText(this, "Button was clicked", Toast.LENGTH_LONG).show()

        val intent = Intent(this, Birthday_Greeting_Activity::class.java)
        //  intent.putExtra(Birthday_Greeting_Activity.NAME_EXTRA, name)
        intent.putExtra(NAME_EXTRA, name)
        startActivity(intent)

    }
}