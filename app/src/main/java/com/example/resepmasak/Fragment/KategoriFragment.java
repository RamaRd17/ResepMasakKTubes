package com.example.resepmasak.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.resepmasak.Activity.KategoriDaerah;
import com.example.resepmasak.Activity.KategoriJenis;
import com.example.resepmasak.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class KategoriFragment extends Fragment {


    public KategoriFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    View v = inflater.inflate(R.layout.fragment_kategori, container, false);
        ImageButton image1 = (ImageButton)v.findViewById(R.id.buttondaerah);
        ImageButton image2 = (ImageButton)v.findViewById(R.id.buttonjenis);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Masuk Daerah", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), KategoriDaerah.class);
                startActivity(intent);
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Masuk Jenis", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), KategoriJenis.class);
                startActivity(intent);

            }
        });
    return v;
    }
}
