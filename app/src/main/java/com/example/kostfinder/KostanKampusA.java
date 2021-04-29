package com.example.kostfinder;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class KostanKampusA extends AppCompatActivity {
private Button button8;
private ImageButton imageButton2, imageButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kampus_a);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // BUAT TOMBOL MAPS
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (KostanKampusA.this, KostBarbie.class);
                startActivity(i);
            }
        });
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (KostanKampusA.this, KostAnNur.class);
                startActivity(i);
            }
        });

        // BUAT TOMBOL BACK
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KostanKampusA.this, Menu.class);
                startActivity(i);
            }
        });
    }


    // BUAT TOMBOL TELEPON
    public void imageButton1(View view) {
        String nomor1 = "081231959969";
        Intent imageButton1 = new Intent(Intent.ACTION_DIAL);
        imageButton1.setData(Uri.fromParts("tel", nomor1, null));
        startActivity(imageButton1);
    }
     public void imagebutton3(View view){
        String nomor2 = "085156708897";
        Intent imageButton3 = new Intent(Intent. ACTION_DIAL);
        imageButton3.setData(Uri.fromParts("tel",nomor2,null));
        startActivity(imageButton3);
    }
}