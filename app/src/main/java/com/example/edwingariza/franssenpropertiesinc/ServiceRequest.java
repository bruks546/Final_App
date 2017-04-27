package com.example.edwingariza.franssenpropertiesinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ServiceRequest extends AppCompatActivity {
    DatabaseHelper helper = new DatabaseHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_request);
    }


    public void IssueUnit(){

        EditText nn = (EditText)findViewById(R.id.issue_text);
        String str = nn.getText().toString();

        EditText rqname = (EditText)findViewById(R.id.request_name_text);
        String namestr = rqname.getText().toString();

        EditText uu = (EditText)findViewById(R.id.request_unit);
        String uustr = uu.getText().toString();

        Intent in = new Intent(ServiceRequest.this, Tenant.class);
        in.putExtra("Name", namestr);
        in.putExtra("Issue", str);
        in.putExtra("Unit", uustr);

        startActivity(in);
        Toast.makeText(ServiceRequest.this, "Thanks "+namestr+" we will attent your " + str + "issue ASAP", Toast.LENGTH_LONG).show();

    }
    public void onCreateRequest(View v)
    {


            EditText CATEGORY = (EditText) findViewById(R.id.category_text);
            EditText ISSUE = (EditText) findViewById(R.id.issue_text);
            EditText REQ_NAME = (EditText) findViewById(R.id.request_name_text);
            EditText REQ_PHONE= (EditText) findViewById(R.id.request_phone_text);
            EditText REQ_UNIT = (EditText) findViewById(R.id.request_unit);

            String category = CATEGORY.getText().toString();
            String issue = ISSUE.getText().toString();
            String req_name = REQ_NAME.getText().toString();
            String req_phone = REQ_PHONE.getText().toString();
            String req_unit = REQ_UNIT.getText().toString();

            Request r = new Request();
            r.setCategory(category);
            r.setIssue(issue);
            r.setReq_name(req_name);
            r.setReq_phone(req_phone);
            r.setReq_unit(req_unit);


            helper.insertRequest(r);

            IssueUnit();





    }

}
