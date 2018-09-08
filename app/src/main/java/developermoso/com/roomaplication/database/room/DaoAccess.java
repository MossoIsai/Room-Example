package developermoso.com.roomaplication.database.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import developermoso.com.roomaplication.database.entitys.Movie;

@Dao
public interface DaoAccess {

    @Insert
    void insertOnlySingleMovie(Movie movie);
    @Insert
    void insertOnlyMultipleMovie(List<Movie> movieList);

    @Query("SELECT * FROM Movie WHERE movieId = :movieId") Movie fetchOneMoviesbyMovieId (int movieId);
    @Update void updateMovie(Movie movie);
    @Delete void deleteMovie(Movie movie);

}
