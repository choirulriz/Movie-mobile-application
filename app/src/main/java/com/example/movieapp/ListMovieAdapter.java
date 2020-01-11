package com.example.movieapp;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;

public class ListMovieAdapter extends RecyclerView.Adapter<ListMovieAdapter.CategoryViewHolder>{
    private ArrayList<MovieModel> listMovies;



    public ListMovieAdapter(ArrayList<MovieModel> listMovies){
        this.listMovies = listMovies;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_movie,viewGroup,false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryViewHolder categoryViewHolder, int position) {
        final MovieModel movie = listMovies.get(position);
        Glide.with(categoryViewHolder.itemView.getContext())
                .load(movie.getPoster())
                .apply(new RequestOptions())
                .into(categoryViewHolder.imgPoster);
        categoryViewHolder.tvTitle.setText(movie.getTitle());
        categoryViewHolder.tvGenre.setText(movie.getGenre());
        categoryViewHolder.tvDirector.setText(movie.getDirector());
        categoryViewHolder.tvDuration.setText(movie.getDuration());

        categoryViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(categoryViewHolder.itemView.getContext(), DetailMovie.class);
                intent.putExtra("movie",movie);
                categoryViewHolder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMovies.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPoster;
        TextView tvTitle,tvDirector,tvGenre,tvDuration;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPoster = itemView.findViewById(R.id.img_item_movie);
            tvTitle = itemView.findViewById(R.id.tv_title_movie);
            tvGenre = itemView.findViewById(R.id.tv_genre_movie);
            tvDirector = itemView.findViewById(R.id.tv_director);
            tvDuration = itemView.findViewById(R.id.tv_duration);
        }
    }
}
