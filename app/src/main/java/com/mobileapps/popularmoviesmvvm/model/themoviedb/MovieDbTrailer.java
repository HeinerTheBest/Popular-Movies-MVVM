package com.mobileapps.popularmoviesmvvm.model.themoviedb;

import java.util.List;

@SuppressWarnings("all")
public class MovieDbTrailer {
    private final int id;

    private final List<Results> results;

    public MovieDbTrailer(int id, List<Results> results) {
        this.id = id;
        this.results = results;
    }

    public int getId() {
        return id;
    }

    public List<Results> getResults() {
        return results;
    }

    public static class Results {
        private final String id;

        private final String iso6391;

        private final String iso31661;

        private final String key;

        private final String name;

        private final String site;

        private final int size;

        private final String type;

        public Results(String id, String iso6391, String iso31661, String key, String name,
                       String site, int size, String type) {
            this.id = id;
            this.iso6391 = iso6391;
            this.iso31661 = iso31661;
            this.key = key;
            this.name = name;
            this.site = site;
            this.size = size;
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public String getIso6391() {
            return iso6391;
        }

        public String getIso31661() {
            return iso31661;
        }

        public String getKey() {
            return key;
        }

        public String getName() {
            return name;
        }

        public String getSite() {
            return site;
        }

        public int getSize() {
            return size;
        }

        public String getType() {
            return type;
        }
    }
}
