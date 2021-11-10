package com.trungpd.cryptocoin.presentation.coin_detail

import com.trungpd.cryptocoin.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val data: CoinDetail? = null,
    val error: String = ""
)
