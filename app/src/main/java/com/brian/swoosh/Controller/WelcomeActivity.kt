package com.brian.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.brian.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedBtn.setOnClickListener {
            // this is explicit intent (LeagueActivity 를 명시했기 때문)
            // 첫 번째 인자인 this 는 context 를 나타낸다.
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
