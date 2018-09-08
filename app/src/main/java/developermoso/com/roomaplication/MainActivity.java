package developermoso.com.roomaplication;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import developermoso.com.roomaplication.database.entitys.Movie;
import developermoso.com.roomaplication.database.room.DatabaseMovie;

public class MainActivity extends AppCompatActivity {
    private static final String nameDatabase = "DBMOVIES";
    private DatabaseMovie databaseMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         databaseMovie = Room.databaseBuilder(getApplicationContext(),
                DatabaseMovie.class,
                nameDatabase).build();


        new Thread(new Runnable() {
            @Override
            public void run() {
                Movie movie =new Movie();
                movie.setMovieId(2);
                movie.setMovieName("Pelicua XXX");
                databaseMovie.daoAccess().insertOnlySingleMovie(movie);
            }
        }) .start();
    }
}
