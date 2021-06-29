package op.mobile.app.dev.singhs2.travelling.ui.result
/**
 * Import to migrate library and project dependencies.
 */
import androidx.lifecycle.ViewModel

/**
 * ResultViewModel - Assign the score to the final score.
 */
class ResultViewModel(finalScore: Int) : ViewModel() {
    var score: Int = finalScore
}