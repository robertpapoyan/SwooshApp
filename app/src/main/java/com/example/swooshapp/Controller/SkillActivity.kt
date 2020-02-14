package com.example.swooshapp.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swooshapp.Utilities.EXTRA_LEAGUE
import com.example.swooshapp.R
import com.example.swooshapp.Utilities.EXTRA_SKILL
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

        if(toggleBeginnerBtn.isChecked == false){
            selectedSkill = ""
        }
    }

    fun onBallerClicked (view: View){

        toggleBeginnerBtn.isChecked = false
        selectedSkill = "Baller"

        if (toggleBallerBtn.isChecked == false){
            selectedSkill = ""
        }
    }

    fun onFinishClicked(view: View){
        if (selectedSkill != ""){

            val finishActivity = Intent(this, FinalActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, selectedSkill)
            startActivity(finishActivity)
        } else {

            Toast.makeText(this, "Please select the skill level...",Toast.LENGTH_SHORT).show()
        }

    }
}
