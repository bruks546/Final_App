package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContinueApply extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_apply);
    }

    public void ContinueToCBtn(View view){
        Intent intent = new Intent(this, Continue_C.class);

        startActivity(intent);
    }
}
