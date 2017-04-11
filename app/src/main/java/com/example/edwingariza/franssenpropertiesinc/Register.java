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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        final EditText NAME = (EditText) findViewById(R.id.register_name);
        final EditText UNIT = (EditText) findViewById(R.id.unit_num_register);
        final EditText USER_NAME = (EditText) findViewById(R.id.enter_username);
        final EditText USER_PASS= (EditText) findViewById(R.id.enter_pass);
        final EditText CONF_PASS = (EditText) findViewById(R.id.confirm_pass);
        final Button CREATE_BTN = (Button) findViewById(R.id.register_btn);

        CREATE_BTN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final String name = NAME.getText().toString();
                final String unit = UNIT.getText().toString();
                final String username = USER_NAME.getText().toString();
                final String user_pass = USER_PASS.getText().toString();
                final String conf_pass = CONF_PASS.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>(){
                    @Override
                    public void onResponse(String response){
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if(success){
                                Intent intent = new Intent(Register.this, LogIn.class);
                                Register.this.startActivity(intent);
                            }
                            else{
                                AlertDialog.Builder  builder = new AlertDialog.Builder(Register.this);
                                builder.setMessage("Register failed")
                                    .setNegativeButton("Retry", null)
                                    .create()
                                    .show();
                            }


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };
                RegisterRequest registerRequest = new RegisterRequest(name, unit, username, user_pass, responseListener);
                RequestQueue queue = Volley.newRequestQueue(Register.this);
                queue.add(registerRequest);

            }
        });




    }
}
