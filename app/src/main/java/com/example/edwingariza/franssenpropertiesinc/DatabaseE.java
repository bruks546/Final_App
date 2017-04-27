package com.example.edwingariza.franssenpropertiesinc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by edwingariza on 4/11/17.
 */




public class DatabaseE extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;


    private static final String DATABASE_NAME = "appE.db";
    private static final String TABLE_APP_E = "appE";
    private static final String KEY_ID = "id";



    private static final String BANK_NAME_CHECKING = "bank_name_checking";
    private static final String BANK_NAME_SAVING = "bank_name_saving";
    private static final String PROPERTY_VALUATION = "property_val";
    private static final String MARKET_VALUE_DISPOSED = "market_val_dis";

    private static final String VEHICLE_MAKE = "vehicle_made";
    private static final String VEHICLE_MODEL = "vehicle_model";
    private static final String VEHICLE_LICENSE = "vehicle_license";
    private static final String VEHICLE_YEAR = "vehicle_year";



    SQLiteDatabase db;


    private static final String CREATE_APP_TABLE_E =
            "CREATE TABLE " + TABLE_APP_E + " (" +
                    KEY_ID + " INTEGER PRIMARY KEY NOT NULL, "
                    + BANK_NAME_CHECKING + " TEXT,"
                    + BANK_NAME_SAVING + " TEXT,"
                    + PROPERTY_VALUATION + " TEXT,"
                    + MARKET_VALUE_DISPOSED + " TEXT,"
                    + VEHICLE_MAKE + " TEXT,"
                    + VEHICLE_MODEL + " TEXT,"
                    + VEHICLE_LICENSE + " TEXT,"
                    + VEHICLE_YEAR + " TEXT);";


    public DatabaseE(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_APP_TABLE_E);


        this.db = db;


    }



    public void insertApplicantE(AppGetSetE a) {

        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from appE";
        Cursor cur = db.rawQuery(query, null);
        int count = cur.getCount();
        values.put(KEY_ID, count);

        values.put(BANK_NAME_CHECKING, a.getBank_name_checking());
        values.put(BANK_NAME_SAVING, a.getBank_name_saving());
        values.put(PROPERTY_VALUATION, a.getProperty_val());
        values.put(MARKET_VALUE_DISPOSED, a.getMarket_val_dis());
        values.put(VEHICLE_MAKE, a.getVehicle_made());
        values.put(VEHICLE_MODEL, a.getVehicle_model());
        values.put(VEHICLE_LICENSE, a.getVehicle_license());
        values.put(VEHICLE_YEAR, a.getVehicle_year());

        db.insert(TABLE_APP_E, null, values);
        db.close();

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS" + TABLE_APP_E;

        db.execSQL(query);

        this.onCreate(db);
    }

}
