package com.mobileapps.popularmoviesmvvm.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mobileapps.popularmoviesmvvm.model.datasource.remote.MovieDbApiHelper.getApi
import com.mobileapps.popularmoviesmvvm.model.themoviedb.MovieDbDetailResponse
import com.mobileapps.popularmoviesmvvm.model.themoviedb.MovieDbResponse
import com.mobileapps.popularmoviesmvvm.model.themoviedb.MovieDbTrailer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PopularMoviesViewModel : ViewModel()
{
    private lateinit var popularMoviesList: MutableLiveData<MovieDbResponse>
    private lateinit var trailers : MutableLiveData<MovieDbTrailer>
    private lateinit var detailsMovie : MutableLiveData<MovieDbDetailResponse>



    fun getPopularMovies() : LiveData<MovieDbResponse>{
        if(!::popularMoviesList.isInitialized){
            popularMoviesList = MutableLiveData()
            loadPopularMovies()
        }
        return popularMoviesList
    }

    fun getTrailers(movieId: String) : LiveData<MovieDbTrailer>{
        if(!::trailers.isInitialized){
            trailers = MutableLiveData()
            loadTrailers(movieId)
        }
        return trailers
    }

    fun getDetailOfMovie(movieId: String) : LiveData<MovieDbDetailResponse>{
        if(!::detailsMovie.isInitialized){
            detailsMovie = MutableLiveData()
            loadDetailMovie(movieId)
        }
        return detailsMovie
    }

    private fun loadDetailMovie(movieId: String) {
        val call : Call<MovieDbDetailResponse> = getApi().getMovieDetail(movieId)
        call.enqueue(object  : Callback<MovieDbDetailResponse>{
            override fun onFailure(call: Call<MovieDbDetailResponse>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<MovieDbDetailResponse>, response: Response<MovieDbDetailResponse>) {
               detailsMovie.value = response.body()
            }
        })
    }

    private fun loadTrailers(movieId: String) {
        val call : Call<MovieDbTrailer> = getApi().getMovieTrailer(movieId)
        call.enqueue(object  : Callback<MovieDbTrailer>{
            override fun onFailure(call: Call<MovieDbTrailer>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<MovieDbTrailer>, response: Response<MovieDbTrailer>) {
                trailers.value = response.body()
            }
        })

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