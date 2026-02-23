package com.example.smartattendancebuddy

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val percentage = intent.getIntExtra("percentage", 0)
        val textView = TextView(this)

        textView.textSize = 22f
        textView.text = "Attendance: $percentage%\n"

        when {
            percentage >= 75 -> {
                textView.append("Safe Zone")
                textView.setTextColor(Color.GREEN)
            }
            percentage in 60..74 -> {
                textView.append("Warning Zone")
                textView.setTextColor(Color.YELLOW)
            }
            else -> {
                textView.append("Danger Zone")
                textView.setTextColor(Color.RED)
            }
        }

        setContentView(textView)
    }
}
