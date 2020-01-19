package com.example.moviecatalogue

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MovieAdapter internal constructor(private val context: Context):BaseAdapter(){
    internal var movies = arrayListOf<Movie>()
    override fun getView(position: Int, view: View?, viewGroup: ViewGroup): View {
        var itemView = view
        if (itemView == null){
            itemView = LayoutInflater.from(context).inflate(R.layout.item_movie,viewGroup,false)
        }

        val viewHolder = ViewHolder(itemView as View)
        val movie = getItem(position) as Movie
        viewHolder.bind(movie)
        return itemView
    }

    override fun getItem(i: Int): Any = movies[i]

    override fun getItemId(i: Int): Long = i.toLong()

    override fun getCount(): Int = movies.size

    private inner class ViewHolder internal constructor(view: View){
        private val txtTitle: TextView = view.findViewById(R.id.txt_item_title)
        private val txtReleaseDate: TextView = view.findViewById(R.id.txt_item_release_date)
        private val txtScore: TextView = view.findViewById(R.id.txt_item_user_score)
        private val txtGenre: TextView = view.findViewById(R.id.txt_item_genre)
        private val txtRuntime: TextView = view.findViewById(R.id.txt_item_runtime)
        private val imgPoster: ImageView = view.findViewById(R.id.img_item_poster)

        internal fun bind(movie: Movie){
            txtTitle.text = movie.movieTitle
            txtReleaseDate.text = movie.releaseDate
            txtScore.text = movie.score
            txtGenre.text = movie.genres
            txtRuntime.text = movie.runtime
            imgPoster.setImageResource(movie.poster)
        }
    }
}