package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.data.CovidData;
import com.example.myapplication.data.ProtectData;
import com.example.myapplication.model.ProtectModel;

import java.util.ArrayList;

public class ProtectAct extends AppCompatActivity {
    private RecyclerView rv_protect;
    private ArrayList<ProtectModel> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protect);
        rv_protect=findViewById(R.id.rv_protect);
        rv_protect.setLayoutManager(new LinearLayoutManager(this));
        list.addAll(ProtectData.getListData());
        ProtectAdapter protectAdapter=new ProtectAdapter(list);
        rv_protect.setHasFixedSize(true);
        rv_protect.setAdapter(protectAdapter);
    }
}
