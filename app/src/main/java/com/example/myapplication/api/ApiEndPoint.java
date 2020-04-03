package com.example.myapplication.api;

import com.example.myapplication.model.CountryModel;
import com.example.myapplication.model.DailyModel;
import com.example.myapplication.model.RiwayatModel;
import com.example.myapplication.model.WorldModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndPoint {
    @GET(Api.END_POINT_WORLD_HISTORY)
    Call<List<RiwayatModel>> getHistoryList();

    @GET(Api.END_POINT_SUMMARY_WORLD)
    Call<WorldModel> getSummaryWorld();

    @GET(Api.END_POINT_IDN)
    public Call<CountryModel> getSummaryIdn();

    @GET(Api.END_POINT_DAILY)
    public Call<ArrayList<DailyModel>> getDaily();

}
