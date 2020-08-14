package com.example.copsservices.ui.cops_services;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.copsservices.R;

public class CopsServicesAdapter extends RecyclerView.Adapter<CopsServicesAdapter.CopsServicesViewHolder> {
    @NonNull
    @Override
    public CopsServicesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_cops_services,parent,false);

        return new CopsServicesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CopsServicesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class CopsServicesViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTodo;
        public CopsServicesViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewTodo = itemView.findViewById(R.id.tv_todo_item);
        }
    }
}
