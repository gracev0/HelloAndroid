package com.example.helloandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView

/* This file is where you add functionality to the text/widgets and buttons you've placed
within the display.

Here, I took the buttons and portions of text and stored them in variables
in order use them and, in the future, add the functionality. You can use the values as you would
regular data. For example, you can use the onClickEventListener to attach events to certain buttons
and do a lot more.
 */

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    //find view by id to get views into variables
        val multiply = findViewById<Button>(R.id.button2)
        val textBoxOne = findViewById<EditText>(R.id.editTextNumber)
        val textBoxTwo = findViewById<EditText>(R.id.editTextNumber2)
        val Answer = findViewById<EditText>(R.id.editTextNumber3)

    }
}