package com.example.stressanxietyapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addNewPlanner extends AppCompatActivity {
    EditText edit1,edit2,edit3;
    Button butt;
    DatabaseHelper myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_planner);


        myDB =  new DatabaseHelper(this);
         edit1 = (EditText) findViewById(R.id.editText2);
         edit2 = (EditText) findViewById(R.id.editText3);
         edit3 = (EditText) findViewById(R.id.editText4);
         butt = (Button) findViewById(R.id.button7);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDB.addData(edit1.getText().toString(), edit2.getText().toString(), edit3.getText().toString());
                showMessage("Success","Data Added");
                startActivity(new Intent(addNewPlanner.this, planner.class));


            }
        });

    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
    public void addData(){

    }

}
