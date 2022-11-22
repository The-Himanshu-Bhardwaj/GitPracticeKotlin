package com.example.creative.notes.gitpracticekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG : String = "@@"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: hhhhhhhhhhhh")

        Log.d(TAG, "onCreate: new error")


    }
}