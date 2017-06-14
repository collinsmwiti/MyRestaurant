package com.example.collins.myrestaurant.util;

import com.example.collins.myrestaurant.models.Restaurant;

import java.util.ArrayList;

/**
 * Created by collins on 6/14/17.
 */

public interface OnRestaurantSelectedListener {
    public void onRestaurantSelected(Integer position, ArrayList<Restaurant>restaurants);
}
