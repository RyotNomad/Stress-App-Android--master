package com.example.stressanxietyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class journalMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal_main);

        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton23);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(journalMain.this, journallingInfo.class));

            }
        });

        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton24);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(journalMain.this, journalStress.class));

            }
        });
        ImageButton button3 = (ImageButton) findViewById(R.id.imageButton25);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(journalMain.this, journalIrrational.class));

            }
        });
        ImageButton button4 = (ImageButton) findViewById(R.id.imageButton26);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(journalMain.this, journalWellBeing.class));

            }
        });
    }
}
