package com.example.filesizeconverter

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var bitsEntry: EditText? = null
    var resultTextView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize your views
        bitsEntry = findViewById(R.id.bitsEntry)
        resultTextView = findViewById(R.id.resultTextView)
    }

    fun convert(view: View?) {
        val bitsText = bitsEntry!!.text.toString()
        try {
            val bits = bitsText.toDouble()
            val megabits = bits / 1000000.0

            resultTextView!!.text = String.format("%.2f Mb", megabits)
        } catch (e: NumberFormatException) {
            resultTextView!!.text = "Invalid input"
        }
    }
}