package com.example.myapplication;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.myapplication.model.CountryModel;
import com.example.myapplication.model.ProvinsiModel;
import com.example.myapplication.model.RiwayatModel;
import com.example.myapplication.viewmodel.CountryViewModel;
import com.example.myapplication.viewmodel.ProvinsiViewModel;
import com.example.myapplication.viewmodel.RiwayatViewModel;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class HomeFragment extends Fragment {
    private Object DateFormat;
    private DetailProvinsiAdapter adapter;
    private ProgressDialog mProgressApp;
    public HomeFragment(){

     }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_home, container, false);
        TextView tv_recovered=view.findViewById(R.id.tv_recovered);
        TextView tv_confirmed=view.findViewById(R.id.tv_confirmed);
        TextView tv_deaths=view.findViewById(R.id.tv_deaths);

        mProgressApp = new ProgressDialog(getActivity());
        mProgressApp.setTitle("Please Wait");
        mProgressApp.setCancelable(false);
        mProgressApp.setMessage("Show Data");
        mProgressApp.show();
        RecyclerView recyclerView=view.findViewById(R.id.rv_provinsi);
        adapter= new DetailProvinsiAdapter(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        loadListData();
        final PieChart pieChart=view.findViewById(R.id.idnSummaryPie);
        CountryViewModel viewModel=new ViewModelProvider(this,new ViewModelProvider.NewInstanceFactory()).
                get(CountryViewModel.class);
        viewModel.setCountryData();
        viewModel.getCountryData().observe(this, new Observer<CountryModel>() {
            @Override
            public void onChanged(CountryModel countryModel) {
                mProgressApp.dismiss();
                List<PieEntry> pieEntries=new ArrayList<>();
                tv_confirmed.setText(countryModel.getIdnConfirmed().getValue().toString());
                tv_deaths.setText(countryModel.getIdnDeaths().getValue().toString());
                tv_recovered.setText(countryModel.getIdnRecovered().getValue().toString());
                pieEntries.add(new PieEntry(Float.parseFloat(countryModel.getIdnRecovered().getValue()), getResources().getString(R.string.recovered)));
                pieEntries.add(new PieEntry(Float.parseFloat(countryModel.getIdnConfirmed().getValue()),getResources().getString(R.string.confirmed)));
                pieEntries.add(new PieEntry(Float.parseFloat(countryModel.getIdnDeaths().getValue()),getResources().getString(R.string.death)));
                PieDataSet pieDataSet=new PieDataSet(pieEntries,getResources().getString(R.string.from_corona));
                pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
                pieDataSet.setValueTextColor(Color.WHITE);
                pieDataSet.setValueTextSize(14);

                Description description=new Description();
                description.setText(getResources().getString(R.string.last_update)+ " : " +countryModel.getLatUpdate());
                description.setTextColor(Color.BLACK);
                description.setTextSize(12);

                Legend legend=pieChart.getLegend();
                legend.setTextColor(Color.BLACK);
                legend.setTextSize(12);
                legend.setForm(Legend.LegendForm.SQUARE);

                PieData pieData=new PieData(pieDataSet);

                pieChart.setVisibility(View.VISIBLE);
                pieChart.animateXY(2000,2000);
                pieChart.setDescription(description);
                pieChart.setHoleRadius(60);
                pieChart.setRotationAngle(130);
                pieChart.setHoleColor(Color.TRANSPARENT);
                pieChart.setData(pieData);

            }
        });
       return view;
    }
    private void setCount(){
    }
    private void loadListData() {
        ProvinsiViewModel viewModel=new ViewModelProvider(this,
                new ViewModelProvider.NewInstanceFactory()).get(ProvinsiViewModel.class);
        viewModel.setProvinsiData();
        mProgressApp.show();
       viewModel.setProvinsiData();
       viewModel.getProvinsiData().observe(this, new Observer<ArrayList<ProvinsiModel>>() {
           @Override
           public void onChanged(ArrayList<ProvinsiModel> provinsiModels) {
               adapter.setProvinsiModel(provinsiModels);
               mProgressApp.dismiss();
           }
       });
    }

}
