package com.example.copsservices.ui.assigned_jobs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.copsservices.R;

public class AssignedJobsAdapter extends RecyclerView.Adapter<AssignedJobsAdapter.AssignedJobsViewHolder> {

    Context context;
    String[] name;
    public AssignedJobsAdapter(Context applicationContext, String[] name) {
        this.context = applicationContext;
        this.name = name;
    }

    public class AssignedJobsViewHolder extends RecyclerView.ViewHolder {

        TextView textViewJob, textViewName, textViewAddress, textViewContact;
        Button buttonAccept;


        public AssignedJobsViewHolder(@NonNull View itemView) {
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
    public AssignedJobsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_assigned_jobs, parent,false);
        return new AssignedJobsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AssignedJobsViewHolder holder, int position) {

//        holder.textViewJob.setText("job");
//        holder.textViewName.setText("name");
//        holder.textViewAddress.setText("address");
//        holder.textViewContact.setText("contact");

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
