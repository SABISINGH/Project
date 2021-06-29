package op.mobile.app.dev.singhs2.travelling.database

/**
 * Imports to migrate library and project dependencies.
 */
import androidx.lifecycle.LiveData

/**
 * UserRepository - Abstracts access to multiple data sources. its not part of
 * the Architecture Components libraries, but is a suggested best practice
 * for code separation and architecture.
 */
class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun adduser(user: User){
        userDao.addUser(user)
    }
}