package com.trungpd.cryptocoin.domain.use_case.get_coin

import com.trungpd.cryptocoin.common.Resource
import com.trungpd.cryptocoin.data.remote.dto.toCoin
import com.trungpd.cryptocoin.data.remote.dto.toCoinDetail
import com.trungpd.cryptocoin.domain.model.Coin
import com.trungpd.cryptocoin.domain.model.CoinDetail
import com.trungpd.cryptocoin.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading<CoinDetail>())
            val coin = repository.getCoinDetail(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "An expected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<CoinDetail>("Couldn't reach server"))
        }
    }
}