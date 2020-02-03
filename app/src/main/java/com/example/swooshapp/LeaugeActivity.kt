package com.example.swooshapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

        selectedLeague = "men"
    }

    fun onWomenClicked(view: View){

        toggleMenBtn.isChecked = false
        toggleCoEdBtn.isChecked = false

        selectedLeague = "women"
    }

    fun onCoEdClicked(view: View){

        toggleMenBtn.isChecked = false
        toggleWomenBtn.isChecked = false

        selectedLeague = "co ed"
    }
}
