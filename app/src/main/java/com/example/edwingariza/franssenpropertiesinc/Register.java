package com.example.edwingariza.franssenpropertiesinc;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;


public class Register extends AppCompatActivity {
    DatabaseHelper helper = new DatabaseHelper(this);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void UnitName(){

        EditText nn = (EditText)findViewById(R.id.enter_username);
        String str = nn.getText().toString();

        EditText uu = (EditText)findViewById(R.id.unit_num_register);
        String uustr = uu.getText().toString();

        Intent in = new Intent(Register.this, Tenant.class);
        in.putExtra("Username", str);
        in.putExtra("Unit", uustr);
        startActivity(in);

    }
    public void onSignUpClick(View v)
    {
        if(v.getId() == R.id.register_btn){
            EditText NAME = (EditText) findViewById(R.id.register_name);
            EditText UNIT = (EditText) findViewById(R.id.unit_num_register);
            EditText USER_NAME = (EditText) findViewById(R.id.enter_username);
            EditText USER_PASS= (EditText) findViewById(R.id.enter_pass);
            EditText CONF_PASS = (EditText) findViewById(R.id.confirm_pass);

            String name = NAME.getText().toString();
            String unit = UNIT.getText().toString();
            String username = USER_NAME.getText().toString();
            String user_pass = USER_PASS.getText().toString();
            String conf_pass = CONF_PASS.getText().toString();



            if(!user_pass.equals(conf_pass))
            {
                Toast.makeText(Register.this, "Passwords don't match!", Toast.LENGTH_LONG).show();;
            }
            else{
                Contact c = new Contact();
                c.setName(name);
                c.setUnit(unit);
                c.setUserename(username);
                c.setPass(user_pass);


                helper.insertContact(c);

                UnitName();
            }


        }


    }



    }

