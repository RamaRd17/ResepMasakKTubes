package com.example.resepmasak.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.resepmasak.R;

public class KategoriDaerah extends AppCompatActivity {

    public String judulextra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_fragment_masakan_daerah);

        ImageButton image1 = (ImageButton)findViewById(R.id.btn_aceh);
        ImageButton image2 = (ImageButton)findViewById(R.id.btn_bali);
        ImageButton image3 = (ImageButton)findViewById(R.id.btn_padang);
        ImageButton image4 = (ImageButton)findViewById(R.id.btn_semarang);
        ImageButton image5 = (ImageButton)findViewById(R.id.btn_sunda);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KategoriDaerah.this, MainKategori.class);
                intent.putExtra("judulekstra","aceh");
                startActivity(intent);

            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KategoriDaerah.this, MainKategori.class);
                intent.putExtra("judulekstra","bali");
                startActivity(intent);
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KategoriDaerah.this, MainKategori.class);
                intent.putExtra("judulekstra","padang");
                startActivity(intent);

            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KategoriDaerah.this, MainKategori.class);
                intent.putExtra("judulekstra","semarang");
                startActivity(intent);

            }
        });

        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KategoriDaerah.this, MainKategori.class);
                intent.putExtra("judulekstra","sunda");
                startActivity(intent);

            }
        });

    }
}
