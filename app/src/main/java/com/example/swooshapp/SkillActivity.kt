package com.example.swooshapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var selectedSkill = ""
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClicked(view: View){

        toggleBallerBtn.isChecked = false
        selectedSkill = "Beginner"
    }

    fun onBallerClicked (view: View){

        toggleBeginnerBtn.isChecked = false
        selectedSkill = "Baller"
    }
}
