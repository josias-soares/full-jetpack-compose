package br.com.unicredvisa.feature_auth.data.remote

//import okhttp3.ResponseBody
//import retrofit2.http.Header
//import retrofit2.http.POST
//import retrofit2.http.Path
//
//interface PasswordRecoveryService {
//
//	@POST("cards/v1/customers/{document}/recover-password/do")
//	suspend fun start(
//		@Path("document") document: String
//	): MaskedEmail
//
//	@POST("cards/v1/customers/{document}/recover-password/check")
//	suspend fun check(
//		@Header("Lock-Pick") lockpick: String,
//		@Path("document") document: String
//	): Tokens
//
//	@POST("cards/v1/customers/{document}/recover-password/finalize")
//	suspend fun finalize(
//		@Header("Traffic-Pass") trafficPass: String,
//		@Header("Authorization") authorization: String,
//		@Path("document") document: String
//	): ResponseBody
//
//}