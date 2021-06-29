package op.mobile.app.dev.singhs2.travelling.ui.result

/**
 * Imports to migrate library and project dependencies.
 */
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.roomDatabase.User
import op.mobile.app.dev.singhs2.travelling.roomDatabase.UserViewModel

/**
 * Class ResultFragment - Initialise variables. Loads the score to the result view. By clicking
 * Finish button user will be directed to home page. User will be taken to the highest score page
 * which will display the highest scores stored in the room database. Function
 * insertDataToDatabase - Adds final score to the room database on the Highest score page.
 */
class ResultFragment : Fragment() {
    // variables
    private lateinit var mUserViewModel: UserViewModel
    private var finalScore: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.result_fragment, container, false)
        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        val tvScore: TextView = view.findViewById(R.id.tv_score)
        val btnFinish: Button = view.findViewById(R.id.btn_finish)
        val btnHighestScore: Button = view.findViewById(R.id.btn_highScore)
        val viewModelFactory =
            ResultsViewModelFactory(ResultFragmentArgs.fromBundle(requireArguments()).score)
        val viewModel = ViewModelProvider(this, viewModelFactory).get(ResultViewModel::class.java)

        // Loads the score to the result view.
        tvScore.text = activity?.getString(R.string.score, viewModel.score.toString())
        finalScore = viewModel.score

        /**
         *  By clicking Finish button user will be directed to home page.
         */
        btnFinish.setOnClickListener {
            findNavController().navigate(ResultFragmentDirections.actionResultFragmentToHomeFragment())
        }

        /**
         * Here user will be taken to the highest score page which will display the
         * highest scores stored in the room database.
         */
        btnHighestScore.setOnClickListener {
            insertDataToDatabase()
        }
        return view
    }

    /**
     *  Function insertDataToDatabase - Adds final score to the room database on the Highest
     *  score page.
     */
    private fun insertDataToDatabase() {
        val highScore = finalScore
        val user = User(0, highScore)
        mUserViewModel.addUser(user)
        findNavController().navigate(R.id.action_result_fragment_to_score_game_fragment)

    }
}