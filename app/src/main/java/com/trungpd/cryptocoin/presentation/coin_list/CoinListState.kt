package com.trungpd.cryptocoin.presentation.coin_list

import com.trungpd.cryptocoin.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
