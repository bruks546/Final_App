package com.example.edwingariza.franssenpropertiesinc;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by edwingariza on 4/11/17.
 */

public class DbHandler extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "FranssenProperties.db";
    private static final String TABLE_APP_A = "Application_A";
    private static final String KEY_ID = "id";
    private static final String NAME_AP = "name";
    private static final String ADD_AP = "address";
    private static final String CITY_AP = "city";
    private static final String STATE_AP = "state";
    private static final String ZIP_AP = "zip";
    private static final String PHONE_AP = "phone";



    public DbHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        String CREATE_APP_TABLE = "CREATE TABLE " + TABLE_APP_A + " (" +KEY_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"
                +NAME_AP+" TEXT,"
                +ADD_AP+" TEXT,"
                +CITY_AP+" TEXT,"
                +STATE_AP+" TEXT,"
                +ZIP_AP+" TEXT,"
                +PHONE_AP+ " TEXT"+")";
        db.execSQL(CREATE_APP_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_APP_A);
        onCreate(db);

    }
public boolean insertData(String name, String address, String city, String state, String zip, String phone){

    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues values = new ContentValues();
    values.put(NAME_AP, name);
    values.put(ADD_AP, address);
    values.put(CITY_AP, city);
    values.put(STATE_AP, state);
    values.put(ZIP_AP, zip);
    values.put(PHONE_AP, phone);
    long result = db.insert(TABLE_APP_A, null, values);

    if(result == -1)
        return false;
        else
            return true;

}

}
