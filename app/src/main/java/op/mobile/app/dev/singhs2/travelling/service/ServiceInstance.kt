package op.mobile.app.dev.singhs2.travelling.service

/**
 * Imports to migrate library and project dependencies.
 */
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Declaring private vala nd assigning website link through string.
 */
private const val BASE_URL = "https://gist.githubusercontent.com/"

/**
 * SeviceInstance - performing long-running operations in the background.
 */
object ServiceInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val retrofitService: IGitHubCountries by lazy {
        retrofit.create(IGitHubCountries::class.java)
    }
}

