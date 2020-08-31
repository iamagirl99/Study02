package com.example.study02

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBoxOffice.setOnClickListener { //상영중인 영화 버튼 눌렀을때
            val intent = Intent(this, MovieListActivity::class.java) //MovieListActivity로 넘어가는 Intent 선언
            startActivity(intent)
        }

        btnNaverMovie.setOnClickListener { //네이버 영화 버튼 눌렀을때
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://movie.naver.com/")) //네이버 영화 웹페이지로 넘어가는 Intent 선언
            startActivity(intent)
        }
    }
}