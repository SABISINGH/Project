package op.mobile.app.dev.singhs2.travelling.roomDatabase

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
    // variable
    val readAllData: LiveData<List<User>>
    private val repository: UserRepository
    init {
        val userDao = UserDatabase.getUserDatabase(application).userDao()
        repository = UserRepository(userDao)
        readAllData = repository.readAllData
    }
    // Good practice to launch the code in the background thread with the help of Dispatchers.IO
    fun addUser(user: User){
        viewModelScope.launch(Dispatchers.IO){
            repository.adduser(user)
        }
    }
}