package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    internal var minteger = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val plus = findViewById<Button>(R.id.increase)
        val minus = findViewById<Button>(R.id.decrease)

        plus.setOnClickListener {

            increaseInteger(plus)
        }



        minus.setOnClickListener {

            decreaseInteger(minus)
        }
    }

    fun increaseInteger(view: View) {
        minteger += 1
        display(minteger)

    }

    fun decreaseInteger(view: View) {
        minteger -= 1
        display(minteger)
    }

    private fun display(number: Int) {
        val displayInteger = findViewById<View>(
            R.id.integer_number) as TextView
        displayInteger.text = "" + number
    }
}
