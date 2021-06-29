package op.mobile.app.dev.singhs2.travelling.service

/**
 * Imports to migrate library and project dependencies.
 */
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//private const val BASE_URL = "https://gist.githubusercontent.com/"

/**
 * SeviceInstance - performing long-running operations in the background.
 */
class ServiceInstance(private val url: String) {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val retrofitService: IGitHubCountries by lazy {
        retrofit.create(IGitHubCountries::class.java)
    }
    val retrofitYandexService: Translator by lazy {
        retrofit.create(Translator::class.java)
    }
}

