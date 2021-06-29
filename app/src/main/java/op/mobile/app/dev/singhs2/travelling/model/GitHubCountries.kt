package op.mobile.app.dev.singhs2.travelling.model

/**
 * Imports to migrate library and project dependencies.
 */
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

/*
* Parcelize model class - storing values to value size to Parcelable object to send and retrieve in other activity/fragment.
*/
@Parcelize
data class GitHubCountries(
    val id: String,
    val name: String,
    val capital: String,
    val language: String,
    val flagImg: String,
    val quiz: @RawValue List<Quiz>
) : Parcelable
