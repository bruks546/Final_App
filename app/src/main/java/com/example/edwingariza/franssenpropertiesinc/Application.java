package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Application extends AppCompatActivity {
    public final static String KEY_EXTRA_CONTACT_ID = "KEY_EXTRA_CONTACT_ID";


    DbHandler dbHelper;
    EditText editName, editAdd, editCity, editState, editZip, editPhone, editNameRel1, editRelation1, editAddress1, editPhone1,
            editNameRel2, editRelation2, editAddress2, editPhone2, editPreviewsPropertyName, editPreviewsPropertyPhone, editUnderName,
            editWhen, editCurrentLand, editCurrentPhone, editPreLanName, editPreLandPhone,
            editNameHouse1, editHouseRel1, editHouseBirth1, editHouseAge1, editHouseSsn1,
            editNameHouse2, editHouseRel2, editHouseBirth2, editHouseAge2, editHouseSsn2,
            editNameHouse3, editHouseRel3, editHouseBirth3, editHouseAge3, editHouseSsn3,
            editNameHouse4, editHouseRel4, editHouseBirth4, editHouseAge4, editHouseSsn4,
            editHouseHandy, editIncomeName1, editIncomeSource1, editIncomeAmount1,
            editIncomeName2, editIncomeSource2, editIncomeAmount2, editIncomeName3,
            editIncomeSource3, editIncomeAmount3, editBankCheck, editBankSave, editPropVal,
            editMarketVal, editMake, editModel, editLicense, editYear, editHear ;
    Button btnContinue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application);
        dbHelper = new DbHandler(this);

        editName = (EditText) findViewById(R.id.name_Text);
        editAdd = (EditText) findViewById(R.id.address_Text);
        editCity = (EditText) findViewById(R.id.city_Text);
        editState = (EditText) findViewById(R.id.state_Text);
        editZip = (EditText) findViewById(R.id.zip_Text);
        editPhone = (EditText) findViewById(R.id.phone_Text);
        editNameRel1 = (EditText) findViewById(R.id.rel_name_1);
        editRelation1 = (EditText) findViewById(R.id.relation_Text);
        editAddress1 = (EditText) findViewById(R.id.address_rel_1);
        editPhone1 = (EditText) findViewById(R.id.phone_rel_1);
        editNameRel2 = (EditText) findViewById(R.id.name_rel_2);
        editRelation2 = (EditText) findViewById(R.id.relation_relation_2);
        editAddress2 = (EditText) findViewById(R.id.address_rel_2);
        editPhone2 =(EditText) findViewById(R.id.phone_rel_2);
        editPreviewsPropertyName = (EditText)  findViewById(R.id.property_name_text);
        editPreviewsPropertyPhone = (EditText) findViewById(R.id.property_phone_text);
        editUnderName = (EditText) findViewById(R.id.name_have);
        editWhen = (EditText) findViewById(R.id.when_text) ;
        editCurrentLand = (EditText) findViewById(R.id.landlord_name);
        editCurrentPhone = (EditText) findViewById(R.id.land_phone);
        editPreLanName = (EditText) findViewById(R.id.prev_name);
        editPreLandPhone = (EditText) findViewById(R.id.prev_phone);
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
        editIncomeName1 = (EditText) findViewById(R.id.income_family_1);
        editIncomeSource1 = (EditText) findViewById(R.id.income_source_1);
        editIncomeAmount1 =(EditText) findViewById(R.id.amount_1);
        editIncomeName2 = (EditText) findViewById(R.id.income_family_2);
        editIncomeSource2 = (EditText) findViewById(R.id.income_source_2);
        editIncomeAmount2 =(EditText) findViewById(R.id.amount_2);
        editIncomeName3 = (EditText) findViewById(R.id.income_family_3);
        editIncomeSource3 = (EditText) findViewById(R.id.income_source_3);
        editIncomeAmount3 =(EditText) findViewById(R.id.amount_3);
        editBankCheck = (EditText) findViewById(R.id.check_bank);
        editBankSave = (EditText) findViewById(R.id.saving_bank);
        editPropVal = (EditText) findViewById(R.id.value_text);
        editMarketVal = (EditText) findViewById(R.id.marketvalue_text);
        editMake = (EditText) findViewById(R.id.make_text);
        editModel = (EditText) findViewById(R.id.model_text);
        editLicense = (EditText) findViewById(R.id.license_text);
        editYear = (EditText) findViewById(R.id.year_text);
        editHear = (EditText) findViewById(R.id.hear_text);



        btnContinue = (Button) findViewById(R.id.apply_conti_btn);
        AddData();

    }


        public void AddData() {
            btnContinue.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                          boolean isInserted = dbHelper.insertData(
                                    editName.getText().toString(),
                                    editAdd.getText().toString(),
                                    editCity.getText().toString(),
                                    editState.getText().toString(),
                                    editZip.getText().toString(),
                                    editPhone.getText().toString(),
                                    editNameRel1.getText().toString(),
                                    editRelation1.getText().toString(),
                                    editAddress1.getText().toString(),
                                  editPhone1.getText().toString(),
                                  editNameRel2.getText().toString(),
                                  editRelation2.getText().toString(),
                                  editAddress2.getText().toString(),
                                  editPhone2.getText().toString(),
                                  editPreviewsPropertyName.getText().toString(),
                                  editPreviewsPropertyPhone.getText().toString(),
                                  editUnderName.getText().toString(),
                                  editWhen.getText().toString(),
                                  editCurrentLand.getText().toString(),
                                  editCurrentPhone.getText().toString(),
                                  editPreLanName.getText().toString(),
                                  editPreLandPhone.getText().toString(),
                                  editNameHouse1.getText().toString(),
                                  editHouseRel1.getText().toString(),
                                  editHouseBirth1.getText().toString(),
                                  editHouseAge1.getText().toString(),
                                  editHouseSsn1.getText().toString(),
                                  editNameHouse2.getText().toString(),
                                  editHouseRel2.getText().toString(),
                                  editHouseBirth2.getText().toString(),
                                  editHouseAge2.getText().toString(),
                                  editHouseSsn2.getText().toString(),
                                  editNameHouse3.getText().toString(),
                                  editHouseRel3.getText().toString(),
                                  editHouseBirth3.getText().toString(),
                                  editHouseAge3.getText().toString(),
                                  editHouseSsn3.getText().toString(),
                                  editNameHouse4.getText().toString(),
                                  editHouseRel4.getText().toString(),
                                  editHouseBirth4.getText().toString(),
                                  editHouseAge4.getText().toString(),
                                  editHouseSsn4.getText().toString(),
                                  editIncomeName1.getText().toString(),
                                  editIncomeSource1.getText().toString(),
                                  editIncomeAmount1.getText().toString(),
                                  editIncomeName2.getText().toString(),
                                  editIncomeSource2.getText().toString(),
                                  editIncomeAmount2.getText().toString(),
                                  editIncomeName3.getText().toString(),
                                  editIncomeSource3.getText().toString(),
                                  editIncomeAmount3.getText().toString(),
                                  editBankCheck.getText().toString(),
                                  editBankSave.getText().toString(),
                                  editPropVal.getText().toString(),
                                  editMarketVal.getText().toString(),
                                  editMake.getText().toString(),
                                  editModel.getText().toString(),
                                  editLicense.getText().toString(),
                                  editYear.getText().toString(),
                                  editHear.getText().toString() );


                            if(isInserted = true){
                                Toast.makeText(Application.this,"Please continue", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(Application.this, ContinueApply.class);
                                startActivity(intent);


                            }

                            else
                                Toast.makeText(Application.this,"Please Enter Information", Toast.LENGTH_LONG).show();

                        }
                    }
            );
    }

    public void ContinueBtn(View view){
        Intent intent = new Intent(this, ContinueApply.class);

        startActivity(intent);
    }
}
