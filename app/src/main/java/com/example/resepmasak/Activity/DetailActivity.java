package com.example.resepmasak.Activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;
import com.example.resepmasak.R;

import java.io.InputStream;

public class DetailActivity  extends  AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_detail);
            Intent intent = getIntent();
            String judul = intent.getStringExtra("judul");
            String photo = intent.getStringExtra("photo");
            String bahanlangkah = intent.getStringExtra("bahanlangkah");
            String bahanlangkah1 = intent.getStringExtra("deskripsi");

            TextView textView = findViewById(R.id.juduldetail);
            TextView textView1 = findViewById(R.id.bahanlangkah);

            new DownloadImageFromInternet((ImageView) findViewById(R.id.imagedetail))
                    .execute(photo);

            textView.setText(judul);

            textView1.setText(bahanlangkah);
            textView1.setText(bahanlangkah1);
            textView1.setMovementMethod(new ScrollingMovementMethod());
        }
    private class DownloadImageFromInternet extends AsyncTask<String, Void, Bitmap> {
        ImageView imageView;

        public DownloadImageFromInternet(ImageView imageView) {
            this.imageView = imageView;
            Toast.makeText(getApplicationContext(), "Data sedang di unduh, tunggu sebentar. . .", Toast.LENGTH_LONG).show();
        }

        protected Bitmap doInBackground(String... urls) {
            String imageURL = urls[0];
            Bitmap bimage = null;
            try {
                InputStream in = new java.net.URL(imageURL).openStream();
                bimage = BitmapFactory.decodeStream(in);

            } catch (Exception e) {
                Log.e("Error Message", e.getMessage());
                e.printStackTrace();
            }
            return bimage;
        }

        protected void onPostExecute(Bitmap result) {
            imageView.setImageBitmap(result);
        }
    }
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("message_return", "This data is returned when user click back menu in target activity.");
        setResult(RESULT_OK, intent);
        finish();
    }
}
