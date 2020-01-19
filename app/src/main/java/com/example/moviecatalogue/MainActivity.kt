package com.example.moviecatalogue

import android.content.Intent
import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MovieAdapter
    private lateinit var dataTitle: Array<String>
    private lateinit var dataGenre: Array<String>
    private lateinit var dataScore: Array<String>
    private lateinit var dataReleaseDate: Array<String>
    private lateinit var dataRuntime: Array<String>
    private lateinit var dataOverview: Array<String>
    private lateinit var dataDirector: Array<String>
    private lateinit var dataActors: Array<String>
    private lateinit var dataPoster: TypedArray
    private var movies = arrayListOf<Movie>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.lv_list_movie)
        adapter = MovieAdapter(this)
        listView.adapter = adapter

        prepare()
        addItem()

        listView.onItemClickListener = AdapterView.OnItemClickListener{_,_,position,_ ->
//            Toast.makeText(this@MainActivity,movies[position].movieTitle,Toast.LENGTH_SHORT).show()
            val moveToDetail = Intent(this@MainActivity,DetailMovie::class.java)
            moveToDetail.putExtra(moveToDetail.EXTRA)

        }
    }

    private fun prepare(){
        dataTitle = resources.getStringArray(R.array.data_title)
        dataGenre = resources.getStringArray(R.array.data_genres)
        dataScore = resources.getStringArray(R.array.data_score)
        dataReleaseDate = resources.getStringArray(R.array.data_release)
        dataRuntime = resources.getStringArray(R.array.data_runtime)
        dataOverview = resources.getStringArray(R.array.data_overview)
        dataDirector = resources.getStringArray(R.array.data_director)
        dataActors = resources.getStringArray(R.array.data_actors)
        dataPoster = resources.obtainTypedArray(R.array.data_poster)

    }

    private fun addItem(){
        for(position in dataTitle.indices){
            val movie = Movie(
                dataTitle[position],
                dataReleaseDate[position],
                dataScore[position],
                dataOverview[position],
                dataDirector[position],
                dataActors[position],
                dataRuntime[position],
                dataGenre[position],
                dataPoster.getResourceId(position,-1)
            )
            movies.add(movie)
        }
        adapter.movies = movies
    }
}
