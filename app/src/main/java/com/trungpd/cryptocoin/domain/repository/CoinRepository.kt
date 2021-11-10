package com.trungpd.cryptocoin.domain.repository

import com.trungpd.cryptocoin.data.remote.dto.CoinDetailDto
import com.trungpd.cryptocoin.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinDetail(coinId: String): CoinDetailDto
}