package com.example.kostfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class KostanKampusC extends AppCompatActivity {
    private Button button1;
    private ImageButton imageButton1, imageButton2, imageButton3, imageButton4, imageButton5, imageButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kampus_c);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // BUAT TOMBOL MAPS
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KostanKampusC.this, KostAna.class);
                startActivity(i);
            }
        });
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KostanKampusC.this, KostYosheray.class);
                startActivity(i);
            }
        });
        ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KostanKampusC.this, KostUngu.class);
                startActivity(i);
            }
        });

        // BUAT TOMBOL BACK
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KostanKampusC.this, Menu.class);
                startActivity(i);
            }
        });
    }

        // BUAT TOMBOL TELEPON
        public void imageButton1 (View view){
            String nomor1 = "081234567890";
            Intent imageButton1 = new Intent(Intent.ACTION_DIAL);
            imageButton1.setData(Uri.fromParts("tel", nomor1, null));
            startActivity(imageButton1);
        }
        public void imagebutton3 (View view){
            String nomor2 = "085869801231";
            Intent imageButton3 = new Intent(Intent.ACTION_DIAL);
            imageButton3.setData(Uri.fromParts("tel", nomor2, null));
            startActivity(imageButton3);
        }
        public void imagebutton5 (View view){
            String nomor3 = "081288992231";
            Intent imageButton5 = new Intent(Intent.ACTION_DIAL);
            imageButton5.setData(Uri.fromParts("tel", nomor3, null));
            startActivity(imageButton5);
        }
}