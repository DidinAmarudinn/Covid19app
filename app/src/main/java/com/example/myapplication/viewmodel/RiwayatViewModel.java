package com.example.myapplication.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.api.Api;
import com.example.myapplication.api.ApiEndPoint;
import com.example.myapplication.api.ApiService;
import com.example.myapplication.model.RiwayatModel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RiwayatViewModel extends ViewModel {
    private MutableLiveData<ArrayList<RiwayatModel>> mutableLiveData=new MutableLiveData<>();
    public void setTodayData(){
        Retrofit retrofit= ApiService.getRetrofitService();
        ApiEndPoint apiEndPoint=retrofit.create(ApiEndPoint.class);
        Call<List<RiwayatModel>> call=apiEndPoint.getHistoryList();
        call.enqueue(new Callback<List<RiwayatModel>>() {
            @Override
            public void onResponse(Call<List<RiwayatModel>> call, Response<List<RiwayatModel>> response) {
                mutableLiveData.setValue((ArrayList<RiwayatModel>)response.body());
            }

            @Override
            public void onFailure(Call<List<RiwayatModel>> call, Throwable t) {

            }
        });
    }

    private String getFormattDate() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM-dd-yy", Locale.getDefault());
        return simpleDateFormat.format(yesterday());
    }

    private Date yesterday() {
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DATE,-1);
        return calendar.getTime();
    }
    public LiveData<ArrayList<RiwayatModel>> getTodayList() {
        return mutableLiveData;
    }
}
