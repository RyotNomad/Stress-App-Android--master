package com.example.stressanxietyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Time_management_screeen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_management_screeen);

        ImageButton btn = (ImageButton)findViewById(R.id.imageButton7);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Time_management_screeen.this, time_mgmt_time_mgmt.class));
                finish();
            }
        });

        ImageButton btn2 = (ImageButton)findViewById(R.id.imageButton6);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Time_management_screeen.this, planner.class));
                finish();
            }
        });
        ImageButton btn6 = (ImageButton)findViewById(R.id.imageButton27);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Time_management_screeen.this, study_tips.class));
            }
        });

    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(Time_management_screeen.this, start_page.class));
    }

}
