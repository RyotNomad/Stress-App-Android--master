package com.example.stressanxietyapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class journal extends AppCompatActivity {

    EditText edit1;
    EditText edit2;
    EditText edit3;
    EditText edit4;
    EditText edit5;
    EditText edit6;
    EditText edit7;
    EditText edit8;
    EditText edit9;
    EditText edit10;
    EditText edit11;
    database_Journal myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal);
        Button addnew = (Button) findViewById(R.id.button8);
        edit1 = (EditText) findViewById(R.id.editText1);
        edit2 = (EditText) findViewById(R.id.editText2);
        edit3 = (EditText) findViewById(R.id.editText3);
        edit4 = (EditText) findViewById(R.id.editText4);
        edit5 = (EditText) findViewById(R.id.editText5);
        edit6 = (EditText) findViewById(R.id.editText6);
        edit7 = (EditText) findViewById(R.id.editText7);
        edit8 = (EditText) findViewById(R.id.editText8);
        edit9 = (EditText) findViewById(R.id.editText9);
        edit10 = (EditText) findViewById(R.id.editText15);
        edit11= (EditText) findViewById(R.id.editText16);
        myDB =  new database_Journal(this);
        addnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDB.addData(edit1.getText().toString(),edit2.getText().toString(),edit3.getText().toString(),edit4.getText().toString(),edit5.getText().toString(),
                        edit6.getText().toString(),edit7.getText().toString(),edit8.getText().toString(),edit9.getText().toString(),edit10.getText().toString(),edit11.getText().toString());
                showMessage("Success","Entry Added");


            }
        });
        Button temp = (Button) findViewById(R.id.button9);
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(journal.this,JournalEntries.class));
                finish();

            }
        });

    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(journal.this, stress_mgmt_main.class));

    }
    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

}
