package com.mkenlo.koramusic;

/**
 * Created by Melanie on 8/1/2017.
 */

public class Songs {

    String title;
    int duration;

    public Songs() {
        this.title = "Happy";
        this.duration = 3;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
