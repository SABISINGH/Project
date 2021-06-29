package op.mobile.app.dev.singhs2.travelling.database

/**
 * Imports to migrate library and project dependencies.
 */
import androidx.lifecycle.LiveData

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun adduser(user: User){
        userDao.addUser(user)
    }
}