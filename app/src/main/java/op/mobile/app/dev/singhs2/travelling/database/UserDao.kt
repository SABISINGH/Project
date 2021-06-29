package op.mobile.app.dev.singhs2.travelling.database

/**
 * Imports to migrate library and project dependencies.
 */
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Insert
    suspend fun addUser(user: User)

    @Query("SELECT * FROM quiz_score ORDER BY quizScore DESC")
    fun readAllData(): LiveData<List<User>>
}