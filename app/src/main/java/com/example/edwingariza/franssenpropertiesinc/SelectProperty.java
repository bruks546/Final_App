package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectProperty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_property);
    }
    public void ContinueBtn(View view){
        Intent intent = new Intent(this, Application.class);

        startActivity(intent);
    }
}
