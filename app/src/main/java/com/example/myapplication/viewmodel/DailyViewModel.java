package com.example.myapplication.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.api.ApiEndPoint;
import com.example.myapplication.api.ApiService;
import com.example.myapplication.model.DailyModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class DailyViewModel extends ViewModel {
    private MutableLiveData<ArrayList<DailyModel>> mutableLiveData=new MutableLiveData<>();
    public void setDaily(){
        Retrofit retrofit= ApiService.getRetrofitService();
        ApiEndPoint apiEndPoint=retrofit.create(ApiEndPoint.class);
        Call<ArrayList<DailyModel>> call=apiEndPoint.getDaily();
        call.enqueue(new Callback<ArrayList<DailyModel>>() {
            @Override
            public void onResponse(Call<ArrayList<DailyModel>> call, Response<ArrayList<DailyModel>> response) {
                mutableLiveData.setValue((ArrayList<DailyModel>)response.body());
            }

            @Override
            public void onFailure(Call<ArrayList<DailyModel>> call, Throwable t) {

            }
        });
    }
    private MutableLiveData<ArrayList<DailyModel>> getDaily(){
     return mutableLiveData;
    }
}
