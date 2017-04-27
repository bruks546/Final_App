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
    DatabaseAppB helper = new DatabaseAppB(this);





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_apply);


    }
    public void onClickContinueC(View view){

            EditText editUnderName = (EditText) findViewById(R.id.name_have);
            EditText editWhen = (EditText) findViewById(R.id.when_text) ;
            EditText editCurrentLand = (EditText) findViewById(R.id.landlord_name);
            EditText editCurrentPhone = (EditText) findViewById(R.id.land_phone);
            EditText editPreLanName = (EditText) findViewById(R.id.prev_name);
            EditText editPreLandPhone = (EditText) findViewById(R.id.prev_phone);

            String underName = editUnderName.getText().toString();
            String when = editWhen.getText().toString();
             String land=  editCurrentLand.getText().toString();
              String landphone= editCurrentPhone.getText().toString();
              String prename = editPreLanName.getText().toString();
              String prephone   =   editPreLandPhone.getText().toString();

            ApplicationBGetSet c = new ApplicationBGetSet();
            c.setUnder_name(underName);
            c.setWhen_have(when);
            c.setLandlord_name(land);
            c.setLandlord_phone(landphone);
            c.setPre_landlord_name(prename);
            c.setLandlord_phone(prephone);


            helper.insertContact(c);
            Intent in = new Intent(ContinueApply.this, Continue_C.class);
            startActivity(in);


    }
}
