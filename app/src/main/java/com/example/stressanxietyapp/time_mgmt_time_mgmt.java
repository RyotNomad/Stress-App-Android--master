package com.example.stressanxietyapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class time_mgmt_time_mgmt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_mgmt_time_mgmt);



    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(time_mgmt_time_mgmt.this, Time_management_screeen.class));
    }

}
