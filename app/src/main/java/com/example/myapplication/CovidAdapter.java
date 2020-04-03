package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.CovidModel;

import java.util.ArrayList;

public class CovidAdapter extends RecyclerView.Adapter<CovidAdapter.ViewHolder> {
    private ArrayList<CovidModel> list;

    public CovidAdapter(ArrayList<CovidModel> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.detailcovid,parent,false);
       return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull CovidAdapter.ViewHolder holder, int position) {
        CovidModel covidModel=list.get(position);
        holder.bind(covidModel);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean expanded=covidModel.isExpanded();
                covidModel.setExpanded(!expanded);
                notifyItemChanged(position);
            }
        });
    }

    @Override
    public int getItemCount() {
         return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_title;
        private TextView tv_deskripsi;
        private LinearLayout subitem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_deskripsi=itemView.findViewById(R.id.tv_deskripsi);
            tv_title=itemView.findViewById(R.id.tv_title);
            subitem=itemView.findViewById(R.id.subItem);
        }

        public void bind(CovidModel covidModel) {
                boolean expanded=covidModel.isExpanded();
                subitem.setVisibility(expanded ? View.VISIBLE : View.GONE);
                tv_title.setText(covidModel.getTitle());
                tv_deskripsi.setText(covidModel.getDeskripsi());

        }
    }
}
