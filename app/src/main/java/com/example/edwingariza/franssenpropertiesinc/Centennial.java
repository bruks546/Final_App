package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Centennial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centennial);
    }

    public void ApplyBtn(View view){
        Intent intent = new Intent(this, Apply.class);

        startActivity(intent);
    }

    public void LocationBtn(View view){
        Intent intent = new Intent(this, Location.class);

        startActivity(intent);
    }
}
