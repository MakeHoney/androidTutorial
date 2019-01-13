package com.brian.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.brian.swoosh.Model.Player
import com.brian.swoosh.Utils.EXTRA_PLAYER
import com.brian.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onSkillFinishClicked (view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
//            finishActivity.putExtra(EXTRA_SKILL, skill)
//            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBeginnerClicked (view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerClicked (view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }
}
