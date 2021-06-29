package op.mobile.app.dev.singhs2.travelling.ui.quiz

/**
 * Imports to migrate library and project dependencies.
 */
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.databinding.DataBindingUtil
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.databinding.QuizFragmentBinding
import op.mobile.app.dev.singhs2.travelling.service.ServiceAdapter

/**
 * Class QuizFragment is loading the quiz.
 */
class QuizFragment : Fragment(), IOnClickListener {
    private lateinit var viewModel: QuizViewModel
    private lateinit var binding: QuizFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.quiz_fragment, container, false
        )

        viewModel = ViewModelProvider(this).get(QuizViewModel::class.java)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.githubCountriesViewModel = viewModel
        binding.rvCountries.adapter = ServiceAdapter(this)
        return binding.root
    }

    /**
     * Fun onItemClick - to bind the value to quiz_fragment.xml
     */

    override fun onItemClick(position: Int) {
        val item = binding.githubCountriesViewModel!!.response.value!![position]
        val action =
            QuizFragmentDirections.actionQuizFragmentToQuizGameFragment(item)
        findNavController().navigate(action)
    }
}