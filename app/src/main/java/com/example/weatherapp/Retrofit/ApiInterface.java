package com.example.weatherapp.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("weather?appid=edfa14526e8367b3b64e7995d51bc890&units=metric")
//API do video: 92756c24107bc39dd0a7541f66ba55c5
    Call<Example> getWeatherData(@Query("q")String name);
}
