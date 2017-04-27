package com.example.edwingariza.franssenpropertiesinc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by edwingariza on 4/25/17.
 */

public class DatabaseAppB extends SQLiteOpenHelper{

    private static final int DATA_BASE_VERSION =5;
    private static final String DATABASE_NAME = "appb.db";

    private static final String TABLE_NAME = "appb";
    private static final String _ID = "id";
    private static final String UNDER_NAME = "under_name";
    private static final String WHEN = "when_have";
    private static final String CURRENT_LANDLORD = "landlord_name";
    private static final String LANDLORD_PHONE = "landlord_phone";
    private static final String PRE_LANDLORD_NAME = "pre_landlord_name";
    private static final String PRE_LANDLORD_PHONE = "pre_landlord_phone";

    SQLiteDatabase db;

    private static final String TABLE_CREATE =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    _ID + " INTEGER PRIMARY KEY not null, " +
                    UNDER_NAME + " TEXT not null ," +
                    WHEN + " TEXT not null, " +
                    CURRENT_LANDLORD + " TEXT not null, " +
                    LANDLORD_PHONE + " TEXT not null, " +
                    PRE_LANDLORD_NAME + " TEXT not null, " +
                    PRE_LANDLORD_PHONE+ " TEXT not null);";

    public DatabaseAppB(Context context){
        super(context, DATABASE_NAME, null, DATA_BASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;

    }
    public void insertContact(ApplicationBGetSet c){

        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query ="select * from appb";
        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();

        values.put(_ID, count);
        values.put(UNDER_NAME, c.getUnder_name());
        values.put(WHEN, c.getWhen_have());
        values.put(CURRENT_LANDLORD, c.getLandlord_name());
        values.put(LANDLORD_PHONE, c.getLandlord_phone());
        values.put(PRE_LANDLORD_NAME, c.getPre_landlord_name());
        values.put(PRE_LANDLORD_PHONE, c.getPre_landlord_phone());

        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String query = "DROP TABLE IF EXISTS" + TABLE_NAME;

        db.execSQL(query);


        this.onCreate(db);
    }
}