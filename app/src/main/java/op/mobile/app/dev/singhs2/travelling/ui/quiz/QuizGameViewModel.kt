package op.mobile.app.dev.singhs2.travelling.ui.quiz

/**
 * Imports to migrate library and project dependencies.
 */
import android.os.CountDownTimer
import android.text.format.DateUtils
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import op.mobile.app.dev.singhs2.travelling.model.GitHubCountries
import op.mobile.app.dev.singhs2.travelling.model.Quiz

/**
 * Class QuizGameViewModel - responsible for the quiz functionality.
 */
class QuizGameViewModel(_country: GitHubCountries) : ViewModel() {

    //Loading/Assigning variables
    var country: GitHubCountries = _country
    private lateinit var timer: CountDownTimer

    private val _questionIdx = MutableLiveData<Int>()
    val questionIdx: LiveData<Int> get() = _questionIdx

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int> get() = _score

    private val _quiz = MutableLiveData<Quiz>()
    val quiz: LiveData<Quiz> get() = _quiz

    private val _answers = MutableLiveData<MutableList<String>>()
    val answers: LiveData<MutableList<String>> get() = _answers

    private val _img = MutableLiveData<MutableList<String>>()
    val img: LiveData<MutableList<String>> get() = _img

    private val _timerEnabled = MutableLiveData<Boolean>()
    val timerEnabled: LiveData<Boolean> get() = _timerEnabled

    private val _countdownTime = MutableLiveData<Long>()
    private val countdownTime: LiveData<Long> get() = _countdownTime

    val countdownTimeString = Transformations.map(countdownTime) { time ->
        DateUtils.formatElapsedTime(time)
    }

    init {
        _questionIdx.value = 0
        _score.value = 0
    }

    /**
     *  Function startTimer - setting the time of thirty seconds for each question.
     *  Function onFinish - adding the question and then loading the new question.
     */
    private fun startTimer() {
        _timerEnabled.value = false

        timer = object : CountDownTimer(THIRTY_SECONDS, ONE_SECOND) {
            override fun onTick(millisUntilFinished: Long) {
                _countdownTime.value = millisUntilFinished / ONE_SECOND
            }
            override fun onFinish() {
                addQuestionIdx()
                setQuestion()
            }
        }
        timer.start()
    }

    /**
     * Function reset - Resetting the timer back to thirty seconds.
     */
    private fun reset() {
        _timerEnabled.value = true
        _countdownTime.value = THIRTY_SECONDS / ONE_SECOND
    }

    /**
     * This method will be called when this ViewModel is no longer used and will be destroyed.
     * Timer will also be cancelled.
     */
    override fun onCleared() {
        super.onCleared()
        timer.cancel()
    }

    /**
     * Assigning the value to the timer. Each answer the user is allowed only thirty seconds.
     */
    companion object {
        private const val ONE_SECOND = 1000L
        private const val THIRTY_SECONDS = 30000L
    }

    /**
     * Fun addQuestionIdx - Adding questions value. Once user submitted the answer we
     * will then load new question and image for the question. Timer is cancelled.
     */
    fun addQuestionIdx() {
        _questionIdx.value = _questionIdx.value?.plus(1)
        _img.value = _img.value?.plus(1) as MutableList<String>?
        timer.cancel()
    }

    /**
     * Function addScore - Adds the score of the particular quiz.
     */
    fun addScore() {
        _score.value = _score.value?.plus(1)
    }

    /**
     * Function setQuestion - here we are setting up new question with new answer values.
     * The answers will be shuffles every time the new quiz gets loaded and also the
     * start the timer with thirty seconds limit.
     */
    fun setQuestion() {
        _quiz.value = country.quiz[_questionIdx.value!!]
        _answers.value = quiz.value?.answers?.toMutableList()
        _answers.value?.shuffle()
        startTimer()
    }
}