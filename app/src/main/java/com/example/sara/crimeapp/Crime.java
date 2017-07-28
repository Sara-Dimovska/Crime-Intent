package com.example.sara.crimeapp;

import java.util.Date;
import java.util.UUID;

/**
 * Created by sara on 19-Jul-17.
 */

public class Crime {

    private UUID Id;
    private String Title;
    private Date mDate;
    private boolean mSolved;


    public Crime() {
        Id = UUID.randomUUID();
        mDate = new Date();
    }
    @Override
    public String toString() {
        return Title;
    }

    public UUID getId() {
        return Id;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public Date getDate() {
        return mDate;
    }
    public void setDate(Date date) {
        mDate = date;
    }
    public boolean isSolved() {
        return mSolved;
    }
    public void setSolved(boolean solved) {
        mSolved = solved;
    }

}
