package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvListMovie;
    private ArrayList<MovieModel> list = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListMovie = findViewById(R.id.rv_movie_list);
        rvListMovie.setHasFixedSize(true);

        list.addAll(MovieData.getListDataMovie());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvListMovie.setLayoutManager(new LinearLayoutManager(this));
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(list);
        rvListMovie.setAdapter(listMovieAdapter);

    }


}
