package com.mobileapps.popularmoviesmvvm.model.themoviedb;

import javax.annotation.Generated;
import java.util.List;

@Generated("io.t28.json2java.core.JavaConverter")
@SuppressWarnings("all")
public class MovieDbDetailResponse {
    private final boolean adult;

    private final String backdropPath;

    private final Object belongsToCollection;

    private final int budget;

    private final List<Genres> genres;

    private final String homepage;

    private final int id;

    private final String imdbId;

    private final String originalLanguage;

    private final String originalTitle;

    private final String overview;

    private final double popularity;

    private final String posterPath;

    private final List<ProductionCompanies> productionCompanies;

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

    public MovieDbDetailResponse(boolean adult, String backdropPath, Object belongsToCollection,
                                 int budget, List<Genres> genres, String homepage, int id, String imdbId,
                                 String originalLanguage, String originalTitle, String overview, double popularity,
                                 String posterPath, List<ProductionCompanies> productionCompanies,
                                 List<ProductionCountries> productionCountries, String releaseDate, int revenue,
                                 int runtime, List<SpokenLanguages> spokenLanguages, String status, String tagline,
                                 String title, boolean video, double voteAverage, int voteCount) {
        this.adult = adult;
        this.backdropPath = backdropPath;
        this.belongsToCollection = belongsToCollection;
        this.budget = budget;
        this.genres = genres;
        this.homepage = homepage;
        this.id = id;
        this.imdbId = imdbId;
        this.originalLanguage = originalLanguage;
        this.originalTitle = originalTitle;
        this.overview = overview;
        this.popularity = popularity;
        this.posterPath = posterPath;
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

    public String getBackdropPath() {
        return backdropPath;
    }

    public Object getBelongsToCollection() {
        return belongsToCollection;
    }

    public int getBudget() {
        return budget;
    }

    public List<Genres> getGenres() {
        return genres;
    }

    public String getHomepage() {
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

    public String getPosterPath() {
        return posterPath;
    }

    public List<ProductionCompanies> getProductionCompanies() {
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

    public static class ProductionCompanies {
        private final int id;

        private final String logoPath;

        private final String name;

        private final String originCountry;

        public ProductionCompanies(int id, String logoPath, String name, String originCountry) {
            this.id = id;
            this.logoPath = logoPath;
            this.name = name;
            this.originCountry = originCountry;
        }

        public int getId() {
            return id;
        }

        public String getLogoPath() {
            return logoPath;
        }

        public String getName() {
            return name;
        }

        public String getOriginCountry() {
            return originCountry;
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
