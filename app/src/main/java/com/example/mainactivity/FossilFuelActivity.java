package com.example.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FossilFuelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fossil_fuel);
    }

    public void onCancelButtonClick(View v) {
        finish();
    }

    public void onSaveButtonClick(View v) {
        //store info in database
        finish();
    }
}
