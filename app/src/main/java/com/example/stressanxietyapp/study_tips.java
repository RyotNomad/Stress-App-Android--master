package com.example.stressanxietyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class study_tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_tips);
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(study_tips.this, Time_management_screeen.class));
    }

}
