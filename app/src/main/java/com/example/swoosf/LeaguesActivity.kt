package com.example.swoosf

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.swoosf.model.Player

class LeaguesActivity : AppCompatActivity(){
    private val player = Player()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leagues)

        val nextButton = findViewById<Button>(R.id.next)
        nextButton.setOnClickListener {
            startSkillLevelsActivity()

        }

        val menLeagueButton = findViewById<Button>(R.id.mens_league)
        menLeagueButton.setOnClickListener{
            enableNextButton(nextButton, "mens")
        }

        val womenLeagueButton = findViewById<Button>(R.id.womens_league)
        womenLeagueButton.setOnClickListener{
            enableNextButton(nextButton, "womens")

        }
        val coedsButton = findViewById<Button>(R.id.coed_league)
        coedsButton.setOnClickListener{
            enableNextButton(nextButton, "Co-eds")
        }
    }

    private fun startSkillLevelsActivity(){
        var intent = SkillLevelActivity.createIntent(this, player)
        startActivity(intent)
    }

    private fun enableNextButton(nextButton: Button, desiredLeague:String){
        player.desiredLeague=desiredLeague
        nextButton.isEnabled = true

    }
}