package op.mobile.app.dev.singhs2.travelling.ui.phrases

/**
 * Imports to migrate library and project dependencies.
 */
import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.allCountryActivities.*
import op.mobile.app.dev.singhs2.travelling.databinding.PhrasesFragmentBinding
import op.mobile.app.dev.singhs2.travelling.service.ServiceAdapter
import op.mobile.app.dev.singhs2.travelling.ui.quiz.IOnClickListener

/**
 * PhrasesFragment class to display the country's key phrases. onItemClick function - Here
 * whichever country is selected by the use this function will load the phrases for that
 * given country.
 */
class PhrasesFragment : Fragment(), IOnClickListener {
    private lateinit var viewModel: PhrasesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: PhrasesFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.phrases_fragment, container, false
        )

        viewModel = ViewModelProvider(this).get(PhrasesViewModel::class.java)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.countryViewModel = viewModel
        binding.rvCountries.adapter = ServiceAdapter(this)
        return binding.root
    }

    /**
     * onItemClick function - Here whichever country is selected by the use this function
     * will load the phrases for that given country.
     */
    override fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                val intent = Intent(context, ArgentinaActivity::class.java)
                startActivity(intent)
            }
            1 -> {
                val intent = Intent(context, AustraliaActivity::class.java)
                startActivity(intent)
            }
            2 -> {
                val intent = Intent(context, BrazilActivity::class.java)
                startActivity(intent)
            }
            3 -> {
                val intent = Intent(context, CanadaActivity::class.java)
                startActivity(intent)
            }
            4 -> {
                val intent = Intent(context, ChinaActivity::class.java)
                startActivity(intent)
            }
            5 -> {
                val intent = Intent(context, FranceActivity::class.java)
                startActivity(intent)
            }
            6 -> {
                val intent = Intent(context, GermanyActivity::class.java)
                startActivity(intent)
            }
            7 -> {
                val intent = Intent(context, IndiaActivity::class.java)
                startActivity(intent)
            }
            8 -> {
                val intent = Intent(context, MexicoActivity::class.java)
                startActivity(intent)
            }
            9 -> {
                val intent = Intent(context, NewZealandActivity::class.java)
                startActivity(intent)
            }
            10 -> {
                val intent = Intent(context, NigeriaActivity::class.java)
                startActivity(intent)
            }
            11 -> {
                val intent = Intent(context, SouthAfricaActivity::class.java)
                startActivity(intent)
            }
        }
    }
}