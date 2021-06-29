package op.mobile.app.dev.singhs2.travelling.ui.translation

/**
 * Imports to migrate library and project dependencies.
 */
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import op.mobile.app.dev.singhs2.travelling.R

class TranslationFragment : Fragment() {

    private lateinit var viewModel: TranslationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.translation_fragment, container, false)

        val start = view.findViewById<Button>(R.id.entTranslation)
        start.setOnClickListener {
            val intent = Intent(context, TranslationFragment::class.java)
            startActivity(intent)
        }
        return view
    }
}