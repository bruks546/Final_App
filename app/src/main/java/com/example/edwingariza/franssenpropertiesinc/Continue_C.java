package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Continue_C extends AppCompatActivity {

    DatabaseAppC helper = new DatabaseAppC(this);

    EditText
            editNameHouse1, editHouseRel1, editHouseBirth1, editHouseAge1, editHouseSsn1,
            editNameHouse2, editHouseRel2, editHouseBirth2, editHouseAge2, editHouseSsn2,
            editNameHouse3, editHouseRel3, editHouseBirth3, editHouseAge3, editHouseSsn3,
            editNameHouse4, editHouseRel4, editHouseBirth4, editHouseAge4, editHouseSsn4,
            editHouseHandy;
    String NameHouse1, HouseRel1, HouseBirth1, HouseAge1, HouseSsn1,
            NameHouse2, HouseRel2, HouseBirth2, HouseAge2, HouseSsn2,
            NameHouse3, HouseRel3, HouseBirth3, HouseAge3, HouseSsn3,
            NameHouse4, HouseRel4, HouseBirth4, HouseAge4, HouseSsn4,
            HouseHandy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue__c);





    }

    public void ContinueAppD(View v)
    {
        editNameHouse1 = (EditText) findViewById(R.id.name_relative_1);
        editHouseRel1= (EditText) findViewById(R.id.relation_rel_1);
        editHouseBirth1 = (EditText) findViewById(R.id.brth_1);
        editHouseAge1 = (EditText) findViewById(R.id.age_rel_1);
        editHouseSsn1 = (EditText) findViewById(R.id.social_rel_1);
        editNameHouse2 = (EditText) findViewById(R.id.name_relative_2);
        editHouseRel2= (EditText) findViewById(R.id.relation_rel_2);
        editHouseBirth2 = (EditText) findViewById(R.id.brth_2);
        editHouseAge2 = (EditText) findViewById(R.id.age_rel_2);
        editHouseSsn2 = (EditText) findViewById(R.id.social_rel_2);
        editNameHouse3 = (EditText) findViewById(R.id.name_relative_3);
        editHouseRel3= (EditText) findViewById(R.id.relation_rel_3);
        editHouseBirth3 = (EditText) findViewById(R.id.brth_3);
        editHouseAge3 = (EditText) findViewById(R.id.age_rel_3);
        editHouseSsn3 = (EditText) findViewById(R.id.social_rel_3);
        editNameHouse4 = (EditText) findViewById(R.id.name_relative_4);
        editHouseRel4= (EditText) findViewById(R.id.relation_rel_4);
        editHouseBirth4 = (EditText) findViewById(R.id.brth_4);
        editHouseAge4 = (EditText) findViewById(R.id.age_rel_4);
        editHouseSsn4 = (EditText) findViewById(R.id.social_rel_4);
        editHouseHandy = (EditText) findViewById(R.id.handi_text);

        NameHouse1= editNameHouse1.getText().toString();
        HouseRel1 = editHouseRel1.getText().toString();
        HouseBirth1 =editHouseBirth1.getText().toString();
        HouseAge1 = editHouseAge1.getText().toString();
        HouseSsn1 = editHouseSsn1.getText().toString();

        NameHouse2=editNameHouse2.getText().toString();
        HouseRel2= editHouseRel2.getText().toString();
        HouseBirth2 =editHouseBirth2.getText().toString();
        HouseAge2 =editHouseAge2.getText().toString();
        HouseSsn2 = editHouseSsn2.getText().toString();

        NameHouse3 =editNameHouse3.getText().toString();
        HouseRel3=editHouseRel3.getText().toString();
        HouseBirth3 =editHouseBirth3.getText().toString();
        HouseAge3 = editHouseAge3.getText().toString();
        HouseSsn3= editHouseSsn3.getText().toString();

        NameHouse4 =editNameHouse4.getText().toString();
        HouseRel4 =editHouseRel4.getText().toString();
        HouseBirth4=editHouseBirth4.getText().toString();
        HouseAge4=editHouseAge4.getText().toString();
        HouseSsn4=editHouseSsn4.getText().toString();
        HouseHandy=editHouseHandy.getText().toString();

        if(!(NameHouse1.equals(""))) {

            if (!(HouseBirth1.equals(""))) {


                if (!(HouseAge1.equals(""))) {


                    if (!(HouseSsn1.equals(""))) {


                        AppCGetSet r = new AppCGetSet();
                        r.setHousehold_name_1(NameHouse1);
                        r.setHousehold_relationship_1(HouseRel1);
                        r.setHousehold_birth_name_1(HouseBirth1);
                        r.setHousehold_age_1(HouseAge1);
                        r.setHousehold_ssn_1(HouseSsn1);
                        r.setHousehold_name_2(NameHouse2);
                        r.setHousehold_relationship_2(HouseRel2);
                        r.setHousehold_birth_name_2(HouseBirth2);
                        r.setHousehold_age_2(HouseAge2);
                        r.setHousehold_ssn_2(HouseSsn2);
                        r.setHousehold_birth_name_3(NameHouse3);
                        r.setHousehold_relationship_3(HouseRel3);
                        r.setHousehold_birth_name_3(HouseBirth3);
                        r.setHousehold_age_3(HouseAge3);
                        r.setHousehold_ssn_3(HouseSsn3);
                        r.setHousehold_name_4(NameHouse4);
                        r.setHousehold_relationship_4(HouseRel4);
                        r.setHousehold_birth_name_4(HouseBirth4);
                        r.setHousehold_age_4(HouseAge4);
                        r.setHousehold_ssn_4(HouseSsn4);
                        r.setHousehold_handy(HouseHandy);

                        helper.insertApplicantC(r);
                        Intent in = new Intent(Continue_C.this, ApplicationD.class);
                        startActivity(in);
                    } else {
                        Toast.makeText(Continue_C.this, "Please enter your Social Security Number", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(Continue_C.this, "Please enter your Age", Toast.LENGTH_LONG).show();

                }
            } else {
                Toast.makeText(Continue_C.this, "Please enter your Birth Date", Toast.LENGTH_LONG).show();

            }
        }
        else{
            Toast.makeText(Continue_C.this, "Please enter your Name", Toast.LENGTH_LONG).show();

        }

    }

    }


