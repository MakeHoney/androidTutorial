package com.brian.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.brian.swoosh.Model.Player
import com.brian.swoosh.R
import com.brian.swoosh.Utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

//        val league = intent.getStringExtra(EXTRA_LEAGUE)
//        val skill = intent.getStringExtra(EXTRA_SKILL)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.setText("Looking for ${player.league} ${player.skill} league near you...")
    }
}
