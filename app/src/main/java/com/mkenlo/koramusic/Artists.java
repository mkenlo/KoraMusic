package com.mkenlo.koramusic;

import java.util.ArrayList;

/**
 * Created by Melanie on 8/1/2017.
 */

public class Artists {

    String name;
    String profile_pic;
    ArrayList<Albums> albums;

    public Artists() {
        this.name = "Pharell Williams";
        this.profile_pic = "";
        Albums one_album = new Albums();
        this.albums = new ArrayList<Albums>();
        this.albums.add(one_album);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public ArrayList<Albums> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Albums> albums) {
        this.albums = albums;
    }
}
