package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContinueFinal extends AppCompatActivity {
    DbHandler dbHelper;
    EditText editHear ;
    Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_final);
        dbHelper = new DbHandler(this);


        editHear = (EditText) findViewById(R.id.hear_text);



        btnContinue = (Button) findViewById(R.id.Submit_btn);
       // AddData();
    }
    /**
    public void AddData() {
        btnContinue.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        boolean isInserted = dbHelper.insertFinal(


                                editHear.getText().toString());


                        if(isInserted == true){
                            Toast.makeText(ContinueFinal.this,"Congratulations!", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(ContinueFinal.this, MainActivity.class);
                            startActivity(intent);


                        }

                        else
                            Toast.makeText(ContinueFinal.this,"Please Enter Information", Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
     */

}
