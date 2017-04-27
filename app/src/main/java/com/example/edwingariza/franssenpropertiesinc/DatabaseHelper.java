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



    private static final String TABLE_APP= "application";


    private static final String KEY_ID = "id";
    private static final String NAME_AP = "name";
    private static final String ADD_AP = "address";
    private static final String CITY_AP = "city";
    private static final String STATE_AP = "state";
    private static final String ZIP_AP = "zip";
    private static final String PHONE_AP = "phone";
    //First Relative
    private static final String NAME_RELATIVE_1 = "rel_name_1";
    //private static final String RELATIONSHIP_1 = "relationship_1";
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
                    _ID + " INTEGER PRIMARY KEY not null, " +
                    NAME + " TEXT not null ," +
                    UNIT_NUMBER + " TEXT not nul, " +
                    USER_NAME + " TEXT not null, " +
                    PASS+ " TEXT not null);";

    private static final String CREATE_APP_TABLE =
            "CREATE TABLE " + TABLE_APP + " (" +
                    KEY_ID + " INTEGER PRIMARY KEY NOT NULL, "
                    + NAME_AP + " TEXT, "
                    + ADD_AP + " TEXT, "
                    + CITY_AP + " TEXT, "
                    + STATE_AP + " TEXT, "
                    + ZIP_AP + " TEXT, "
                    + PHONE_AP + " TEXT, "
                    + NAME_RELATIVE_1 + " TEXT, "
                  //  + RELATIONSHIP_1 + " TEXT, "
                    + ADDRESS_REL_1 + " TEXT, "
                    + RELATIVE_PHONE_1 + " TEXT, "
                    + NAME_RELATIVE_2 + " TEXT, "
                    + RELATIONSHIP_2 + " TEXT, "
                    + ADDRESS_REL_2 + " TEXT, "
                    + RELATIVE_PHONE_2 + " TEXT, "
                    + PREVIEWS_PROPERTY_NAME + " TEXT, "
                    + PREVIEWS_PROPERTY_NUMBER + " TEXT);";



    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATA_BASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        db.execSQL(TABLE_REQUEST);
        db.execSQL(CREATE_APP_TABLE);
        this.db = db;
    }

    public void insertApplicant(ApplicationGetSet a) {

        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from application";
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
       // values.put(RELATIONSHIP_1, a.getRelationship_1());
        values.put(ADDRESS_REL_1, a.getAddress_rel_1());
        values.put(RELATIVE_PHONE_1, a.getRelative_phone_1());
        values.put(NAME_RELATIVE_2, a.getRel_name_2());
        values.put(RELATIONSHIP_2, a.getRelationship_2());
        values.put(ADDRESS_REL_2, a.getAddress_rel_2());
        values.put(RELATIVE_PHONE_2, a.getRelative_phone_2());
        values.put(PREVIEWS_PROPERTY_NAME, a.getPreviews_name());
        values.put(PREVIEWS_PROPERTY_NUMBER, a.getPreviews_number());

        db.insert(TABLE_APP, null, values);
        db.close();
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

        String query = "DROP TABLE IF EXISTS" + TABLE_NAME + TABLE_SERVICE + TABLE_APP;
        //String query1 = "DROP TABLE IF EXISTS" + TABLE_SERVICE;
        db.execSQL(query);
        //db.execSQL(query1);

        this.onCreate(db);
    }
}
