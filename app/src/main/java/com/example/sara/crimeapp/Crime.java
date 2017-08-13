package com.example.sara.crimeapp;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;
import java.util.UUID;

/**
 * Created by sara on 19-Jul-17.
 */

public class Crime {

    private static final String JSON_ID = "id";
    private static final String JSON_TITLE = "title";
    private static final String JSON_SOLVED = "solved";
    private static final String JSON_DATE = "date";

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

    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(JSON_ID, Id.toString());
        json.put(JSON_TITLE, Title);
        json.put(JSON_SOLVED, mSolved);
        json.put(JSON_DATE, mDate.getTime());
        return json;
    }
    public Crime(JSONObject json) throws JSONException {
        Id = UUID.fromString(json.getString(JSON_ID));
        Title = json.getString(JSON_TITLE);
        mSolved = json.getBoolean(JSON_SOLVED);
        mDate = new Date(json.getLong(JSON_DATE));
    }


}
