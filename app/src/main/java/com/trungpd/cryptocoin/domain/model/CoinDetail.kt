package com.trungpd.cryptocoin.domain.model

import com.trungpd.cryptocoin.data.remote.dto.*

data class CoinDetail(
    val coinId: String,
    val is_active: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val tags: List<String>,
    val team: List<Team>,
    val description: String
)
