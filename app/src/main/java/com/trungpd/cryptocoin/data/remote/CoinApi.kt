package com.trungpd.cryptocoin.data.remote

import com.trungpd.cryptocoin.data.remote.dto.CoinDetailDto
import com.trungpd.cryptocoin.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinApi {
    @GET("coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("coins/{id}")
    suspend fun getCoin(@Path("id") coinId: String): CoinDetailDto
}