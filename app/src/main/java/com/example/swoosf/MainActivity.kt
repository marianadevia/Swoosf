package com.example.swoosf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStartedButton = findViewById<Button>(R.id.get_started)
        getStartedButton.setOnClickListener {
            startLeaguesScreen()
        }
    }

    private fun startLeaguesScreen(){
        val intent = Intent(this, LeaguesActivity::class.java)
        startActivity(intent)
    }
}
