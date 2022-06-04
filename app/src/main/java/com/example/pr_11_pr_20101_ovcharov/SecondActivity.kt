package com.example.pr_11_pr_20101_ovcharov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    fun onClickStepsActivity(view: View){
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }

}