package com.example.muko.kotlinespressotutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var option: Spinner
    val spinnerArray = arrayOf("@hotmail.com", "@gmail.com", "@yahoo.com", "@windowslive.com", "@live.com")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        option = findViewById(R.id.spEmail)
        option.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spinnerArray)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                
            }

        }

    }
}
