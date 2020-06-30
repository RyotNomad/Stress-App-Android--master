package com.example.stressanxietyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class stress_mgmt_tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress_mgmt_tips);
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(stress_mgmt_tips.this, stress_mgmt_main.class));
    }

}
