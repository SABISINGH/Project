package op.mobile.app.dev.singhs2.travelling.service

import op.mobile.app.dev.singhs2.travelling.model.Yandex
import retrofit2.http.GET
import retrofit2.http.Query

/*
* Interface to load API
*/
interface Translator {
    @GET("translate?")
    suspend fun getTranslatorResponse(
        @Query("key") key: String,
        @Query("text") text: String,
        @Query("lang") lang: String
    ): Yandex

//    suspend fun getTranslatorResponse(): List<Yandex>
}