package com.example.stressanxietyapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.sql.SQLClientInfoException;

public class database_Journal extends SQLiteOpenHelper {

    public final static String TAG = "databaseJournal";
    public final static String TABLE_NAME = "journalentries";
    public final static String Col1 = "no1";
    public final static String Col2 = "no2";
    public final static String Col3 = "no3";
    public final static String Col4 = "no4";
    public final static String Col5 = "no5";
    public final static String Col6 = "no6";
    public final static String Col7 = "no7";
    public final static String Col8= "no8";
    public final static String Col9= "no9";
    public final static String Col10 = "no10";
    public final static String Col11= "no11";

    public database_Journal(Context context){
        super(context,TABLE_NAME,null,1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1){
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        String createTable = "CREATE TABLE " + TABLE_NAME +  " (ID INTEGER PRIMARY KEY AUTOINCREMENT, no1 TEXT, no2 TEXT, no3 TEXT, no4 TEXT, no5 text, no6 TEXT, no7 TEXT, no8 TEXT, no9 TEXT, no10 TEXT, no11 TEXT )";
        sqLiteDatabase.execSQL(createTable);
    }
    public void deleteData () {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void addData(String first, String second, String third, String fourth, String fifth, String sixth,
    String seventh, String eight,String nine, String ten, String eleven){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Col1,first);
        contentValues.put(Col2,second);
        contentValues.put(Col3,third);
        contentValues.put(Col4,fourth);
        contentValues.put(Col5,fifth);
        contentValues.put(Col6,sixth);
        contentValues.put(Col7,seventh);
        contentValues.put(Col8,eight);
        contentValues.put(Col9,nine);
        contentValues.put(Col10,ten);
        contentValues.put(Col11,eleven);
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


}
