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

    //Continue B
    private static final String UNDER_NAME = "under_name";
    private static final String WHEN = "when_have";
    private static final String CURRENT_LANDLORD = "landlord_name";
    private static final String LANDLORD_PHONE = "landlord_phone";
    private static final String PRE_LANDLORD_NAME = "pre_landlord_name";
    private static final String PRE_LANDLORD_PHONE = "pre_landlord_phone";

    //Continue C
    private static final String NAME_HOUSEHOLD_1 = "household_name_1";
    private static final String HOUSEHOLD_RELATIONSHIP_1 = "household_relationship_1";
    private static final String HOUSEHOLD_BIRTH_1 = "household_birth_name_1";
    private static final String HOUSEHOLD_AGE_1 = "household_age_1";
    private static final String HOUSEHOLD_SSN_1 = "household_ssn_1";

    private static final String NAME_HOUSEHOLD_2 = "household_name_2";
    private static final String HOUSEHOLD_RELATIONSHIP_2 = "household_relationship_";
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

    //Continue D
    private static final String INCOME_NAME_1 = "name_income_1";
    private static final String INCOME_SOURCE_1 = "income_source_1";
    private static final String INCOME_AMOUNT_1 = "income_amount_1";

    private static final String INCOME_NAME_2 = "name_income_2";
    private static final String INCOME_SOURCE_2 = "income_source_2";
    private static final String INCOME_AMOUNT_2 = "income_amount_2";

    private static final String INCOME_NAME_3 = "name_income_3";
    private static final String INCOME_SOURCE_3 = "income_source_3";
    private static final String INCOME_AMOUNT_3 = "income_amount_3";

    //Continue E

    private static final String BANK_NAME_CHECKING = "bank_name_checking";
    private static final String BANK_NAME_SAVING = "bank_name_saving";
    private static final String PROPERTY_VALUATION = "property_val";
    private static final String MARKET_VALUE_DISPOSED = "market_val_dis";

    private static final String VEHICLE_MAKE = "vehicle_made";
    private static final String VEHICLE_MODEL = "vehicle_model";
    private static final String VEHICLE_LICENSE = "vehicle_license";
    private static final String VEHICLE_YEAR = "vehicle_year";

    private static final String HEAR_PROPERTY = "hear_property";



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
