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
            editNameRel2, editRelation2, editAddress2, editPhone2, editPreviewsPropertyName, editPreviewsPropertyPhone ;
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
                                  editPreviewsPropertyPhone.getText().toString());



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


}
