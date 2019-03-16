package com.example.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class WaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);


    }

    public void onWaterCancelClick(View view) {
        finish();
    }

    public void onWaterSaveClick(View view) {
        EditText minutes = (EditText)findViewById(R.id.showerMinutes);
        //minutes to be stored in database

        finish();
    }
}
