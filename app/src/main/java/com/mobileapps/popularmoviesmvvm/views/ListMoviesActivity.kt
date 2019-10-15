package com.mobileapps.popularmoviesmvvm.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.mobileapps.popularmoviesmvvm.R
import com.mobileapps.popularmoviesmvvm.viewmodel.PopularMoviesViewModel
import com.mobileapps.popularmoviesmvvm.views.adapter.MovieDbAdapter
import kotlinx.android.synthetic.main.activity_main.*

class ListMoviesActivity : AppCompatActivity() {
    private lateinit var adapter : MovieDbAdapter
    private lateinit var viewModel: PopularMoviesViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(PopularMoviesViewModel::class.java)

        viewModel.getPopularMovies().observe(this, Observer {
            viewModel->
            adapter = MovieDbAdapter(viewModel.results)
            rvPopularMovies.layoutManager = GridLayoutManager(this,2)
            rvPopularMovies.adapter = adapter
        })
    }
}
