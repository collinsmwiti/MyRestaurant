package com.example.collins.myrestaurant.util;

/**
 * Created by collins on 6/10/17.
 */

public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
