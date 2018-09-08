package developermoso.com.roomaplication.database.entitys;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Movie {

    @NonNull
    @PrimaryKey
    private int movieId;
    private String movieName;
    private double movieRating;
    private String movieDescription;
    private String movieBriefDescription;

    public Movie() {
    }

    @NonNull
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(@NonNull int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(double movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getMovieBriefDescription() {
        return movieBriefDescription;
    }

    public void setMovieBriefDescription(String movieBriefDescription) {
        this.movieBriefDescription = movieBriefDescription;
    }
}
