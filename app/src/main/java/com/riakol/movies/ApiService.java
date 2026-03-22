package com.riakol.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET("movie?rating.kp=7-10&sortField=votes.kp&sortType=-1&notNullFields=videos.trailers.url&notNullFields=poster.url&limit=30")
    @Headers("X-API-KEY:" + BuildConfig.API_KEY_KP)
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie/{id}")
    @Headers("X-API-KEY:" + BuildConfig.API_KEY_KP)
    Single<TrailerResponse> loadTrailers(
            @Path("id") int id
    );

    @GET("review")
    @Headers("X-API-KEY:" + BuildConfig.API_KEY_KP)
    Single<ReviewResponse> loadReviews(@Query("movieId") int id);
}
