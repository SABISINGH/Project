package op.mobile.app.dev.singhs2.travelling.ui.phrases

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import op.mobile.app.dev.singhs2.travelling.R

class PhrasesFragment : Fragment() {

    companion object {
        fun newInstance() = PhrasesFragment()
    }

    private lateinit var viewModel: PhrasesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.phrases_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PhrasesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}