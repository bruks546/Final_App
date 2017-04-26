package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Continue_C extends AppCompatActivity {
    DbHandler dbHelper;
    EditText
            editNameHouse1, editHouseRel1, editHouseBirth1, editHouseAge1, editHouseSsn1,
            editNameHouse2, editHouseRel2, editHouseBirth2, editHouseAge2, editHouseSsn2,
            editNameHouse3, editHouseRel3, editHouseBirth3, editHouseAge3, editHouseSsn3,
            editNameHouse4, editHouseRel4, editHouseBirth4, editHouseAge4, editHouseSsn4,
            editHouseHandy;
    Button btnContinue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue__c);
        dbHelper = new DbHandler(this);


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




        btnContinue = (Button) findViewById(R.id.continue_to_d);
//        AddData();

    }
    /**


    public void AddData() {
        btnContinue.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        boolean isInserted = dbHelper.insertC(
         editNameHouse1.getText().toString(), editHouseRel1.getText().toString(), editHouseBirth1.getText().toString(), editHouseAge1.getText().toString(), editHouseSsn1.getText().toString(),
         editNameHouse2.getText().toString(), editHouseRel2.getText().toString(), editHouseBirth2.getText().toString(), editHouseAge2.getText().toString(), editHouseSsn2.getText().toString(),
         editNameHouse3.getText().toString(), editHouseRel3.getText().toString(), editHouseBirth3.getText().toString(), editHouseAge3.getText().toString(), editHouseSsn3.getText().toString(),
         editNameHouse4.getText().toString(), editHouseRel4.getText().toString(), editHouseBirth4.getText().toString(), editHouseAge4.getText().toString(), editHouseSsn4.getText().toString(),
                        editHouseHandy.getText().toString());



                        if(isInserted == true){
                            Toast.makeText(Continue_C.this,"Please continue", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(Continue_C.this, ApplicationD.class);
                            startActivity(intent);


                        }

                        else
                            Toast.makeText(Continue_C.this,"Please Enter Information", Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
     */
    }


