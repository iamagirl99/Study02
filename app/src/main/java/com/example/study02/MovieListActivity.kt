package com.example.study02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_movie_list.*
import java.util.ArrayList

/*
 1. Movie Data Class 만들기
 2. 영화 정보를 담은 ArrayList 만들기
 3. RecyclerView Adapter 만들기
 */


class MovieListActivity : AppCompatActivity() {

    //영화 정보를 담고있는 ArrayList 만들기.
    val movieList : ArrayList<Movie> = arrayListOf(
        Movie("테넷", 99.99, "시간의 흐름은...", "2020-08-26", R.drawable.m2),
        Movie("소년 시절의 너", 17.33, "넌 세상을 지켜....", "2020-07-09", R.drawable.m4),
        Movie("덩케르트 이스케이프", 80.06, "역사에 기록되지 않은...", "2020-08-03", R.drawable.m3),
        Movie("짱구는 못말려: 신혼여행 허리케인", 5.9, "짱구 The Movie...", "2020-08-07", R.drawable.m1)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

       val adapter = MovieAdapter(this, movieList) //Adapter 선언
        movieRecycler.adapter = adapter //RecyclerView에 우리가 만든 MovieAdapter 선언

        val lm = LinearLayoutManager(this) //LinearLayoutManager 선언
        movieRecycler.layoutManager = lm //RecyclerView에 LinearLayoutManager 셋팅
    }
}