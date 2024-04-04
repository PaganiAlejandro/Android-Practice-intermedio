package com.alepagani.horoscapp.data

import android.util.Log
import com.alepagani.horoscapp.data.network.HoroscopeApiService
import com.alepagani.horoscapp.data.network.response.PredictionResponse
import com.alepagani.horoscapp.domain.Repository
import com.alepagani.horoscapp.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("ALE, SE ROMPIO", it.message.toString()) }
        return null
    }
}