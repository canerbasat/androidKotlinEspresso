package com.example.muko.kotlinespressotutorial

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {

    lateinit var option: Spinner
    val spinnerArray = arrayOf(
        "@hotmail.com",
        "@gmail.com",
        "@yahoo.com",
        "@windowslive.com",
        "@live.com"
    )

    override fun onCreate(savedInstanceState: Bundle?) {

        AppCenter.start(
            application, "9e4d6e11-e1ba-4737-a039-52249b45b304",
            Analytics::class.java, Crashes::class.java
        )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        option = findViewById(R.id.spEmail)
        option.adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            spinnerArray
        )

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                
            }

        }

    }
}
