package com.example.myapplication;

import android.app.ProgressDialog;
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
import android.widget.TextView;

import com.example.myapplication.model.RiwayatModel;
import com.example.myapplication.model.WorldModel;
import com.example.myapplication.viewmodel.RiwayatViewModel;
import com.example.myapplication.viewmodel.WorldViewModel;

import java.util.ArrayList;


public class IndoFragment extends Fragment {
    private RiwayatAdapter adapter;
    private ProgressDialog progressDialog;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_indo, container, false);
        progressDialog=new ProgressDialog(getActivity());
        progressDialog.setTitle("Please Wait");
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Show The Data");
        TextView tv_recovered=view.findViewById(R.id.tv_recovered);
        TextView tv_confirmed=view.findViewById(R.id.tv_confirmed);
        TextView tv_deaths=view.findViewById(R.id.tv_deaths);
        RecyclerView recyclerView=view.findViewById(R.id.rv_country);
        adapter=new RiwayatAdapter(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        loadListData();
        WorldViewModel viewModel=new ViewModelProvider(this,new ViewModelProvider.NewInstanceFactory()).get(WorldViewModel.class);
        viewModel.setSummaryWorldData();
        viewModel.getSummaryWorldData().observe(this, new Observer<WorldModel>() {
            @Override
            public void onChanged(WorldModel worldModel) {
                tv_confirmed.setText(worldModel.getConfirmed().getValue());
                tv_recovered.setText(worldModel.getRecovered().getValue());
                tv_deaths.setText(worldModel.getDeaths().getValue());
            }
        });
        return view;
    }

    private void loadListData() {
        RiwayatViewModel viewModel=new ViewModelProvider(this,
                new ViewModelProvider.NewInstanceFactory()).get(RiwayatViewModel.class);
        viewModel.setTodayData();
        progressDialog.show();
        viewModel.getTodayList().observe(this, new Observer<ArrayList<RiwayatModel>>() {
            @Override
            public void onChanged(ArrayList<RiwayatModel> riwayatModels) {
                adapter.setRiwayatModels(riwayatModels);
                progressDialog.dismiss();
            }
        });
    }
}
