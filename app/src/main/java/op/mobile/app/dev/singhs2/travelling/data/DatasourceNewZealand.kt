package op.mobile.app.dev.singhs2.travelling.data

/**
 * Imports to migrate library and project dependencies.
 */
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.model.KeyPhrasesTest

/**
 * Loading key phrases data in List for New Zealand.
 */
class DatasourceNewZealand {

    fun loadTest(): List<KeyPhrasesTest> {
        return listOf<KeyPhrasesTest>(
            KeyPhrasesTest(R.string.New_Zealand_phrase_1),
            KeyPhrasesTest(R.string.New_Zealand_phrase_1_meaning),
            KeyPhrasesTest(R.string.New_Zealand_phrase_2),
            KeyPhrasesTest(R.string.New_Zealand_phrase_2_meaning),
            KeyPhrasesTest(R.string.New_Zealand_phrase_3),
            KeyPhrasesTest(R.string.New_Zealand_phrase_3_meaning),
            KeyPhrasesTest(R.string.New_Zealand_phrase_4),
            KeyPhrasesTest(R.string.New_Zealand_phrase_4_meaning),
            KeyPhrasesTest(R.string.New_Zealand_phrase_5),
            KeyPhrasesTest(R.string.New_Zealand_phrase_5_meaning),
            KeyPhrasesTest(R.string.New_Zealand_phrase_6),
            KeyPhrasesTest(R.string.New_Zealand_phrase_6_meaning),
            KeyPhrasesTest(R.string.New_Zealand_phrase_7),
            KeyPhrasesTest(R.string.New_Zealand_phrase_7_meaning),
            KeyPhrasesTest(R.string.New_Zealand_phrase_8),
            KeyPhrasesTest(R.string.New_Zealand_phrase_8_meaning)
        )
    }
}