package com.example.resepmasak.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.resepmasak.R;

public class KategoriJenis extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_fragment_jenis_masakan);
        ImageButton image3 = (ImageButton)findViewById(R.id.btn_panggang);
        ImageButton image4 = (ImageButton)findViewById(R.id.btn_goreng);
        ImageButton image5 = (ImageButton)findViewById(R.id.btn_kukus);
        ImageButton image6 = (ImageButton)findViewById(R.id.btn_rebus);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KategoriJenis.this, MainKategori.class);
                intent.putExtra("judulekstra","panggang");
                startActivity(intent);

            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KategoriJenis.this, MainKategori.class);
                intent.putExtra("judulekstra","goreng");
                startActivity(intent);

            }
        });
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KategoriJenis.this, MainKategori.class);
                intent.putExtra("judulekstra","rebus");
                startActivity(intent);

            }
        });
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KategoriJenis.this, MainKategori.class);
                intent.putExtra("judulekstra","kukus");
                startActivity(intent);

            }
        });

    }
}
