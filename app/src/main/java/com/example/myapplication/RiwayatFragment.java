package com.example.myapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class RiwayatFragment extends Fragment implements View.OnClickListener {
    private ProgressDialog progressDialog;
    public RiwayatFragment(){
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_riwayat, container, false);
        return view;
    }
    @Override
    public void onViewCreated(View view,Bundle savedInstanceState){
        CardView btn_covid19,btn_treatment,btn_protect,btn_hotline;
        btn_covid19=view.findViewById(R.id.btn_covid19);
        btn_protect=view.findViewById(R.id.btn_protect);
        btn_treatment=view.findViewById(R.id.btn_treatment);
        btn_hotline=view.findViewById(R.id.btn_hotline);
        btn_covid19.setOnClickListener(this);
        btn_protect.setOnClickListener(this);
        btn_hotline.setOnClickListener(this);
        btn_treatment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_covid19:
                Intent covid19=new Intent(getActivity(),CovidAct.class);
                startActivity(covid19);
                break;
            case R.id.btn_protect:
                Intent protect=new Intent(getActivity(),ProtectAct.class);
                startActivity(protect);
                break;
            case R.id.btn_treatment:
                Intent intent=new Intent(getActivity(),TreatmentAct.class);
                startActivity(intent);
                break;
            case R.id.btn_hotline:
                String phonenumber="119";
                Intent dialphone=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +phonenumber));
                startActivity(dialphone);
                break;
        }
    }
}
