package com.example.stressanxietyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class burnout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burnout);
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(burnout.this, stress_mgmt_main.class));
    }
}
