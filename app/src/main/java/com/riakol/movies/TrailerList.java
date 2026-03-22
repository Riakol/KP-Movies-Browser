package com.riakol.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TrailerList {
    @SerializedName("trailers")
    private List<Trailer> trailers;

    public TrailerList(List<Trailer> trailers) {
        this.trailers = trailers;
    }

    public List<Trailer> getTrailers() {
        return trailers;
    }

    @Override
    public String toString() {
        return "TrailerList{" +
                "trailers=" + trailers +
                '}';
    }
}

