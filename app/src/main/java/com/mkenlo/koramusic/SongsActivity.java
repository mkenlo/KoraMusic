package com.mkenlo.koramusic;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SongsActivity extends AppCompatActivity {

    ListView songListview;
    List<Songs> songsList;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        songsList = new ArrayList<>();
        for(int i=0;i<10;i++){
            songsList.add(new Songs());
        }

        songListview =(ListView) findViewById(R.id.songs_list) ;
        SongsAdapter adapter = new SongsAdapter(this,songsList);
        songListview.setAdapter(adapter);


        songListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent playing = new Intent(view.getContext(), PlayingActivity.class);
               startActivity(playing);

            }
        });
    }



}
