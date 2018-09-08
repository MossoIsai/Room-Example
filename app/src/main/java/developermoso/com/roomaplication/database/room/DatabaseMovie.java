package developermoso.com.roomaplication.database.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import developermoso.com.roomaplication.database.entitys.Movie;

@Database( entities = {Movie.class}, version = 1, exportSchema = false)
public abstract class DatabaseMovie extends RoomDatabase {
    public abstract DaoAccess daoAccess();



}
