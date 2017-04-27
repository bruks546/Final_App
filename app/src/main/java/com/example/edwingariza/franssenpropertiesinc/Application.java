package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Application extends AppCompatActivity {

    DbHandler helper = new DbHandler(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.application_a);


    }


   public void ContinueAppBtn(View v)
    {





            EditText name = (EditText) findViewById(R.id.name_Text);
            EditText add = (EditText) findViewById(R.id.address_Text);
            EditText city = (EditText) findViewById(R.id.city_Text);
            EditText state= (EditText) findViewById(R.id.state_Text);
            EditText zip = (EditText) findViewById(R.id.zip_Text);
            EditText telephone = (EditText) findViewById(R.id.phone_Text);
            EditText rel_name = (EditText) findViewById(R.id.rel_name_1);
            EditText relation_1 = (EditText) findViewById(R.id.relation_Text);
            EditText address_rel_1 = (EditText) findViewById(R.id.address_rel_1);
            EditText phone_rel_1= (EditText) findViewById(R.id.phone_rel_1);
            EditText rel_name_2 = (EditText) findViewById(R.id.name_rel_2);
            EditText rellation_2 = (EditText) findViewById(R.id.relation_relation_2);
            EditText add_rel_2 = (EditText) findViewById(R.id.address_rel_2);
            EditText phone_rel_2 = (EditText) findViewById(R.id.phone_rel_2);
            EditText previews_name= (EditText) findViewById(R.id.property_name_text);
            EditText previews_phone = (EditText) findViewById(R.id.property_phone_text);

            String namestr = name.getText().toString();
            String addstr = add.getText().toString();
            String citystr = city.getText().toString();
            String statestr = state.getText().toString();
            String zipstr = zip.getText().toString();
            String phonestr = telephone.getText().toString();
            String rel_nastt = rel_name.getText().toString();
            String rel_rel_1 = relation_1.getText().toString();
            String add_relstr = address_rel_1.getText().toString();
            String phone_relstr = phone_rel_1.getText().toString();
            String rel_namestr = rel_name_2.getText().toString();
            String rell2str = rellation_2.getText().toString();
            String add_relstr2 = add_rel_2.getText().toString();
            String phone_rel2 = phone_rel_2.getText().toString();
            String previewsnamestr = previews_name.getText().toString();
            String previews_phonestr = previews_phone.getText().toString();

            ApplicationGetSet r = new ApplicationGetSet();

            r.setName(namestr);
            r.setAddress(addstr);
            r.setCity(citystr);
            r.setState(statestr);
            r.setZip(zipstr);
            r.setPhone(phonestr);
            r.setRel_name_1(rel_nastt);
            r.setRelationship_1(rel_rel_1);
            r.setAddress_rel_1(add_relstr);
            r.setRelative_phone_1(phone_relstr);
            r.setRel_name_2(rel_namestr);
            r.setRelationship_2(rell2str);
            r.setAddress_rel_2(add_relstr2);
            r.setRelative_phone_2(phone_rel2);
            r.setPreviews_name(previewsnamestr);
            r.setPreviews_number(previews_phonestr);






            helper.insertApplicant(r);
        Intent in = new Intent(Application.this, ContinueApply.class);
        Intent n = new Intent(Application.this, ContinueFinal.class);
        n.putExtra("Name", namestr);
        startActivity(in);



    }




}
