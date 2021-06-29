package op.mobile.app.dev.singhs2.travelling.ui.translation

/**
 * Imports to migrate library and project dependencies.
 */
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import op.mobile.app.dev.singhs2.travelling.model.Yandex
import op.mobile.app.dev.singhs2.travelling.service.ServiceInstance
import op.mobile.app.dev.singhs2.travelling.service.ServiceStatus

class TranslationViewModel : ViewModel() {
    private val yandexTranslateUrl = "https://translate.yandex.net/api/v1.5/tr.json/"
    private val _status = MutableLiveData<ServiceStatus>()
    val status: LiveData<ServiceStatus> get() = _status

    private val _response = MutableLiveData<Yandex>()
    val response: LiveData<Yandex> get() = _response

    init {
        viewModelScope.launch {
            _status.value = ServiceStatus.LOADING
            try {
                _response.value = ServiceInstance(yandexTranslateUrl).retrofitYandexService.getTranslatorResponse(
                    "trnsl.1.1.20200329T025311Z.37f6897b8a99dbd9." +
                            "bb42d876c007fde0812c365015625fde8c0f0163", "Hello", "en-es"
//                    text!!,
//                    "en-${country.language}"
                )
                _status.value = ServiceStatus.COMPLETE
            } catch (e: Exception) {
                _status.value = ServiceStatus.ERROR
            }
        }
    }

}