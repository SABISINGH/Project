package op.mobile.app.dev.singhs2.travelling.ui.quiz

/**
 * Imports to migrate library and project dependencies.
 */
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.databinding.FragmentQuizGameBinding

/**
 * Class QuizGameFragment - Here we are going to load quiz for each country.
 * Then we assign the first answer as the correct answer when we get the input of
 * the data. If the selected answer is correct/incorrect toast message displays to the
 * UI of the outcome.  With addQuestionIdx we load to the next question and also check
 * if the user actually selected an answer and that not skipping to next question with
 * toast message again. Assigning the first answer to be correct and then checking
 * what is selected by the user. Also adding up score. Displaying correct/incorrect answer.
 * set question and add the score. Also checking the selection.
 */
class QuizGameFragment : Fragment() {
    private lateinit var viewModel: QuizGameViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding: FragmentQuizGameBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_quiz_game,
            container,
            false
        )

        val viewModelFactory =
            QuizGameViewModelFactory(
                QuizGameFragmentArgs.fromBundle(requireArguments()).country
            )

        viewModel = ViewModelProvider(
            this,
            viewModelFactory
        ).get(QuizGameViewModel::class.java)

        viewModel.setQuestion()

        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            quizGameViewModel = viewModel

            // Assigning the first answer to be correct and then checking
            // what is selected by the user. Also adding up score. Displaying
            // correct/incorrect answer.
            btnSubmit.setOnClickListener {
                val checkedRadioBtnId = binding.radioBtnGroupAnswers.checkedRadioButtonId
                val correctAnswer = viewModel.quiz.value?.answers?.get(0)

                if (checkedRadioBtnId != -1) {
                    var answerIdx = 0

                    when (checkedRadioBtnId) {
                        R.id.radio_btn_answer_two -> answerIdx = 1
                        R.id.radio_btn_answer_three -> answerIdx = 2
                        R.id.radio_btn_answer_four -> answerIdx = 3
                    }

                    if (viewModel.answers.value?.get(answerIdx)
                        == correctAnswer
                    ) {
                        viewModel.addScore()
                        Toast.makeText(
                            activity,
                            getString(R.string.Your_answer_was_correct),
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        Toast.makeText(
                            activity,
                            "The answer you clicked was incorrect. The correct answer was $correctAnswer",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    // Adding question.
                    viewModel.addQuestionIdx()

                    // set questiona nd add the score. Also checking the selection.
                    if (viewModel.questionIdx.value!! < viewModel.country.quiz.size) {
                        viewModel.setQuestion()
                        binding.radioBtnGroupAnswers.clearCheck()
                        binding.invalidateAll()
                    } else {
                        val action =
                            QuizGameFragmentDirections.actionQuizGameFragmentToResultFragment()
                        action.score = viewModel.score.value!!
                        findNavController().navigate(action)
                    }
                } else {
                    Toast.makeText(
                        activity,
                        getString(R.string.Please_select_an_answer),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            return root
        }
    }
}