package com.example.stressanxietyapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.sql.SQLClientInfoException;

public class DatabaseHelper extends SQLiteOpenHelper {

    public final static String TAG = "DatabaseHelper";
    public final static String TABLE_NAME = "StudentPlanner";
    public final static String Col1 = "AssignmentTest";
    public final static String Col2 = "DueDate";
    public final static String Col3 = "NotesTasks";
    public final static String Col4 = "Status";

    public DatabaseHelper(Context context){
        super(context,TABLE_NAME,null,1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1){
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            onCreate(sqLiteDatabase);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        String createTable = "CREATE TABLE " + TABLE_NAME +  " (ID INTEGER PRIMARY KEY AUTOINCREMENT, AssignmentTest TEXT, DueDate TEXT, NotesTasks TEXT, Status INTEGER)";
        sqLiteDatabase.execSQL(createTable);
    }
    public void deleteData () {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void addData(String assig, String date, String Notes){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Col1,assig);
        contentValues.put(Col2,date);
        contentValues.put(Col3,Notes);
        contentValues.put(Col4,0);
        db.insert(TABLE_NAME,null,contentValues);
    }



    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select* from " + TABLE_NAME,null);
        return res;
    }

    public void updateStatus(String i){
        SQLiteDatabase db =  this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(Col4,1);
        db.update(TABLE_NAME, cv, "ID = ?",new String[]{i});
    }

    public void updateEntry(String i,String ecol1, String ecol2, String ecol3){
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(Col1,ecol1);
        cv.put(Col3,ecol2);
        cv.put(Col2,ecol3);
        db.update(TABLE_NAME,cv,"ID = ?", new String[]{i});
    }


}
