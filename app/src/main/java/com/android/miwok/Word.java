package com.android.miwok;

import android.content.Context;

public class Word {

    // String value
    private String defaultTransalation;

    // Text color of the text
    private String mewokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    // Context of the app
    private Context mContext;



    public Word(String english, String mewok) {
        defaultTransalation=english;
        mewokTranslation=mewok;
    }


    public Word(String english, String mewok, Integer imageResourceId) {
        defaultTransalation=english;
        mewokTranslation=mewok;
        mImageResourceId = imageResourceId;
    }

    public String getMewokTranslation() {
        return mewokTranslation;
    }

    public String getDefaultTransalation() {
        return defaultTransalation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){

        return mImageResourceId !=NO_IMAGE_PROVIDED;


    }
}
