package com.mkenlo.koramusic;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import static com.mkenlo.koramusic.R.drawable.artist;

/**
 * Created by Melanie on 8/1/2017.
 */

public class SongsAdapter extends BaseAdapter {


    Context context;
    List<Songs> list_songs;

    public SongsAdapter(Context context, List<Songs> list_songs) {
        this.context = context;
        this.list_songs = list_songs;
    }

    @Override
    public int getCount() {
        return list_songs.size();
    }

    @Override
    public Object getItem(int position) {
        return list_songs.get(position);
    }

    @Override
    public long getItemId(int position) {  return position;  }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.songs_list_item, null);
            holder = new ViewHolder();

            holder.song_title = (TextView) convertView.findViewById(R.id.song_title);
            holder.duration = (TextView) convertView.findViewById(R.id.song_duration);

            Songs single = list_songs.get(position);

            holder.song_title.setText(single.getTitle());
            // holder.duration.setText(String.valueOf(single.getDuration()));
        }

        return convertView;
    }

    private class ViewHolder {
        TextView song_title;
        TextView duration;

    }
}
