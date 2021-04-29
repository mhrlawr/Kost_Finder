package com.example.kostfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class KostanKampusB extends AppCompatActivity {
private Button button9;
private ImageButton imageButton6, imageButton8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kampus_b);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // BUAT TOMBOL MAPS
        ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (KostanKampusB.this, WismaErbyta.class);
                startActivity(i);
            }
        });
        ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (KostanKampusB.this, WismaAnggrek.class);
                startActivity(i);
            }
        });

        // BUAT TOMBOL BACK
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KostanKampusB.this, Menu.class);
                startActivity(i);
            }
        });
    }

    // BUAT TOMBOL TELEPON
    public void imageButton5(View view) {
        String nomor3 = "08123235884";
        Intent imageButton5 = new Intent(Intent.ACTION_DIAL);
        imageButton5.setData(Uri.fromParts("tel", nomor3, null));
        startActivity(imageButton5);
    }
    public void imagebutton7(View view){
        String nomor4 = "0858695580";
        Intent imageButton7 = new Intent(Intent. ACTION_DIAL);
        imageButton7.setData(Uri.fromParts("tel",nomor4,null));
        startActivity(imageButton7);
    }
}