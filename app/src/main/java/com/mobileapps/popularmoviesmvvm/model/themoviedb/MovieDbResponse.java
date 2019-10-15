package com.mobileapps.popularmoviesmvvm.model.themoviedb;

import java.util.List;

public class MovieDbResponse {
    private final int page;

    private final int totalResults;

    private final int totalPages;

    private final List<Results> results;

    public MovieDbResponse(int page, int totalResults, int totalPages, List<Results> results) {
        this.page = page;
        this.totalResults = totalResults;
        this.totalPages = totalPages;
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public List<Results> getResults() {
        return results;
    }

    public static class Results {


        private final String poster_path;

        private final int id;

        private final boolean adult;


        private final String title;



        public Results(String posterPath, int id,
                       boolean adult, String title) {

            this.poster_path = posterPath;
            this.id = id;
            this.adult = adult;

            this.title = title;
        }

        public String getPoster_path() {
            return poster_path;
        }

        public int getId() {
            return id;
        }

        public boolean isAdult() {
            return adult;
        }



        public String getTitle() {
            return title;
        }

    }
}
