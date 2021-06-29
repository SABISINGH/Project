package op.mobile.app.dev.singhs2.travelling.roomDatabase

/**
 * Imports to migrate library and project dependencies.
 */
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

/**
 * Data Access Object (Dao) - Contains the methods used to access the database.
 */
@Dao
interface UserDao {

    @Insert
    suspend fun addUser(user: User)

    /**
     * SQl query to return the list of users wrapped in LiveData
     */
    @Query("SELECT * FROM quiz_score ORDER BY quizScore DESC")
    fun readAllData(): LiveData<List<User>>
}