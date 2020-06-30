package com.example.stressanxietyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class mindfullness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mindfullness);
    }
    public void onBackPressed() {
        startActivity(new Intent(mindfullness.this, Relaxation_Main.class));
    }
}