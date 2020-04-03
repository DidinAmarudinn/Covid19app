package com.example.myapplication.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.api.ApiEndPoint;
import com.example.myapplication.api.ApiService;
import com.example.myapplication.model.CountryModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CountryViewModel extends ViewModel {
    private MutableLiveData<CountryModel> mutableLiveData=new MutableLiveData<>();
    public void setCountryData(){
        Retrofit retrofit= ApiService.getRetrofitService();
        ApiEndPoint apiEndPoint=retrofit.create(ApiEndPoint.class);
        Call<CountryModel> call=apiEndPoint.getSummaryIdn();
        call.enqueue(new Callback<CountryModel>() {
            @Override
            public void onResponse(Call<CountryModel> call, Response<CountryModel> response) {
                mutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<CountryModel> call, Throwable t) {

            }
        });
    }
    public LiveData<CountryModel> getCountryData(){
        return mutableLiveData;
    }
}
