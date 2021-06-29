package op.mobile.app.dev.singhs2.travelling.ui.settings

/**
 * Imports to migrate library and project dependencies.
 */
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.R.id.*

/**
 * Class SettingsFragment - This class will be displaying the facebook, github external link. Extra
 * feature. Also I am loading my privacy policy and terms & conditions on this page. I have also
 * added a toggle switch which will be changing the theme to light mode / dark mode.
 */
class SettingsFragment : Fragment() {
    // variables
    private lateinit var sharedPreference: SharedPreferences
    private lateinit var themeChangeSwitch: SwitchCompat

    /**
     * In the onCreateView function I am setting up the light mode and dark mode theme.
     * If/Else checks the the toggle switch is in dark mode or light mode. Using shared preference
     * if the check is true then apply the dark mode (MODE_NIGHT_YES) and if the check is false
     * then don't apply the dark mode (MODE_NIGHT_NO).
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.settings_fragment, container, false)
        sharedPreference = context?.getSharedPreferences("darkMode", Context.MODE_PRIVATE)!!
        themeChangeSwitch = view.findViewById(toggleSwitch)
        val isDarkMode: Boolean =
            sharedPreference.getBoolean(getString(R.string.switch_dark_mode), false)
        if (isDarkMode) {
            (activity as AppCompatActivity?)!!.delegate.localNightMode =
                AppCompatDelegate.MODE_NIGHT_YES
        } else {
            (activity as AppCompatActivity?)!!.delegate.localNightMode =
                AppCompatDelegate.MODE_NIGHT_NO
        }
        themeChangeSwitch.isChecked = isDarkMode == true
        themeChangeSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                (activity as AppCompatActivity?)!!.delegate.localNightMode =
                    AppCompatDelegate.MODE_NIGHT_YES
                sharedPreference.edit().putBoolean(getString(R.string.switch_dark_mode), isChecked)
                    .apply()
            } else {
                (activity as AppCompatActivity?)!!.delegate.localNightMode =
                    AppCompatDelegate.MODE_NIGHT_NO
                sharedPreference.edit().putBoolean(getString(R.string.switch_dark_mode), isChecked)
                    .apply()
            }
        }

        /**
         * Buttons - to take the user to the specific need.
         */
        val facebook = view?.findViewById<Button>(facebook)
        val github = view?.findViewById<Button>(github)
        val privacyPolicy = view?.findViewById<Button>(privacyPolicy)
        val termsAndConditions = view?.findViewById<Button>(termsAndConditions)

        /**
         * Loading facebook page.
         */
        facebook?.setOnClickListener {
            val intent =
                Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.settings_facebook_link)))
            startActivity(intent)
        }

        /**
         * Loading github page.
         */
        github?.setOnClickListener {
            val intent =
                Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.settings_github_link)))
            startActivity(intent)
        }

        /**
         * Loading privacy policy page.
         */
        privacyPolicy?.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://otago-polytechnic-bit-courses.github.io/mobile-app-dev-s1-21-project-SABISINGH/")
            )
            startActivity(intent)
        }

        /**
         * Loading terms and conditions page.
         */
        termsAndConditions?.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.websitepolicies.com/policies/view/qBaLNp64")
            )
            startActivity(intent)
        }
        return view
    }
}