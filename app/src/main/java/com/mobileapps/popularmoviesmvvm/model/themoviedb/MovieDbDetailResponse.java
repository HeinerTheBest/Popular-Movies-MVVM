package com.mobileapps.popularmoviesmvvm.model.themoviedb;

import java.util.List;

@SuppressWarnings("all")
public class MovieDbDetailResponse {
    private final boolean adult;

    private final Object backdropPath;

    private final int budget;

    private final List<Genres> genres;

    private final Object homepage;

    private final int id;

    private final String imdbId;

    private final String originalLanguage;

    private final String originalTitle;

    private final String overview;

    private final double popularity;

    private final String poster_path;

    private final List<Object> productionCompanies;

    private final List<ProductionCountries> productionCountries;

    private final String releaseDate;

    private final int revenue;

    private final int runtime;

    private final List<SpokenLanguages> spokenLanguages;

    private final String status;

    private final String tagline;

    private final String title;

    private final boolean video;

    private final double voteAverage;

    private final int voteCount;

    public MovieDbDetailResponse(boolean adult, Object backdropPath, int budget, List<Genres> genres,
                                 Object homepage, int id, String imdbId, String originalLanguage, String originalTitle,
                                 String overview, double popularity, String poster_path, List<Object> productionCompanies,
                                 List<ProductionCountries> productionCountries, String releaseDate, int revenue,
                                 int runtime, List<SpokenLanguages> spokenLanguages, String status, String tagline,
                                 String title, boolean video, double voteAverage, int voteCount) {
        this.adult = adult;
        this.backdropPath = backdropPath;
        this.budget = budget;
        this.genres = genres;
        this.homepage = homepage;
        this.id = id;
        this.imdbId = imdbId;
        this.originalLanguage = originalLanguage;
        this.originalTitle = originalTitle;
        this.overview = overview;
        this.popularity = popularity;
        this.poster_path = poster_path;
        this.productionCompanies = productionCompanies;
        this.productionCountries = productionCountries;
        this.releaseDate = releaseDate;
        this.revenue = revenue;
        this.runtime = runtime;
        this.spokenLanguages = spokenLanguages;
        this.status = status;
        this.tagline = tagline;
        this.title = title;
        this.video = video;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
    }

    public boolean isAdult() {
        return adult;
    }

    public Object getBackdropPath() {
        return backdropPath;
    }

    public int getBudget() {
        return budget;
    }

    public List<Genres> getGenres() {
        return genres;
    }

    public Object getHomepage() {
        return homepage;
    }

    public int getId() {
        return id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public List<Object> getProductionCompanies() {
        return productionCompanies;
    }

    public List<ProductionCountries> getProductionCountries() {
        return productionCountries;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getRevenue() {
        return revenue;
    }

    public int getRuntime() {
        return runtime;
    }

    public List<SpokenLanguages> getSpokenLanguages() {
        return spokenLanguages;
    }

    public String getStatus() {
        return status;
    }

    public String getTagline() {
        return tagline;
    }

    public String getTitle() {
        return title;
    }

    public boolean isVideo() {
        return video;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public int getVoteCount() {
        return voteCount;
    }


    public static class Genres {
        private final int id;

        private final String name;

        public Genres(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static class ProductionCountries {
        private final String iso31661;

        private final String name;

        public ProductionCountries(String iso31661, String name) {
            this.iso31661 = iso31661;
            this.name = name;
        }

        public String getIso31661() {
            return iso31661;
        }

        public String getName() {
            return name;
        }
    }

    public static class SpokenLanguages {
        private final String iso6391;

        private final String name;

        public SpokenLanguages(String iso6391, String name) {
            this.iso6391 = iso6391;
            this.name = name;
        }

        public String getIso6391() {
            return iso6391;
        }

        public String getName() {
            return name;
        }
    }
}
