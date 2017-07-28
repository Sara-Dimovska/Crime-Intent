package com.example.sara.crimeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by sara on 21-Jul-17.
 */

public abstract class SingleFragmentActivity extends FragmentActivity {

    //prototype
    protected abstract Fragment createFragment();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime_list);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentListContainer);
        if (fragment == null) {
            fragment =  createFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentListContainer, fragment)
                    .commit();
        }
    }


}
