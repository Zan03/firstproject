package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Act3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);

        TextView tvNama = findViewById(R.id.tv_nama);//tv_get_nama
        TextView tvAlamat = findViewById(R.id.tv_alamat);//tv_get_alamat
        TextView tvTTl = findViewById(R.id.tv_hoby);//tv_get_ttl


        Bundle extras = getIntent().getExtras();

        if (extras == null){
            return;
        }

        String nama = extras.getString("nama");
        String alamat = extras.getString("alamat");
        String ttl = extras.getString("ttl");

        tvNama.setText(nama);
        tvAlamat.setText(alamat);
        tvTTl.setText(ttl);

        if (nama != null){
            tvNama.setText(nama);
        }

        if (alamat != null){
            tvAlamat.setText(alamat);
        }

        if (ttl != null){
            tvTTl.setText(ttl);
        }
    }
}