package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ContinueApply extends AppCompatActivity {
    DbHandler dbHelper;
    EditText editUnderName, editWhen, editCurrentLand, editCurrentPhone, editPreLanName, editPreLandPhone;
    Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_apply);
        dbHelper = new DbHandler(this);

        String username = getIntent().getStringExtra("Name");
        //TextView tv = (TextView)findViewById(R.id.tenant_name);
        //tv.setText(username);


        editUnderName = (EditText) findViewById(R.id.name_have);
        editWhen = (EditText) findViewById(R.id.when_text) ;
        editCurrentLand = (EditText) findViewById(R.id.landlord_name);
        editCurrentPhone = (EditText) findViewById(R.id.land_phone);
        editPreLanName = (EditText) findViewById(R.id.prev_name);
        editPreLandPhone = (EditText) findViewById(R.id.prev_phone);




        btnContinue = (Button) findViewById(R.id.button);
       // AddData();

    }
    /**


    public void AddData() {
        btnContinue.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        boolean isInserted = dbHelper.insertB(

                                editUnderName.getText().toString(),
                                editWhen.getText().toString(),
                                editCurrentLand.getText().toString(),
                                editCurrentPhone.getText().toString(),
                                editPreLanName.getText().toString(),
                                editPreLandPhone.getText().toString());



                        if(isInserted == true){
                            Toast.makeText(ContinueApply.this,"Please continue", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(ContinueApply.this, Continue_C.class);
                            startActivity(intent);


                        }

                        else
                            Toast.makeText(ContinueApply.this,"Please Enter Information", Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
     */
}







