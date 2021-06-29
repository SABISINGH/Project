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
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import op.mobile.app.dev.singhs2.travelling.R

/**
 * TranslationFragment - Initialise variables. Generate findViewById for translator button,
 * speech button and spinner. Then Create an ArrayAdapter using the string array and a default
 * spinner layout. Specify the layout to use when the list of choices appears and then Apply the
 * adapter to the spinner.
 */
class TranslationFragment : Fragment() {

    private lateinit var viewModel: TranslationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.translation_fragment, container, false)

        val start = view.findViewById<Button>(R.id.entTranslation)
        val speech = view.findViewById<Button>(R.id.entSpeech)
        val spinner: Spinner = view.findViewById<Spinner>(R.id.translationSpinner)

        viewModel = ViewModelProvider(this).get(TranslationViewModel::class.java)
        // Create an ArrayAdapter using the string array and a default spinner layout
        context?.let {
            ArrayAdapter.createFromResource(
                it,
                R.array.languages_array,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                // Apply the adapter to the spinner
                spinner.adapter = adapter
            }
        }

        start.setOnClickListener {
            Toast.makeText(getActivity(), "Work-In-Progress", Toast.LENGTH_SHORT).show();
        }

        speech.setOnClickListener {
            Toast.makeText(getActivity(), "Work-In-Progress", Toast.LENGTH_SHORT).show();
        }

//        start.setOnClickListener {
//            val intent = Intent(context, TranslationFragment::class.java)
//            startActivity(intent)
//        }
        return view
    }
}