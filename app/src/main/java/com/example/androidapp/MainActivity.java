package com.example.androidapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String notification_01 = getResources().getString(R.string.notification_01);
        String btnSubmitName = getResources().getString(R.string.btn_submit);

        Toast.makeText(this, "Please fill in the form", Toast.LENGTH_LONG).show();

        Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setText(btnSubmitName);
        btnSubmit.setOnClickListener(btnSubmit_Click);
    }
    private View.OnClickListener btnSubmit_Click = new View.OnClickListener() {
        public void onClick(View v) {
            Boolean isValid = true;

            TextView tvError = findViewById(R.id.tvError);
            TextView tv_PropertyName = findViewById(R.id.tv_PropertyName);
            TextView tv_PropertyAddress = findViewById(R.id.tv_PropertyAddress);
            TextView tv_PropertyType = findViewById(R.id.tv_PropertyType);
            TextView tv_PropertyFurniture = findViewById(R.id.tv_PropertyFurniture);
            TextView tv_PropertyBedroom = findViewById(R.id.tv_PropertyBedroom);
            TextView tv_PropertyPrice = findViewById(R.id.tv_PropertyPrice);
            TextView tv_PropertyReporter = findViewById(R.id.tv_PropertyReporter);
            TextView tv_PropertyNote = findViewById(R.id.tv_PropertyNote);
            TextView tv_PropertyDate = findViewById(R.id.tv_PropertyDate);

            String error = "";
            // Get content of textview "Username".
            String propertyname = tv_PropertyName.getText().toString();
            String propertyaddress = tv_PropertyAddress.getText().toString();
            String propertytype = tv_PropertyType.getText().toString();
            String propertyfurniture = tv_PropertyFurniture.getText().toString();
            String propertybedroom = tv_PropertyBedroom.getText().toString();
            String propertyprice = tv_PropertyPrice.getText().toString();
            String propertyreporter = tv_PropertyReporter.getText().toString();
            String propertynote = tv_PropertyNote.getText().toString();
            String propertydate = tv_PropertyDate.getText().toString();
            // Get content of textview "Password".
            String notification_02 = getResources().getString(R.string.notification_02);
            // Like "alert" in JavaScript.
            Toast.makeText(v.getContext(), notification_02, Toast.LENGTH_LONG).show();

            // Check whether username is empty or not.
            if (TextUtils.isEmpty(propertyname)) {
                isValid = false;
                error += "* Property name cannot be blank.\n";
            }

            // Check whether password is empty or not.
            if (TextUtils.isEmpty(propertyaddress)) {
                isValid = false;
                error += "* Address cannot be blank.\n";
            }

            if (TextUtils.isEmpty(propertytype)) {
                isValid = false;
                error += "* Type cannot be blank.\n";
            }

            if (TextUtils.isEmpty(propertyprice)) {
                isValid = false;
                error += "* Price cannot be blank.\n";
            }

            if (TextUtils.isEmpty(propertybedroom)) {
                isValid = false;
                error += "* Bedroom cannot be blank.\n";
            }

            if (TextUtils.isEmpty(propertyreporter)) {
                isValid = false;
                error += "* Reporter cannot be blank.\n";
            }

            // Check whether form is valid or not.
            if (isValid) {
                // Show alerts.
                Toast.makeText(v.getContext(), propertyname, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), propertyaddress, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), propertytype, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), propertyfurniture, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), propertybedroom, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), propertyprice, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), propertyreporter, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), propertynote, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), propertydate, Toast.LENGTH_LONG).show();



                // Show logs.
                Log.w("Main Activity", "This is a Warning Log.");
                Log.i("Main Activity", "This is an Information Log.");
                Log.d("Main Activity", "This is a Debug Log.");
                Log.v("Main Activity", "This is a Verbose Log.");

                Bundle propertyInfo = new Bundle();
                propertyInfo.putString("propertyname", propertyname);
                propertyInfo.putString("propertyaddress", propertyaddress);
                propertyInfo.putString("propertytype", propertytype);
                propertyInfo.putString("propertyfurniture", propertyfurniture);
                propertyInfo.putString("propertybedroom", propertybedroom);
                propertyInfo.putString("propertyprice", propertyprice);
                propertyInfo.putString("propertyreporter", propertyreporter);
                propertyInfo.putString("propertynote", propertynote);
                propertyInfo.putString("propertydate", propertydate);


                // Create a new activity and start it.
                Intent testActivity = new Intent(v.getContext(), TestActivity.class);

                // 1st method to transfer data.
                testActivity.putExtras(propertyInfo);

                // 2nd method to transfer data.
                //testActivity.putExtra("username", username);
                //testActivity.putExtra("password", password);

                // Start "TestActivity".
                startActivity(testActivity);

                // Terminate current activity.
                finish();
            } else {
                // Display errors in textview.
                tvError.setText(error);

                // Display errors in logs.
                Log.e("Main Activity", error);
            }
        }
    };
}