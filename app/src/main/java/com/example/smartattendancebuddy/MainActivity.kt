package com.example.smartattendancebuddy

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val name = EditText(this)
        val branch = EditText(this)
        val subject = EditText(this)
        val attended = EditText(this)
        val total = EditText(this)
        val button = Button(this)

        button.setOnClickListener {

            val attendedVal = attended.text.toString().toIntOrNull()
            val totalVal = total.text.toString().toIntOrNull()

            if (attendedVal == null || totalVal == null || totalVal == 0) {
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val percentage = (attendedVal * 100) / totalVal

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("percentage", percentage)
            startActivity(intent)
        }
    }
}
