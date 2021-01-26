package com.example.newsdaily

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.news_category.*

class NewsCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.news_category)
        allNewsButton.setOnClickListener {
            urlChooser("all")
        }
        nationalNewsButton.setOnClickListener{
            urlChooser("national")
        }
        entertainmentNewsButton.setOnClickListener {
            urlChooser("entertainment")
        }
        businessNewsButton.setOnClickListener {
            urlChooser("business")
        }
        sportsNewsButton.setOnClickListener {
            urlChooser("sports")
        }
        globalNewsButton.setOnClickListener {
            urlChooser("world")
        }
        politicalNewsButton.setOnClickListener {
            urlChooser("politics")
        }
        techNewsButton.setOnClickListener {
            urlChooser("technology")
        }
        autoNewsButton.setOnClickListener {
            urlChooser("automobile")
        }
    }
    private fun urlChooser(category:String) {
        val url = "https://inshortsapi.vercel.app/news?category=$category"
        val intent = Intent(this,NewsActivity::class.java).putExtra(NewsActivity.URL,url)
        startActivity(intent)
    }
}
