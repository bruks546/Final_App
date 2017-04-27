package com.example.edwingariza.franssenpropertiesinc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by edwingariza on 4/11/17.
 */




public class DatabaseAppC extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;


    private static final String DATABASE_NAME = "appC.db";
    private static final String TABLE_APP_A = "appC";

    private static final String KEY_ID = "id";
    private static final String NAME_HOUSEHOLD_1 = "household_name_1";
    private static final String HOUSEHOLD_RELATIONSHIP_1 = "household_relationship_1";
    private static final String HOUSEHOLD_BIRTH_1 = "household_birth_name_1";
    private static final String HOUSEHOLD_AGE_1 = "household_age_1";
    private static final String HOUSEHOLD_SSN_1 = "household_ssn_1";
    private static final String NAME_HOUSEHOLD_2 = "household_name_2";
    private static final String HOUSEHOLD_RELATIONSHIP_2 = "household_relationship_2";
    private static final String HOUSEHOLD_BIRTH_2 = "household_birth_name_2";
    private static final String HOUSEHOLD_AGE_2 = "household_age_2";
    private static final String HOUSEHOLD_SSN_2 = "household_ssn_2";

    private static final String NAME_HOUSEHOLD_3 = "household_name_3";
    private static final String HOUSEHOLD_RELATIONSHIP_3 = "household_relationship_3";
    private static final String HOUSEHOLD_BIRTH_3 = "household_birth_name_3";
    private static final String HOUSEHOLD_AGE_3 = "household_age_3";
    private static final String HOUSEHOLD_SSN_3 = "household_ssn_3";

    private static final String NAME_HOUSEHOLD_4 = "household_name_4";
    private static final String HOUSEHOLD_RELATIONSHIP_4 = "household_relationship_4";
    private static final String HOUSEHOLD_BIRTH_4 = "household_birth_name_4";
    private static final String HOUSEHOLD_AGE_4 = "household_age_4";
    private static final String HOUSEHOLD_SSN_4 = "household_ssn_4";

    private static final String HOUSEHOLD_HANDY = "household_handy";

    SQLiteDatabase db;

    private static final String CREATE_APP_TABLE =
            "CREATE TABLE " + TABLE_APP_A + " (" +
                    KEY_ID + " INTEGER PRIMARY KEY NOT NULL, "
                    + NAME_HOUSEHOLD_1 + " TEXT,"
                    + HOUSEHOLD_RELATIONSHIP_1 + " TEXT,"
                    + HOUSEHOLD_BIRTH_1 + " TEXT,"
                    + HOUSEHOLD_AGE_1 + " TEXT,"
                    + HOUSEHOLD_SSN_1 + " TEXT,"
                    + NAME_HOUSEHOLD_2 + " TEXT,"
                    + HOUSEHOLD_RELATIONSHIP_2 + " TEXT,"
                    + HOUSEHOLD_BIRTH_2 + " TEXT,"
                    + HOUSEHOLD_AGE_2 + " TEXT,"
                    + HOUSEHOLD_SSN_2 + " TEXT,"
                    + NAME_HOUSEHOLD_3 + " TEXT,"
                    + HOUSEHOLD_RELATIONSHIP_3 + " TEXT,"
                    + HOUSEHOLD_BIRTH_3 + " TEXT,"
                    + HOUSEHOLD_AGE_3 + " TEXT,"
                    + HOUSEHOLD_SSN_3 + " TEXT,"
                    + NAME_HOUSEHOLD_4 + " TEXT,"
                    + HOUSEHOLD_RELATIONSHIP_4 + " TEXT,"
                    + HOUSEHOLD_BIRTH_4 + " TEXT,"
                    + HOUSEHOLD_AGE_4 + " TEXT,"
                    + HOUSEHOLD_SSN_4 + " TEXT,"
                    + HOUSEHOLD_HANDY + " TEXT);";

    public DatabaseAppC(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_APP_TABLE);
        this.db = db;

    }

    public void insertApplicantC(AppCGetSet a) {

        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from appC";
        Cursor cur = db.rawQuery(query, null);
        int count = cur.getCount();

        values.put(KEY_ID, count);

        values.put(NAME_HOUSEHOLD_1, a.getHousehold_name_1());
        values.put(HOUSEHOLD_RELATIONSHIP_1, a.getHousehold_relationship_1());
        values.put(HOUSEHOLD_BIRTH_1, a.getHousehold_birth_name_1());
        values.put(HOUSEHOLD_AGE_1, a.getHousehold_age_1());
        values.put(HOUSEHOLD_SSN_1, a.getHousehold_ssn_1());

        values.put(NAME_HOUSEHOLD_2, a.getHousehold_name_2());
        values.put(HOUSEHOLD_RELATIONSHIP_2, a.getHousehold_relationship_2());
        values.put(HOUSEHOLD_BIRTH_2, a.getHousehold_birth_name_2());
        values.put(HOUSEHOLD_AGE_2, a.getHousehold_age_2());
        values.put(HOUSEHOLD_SSN_2, a.getHousehold_ssn_2());

        values.put(NAME_HOUSEHOLD_3, a.getHousehold_name_3());
        values.put(HOUSEHOLD_RELATIONSHIP_3, a.getHousehold_relationship_3());
        values.put(HOUSEHOLD_BIRTH_3, a.getHousehold_birth_name_3());
        values.put(HOUSEHOLD_AGE_3, a.getHousehold_age_3());
        values.put(HOUSEHOLD_SSN_3, a.getHousehold_ssn_3());

        values.put(NAME_HOUSEHOLD_4, a.getHousehold_name_4());
        values.put(HOUSEHOLD_RELATIONSHIP_4, a.getHousehold_relationship_4());
        values.put(HOUSEHOLD_BIRTH_4, a.getHousehold_birth_name_4());
        values.put(HOUSEHOLD_AGE_4, a.getHousehold_age_4());
        values.put(HOUSEHOLD_SSN_4, a.getHousehold_ssn_4());
        values.put(HOUSEHOLD_HANDY, a.getHousehold_handy());

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