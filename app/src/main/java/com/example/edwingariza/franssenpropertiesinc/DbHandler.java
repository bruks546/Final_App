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
                +PHONE_AP+ " TEXT,"
                +NAME_RELATIVE_1+" TEXT,"
                +RELATIONSHIP_1+ " TEXT,"
                +ADDRESS_REL_1+ " TEXT,"
                +RELATIVE_PHONE_1 + " TEXT,"
                +NAME_RELATIVE_2+ " TEXT,"
                +RELATIONSHIP_2+" TEXT,"
                +ADDRESS_REL_2+" TEXT,"
                +RELATIVE_PHONE_2+" TEXT,"
                +PREVIEWS_PROPERTY_NAME+" TEXT,"
                +PREVIEWS_PROPERTY_NUMBER+" TEXT,"
                +UNDER_NAME+" TEXT,"
                +WHEN+" TEXT,"
                +CURRENT_LANDLORD+" TEXT,"
                +LANDLORD_PHONE+" TEXT,"
                +PRE_LANDLORD_NAME+" TEXT,"
                +PRE_LANDLORD_PHONE+" TEXT,"
                +NAME_HOUSEHOLD_1+" TEXT,"
                +HOUSEHOLD_RELATIONSHIP_1+" TEXT,"
                +HOUSEHOLD_BIRTH_1+" TEXT,"
                +HOUSEHOLD_AGE_1+" TEXT,"
                +HOUSEHOLD_SSN_1+" TEXT,"
                +NAME_HOUSEHOLD_2+" TEXT,"
                +HOUSEHOLD_RELATIONSHIP_2+" TEXT,"
                +HOUSEHOLD_BIRTH_2+" TEXT,"
                +HOUSEHOLD_AGE_2+" TEXT,"
                +HOUSEHOLD_SSN_2+" TEXT,"
                +NAME_HOUSEHOLD_3+" TEXT,"
                +HOUSEHOLD_RELATIONSHIP_3+" TEXT,"
                +HOUSEHOLD_BIRTH_3+" TEXT,"
                +HOUSEHOLD_AGE_3+" TEXT,"
                +HOUSEHOLD_SSN_3+" TEXT,"
                +NAME_HOUSEHOLD_4+" TEXT,"
                +HOUSEHOLD_RELATIONSHIP_4+" TEXT,"
                +HOUSEHOLD_BIRTH_4+" TEXT,"
                +HOUSEHOLD_AGE_4+" TEXT,"
                +HOUSEHOLD_SSN_4+" TEXT,"
                +HOUSEHOLD_HANDY+" TEXT,"
                +INCOME_NAME_1+" TEXT,"
                +INCOME_SOURCE_1+" TEXT,"
                +INCOME_AMOUNT_1+" TEXT,"
                +INCOME_NAME_2+" TEXT,"
                +INCOME_SOURCE_2+" TEXT,"
                +INCOME_AMOUNT_2+" TEXT,"
                +INCOME_NAME_3+" TEXT,"
                +INCOME_SOURCE_3+" TEXT,"
                +INCOME_AMOUNT_3+" TEXT,"
                +BANK_NAME_CHECKING+" TEXT,"
                +BANK_NAME_SAVING+" TEXT,"
                +PROPERTY_VALUATION+" TEXT,"
                +MARKET_VALUE_DISPOSED+" TEXT,"
                +VEHICLE_MAKE+" TEXT,"
                +VEHICLE_MODEL+" TEXT,"
                +VEHICLE_LICENSE+ " TEXT,"
                +VEHICLE_YEAR+" TEXT,"
                +HEAR_PROPERTY+" TEXT" + ")";
        db.execSQL(CREATE_APP_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_APP_A);
        onCreate(db);

    }
public boolean insertData(String name, String address, String city, String state, String zip, String phone,
                          String rel_name1, String relationship_1, String address_rel_1, String relative_phone_1,
                          String rel_name2, String relationship_2, String address_rel_2, String relative_phone_2,
                          String previews_property_name, String previews_property_phone, String under_name, String when,
                          String current_landloard, String landloard_phone, String pre_landloard_name, String pre_lanloard_phone,
                          String name_household_1, String household_relationship_1, String household_birth_1, String household_age_1, String ssn_1,
                          String name_household_2, String household_relationship_2, String household_birth_2, String household_age_2, String ssn_2,
                          String name_household_3, String household_relationship_3, String household_birth_3, String household_age_3, String ssn_3,
                          String name_household_4, String household_relationship_4, String household_birth_4, String household_age_4, String ssn_4,
                          String handy, String income_name_1, String income_source_1, String income_amount_1,
                          String income_name_2, String income_source_2, String income_amount_2,
                          String income_name_3, String income_source_3, String income_amount_3, String bank_name_checking, String bank_name_saving, String property_value, String market_value_disposed,
                          String vehicle_make, String vehicle_model, String vehicle_license, String vehicle_year){

    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues values = new ContentValues();
    values.put(NAME_AP, name);
    values.put(ADD_AP, address);
    values.put(CITY_AP, city);
    values.put(STATE_AP, state);
    values.put(ZIP_AP, zip);
    values.put(PHONE_AP, phone);
    values.put(NAME_RELATIVE_1, rel_name1);
    values.put(RELATIONSHIP_1, relationship_1);
    values.put(ADDRESS_REL_1, address_rel_1);
    values.put(RELATIVE_PHONE_1, relative_phone_1);
    values.put(NAME_RELATIVE_2, rel_name2);
    values.put(RELATIONSHIP_2, relationship_2);
    values.put(ADDRESS_REL_2, address_rel_2);
    values.put(RELATIVE_PHONE_2, relative_phone_2);
    values.put(PREVIEWS_PROPERTY_NAME, previews_property_name);
    values.put(PREVIEWS_PROPERTY_NUMBER, previews_property_phone);
    values.put(UNDER_NAME, under_name);
    values.put(WHEN, when);
    values.put(CURRENT_LANDLORD, current_landloard);
    values.put(LANDLORD_PHONE, landloard_phone);
    values.put(PRE_LANDLORD_NAME, pre_landloard_name);
    values.put(PRE_LANDLORD_PHONE, pre_lanloard_phone);
    values.put(NAME_HOUSEHOLD_1, name_household_1);
    values.put(HOUSEHOLD_RELATIONSHIP_1, household_relationship_1);
    values.put(HOUSEHOLD_BIRTH_1, household_birth_1);
    values.put(HOUSEHOLD_AGE_1, household_age_1);
    values.put(HOUSEHOLD_SSN_1, ssn_1);
    values.put(NAME_HOUSEHOLD_1, name_household_2);
    values.put(HOUSEHOLD_RELATIONSHIP_1, household_relationship_2);
    values.put(HOUSEHOLD_BIRTH_1, household_birth_2);
    values.put(HOUSEHOLD_AGE_1, household_age_2);
    values.put(HOUSEHOLD_SSN_1, ssn_2);
    values.put(NAME_HOUSEHOLD_1, name_household_3);
    values.put(HOUSEHOLD_RELATIONSHIP_1, household_relationship_3);
    values.put(HOUSEHOLD_BIRTH_1, household_birth_3);
    values.put(HOUSEHOLD_AGE_1, household_age_3);
    values.put(HOUSEHOLD_SSN_1, ssn_3);
    values.put(NAME_HOUSEHOLD_1, name_household_4);
    values.put(HOUSEHOLD_RELATIONSHIP_1, household_relationship_4);
    values.put(HOUSEHOLD_BIRTH_1, household_birth_4);
    values.put(HOUSEHOLD_AGE_1, household_age_4);
    values.put(HOUSEHOLD_SSN_1, ssn_4);
    values.put(HOUSEHOLD_HANDY, handy );
    values.put(INCOME_NAME_1, income_name_1);
    values.put(INCOME_SOURCE_1, income_source_1);
    values.put(INCOME_AMOUNT_1, income_amount_1);
    values.put(INCOME_NAME_1, income_name_2);
    values.put(INCOME_SOURCE_1, income_source_2);
    values.put(INCOME_AMOUNT_1, income_amount_2);
    values.put(INCOME_NAME_1, income_name_3);
    values.put(INCOME_SOURCE_1, income_source_3);
    values.put(INCOME_AMOUNT_1, income_amount_3);
    values.put(BANK_NAME_CHECKING, bank_name_checking);
    values.put(BANK_NAME_SAVING, bank_name_saving);
    values.put(PROPERTY_VALUATION, property_value);
    values.put(MARKET_VALUE_DISPOSED, market_value_disposed);
    values.put(VEHICLE_MAKE, vehicle_make);
    values.put(VEHICLE_MODEL, vehicle_model);
    values.put(VEHICLE_LICENSE, vehicle_license);
    values.put(VEHICLE_YEAR, vehicle_year);
  //  values.put(HEAR_PROPERTY, hear);


    long result = db.insert(TABLE_APP_A, null, values);

    if(result == -1)
        return false;
        else
            return true;

}

}
