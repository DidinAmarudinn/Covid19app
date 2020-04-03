package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.ProtectModel;
import com.example.myapplication.model.TreatmentModel;

import java.util.ArrayList;

public class TreatmentAdapter extends RecyclerView.Adapter<TreatmentAdapter.ViewHolder> {
    private ArrayList<TreatmentModel> list;

    public TreatmentAdapter(ArrayList<TreatmentModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.detailtreatmen,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TreatmentModel treatmentModel=list.get(position);
        holder.bind(treatmentModel);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean expanded=treatmentModel.isExpanded();
                treatmentModel.setExpanded(!expanded);
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
        public void bind(TreatmentModel treatmentModel) {
            boolean expanded=treatmentModel.isExpanded();
            subitem.setVisibility(expanded ? View.VISIBLE : View.GONE);
            tv_title.setText(treatmentModel.getTitle());
            tv_deskripsi.setText(treatmentModel.getDeskripsi());

        }
    }
}
