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
import android.widget.Button;

public class ContactUs extends AppCompatActivity {

    private static final int REQUEST_CALL =1;

    Button callPv, callCp, callHead;
    Intent callIntPv, callIntCp, callIntHead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        callPv = (Button) findViewById(R.id.call_pv);

        callPv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                callIntPv = new Intent (Intent.ACTION_CALL, Uri.parse("tel: 3082366617"));
                if (ContextCompat.checkSelfPermission(ContactUs.this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(ContactUs.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
                }else {
                    startActivity(callIntPv);
                }
            }
        });

        callCp = (Button) findViewById(R.id.call_cp);

        callCp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                callIntCp = new Intent (Intent.ACTION_CALL, Uri.parse("tel: 3082344916"));
                if (ContextCompat.checkSelfPermission(ContactUs.this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(ContactUs.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
                }else {
                    startActivity(callIntCp);
                }
            }

        });
        callHead = (Button) findViewById(R.id.call_head);

        callHead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                callIntHead = new Intent (Intent.ACTION_CALL, Uri.parse("tel: 4023914500"));
                if (ContextCompat.checkSelfPermission(ContactUs.this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(ContactUs.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
                }else {
                    startActivity(callIntHead);
                }
            }

        });



    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults){

        switch (requestCode){
            case REQUEST_CALL:
            {
                if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    startActivity(callIntPv);
                    startActivity(callIntCp);
                    startActivity(callIntHead);
                }
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
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




    public void showPopup(View v){
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.actions, popup.getMenu());
        popup.show();
    }
}