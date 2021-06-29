package op.mobile.app.dev.singhs2.travelling.ui.maps

/**
 * Import to migrate library and project dependencies.
 */
import com.google.android.gms.maps.model.LatLng

/**
 *  Class CompanyJSONResponse - JsonResponse is an HttpResponse subclass that
 *  helps to create a JSON-encoded response. Reading the name, city and location response.
 */
data class CompanyJSONResponse(val name: String, val city: String, val location: Location) {
    data class Location(
        val latitude: Double,
        val longitude: Double
    )
}

fun CompanyJSONResponse.toCompany() = Company(
    name = name,
    city = city,
    latLng = LatLng(location.latitude, location.longitude)
)