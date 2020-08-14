package com.example.copsservices.ui.cops_services;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.copsservices.R;


public class CopsServicesFragment extends Fragment {

    private CopsServicesAdapter copsServicesAdapter;
    RecyclerView recyclerView;


    public CopsServicesFragment() {
        // Required empty public constructor
    }


    public static CopsServicesFragment newInstance(String param1, String param2) {
        CopsServicesFragment fragment = new CopsServicesFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        copsServicesAdapter = new CopsServicesAdapter();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cops_services, container, false);
        recyclerView = view.findViewById(R.id.recyclerview_todo);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));
        recyclerView.setAdapter(copsServicesAdapter);
        return view;
    }
}