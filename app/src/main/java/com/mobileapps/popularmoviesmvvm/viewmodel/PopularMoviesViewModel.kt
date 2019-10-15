package com.mobileapps.popularmoviesmvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mobileapps.popularmoviesmvvm.model.datasource.remote.MovieDbApiHelper.getApi
import com.mobileapps.popularmoviesmvvm.model.themoviedb.MovieDbResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PopularMoviesViewModel : ViewModel()
{
    private lateinit var popularMoviesList: MutableLiveData<MovieDbResponse>


    fun getPopularMovies() : LiveData<MovieDbResponse>{
        if(!::popularMoviesList.isInitialized){
            popularMoviesList = MutableLiveData()
            loadPopularMovies()
        }
        return popularMoviesList
    }

    private fun loadPopularMovies() {
       val call : Call<MovieDbResponse> = getApi().getPopularMovies()
        call.enqueue(object :Callback<MovieDbResponse>{
            override fun onFailure(call: Call<MovieDbResponse>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<MovieDbResponse>, response: Response<MovieDbResponse>) {
                popularMoviesList.value = response.body()
            }

        })
    }

}