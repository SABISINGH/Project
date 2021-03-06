package op.mobile.app.dev.singhs2.travelling.ui.phrases

/**
 * Imports to migrate library and project dependencies.
 */
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import op.mobile.app.dev.singhs2.travelling.model.GitHubCountries
import op.mobile.app.dev.singhs2.travelling.service.ServiceInstance
import op.mobile.app.dev.singhs2.travelling.service.ServiceStatus

/**
 * PhrasesViewModel class - Responsible for preparing and managing the data for an
 * Activity or a Fragment and also handles the communication of the Activity/Fragment
 * with the rest of the application.
 */
class PhrasesViewModel : ViewModel() {
    private val BASE_URL = "https://gist.githubusercontent.com/"
    private val _status = MutableLiveData<ServiceStatus>()
    val status: LiveData<ServiceStatus> get() = _status

    private val _response = MutableLiveData<List<GitHubCountries>>()
    val response: LiveData<List<GitHubCountries>> get() = _response

    init {
        viewModelScope.launch {
            _status.value = ServiceStatus.LOADING
            try {
                _response.value = ServiceInstance(BASE_URL).retrofitService.getResponse()
                _status.value = ServiceStatus.COMPLETE
            } catch (e: Exception) {
                _response.value = ArrayList()
                _status.value = ServiceStatus.ERROR
            }
        }
    }
}