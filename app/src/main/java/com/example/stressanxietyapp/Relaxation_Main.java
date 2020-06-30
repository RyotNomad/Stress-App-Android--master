package com.example.stressanxietyapp;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Relaxation_Main extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relaxation_main);


        ImageButton btn = (ImageButton) findViewById(R.id.imageButton11);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Relaxation_Main.this,relaxation_techinques.class));
            }
        });
        ImageButton btn2 = (ImageButton) findViewById(R.id.imageButton5);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Relaxation_Main.this,breathe.class));

            }
        });
        ImageButton btn3 = (ImageButton) findViewById(R.id.imageButton9);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Relaxation_Main.this,mindfullness.class));

            }
        });
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        mp = MediaPlayer.create(this, R.raw.relaxation_sound);
        mp.start();
    }
    @Override
    public void onBackPressed() {
        mp.stop();

        startActivity(new Intent(Relaxation_Main.this, start_page.class));

    }

}
