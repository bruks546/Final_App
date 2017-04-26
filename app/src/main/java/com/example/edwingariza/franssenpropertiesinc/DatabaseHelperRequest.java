package com.example.edwingariza.franssenpropertiesinc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by edwingariza on 4/25/17.
 */

public class DatabaseHelperRequest extends SQLiteOpenHelper {



        private static final int DATA_BASE_VERSION =1;
        private static final String DATABASE_NAME = "service_request.db";


        private static final String TABLE_SERVICE = "request";
        private static final String _ID_SR = "_id";
        private static final String CATEGORY = "category";
        private static final String ISSUE = "issue";
        private static final String REQ_NAME = "req_name";
        private static final String REQ_PHONE = "req_phone";
        private static final String REQ_UNIT = "req_unit";



        SQLiteDatabase db;


        private static final String TABLE_REQUEST =
                "CREATE TABLE "+ TABLE_SERVICE + " (" +
                        _ID_SR + " INTEGER PRIMARY KEY NOT NULL, " +
                        CATEGORY + " TEXT, " +
                        ISSUE + " TEXT NOT NULL, " +
                        REQ_NAME + " TEXT NOT NULL, " +
                        REQ_PHONE+ " TEXT, " +
                        REQ_UNIT+" TEXT NOT NULL);";





        public DatabaseHelperRequest(Context context){
            super(context, DATABASE_NAME, null, DATA_BASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(TABLE_REQUEST);
            this.db = db;
        }



        public void insertRequest(Request r){

            db = this.getWritableDatabase();
            ContentValues val = new ContentValues();

            String query ="select * from request";
            Cursor cur = db.rawQuery(query, null);
            int count = cur.getCount();

            val.put(_ID_SR, count);
            val.put(CATEGORY, r.getCategory());
            val.put(ISSUE, r.getIssue());
            val.put(REQ_NAME, r.getReq_name());
            val.put(REQ_PHONE, r.getReq_phone());
            val.put(REQ_UNIT, r.getReq_unit());


            db.insert(TABLE_SERVICE, null, val);
            db.close();
        }




        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            String query = "DROP TABLE IF EXISTS" + TABLE_SERVICE;

            db.execSQL(query);

            this.onCreate(db);
        }
    }


