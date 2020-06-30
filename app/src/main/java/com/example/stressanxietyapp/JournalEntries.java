package com.example.stressanxietyapp;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class JournalEntries extends AppCompatActivity {
    database_Journal mDatabasehelper;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;
    TextView text9;
    TextView text10;
    TextView text11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal_entries);
        mDatabasehelper = new database_Journal(this);
        text1 = (TextView)findViewById(R.id.textView12);
        text2 = (TextView)findViewById(R.id.textView14);
        text3 = (TextView)findViewById(R.id.textView16);
        text4 = (TextView)findViewById(R.id.textView18);
        text5 = (TextView)findViewById(R.id.textView20);
        text6 = (TextView)findViewById(R.id.textView22);
        text7 = (TextView)findViewById(R.id.textView24);
        text8 = (TextView)findViewById(R.id.textView26);
        text9 = (TextView)findViewById(R.id.textView28);
        text10 = (TextView)findViewById(R.id.textView30);
        text11 = (TextView)findViewById(R.id.textView32);
        displayAll();

    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(JournalEntries.this, journal.class));
    }
    public void displayAll(){
        LinearLayout buttons = (LinearLayout) findViewById(R.id.buttLayout);

        Cursor res = mDatabasehelper.getAllData();
        LinearLayout assignmentLayout = (LinearLayout) findViewById(R.id.linearlayout);

        if(res.getCount() == 0){
            //showMessage("Error","Nothing found");

            return;
        }
        else{

            StringBuffer buffer1 =  new StringBuffer();
            StringBuffer buffer2 =  new StringBuffer();
            StringBuffer buffer3 =  new StringBuffer();
            StringBuffer buffer4 =  new StringBuffer();
            StringBuffer buffer5 =  new StringBuffer();
            StringBuffer buffer6 =  new StringBuffer();
            StringBuffer buffer7 =  new StringBuffer();
            StringBuffer buffer8 =  new StringBuffer();
            StringBuffer buffer9 =  new StringBuffer();
            StringBuffer buffer10 =  new StringBuffer();
            StringBuffer buffer11=  new StringBuffer();
            while(res.moveToNext()){
                //buffer.append("Id: " + res.getString(0) + "\n");


                buffer1.append(res.getString(1));
                buffer2.append(res.getString(2));
                buffer3.append(res.getString(3));
                buffer4.append(res.getString(4));
                buffer5.append(res.getString(5));
                buffer6.append(res.getString(6));
                buffer7.append(res.getString(7));
                buffer8.append(res.getString(8));
                buffer9.append(res.getString(9));
                buffer10.append(res.getString(10));
                buffer11.append(res.getString(11));

                text1.setText(buffer1.toString());
                text2.setText(buffer2.toString());
                text3.setText(buffer3.toString());
                text4.setText(buffer4.toString());
                text5.setText(buffer5.toString());
                text6.setText(buffer6.toString());
                text7.setText(buffer7.toString());
                text8.setText(buffer8.toString());
                text9.setText(buffer9.toString());
                text10.setText(buffer10.toString());
                text11.setText(buffer11.toString());


            }
            //showMessage("Data",buffer.toString());
            TextView assigTemp = new TextView(this);

            //TextView assigtest = (TextView) findViewById(R.id.assigtestcol);
            //  TextView notetask = (TextView) findViewById(R.id.notetaskcol);
            //  TextView duedate = (TextView) findViewById(R.id.duedatcol);

            // assigtest.setText(buffer1.toString());
            //notetask.setText(buffer2.toString());
            //duedate.setText(buffer3.toString());


        }
    }

}
