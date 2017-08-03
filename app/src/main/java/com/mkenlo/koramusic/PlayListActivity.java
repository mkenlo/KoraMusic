package com.mkenlo.koramusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PlayListActivity extends AppCompatActivity {

    String[] playlist = {"My Love Songs", "My Workout Songs", "My Happy Moments Songs"};
    ListView playListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);
        playListView = (ListView) findViewById(R.id.playlist);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, playlist);
        playListView.setAdapter(arrayAdapter);

    }
}
