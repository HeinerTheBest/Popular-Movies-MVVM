package com.mobileapps.popularmoviesmvvm.views

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.mobileapps.popularmoviesmvvm.R
import com.mobileapps.popularmoviesmvvm.model.datasource.remote.MovieDbApiHelper
import com.mobileapps.popularmoviesmvvm.viewmodel.PopularMoviesViewModel
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetailActivity : AppCompatActivity() {
    private lateinit var viewModel: PopularMoviesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        viewModel = ViewModelProviders.of(this).get(PopularMoviesViewModel::class.java)

        val bundle :Bundle ?=intent.extras
        if (bundle!=null){
            val movieId = bundle.getString("MOVIE_KEY")
            viewModel.getTrailers(movieId!!).observe(this, Observer {
                val trailersUrl = it.results
                val listNames = mutableListOf("Play Trailer 1")
                for ( i in 1 .. trailersUrl.size)
                {
                    listNames.add("Play Trailer ${i+1}")
                }
                val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listNames)
                lvTrailers.adapter = adapter



                lvTrailers.setOnItemClickListener { _, _, position, _ ->
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=${trailersUrl[position].key}" ))
                    startActivity(intent)
                }

            })



            viewModel.getDetailOfMovie(movieId).observe(this, Observer {
                tvTittleMovie.text = it.title
                tvOverview.text = it.overview
                Glide.with(this)
                    .load(MovieDbApiHelper.BASE_IMAGE +it.poster_path)
                    .centerCrop()
                    .placeholder(R.drawable.default_movie)
                    .fallback(R.drawable.default_movie)
                    .into(imgPostMovie)
            })

        }
    }
}
