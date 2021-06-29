package op.mobile.app.dev.singhs2.travelling.allCountryActivities

/**
 * Imports to migrate library and project dependencies.
 */
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.RecyclerView
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.R.id.recycler_view_phrases_in
import op.mobile.app.dev.singhs2.travelling.R.layout.activity_india
import op.mobile.app.dev.singhs2.travelling.adapter.ItemAdapter
import op.mobile.app.dev.singhs2.travelling.data.DataSourceIndia

/**
 * India Activity
 */
class IndiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_india)

        /**
         * Declaring shared preferences for night mode and checking the theme style checked.
         */
        lateinit var sharedPreference: SharedPreferences
        sharedPreference = this.getSharedPreferences("darkMode", Context.MODE_PRIVATE)!!
        val isDarkMode: Boolean =
            sharedPreference.getBoolean(getString(R.string.switch_dark_mode), false)
        if (isDarkMode) {
            (this as AppCompatActivity?)!!.delegate.localNightMode =
                AppCompatDelegate.MODE_NIGHT_YES
        } else {
            (this as AppCompatActivity?)!!.delegate.localNightMode =
                AppCompatDelegate.MODE_NIGHT_NO
        }

        // Initialize data.
        val myDataset = DataSourceIndia().loadTest()
        val recyclerView = findViewById<RecyclerView>(recycler_view_phrases_in)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}