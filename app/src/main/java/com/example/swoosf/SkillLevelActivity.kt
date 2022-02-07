package com.example.swoosf

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.swoosf.model.Player

class SkillLevelActivity : AppCompatActivity(){
    companion object{
        private const val KEY = "PLAYER"
        fun createIntent(context: Context, player: Player): Intent {
            val intent = Intent(context,SkillLevelActivity::class.java)
            intent.putExtra(KEY, player)
            return intent
        }
    }

    private lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_level)
        val backButton = findViewById<ImageView>(R.id.back_button)
        backButton.setOnClickListener{
            goBack()
        }

        player= intent.extras?.getParcelable(KEY)?: Player()
        Log.v("SkillLevelActivity", "Received Player: $player")
    }

    private fun goBack(){
        onBackPressed()
    }
}