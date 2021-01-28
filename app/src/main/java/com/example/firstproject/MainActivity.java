package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public ImageView img1;
    public int jumlah = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView txthw = findViewById(R.id.tv_hw);
        TextView txtnama = findViewById(R.id.tv_nama);
        TextView txtalamat = findViewById(R.id.tv_alamat);
        TextView txthoby = findViewById(R.id.tv_hoby);
        TextView txtkesukaan = findViewById(R.id.tv_kesukaan);
        Button btnMove = findViewById(R.id.btn_pindah);

        txthw.setText("Selamat Datang");
        txtnama.setText("Hamizan");
        txtalamat.setText("Bandung");
        txthoby.setText("makan makan");
        txtkesukaan.setText("suka suka kau je lah");

        txtnama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, " Anda menekan tulisan "+txtnama.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        txtnama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, " Anda mengklik nama ",
                        Toast.LENGTH_SHORT).show();
            }
        });


        txtkesukaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, " Anda menekan tulisan "+txtkesukaan.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        txtkesukaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, " jangan mencet mencet ",
                        Toast.LENGTH_SHORT).show();
            }
        });

        txthw.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    jumlah++;
                    Toast.makeText(MainActivity.this, "Anda menekan sebanyak"+jumlah+"kali" ,
                            Toast.LENGTH_SHORT).show();
            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityKedua.class);
                intent.putExtra("nama_key", txtnama.getText());
                intent.putExtra("alamat_key", txtalamat.getText());
                intent.putExtra("huhuy", txthoby.getText());
                startActivity(intent);
//                finish();
//                onDestroy();

            }
        });
    }
}