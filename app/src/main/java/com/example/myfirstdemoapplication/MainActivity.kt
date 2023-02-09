package com.example.myfirstdemoapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonUpload= findViewById<Button>(R.id.btnUpload)
        val buttonDownload= findViewById<Button>(R.id.btnDownload)
        val btnIntent= findViewById<Button>(R.id.button)

        buttonUpload.setOnClickListener(){
            Toast.makeText(applicationContext,"Uploading...",Toast.LENGTH_SHORT).show()
        }
        buttonDownload.setOnClickListener(){
            Toast.makeText(applicationContext,"Downloading....",Toast.LENGTH_SHORT).show()
        }
        btnIntent.setOnClickListener(){
            //connecting the second activity with the button :
            intent=Intent(applicationContext,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}