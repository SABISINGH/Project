package op.mobile.app.dev.singhs2.travelling.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Yandex(
    val key: String,
    val text: String,
    val lang: String
) : Parcelable