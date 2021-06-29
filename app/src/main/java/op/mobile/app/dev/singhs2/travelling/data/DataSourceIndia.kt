package op.mobile.app.dev.singhs2.travelling.data

/**
 * Imports to migrate library and project dependencies.
 */
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.model.KeyPhrasesTest

/**
 * Loading key phrases data in List<KeyPhrasesTest> for India.
 */
class DataSourceIndia {
    fun loadTest(): List<KeyPhrasesTest> {
        return listOf<KeyPhrasesTest>(
            KeyPhrasesTest(R.string.India_phrase_1),
            KeyPhrasesTest(R.string.India_phrase_1_meaning),
            KeyPhrasesTest(R.string.India_phrase_2),
            KeyPhrasesTest(R.string.India_phrase_2_meaning),
            KeyPhrasesTest(R.string.India_phrase_3),
            KeyPhrasesTest(R.string.India_phrase_3_meaning),
            KeyPhrasesTest(R.string.India_phrase_4),
            KeyPhrasesTest(R.string.India_phrase_4_meaning),
            KeyPhrasesTest(R.string.India_phrase_5),
            KeyPhrasesTest(R.string.India_phrase_5_meaning),
            KeyPhrasesTest(R.string.India_phrase_6),
            KeyPhrasesTest(R.string.India_phrase_6_meaning)
        )
    }
}