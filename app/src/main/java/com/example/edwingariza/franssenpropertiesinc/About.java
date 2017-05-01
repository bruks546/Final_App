package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

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
    public void HomeBtn(){
        Intent in = new Intent(this, MainActivity.class);
        startActivity(in);
    }


}
