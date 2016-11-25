package com.example.zaaru.criminalintent;

import java.util.UUID;

/**
 * Created by User on 2016-11-25.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public UUID getmId() {
        return mId;
    }


    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Crime(){
        // Генерация уникального идентификатора
        mId = UUID.randomUUID();
    }
}
