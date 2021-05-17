package com.example.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnGato, btnPerro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGato = (ImageButton) findViewById(R.id.btnGato);
        btnPerro = (ImageButton) findViewById(R.id.btnPerro);
        //reproducir el mp3

        btnGato.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    Maullar();
            }
        });
        btnPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ladrar();
            }


            private void Maullar() {
                MediaPlayer mpGato = MediaPlayer.create(MainActivity.this, R.raw.miau);
                mpGato.start();

                private void Ladra() {
                    MediaPlayer mpPerro = MediaPlayer.create(MainActivity.this, R.raw.ladra);
                    mpGato.start();
            }
        }