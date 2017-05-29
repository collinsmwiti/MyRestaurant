package com.example.collins.myrestaurant;

import android.support.test.rule.ActivityTestRule;

import com.example.collins.myrestaurant.ui.MainActivity;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by collins on 5/22/17.
 */

public class MainActivityInstrumentalTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.locationEditText)).perform(typeText("Portland"))
                .check(matches(withText("Portland")));
    }

//    @Test
//    public void locationIsSentToRestaurantsActivity() {
//        String location = "Portland";
//        onView(withId(R.id.locationEditText)).perform(typeText(location));
//        onView(withId(R.id.findRestaurantsButton)).perform(click());
//        onView(withId(R.id.locationTextView)).check(matches
//                (withText("Here are all the restaurants near: " + location)));
//    }
}
