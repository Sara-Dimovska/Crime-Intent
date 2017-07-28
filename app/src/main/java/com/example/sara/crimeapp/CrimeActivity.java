package com.example.sara.crimeapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.UUID;

public class CrimeActivity extends FragmentActivity {

    /*

        @Override
        protected Fragment createFragment() {

            UUID crimeId = (UUID)getIntent().getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);




            return CrimeFragment.newInstance(crimeId);
        }


    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        //passing ID is fine...
        UUID crimeId  = (UUID) getIntent().getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);


        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        CrimeFragment fragment = CrimeFragment.newInstance(crimeId);

        ft.replace(R.id.fragmentContainer,fragment);
        ft.commit();

        /*
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
        if (fragment == null) {
            fragment = CrimeFragment.newInstance(crimeId);
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }

        /*
        CrimeFragment fragment = new CrimeFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentContainer,fragment);
        ft.commit();
        */
    }


}
