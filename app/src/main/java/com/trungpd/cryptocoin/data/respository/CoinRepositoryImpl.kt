package com.trungpd.cryptocoin.data.respository

import com.trungpd.cryptocoin.data.remote.CoinApi
import com.trungpd.cryptocoin.data.remote.dto.CoinDetailDto
import com.trungpd.cryptocoin.data.remote.dto.CoinDto
import com.trungpd.cryptocoin.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinApi
): CoinRepository {

    override suspend fun getCoins(): List<CoinDto> = api.getCoins()

    override suspend fun getCoinDetail(coinId: String): CoinDetailDto = api.getCoin(coinId)
}