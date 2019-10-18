package com.mobileapps.popularmoviesmvvm.views.adapter

import android.content.Intent
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mobileapps.popularmoviesmvvm.R
import com.mobileapps.popularmoviesmvvm.inflate
import com.mobileapps.popularmoviesmvvm.model.datasource.remote.MovieDbApiHelper.BASE_IMAGE
import com.mobileapps.popularmoviesmvvm.model.themoviedb.MovieDbResponse
import com.mobileapps.popularmoviesmvvm.views.MovieDetailActivity
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieDbAdapter(private val responses: List<MovieDbResponse.Results>) : RecyclerView.Adapter<MovieDbAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflatedView = parent.inflate(R.layout.movie_item)
        return ViewHolder(inflatedView)
    }

    override fun getItemCount() = responses.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemResponse = responses[position]
        holder.bindResponse(itemResponse)
    }

    class ViewHolder(v : View) : RecyclerView.ViewHolder(v){
        private var view = v
        private var response : MovieDbResponse.Results? = null


        fun bindResponse(response: MovieDbResponse.Results){
            this.response = response
            Glide.with(view)
                .load(BASE_IMAGE+response.poster_path)
                .centerCrop()
                .placeholder(R.drawable.default_movie)
                .fallback(R.drawable.default_movie)
                .into(view.imgPostMovie)
            view.setOnClickListener {
                val intent = Intent(view.context,MovieDetailActivity::class.java)
                intent.putExtra("MOVIE_KEY",response.id.toString())
                view.context.startActivity(intent)
            }
        }
    }
}