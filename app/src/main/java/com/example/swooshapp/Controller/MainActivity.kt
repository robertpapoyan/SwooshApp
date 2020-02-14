package com.example.swooshapp.Controller

import android.content.Intent
import android.os.Bundle
import com.example.swooshapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent(this,  LeaugeActivity::class.java)
            startActivity(intent)
        }

    }
}
