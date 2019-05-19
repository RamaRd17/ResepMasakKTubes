package com.example.resepmasak.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.resepmasak.DataKategori.GorengData;
import com.example.resepmasak.DataKategori.KukusData;
import com.example.resepmasak.DataKategori.PanggangData;
import com.example.resepmasak.DataKategori.RebusData;
import com.example.resepmasak.R;
import com.example.resepmasak.SetGet.SetterGetter;
import com.example.resepmasak.Adapter.AdapterDaerah;
import com.example.resepmasak.DataKategori.AcehData;
import com.example.resepmasak.DataKategori.BaliData;
import com.example.resepmasak.DataKategori.PadangData;
import com.example.resepmasak.DataKategori.SemarangData;
import com.example.resepmasak.DataKategori.SundaData;
import com.example.resepmasak.Support.ItemClickSupport;

import java.util.ArrayList;

public class MainKategori extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<SetterGetter> list = new ArrayList<>();
    public String judulextra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kategoridetaillist);

        rvCategory = findViewById(R.id.rv_kategoridetailfinal);
        rvCategory.setHasFixedSize(true);

        Intent intent = getIntent();
        String judulekstra1 = intent.getStringExtra("judulekstra");
        Toast.makeText(this, judulekstra1, Toast.LENGTH_SHORT).show();
        if (judulekstra1.contains("aceh")){
            list.addAll(AcehData.getListDataAceh());
            showRecyclerList();
        }else if(judulekstra1.contains("bali")){
            list.addAll(BaliData.getListDataBali());
            showRecyclerList();
        }else if(judulekstra1.contains("padang")){
            list.addAll(PadangData.getListDataPadang());
            showRecyclerList();
        }else if(judulekstra1.contains("semarang")){
            list.addAll(SemarangData.getListDataSemarang());
            showRecyclerList();
        }else if(judulekstra1.contains("sunda")){
            list.addAll(SundaData.getListDataSunda());
            showRecyclerList();
        }else if(judulekstra1.contains("panggang")){
            list.addAll(PanggangData.getListDataPanggang());
            showRecyclerList();
        }else if(judulekstra1.contains("goreng")){
            list.addAll(GorengData.getListDataGoreng());
            showRecyclerList();
        }else if(judulekstra1.contains("kukus")){
            list.addAll(KukusData.getListDataKukus());
            showRecyclerList();
        }else if(judulekstra1.contains("rebus")){
            list.addAll(RebusData.getListDataRebus());
            showRecyclerList();
        }else{
            list.addAll(SundaData.getListDataSunda());
            showRecyclerList();
        }

    }
    private void showRecyclerList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        AdapterDaerah DaerahAdapter = new AdapterDaerah(this);
        DaerahAdapter.setListDaerah(list);
        rvCategory.setAdapter(DaerahAdapter);
        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedDataDaerah(list.get(position));
            }
        });
    }
    private void showSelectedDataDaerah(SetterGetter daerah){
        Intent intent = new Intent(MainKategori.this, DetailActivity.class);
        intent.putExtra("judul", daerah.getJudul());
        intent.putExtra("deskripsi", daerah.getDeskripsi());
        intent.putExtra("photo", daerah.getPhoto());
        intent.putExtra("kategori", daerah.getKategorimakanan());
        startActivity(intent);
    }
}
