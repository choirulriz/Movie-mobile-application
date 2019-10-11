package com.example.movieapp;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieModel implements Parcelable {
    private String Poster, Title, Actors, Director, Genre, Duration, Detail;

    protected MovieModel(Parcel in) {
        Poster = in.readString();
        Title = in.readString();
        Actors = in.readString();
        Director = in.readString();
        Genre = in.readString();
        Duration = in.readString();
        Detail = in.readString();
    }

    public static final Creator<MovieModel> CREATOR = new Creator<MovieModel>() {
        @Override
        public MovieModel createFromParcel(Parcel in) {
            return new MovieModel(in);
        }

        @Override
        public MovieModel[] newArray(int size) {
            return new MovieModel[size];
        }
    };

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getActors() {
        return Actors;
    }

    public void setActors(String actors) {
        Actors = actors;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public MovieModel(){

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Poster);
        dest.writeString(Title);
        dest.writeString(Actors);
        dest.writeString(Director);
        dest.writeString(Genre);
        dest.writeString(Duration);
        dest.writeString(Detail);
    }
}
