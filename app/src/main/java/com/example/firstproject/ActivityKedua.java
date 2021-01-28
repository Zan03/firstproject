package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        TextView tv = findViewById(R.id.tv_text);
        TextView tx = findViewById(R.id.tv_nama);
        TextView td = findViewById(R.id.tv_alamat);
        TextView tr = findViewById(R.id.tv_hoby);

        Bundle ambil = getIntent().getExtras();
        if (ambil == null){
            return;
        }

        String nama = ambil.getString("nama_key");
        String alamat = ambil.getString("alamat_key");
//        String hoby = ambil.getString("huhuy");
        if (nama != null){
            tv.setText(nama);
        }

        if (alamat != null){
            tv.setText(alamat);
        }
//
//        if (nama != null){
//            tv.setText(hoby);
//        }

    }
}