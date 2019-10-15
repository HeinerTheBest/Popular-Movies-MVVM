package com.mobileapps.popularmoviesmvvm.model.datasource.remote

import com.mobileapps.popularmoviesmvvm.model.datasource.remote.MovieDbApiHelper.DB_MOVIE_DETAIL_PATH
import com.mobileapps.popularmoviesmvvm.model.datasource.remote.MovieDbApiHelper.DB_POPULAR_MOVIES_PATH
import com.mobileapps.popularmoviesmvvm.model.themoviedb.MovieDbResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface MovieDbApi
{
    @GET(DB_POPULAR_MOVIES_PATH)
    fun getPopularMovies() : Call<MovieDbResponse>

    @GET(DB_MOVIE_DETAIL_PATH)
    fun getMovieDetail(@Path("movieId")id : Int) : Call<MovieDbResponse>
}