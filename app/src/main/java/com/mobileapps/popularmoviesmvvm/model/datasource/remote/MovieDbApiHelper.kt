package com.mobileapps.popularmoviesmvvm.model.datasource.remote

object MovieDbApiHelper {
    const val BASE_URL = "https://api.themoviedb.org/3/"
    const val API_KEY    = "4f9c18edc7a03e1e4444fae0a16350a1"
    const val BASE_IMAGE = "https://image.tmdb.org/t/p/w342"
    const val DB_MOVIE_DETAIL_PATH = "movie/{movieId}"
    const val DB_POPULAR_MOVIES_PATH = "discover/movie?sort_by=popularity.desc"
}