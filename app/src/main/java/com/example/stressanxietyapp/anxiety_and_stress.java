package com.example.stressanxietyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class anxiety_and_stress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anxiety_and_stress);

    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(anxiety_and_stress.this, stress_mgmt_main.class));
    }
}
