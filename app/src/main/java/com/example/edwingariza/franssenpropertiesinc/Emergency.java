package com.example.edwingariza.franssenpropertiesinc;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
public class Emergency extends AppCompatActivity {

    private static final int REQUEST_CALL =1;

    Button callWork, callPol;
    Intent callIntent, callIntePol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        callWork = (Button) findViewById(R.id.workcall);

        callWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                callIntent = new Intent (Intent.ACTION_CALL, Uri.parse("tel: 3082936000"));
                if (ContextCompat.checkSelfPermission(Emergency.this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(Emergency.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
                }else {
                    startActivity(callIntent);
                }
            }
        });

        callPol = (Button) findViewById(R.id.polcall);

        callPol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                callIntePol = new Intent (Intent.ACTION_CALL, Uri.parse("tel: 911"));
                if (ContextCompat.checkSelfPermission(Emergency.this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(Emergency.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
                }else {
                    startActivity(callIntePol);
                }
            }

        });



    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults){
        //super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case REQUEST_CALL:
            {
                if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    startActivity(callIntent);
                    startActivity(callIntePol);
                }
            }
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.my_account) {

            TenantOpt();
            return true;
        }

        else if (id == R.id.rent_calculator) {

            RentCal();



            return true;
        }
        else if (id == R.id.apply) {


            ApplyInt();


            return true;
        }

        else if (id == R.id.contact_us) {

            ContactUs();

            return true;
        }
        else if (id == R.id.about) {

            AboutInt();

            return true;
        }
        else if (id == R.id.feedback) {

            FeedB();

            return true;
        }
        else if (id == R.id.home) {

            HomeBtn();

            return true;
        }


        return super.onOptionsItemSelected(item);
    }
    public void HomeBtn(){
        Intent in = new Intent(this, MainActivity.class);
        startActivity(in);
    }

    public void FeedB(){
        Intent intent = new Intent(this, Feedback.class);

        startActivity(intent);
    }
    public void TenantOpt(){
        Intent intent = new Intent(this, Tenant.class);

        startActivity(intent);
    }
    public void AboutInt(){
        Intent intent = new Intent(this, About.class);

        startActivity(intent);
    }




    public void ApplyInt(){
        Intent intent = new Intent(this, Application.class);

        startActivity(intent);
    }

    public void ContactUs(){
        Intent intent = new Intent(this, ContactUs.class);

        startActivity(intent);
    }

    public void RentCal(){
        Intent intent = new Intent(this, RentCalculator.class);

        startActivity(intent);
    }






}
