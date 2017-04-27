package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ApplicationD extends AppCompatActivity {
    DatabaseAppD helper = new DatabaseAppD(this);

    EditText editIncomeName1,
            editIncomeSource1,
            editIncomeAmount1,
            editIncomeName2,
            editIncomeSource2,
            editIncomeAmount2,
            editIncomeName3,
            editIncomeSource3,
            editIncomeAmount3 ;

    String IncomeName1,
            IncomeSource1,
            IncomeAmount1,
            IncomeName2,
            IncomeSource2,
            IncomeAmount2,
            IncomeName3,
            IncomeSource3,
            IncomeAmount3 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_d);


    }

    public void ContinueAppE(View v)
    {
        editIncomeName1 = (EditText) findViewById(R.id.income_family_1);
        editIncomeSource1 = (EditText) findViewById(R.id.income_source_1);
        editIncomeAmount1 =(EditText) findViewById(R.id.amount_1);
        editIncomeName2 = (EditText) findViewById(R.id.income_family_2);
        editIncomeSource2 = (EditText) findViewById(R.id.income_source_2);
        editIncomeAmount2 =(EditText) findViewById(R.id.amount_2);
        editIncomeName3 = (EditText) findViewById(R.id.income_family_3);
        editIncomeSource3 = (EditText) findViewById(R.id.income_source_3);
        editIncomeAmount3 =(EditText) findViewById(R.id.amount_3);

        IncomeName1 = editIncomeName1.getText().toString();
        IncomeSource1 = editIncomeSource1.getText().toString();
        IncomeAmount1= editIncomeAmount1.getText().toString();
        IncomeName2=editIncomeName2.getText().toString();
        IncomeSource2 =editIncomeSource2.getText().toString();

        IncomeAmount2 =editIncomeAmount2.getText().toString();
        IncomeName3 =editIncomeName3.getText().toString();
        IncomeSource3 =editIncomeSource3.getText().toString();
        IncomeAmount3 =editIncomeAmount3.getText().toString();

        ApplicationDGetSet r = new ApplicationDGetSet();

        r.setName_income_1(IncomeName1);
        r.setIncome_source_1(IncomeSource1);
        r.setIncome_amount_1(IncomeAmount1);
        r.setName_income_2(IncomeName2);
        r.setIncome_source_1(IncomeSource2);
        r.setIncome_amount_2(IncomeAmount2);
        r.setName_income_3(IncomeName3);
        r.setIncome_source_1(IncomeSource3);
        r.setIncome_amount_3(IncomeAmount3);


        helper.insertApplicantD(r);
        Intent in = new Intent(ApplicationD.this, ApplicationE.class);
        startActivity(in);


    }

    }


