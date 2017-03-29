package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tenant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenant);
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
