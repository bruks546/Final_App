package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ApplicationE extends AppCompatActivity {
    DbHandler dbHelper;
    EditText editBankCheck, editBankSave, editPropVal,
            editMarketVal, editMake, editModel, editLicense, editYear;
    Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_e);
        dbHelper = new DbHandler(this);


        editBankCheck = (EditText) findViewById(R.id.check_bank);
        editBankSave = (EditText) findViewById(R.id.saving_bank);
        editPropVal = (EditText) findViewById(R.id.value_text);
        editMarketVal = (EditText) findViewById(R.id.marketvalue_text);
        editMake = (EditText) findViewById(R.id.make_text);
        editModel = (EditText) findViewById(R.id.model_text);
        editLicense = (EditText) findViewById(R.id.license_text);
        editYear = (EditText) findViewById(R.id.year_text);

        btnContinue = (Button) findViewById(R.id.continue_final);
        AddData();

    }


    public void AddData() {
        btnContinue.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        boolean isInserted = dbHelper.insertE(

                                editBankCheck.getText().toString(),
                                editBankSave.getText().toString(),
                                editPropVal.getText().toString(),
                                editMarketVal.getText().toString(),
                                editMake.getText().toString(),
                                editModel.getText().toString(),
                                editLicense.getText().toString(),
                                editYear.getText().toString());


                        if(isInserted = true){
                            Toast.makeText(ApplicationE.this,"Please continue", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(ApplicationE.this, ContinueFinal.class);
                            startActivity(intent);


                        }

                        else
                            Toast.makeText(ApplicationE.this,"Please Enter Information", Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
    }

