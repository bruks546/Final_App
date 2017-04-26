package com.example.edwingariza.franssenpropertiesinc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by edwingariza on 4/25/17.
 */

public class DataFeedBack extends SQLiteOpenHelper{




    private static final int DATA_BASE_VERSION =1;
    private static final String DATABASE_NAME = "feedback.db";


    private static final String TABLE_FEED = "feedback";
    private static final String _ID_SR = "_id";
    private static final String CATEGORY = "feedback";




    SQLiteDatabase db;


    private static final String TABLE_CREATE =
            "CREATE TABLE "+ TABLE_FEED + " (" +
                    _ID_SR + " INTEGER PRIMARY KEY NOT NULL, " +
                    CATEGORY + " TEXT);";





    public DataFeedBack(Context context){
        super(context, DATABASE_NAME, null, DATA_BASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }



    public void insertRequest(Feed f){

        db = this.getWritableDatabase();
        ContentValues val = new ContentValues();

        String query ="select * from feedback";
        Cursor cur = db.rawQuery(query, null);
        int count = cur.getCount();

        val.put(_ID_SR, count);
        val.put(CATEGORY, f.getFeed());



        db.insert(TABLE_FEED, null, val);
        db.close();
    }




    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String query = "DROP TABLE IF EXISTS" + TABLE_FEED;

        db.execSQL(query);

        this.onCreate(db);
    }
}




