package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Application extends AppCompatActivity {
    public final static String KEY_EXTRA_CONTACT_ID = "KEY_EXTRA_CONTACT_ID";


    DbHandler dbHelper;
    EditText editName, editAdd, editCity, editState, editZip, editPhone;
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
                                    editPhone.getText().toString());
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
