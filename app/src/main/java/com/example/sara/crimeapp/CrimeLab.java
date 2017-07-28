package com.example.sara.crimeapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by sara on 20-Jul-17.
 */

public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private Context mAppContext;
    private ArrayList<Crime> mCrimes;


    // private constructor and get() = singleton
    private CrimeLab(Context appContext) {
        mAppContext = appContext;
        mCrimes = new ArrayList<Crime>();

    }
    public void addCrime(Crime c) {
        mCrimes.add(c);
    }
    public static CrimeLab get(Context c) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }
    public ArrayList<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime c : mCrimes) {
            if (c.getId().equals(id))
                return c;
        }
        return null;
    }


}
