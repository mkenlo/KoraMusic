package com.mkenlo.koramusic;

import java.util.ArrayList;

/**
 * Created by Melanie on 8/1/2017.
 */

public class Albums {

    String title;
    String cover_album;
    ArrayList<Songs> songs;

    public Albums() {
        this.title = "Album title";
        this.cover_album = "";
        this.songs = new ArrayList<Songs>();
        for(int i=0;i<10;i++){
            this.songs.add(new Songs());
        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover_album() {
        return cover_album;
    }

    public void setCover_album(String cover_album) {
        this.cover_album = cover_album;
    }

    public ArrayList<Songs> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Songs> songs) {
        this.songs = songs;
    }
}
