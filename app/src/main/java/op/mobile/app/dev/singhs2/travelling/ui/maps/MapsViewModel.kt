package op.mobile.app.dev.singhs2.travelling.ui.maps

/**
 * Imports to migrate library and project dependencies.
 */
import android.content.ClipData
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MapsViewModel : ViewModel() {
    private val mutableSelectedItem = MutableLiveData<ClipData.Item>()
    val selectedItem: LiveData<ClipData.Item> get() = mutableSelectedItem

    fun selectItem(item: ClipData.Item) {
        mutableSelectedItem.value = item
    }
}