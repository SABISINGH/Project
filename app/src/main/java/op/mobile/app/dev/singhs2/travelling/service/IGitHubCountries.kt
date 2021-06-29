package op.mobile.app.dev.singhs2.travelling.service

/**
 * Imports to migrate library and project dependencies.
 */
import op.mobile.app.dev.singhs2.travelling.model.GitHubCountries
import retrofit2.http.GET

/**
 * Interface to load API for GitHub.
 */
interface   IGitHubCountries {
    @GET("SABISINGH/7b5d12a758894e4e0da18441d5042df8/raw")
    suspend fun getResponse(): List<GitHubCountries>
}