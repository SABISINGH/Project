package op.mobile.app.dev.singhs2.travelling.database

/**
 * Imports to migrate library and project dependencies.
 */
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * UserDatabase - Contains the database holder and serves as the main access point for
 * the underlying connection to the app's persisted, relational data.
 */
@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class UserDatabase: RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object{
        @Volatile
        private var INSTANCE: UserDatabase?= null

        fun getUserDatabase(context: Context): UserDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "quiz_score"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}