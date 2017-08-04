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
    CardView playlistCardview;
    CardView genreCardview;
    CardView payCardview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        albumsCardview = (CardView) findViewById(R.id.albums_cardview);
        artistsCardview = (CardView) findViewById(R.id.artists_cardview);
        playlistCardview = (CardView) findViewById(R.id.playlist_cardview);
        genreCardview = (CardView) findViewById(R.id.genre_cardview);
        payCardview = (CardView) findViewById(R.id.payment_cardview);

        albumsCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), AlbumsActivity.class));
            }
        });

        artistsCardview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), ArtistsActivity.class));
            }
        });

        playlistCardview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), PlayListActivity.class));
            }
        });

        genreCardview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), GenreActivity.class));
            }
        });

         payCardview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), PaymentActivity.class));
            }
        });


    }


}
