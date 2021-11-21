package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        TextView tv_PropertyName = findViewById(R.id.tv_PropertyName_Test);
        TextView tv_PropertyAddress = findViewById(R.id.tv_PropertyAddress_Test);
        TextView tv_PropertyType = findViewById(R.id.tv_PropertyType_Test);
        TextView tv_PropertyFurniture = findViewById(R.id.tv_PropertyFurniture_Test);
        TextView tv_PropertyBedroom = findViewById(R.id.tv_PropertyBedroom_Test);
        TextView tv_PropertyPrice = findViewById(R.id.tv_PropertyPrice_Test);
        TextView tv_PropertyReporter = findViewById(R.id.tv_PropertyReporter_Test);
        TextView tv_PropertyNote = findViewById(R.id.tv_PropertyNote_Test);
        TextView tv_PropertyDate = findViewById(R.id.tv_PropertyDate_Test);

        String propertyname = "";
        String propertyaddress = "";
        String propertytype = "";
        String propertyfurniture = "";
        String propertybedroom = "";
        String propertyprice ="";
        String propertyreporter = "";
        String propertynote = "";
        String propertydate = "";


        Intent intent = getIntent();

        // 1st method to receive data.
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            propertyname = bundle.getString("propertyname");
            propertyaddress = bundle.getString("propertyaddress");
            propertytype = bundle.getString("propertytype");
            propertyfurniture = bundle.getString("propertyfurniture");
            propertybedroom = bundle.getString("propertybedroom");
            propertyprice = bundle.getString("propertyprice");
            propertyreporter = bundle.getString("propertyreporter");
            propertynote = bundle.getString("propertynote");
            propertydate = bundle.getString("propertydate");

        }

        // 2nd method to receive data.
        //username = intent.getStringExtra("username");
        //password = intent.getStringExtra("password");
        /*propertyname = intent.getStringExtra("propertyname");
        propertyaddress = intent.getStringExtra("propertyaddress");
        propertycity = intent.getStringExtra("propertycity");
        propertydistrict = intent.getStringExtra("propertydistrict");
        propertyward = intent.getStringExtra("propertyward");
        propertytype = intent.getStringExtra("propertytype");
        propertyfurniture = intent.getStringExtra("propertyfurniture");
        propertybedroom = intent.getStringExtra("propertybedroom");
        propertyprice = intent.getStringExtra("propertyprice");
        propertyreporter = intent.getStringExtra("propertyreporter");
        propertynote = intent.getStringExtra("propertynote");
        propertydate = intent.getStringExtra("propertydate");*/

        //tvUsername.setText(username);
        //tvPassword.setText(password);
        tv_PropertyName.setText(propertyname);
        tv_PropertyAddress.setText(propertyaddress);
        tv_PropertyType.setText(propertytype);
        tv_PropertyFurniture.setText(propertyfurniture);
        tv_PropertyBedroom.setText(propertybedroom);
        tv_PropertyPrice.setText(propertyprice);
        tv_PropertyReporter.setText(propertyreporter);
        tv_PropertyNote.setText(propertynote);
        tv_PropertyDate.setText(propertydate);

    }
}