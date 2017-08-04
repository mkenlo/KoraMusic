package com.mkenlo.koramusic;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Melanie on 8/1/2017.
 */

public class ArtistsAdapter extends BaseAdapter {

    Context context;
    List<Artists> list_artists;

    public ArtistsAdapter(Context context, List<Artists> list_artists) {
        this.context = context;
        this.list_artists = list_artists;
    }

    @Override
    public int getCount() {
        return list_artists.size();
    }

    @Override
    public Object getItem(int position) {
        return list_artists.get(position);
    }

    @Override
    public long getItemId(int position) { return position;   }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.artist_list_item, null);
            holder = new ViewHolder();

            holder.artist_name = (TextView) convertView.findViewById(R.id.artist_name);
            holder.artist_num_songs = (TextView) convertView.findViewById(R.id.artist_num_songs);

            Artists artist = list_artists.get(position);

            holder.artist_name.setText(artist.name);
            holder.artist_num_songs.setText(String.valueOf(artist.albums.size()) + " Album");
        }

        return convertView;
    }

    private class ViewHolder {
        TextView artist_name;
        TextView artist_num_songs;

    }
}
