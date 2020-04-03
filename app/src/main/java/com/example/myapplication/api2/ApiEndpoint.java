package com.example.myapplication.api2;

import com.example.myapplication.model.ProvinsiModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiEndpoint {
    @GET(Api.END_POINT_PROVINSI)
    Call<List<ProvinsiModel>> getProvinsi();
}
