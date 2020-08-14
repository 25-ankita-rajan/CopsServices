package com.example.copsservices.ui.inprogress_jobs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.copsservices.R;

public class InProgressJobsAdapter extends RecyclerView.Adapter<InProgressJobsAdapter.InProgressJobsViewHolder> {



    public class InProgressJobsViewHolder extends RecyclerView.ViewHolder {
        TextView textViewJob, textViewName, textViewAddress, textViewContact;
        Button buttonAccept;


        public InProgressJobsViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewJob = itemView.findViewById(R.id.job_tv);
            textViewName = itemView.findViewById(R.id.name_tv);
            textViewAddress = itemView.findViewById(R.id.address_tv);
            textViewContact = itemView.findViewById(R.id.contact_tv);
            buttonAccept = itemView.findViewById(R.id.button_accept);
        }
    }

    @NonNull
    @Override
    public InProgressJobsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_in_progress_jobs,parent,false);
        return new InProgressJobsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InProgressJobsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {

        return 4;
    }
}
