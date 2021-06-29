package op.mobile.app.dev.singhs2.travelling.languageApi

class YandexLangCode {
    fun YandexLangCode(lang: String): String{
        return when(lang) {
                "Spanish" -> "en-es"
                "Portuguese" -> "en-pt"
                "Hindi" -> "en-hi"
                "Arabic" -> "en-ar"
                "German" -> "en-gde"
                "Punjabi" -> "en-pa"
                "Chinese" -> "en-zh"
                "Russian" -> "en-ru"
                "French" -> "en-fr"
                "Japanese" -> "en-ja"
                "Korean" -> "en-ko"
                "Italian" -> "en-it"
                "Bengal" -> "en-bn"
            else ->"en-en"
        }
    }
}