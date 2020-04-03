package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.ProtectModel;
import com.example.myapplication.model.ProvinsiModel;
import com.example.myapplication.model.RiwayatModel;
import com.example.myapplication.viewmodel.ProvinsiViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import static androidx.lifecycle.ViewModelProvider.*;

public class DetailProvinsiAdapter extends RecyclerView.Adapter<DetailProvinsiAdapter.ViewHolder> {
    private ArrayList<ProvinsiModel> list=new ArrayList<>();

    public DetailProvinsiAdapter(Context context) {
        this.context = context;
    }

    private Context context;

    public void setProvinsiModel(ArrayList<ProvinsiModel> items) {
        if (list != null){
            if (list.size() >0){
                list.clear();
            }
            list.addAll(items);
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.detailcard,parent,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       holder.tv_provinsi.setText(list.get(position).getAttributes().getProvinsi());
       holder.tv_meninggal.setText(list.get(position).getAttributes().getKasus_Meni());
       holder.tv_positif.setText(list.get(position).getAttributes().getKasus_Posi());
       holder.tv_sembuh.setText(list.get(position).getAttributes().getKasus_Semb());
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder  {
        private TextView tv_provinsi;
        private TextView tv_positif;
        private TextView tv_sembuh;
        private TextView tv_meninggal;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_provinsi=itemView.findViewById(R.id.tv_provinsi);
            tv_meninggal=itemView.findViewById(R.id.tv_meninggal);
            tv_positif=itemView.findViewById(R.id.tv_positif);
            tv_sembuh=itemView.findViewById(R.id.tv_sembuh);
        }

    }
}
