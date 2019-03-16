package com.example.mainactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onWaterButtonClick(View v){
        Intent i = new Intent(this, WaterActivity.class);
        startActivity(i);
    }

    public void onFoodButtonClick(View v) {
        Intent i = new Intent(this, FoodActivity.class);
        startActivity(i);
    }

    public void onFuelButtonClick(View v) {
        Intent i = new Intent(this, FossilFuelActivity.class);
        startActivity(i);
    }
}
