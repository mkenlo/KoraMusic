package com.mkenlo.koramusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import static com.mkenlo.koramusic.R.drawable.artist;

public class MainActivity extends AppCompatActivity {

    CardView albumsCardview;
    CardView artistsCardview;
    CardView songsCardview;
    CardView playlistCardview;
    CardView genreCardview;
    CardView favCardview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent artistActivity = new Intent(this, ArtistsActivity.class);
        final Intent songActivity = new Intent(this, SongsActivity.class);
        final Intent playlistActivity = new Intent(this, PlayListActivity.class);
        final Intent albumActivity = new Intent(this, AlbumsActivity.class);
        final Intent genreActivity = new Intent(this, GenreActivity.class);

        albumsCardview = (CardView) findViewById(R.id.albums_cardview);
        artistsCardview = (CardView) findViewById(R.id.artists_cardview);
      //  songsCardview = (CardView) findViewById(R.id.songs_cardview);
        playlistCardview = (CardView) findViewById(R.id.playlist_cardview);
        genreCardview = (CardView) findViewById(R.id.genre_cardview);
        favCardview = (CardView) findViewById(R.id.favorite_cardview);

        albumsCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(albumActivity);
            }
        });

        artistsCardview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(artistActivity);
            }
        });

       /* songsCardview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(songActivity);
            }
        });*/

        playlistCardview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(playlistActivity);
            }
        });

        genreCardview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(genreActivity);
            }
        });




    }


}
