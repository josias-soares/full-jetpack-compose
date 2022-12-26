package br.com.unicredvisa.feature_auth.data.remote

//import br.com.unicredvisa.feature_auth.domain.models.Refresh
//import br.com.unicredvisa.feature_auth.domain.models.Tokens
//import br.com.unicredvisa.feature_auth.domain.models.User
//import retrofit2.Response
//import retrofit2.http.Body
//import retrofit2.http.POST
//
//interface AuthApi {
//
//    @POST("cards/v1/authentication")
//    suspend fun authenticate(
//        @Body user: User
//    ): Response<Tokens>
//
//    @POST("cards/v1/authentication/refresh")
//    suspend fun refresh(
//        @Body refresh: Refresh
//    ): Response<Tokens>
//
//}