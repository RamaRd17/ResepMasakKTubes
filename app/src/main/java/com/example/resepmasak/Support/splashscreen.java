package com.example.resepmasak.Support;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.resepmasak.Activity.MainActivity;
import com.example.resepmasak.R;

public class splashscreen extends AppCompatActivity {

    private int waktu_loading=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(splashscreen.this, MainActivity.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);

    }

}
