package com.mkenlo.koramusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import static android.R.attr.start;

public class AlbumsActivity extends AppCompatActivity {

    CardView albumCardview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        albumCardview = (CardView) findViewById(R.id.albums_cardview);
        final Intent songs = new Intent(this, SongsActivity.class);
        albumCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(songs);
            }
        });
    }
}
