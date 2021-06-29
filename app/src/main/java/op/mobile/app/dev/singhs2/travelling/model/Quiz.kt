package op.mobile.app.dev.singhs2.travelling.model

/*
* Data class - storing values to value size to send and retrieve in other activity/fragment.
*/
data class Quiz(
    val question: String,
    val answers: List<String>,
    val img: String
)