package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.RiwayatModel;

import java.util.ArrayList;

public class RiwayatAdapter extends RecyclerView.Adapter<RiwayatAdapter.ViewHolder> {
    private ArrayList<RiwayatModel> riwayatModels=new ArrayList<>();
    private Context context;
    public ArrayList<RiwayatModel> getRiwayatModels() {
        return riwayatModels;
    }
    public void setRiwayatModels(ArrayList<RiwayatModel> items) {
        if (riwayatModels != null){
            if (riwayatModels.size() >0){
                riwayatModels.clear();
            }
            riwayatModels.addAll(items);
        }
        notifyDataSetChanged();
    }
    public RiwayatAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.detailriwayat, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv_country.setText(riwayatModels.get(position).getCombinedKey());
        holder.tv_Recovered.setText(riwayatModels.get(position).getRecovered());
        holder.tv_Confirmed.setText(riwayatModels.get(position).getConfirmed());
        holder.tv_Deaths.setText(riwayatModels.get(position).getDeaths());
        holder.tv_active.setText(riwayatModels.get(position).getActive());
    }
    @Override
    public int getItemCount() {
        return riwayatModels.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_country;
        TextView tv_Confirmed;
        TextView tv_Recovered;
        TextView tv_Deaths;
        TextView tv_active;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_country=itemView.findViewById(R.id.tv_country);
            tv_Confirmed=itemView.findViewById(R.id.tv_Confirmed);
            tv_Recovered=itemView.findViewById(R.id.tv_Recovered);
            tv_Deaths=itemView.findViewById(R.id.tv_Deaths);
            tv_active=itemView.findViewById(R.id.tv_active);
        }
    }
}
