package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailMovie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        Intent intent = getIntent();
        String kode = intent.getStringExtra("kode");
        final MovieModel movie = intent.getParcelableExtra("movie");

        ImageView viewDetailPoster = (ImageView)findViewById(R.id.img_poster);
        TextView detailTitle = (TextView)findViewById(R.id.tv_title_movie);
        TextView detailActors = (TextView)findViewById(R.id.tv_actors_movie);
        TextView detailDirector = (TextView)findViewById(R.id.tv_director_movie);
        TextView detailGenre = (TextView)findViewById(R.id.tv_genre_movie);
        TextView detailDuration = (TextView)findViewById(R.id.tv_duration);
        TextView detailSynopsis = (TextView)findViewById(R.id.tv_detail);
        Button bookNow = (Button)findViewById(R.id.btn_book_now);

        Glide.with(this)
                .load(movie.getPoster())
                .apply(new RequestOptions())
                .into(viewDetailPoster);
        detailTitle.setText(movie.getTitle());
        detailActors.setText(movie.getActors());
        detailDirector.setText(movie.getDirector());
        detailGenre.setText(movie.getGenre());
        detailDuration.setText(movie.getDuration());
        detailSynopsis.setText(movie.getDetail());

        bookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Memilih jadwal film" + movie.getTitle(),Toast.LENGTH_LONG).show();
            }
        });

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(movie.getTitle());
        }
    }
}
