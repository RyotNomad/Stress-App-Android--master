package com.example.stressanxietyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class stress_mgmt_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stress_mgmt_main);

        ImageButton btn = (ImageButton)findViewById(R.id.imageButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(stress_mgmt_main.this, anxiety_and_stress.class));
            }
        });

        ImageButton btn2 = (ImageButton)findViewById(R.id.imageButton12);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(stress_mgmt_main.this, burnout.class));
            }
        });

        ImageButton btn3 = (ImageButton)findViewById(R.id.imageButton4);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(stress_mgmt_main.this, self_care.class));
            }
        });

        ImageButton btn4 = (ImageButton)findViewById(R.id.imageButton3);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(stress_mgmt_main.this, coping_strategies.class));
            }
        });

        ImageButton btn5 = (ImageButton)findViewById(R.id.imageButton8);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(stress_mgmt_main.this, stress_mgmt_tips.class));
            }
        });

        ImageButton btn7 = (ImageButton) findViewById(R.id.imageButton10);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(stress_mgmt_main.this,journalMain.class));
            }
        });
        ImageButton btn8 =  (ImageButton) findViewById(R.id.imageButton28);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(stress_mgmt_main.this,wellness.class));
            }
        });
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(stress_mgmt_main.this, start_page.class));
    }

}

