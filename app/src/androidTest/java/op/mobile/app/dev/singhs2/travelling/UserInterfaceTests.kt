package op.mobile.app.dev.singhs2.travelling

import androidx.test.filters.LargeTest
import org.junit.runner.RunWith
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import it.xabaras.android.espresso.recyclerviewchildactions.RecyclerViewChildActions.Companion.childOfViewAtPositionWithMatcher
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@RunWith(AndroidJUnit4::class)
@LargeTest
class UserInterfaceTests {
    private lateinit var homeScreenMapText: String
    private lateinit var homeScreenQuizText: String
    private lateinit var homeScreenTranslatorText: String
    private lateinit var homeScreenKeyPhrasesText: String
    private lateinit var homeScreenSettingsText: String

    private lateinit var quizScreenArgentinaText: String
    private lateinit var quizScreenGermanyText: String
    private lateinit var quizScreenMexicoText: String
    private lateinit var quizScreenSouthAfricaText: String

    private lateinit var phrasesScreenAustraliaText: String
    private lateinit var phrasesScreenBrazilText: String
    private lateinit var phrasesScreenIndiaText: String
    private lateinit var phrasesScreenNewZealandText: String

    private lateinit var settingsScreenPrivacyPolicyText: String
    private lateinit var settingsScreenTermsAndConditionsText: String
    private lateinit var settingsScreenFacebookText: String
    private lateinit var settingsScreenModeText: String



    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity>
                = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun initValidString() {
        homeScreenMapText = "Maps"
        homeScreenQuizText = "Quiz"
        homeScreenTranslatorText = "Translator"
        homeScreenKeyPhrasesText = "Key Phrases"
        homeScreenSettingsText = "Settings"

        quizScreenArgentinaText = "Name: Argentina"
        quizScreenGermanyText = "Official-Language: German"
        quizScreenMexicoText = "Name: Mexico"
        quizScreenSouthAfricaText = "Official-Language: Afrikaans"

        phrasesScreenAustraliaText = "Name: Australia"
        phrasesScreenBrazilText = "Name: Brazil"
        phrasesScreenIndiaText = "Official-Language: Hindi"
        phrasesScreenNewZealandText = "Official-Language: English"

        settingsScreenPrivacyPolicyText = "Privacy policy"
        settingsScreenTermsAndConditionsText = "Terms & Conditions"
        settingsScreenFacebookText = "Facebook"
        settingsScreenModeText = "Light Mode / Dark Mode"
    }

    @Test
    fun checkHomeScreenMapText() {
        onView(withId(R.id.entMaps)).check(ViewAssertions.matches(withText(homeScreenMapText)))
    }
    @Test
    fun checkHomeScreenQuizText() {
        onView(withId(R.id.entQuiz)).check(ViewAssertions.matches(withText(homeScreenQuizText)))
    }
    @Test
    fun checkHomeScreenTranslatorText() {
        onView(withId(R.id.entTranslator)).check(ViewAssertions.matches(withText(homeScreenTranslatorText)))
    }
    @Test
    fun checkHomeScreenKeyPhrasesText() {
        onView(withId(R.id.entKeyPhrases)).check(ViewAssertions.matches(withText(homeScreenKeyPhrasesText)))
    }
    @Test
    fun checkHomeScreenSettingsText() {
        onView(withId(R.id.entSettings)).check(ViewAssertions.matches(withText(homeScreenSettingsText)))
    }

    @Test
    fun checkSettingsScreenPrivacyPolicyText() {
        onView(withId(R.id.entSettings)).perform(click())
        onView(withId(R.id.privacyPolicy)).check(ViewAssertions.matches(withText(settingsScreenPrivacyPolicyText)))
    }
    @Test
    fun checkSettingsScreenPrivacyPolicyClickText() {
        onView(withId(R.id.entSettings)).perform(click())
        onView(withId(R.id.privacyPolicy)).check(ViewAssertions.matches(withText(settingsScreenPrivacyPolicyText)))
        onView(withId(R.id.privacyPolicy)).perform(click())
    }

    @Test
    fun checkSettingsScreenTermsAndConditionsText() {
        onView(withId(R.id.entSettings)).perform(click())
        onView(withId(R.id.termsAndConditions)).check(ViewAssertions.matches(withText(settingsScreenTermsAndConditionsText)))
    }
    @Test
    fun checkSettingsScreenTermsAndConditionsClickText() {
        onView(withId(R.id.entSettings)).perform(click())
        onView(withId(R.id.termsAndConditions)).check(ViewAssertions.matches(withText(settingsScreenTermsAndConditionsText)))
        onView(withId(R.id.termsAndConditions)).perform(click())
    }

    @Test
    fun checkSettingsScreenFacebookText() {
        onView(withId(R.id.entSettings)).perform(click())
        onView(withId(R.id.facebook)).check(ViewAssertions.matches(withText(settingsScreenFacebookText)))
    }
    @Test
    fun checkSettingsScreenFacebookClickText() {
        onView(withId(R.id.entSettings)).perform(click())
        onView(withId(R.id.facebook)).check(ViewAssertions.matches(withText(settingsScreenFacebookText)))
        onView(withId(R.id.facebook)).perform(click())
    }

    @Test
    fun checkSettingsScreenModeText() {
        onView(withId(R.id.entSettings)).perform(click())
        onView(withId(R.id.toggleSwitch)).check(ViewAssertions.matches(withText(settingsScreenModeText)))
    }
    @Test
    fun checkSettingsScreenModeClickText() {
        onView(withId(R.id.entSettings)).perform(click())
        onView(withId(R.id.toggleSwitch)).check(ViewAssertions.matches(withText(settingsScreenModeText)))
        onView(withId(R.id.toggleSwitch)).perform(click())
    }

    @Test
    fun checkQuizScreenArgentinaText() {
        onView(withId(R.id.entQuiz)).perform(click())
        onView(withId(R.id.rv_countries)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(0))
        onView(withId(R.id.rv_countries)).check(ViewAssertions.matches(childOfViewAtPositionWithMatcher(R.id.textView3, 0, withText(quizScreenArgentinaText))))
    }
    @Test
    fun checkQuizScreenGermanyText() {
        onView(withId(R.id.entQuiz)).perform(click())
        onView(withId(R.id.rv_countries)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(6))
        onView(withId(R.id.rv_countries)).check(ViewAssertions.matches(childOfViewAtPositionWithMatcher(R.id.textView4, 6, withText(quizScreenGermanyText))))
    }
    @Test
    fun checkQuizScreenMexicoText() {
        onView(withId(R.id.entQuiz)).perform(click())
        onView(withId(R.id.rv_countries)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(8))
        onView(withId(R.id.rv_countries)).check(ViewAssertions.matches(childOfViewAtPositionWithMatcher(R.id.textView3, 8, withText(quizScreenMexicoText))))
    }
    @Test
    fun checkQuizScreenSouthAfricaText() {
        onView(withId(R.id.entQuiz)).perform(click())
        onView(withId(R.id.rv_countries)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(11))
        onView(withId(R.id.rv_countries)).check(ViewAssertions.matches(childOfViewAtPositionWithMatcher(R.id.textView4, 11, withText(quizScreenSouthAfricaText))))
    }

    @Test
    fun checkPhrasesScreenAustraliaText() {
        onView(withId(R.id.entKeyPhrases)).perform(click())
        onView(withId(R.id.rv_countries)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(1))
        onView(withId(R.id.rv_countries)).check(ViewAssertions.matches(childOfViewAtPositionWithMatcher(R.id.textView3, 1, withText(phrasesScreenAustraliaText))))
    }
    @Test
    fun checkPhrasesScreenBrazilText() {
        onView(withId(R.id.entKeyPhrases)).perform(click())
        onView(withId(R.id.rv_countries)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(2))
        onView(withId(R.id.rv_countries)).check(ViewAssertions.matches(childOfViewAtPositionWithMatcher(R.id.textView3, 2, withText(phrasesScreenBrazilText))))
    }
    @Test
    fun checkPhrasesScreenIndiaText() {
        onView(withId(R.id.entKeyPhrases)).perform(click())
        onView(withId(R.id.rv_countries)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(7))
        onView(withId(R.id.rv_countries)).check(ViewAssertions.matches(childOfViewAtPositionWithMatcher(R.id.textView4, 7, withText(phrasesScreenIndiaText))))
    }
    @Test
    fun checkPhrasesScreenNewZealandText() {
        onView(withId(R.id.entKeyPhrases)).perform(click())
        onView(withId(R.id.rv_countries)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(9))
        onView(withId(R.id.rv_countries)).check(ViewAssertions.matches(childOfViewAtPositionWithMatcher(R.id.textView4, 9, withText(phrasesScreenNewZealandText))))
    }
}