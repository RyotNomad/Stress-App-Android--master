package com.example.stressanxietyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class coping_strategies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coping_strategies);
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(coping_strategies.this, stress_mgmt_main.class));
    }
}
