package com.example.copsservices.ui.inprogress_jobs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.copsservices.R;


public class InProgressJobsFragment extends Fragment {

    private InProgressJobsAdapter inProgressJobsAdapter;
    RecyclerView recyclerView;

    public InProgressJobsFragment() {
        // Required empty public constructor
    }


    public static InProgressJobsFragment newInstance(String param1, String param2) {
        InProgressJobsFragment fragment = new InProgressJobsFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_in_progress_jobs, container, false);
        inProgressJobsAdapter = new InProgressJobsAdapter();
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));
        recyclerView.setAdapter(inProgressJobsAdapter);
        return view;
    }
}