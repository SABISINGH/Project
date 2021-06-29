package op.mobile.app.dev.singhs2.travelling.ui.result

/**
 * Imports to migrate library and project dependencies.
 */
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 *  Adding suppress annotation.
 */
@Suppress("UNCHECKED_CAST")
class ResultsViewModelFactory(private val finalScore: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ResultViewModel::class.java))
            return ResultViewModel(finalScore) as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}