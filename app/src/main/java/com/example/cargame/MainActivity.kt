package com.example.cargame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity(),GameTask {
    lateinit var rootLayout: LinearLayout
    lateinit var startbutton: Button
    lateinit var mGameView: GameView
    lateinit var score: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startbutton = findViewById(R.id.startbuttton)
        rootLayout = findViewById(R.id.rootLayout)
        score = findViewById(R.id.score)
        mGameView= GameView(this,this)
        startbutton.setOnClickListener {
            mGameView.setBackgroundResource(R.drawable.road)
            rootLayout.addView(mGameView)
            startbutton.visibility = View.GONE
            startbutton.visibility=View.GONE
            score.visibility = View.GONE

        }
    }
    override fun closeGame(mScore:Int){
        score.text = "Score : $mScore"
        rootLayout.removeView(mGameView)
       startbutton.visibility=View.VISIBLE
        score.visibility = View.VISIBLE
    }


}