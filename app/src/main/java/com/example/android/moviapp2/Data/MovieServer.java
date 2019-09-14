package com.example.android.moviapp2.Data;


import com.example.android.moviapp2.Model.MoviesList;
import com.example.android.moviapp2.Model.ReviewListModel;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieServer {
    @GET("/3/movie/{popular}?")
    Call<MoviesList> getMovies(@Path("popular") String IsPopular, @Query("api_key") String apiKey);

    @GET("/3/movie/{id}/{reviews}?")
    Call<ReviewListModel> getReviewsAndTrailers(@Path("id") int movieId, @Path("reviews") String queryKind, @Query("api_key") String apiKey);

}
