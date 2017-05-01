package com.example.edwingariza.franssenpropertiesinc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by edwingariza on 4/11/17.
 */




    public class DbHandler extends SQLiteOpenHelper {


        private static final int DATABASE_VERSION = 1;


        private static final String DATABASE_NAME = "Fra.db";
        private static final String TABLE_APP_A = "Application_A";


        private static final String KEY_ID = "id";
        private static final String NAME_AP = "name";
        private static final String ADD_AP = "address";
        private static final String CITY_AP = "city";
        private static final String STATE_AP = "state";
        private static final String ZIP_AP = "zip";
        private static final String PHONE_AP = "phone";
        //First Relative
        private static final String NAME_RELATIVE_1 = "rel_name_1";
        private static final String RELATIONSHIP_1 = "relationship_1";
        private static final String ADDRESS_REL_1 = "address_rel_1";
        private static final String RELATIVE_PHONE_1 = "relative_phone_1";
        //Second relative
        private static final String NAME_RELATIVE_2 = "rel_name_2";
        private static final String RELATIONSHIP_2 = "relationship_2";
        private static final String ADDRESS_REL_2 = "address_rel_2";
        private static final String RELATIVE_PHONE_2 = "relative_phone_2";
        //Hud previws name
        private static final String PREVIEWS_PROPERTY_NAME = "previews_name";
        private static final String PREVIEWS_PROPERTY_NUMBER = "previews_number";



        SQLiteDatabase db;


        private static final String CREATE_APP_TABLE =
                "CREATE TABLE " + TABLE_APP_A + " (" +
                        KEY_ID + " INTEGER PRIMARY KEY not null,"
                + NAME_AP + " TEXT,"
                + ADD_AP + " TEXT,"
                + CITY_AP + " TEXT,"
                + STATE_AP + " TEXT,"
                + ZIP_AP + " TEXT,"
                + PHONE_AP + " TEXT,"
                + NAME_RELATIVE_1 + " TEXT,"
                + RELATIONSHIP_1 + " TEXT,"
                + ADDRESS_REL_1 + " TEXT,"
                + RELATIVE_PHONE_1 + " TEXT,"
                + NAME_RELATIVE_2 + " TEXT,"
                + RELATIONSHIP_2 + " TEXT,"
                + ADDRESS_REL_2 + " TEXT,"
                + RELATIVE_PHONE_2 + " TEXT,"
                + PREVIEWS_PROPERTY_NAME + " TEXT,"
                + PREVIEWS_PROPERTY_NUMBER + " TEXT)";


        public DbHandler(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREATE_APP_TABLE);
            this.db = db;
        }


        public void insertApplicant(ApplicationGetSet a) {

            db = this.getWritableDatabase();
            ContentValues values = new ContentValues();

            String query = "select * from Application_A";
            Cursor cur = db.rawQuery(query, null);
            int count = cur.getCount();

            values.put(KEY_ID, count);
            values.put(NAME_AP, a.getName());
            values.put(ADD_AP, a.getAddress());
            values.put(CITY_AP, a.getCity());
            values.put(STATE_AP, a.getState());
            values.put(ZIP_AP, a.getZip());
            values.put(PHONE_AP, a.getPhone());
            values.put(NAME_RELATIVE_1, a.getRel_name_1());
            values.put(RELATIONSHIP_1, a.getRelationship_1());
            values.put(ADDRESS_REL_1, a.getAddress_rel_1());
            values.put(RELATIVE_PHONE_1, a.getRelative_phone_1());
            values.put(NAME_RELATIVE_2, a.getRel_name_2());
            values.put(RELATIONSHIP_2, a.getRelationship_2());
            values.put(ADDRESS_REL_2, a.getAddress_rel_2());
            values.put(RELATIVE_PHONE_2, a.getRelative_phone_2());
            values.put(PREVIEWS_PROPERTY_NAME, a.getPreviews_name());
            values.put(PREVIEWS_PROPERTY_NUMBER, a.getPreviews_number());



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




