package com.example.resepmasak.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.resepmasak.Adapter.HomePageAdapter;
import com.example.resepmasak.R;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomePageFragment extends Fragment{
    private ArrayList<String> judulresep = new ArrayList<>();
    private ArrayList<String> photoresep = new ArrayList<>();
    private ArrayList<String> bahanlangkah = new ArrayList<>();
    public HomePageFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home_page, container, false);
        judulresep = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.judul)));
        photoresep = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.gambar)));
        bahanlangkah = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.bahanlangkah)));

        HomePageAdapter adapter = new HomePageAdapter(getActivity(), judulresep, photoresep,bahanlangkah);
        //Linear
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView = v.findViewById(R.id.rv_homepage);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        //Grid
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(getActivity(), 2);
        RecyclerView recyclerView1 = v.findViewById(R.id.rv_homepage2);
        recyclerView1.setLayoutManager(mGridLayoutManager);
        recyclerView1.setAdapter(adapter);
        return v;
    }
}
