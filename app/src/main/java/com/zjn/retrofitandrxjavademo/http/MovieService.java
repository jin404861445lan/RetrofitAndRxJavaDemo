package com.zjn.retrofitandrxjavademo.http;

import com.zjn.retrofitandrxjavademo.entity.MovieEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by houtouke on 16/11/24.
 */

public interface MovieService {
    //@GET("top250")
    //Call<MovieEntity> getTopMovie(@Query("start") int start, @Query("count") int count);
    @GET("top250")
    Observable<MovieEntity> getTopMovie(@Query("start") int start, @Query("count") int count);

}
