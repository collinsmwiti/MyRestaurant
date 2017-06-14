package com.example.collins.myrestaurant.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.collins.myrestaurant.R;

//refactored the class
public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
    }

}