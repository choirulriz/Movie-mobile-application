package com.example.movieapp;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieModel implements Parcelable {
    private String Poster;
    private String PhotoActor1;
    private String PhotoActor2;
    private String PhotoActor3;
    private String PhotoActor4;
    private String PhotoActor5;
    private String Title, ReleaseDate, UserScore, Overview, Director, Runtime, Genre, Budget, Revenue;
    private String Actor1, Actor2, Actor3, Actor4, Actor5;
    private String ActorAs1, ActorAs2, ActorAs3, ActorAs4, ActorAs5;

    protected MovieModel(Parcel in) {
        Poster = in.readString();
        PhotoActor1 = in.readString();
        PhotoActor2 = in.readString();
        PhotoActor3 = in.readString();
        PhotoActor4 = in.readString();
        PhotoActor5 = in.readString();
        Title = in.readString();
        ReleaseDate = in.readString();
        UserScore = in.readString();
        Overview = in.readString();
        Director = in.readString();
        Runtime = in.readString();
        Genre = in.readString();
        Budget = in.readString();
        Revenue = in.readString();
        Actor1 = in.readString();
        Actor2 = in.readString();
        Actor3 = in.readString();
        Actor4 = in.readString();
        Actor5 = in.readString();
        ActorAs1 = in.readString();
        ActorAs2 = in.readString();
        ActorAs3 = in.readString();
        ActorAs4 = in.readString();
        ActorAs5 = in.readString();
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

    public String getPhotoActor1() {
        return PhotoActor1;
    }

    public void setPhotoActor1(String photoActor1) {
        PhotoActor1 = photoActor1;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
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


    public String getActorAs1() {
        return ActorAs1;
    }

    public void setActorAs1(String actorAs1) {
        ActorAs1 = actorAs1;
    }

    public String getActorAs2() {
        return ActorAs2;
    }

    public void setActorAs2(String actorAs2) {
        ActorAs2 = actorAs2;
    }

    public String getActorAs3() {
        return ActorAs3;
    }

    public void setActorAs3(String actorAs3) {
        ActorAs3 = actorAs3;
    }

    public String getActorAs4() {
        return ActorAs4;
    }

    public void setActorAs4(String actorAs4) {
        ActorAs4 = actorAs4;
    }

    public String getActorAs5() {
        return ActorAs5;
    }

    public void setActorAs5(String actorAs5) {
        ActorAs5 = actorAs5;
    }

    public String getRuntime() {
        return Runtime;
    }

    public void setRuntime(String runtime) {
        Runtime = runtime;
    }

    public String getOverview() {
        return Overview;
    }

    public void setOverview(String overview) {
        Overview = overview;
    }

    public String getPhotoActor2() {
        return PhotoActor2;
    }

    public void setPhotoActor2(String photoActor2) {
        PhotoActor2 = photoActor2;
    }

    public String getPhotoActor3() {
        return PhotoActor3;
    }

    public void setPhotoActor3(String photoActor3) {
        PhotoActor3 = photoActor3;
    }

    public String getPhotoActor4() {
        return PhotoActor4;
    }

    public void setPhotoActor4(String photoActor4) {
        PhotoActor4 = photoActor4;
    }

    public String getPhotoActor5() {
        return PhotoActor5;
    }

    public void setPhotoActor5(String photoActor5) {
        PhotoActor5 = photoActor5;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getUserScore() {
        return UserScore;
    }

    public void setUserScore(String userScore) {
        UserScore = userScore;
    }

    public String getBudget() {
        return Budget;
    }

    public void setBudget(String budget) {
        Budget = budget;
    }

    public String getRevenue() {
        return Revenue;
    }

    public void setRevenue(String revenue) {
        Revenue = revenue;
    }

    public String getActor1() {
        return Actor1;
    }

    public void setActor1(String actor1) {
        Actor1 = actor1;
    }

    public String getActor2() {
        return Actor2;
    }

    public void setActor2(String actor2) {
        Actor2 = actor2;
    }

    public String getActor3() {
        return Actor3;
    }

    public void setActor3(String actor3) {
        Actor3 = actor3;
    }

    public String getActor4() {
        return Actor4;
    }

    public void setActor4(String actor4) {
        Actor4 = actor4;
    }

    public String getActor5() {
        return Actor5;
    }

    public void setActor5(String actor5) {
        Actor5 = actor5;
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
        dest.writeString(PhotoActor1);
        dest.writeString(PhotoActor2);
        dest.writeString(PhotoActor3);
        dest.writeString(PhotoActor4);
        dest.writeString(PhotoActor5);
        dest.writeString(Title);
        dest.writeString(ReleaseDate);
        dest.writeString(UserScore);
        dest.writeString(Overview);
        dest.writeString(Director);
        dest.writeString(Runtime);
        dest.writeString(Genre);
        dest.writeString(Budget);
        dest.writeString(Revenue);
        dest.writeString(Actor1);
        dest.writeString(Actor2);
        dest.writeString(Actor3);
        dest.writeString(Actor4);
        dest.writeString(Actor5);
        dest.writeString(ActorAs1);
        dest.writeString(ActorAs2);
        dest.writeString(ActorAs3);
        dest.writeString(ActorAs4);
        dest.writeString(ActorAs5);

    }
}
