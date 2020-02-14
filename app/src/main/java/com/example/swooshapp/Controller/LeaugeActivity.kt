package com.example.swooshapp.Controller

import android.widget.Toast
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.swooshapp.Utilities.EXTRA_LEAGUE
import com.example.swooshapp.R
import kotlinx.android.synthetic.main.activity_leauge.*

class LeaugeActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leauge)
    }


    fun onMenClicked(view: View){

        toggleWomenBtn.isChecked = false
        toggleCoEdBtn.isChecked = false

        selectedLeague = "Men"
    }

    fun onWomenClicked(view: View){

        toggleMenBtn.isChecked = false
        toggleCoEdBtn.isChecked = false

        selectedLeague = "Women"
    }

    fun onCoEdClicked(view: View){

        toggleMenBtn.isChecked = false
        toggleWomenBtn.isChecked = false

        selectedLeague = "Co-Ed"
    }

    fun getStartedClicked (view: View){
        if (selectedLeague != "") {

            val intent = Intent(this, SkillActivity::class.java)
            intent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(intent)
        } else{

            Toast.makeText(this,"Please select the league...",Toast.LENGTH_SHORT).show()
        }
    }

}


