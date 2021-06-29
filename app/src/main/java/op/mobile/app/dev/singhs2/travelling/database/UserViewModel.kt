package op.mobile.app.dev.singhs2.travelling.database

/**
 * Imports to migrate library and project dependencies.
 */
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * UserViewModel - To access all our queries from Dao. To provide data to the UI and
 * survive configuration changes. It acts as a communication center between
 * the Repository and the UI.
 */
class UserViewModel(application: Application): AndroidViewModel(application) {

    val readAllData: LiveData<List<User>>
    private val repository: UserRepository
    init {
        val userDao = UserDatabase.getUserDatabase(application).userDao()
        repository = UserRepository(userDao)
        readAllData = repository.readAllData
    }

    fun addUser(user: User){
        viewModelScope.launch(Dispatchers.IO){
            repository.adduser(user)
        }
    }
}