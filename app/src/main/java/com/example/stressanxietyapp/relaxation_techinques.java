package com.example.stressanxietyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class relaxation_techinques extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relaxation_techinques);
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(relaxation_techinques.this, Relaxation_Main.class));
    }

}
