package com.appiwedia.apps.android.algoapp.data.remote

import com.appiwedia.apps.android.algoapp.data.models.AccountTransactionsDto
import com.appiwedia.apps.android.algoapp.data.models.WalletAccount
import com.appiwedia.apps.android.algoapp.utils.Constants.HEADER_VALUE
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface AlgoRandRestService {

    @Headers(HEADER_VALUE)
    @GET("v2/accounts/{account-id}")
    suspend fun getAccountByAddress(@Path("account-id") account_id: String?): Response<WalletAccount>

    @Headers(HEADER_VALUE)
    @GET("v2/accounts/{account-id}/transactions")
    suspend fun getAccountTransactionsByAddress(@Path("account-id") account_id : String?): Response<AccountTransactionsDto>
}