package com.example.stressanxietyapp;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class planner extends AppCompatActivity {

    DatabaseHelper mDatabaseHelper;
    private Button buttonChange, buttonview;
    private EditText editText;
    ArrayList<EditText> assigViews = new ArrayList<>();
    ArrayList<EditText> dateViews = new ArrayList<>();
    ArrayList<EditText> taskViews = new ArrayList<>();

    ArrayList<Button> statusButtons = new ArrayList<>();
    Button StatusButt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);

        mDatabaseHelper =  new DatabaseHelper((this));
        //Button status = (Button) findViewById(R.id.button8);
        Button buttonclear = (Button) findViewById(R.id.button10);
        buttonChange = (Button) findViewById(R.id.button6);
        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<statusButtons.size();i++){
                    statusButtons.get(i).performClick();
                }
                startActivity(new Intent(planner.this, addNewPlanner.class));

            }
        });

       // LinearLayout noteTaskLayout = (LinearLayout) findViewById(R.id.ll_example);

        displayAll();
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabaseHelper.deleteData();
                displayAll();
                startActivity(new Intent(planner.this, planner.class));
                /*if(deletedRows > 0)
                    Toast.makeText(planner.this,"Data Deleted",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(planner.this,"Data not Deleted",Toast.LENGTH_LONG).show();*/
            }
        });
        };

    @Override
    public void onBackPressed() {
        for(int i=0;i<statusButtons.size();i++){
            statusButtons.get(i).performClick();
        }
        startActivity(new Intent(planner.this, Time_management_screeen.class));

    }
    public void ChangeStatus(Button butt){
        butt.setBackgroundResource(R.drawable.my_border3);
    }
    public void displayAll(){
        LinearLayout buttons = (LinearLayout) findViewById(R.id.buttLayout);

        Cursor res = mDatabaseHelper.getAllData();
        LinearLayout assignmentLayout = (LinearLayout) findViewById(R.id.assignmentLayout);
        LinearLayout dueDateLayout = (LinearLayout) findViewById(R.id.DateLayout);
        LinearLayout taskLayout = (LinearLayout) findViewById(R.id.NotesLayout);
        if(res.getCount() == 0){
            //showMessage("Error","Nothing found");

            return;
        }
        else{


            while(res.moveToNext()){
                //buffer.append("Id: " + res.getString(0) + "\n");
                StringBuffer buffer1 =  new StringBuffer();
                StringBuffer buffer2 =  new StringBuffer();
                StringBuffer buffer3 =  new StringBuffer();
                String temp = "";
                StatusButt = new Button(this);


                buffer1.append(res.getString(1));
                buffer2.append(res.getString(3));
                buffer3.append(res.getString(2));
                temp = res.getString(4);

                EditText assigTemp = new EditText(this);
                EditText dateTemp =  new EditText(this);
                EditText noteTemp =  new EditText(this);

                if(temp.equals("0")){
                StatusButt.setBackgroundResource(R.drawable.my_border2);}
                else{
                    StatusButt.setBackgroundResource(R.drawable.my_border3);
                }

                assigTemp.setBackgroundResource(R.drawable.my_border4);
                dateTemp.setBackgroundResource(R.drawable.my_border4);
                noteTemp.setBackgroundResource(R.drawable.my_border4);
                assigTemp.setText(buffer1.toString());
                dateTemp.setText(buffer2.toString());
                noteTemp.setText(buffer3.toString());

                dateTemp.measure(0,0);

                assigTemp.setGravity(Gravity.CENTER);
                dateTemp.setGravity(Gravity.CENTER);
                noteTemp.setGravity(Gravity.CENTER);

                StatusButt.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 150));
                assigTemp.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 150));
                dateTemp.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 150));
                noteTemp.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 150));

                assigViews.add(assigTemp);
                dateViews.add(dateTemp);
                taskViews.add(noteTemp);
                statusButtons.add(StatusButt);
                assigTemp.setTextColor(Color.parseColor("#000000"));
                dateTemp.setTextColor(Color.parseColor("#000000"));
                noteTemp.setTextColor(Color.parseColor("#000000"));

                dueDateLayout.addView(noteTemp);
                assignmentLayout.addView(assigTemp);
                taskLayout.addView(dateTemp);

            }
            //showMessage("Data",buffer.toString());
            TextView assigTemp = new TextView(this);
            for(int i=0;i<statusButtons.size();i++){
                final int localI = i;
                final Button tempButt = statusButtons.get(i);
                statusButtons.get(i).setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        tempButt.setBackgroundResource(R.drawable.my_border3);
                        mDatabaseHelper.updateStatus(Integer.toString(localI+1));
                        return false;
                    }
                });
                statusButtons.get(i).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mDatabaseHelper.updateEntry(Integer.toString(localI+1),assigViews.get(localI).getText().toString(),
                                dateViews.get(localI).getText().toString().toString(),taskViews.get(localI).getText().toString());
                    }
                });
                buttons.addView(statusButtons.get(i));


            }

            //TextView assigtest = (TextView) findViewById(R.id.assigtestcol);
          //  TextView notetask = (TextView) findViewById(R.id.notetaskcol);
          //  TextView duedate = (TextView) findViewById(R.id.duedatcol);

           // assigtest.setText(buffer1.toString());
            //notetask.setText(buffer2.toString());
            //duedate.setText(buffer3.toString());


        }
    }
    public void viewAll(){

    }


    private void toastMessage(String messaage){
        Toast.makeText(this,messaage,Toast.LENGTH_SHORT).show();
    }
    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}
