package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.CovidModel;
import com.example.myapplication.model.ProtectModel;

import java.util.ArrayList;

public class ProtectAdapter extends RecyclerView.Adapter<ProtectAdapter.ViewHolder> {
    private ArrayList<ProtectModel> list;

    public ProtectAdapter(ArrayList<ProtectModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.detailprotect,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ProtectModel protectModel=list.get(position);
        holder.bind(protectModel);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean expanded=protectModel.isExpanded();
                protectModel.setExpanded(!expanded);
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
        public void bind(ProtectModel protectModel) {
            boolean expanded=protectModel.isExpanded();
            subitem.setVisibility(expanded ? View.VISIBLE : View.GONE);
            tv_title.setText(protectModel.getTitle());
            tv_deskripsi.setText(protectModel.getDeskripsi());

        }
    }
}
