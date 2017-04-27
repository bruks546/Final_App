package com.example.edwingariza.franssenpropertiesinc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by edwingariza on 4/11/17.
 */




public class DatabaseAppD extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;


    private static final String DATABASE_NAME = "appD.db";
    private static final String TABLE_APP_A = "appD";
    private static final String KEY_ID = "id";

    private static final String INCOME_NAME_1 = "name_income_1";
    private static final String INCOME_SOURCE_1 = "income_source_1";
    private static final String INCOME_AMOUNT_1 = "income_amount_1";

    private static final String INCOME_NAME_2 = "name_income_2";
    private static final String INCOME_SOURCE_2 = "income_source_2";
    private static final String INCOME_AMOUNT_2 = "income_amount_2";

    private static final String INCOME_NAME_3 = "name_income_3";
    private static final String INCOME_SOURCE_3 = "income_source_3";
    private static final String INCOME_AMOUNT_3 = "income_amount_3";

    private static final String TABLE_APP_E = "appE";
    private static final String KEY_ID_ = "_id";

    private static final String BANK_NAME_CHECKING = "bank_name_checking";
    private static final String BANK_NAME_SAVING = "bank_name_saving";
    private static final String PROPERTY_VALUATION = "property_val";
    private static final String MARKET_VALUE_DISPOSED = "market_val_dis";

    private static final String VEHICLE_MAKE = "vehicle_made";
    private static final String VEHICLE_MODEL = "vehicle_model";
    private static final String VEHICLE_LICENSE = "vehicle_license";
    private static final String VEHICLE_YEAR = "vehicle_year";

    private static final String TABLE_APP_F = "appFinal";
    private static final String KEY_ID_F = "_id_";

    private static final String HEAR_PROPERTY = "hear_property";

    SQLiteDatabase db;
    private static final String CREATE_APP_F =
            "CREATE TABLE " + TABLE_APP_F + " (" +
                    KEY_ID + " INTEGER PRIMARY KEY NOT NULL, "
                    +HEAR_PROPERTY + " TEXT);";

    private static final String CREATE_APP_TABLE =
            "CREATE TABLE " + TABLE_APP_A + " (" +
                    KEY_ID + " INTEGER PRIMARY KEY NOT NULL, "
                    + INCOME_NAME_1 + " TEXT,"
                    + INCOME_SOURCE_1 + " TEXT,"
                    + INCOME_AMOUNT_1 + " TEXT,"
                    + INCOME_NAME_2 + " TEXT,"
                    + INCOME_SOURCE_2 + " TEXT,"
                    + INCOME_AMOUNT_2 + " TEXT,"
                    + INCOME_NAME_3 + " TEXT,"
                    + INCOME_SOURCE_3 + " TEXT,"
                    + INCOME_AMOUNT_3 + " TEXT);";

    private static final String CREATE_APP_TABLE_E =
            "CREATE TABLE " + TABLE_APP_E + " (" +
                    KEY_ID_ + " INTEGER PRIMARY KEY NOT NULL, "
                    + BANK_NAME_CHECKING + " TEXT,"
                    + BANK_NAME_SAVING + " TEXT,"
                    + PROPERTY_VALUATION + " TEXT,"
                    + MARKET_VALUE_DISPOSED + " TEXT,"
                    + VEHICLE_MAKE + " TEXT,"
                    + VEHICLE_MODEL + " TEXT,"
                    + VEHICLE_LICENSE + " TEXT,"
                    + VEHICLE_YEAR + " TEXT);";


    public DatabaseAppD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_APP_TABLE);
        db.execSQL(CREATE_APP_TABLE_E);
        db.execSQL(CREATE_APP_F);

        this.db = db;


    }
    public void insertApplicantFinal(AppGetSetFinal a) {

        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from appFinal";
        Cursor cur = db.rawQuery(query, null);
        int count = cur.getCount();

        values.put(KEY_ID_F, count);
        values.put(HEAR_PROPERTY, a.hear_property);
        db.insert(TABLE_APP_F, null, values);
        db.close();
    }

    public void insertApplicantD(ApplicationDGetSet a) {

        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from appD";
        Cursor cur = db.rawQuery(query, null);
        int count = cur.getCount();

        values.put(KEY_ID, count);
        values.put(INCOME_NAME_1, a.getName_income_1());
        values.put(INCOME_SOURCE_1, a.getIncome_source_1());
        values.put(INCOME_AMOUNT_1, a.getIncome_amount_1());
        values.put(INCOME_NAME_2, a.getName_income_2());
        values.put(INCOME_SOURCE_2, a.getIncome_source_2());
        values.put(INCOME_AMOUNT_2, a.getIncome_amount_2());
        values.put(INCOME_NAME_3, a.getName_income_3());
        values.put(INCOME_SOURCE_3, a.getIncome_source_3());
        values.put(INCOME_AMOUNT_3, a.getIncome_amount_3());
        db.insert(TABLE_APP_A, null, values);
        db.close();
    }
    public void insertApplicantE(AppGetSetE a) {

        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from appE";
        Cursor cur = db.rawQuery(query, null);
        int count = cur.getCount();
        values.put(KEY_ID_, count);

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
            String query = "DROP TABLE IF EXISTS" + TABLE_APP_A+TABLE_APP_E+TABLE_APP_F;

            db.execSQL(query);

            this.onCreate(db);
        }

    }
