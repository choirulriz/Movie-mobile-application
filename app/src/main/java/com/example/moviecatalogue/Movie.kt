package com.example.moviecatalogue

import android.os.Parcel
import android.os.Parcelable

data class Movie(
    var movieTitle: String?,
    var releaseDate: String?,
    var score: String?,
    var overview: String?,
    var director: String?,
    var actors: String?,
    var runtime: String?,
    var genres: String?,
    var poster: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(movieTitle)
        parcel.writeString(releaseDate)
        parcel.writeString(score)
        parcel.writeString(overview)
        parcel.writeString(director)
        parcel.writeString(actors)
        parcel.writeString(runtime)
        parcel.writeString(genres)
        parcel.writeInt(poster)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {
        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }
}