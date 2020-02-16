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

    override fun onSaveInstanceState(outState: Bundle) {

        super.onSaveInstanceState(outState)
        outState?.putString(EXTRA_LEAGUE, selectedLeague)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leauge)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {

        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){

            selectedLeague = savedInstanceState.getString(EXTRA_LEAGUE).toString()
        }
    }


    fun onMenClicked(view: View){

        toggleWomenBtn.isChecked = false
        toggleCoEdBtn.isChecked = false

        selectedLeague = "Men"

        if (toggleMenBtn.isChecked == false){
            selectedLeague = ""
        }
    }

    fun onWomenClicked(view: View){

        toggleMenBtn.isChecked = false
        toggleCoEdBtn.isChecked = false

        selectedLeague = "Women"

        if (toggleWomenBtn.isChecked == false){
            selectedLeague = ""
        }
    }

    fun onCoEdClicked(view: View){

        toggleMenBtn.isChecked = false
        toggleWomenBtn.isChecked = false

        selectedLeague = "Co-Ed"

        if (toggleCoEdBtn.isChecked == false){
            selectedLeague = ""
        }
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


