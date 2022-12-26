package br.com.unicredvisa.feature_auth.data.remote

//import br.com.unicredvisa.feature_auth.domain.models.MaskedEmail
//import br.com.unicredvisa.feature_auth.domain.models.Tokens
//import okhttp3.ResponseBody
//import retrofit2.http.Header
//import retrofit2.http.POST
//import retrofit2.http.Path
//
//interface FirstAccessService {
//
//	@POST("cards/v1/customers/{document}/first-access/do")
//	suspend fun start(
//		@Path("document") document: String
//	): MaskedEmail
//
//	@POST("cards/v1/customers/{document}/first-access/check")
//	suspend fun check(
//		@Header("Lock-Pick") lockpick: String,
//		@Path("document") document: String
//	): Tokens
//
//	@POST("cards/v1/customers/{document}/first-access/finalize")
//	suspend fun finalize(
//		@Header("Traffic-Pass") trafficPass: String,
//		@Header("Authorization") authorization: String,
//		@Path("document") document: String
//	): ResponseBody
//
//}