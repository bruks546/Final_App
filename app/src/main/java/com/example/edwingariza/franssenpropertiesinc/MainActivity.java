package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
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

    /**This is the Explore action when user click on Explore */
    public void exploreButton(View view){
        Intent intent = new Intent(this, Explore.class);

        startActivity(intent);
    }
    public void loginBtn(View view){
        Intent intent = new Intent(this, LogIn.class);

        startActivity(intent);
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
