package com.brian.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.brian.swoosh.Utils.EXTRA_LEAGUE
import com.brian.swoosh.R

class SkillActivity : AppCompatActivity() {
    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
}
