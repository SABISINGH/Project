package op.mobile.app.dev.singhs2.travelling.ui.maps

/**
 * Imports to migrate library and project dependencies.
 */
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.R.layout.maps_fragment

class MapsFragment : Fragment() {
    private lateinit var viewModel: MapsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(maps_fragment, container, false)
        return inflater.inflate(maps_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MapsViewModel::class.java)
    }
}