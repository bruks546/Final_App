package com.example.edwingariza.franssenpropertiesinc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by edwingariza on 4/25/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper{

    private static final int DATA_BASE_VERSION =1;
    private static final String DATABASE_NAME = "franssen.db";
    private static final String TABLE_NAME = "contacts";
    private static final String _ID = "id";
    private static final String NAME = "name";
    private static final String USER_NAME = "username";
    private static final String UNIT_NUMBER = "unit_number";
    private static final String PASS = "pass";

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


    private static final String TABLE_CREATE =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    _ID + " INTEGER PRIMARY KEY NOT NULL, " +
                    NAME + " TEXT NOT NULL ," +
                    UNIT_NUMBER + " TEXT NOT NULL, " +
                    USER_NAME + " TEXT NOT NULL, " +
                    PASS+ " TEXT NOT NULL);";



    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATA_BASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
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

    public void insertContact(Contact c){

        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query ="select * from contacts";
        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();

        values.put(_ID, count);
        values.put(NAME, c.getName());
        values.put(UNIT_NUMBER, c.getUnit());
        values.put(USER_NAME, c.getUserename());
        values.put(PASS, c.getPass());

        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public String searchPass(String uname)
    {
        db = this.getReadableDatabase();
        String query = "SELECT username, pass FROM "+TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String a, b;
        b = "not found";

        if(cursor.moveToFirst())
        {
            do{
                a= cursor.getString(0);

                if(a.equals(uname))
                {
                    b = cursor.getString(1);
                    break;
                }

            }
            while(cursor.moveToNext());
        }
        return b;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String query = "DROP TABLE IF EXISTS" + TABLE_NAME + TABLE_SERVICE;
        //String query1 = "DROP TABLE IF EXISTS" + TABLE_SERVICE;
        db.execSQL(query);
        //db.execSQL(query1);

        this.onCreate(db);
    }
}
