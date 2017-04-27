package com.example.edwingariza.franssenpropertiesinc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by edwingariza on 4/11/17.
 */




public class DatabaseFinal extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;


    private static final String DATABASE_NAME = "appFinal.db";
    private static final String TABLE_APP_A = "appFinal";
    private static final String KEY_ID = "id";

    private static final String HEAR_PROPERTY = "hear_property";

    SQLiteDatabase db;

    private static final String CREATE_APP_F =
            "CREATE TABLE " + TABLE_APP_A + " (" +
                    KEY_ID + " INTEGER PRIMARY KEY NOT NULL, "
                    +HEAR_PROPERTY + " TEXT);";





    public DatabaseFinal(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_APP_F);

        this.db = db;


    }
    public void insertApplicantFinal(AppGetSetFinal a) {

        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from appFinal";
        Cursor cur = db.rawQuery(query, null);
        int count = cur.getCount();

        values.put(KEY_ID, count);
        values.put(HEAR_PROPERTY, a.hear_property);
        db.insert(TABLE_APP_A, null, values);
        db.close();
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS" + TABLE_APP_A;

        db.execSQL(query);

        this.onCreate(db);
    }

}
