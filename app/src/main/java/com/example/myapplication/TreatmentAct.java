package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.data.ProtectData;
import com.example.myapplication.data.TreatmentData;
import com.example.myapplication.model.ProtectModel;
import com.example.myapplication.model.TreatmentModel;

import java.util.ArrayList;

public class TreatmentAct extends AppCompatActivity {
    private RecyclerView rv_treatment;
    private ArrayList<TreatmentModel> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment);
        rv_treatment=findViewById(R.id.rv_treatment);
        rv_treatment.setLayoutManager(new LinearLayoutManager(this));
        list.addAll(TreatmentData.getListData());
        TreatmentAdapter treatmentAdapter=new TreatmentAdapter(list);
        rv_treatment.setHasFixedSize(true);
        rv_treatment.setAdapter(treatmentAdapter);
    }
}
