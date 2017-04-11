package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Tenant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenant);

        final TextView user_name = (EditText) findViewById(R.id.register_name);
        final TextView user_unit = (EditText) findViewById(R.id.unit_num_register);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String unitNum = intent.getStringExtra("unitNum");

        user_name.setText(name);
        user_unit.setText(unitNum);

    }
    public void EmergencyBtn(View view){
        Intent intent = new Intent(this, Emergency.class);

        startActivity(intent);
    }
    public void ServiceRequestBtn(View view){
        Intent intent = new Intent(this, ServiceRequest.class);

        startActivity(intent);
    }
}
