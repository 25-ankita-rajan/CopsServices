package com.example.copsservices.ui.assigned_jobs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.copsservices.R;

public class AssignedJobsFragment extends Fragment {


    private AssignedJobsAdapter assignedJobsAdapter;
    RecyclerView recyclerView;
    String [] name ={"abcd"};
    public AssignedJobsFragment() {
        // Required empty public constructor
    }


    public static AssignedJobsFragment newInstance(String param1, String param2) {
        AssignedJobsFragment fragment = new AssignedJobsFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assignedJobsAdapter = new AssignedJobsAdapter(getActivity(),name);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_assigned_jobs, container, false);
        recyclerView = root.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));
        recyclerView.setAdapter(assignedJobsAdapter);
        return root;
    }
}