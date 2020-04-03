package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.data.CovidData;
import com.example.myapplication.model.CovidModel;

import java.util.ArrayList;

public class CovidAct extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView rv_covid;
    private ArrayList<CovidModel> list=new ArrayList<>();
    private ImageView img_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid);
        rv_covid=findViewById(R.id.rv_covid);
        img_back=findViewById(R.id.img_back);
        rv_covid.setLayoutManager(new LinearLayoutManager(this));
        list.addAll(CovidData.getListData());
        CovidAdapter covidAdapter=new CovidAdapter(list);
        rv_covid.setHasFixedSize(true);
        rv_covid.setAdapter(covidAdapter);
        img_back.setOnClickListener(this);
    }private boolean loadFragment(Fragment fragment) {
        if (fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.flMain,fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public void onClick(View v) {
        Fragment fragment=null;
        switch (v.getId()){
                case R.id.img_back:
                fragment=new RiwayatFragment();
                break;
        }

        loadFragment(fragment);
    }
}
