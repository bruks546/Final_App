package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContinueFinal extends AppCompatActivity {
    DatabaseFinal helper = new DatabaseFinal(this);
    EditText editHear ;
    String Hear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_final);
        String name = getIntent().getStringExtra("Name");

        Toast.makeText(ContinueFinal.this, "The last Page " + name, Toast.LENGTH_SHORT).show();


    }

    public void ContinueAppDone(View v)
    {
        editHear = (EditText) findViewById(R.id.hear_text);
        Hear = editHear.getText().toString();

        AppGetSetFinal r = new AppGetSetFinal();

        r.setHear_property(Hear);

        helper.insertApplicantFinal(r);
        Intent in = new Intent(ContinueFinal.this, LogIn.class);

        startActivity(in);
    }

}
