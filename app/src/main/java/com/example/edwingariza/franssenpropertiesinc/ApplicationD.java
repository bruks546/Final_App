package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ApplicationD extends AppCompatActivity {
    DbHandler dbHelper;
    EditText editIncomeName1, editIncomeSource1, editIncomeAmount1,
            editIncomeName2, editIncomeSource2, editIncomeAmount2, editIncomeName3,
            editIncomeSource3, editIncomeAmount3 ;
    Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_d);
        dbHelper = new DbHandler(this);


        editIncomeName1 = (EditText) findViewById(R.id.income_family_1);
        editIncomeSource1 = (EditText) findViewById(R.id.income_source_1);
        editIncomeAmount1 =(EditText) findViewById(R.id.amount_1);
        editIncomeName2 = (EditText) findViewById(R.id.income_family_2);
        editIncomeSource2 = (EditText) findViewById(R.id.income_source_2);
        editIncomeAmount2 =(EditText) findViewById(R.id.amount_2);
        editIncomeName3 = (EditText) findViewById(R.id.income_family_3);
        editIncomeSource3 = (EditText) findViewById(R.id.income_source_3);
        editIncomeAmount3 =(EditText) findViewById(R.id.amount_3);


        btnContinue = (Button) findViewById(R.id.continue_e);
        AddData();

    }


    public void AddData() {
        btnContinue.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        boolean isInserted = dbHelper.insertD(

                                editIncomeName1.getText().toString(),
                                editIncomeSource1.getText().toString(),
                                editIncomeAmount1.getText().toString(),
                                editIncomeName2.getText().toString(),
                                editIncomeSource2.getText().toString(),
                                editIncomeAmount2.getText().toString(),
                                editIncomeName3.getText().toString(),
                                editIncomeSource3.getText().toString(),
                                editIncomeAmount3.getText().toString());



                        if(isInserted = true){
                            Toast.makeText(ApplicationD.this,"Please continue", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(ApplicationD.this, ApplicationE.class);
                            startActivity(intent);


                        }

                        else
                            Toast.makeText(ApplicationD.this,"Please Enter Information", Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
    }


