package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ApplicationD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_d);
    }
    public void ContinueEBtn(View view){
        Intent intent = new Intent(this, ApplicationE.class);

        startActivity(intent);
    }
}
