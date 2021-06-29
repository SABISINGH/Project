package op.mobile.app.dev.singhs2.travelling.ui.mainActivity

/**
 * Imports to migrate library and project dependencies.
 */
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.R.drawable.travelearth

/**
 * MainActivity - This is the main page of the app. Usr have bottom screen navigation and also
 * 5 buttons (Maps, Quiz, Translation, Key Phrases and Settings) to chose from. Then Calling dark
 * mode check using shared preferences. onBackPressed - This is exit method for the app.
 * If user click on the back button a toast message will advise user to click twice if they
 * would like to exit. If user click twice within the (pressTime + 1000) a toast message will
 * ask the user if they want to exit or not. If pressed yes the app will close but is pressed no
 * it will take the user to the screen they were on.
 */
@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
        private var pressTime: Long = 0
        private lateinit var exitToastMessage: Toast
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            lateinit var sharedPreference: SharedPreferences
            sharedPreference = this.getSharedPreferences("darkMode",  Context.MODE_PRIVATE)!!
            val navView: BottomNavigationView = findViewById(R.id.navigation_view)
            val navHostFragment =
                supportFragmentManager.findFragmentById(R.id.navigation_host_fragment) as NavHostFragment
            val navController = navHostFragment.navController
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_translation,
                R.id.navigation_phrases,
                R.id.navigation_quiz,
                R.id.navigation_settings
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        /**
         * Calling dark mode check using shared preferences.
         */
        val isDarkMode: Boolean = sharedPreference.getBoolean(getString(R.string.switch_dark_mode), false)
        if (isDarkMode) {
            (this as AppCompatActivity?)!!.delegate.localNightMode =
                AppCompatDelegate.MODE_NIGHT_YES
        } else {
            (this as AppCompatActivity?)!!.delegate.localNightMode =
                AppCompatDelegate.MODE_NIGHT_NO
        }
    }

    /**
     * onBackPressed - This is exit method for the app. If user click on the back button
     * a toast message will advise user to click twice if they would like to exit. If user click twice
     * within the (pressTime + 1000) a toast message will ask the user if they want to exit or not.
     * If pressed yes the app will close but is pressed no it will take the user to the screen they were
     * on.
     */
    override fun onBackPressed() {
        if (pressTime + 1000 > System.currentTimeMillis()) {
            exitToastMessage.cancel()
            val alertDialog = AlertDialog.Builder(this).create()
            alertDialog.setTitle(getString(R.string.exit_app))
            alertDialog.setIcon(travelearth)
            alertDialog.setMessage(getString(R.string.backpress_exit_confirmation_message))
            alertDialog.setCancelable(false)
            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, getString(R.string.backpress_exit_yes)) { dialog, which ->
                finish()
                dialog.dismiss()
            }
            alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, getString(R.string.backpress_no_text)) { dialog, which ->
                dialog.dismiss()
            }
            alertDialog.show()
        } else {
            exitToastMessage = Toast.makeText(
                this,
                getString(R.string.backpress_toast_confirmation),
                Toast.LENGTH_SHORT
            )
            exitToastMessage.show()
        }
        pressTime = System.currentTimeMillis()
    }
}