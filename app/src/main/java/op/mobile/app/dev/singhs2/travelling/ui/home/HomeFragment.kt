package op.mobile.app.dev.singhs2.travelling.ui.home

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
import androidx.navigation.fragment.findNavController
import op.mobile.app.dev.singhs2.travelling.R.id.*
import op.mobile.app.dev.singhs2.travelling.R.layout.home_fragment
import op.mobile.app.dev.singhs2.travelling.ui.maps.MapsActivity

/*
* Home fragment class- Declaring variables, assigning them and them implementing setOnClickListener
* to direct within fragments.
*/
class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(home_fragment, container, false)
        val btnMaps: Button = view.findViewById(entMaps)
        val btnQuiz: Button = view.findViewById(entQuiz)
        val btnTranslator: Button = view.findViewById(entTranslator)
        val btnKeyPhrases: Button = view.findViewById(entKeyPhrases)
        val btnSettings: Button = view.findViewById(entSettings)
        btnMaps.setOnClickListener {
            val intent = Intent(activity, MapsActivity::class.java)
            startActivity(intent)
        }
        btnQuiz.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToQuizFragment())
        }
        btnTranslator.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToTranslatorFragment())
        }
        btnKeyPhrases.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToKeyphrasesFragment())
        }
        btnSettings.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSettingsFragment())
        }
        return view
    }
}