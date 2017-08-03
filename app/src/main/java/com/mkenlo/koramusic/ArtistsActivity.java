package com.mkenlo.koramusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ArtistsActivity extends AppCompatActivity {

    List<Artists> artistsList;
    ListView artistListview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        artistsList = new ArrayList<>();
        artistsList.add(new Artists());

        artistListview =(ListView) findViewById(R.id.artists_list) ;
        ArtistsAdapter adapter = new ArtistsAdapter(this,artistsList);
        artistListview.setAdapter(adapter);

        artistListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent songs = new Intent(view.getContext(), SongsActivity.class);
                startActivity(songs);
            }
        });


    }


}
