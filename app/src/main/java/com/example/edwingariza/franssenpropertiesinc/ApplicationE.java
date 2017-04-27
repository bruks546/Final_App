package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ApplicationE extends AppCompatActivity {
    DatabaseE helper = new DatabaseE(this);

    EditText editBankCheck,
            editBankSave,
            editPropVal,
            editMarketVal,
            editMake,
            editModel,
            editLicense,
            editYear;
    String BankCheck,
           BankSave,
           PropVal,
           MarketVal,
           Make,
           Model,
           License,
            Year;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_e);


    }

    public void ContinueAppFinal(View v)
    {

        editBankCheck = (EditText) findViewById(R.id.check_bank);
        editBankSave = (EditText) findViewById(R.id.saving_bank);
        editPropVal = (EditText) findViewById(R.id.value_text);
        editMarketVal = (EditText) findViewById(R.id.marketvalue_text);
        editMake = (EditText) findViewById(R.id.make_text);
        editModel = (EditText) findViewById(R.id.model_text);
        editLicense = (EditText) findViewById(R.id.license_text);
        editYear = (EditText) findViewById(R.id.year_text);

        BankCheck = editBankCheck.getText().toString();
        BankSave = editBankSave.getText().toString();
        PropVal = editPropVal.getText().toString();
        MarketVal = editMarketVal.getText().toString();
        Make = editMake.getText().toString();
        Model = editModel.getText().toString();
        License = editLicense.getText().toString();
        Year = editYear.getText().toString();


        AppGetSetE r = new AppGetSetE();

        r.setBank_name_checking(BankCheck);
        r.setBank_name_saving(BankSave);
        r.setProperty_val(PropVal);
        r.setMarket_val_dis(MarketVal);
        r.setVehicle_made(Make);
        r.setVehicle_model(Model);
        r.setVehicle_license(License);
        r.setVehicle_year(Year);



        helper.insertApplicantE(r);
        Intent in = new Intent(ApplicationE.this, ContinueFinal.class);
        startActivity(in);


    }

    }

